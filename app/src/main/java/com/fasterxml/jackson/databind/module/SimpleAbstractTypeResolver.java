package com.fasterxml.jackson.databind.module;

import androidx.room.util.C0576a;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import p000a.C0000a;

/* loaded from: classes.dex */
public class SimpleAbstractTypeResolver extends AbstractTypeResolver implements Serializable {
    private static final long serialVersionUID = 8635483102371490919L;
    public final HashMap<ClassKey, Class<?>> _mappings = new HashMap<>();

    public <T> SimpleAbstractTypeResolver addMapping(Class<T> cls, Class<? extends T> cls2) {
        if (cls == cls2) {
            throw new IllegalArgumentException("Cannot add mapping from class to itself");
        }
        if (cls.isAssignableFrom(cls2)) {
            if (!Modifier.isAbstract(cls.getModifiers())) {
                throw new IllegalArgumentException(C0576a.m4116o(cls, C0000a.m24u("Cannot add mapping from class "), " since it is not abstract"));
            }
            this._mappings.put(new ClassKey(cls), cls2);
            return this;
        }
        StringBuilder m24u = C0000a.m24u("Cannot add mapping from class ");
        m24u.append(cls.getName());
        m24u.append(" to ");
        m24u.append(cls2.getName());
        m24u.append(", as latter is not a subtype of former");
        throw new IllegalArgumentException(m24u.toString());
    }

    @Override // com.fasterxml.jackson.databind.AbstractTypeResolver
    public JavaType findTypeMapping(DeserializationConfig deserializationConfig, JavaType javaType) {
        Class<?> cls = this._mappings.get(new ClassKey(javaType.getRawClass()));
        if (cls == null) {
            return null;
        }
        return deserializationConfig.getTypeFactory().constructSpecializedType(javaType, cls);
    }

    @Override // com.fasterxml.jackson.databind.AbstractTypeResolver
    public JavaType resolveAbstractType(DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AbstractTypeResolver
    @Deprecated
    public JavaType resolveAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) {
        return null;
    }
}
