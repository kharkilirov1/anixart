package com.google.android.exoplayer2.util;

import androidx.annotation.GuardedBy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class CopyOnWriteMultiset<E> implements Iterable<E> {

    /* renamed from: b */
    public final Object f14624b = new Object();

    /* renamed from: c */
    @GuardedBy
    public final Map<E, Integer> f14625c = new HashMap();

    /* renamed from: d */
    @GuardedBy
    public Set<E> f14626d = Collections.emptySet();

    /* renamed from: e */
    @GuardedBy
    public List<E> f14627e = Collections.emptyList();

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f14624b) {
            it = this.f14627e.iterator();
        }
        return it;
    }

    /* renamed from: s0 */
    public int m7539s0(E e2) {
        int intValue;
        synchronized (this.f14624b) {
            intValue = this.f14625c.containsKey(e2) ? this.f14625c.get(e2).intValue() : 0;
        }
        return intValue;
    }
}
