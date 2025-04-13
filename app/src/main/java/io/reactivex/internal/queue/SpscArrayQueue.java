package io.reactivex.internal.queue;

import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.Pow2;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements SimplePlainQueue<E> {

    /* renamed from: g */
    public static final Integer f62588g = Integer.getInteger("jctools.spsc.max.lookahead.step", RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT);

    /* renamed from: b */
    public final int f62589b;

    /* renamed from: c */
    public final AtomicLong f62590c;

    /* renamed from: d */
    public long f62591d;

    /* renamed from: e */
    public final AtomicLong f62592e;

    /* renamed from: f */
    public final int f62593f;

    public SpscArrayQueue(int i2) {
        super(Pow2.m31840a(i2));
        this.f62589b = length() - 1;
        this.f62590c = new AtomicLong();
        this.f62592e = new AtomicLong();
        this.f62593f = Math.min(i2 / 4, f62588g.intValue());
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return this.f62590c.get() == this.f62592e.get();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(E e2) {
        Objects.requireNonNull(e2, "Null is not a valid element");
        int i2 = this.f62589b;
        long j2 = this.f62590c.get();
        int i3 = ((int) j2) & i2;
        if (j2 >= this.f62591d) {
            long j3 = this.f62593f + j2;
            if (get(i2 & ((int) j3)) == null) {
                this.f62591d = j3;
            } else if (get(i3) != null) {
                return false;
            }
        }
        lazySet(i3, e2);
        this.f62590c.lazySet(j2 + 1);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public E poll() {
        long j2 = this.f62592e.get();
        int i2 = ((int) j2) & this.f62589b;
        E e2 = get(i2);
        if (e2 == null) {
            return null;
        }
        this.f62592e.lazySet(j2 + 1);
        lazySet(i2, null);
        return e2;
    }
}
