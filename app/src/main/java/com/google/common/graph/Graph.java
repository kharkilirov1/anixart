package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Set;

@DoNotMock
@Beta
/* loaded from: classes.dex */
public interface Graph<N> extends BaseGraph<N> {
    @Override // com.google.common.graph.BaseGraph
    /* renamed from: a */
    Set<EndpointPair<N>> mo11981a();

    /* renamed from: b */
    boolean mo11989b();

    /* renamed from: c */
    boolean mo11990c();

    /* renamed from: e */
    Set<N> mo11991e();
}
