package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class FieldDescriptor {

    /* renamed from: a */
    public final String f22568a;

    /* renamed from: b */
    public final Map<Class<?>, Object> f22569b;

    public static final class Builder {

        /* renamed from: a */
        public final String f22570a;

        /* renamed from: b */
        public Map<Class<?>, Object> f22571b = null;

        public Builder(String str) {
            this.f22570a = str;
        }

        @NonNull
        /* renamed from: a */
        public FieldDescriptor m12363a() {
            return new FieldDescriptor(this.f22570a, this.f22571b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f22571b)), null);
        }

        @NonNull
        /* renamed from: b */
        public <T extends Annotation> Builder m12364b(@NonNull T t) {
            if (this.f22571b == null) {
                this.f22571b = new HashMap();
            }
            this.f22571b.put(t.annotationType(), t);
            return this;
        }
    }

    public FieldDescriptor(String str, Map<Class<?>, Object> map) {
        this.f22568a = str;
        this.f22569b = map;
    }

    @NonNull
    /* renamed from: a */
    public static FieldDescriptor m12362a(@NonNull String str) {
        return new FieldDescriptor(str, Collections.emptyMap());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldDescriptor)) {
            return false;
        }
        FieldDescriptor fieldDescriptor = (FieldDescriptor) obj;
        return this.f22568a.equals(fieldDescriptor.f22568a) && this.f22569b.equals(fieldDescriptor.f22569b);
    }

    public int hashCode() {
        return this.f22569b.hashCode() + (this.f22568a.hashCode() * 31);
    }

    @NonNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("FieldDescriptor{name=");
        m24u.append(this.f22568a);
        m24u.append(", properties=");
        m24u.append(this.f22569b.values());
        m24u.append("}");
        return m24u.toString();
    }

    public FieldDescriptor(String str, Map map, C20711 c20711) {
        this.f22568a = str;
        this.f22569b = map;
    }
}
