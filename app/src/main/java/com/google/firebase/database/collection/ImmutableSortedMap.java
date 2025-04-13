package com.google.firebase.database.collection;

import com.google.android.exoplayer2.trackselection.C1136a;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class ImmutableSortedMap<K, V> implements Iterable<Map.Entry<K, V>> {

    public static class Builder {

        /* renamed from: a */
        public static final KeyTranslator f22541a = C1136a.f14046m;

        public interface KeyTranslator<C, D> {
            /* renamed from: f */
            D mo7341f(C c2);
        }
    }

    /* renamed from: b */
    public abstract Comparator<K> mo12352b();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImmutableSortedMap)) {
            return false;
        }
        ImmutableSortedMap immutableSortedMap = (ImmutableSortedMap) obj;
        if (!mo12352b().equals(immutableSortedMap.mo12352b()) || size() != immutableSortedMap.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = immutableSortedMap.iterator();
        while (it.hasNext()) {
            if (!it.next().equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode = mo12352b().hashCode();
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            hashCode = (hashCode * 31) + it.next().hashCode();
        }
        return hashCode;
    }

    @Override // java.lang.Iterable
    public abstract Iterator<Map.Entry<K, V>> iterator();

    public abstract int size();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        Iterator<Map.Entry<K, V>> it = iterator();
        boolean z = true;
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(next.getKey());
            sb.append("=>");
            sb.append(next.getValue());
            sb.append(")");
        }
        sb.append("};");
        return sb.toString();
    }
}
