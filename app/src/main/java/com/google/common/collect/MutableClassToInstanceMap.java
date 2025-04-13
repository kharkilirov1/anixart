package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.primitives.Primitives;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@GwtIncompatible
/* loaded from: classes.dex */
public final class MutableClassToInstanceMap<B> extends ForwardingMap<Class<? extends B>, B> implements ClassToInstanceMap<B>, Serializable {

    public static final class SerializedForm<B> implements Serializable {
    }

    @CanIgnoreReturnValue
    /* renamed from: J */
    public static <B, T extends B> T m11824J(Class<T> cls, B b) {
        Map<Class<?>, Class<?>> map = Primitives.f21959a;
        Objects.requireNonNull(cls);
        Class<T> cls2 = (Class) Primitives.f21959a.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.cast(b);
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    /* renamed from: G */
    public /* bridge */ /* synthetic */ Object mo11329H() {
        return null;
    }

    @Override // com.google.common.collect.ForwardingMap
    /* renamed from: H */
    public Map<Class<? extends B>, B> mo7455G() {
        return null;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set<Map.Entry<Class<? extends B>, B>> entrySet() {
        return new ForwardingSet<Map.Entry<Class<? extends B>, B>>() { // from class: com.google.common.collect.MutableClassToInstanceMap.2

            /* renamed from: com.google.common.collect.MutableClassToInstanceMap$2$1, reason: invalid class name */
            public class AnonymousClass1 extends TransformedIterator<Map.Entry<Class<? extends B>, B>, Map.Entry<Class<? extends B>, B>> {
                @Override // com.google.common.collect.TransformedIterator
                /* renamed from: a */
                public Object mo11415a(Object obj) {
                    final Map.Entry entry = (Map.Entry) obj;
                    return new ForwardingMapEntry<Class<Object>, Object>() { // from class: com.google.common.collect.MutableClassToInstanceMap.1
                        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                        /* renamed from: G */
                        public Object mo11329H() {
                            return entry;
                        }

                        @Override // com.google.common.collect.ForwardingMapEntry
                        /* renamed from: H */
                        public Map.Entry<Class<Object>, Object> mo7455G() {
                            return entry;
                        }

                        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                        public Object setValue(Object obj2) {
                            return super.setValue(MutableClassToInstanceMap.m11824J(getKey(), obj2));
                        }
                    };
                }
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            /* renamed from: G */
            public /* bridge */ /* synthetic */ Object mo11329H() {
                mo11329H();
                throw null;
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
            /* renamed from: H */
            public /* bridge */ /* synthetic */ Collection mo11329H() {
                mo11329H();
                throw null;
            }

            @Override // com.google.common.collect.ForwardingSet
            /* renamed from: K */
            public Set<Map.Entry<Class<? extends B>, B>> mo11329H() {
                Objects.requireNonNull(MutableClassToInstanceMap.this);
                throw null;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<Class<? extends B>, B>> iterator() {
                mo11329H();
                throw null;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
                return m11559I();
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                return (T[]) ObjectArrays.m11830d(this, tArr);
            }
        };
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    @CanIgnoreReturnValue
    public Object put(Object obj, Object obj2) {
        m11824J((Class) obj, obj2);
        throw null;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public void putAll(Map<? extends Class<? extends B>, ? extends B> map) {
        for (Map.Entry entry : new LinkedHashMap(map).entrySet()) {
            m11824J((Class) entry.getKey(), entry.getValue());
        }
        throw null;
    }
}
