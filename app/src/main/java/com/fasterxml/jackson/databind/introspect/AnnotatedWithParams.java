package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public abstract class AnnotatedWithParams extends AnnotatedMember {
    private static final long serialVersionUID = 1;
    public final AnnotationMap[] _paramAnnotations;

    public AnnotatedWithParams(TypeResolutionContext typeResolutionContext, AnnotationMap annotationMap, AnnotationMap[] annotationMapArr) {
        super(typeResolutionContext, annotationMap);
        this._paramAnnotations = annotationMapArr;
    }

    public final void addOrOverrideParam(int i2, Annotation annotation) {
        AnnotationMap annotationMap = this._paramAnnotations[i2];
        if (annotationMap == null) {
            annotationMap = new AnnotationMap();
            this._paramAnnotations[i2] = annotationMap;
        }
        annotationMap.add(annotation);
    }

    public abstract Object call() throws Exception;

    public abstract Object call(Object[] objArr) throws Exception;

    public abstract Object call1(Object obj) throws Exception;

    public final int getAnnotationCount() {
        return this._annotations.size();
    }

    @Deprecated
    public abstract Type getGenericParameterType(int i2);

    public final AnnotatedParameter getParameter(int i2) {
        return new AnnotatedParameter(this, getParameterType(i2), this._typeContext, getParameterAnnotations(i2), i2);
    }

    public final AnnotationMap getParameterAnnotations(int i2) {
        AnnotationMap[] annotationMapArr = this._paramAnnotations;
        if (annotationMapArr == null || i2 < 0 || i2 >= annotationMapArr.length) {
            return null;
        }
        return annotationMapArr[i2];
    }

    public abstract int getParameterCount();

    public abstract JavaType getParameterType(int i2);

    public abstract Class<?> getRawParameterType(int i2);

    public AnnotatedParameter replaceParameterAnnotations(int i2, AnnotationMap annotationMap) {
        this._paramAnnotations[i2] = annotationMap;
        return getParameter(i2);
    }

    public AnnotatedWithParams(AnnotatedWithParams annotatedWithParams, AnnotationMap[] annotationMapArr) {
        super(annotatedWithParams);
        this._paramAnnotations = annotationMapArr;
    }
}
