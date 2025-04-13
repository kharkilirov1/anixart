package kotlin.reflect.jvm.internal.pcollections;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class MapEntry<K, V> implements Serializable {

    /* renamed from: b */
    public final K f66536b;

    /* renamed from: c */
    public final V f66537c;

    public MapEntry(K k2, V v) {
        this.f66536b = k2;
        this.f66537c = v;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MapEntry)) {
            return false;
        }
        MapEntry mapEntry = (MapEntry) obj;
        K k2 = this.f66536b;
        if (k2 == null) {
            if (mapEntry.f66536b != null) {
                return false;
            }
        } else if (!k2.equals(mapEntry.f66536b)) {
            return false;
        }
        V v = this.f66537c;
        V v2 = mapEntry.f66537c;
        if (v == null) {
            if (v2 != null) {
                return false;
            }
        } else if (!v.equals(v2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        K k2 = this.f66536b;
        int hashCode = k2 == null ? 0 : k2.hashCode();
        V v = this.f66537c;
        return hashCode ^ (v != null ? v.hashCode() : 0);
    }

    public String toString() {
        return this.f66536b + "=" + this.f66537c;
    }
}
