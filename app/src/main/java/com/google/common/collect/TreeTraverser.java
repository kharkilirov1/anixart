package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;

@Beta
@GwtCompatible
@Deprecated
/* loaded from: classes.dex */
public abstract class TreeTraverser<T> {

    /* renamed from: com.google.common.collect.TreeTraverser$1 */
    class C18091 extends TreeTraverser<Object> {
        @Override // com.google.common.collect.TreeTraverser
        /* renamed from: a */
        public Iterable<Object> mo11969a(Object obj) {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$2 */
    class C18102 extends FluentIterable<Object> {
        @Override // java.lang.Iterable
        public Iterator iterator() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$3 */
    class C18113 extends FluentIterable<Object> {
        @Override // java.lang.Iterable
        public Iterator iterator() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$4 */
    class C18124 extends FluentIterable<Object> {
        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new BreadthFirstIterator(null, null);
        }
    }

    public final class BreadthFirstIterator extends UnmodifiableIterator<T> implements PeekingIterator<T> {

        /* renamed from: b */
        public final Queue<T> f21649b;

        /* renamed from: c */
        public final /* synthetic */ TreeTraverser f21650c = null;

        public BreadthFirstIterator(TreeTraverser treeTraverser, T t) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f21649b = arrayDeque;
            arrayDeque.add(null);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f21649b.isEmpty();
        }

        @Override // java.util.Iterator, com.google.common.collect.PeekingIterator
        public T next() {
            T remove = this.f21649b.remove();
            Iterables.m11696a(this.f21649b, this.f21650c.mo11969a(remove));
            return remove;
        }

        @Override // com.google.common.collect.PeekingIterator
        public T peek() {
            return this.f21649b.element();
        }
    }

    public final class PostOrderIterator extends AbstractIterator<T> {

        /* renamed from: d */
        public final ArrayDeque<PostOrderNode<T>> f21651d;

        /* renamed from: e */
        public final /* synthetic */ TreeTraverser f21652e;

        @Override // com.google.common.collect.AbstractIterator
        /* renamed from: a */
        public T mo11332a() {
            while (!this.f21651d.isEmpty()) {
                PostOrderNode<T> last = this.f21651d.getLast();
                if (!last.f21654b.hasNext()) {
                    this.f21651d.removeLast();
                    return last.f21653a;
                }
                T next = last.f21654b.next();
                this.f21651d.addLast(new PostOrderNode<>(next, this.f21652e.mo11969a(next).iterator()));
            }
            m11333b();
            return null;
        }
    }

    public static final class PostOrderNode<T> {

        /* renamed from: a */
        public final T f21653a;

        /* renamed from: b */
        public final Iterator<T> f21654b;

        public PostOrderNode(T t, Iterator<T> it) {
            Objects.requireNonNull(t);
            this.f21653a = t;
            Objects.requireNonNull(it);
            this.f21654b = it;
        }
    }

    public final class PreOrderIterator extends UnmodifiableIterator<T> {

        /* renamed from: b */
        public final Deque<Iterator<T>> f21655b;

        /* renamed from: c */
        public final /* synthetic */ TreeTraverser f21656c;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f21655b.isEmpty();
        }

        @Override // java.util.Iterator
        public T next() {
            Iterator<T> last = this.f21655b.getLast();
            T next = last.next();
            Objects.requireNonNull(next);
            if (!last.hasNext()) {
                this.f21655b.removeLast();
            }
            Iterator<T> it = this.f21656c.mo11969a(next).iterator();
            if (it.hasNext()) {
                this.f21655b.addLast(it);
            }
            return next;
        }
    }

    /* renamed from: a */
    public abstract Iterable<T> mo11969a(T t);
}
