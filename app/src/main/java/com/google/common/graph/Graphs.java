package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
/* loaded from: classes.dex */
public final class Graphs {

    public enum NodeVisitState {
        PENDING,
        COMPLETE
    }

    public static class TransposedGraph<N> extends ForwardingGraph<N> {

        /* renamed from: com.google.common.graph.Graphs$TransposedGraph$1 */
        class C18441 extends IncidentEdgeSet<Object> {

            /* renamed from: d */
            public final /* synthetic */ TransposedGraph f21721d;

            /* renamed from: com.google.common.graph.Graphs$TransposedGraph$1$1, reason: invalid class name */
            public class AnonymousClass1 implements Function<EndpointPair<Object>, EndpointPair<Object>> {

                /* renamed from: b */
                public final /* synthetic */ C18441 f21722b;

                @Override // com.google.common.base.Function
                public EndpointPair<Object> apply(EndpointPair<Object> endpointPair) {
                    Objects.requireNonNull(this.f21722b.f21721d);
                    Object obj = endpointPair.f21710c;
                    throw null;
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<EndpointPair<Object>> iterator() {
                Objects.requireNonNull(this.f21721d);
                throw null;
            }
        }

        @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.SuccessorsFunction
        /* renamed from: d */
        public Iterable mo11982d(Object obj) {
            throw null;
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph
        /* renamed from: g */
        public Set<N> mo11992g(N n) {
            throw null;
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        /* renamed from: h */
        public int mo11984h(N n) {
            throw null;
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        /* renamed from: j */
        public int mo11985j(N n) {
            throw null;
        }

        @Override // com.google.common.graph.ForwardingGraph
        /* renamed from: p */
        public /* bridge */ /* synthetic */ BaseGraph mo12003p() {
            return null;
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.SuccessorsFunction
        /* renamed from: d */
        public Set<N> mo11982d(N n) {
            throw null;
        }
    }

    public static class TransposedNetwork<N, E> extends ForwardingNetwork<N, E> {
        @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.SuccessorsFunction
        /* renamed from: d */
        public Iterable mo11982d(Object obj) {
            throw null;
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network
        /* renamed from: l */
        public EndpointPair<N> mo12009l(E e2) {
            throw null;
        }

        @Override // com.google.common.graph.ForwardingNetwork
        /* renamed from: o */
        public Network<N, E> mo12010o() {
            return null;
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.SuccessorsFunction
        /* renamed from: d */
        public Set<N> mo11982d(N n) {
            throw null;
        }
    }

    public static class TransposedValueGraph<N, V> extends ForwardingValueGraph<N, V> {
        @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.SuccessorsFunction
        /* renamed from: d */
        public Iterable mo11982d(Object obj) {
            throw null;
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.BaseGraph
        /* renamed from: g */
        public Set<N> mo11992g(N n) {
            throw null;
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        /* renamed from: h */
        public int mo11984h(N n) {
            throw null;
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        /* renamed from: j */
        public int mo11985j(N n) {
            throw null;
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.ValueGraph
        @NullableDecl
        /* renamed from: m */
        public V mo12011m(N n, N n2, @NullableDecl V v) {
            throw null;
        }

        @Override // com.google.common.graph.ForwardingValueGraph
        /* renamed from: q */
        public ValueGraph<N, V> mo12012q() {
            return null;
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.SuccessorsFunction
        /* renamed from: d */
        public Set<N> mo11982d(N n) {
            throw null;
        }
    }
}
