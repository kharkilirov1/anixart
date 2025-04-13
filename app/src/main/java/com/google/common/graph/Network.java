package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Set;

@DoNotMock
@Beta
/* loaded from: classes.dex */
public interface Network<N, E> extends SuccessorsFunction<N>, PredecessorsFunction<N> {
    /* renamed from: a */
    Set<E> mo12004a();

    /* renamed from: b */
    boolean mo12005b();

    /* renamed from: c */
    boolean mo12006c();

    @Override // com.google.common.graph.SuccessorsFunction
    /* renamed from: d */
    Set<N> mo11982d(N n);

    /* renamed from: e */
    Set<N> mo12007e();

    /* renamed from: k */
    boolean mo12008k();

    /* renamed from: l */
    EndpointPair<N> mo12009l(E e2);
}
