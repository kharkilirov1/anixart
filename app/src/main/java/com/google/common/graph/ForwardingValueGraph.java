package com.google.common.graph;

import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
abstract class ForwardingValueGraph<N, V> extends AbstractValueGraph<N, V> {
    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    /* renamed from: b */
    public boolean mo11989b() {
        return mo12012q().mo11989b();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    /* renamed from: c */
    public boolean mo11990c() {
        return mo12012q().mo11990c();
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.SuccessorsFunction
    /* renamed from: d */
    public Set<N> mo11982d(N n) {
        return mo12012q().mo11982d((ValueGraph<N, V>) n);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    /* renamed from: e */
    public Set<N> mo11991e() {
        return mo12012q().mo11991e();
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    /* renamed from: f */
    public int mo11983f(N n) {
        return mo12012q().mo11983f(n);
    }

    @Override // com.google.common.graph.BaseGraph
    /* renamed from: g */
    public Set<N> mo11992g(N n) {
        return mo12012q().mo11992g(n);
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    /* renamed from: h */
    public int mo11984h(N n) {
        return mo12012q().mo11984h(n);
    }

    @Override // com.google.common.graph.BaseGraph
    /* renamed from: i */
    public Set<N> mo11993i(N n) {
        return mo12012q().mo11993i(n);
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    /* renamed from: j */
    public int mo11985j(N n) {
        return mo12012q().mo11985j(n);
    }

    @Override // com.google.common.graph.ValueGraph
    @NullableDecl
    /* renamed from: m */
    public V mo12011m(N n, N n2, @NullableDecl V v) {
        return mo12012q().mo12011m(n, n2, v);
    }

    @Override // com.google.common.graph.AbstractBaseGraph
    /* renamed from: n */
    public long mo11986n() {
        return mo12012q().mo11981a().size();
    }

    /* renamed from: q */
    public abstract ValueGraph<N, V> mo12012q();
}
