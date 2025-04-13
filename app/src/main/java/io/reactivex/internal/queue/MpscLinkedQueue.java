package io.reactivex.internal.queue;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class MpscLinkedQueue<T> implements SimplePlainQueue<T> {

    /* renamed from: b */
    public final AtomicReference<LinkedQueueNode<T>> f62585b;

    /* renamed from: c */
    public final AtomicReference<LinkedQueueNode<T>> f62586c;

    public static final class LinkedQueueNode<E> extends AtomicReference<LinkedQueueNode<E>> {

        /* renamed from: b */
        public E f62587b;

        public LinkedQueueNode() {
        }

        public LinkedQueueNode(E e2) {
            this.f62587b = e2;
        }
    }

    public MpscLinkedQueue() {
        AtomicReference<LinkedQueueNode<T>> atomicReference = new AtomicReference<>();
        this.f62585b = atomicReference;
        AtomicReference<LinkedQueueNode<T>> atomicReference2 = new AtomicReference<>();
        this.f62586c = atomicReference2;
        LinkedQueueNode<T> linkedQueueNode = new LinkedQueueNode<>();
        atomicReference2.lazySet(linkedQueueNode);
        atomicReference.getAndSet(linkedQueueNode);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return this.f62586c.get() == this.f62585b.get();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t) {
        Objects.requireNonNull(t, "Null is not a valid element");
        LinkedQueueNode<T> linkedQueueNode = new LinkedQueueNode<>(t);
        this.f62585b.getAndSet(linkedQueueNode).lazySet(linkedQueueNode);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public T poll() {
        LinkedQueueNode linkedQueueNode;
        LinkedQueueNode<T> linkedQueueNode2 = this.f62586c.get();
        LinkedQueueNode linkedQueueNode3 = linkedQueueNode2.get();
        if (linkedQueueNode3 != null) {
            T t = linkedQueueNode3.f62587b;
            linkedQueueNode3.f62587b = null;
            this.f62586c.lazySet(linkedQueueNode3);
            return t;
        }
        if (linkedQueueNode2 == this.f62585b.get()) {
            return null;
        }
        do {
            linkedQueueNode = linkedQueueNode2.get();
        } while (linkedQueueNode == null);
        T t2 = linkedQueueNode.f62587b;
        linkedQueueNode.f62587b = null;
        this.f62586c.lazySet(linkedQueueNode);
        return t2;
    }
}
