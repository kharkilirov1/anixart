package com.google.android.gms.internal.auth;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
class zzgl<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: h */
    public static final /* synthetic */ int f16163h = 0;

    /* renamed from: b */
    public final int f16164b;

    /* renamed from: e */
    public boolean f16167e;

    /* renamed from: f */
    public volatile zzgk f16168f;

    /* renamed from: c */
    public List<zzgi> f16165c = Collections.emptyList();

    /* renamed from: d */
    public Map<K, V> f16166d = Collections.emptyMap();

    /* renamed from: g */
    public Map<K, V> f16169g = Collections.emptyMap();

    /* renamed from: a */
    public void mo8474a() {
        if (this.f16167e) {
            return;
        }
        this.f16166d = this.f16166d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f16166d);
        this.f16169g = this.f16169g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f16169g);
        this.f16167e = true;
    }

    /* renamed from: b */
    public final int m8476b() {
        return this.f16165c.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final V put(K k2, V v) {
        m8482i();
        int m8479f = m8479f(k2);
        if (m8479f >= 0) {
            zzgi zzgiVar = this.f16165c.get(m8479f);
            zzgiVar.f16157d.m8482i();
            V v2 = (V) zzgiVar.f16156c;
            zzgiVar.f16156c = v;
            return v2;
        }
        m8482i();
        if (this.f16165c.isEmpty() && !(this.f16165c instanceof ArrayList)) {
            this.f16165c = new ArrayList(this.f16164b);
        }
        int i2 = -(m8479f + 1);
        if (i2 >= this.f16164b) {
            return m8481h().put(k2, v);
        }
        int size = this.f16165c.size();
        int i3 = this.f16164b;
        if (size == i3) {
            zzgi remove = this.f16165c.remove(i3 - 1);
            m8481h().put(remove.f16155b, remove.f16156c);
        }
        this.f16165c.add(i2, new zzgi(this, k2, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m8482i();
        if (!this.f16165c.isEmpty()) {
            this.f16165c.clear();
        }
        if (this.f16166d.isEmpty()) {
            return;
        }
        this.f16166d.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m8479f(comparable) >= 0 || this.f16166d.containsKey(comparable);
    }

    /* renamed from: d */
    public final Map.Entry<K, V> m8478d(int i2) {
        return this.f16165c.get(i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f16168f == null) {
            this.f16168f = new zzgk(this);
        }
        return this.f16168f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgl)) {
            return super.equals(obj);
        }
        zzgl zzglVar = (zzgl) obj;
        int size = size();
        if (size != zzglVar.size()) {
            return false;
        }
        int m8476b = m8476b();
        if (m8476b != zzglVar.m8476b()) {
            return entrySet().equals(zzglVar.entrySet());
        }
        for (int i2 = 0; i2 < m8476b; i2++) {
            if (!m8478d(i2).equals(zzglVar.m8478d(i2))) {
                return false;
            }
        }
        if (m8476b != size) {
            return this.f16166d.equals(zzglVar.f16166d);
        }
        return true;
    }

    /* renamed from: f */
    public final int m8479f(K k2) {
        int size = this.f16165c.size() - 1;
        int i2 = 0;
        if (size >= 0) {
            int compareTo = k2.compareTo(this.f16165c.get(size).f16155b);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int compareTo2 = k2.compareTo(this.f16165c.get(i3).f16155b);
            if (compareTo2 < 0) {
                size = i3 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: g */
    public final V m8480g(int i2) {
        m8482i();
        V v = (V) this.f16165c.remove(i2).f16156c;
        if (!this.f16166d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m8481h().entrySet().iterator();
            List<zzgi> list = this.f16165c;
            Map.Entry<K, V> next = it.next();
            list.add(new zzgi(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m8479f = m8479f(comparable);
        return m8479f >= 0 ? (V) this.f16165c.get(m8479f).f16156c : this.f16166d.get(comparable);
    }

    /* renamed from: h */
    public final SortedMap<K, V> m8481h() {
        m8482i();
        if (this.f16166d.isEmpty() && !(this.f16166d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f16166d = treeMap;
            this.f16169g = treeMap.descendingMap();
        }
        return (SortedMap) this.f16166d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int m8476b = m8476b();
        int i2 = 0;
        for (int i3 = 0; i3 < m8476b; i3++) {
            i2 += this.f16165c.get(i3).hashCode();
        }
        return this.f16166d.size() > 0 ? this.f16166d.hashCode() + i2 : i2;
    }

    /* renamed from: i */
    public final void m8482i() {
        if (this.f16167e) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m8482i();
        Comparable comparable = (Comparable) obj;
        int m8479f = m8479f(comparable);
        if (m8479f >= 0) {
            return (V) m8480g(m8479f);
        }
        if (this.f16166d.isEmpty()) {
            return null;
        }
        return this.f16166d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f16166d.size() + this.f16165c.size();
    }
}
