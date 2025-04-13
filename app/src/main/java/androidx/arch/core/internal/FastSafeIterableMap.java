package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.arch.core.internal.SafeIterableMap;
import java.util.HashMap;
import java.util.Map;

@RestrictTo
/* loaded from: classes.dex */
public class FastSafeIterableMap<K, V> extends SafeIterableMap<K, V> {

    /* renamed from: f */
    public HashMap<K, SafeIterableMap.Entry<K, V>> f1693f = new HashMap<>();

    @Override // androidx.arch.core.internal.SafeIterableMap
    /* renamed from: a */
    public SafeIterableMap.Entry<K, V> mo1014a(K k2) {
        return this.f1693f.get(k2);
    }

    public boolean contains(K k2) {
        return this.f1693f.containsKey(k2);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    /* renamed from: e */
    public V mo1015e(@NonNull K k2, @NonNull V v) {
        SafeIterableMap.Entry<K, V> entry = this.f1693f.get(k2);
        if (entry != null) {
            return entry.f1699c;
        }
        this.f1693f.put(k2, m1019d(k2, v));
        return null;
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    /* renamed from: f */
    public V mo1016f(@NonNull K k2) {
        V v = (V) super.mo1016f(k2);
        this.f1693f.remove(k2);
        return v;
    }

    /* renamed from: g */
    public Map.Entry<K, V> m1017g(K k2) {
        if (this.f1693f.containsKey(k2)) {
            return this.f1693f.get(k2).f1701e;
        }
        return null;
    }
}
