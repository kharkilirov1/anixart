package com.yandex.mobile.ads.embedded.guava.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.yandex.mobile.ads.embedded.guava.collect.C4693m0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.k */
/* loaded from: classes2.dex */
public abstract class AbstractC4688k<K, V> extends AbstractC4690l implements Map<K, V> {
    /* renamed from: a */
    public final boolean m22033a(@CheckForNull Object obj) {
        return C4708x.m22080a(this, obj);
    }

    /* renamed from: b */
    public abstract Map<K, V> mo22034b();

    /* renamed from: b */
    public final boolean m22035b(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((C4693m0.a) entrySet()).equals(((Map) obj).entrySet());
    }

    /* renamed from: c */
    public final int m22036c() {
        return C4693m0.m22039a(entrySet());
    }

    @Override // java.util.Map
    public final void clear() {
        mo22034b().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        return mo22034b().containsKey(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return mo22034b().entrySet();
    }

    @Override // java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        return mo22034b().get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return mo22034b().isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return mo22034b().keySet();
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public final V put(K k2, V v) {
        return mo22034b().put(k2, v);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        mo22034b().putAll(map);
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public final V remove(@CheckForNull Object obj) {
        return mo22034b().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return mo22034b().size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return mo22034b().values();
    }
}
