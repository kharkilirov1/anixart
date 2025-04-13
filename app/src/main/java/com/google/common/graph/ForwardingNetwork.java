package com.google.common.graph;

import java.util.Set;

/* loaded from: classes.dex */
abstract class ForwardingNetwork<N, E> extends AbstractNetwork<N, E> {
    @Override // com.google.common.graph.Network
    /* renamed from: a */
    public Set<E> mo12004a() {
        return mo12010o().mo12004a();
    }

    @Override // com.google.common.graph.Network
    /* renamed from: b */
    public boolean mo12005b() {
        return mo12010o().mo12005b();
    }

    @Override // com.google.common.graph.Network
    /* renamed from: c */
    public boolean mo12006c() {
        return mo12010o().mo12006c();
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.SuccessorsFunction
    /* renamed from: d */
    public Set<N> mo11982d(N n) {
        return mo12010o().mo11982d((Network<N, E>) n);
    }

    @Override // com.google.common.graph.Network
    /* renamed from: e */
    public Set<N> mo12007e() {
        return mo12010o().mo12007e();
    }

    @Override // com.google.common.graph.Network
    /* renamed from: k */
    public boolean mo12008k() {
        return mo12010o().mo12008k();
    }

    @Override // com.google.common.graph.Network
    /* renamed from: l */
    public EndpointPair<N> mo12009l(E e2) {
        return mo12010o().mo12009l(e2);
    }

    /* renamed from: o */
    public abstract Network<N, E> mo12010o();
}
