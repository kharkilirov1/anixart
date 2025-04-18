package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;

/* loaded from: classes.dex */
public final class CreatorCandidate {
    public final AnnotatedWithParams _creator;
    public final AnnotationIntrospector _intr;
    public final int _paramCount;
    public final Param[] _params;

    public static final class Param {
        public final AnnotatedParameter annotated;
        public final JacksonInject.Value injection;
        public final BeanPropertyDefinition propDef;

        public Param(AnnotatedParameter annotatedParameter, BeanPropertyDefinition beanPropertyDefinition, JacksonInject.Value value) {
            this.annotated = annotatedParameter;
            this.propDef = beanPropertyDefinition;
            this.injection = value;
        }

        public PropertyName fullName() {
            BeanPropertyDefinition beanPropertyDefinition = this.propDef;
            if (beanPropertyDefinition == null) {
                return null;
            }
            return beanPropertyDefinition.getFullName();
        }

        public boolean hasFullName() {
            BeanPropertyDefinition beanPropertyDefinition = this.propDef;
            if (beanPropertyDefinition == null) {
                return false;
            }
            return beanPropertyDefinition.getFullName().hasSimpleName();
        }
    }

    public CreatorCandidate(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, Param[] paramArr, int i2) {
        this._intr = annotationIntrospector;
        this._creator = annotatedWithParams;
        this._params = paramArr;
        this._paramCount = i2;
    }

    public static CreatorCandidate construct(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, BeanPropertyDefinition[] beanPropertyDefinitionArr) {
        int parameterCount = annotatedWithParams.getParameterCount();
        Param[] paramArr = new Param[parameterCount];
        for (int i2 = 0; i2 < parameterCount; i2++) {
            AnnotatedParameter parameter = annotatedWithParams.getParameter(i2);
            paramArr[i2] = new Param(parameter, beanPropertyDefinitionArr == null ? null : beanPropertyDefinitionArr[i2], annotationIntrospector.findInjectableValue(parameter));
        }
        return new CreatorCandidate(annotationIntrospector, annotatedWithParams, paramArr, parameterCount);
    }

    public AnnotatedWithParams creator() {
        return this._creator;
    }

    public PropertyName explicitParamName(int i2) {
        BeanPropertyDefinition beanPropertyDefinition = this._params[i2].propDef;
        if (beanPropertyDefinition == null || !beanPropertyDefinition.isExplicitlyNamed()) {
            return null;
        }
        return beanPropertyDefinition.getFullName();
    }

    public PropertyName findImplicitParamName(int i2) {
        String findImplicitPropertyName = this._intr.findImplicitPropertyName(this._params[i2].annotated);
        if (findImplicitPropertyName == null || findImplicitPropertyName.isEmpty()) {
            return null;
        }
        return PropertyName.construct(findImplicitPropertyName);
    }

    public int findOnlyParamWithoutInjection() {
        int i2 = -1;
        for (int i3 = 0; i3 < this._paramCount; i3++) {
            if (this._params[i3].injection == null) {
                if (i2 >= 0) {
                    return -1;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    public JacksonInject.Value injection(int i2) {
        return this._params[i2].injection;
    }

    public int paramCount() {
        return this._paramCount;
    }

    public PropertyName paramName(int i2) {
        BeanPropertyDefinition beanPropertyDefinition = this._params[i2].propDef;
        if (beanPropertyDefinition != null) {
            return beanPropertyDefinition.getFullName();
        }
        return null;
    }

    public AnnotatedParameter parameter(int i2) {
        return this._params[i2].annotated;
    }

    public BeanPropertyDefinition propertyDef(int i2) {
        return this._params[i2].propDef;
    }

    public String toString() {
        return this._creator.toString();
    }
}
