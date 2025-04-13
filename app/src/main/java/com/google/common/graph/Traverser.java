package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.collect.AbstractIterator;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Deque;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@DoNotMock
@Beta
/* loaded from: classes.dex */
public abstract class Traverser<N> {

    /* renamed from: com.google.common.graph.Traverser$1 */
    class C18521 extends Traverser<Object> {
    }

    /* renamed from: com.google.common.graph.Traverser$2 */
    class C18532 extends Traverser<Object> {
    }

    /* renamed from: com.google.common.graph.Traverser$3 */
    class C18543 implements Iterable<Object> {
        @Override // java.lang.Iterable
        public Iterator<Object> iterator() {
            throw null;
        }
    }

    /* renamed from: com.google.common.graph.Traverser$4 */
    class C18554 implements Iterable<Object> {
        @Override // java.lang.Iterable
        public Iterator<Object> iterator() {
            throw null;
        }
    }

    /* renamed from: com.google.common.graph.Traverser$5 */
    class C18565 implements Iterable<Object> {
        @Override // java.lang.Iterable
        public Iterator<Object> iterator() {
            throw null;
        }
    }

    public enum InsertionOrder {
        FRONT { // from class: com.google.common.graph.Traverser.InsertionOrder.1
            @Override // com.google.common.graph.Traverser.InsertionOrder
            /* renamed from: a */
            public <T> void mo12014a(Deque<T> deque, T t) {
                deque.addFirst(t);
            }
        },
        BACK { // from class: com.google.common.graph.Traverser.InsertionOrder.2
            @Override // com.google.common.graph.Traverser.InsertionOrder
            /* renamed from: a */
            public <T> void mo12014a(Deque<T> deque, T t) {
                deque.addLast(t);
            }
        };

        InsertionOrder(C18521 c18521) {
        }

        /* renamed from: a */
        public abstract <T> void mo12014a(Deque<T> deque, T t);
    }

    public static abstract class Traversal<N> {

        /* renamed from: a */
        public final SuccessorsFunction<N> f21740a;

        /* renamed from: com.google.common.graph.Traverser$Traversal$1 */
        class C18591 extends Traversal<Object> {

            /* renamed from: b */
            public final /* synthetic */ Set f21741b;

            @Override // com.google.common.graph.Traverser.Traversal
            /* renamed from: a */
            public Object mo12015a(Deque<Iterator<? extends Object>> deque) {
                Iterator<? extends Object> first = deque.getFirst();
                while (first.hasNext()) {
                    Object next = first.next();
                    Objects.requireNonNull(next);
                    if (this.f21741b.add(next)) {
                        return next;
                    }
                }
                deque.removeFirst();
                return null;
            }
        }

        /* renamed from: com.google.common.graph.Traverser$Traversal$2 */
        class C18602 extends Traversal<Object> {
            @Override // com.google.common.graph.Traverser.Traversal
            /* renamed from: a */
            public Object mo12015a(Deque<Iterator<? extends Object>> deque) {
                Iterator<? extends Object> first = deque.getFirst();
                if (!first.hasNext()) {
                    deque.removeFirst();
                    return null;
                }
                Object next = first.next();
                Objects.requireNonNull(next);
                return next;
            }
        }

        /* renamed from: com.google.common.graph.Traverser$Traversal$3 */
        class C18613 extends AbstractIterator<Object> {

            /* renamed from: d */
            public final /* synthetic */ Deque f21742d;

            /* renamed from: e */
            public final /* synthetic */ InsertionOrder f21743e;

            /* renamed from: f */
            public final /* synthetic */ Traversal f21744f;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: a */
            public Object mo11332a() {
                do {
                    Object mo12015a = this.f21744f.mo12015a(this.f21742d);
                    if (mo12015a != null) {
                        Iterator it = this.f21744f.f21740a.mo11982d(mo12015a).iterator();
                        if (it.hasNext()) {
                            this.f21743e.mo12014a(this.f21742d, it);
                        }
                        return mo12015a;
                    }
                } while (!this.f21742d.isEmpty());
                m11333b();
                return null;
            }
        }

        /* renamed from: com.google.common.graph.Traverser$Traversal$4 */
        class C18624 extends AbstractIterator<Object> {

            /* renamed from: d */
            public final /* synthetic */ Deque f21745d;

            /* renamed from: e */
            public final /* synthetic */ Deque f21746e;

            /* renamed from: f */
            public final /* synthetic */ Traversal f21747f;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: a */
            public Object mo11332a() {
                while (true) {
                    Object mo12015a = this.f21747f.mo12015a(this.f21745d);
                    if (mo12015a == null) {
                        if (!this.f21746e.isEmpty()) {
                            return this.f21746e.pop();
                        }
                        m11333b();
                        return null;
                    }
                    Iterator it = this.f21747f.f21740a.mo11982d(mo12015a).iterator();
                    if (!it.hasNext()) {
                        return mo12015a;
                    }
                    this.f21745d.addFirst(it);
                    this.f21746e.push(mo12015a);
                }
            }
        }

        @NullableDecl
        /* renamed from: a */
        public abstract N mo12015a(Deque<Iterator<? extends N>> deque);
    }
}
