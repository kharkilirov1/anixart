package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
class zzacb extends AbstractMap {

    /* renamed from: h */
    public static final /* synthetic */ int f16338h = 0;

    /* renamed from: b */
    public final int f16339b;

    /* renamed from: e */
    public boolean f16342e;

    /* renamed from: f */
    public volatile zzabz f16343f;

    /* renamed from: c */
    public List f16340c = Collections.emptyList();

    /* renamed from: d */
    public Map f16341d = Collections.emptyMap();

    /* renamed from: g */
    public Map f16344g = Collections.emptyMap();

    /* renamed from: a */
    public void mo8731a() {
        if (this.f16342e) {
            return;
        }
        this.f16341d = this.f16341d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f16341d);
        this.f16344g = this.f16344g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f16344g);
        this.f16342e = true;
    }

    /* renamed from: b */
    public final int m8733b() {
        return this.f16340c.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m8739i();
        int m8736f = m8736f(comparable);
        if (m8736f >= 0) {
            zzabv zzabvVar = (zzabv) this.f16340c.get(m8736f);
            zzabvVar.f16331d.m8739i();
            Object obj2 = zzabvVar.f16330c;
            zzabvVar.f16330c = obj;
            return obj2;
        }
        m8739i();
        if (this.f16340c.isEmpty() && !(this.f16340c instanceof ArrayList)) {
            this.f16340c = new ArrayList(this.f16339b);
        }
        int i2 = -(m8736f + 1);
        if (i2 >= this.f16339b) {
            return m8738h().put(comparable, obj);
        }
        int size = this.f16340c.size();
        int i3 = this.f16339b;
        if (size == i3) {
            zzabv zzabvVar2 = (zzabv) this.f16340c.remove(i3 - 1);
            m8738h().put(zzabvVar2.f16329b, zzabvVar2.f16330c);
        }
        this.f16340c.add(i2, new zzabv(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m8739i();
        if (!this.f16340c.isEmpty()) {
            this.f16340c.clear();
        }
        if (this.f16341d.isEmpty()) {
            return;
        }
        this.f16341d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m8736f(comparable) >= 0 || this.f16341d.containsKey(comparable);
    }

    /* renamed from: d */
    public final Map.Entry m8735d(int i2) {
        return (Map.Entry) this.f16340c.get(i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f16343f == null) {
            this.f16343f = new zzabz(this);
        }
        return this.f16343f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzacb)) {
            return super.equals(obj);
        }
        zzacb zzacbVar = (zzacb) obj;
        int size = size();
        if (size != zzacbVar.size()) {
            return false;
        }
        int m8733b = m8733b();
        if (m8733b != zzacbVar.m8733b()) {
            return entrySet().equals(zzacbVar.entrySet());
        }
        for (int i2 = 0; i2 < m8733b; i2++) {
            if (!m8735d(i2).equals(zzacbVar.m8735d(i2))) {
                return false;
            }
        }
        if (m8733b != size) {
            return this.f16341d.equals(zzacbVar.f16341d);
        }
        return true;
    }

    /* renamed from: f */
    public final int m8736f(Comparable comparable) {
        int size = this.f16340c.size() - 1;
        int i2 = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((zzabv) this.f16340c.get(size)).f16329b);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int compareTo2 = comparable.compareTo(((zzabv) this.f16340c.get(i3)).f16329b);
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
    public final Object m8737g(int i2) {
        m8739i();
        Object obj = ((zzabv) this.f16340c.remove(i2)).f16330c;
        if (!this.f16341d.isEmpty()) {
            Iterator it = m8738h().entrySet().iterator();
            List list = this.f16340c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new zzabv(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m8736f = m8736f(comparable);
        return m8736f >= 0 ? ((zzabv) this.f16340c.get(m8736f)).f16330c : this.f16341d.get(comparable);
    }

    /* renamed from: h */
    public final SortedMap m8738h() {
        m8739i();
        if (this.f16341d.isEmpty() && !(this.f16341d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f16341d = treeMap;
            this.f16344g = treeMap.descendingMap();
        }
        return (SortedMap) this.f16341d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int m8733b = m8733b();
        int i2 = 0;
        for (int i3 = 0; i3 < m8733b; i3++) {
            i2 += ((zzabv) this.f16340c.get(i3)).hashCode();
        }
        return this.f16341d.size() > 0 ? this.f16341d.hashCode() + i2 : i2;
    }

    /* renamed from: i */
    public final void m8739i() {
        if (this.f16342e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m8739i();
        Comparable comparable = (Comparable) obj;
        int m8736f = m8736f(comparable);
        if (m8736f >= 0) {
            return m8737g(m8736f);
        }
        if (this.f16341d.isEmpty()) {
            return null;
        }
        return this.f16341d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f16341d.size() + this.f16340c.size();
    }
}
