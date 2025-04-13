package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Queue;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class ForwardingQueue<E> extends ForwardingCollection<E> implements Queue<E> {
    @Override // com.google.common.collect.ForwardingCollection
    /* renamed from: K, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract Queue<E> mo11329H();

    @Override // java.util.Queue
    public E element() {
        return mo7455G().element();
    }

    @CanIgnoreReturnValue
    public boolean offer(E e2) {
        return mo7455G().offer(e2);
    }

    @Override // java.util.Queue
    public E peek() {
        return mo7455G().peek();
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public E poll() {
        return mo7455G().poll();
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public E remove() {
        return mo7455G().remove();
    }
}
