package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

@Beta
@GwtCompatible
/* loaded from: classes.dex */
public final class EvictingQueue<E> extends ForwardingQueue<E> implements Serializable {
    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    /* renamed from: G */
    public /* bridge */ /* synthetic */ Object mo11329H() {
        return null;
    }

    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection
    /* renamed from: H */
    public /* bridge */ /* synthetic */ Collection mo11329H() {
        return null;
    }

    @Override // com.google.common.collect.ForwardingQueue
    /* renamed from: K */
    public Queue<E> mo7455G() {
        return null;
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
    @CanIgnoreReturnValue
    public boolean add(E e2) {
        Objects.requireNonNull(e2);
        return true;
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        if (size < 0) {
            return Iterators.m11706a(this, collection.iterator());
        }
        clear();
        int i2 = size - 0;
        Preconditions.m11179c(i2 >= 0, "number to skip cannot be negative");
        return Iterables.m11696a(this, new FluentIterable<Object>() { // from class: com.google.common.collect.Iterables.6

            /* renamed from: c */
            public final /* synthetic */ Iterable f21112c;

            /* renamed from: d */
            public final /* synthetic */ int f21113d;

            /* renamed from: com.google.common.collect.Iterables$6$1 */
            public class AnonymousClass1 implements Iterator<Object> {

                /* renamed from: b */
                public boolean f21114b = true;

                /* renamed from: c */
                public final /* synthetic */ Iterator f21115c;

                public AnonymousClass1(Iterator it) {
                    r1 = it;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return r1.hasNext();
                }

                @Override // java.util.Iterator
                public Object next() {
                    Object next = r1.next();
                    this.f21114b = false;
                    return next;
                }

                @Override // java.util.Iterator
                public void remove() {
                    Preconditions.m11192p(!this.f21114b, "no calls to next() since the last call to remove()");
                    r1.remove();
                }
            }

            public C16766(Iterable collection2, int i22) {
                r1 = collection2;
                r2 = i22;
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                Iterable iterable = r1;
                if (iterable instanceof List) {
                    List list = (List) iterable;
                    return list.subList(Math.min(list.size(), r2), list.size()).iterator();
                }
                Iterator it = iterable.iterator();
                int i3 = r2;
                Objects.requireNonNull(it);
                Preconditions.m11179c(i3 >= 0, "numberToAdvance must be nonnegative");
                for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
                    it.next();
                }
                return new Iterator<Object>() { // from class: com.google.common.collect.Iterables.6.1

                    /* renamed from: b */
                    public boolean f21114b = true;

                    /* renamed from: c */
                    public final /* synthetic */ Iterator f21115c;

                    public AnonymousClass1(Iterator it2) {
                        r1 = it2;
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return r1.hasNext();
                    }

                    @Override // java.util.Iterator
                    public Object next() {
                        Object next = r1.next();
                        this.f21114b = false;
                        return next;
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        Preconditions.m11192p(!this.f21114b, "no calls to next() since the last call to remove()");
                        r1.remove();
                    }
                };
            }
        });
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Objects.requireNonNull(obj);
        throw null;
    }

    @Override // com.google.common.collect.ForwardingQueue, java.util.Queue
    @CanIgnoreReturnValue
    public boolean offer(E e2) {
        Objects.requireNonNull(e2);
        return true;
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean remove(Object obj) {
        Objects.requireNonNull(obj);
        throw null;
    }
}
