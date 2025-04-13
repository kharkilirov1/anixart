package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class InjectableValues {

    public static class Std extends InjectableValues implements Serializable {
        private static final long serialVersionUID = 1;
        public final Map<String, Object> _values;

        public Std() {
            this(new HashMap());
        }

        public Std addValue(String str, Object obj) {
            this._values.put(str, obj);
            return this;
        }

        @Override // com.fasterxml.jackson.databind.InjectableValues
        public Object findInjectableValue(Object obj, DeserializationContext deserializationContext, BeanProperty beanProperty, Object obj2) throws JsonMappingException {
            if (!(obj instanceof String)) {
                deserializationContext.reportBadDefinition(ClassUtil.classOf(obj), String.format("Unrecognized inject value id type (%s), expecting String", ClassUtil.classNameOf(obj)));
            }
            String str = (String) obj;
            Object obj3 = this._values.get(str);
            if (obj3 != null || this._values.containsKey(str)) {
                return obj3;
            }
            StringBuilder m28y = C0000a.m28y("No injectable id with value '", str, "' found (for property '");
            m28y.append(beanProperty.getName());
            m28y.append("')");
            throw new IllegalArgumentException(m28y.toString());
        }

        public Std(Map<String, Object> map) {
            this._values = map;
        }

        public Std addValue(Class<?> cls, Object obj) {
            this._values.put(cls.getName(), obj);
            return this;
        }
    }

    public abstract Object findInjectableValue(Object obj, DeserializationContext deserializationContext, BeanProperty beanProperty, Object obj2) throws JsonMappingException;
}
