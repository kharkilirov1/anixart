package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class AnnotatedMethodCollector extends CollectorBase {
    private final ClassIntrospector.MixInResolver _mixInResolver;

    public static final class MethodBuilder {
        public AnnotationCollector annotations;
        public Method method;
        public TypeResolutionContext typeContext;

        public MethodBuilder(TypeResolutionContext typeResolutionContext, Method method, AnnotationCollector annotationCollector) {
            this.typeContext = typeResolutionContext;
            this.method = method;
            this.annotations = annotationCollector;
        }

        public AnnotatedMethod build() {
            Method method = this.method;
            if (method == null) {
                return null;
            }
            return new AnnotatedMethod(this.typeContext, method, this.annotations.asAnnotationMap(), null);
        }
    }

    public AnnotatedMethodCollector(AnnotationIntrospector annotationIntrospector, ClassIntrospector.MixInResolver mixInResolver) {
        super(annotationIntrospector);
        this._mixInResolver = annotationIntrospector == null ? null : mixInResolver;
    }

    private void _addMemberMethods(TypeResolutionContext typeResolutionContext, Class<?> cls, Map<MemberKey, MethodBuilder> map, Class<?> cls2) {
        if (cls2 != null) {
            _addMethodMixIns(typeResolutionContext, cls, map, cls2);
        }
        if (cls == null) {
            return;
        }
        for (Method method : ClassUtil.getClassMethods(cls)) {
            if (_isIncludableMemberMethod(method)) {
                MemberKey memberKey = new MemberKey(method);
                MethodBuilder methodBuilder = map.get(memberKey);
                if (methodBuilder == null) {
                    map.put(memberKey, new MethodBuilder(typeResolutionContext, method, this._intr == null ? AnnotationCollector.emptyCollector() : collectAnnotations(method.getDeclaredAnnotations())));
                } else {
                    if (this._intr != null) {
                        methodBuilder.annotations = collectDefaultAnnotations(methodBuilder.annotations, method.getDeclaredAnnotations());
                    }
                    Method method2 = methodBuilder.method;
                    if (method2 == null) {
                        methodBuilder.method = method;
                    } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                        methodBuilder.method = method;
                        methodBuilder.typeContext = typeResolutionContext;
                    }
                }
            }
        }
    }

    private boolean _isIncludableMemberMethod(Method method) {
        return (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterTypes().length > 2) ? false : true;
    }

    public static AnnotatedMethodMap collectMethods(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext, ClassIntrospector.MixInResolver mixInResolver, TypeFactory typeFactory, JavaType javaType, List<JavaType> list, Class<?> cls) {
        return new AnnotatedMethodCollector(annotationIntrospector, mixInResolver).collect(typeFactory, typeResolutionContext, javaType, list, cls);
    }

    public void _addMethodMixIns(TypeResolutionContext typeResolutionContext, Class<?> cls, Map<MemberKey, MethodBuilder> map, Class<?> cls2) {
        if (this._intr == null) {
            return;
        }
        Iterator<Class<?>> it = ClassUtil.findRawSuperTypes(cls2, cls, true).iterator();
        while (it.hasNext()) {
            for (Method method : ClassUtil.getDeclaredMethods(it.next())) {
                if (_isIncludableMemberMethod(method)) {
                    MemberKey memberKey = new MemberKey(method);
                    MethodBuilder methodBuilder = map.get(memberKey);
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    if (methodBuilder == null) {
                        map.put(memberKey, new MethodBuilder(typeResolutionContext, null, collectAnnotations(declaredAnnotations)));
                    } else {
                        methodBuilder.annotations = collectDefaultAnnotations(methodBuilder.annotations, declaredAnnotations);
                    }
                }
            }
        }
    }

    public AnnotatedMethodMap collect(TypeFactory typeFactory, TypeResolutionContext typeResolutionContext, JavaType javaType, List<JavaType> list, Class<?> cls) {
        boolean z;
        Class<?> findMixInClassFor;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        _addMemberMethods(typeResolutionContext, javaType.getRawClass(), linkedHashMap, cls);
        for (JavaType javaType2 : list) {
            ClassIntrospector.MixInResolver mixInResolver = this._mixInResolver;
            _addMemberMethods(new TypeResolutionContext.Basic(typeFactory, javaType2.getBindings()), javaType2.getRawClass(), linkedHashMap, mixInResolver == null ? null : mixInResolver.findMixInClassFor(javaType2.getRawClass()));
        }
        ClassIntrospector.MixInResolver mixInResolver2 = this._mixInResolver;
        if (mixInResolver2 == null || (findMixInClassFor = mixInResolver2.findMixInClassFor(Object.class)) == null) {
            z = false;
        } else {
            _addMethodMixIns(typeResolutionContext, javaType.getRawClass(), linkedHashMap, findMixInClassFor);
            z = true;
        }
        if (z && this._intr != null && !linkedHashMap.isEmpty()) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                MemberKey memberKey = (MemberKey) entry.getKey();
                if ("hashCode".equals(memberKey.getName()) && memberKey.argCount() == 0) {
                    try {
                        Method declaredMethod = Object.class.getDeclaredMethod(memberKey.getName(), new Class[0]);
                        if (declaredMethod != null) {
                            MethodBuilder methodBuilder = (MethodBuilder) entry.getValue();
                            methodBuilder.annotations = collectDefaultAnnotations(methodBuilder.annotations, declaredMethod.getDeclaredAnnotations());
                            methodBuilder.method = declaredMethod;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return new AnnotatedMethodMap();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            AnnotatedMethod build = ((MethodBuilder) entry2.getValue()).build();
            if (build != null) {
                linkedHashMap2.put(entry2.getKey(), build);
            }
        }
        return new AnnotatedMethodMap(linkedHashMap2);
    }
}
