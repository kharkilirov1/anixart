package com.google.common.graph;

import com.google.common.annotations.Beta;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
/* loaded from: classes.dex */
public interface ValueGraph<N, V> extends BaseGraph<N> {
    @Override // com.google.common.graph.BaseGraph
    /* renamed from: a */
    Set<EndpointPair<N>> mo11981a();

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    /* renamed from: b */
    boolean mo11989b();

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    /* renamed from: c */
    boolean mo11990c();

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
    /* renamed from: d */
    Set<N> mo11982d(N n);

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    /* renamed from: e */
    Set<N> mo11991e();

    @Override // com.google.common.graph.BaseGraph
    /* renamed from: f */
    int mo11983f(N n);

    @Override // com.google.common.graph.BaseGraph
    /* renamed from: g */
    Set<N> mo11992g(N n);

    @Override // com.google.common.graph.BaseGraph
    /* renamed from: h */
    int mo11984h(N n);

    @Override // com.google.common.graph.BaseGraph
    /* renamed from: i */
    Set<N> mo11993i(N n);

    @Override // com.google.common.graph.BaseGraph
    /* renamed from: j */
    int mo11985j(N n);

    @NullableDecl
    /* renamed from: m */
    V mo12011m(N n, N n2, @NullableDecl V v);
}
