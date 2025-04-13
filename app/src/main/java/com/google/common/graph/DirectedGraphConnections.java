package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.collect.AbstractIterator;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.EndpointPair;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class DirectedGraphConnections<N, V> implements GraphConnections<N, V> {

    /* renamed from: a */
    public static final Object f21687a = new Object();

    /* renamed from: com.google.common.graph.DirectedGraphConnections$1 */
    class C18321 extends AbstractSet<Object> {

        /* renamed from: b */
        public final /* synthetic */ DirectedGraphConnections f21688b;

        /* renamed from: com.google.common.graph.DirectedGraphConnections$1$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Object> {

            /* renamed from: d */
            public final /* synthetic */ Iterator f21689d;

            /* renamed from: e */
            public final /* synthetic */ Set f21690e;

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: a */
            public Object mo11332a() {
                while (this.f21689d.hasNext()) {
                    NodeConnection nodeConnection = (NodeConnection) this.f21689d.next();
                    Set set = this.f21690e;
                    Objects.requireNonNull(nodeConnection);
                    if (set.add(null)) {
                        return null;
                    }
                }
                m11333b();
                return null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            DirectedGraphConnections directedGraphConnections = this.f21688b;
            Object obj2 = DirectedGraphConnections.f21687a;
            Objects.requireNonNull(directedGraphConnections);
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            DirectedGraphConnections directedGraphConnections = this.f21688b;
            Object obj = DirectedGraphConnections.f21687a;
            Objects.requireNonNull(directedGraphConnections);
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            DirectedGraphConnections directedGraphConnections = this.f21688b;
            Object obj = DirectedGraphConnections.f21687a;
            Objects.requireNonNull(directedGraphConnections);
            throw null;
        }
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$3 */
    class C18343 extends AbstractSet<Object> {

        /* renamed from: b */
        public final /* synthetic */ DirectedGraphConnections f21694b;

        /* renamed from: com.google.common.graph.DirectedGraphConnections$3$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Object> {

            /* renamed from: d */
            public final /* synthetic */ Iterator f21695d;

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: a */
            public Object mo11332a() {
                while (this.f21695d.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f21695d.next();
                    Object value = entry.getValue();
                    if ((value == DirectedGraphConnections.f21687a || value == null) ? false : true) {
                        return entry.getKey();
                    }
                }
                m11333b();
                return null;
            }
        }

        /* renamed from: com.google.common.graph.DirectedGraphConnections$3$2, reason: invalid class name */
        class AnonymousClass2 extends AbstractIterator<Object> {

            /* renamed from: d */
            public final /* synthetic */ Iterator f21696d;

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: a */
            public Object mo11332a() {
                while (this.f21696d.hasNext()) {
                    NodeConnection nodeConnection = (NodeConnection) this.f21696d.next();
                    if (nodeConnection instanceof NodeConnection.Succ) {
                        Objects.requireNonNull(nodeConnection);
                        return null;
                    }
                }
                m11333b();
                return null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            DirectedGraphConnections directedGraphConnections = this.f21694b;
            Object obj2 = DirectedGraphConnections.f21687a;
            Objects.requireNonNull(directedGraphConnections);
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            DirectedGraphConnections directedGraphConnections = this.f21694b;
            Object obj = DirectedGraphConnections.f21687a;
            Objects.requireNonNull(directedGraphConnections);
            Objects.requireNonNull(this.f21694b);
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            DirectedGraphConnections directedGraphConnections = this.f21694b;
            Object obj = DirectedGraphConnections.f21687a;
            Objects.requireNonNull(directedGraphConnections);
            return 0;
        }
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$4 */
    public class C18354 implements Function<N, EndpointPair<N>> {

        /* renamed from: b */
        public final /* synthetic */ Object f21697b;

        @Override // com.google.common.base.Function
        public Object apply(Object obj) {
            return new EndpointPair.Ordered(obj, this.f21697b, null);
        }
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$5 */
    public class C18365 implements Function<N, EndpointPair<N>> {

        /* renamed from: b */
        public final /* synthetic */ Object f21698b;

        @Override // com.google.common.base.Function
        public Object apply(Object obj) {
            return EndpointPair.m11996e(this.f21698b, obj);
        }
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$6 */
    public class C18376 implements Function<NodeConnection<N>, EndpointPair<N>> {

        /* renamed from: b */
        public final /* synthetic */ Object f21699b;

        @Override // com.google.common.base.Function
        public Object apply(Object obj) {
            NodeConnection nodeConnection = (NodeConnection) obj;
            if (nodeConnection instanceof NodeConnection.Succ) {
                Object obj2 = this.f21699b;
                Objects.requireNonNull(nodeConnection);
                return EndpointPair.m11996e(obj2, null);
            }
            Objects.requireNonNull(nodeConnection);
            EndpointPair.m11996e(null, this.f21699b);
            throw null;
        }
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$7 */
    public class C18387 extends AbstractIterator<EndpointPair<N>> {

        /* renamed from: d */
        public final /* synthetic */ Iterator f21700d;

        /* renamed from: e */
        public final /* synthetic */ AtomicBoolean f21701e;

        @Override // com.google.common.collect.AbstractIterator
        /* renamed from: a */
        public Object mo11332a() {
            while (this.f21700d.hasNext()) {
                EndpointPair endpointPair = (EndpointPair) this.f21700d.next();
                if (!endpointPair.f21709b.equals(endpointPair.f21710c) || !this.f21701e.getAndSet(true)) {
                    return endpointPair;
                }
            }
            m11333b();
            return null;
        }
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$8 */
    public static /* synthetic */ class C18398 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21702a;

        static {
            int[] iArr = new int[ElementOrder.Type.values().length];
            f21702a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21702a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class NodeConnection<N> {

        public static final class Pred<N> extends NodeConnection<N> {
            public boolean equals(Object obj) {
                if (!(obj instanceof Pred)) {
                    return false;
                }
                Objects.requireNonNull((Pred) obj);
                throw null;
            }

            public int hashCode() {
                Pred.class.hashCode();
                throw null;
            }
        }

        public static final class Succ<N> extends NodeConnection<N> {
            public boolean equals(Object obj) {
                if (!(obj instanceof Succ)) {
                    return false;
                }
                Objects.requireNonNull((Succ) obj);
                throw null;
            }

            public int hashCode() {
                Succ.class.hashCode();
                throw null;
            }
        }
    }

    public static final class PredAndSucc {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.common.graph.DirectedGraphConnections$2] */
    @Override // com.google.common.graph.GraphConnections
    /* renamed from: a */
    public Iterator<EndpointPair<N>> mo11995a(N n) {
        Objects.requireNonNull(n);
        new AbstractSet<Object>() { // from class: com.google.common.graph.DirectedGraphConnections.2

            /* renamed from: com.google.common.graph.DirectedGraphConnections$2$1, reason: invalid class name */
            class AnonymousClass1 extends AbstractIterator<Object> {

                /* renamed from: d */
                public final /* synthetic */ Iterator f21692d;

                @Override // com.google.common.collect.AbstractIterator
                /* renamed from: a */
                public Object mo11332a() {
                    while (this.f21692d.hasNext()) {
                        Map.Entry entry = (Map.Entry) this.f21692d.next();
                        Object value = entry.getValue();
                        if (value == DirectedGraphConnections.f21687a || (value instanceof PredAndSucc)) {
                            return entry.getKey();
                        }
                    }
                    m11333b();
                    return null;
                }
            }

            /* renamed from: com.google.common.graph.DirectedGraphConnections$2$2, reason: invalid class name */
            class AnonymousClass2 extends AbstractIterator<Object> {

                /* renamed from: d */
                public final /* synthetic */ Iterator f21693d;

                @Override // com.google.common.collect.AbstractIterator
                /* renamed from: a */
                public Object mo11332a() {
                    while (this.f21693d.hasNext()) {
                        NodeConnection nodeConnection = (NodeConnection) this.f21693d.next();
                        if (nodeConnection instanceof NodeConnection.Pred) {
                            Objects.requireNonNull(nodeConnection);
                            return null;
                        }
                    }
                    m11333b();
                    return null;
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@NullableDecl Object obj) {
                DirectedGraphConnections directedGraphConnections = DirectedGraphConnections.this;
                Object obj2 = DirectedGraphConnections.f21687a;
                Objects.requireNonNull(directedGraphConnections);
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                DirectedGraphConnections directedGraphConnections = DirectedGraphConnections.this;
                Object obj = DirectedGraphConnections.f21687a;
                Objects.requireNonNull(directedGraphConnections);
                Objects.requireNonNull(DirectedGraphConnections.this);
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                DirectedGraphConnections directedGraphConnections = DirectedGraphConnections.this;
                Object obj = DirectedGraphConnections.f21687a;
                Objects.requireNonNull(directedGraphConnections);
                return 0;
            }
        }.iterator();
        throw null;
    }
}
