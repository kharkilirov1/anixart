package com.google.common.graph;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
class StandardValueGraph<N, V> extends AbstractValueGraph<N, V> {

    /* renamed from: com.google.common.graph.StandardValueGraph$1 */
    class C18511 extends IncidentEdgeSet<Object> {

        /* renamed from: d */
        public final /* synthetic */ GraphConnections f21736d;

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<EndpointPair<Object>> iterator() {
            return this.f21736d.mo11995a(this.f21723b);
        }
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    /* renamed from: b */
    public boolean mo11989b() {
        return false;
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    /* renamed from: c */
    public boolean mo11990c() {
        return false;
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.SuccessorsFunction
    /* renamed from: d */
    public Iterable mo11982d(Object obj) {
        throw null;
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    /* renamed from: e */
    public Set<N> mo11991e() {
        throw null;
    }

    @Override // com.google.common.graph.BaseGraph
    /* renamed from: g */
    public Set<N> mo11992g(N n) {
        throw null;
    }

    @Override // com.google.common.graph.BaseGraph
    /* renamed from: i */
    public Set<N> mo11993i(N n) {
        throw null;
    }

    @Override // com.google.common.graph.ValueGraph
    @NullableDecl
    /* renamed from: m */
    public V mo12011m(N n, N n2, @NullableDecl V v) {
        Objects.requireNonNull(n);
        Objects.requireNonNull(n2);
        throw null;
    }

    @Override // com.google.common.graph.AbstractBaseGraph
    /* renamed from: n */
    public long mo11986n() {
        return 0L;
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.SuccessorsFunction
    /* renamed from: d */
    public Set<N> mo11982d(N n) {
        throw null;
    }
}
