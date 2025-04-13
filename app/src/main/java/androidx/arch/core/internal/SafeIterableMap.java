package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p000a.C0000a;

@RestrictTo
/* loaded from: classes.dex */
public class SafeIterableMap<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b */
    public Entry<K, V> f1694b;

    /* renamed from: c */
    public Entry<K, V> f1695c;

    /* renamed from: d */
    public WeakHashMap<SupportRemove<K, V>, Boolean> f1696d = new WeakHashMap<>();

    /* renamed from: e */
    public int f1697e = 0;

    public static class AscendingIterator<K, V> extends ListIterator<K, V> {
        public AscendingIterator(Entry<K, V> entry, Entry<K, V> entry2) {
            super(entry, entry2);
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        /* renamed from: b */
        public Entry<K, V> mo1020b(Entry<K, V> entry) {
            return entry.f1701e;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        /* renamed from: c */
        public Entry<K, V> mo1021c(Entry<K, V> entry) {
            return entry.f1700d;
        }
    }

    public static class DescendingIterator<K, V> extends ListIterator<K, V> {
        public DescendingIterator(Entry<K, V> entry, Entry<K, V> entry2) {
            super(entry, entry2);
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        /* renamed from: b */
        public Entry<K, V> mo1020b(Entry<K, V> entry) {
            return entry.f1700d;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        /* renamed from: c */
        public Entry<K, V> mo1021c(Entry<K, V> entry) {
            return entry.f1701e;
        }
    }

    public static class Entry<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        @NonNull
        public final K f1698b;

        /* renamed from: c */
        @NonNull
        public final V f1699c;

        /* renamed from: d */
        public Entry<K, V> f1700d;

        /* renamed from: e */
        public Entry<K, V> f1701e;

        public Entry(@NonNull K k2, @NonNull V v) {
            this.f1698b = k2;
            this.f1699c = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.f1698b.equals(entry.f1698b) && this.f1699c.equals(entry.f1699c);
        }

        @Override // java.util.Map.Entry
        @NonNull
        public K getKey() {
            return this.f1698b;
        }

        @Override // java.util.Map.Entry
        @NonNull
        public V getValue() {
            return this.f1699c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f1698b.hashCode() ^ this.f1699c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f1698b + "=" + this.f1699c;
        }
    }

    public class IteratorWithAdditions implements Iterator<Map.Entry<K, V>>, SupportRemove<K, V> {

        /* renamed from: b */
        public Entry<K, V> f1702b;

        /* renamed from: c */
        public boolean f1703c = true;

        public IteratorWithAdditions() {
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        /* renamed from: a */
        public void mo1022a(@NonNull Entry<K, V> entry) {
            Entry<K, V> entry2 = this.f1702b;
            if (entry == entry2) {
                Entry<K, V> entry3 = entry2.f1701e;
                this.f1702b = entry3;
                this.f1703c = entry3 == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1703c) {
                return SafeIterableMap.this.f1694b != null;
            }
            Entry<K, V> entry = this.f1702b;
            return (entry == null || entry.f1700d == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f1703c) {
                this.f1703c = false;
                this.f1702b = SafeIterableMap.this.f1694b;
            } else {
                Entry<K, V> entry = this.f1702b;
                this.f1702b = entry != null ? entry.f1700d : null;
            }
            return this.f1702b;
        }
    }

    public static abstract class ListIterator<K, V> implements Iterator<Map.Entry<K, V>>, SupportRemove<K, V> {

        /* renamed from: b */
        public Entry<K, V> f1705b;

        /* renamed from: c */
        public Entry<K, V> f1706c;

        public ListIterator(Entry<K, V> entry, Entry<K, V> entry2) {
            this.f1705b = entry2;
            this.f1706c = entry;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        /* renamed from: a */
        public void mo1022a(@NonNull Entry<K, V> entry) {
            Entry<K, V> entry2 = null;
            if (this.f1705b == entry && entry == this.f1706c) {
                this.f1706c = null;
                this.f1705b = null;
            }
            Entry<K, V> entry3 = this.f1705b;
            if (entry3 == entry) {
                this.f1705b = mo1020b(entry3);
            }
            Entry<K, V> entry4 = this.f1706c;
            if (entry4 == entry) {
                Entry<K, V> entry5 = this.f1705b;
                if (entry4 != entry5 && entry5 != null) {
                    entry2 = mo1021c(entry4);
                }
                this.f1706c = entry2;
            }
        }

        /* renamed from: b */
        public abstract Entry<K, V> mo1020b(Entry<K, V> entry);

        /* renamed from: c */
        public abstract Entry<K, V> mo1021c(Entry<K, V> entry);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1706c != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            Entry<K, V> entry = this.f1706c;
            Entry<K, V> entry2 = this.f1705b;
            this.f1706c = (entry == entry2 || entry2 == null) ? null : mo1021c(entry);
            return entry;
        }
    }

    public interface SupportRemove<K, V> {
        /* renamed from: a */
        void mo1022a(@NonNull Entry<K, V> entry);
    }

    /* renamed from: a */
    public Entry<K, V> mo1014a(K k2) {
        Entry<K, V> entry = this.f1694b;
        while (entry != null && !entry.f1698b.equals(k2)) {
            entry = entry.f1700d;
        }
        return entry;
    }

    /* renamed from: b */
    public SafeIterableMap<K, V>.IteratorWithAdditions m1018b() {
        SafeIterableMap<K, V>.IteratorWithAdditions iteratorWithAdditions = new IteratorWithAdditions();
        this.f1696d.put(iteratorWithAdditions, Boolean.FALSE);
        return iteratorWithAdditions;
    }

    /* renamed from: d */
    public Entry<K, V> m1019d(@NonNull K k2, @NonNull V v) {
        Entry<K, V> entry = new Entry<>(k2, v);
        this.f1697e++;
        Entry<K, V> entry2 = this.f1695c;
        if (entry2 == null) {
            this.f1694b = entry;
            this.f1695c = entry;
            return entry;
        }
        entry2.f1700d = entry;
        entry.f1701e = entry2;
        this.f1695c = entry;
        return entry;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        DescendingIterator descendingIterator = new DescendingIterator(this.f1695c, this.f1694b);
        this.f1696d.put(descendingIterator, Boolean.FALSE);
        return descendingIterator;
    }

    /* renamed from: e */
    public V mo1015e(@NonNull K k2, @NonNull V v) {
        Entry<K, V> mo1014a = mo1014a(k2);
        if (mo1014a != null) {
            return mo1014a.f1699c;
        }
        m1019d(k2, v);
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafeIterableMap)) {
            return false;
        }
        SafeIterableMap safeIterableMap = (SafeIterableMap) obj;
        if (this.f1697e != safeIterableMap.f1697e) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = safeIterableMap.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* renamed from: f */
    public V mo1016f(@NonNull K k2) {
        Entry<K, V> mo1014a = mo1014a(k2);
        if (mo1014a == null) {
            return null;
        }
        this.f1697e--;
        if (!this.f1696d.isEmpty()) {
            Iterator<SupportRemove<K, V>> it = this.f1696d.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo1022a(mo1014a);
            }
        }
        Entry<K, V> entry = mo1014a.f1701e;
        if (entry != null) {
            entry.f1700d = mo1014a.f1700d;
        } else {
            this.f1694b = mo1014a.f1700d;
        }
        Entry<K, V> entry2 = mo1014a.f1700d;
        if (entry2 != null) {
            entry2.f1701e = entry;
        } else {
            this.f1695c = entry;
        }
        mo1014a.f1700d = null;
        mo1014a.f1701e = null;
        return mo1014a.f1699c;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += it.next().hashCode();
        }
        return i2;
    }

    @Override // java.lang.Iterable
    @NonNull
    public Iterator<Map.Entry<K, V>> iterator() {
        AscendingIterator ascendingIterator = new AscendingIterator(this.f1694b, this.f1695c);
        this.f1696d.put(ascendingIterator, Boolean.FALSE);
        return ascendingIterator;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            m24u.append(it.next().toString());
            if (it.hasNext()) {
                m24u.append(", ");
            }
        }
        m24u.append("]");
        return m24u.toString();
    }
}
