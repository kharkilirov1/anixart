package io.grpc;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.concurrent.Immutable;

@ExperimentalApi
@Immutable
/* loaded from: classes3.dex */
public final class Attributes {

    /* renamed from: b */
    public static final Attributes f58053b = new Attributes(Collections.emptyMap());

    /* renamed from: a */
    public final Map<Key<?>, Object> f58054a;

    public static final class Builder {

        /* renamed from: a */
        public Attributes f58055a;

        /* renamed from: b */
        public Map<Key<?>, Object> f58056b;

        public Builder(Attributes attributes, C62891 c62891) {
            this.f58055a = attributes;
        }

        /* renamed from: a */
        public Attributes m30801a() {
            if (this.f58056b != null) {
                for (Map.Entry<Key<?>, Object> entry : this.f58055a.f58054a.entrySet()) {
                    if (!this.f58056b.containsKey(entry.getKey())) {
                        this.f58056b.put(entry.getKey(), entry.getValue());
                    }
                }
                this.f58055a = new Attributes(this.f58056b, null);
                this.f58056b = null;
            }
            return this.f58055a;
        }

        /* renamed from: b */
        public <T> Builder m30802b(Key<T> key, T t) {
            if (this.f58056b == null) {
                this.f58056b = new IdentityHashMap(1);
            }
            this.f58056b.put(key, t);
            return this;
        }
    }

    @Immutable
    public static final class Key<T> {

        /* renamed from: a */
        public final String f58057a;

        public Key(String str) {
            this.f58057a = str;
        }

        public String toString() {
            return this.f58057a;
        }
    }

    public Attributes(Map<Key<?>, Object> map) {
        this.f58054a = map;
    }

    /* renamed from: a */
    public static Builder m30799a() {
        return new Builder(f58053b, null);
    }

    /* renamed from: b */
    public Builder m30800b() {
        return new Builder(this, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Attributes.class != obj.getClass()) {
            return false;
        }
        Attributes attributes = (Attributes) obj;
        if (this.f58054a.size() != attributes.f58054a.size()) {
            return false;
        }
        for (Map.Entry<Key<?>, Object> entry : this.f58054a.entrySet()) {
            if (!attributes.f58054a.containsKey(entry.getKey()) || !Objects.m11173a(entry.getValue(), attributes.f58054a.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = 0;
        for (Map.Entry<Key<?>, Object> entry : this.f58054a.entrySet()) {
            i2 += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return i2;
    }

    public String toString() {
        return this.f58054a.toString();
    }

    public Attributes(Map map, C62891 c62891) {
        this.f58054a = map;
    }
}
