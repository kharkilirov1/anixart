package io.reactivex.internal.queue;

import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.Pow2;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
public final class SpscLinkedArrayQueue<T> implements SimplePlainQueue<T> {

    /* renamed from: j */
    public static final int f62594j = Integer.getInteger("jctools.spsc.max.lookahead.step", RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT).intValue();

    /* renamed from: k */
    public static final Object f62595k = new Object();

    /* renamed from: b */
    public final AtomicLong f62596b;

    /* renamed from: c */
    public int f62597c;

    /* renamed from: d */
    public long f62598d;

    /* renamed from: e */
    public final int f62599e;

    /* renamed from: f */
    public AtomicReferenceArray<Object> f62600f;

    /* renamed from: g */
    public final int f62601g;

    /* renamed from: h */
    public AtomicReferenceArray<Object> f62602h;

    /* renamed from: i */
    public final AtomicLong f62603i;

    public SpscLinkedArrayQueue(int i2) {
        AtomicLong atomicLong = new AtomicLong();
        this.f62596b = atomicLong;
        this.f62603i = new AtomicLong();
        int m31840a = Pow2.m31840a(Math.max(8, i2));
        int i3 = m31840a - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(m31840a + 1);
        this.f62600f = atomicReferenceArray;
        this.f62599e = i3;
        this.f62597c = Math.min(m31840a / 4, f62594j);
        this.f62602h = atomicReferenceArray;
        this.f62601g = i3;
        this.f62598d = i3 - 1;
        atomicLong.lazySet(0L);
    }

    /* renamed from: a */
    public final long m31763a() {
        return this.f62603i.get();
    }

    /* renamed from: b */
    public final long m31764b() {
        return this.f62596b.get();
    }

    /* renamed from: c */
    public boolean m31765c(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f62600f;
        long m31764b = m31764b();
        int i2 = this.f62599e;
        long j2 = 2 + m31764b;
        if (atomicReferenceArray.get(((int) j2) & i2) == null) {
            int i3 = ((int) m31764b) & i2;
            atomicReferenceArray.lazySet(i3 + 1, t2);
            atomicReferenceArray.lazySet(i3, t);
            this.f62596b.lazySet(j2);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f62600f = atomicReferenceArray2;
        int i4 = ((int) m31764b) & i2;
        atomicReferenceArray2.lazySet(i4 + 1, t2);
        atomicReferenceArray2.lazySet(i4, t);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i4, f62595k);
        this.f62596b.lazySet(j2);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* renamed from: d */
    public int m31766d() {
        long m31763a = m31763a();
        while (true) {
            long m31764b = m31764b();
            long m31763a2 = m31763a();
            if (m31763a == m31763a2) {
                return (int) (m31764b - m31763a2);
            }
            m31763a = m31763a2;
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return m31764b() == m31763a();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t) {
        Objects.requireNonNull(t, "Null is not a valid element");
        AtomicReferenceArray<Object> atomicReferenceArray = this.f62600f;
        long j2 = this.f62596b.get();
        int i2 = this.f62599e;
        int i3 = ((int) j2) & i2;
        if (j2 < this.f62598d) {
            atomicReferenceArray.lazySet(i3, t);
            this.f62596b.lazySet(j2 + 1);
            return true;
        }
        long j3 = this.f62597c + j2;
        if (atomicReferenceArray.get(((int) j3) & i2) == null) {
            this.f62598d = j3 - 1;
            atomicReferenceArray.lazySet(i3, t);
            this.f62596b.lazySet(j2 + 1);
            return true;
        }
        long j4 = j2 + 1;
        if (atomicReferenceArray.get(((int) j4) & i2) == null) {
            atomicReferenceArray.lazySet(i3, t);
            this.f62596b.lazySet(j4);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f62600f = atomicReferenceArray2;
        this.f62598d = (i2 + j2) - 1;
        atomicReferenceArray2.lazySet(i3, t);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i3, f62595k);
        this.f62596b.lazySet(j4);
        return true;
    }

    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f62602h;
        long j2 = this.f62603i.get();
        int i2 = this.f62601g;
        int i3 = ((int) j2) & i2;
        T t = (T) atomicReferenceArray.get(i3);
        if (t != f62595k) {
            return t;
        }
        int i4 = i2 + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i4);
        atomicReferenceArray.lazySet(i4, null);
        this.f62602h = atomicReferenceArray2;
        return (T) atomicReferenceArray2.get(i3);
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f62602h;
        long j2 = this.f62603i.get();
        int i2 = this.f62601g;
        int i3 = ((int) j2) & i2;
        T t = (T) atomicReferenceArray.get(i3);
        boolean z = t == f62595k;
        if (t != null && !z) {
            atomicReferenceArray.lazySet(i3, null);
            this.f62603i.lazySet(j2 + 1);
            return t;
        }
        if (!z) {
            return null;
        }
        int i4 = i2 + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i4);
        atomicReferenceArray.lazySet(i4, null);
        this.f62602h = atomicReferenceArray2;
        T t2 = (T) atomicReferenceArray2.get(i3);
        if (t2 != null) {
            atomicReferenceArray2.lazySet(i3, null);
            this.f62603i.lazySet(j2 + 1);
        }
        return t2;
    }
}
