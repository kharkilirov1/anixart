package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Fm */
/* loaded from: classes2.dex */
public class C3304Fm<K, V> {

    /* renamed from: a */
    @NonNull
    private final Map<K, V> f42927a;

    /* renamed from: b */
    @NonNull
    private final V f42928b;

    public C3304Fm(@NonNull V v) {
        this(new HashMap(), v);
    }

    /* renamed from: a */
    public void m18115a(@Nullable K k2, @Nullable V v) {
        this.f42927a.put(k2, v);
    }

    @VisibleForTesting
    public C3304Fm(@NonNull Map<K, V> map, @NonNull V v) {
        this.f42927a = map;
        this.f42928b = v;
    }

    @NonNull
    /* renamed from: a */
    public V m18113a(@Nullable K k2) {
        V v = this.f42927a.get(k2);
        return v == null ? this.f42928b : v;
    }

    @NonNull
    /* renamed from: a */
    public Set<K> m18114a() {
        return this.f42927a.keySet();
    }
}
