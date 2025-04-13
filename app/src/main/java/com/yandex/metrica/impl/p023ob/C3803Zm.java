package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Zm */
/* loaded from: classes2.dex */
public class C3803Zm<K, V> {

    /* renamed from: a */
    private final HashMap<K, Collection<V>> f44706a;

    /* renamed from: b */
    private final boolean f44707b;

    public C3803Zm() {
        this(false);
    }

    @Nullable
    /* renamed from: a */
    public Collection<V> m19534a(@Nullable K k2) {
        return this.f44706a.get(k2);
    }

    /* renamed from: b */
    public boolean m19539b() {
        return this.f44706a.isEmpty();
    }

    /* renamed from: c */
    public int m19540c() {
        Iterator<Collection<V>> it = this.f44706a.values().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += it.next().size();
        }
        return i2;
    }

    public String toString() {
        return this.f44706a.toString();
    }

    public C3803Zm(boolean z) {
        this.f44706a = new HashMap<>();
        this.f44707b = z;
    }

    @Nullable
    /* renamed from: a */
    public Collection<V> m19535a(@Nullable K k2, @Nullable V v) {
        Collection<V> collection = this.f44706a.get(k2);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(v);
        return this.f44706a.put(k2, arrayList);
    }

    @Nullable
    /* renamed from: b */
    public Collection<V> m19537b(@Nullable K k2) {
        return this.f44706a.remove(k2);
    }

    @Nullable
    /* renamed from: b */
    public Collection<V> m19538b(@Nullable K k2, @Nullable V v) {
        Collection<V> collection = this.f44706a.get(k2);
        if (collection == null || !collection.remove(v)) {
            return null;
        }
        if (collection.isEmpty() && this.f44707b) {
            this.f44706a.remove(k2);
        }
        return new ArrayList(collection);
    }

    @NonNull
    /* renamed from: a */
    public Set<? extends Map.Entry<K, ? extends Collection<V>>> m19536a() {
        return this.f44706a.entrySet();
    }
}
