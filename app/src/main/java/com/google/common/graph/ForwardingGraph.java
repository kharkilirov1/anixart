package com.google.common.graph;

import java.util.Set;

/* loaded from: classes.dex */
abstract class ForwardingGraph<N> extends AbstractGraph<N> {
    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    /* renamed from: b */
    public boolean mo11989b() {
        return mo12003p().mo11989b();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    /* renamed from: c */
    public boolean mo11990c() {
        return mo12003p().mo11990c();
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.SuccessorsFunction
    /* renamed from: d */
    public Set<N> mo11982d(N n) {
        return mo12003p().mo11982d((BaseGraph<N>) n);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    /* renamed from: e */
    public Set<N> mo11991e() {
        return mo12003p().mo11991e();
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    /* renamed from: f */
    public int mo11983f(N n) {
        return mo12003p().mo11983f(n);
    }

    @Override // com.google.common.graph.BaseGraph
    /* renamed from: g */
    public Set<N> mo11992g(N n) {
        return mo12003p().mo11992g(n);
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    /* renamed from: h */
    public int mo11984h(N n) {
        return mo12003p().mo11984h(n);
    }

    @Override // com.google.common.graph.BaseGraph
    /* renamed from: i */
    public Set<N> mo11993i(N n) {
        return mo12003p().mo11993i(n);
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    /* renamed from: j */
    public int mo11985j(N n) {
        return mo12003p().mo11985j(n);
    }

    @Override // com.google.common.graph.AbstractBaseGraph
    /* renamed from: n */
    public long mo11986n() {
        return mo12003p().mo11981a().size();
    }

    /* renamed from: p */
    public abstract BaseGraph<N> mo12003p();
}
