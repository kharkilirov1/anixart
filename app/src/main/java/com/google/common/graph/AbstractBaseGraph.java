package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.EndpointPairIterator;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
abstract class AbstractBaseGraph<N> implements BaseGraph<N> {

    /* renamed from: com.google.common.graph.AbstractBaseGraph$2 */
    class C18252 extends IncidentEdgeSet<Object> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return this.f21724c.mo11989b() ? Iterators.m11721p(Iterators.m11708c(Iterators.m11720o(this.f21724c.mo11992g(this.f21723b).iterator(), new Function<Object, EndpointPair<Object>>() { // from class: com.google.common.graph.AbstractBaseGraph.2.1
                @Override // com.google.common.base.Function
                public EndpointPair<Object> apply(Object obj) {
                    return new EndpointPair.Ordered(obj, C18252.this.f21723b, null);
                }
            }), Iterators.m11720o(Sets.m11883a(this.f21724c.mo11982d((BaseGraph<N>) this.f21723b), ImmutableSet.m11672D(this.f21723b)).iterator(), new Function<Object, EndpointPair<Object>>() { // from class: com.google.common.graph.AbstractBaseGraph.2.2
                @Override // com.google.common.base.Function
                public EndpointPair<Object> apply(Object obj) {
                    return EndpointPair.m11996e(C18252.this.f21723b, obj);
                }
            }))) : Iterators.m11721p(Iterators.m11720o(this.f21724c.mo11993i(this.f21723b).iterator(), new Function<Object, EndpointPair<Object>>() { // from class: com.google.common.graph.AbstractBaseGraph.2.3
                @Override // com.google.common.base.Function
                public EndpointPair<Object> apply(Object obj) {
                    return new EndpointPair.Unordered(obj, C18252.this.f21723b, null);
                }
            }));
        }
    }

    @Override // com.google.common.graph.BaseGraph
    /* renamed from: a */
    public Set<EndpointPair<N>> mo11981a() {
        return new AbstractSet<EndpointPair<N>>() { // from class: com.google.common.graph.AbstractBaseGraph.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@NullableDecl Object obj) {
                if (!(obj instanceof EndpointPair)) {
                    return false;
                }
                EndpointPair<?> endpointPair = (EndpointPair) obj;
                return AbstractBaseGraph.this.m11987o(endpointPair) && AbstractBaseGraph.this.mo11991e().contains(endpointPair.f21709b) && AbstractBaseGraph.this.mo11982d((AbstractBaseGraph) endpointPair.f21709b).contains(endpointPair.f21710c);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                AbstractBaseGraph abstractBaseGraph = AbstractBaseGraph.this;
                return abstractBaseGraph.mo11989b() ? new EndpointPairIterator.Directed(abstractBaseGraph, null) : new EndpointPairIterator.Undirected(abstractBaseGraph, null);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return Ints.m12084f(AbstractBaseGraph.this.mo11986n());
            }
        };
    }

    @Override // com.google.common.graph.BaseGraph
    /* renamed from: f */
    public int mo11983f(N n) {
        if (mo11989b()) {
            return IntMath.m12061d(mo11992g(n).size(), mo11982d((AbstractBaseGraph<N>) n).size());
        }
        Set<N> mo11993i = mo11993i(n);
        return IntMath.m12061d(mo11993i.size(), (mo11990c() && mo11993i.contains(n)) ? 1 : 0);
    }

    @Override // com.google.common.graph.BaseGraph
    /* renamed from: h */
    public int mo11984h(N n) {
        return mo11989b() ? mo11982d((AbstractBaseGraph<N>) n).size() : mo11983f(n);
    }

    @Override // com.google.common.graph.BaseGraph
    /* renamed from: j */
    public int mo11985j(N n) {
        return mo11989b() ? mo11992g(n).size() : mo11983f(n);
    }

    /* renamed from: n */
    public long mo11986n() {
        long j2 = 0;
        while (mo11991e().iterator().hasNext()) {
            j2 += mo11983f(r0.next());
        }
        Preconditions.m11191o((1 & j2) == 0);
        return j2 >>> 1;
    }

    /* renamed from: o */
    public final boolean m11987o(EndpointPair<?> endpointPair) {
        return endpointPair.mo11998b() || !mo11989b();
    }
}
