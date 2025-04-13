package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
abstract class EndpointPairIterator<N> extends AbstractIterator<EndpointPair<N>> {

    /* renamed from: d */
    public final BaseGraph<N> f21711d;

    /* renamed from: e */
    public final Iterator<N> f21712e;

    /* renamed from: f */
    public N f21713f = null;

    /* renamed from: g */
    public Iterator<N> f21714g = ImmutableSet.m11671C().iterator();

    public static final class Directed<N> extends EndpointPairIterator<N> {
        public Directed(BaseGraph baseGraph, C18431 c18431) {
            super(baseGraph, null);
        }

        @Override // com.google.common.collect.AbstractIterator
        /* renamed from: a */
        public Object mo11332a() {
            while (!this.f21714g.hasNext()) {
                if (!m12002c()) {
                    m11333b();
                    return null;
                }
            }
            return EndpointPair.m11996e(this.f21713f, this.f21714g.next());
        }
    }

    public static final class Undirected<N> extends EndpointPairIterator<N> {

        /* renamed from: h */
        public Set<N> f21715h;

        public Undirected(BaseGraph baseGraph, C18431 c18431) {
            super(baseGraph, null);
            this.f21715h = Sets.m11889g(baseGraph.mo11991e().size());
        }

        @Override // com.google.common.collect.AbstractIterator
        /* renamed from: a */
        public Object mo11332a() {
            while (true) {
                if (this.f21714g.hasNext()) {
                    N next = this.f21714g.next();
                    if (!this.f21715h.contains(next)) {
                        return EndpointPair.m11997r(this.f21713f, next);
                    }
                } else {
                    this.f21715h.add(this.f21713f);
                    if (!m12002c()) {
                        this.f21715h = null;
                        m11333b();
                        return null;
                    }
                }
            }
        }
    }

    public EndpointPairIterator(BaseGraph baseGraph, C18431 c18431) {
        this.f21711d = baseGraph;
        this.f21712e = baseGraph.mo11991e().iterator();
    }

    /* renamed from: c */
    public final boolean m12002c() {
        Preconditions.m11191o(!this.f21714g.hasNext());
        if (!this.f21712e.hasNext()) {
            return false;
        }
        N next = this.f21712e.next();
        this.f21713f = next;
        this.f21714g = this.f21711d.mo11982d((BaseGraph<N>) next).iterator();
        return true;
    }
}
