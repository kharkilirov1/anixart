package kotlin.reflect.jvm.internal.components;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReflectKotlinClass.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/components/ReflectClassStructure;", "", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
final class ReflectClassStructure {

    /* renamed from: a */
    public static final ReflectClassStructure f63694a = new ReflectClassStructure();

    /* renamed from: a */
    public final KotlinJvmBinaryClass.ClassLiteralId m32340a(@NotNull Class<?> cls) {
        int i2 = 0;
        while (cls.isArray()) {
            i2++;
            cls = cls.getComponentType();
            Intrinsics.m32175d(cls, "currentClass.componentType");
        }
        if (!cls.isPrimitive()) {
            ClassId m33798b = ReflectClassUtilKt.m33798b(cls);
            JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.f63882m;
            FqName m33189a = m33798b.m33189a();
            Intrinsics.m32175d(m33189a, "javaClassId.asSingleFqName()");
            ClassId m32472j = javaToKotlinClassMap.m32472j(m33189a);
            if (m32472j != null) {
                m33798b = m32472j;
            }
            return new KotlinJvmBinaryClass.ClassLiteralId(m33798b, i2);
        }
        if (Intrinsics.m32174c(cls, Void.TYPE)) {
            return new KotlinJvmBinaryClass.ClassLiteralId(ClassId.m33188i(KotlinBuiltIns.f63730l.f63774d.m33207g()), i2);
        }
        PrimitiveType primitiveType = JvmPrimitiveType.m33544a(cls.getName()).f65954b;
        Intrinsics.m32175d(primitiveType, "JvmPrimitiveType.get(cur…Class.name).primitiveType");
        if (i2 > 0) {
            FqName fqName = primitiveType.f63819e;
            if (fqName == null) {
                fqName = KotlinBuiltIns.f63725g.m33196a(primitiveType.f63817c);
                primitiveType.f63819e = fqName;
            }
            return new KotlinJvmBinaryClass.ClassLiteralId(new ClassId(fqName.m33198c(), fqName.m33199d()), i2 - 1);
        }
        FqName fqName2 = primitiveType.f63818d;
        if (fqName2 == null) {
            fqName2 = KotlinBuiltIns.f63725g.m33196a(primitiveType.f63816b);
            primitiveType.f63818d = fqName2;
        }
        return new KotlinJvmBinaryClass.ClassLiteralId(new ClassId(fqName2.m33198c(), fqName2.m33199d()), i2);
    }

    /* renamed from: b */
    public final void m32341b(@NotNull Class<?> klass, @NotNull KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor) {
        Intrinsics.m32180i(klass, "klass");
        for (Annotation annotation : klass.getDeclaredAnnotations()) {
            Intrinsics.m32175d(annotation, "annotation");
            m32342c(annotationVisitor, annotation);
        }
        annotationVisitor.mo32892a();
    }

    /* renamed from: c */
    public final void m32342c(KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor, Annotation annotation) {
        Class<?> m32147b = JvmClassMappingKt.m32147b(JvmClassMappingKt.m32146a(annotation));
        KotlinJvmBinaryClass.AnnotationArgumentVisitor mo32893b = annotationVisitor.mo32893b(ReflectClassUtilKt.m33798b(m32147b), new ReflectAnnotationSource(annotation));
        if (mo32893b != null) {
            f63694a.m32343d(mo32893b, annotation, m32147b);
        }
    }

    /* renamed from: d */
    public final void m32343d(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Annotation annotation, Class<?> cls) {
        Object invoke;
        for (Method method : cls.getDeclaredMethods()) {
            try {
                invoke = method.invoke(annotation, new Object[0]);
            } catch (IllegalAccessException unused) {
            }
            if (invoke == null) {
                Intrinsics.m32188q();
                throw null;
            }
            Name m33211d = Name.m33211d(method.getName());
            Class<?> cls2 = invoke.getClass();
            if (Intrinsics.m32174c(cls2, Class.class)) {
                annotationArgumentVisitor.mo32898d(m33211d, m32340a((Class) invoke));
            } else if (ReflectKotlinClassKt.f63700a.contains(cls2)) {
                annotationArgumentVisitor.mo32896b(m33211d, invoke);
            } else {
                List<KClass<? extends Object>> list = ReflectClassUtilKt.f66541a;
                if (Enum.class.isAssignableFrom(cls2)) {
                    if (!cls2.isEnum()) {
                        cls2 = cls2.getEnclosingClass();
                    }
                    Intrinsics.m32175d(cls2, "(if (clazz.isEnum) clazz…lse clazz.enclosingClass)");
                    annotationArgumentVisitor.mo32897c(m33211d, ReflectClassUtilKt.m33798b(cls2), Name.m33211d(((Enum) invoke).name()));
                } else if (Annotation.class.isAssignableFrom(cls2)) {
                    Class<?>[] interfaces = cls2.getInterfaces();
                    Intrinsics.m32175d(interfaces, "clazz.interfaces");
                    Class<?> annotationClass = (Class) ArraysKt.m31949Y(interfaces);
                    Intrinsics.m32175d(annotationClass, "annotationClass");
                    KotlinJvmBinaryClass.AnnotationArgumentVisitor mo32899e = annotationArgumentVisitor.mo32899e(m33211d, ReflectClassUtilKt.m33798b(annotationClass));
                    if (mo32899e != null) {
                        m32343d(mo32899e, (Annotation) invoke, annotationClass);
                    }
                } else {
                    if (!cls2.isArray()) {
                        throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls2 + "): " + invoke);
                    }
                    KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor mo32900f = annotationArgumentVisitor.mo32900f(m33211d);
                    if (mo32900f != null) {
                        Class<?> componentType = cls2.getComponentType();
                        Intrinsics.m32175d(componentType, "componentType");
                        if (componentType.isEnum()) {
                            ClassId m33798b = ReflectClassUtilKt.m33798b(componentType);
                            for (Object obj : (Object[]) invoke) {
                                if (obj == null) {
                                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Enum<*>");
                                }
                                mo32900f.mo32904c(m33798b, Name.m33211d(((Enum) obj).name()));
                            }
                        } else if (Intrinsics.m32174c(componentType, Class.class)) {
                            for (Object obj2 : (Object[]) invoke) {
                                if (obj2 == null) {
                                    throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<*>");
                                }
                                mo32900f.mo32905d(m32340a((Class) obj2));
                            }
                        } else {
                            for (Object obj3 : (Object[]) invoke) {
                                mo32900f.mo32903b(obj3);
                            }
                        }
                        mo32900f.mo32902a();
                    } else {
                        continue;
                    }
                }
            }
        }
        annotationArgumentVisitor.mo32895a();
    }
}
