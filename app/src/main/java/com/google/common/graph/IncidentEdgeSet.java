package com.google.common.graph;

import java.util.AbstractSet;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
abstract class IncidentEdgeSet<N> extends AbstractSet<EndpointPair<N>> {

    /* renamed from: b */
    public final N f21723b;

    /* renamed from: c */
    public final BaseGraph<N> f21724c;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        if (!(obj instanceof EndpointPair)) {
            return false;
        }
        EndpointPair endpointPair = (EndpointPair) obj;
        if (this.f21724c.mo11989b()) {
            if (!endpointPair.mo11998b()) {
                return false;
            }
            Object mo12000f = endpointPair.mo12000f();
            Object mo12001g = endpointPair.mo12001g();
            return (this.f21723b.equals(mo12000f) && this.f21724c.mo11982d((BaseGraph<N>) this.f21723b).contains(mo12001g)) || (this.f21723b.equals(mo12001g) && this.f21724c.mo11992g(this.f21723b).contains(mo12000f));
        }
        if (endpointPair.mo11998b()) {
            return false;
        }
        Set<N> mo11993i = this.f21724c.mo11993i(this.f21723b);
        N n = endpointPair.f21709b;
        N n2 = endpointPair.f21710c;
        return (this.f21723b.equals(n2) && mo11993i.contains(n)) || (this.f21723b.equals(n) && mo11993i.contains(n2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f21724c.mo11989b() ? (this.f21724c.mo11985j(this.f21723b) + this.f21724c.mo11984h(this.f21723b)) - (this.f21724c.mo11982d((BaseGraph<N>) this.f21723b).contains(this.f21723b) ? 1 : 0) : this.f21724c.mo11993i(this.f21723b).size();
    }
}
