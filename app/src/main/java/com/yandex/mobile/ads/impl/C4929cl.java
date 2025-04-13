package com.yandex.mobile.ads.impl;

import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.yandex.mobile.ads.impl.cl */
/* loaded from: classes3.dex */
public final class C4929cl<E> implements Iterable<E> {

    /* renamed from: a */
    private final Object f49295a = new Object();

    /* renamed from: b */
    @GuardedBy
    private final HashMap f49296b = new HashMap();

    /* renamed from: c */
    @GuardedBy
    private Set<E> f49297c = Collections.emptySet();

    /* renamed from: d */
    @GuardedBy
    private List<E> f49298d = Collections.emptyList();

    /* renamed from: a */
    public final void m23307a(E e2) {
        synchronized (this.f49295a) {
            ArrayList arrayList = new ArrayList(this.f49298d);
            arrayList.add(e2);
            this.f49298d = Collections.unmodifiableList(arrayList);
            Integer num = (Integer) this.f49296b.get(e2);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f49297c);
                hashSet.add(e2);
                this.f49297c = Collections.unmodifiableSet(hashSet);
            }
            this.f49296b.put(e2, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    /* renamed from: b */
    public final int m23308b(E e2) {
        int intValue;
        synchronized (this.f49295a) {
            intValue = this.f49296b.containsKey(e2) ? ((Integer) this.f49296b.get(e2)).intValue() : 0;
        }
        return intValue;
    }

    /* renamed from: c */
    public final void m23309c(E e2) {
        synchronized (this.f49295a) {
            Integer num = (Integer) this.f49296b.get(e2);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f49298d);
            arrayList.remove(e2);
            this.f49298d = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f49296b.remove(e2);
                HashSet hashSet = new HashSet(this.f49297c);
                hashSet.remove(e2);
                this.f49297c = Collections.unmodifiableSet(hashSet);
            } else {
                this.f49296b.put(e2, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f49295a) {
            it = this.f49298d.iterator();
        }
        return it;
    }

    /* renamed from: a */
    public final Set<E> m23306a() {
        Set<E> set;
        synchronized (this.f49295a) {
            set = this.f49297c;
        }
        return set;
    }
}
