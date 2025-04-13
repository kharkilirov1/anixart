package com.bumptech.glide.load.engine.bitmap_recycle;

import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.bitmap_recycle.Poolable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class GroupedLinkedMap<K extends Poolable, V> {

    /* renamed from: a */
    public final LinkedEntry<K, V> f8330a = new LinkedEntry<>(null);

    /* renamed from: b */
    public final Map<K, LinkedEntry<K, V>> f8331b = new HashMap();

    public static class LinkedEntry<K, V> {

        /* renamed from: a */
        public final K f8332a;

        /* renamed from: b */
        public List<V> f8333b;

        /* renamed from: c */
        public LinkedEntry<K, V> f8334c;

        /* renamed from: d */
        public LinkedEntry<K, V> f8335d;

        public LinkedEntry() {
            this(null);
        }

        @Nullable
        /* renamed from: a */
        public V m5084a() {
            List<V> list = this.f8333b;
            int size = list != null ? list.size() : 0;
            if (size > 0) {
                return this.f8333b.remove(size - 1);
            }
            return null;
        }

        public LinkedEntry(K k2) {
            this.f8335d = this;
            this.f8334c = this;
            this.f8332a = k2;
        }
    }

    @Nullable
    /* renamed from: a */
    public V m5081a(K k2) {
        LinkedEntry<K, V> linkedEntry = this.f8331b.get(k2);
        if (linkedEntry == null) {
            linkedEntry = new LinkedEntry<>(k2);
            this.f8331b.put(k2, linkedEntry);
        } else {
            k2.mo5072a();
        }
        LinkedEntry<K, V> linkedEntry2 = linkedEntry.f8335d;
        linkedEntry2.f8334c = linkedEntry.f8334c;
        linkedEntry.f8334c.f8335d = linkedEntry2;
        LinkedEntry<K, V> linkedEntry3 = this.f8330a;
        linkedEntry.f8335d = linkedEntry3;
        LinkedEntry<K, V> linkedEntry4 = linkedEntry3.f8334c;
        linkedEntry.f8334c = linkedEntry4;
        linkedEntry4.f8335d = linkedEntry;
        linkedEntry.f8335d.f8334c = linkedEntry;
        return linkedEntry.m5084a();
    }

    /* renamed from: b */
    public void m5082b(K k2, V v) {
        LinkedEntry<K, V> linkedEntry = this.f8331b.get(k2);
        if (linkedEntry == null) {
            linkedEntry = new LinkedEntry<>(k2);
            LinkedEntry<K, V> linkedEntry2 = linkedEntry.f8335d;
            linkedEntry2.f8334c = linkedEntry.f8334c;
            linkedEntry.f8334c.f8335d = linkedEntry2;
            LinkedEntry<K, V> linkedEntry3 = this.f8330a;
            linkedEntry.f8335d = linkedEntry3.f8335d;
            linkedEntry.f8334c = linkedEntry3;
            linkedEntry3.f8335d = linkedEntry;
            linkedEntry.f8335d.f8334c = linkedEntry;
            this.f8331b.put(k2, linkedEntry);
        } else {
            k2.mo5072a();
        }
        if (linkedEntry.f8333b == null) {
            linkedEntry.f8333b = new ArrayList();
        }
        linkedEntry.f8333b.add(v);
    }

    @Nullable
    /* renamed from: c */
    public V m5083c() {
        for (LinkedEntry linkedEntry = this.f8330a.f8335d; !linkedEntry.equals(this.f8330a); linkedEntry = linkedEntry.f8335d) {
            V v = (V) linkedEntry.m5084a();
            if (v != null) {
                return v;
            }
            LinkedEntry<K, V> linkedEntry2 = linkedEntry.f8335d;
            linkedEntry2.f8334c = linkedEntry.f8334c;
            linkedEntry.f8334c.f8335d = linkedEntry2;
            this.f8331b.remove(linkedEntry.f8332a);
            ((Poolable) linkedEntry.f8332a).mo5072a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (LinkedEntry linkedEntry = this.f8330a.f8334c; !linkedEntry.equals(this.f8330a); linkedEntry = linkedEntry.f8334c) {
            z = true;
            sb.append('{');
            sb.append(linkedEntry.f8332a);
            sb.append(':');
            List<V> list = linkedEntry.f8333b;
            sb.append(list != null ? list.size() : 0);
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
