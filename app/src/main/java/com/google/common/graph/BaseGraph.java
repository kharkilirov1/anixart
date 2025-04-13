package com.google.common.graph;

import java.util.Set;

/* loaded from: classes.dex */
interface BaseGraph<N> extends SuccessorsFunction<N>, PredecessorsFunction<N> {
    /* renamed from: a */
    Set<EndpointPair<N>> mo11981a();

    /* renamed from: b */
    boolean mo11989b();

    /* renamed from: c */
    boolean mo11990c();

    @Override // com.google.common.graph.SuccessorsFunction
    /* renamed from: d */
    Set<N> mo11982d(N n);

    /* renamed from: e */
    Set<N> mo11991e();

    /* renamed from: f */
    int mo11983f(N n);

    /* renamed from: g */
    Set<N> mo11992g(N n);

    /* renamed from: h */
    int mo11984h(N n);

    /* renamed from: i */
    Set<N> mo11993i(N n);

    /* renamed from: j */
    int mo11985j(N n);
}
