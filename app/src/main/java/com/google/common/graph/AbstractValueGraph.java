package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.collect.Maps;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p000a.C0000a;

@Beta
/* loaded from: classes.dex */
public abstract class AbstractValueGraph<N, V> extends AbstractBaseGraph<N> implements ValueGraph<N, V> {

    /* renamed from: com.google.common.graph.AbstractValueGraph$1 */
    class C18301 extends AbstractGraph<Object> {
        @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        /* renamed from: a */
        public Set<EndpointPair<Object>> mo11981a() {
            throw null;
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        /* renamed from: b */
        public boolean mo11989b() {
            throw null;
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        /* renamed from: c */
        public boolean mo11990c() {
            throw null;
        }

        @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.SuccessorsFunction
        /* renamed from: d */
        public Iterable mo11982d(Object obj) {
            throw null;
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        /* renamed from: e */
        public Set<Object> mo11991e() {
            throw null;
        }

        @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        /* renamed from: f */
        public int mo11983f(Object obj) {
            throw null;
        }

        @Override // com.google.common.graph.BaseGraph
        /* renamed from: g */
        public Set<Object> mo11992g(Object obj) {
            throw null;
        }

        @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        /* renamed from: h */
        public int mo11984h(Object obj) {
            throw null;
        }

        @Override // com.google.common.graph.BaseGraph
        /* renamed from: i */
        public Set<Object> mo11993i(Object obj) {
            throw null;
        }

        @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        /* renamed from: j */
        public int mo11985j(Object obj) {
            throw null;
        }

        @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.SuccessorsFunction
        /* renamed from: d */
        public Set<Object> mo11982d(Object obj) {
            throw null;
        }
    }

    /* renamed from: p */
    public static <N, V> Map<EndpointPair<N>, V> m11994p(final ValueGraph<N, V> valueGraph) {
        return Maps.m11785b(valueGraph.mo11981a(), new Function<EndpointPair<N>, V>() { // from class: com.google.common.graph.AbstractValueGraph.2
            @Override // com.google.common.base.Function
            public Object apply(Object obj) {
                EndpointPair endpointPair = (EndpointPair) obj;
                return ValueGraph.this.mo12011m(endpointPair.f21709b, endpointPair.f21710c, null);
            }
        });
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ValueGraph)) {
            return false;
        }
        ValueGraph valueGraph = (ValueGraph) obj;
        if (mo11989b() == valueGraph.mo11989b() && mo11991e().equals(valueGraph.mo11991e())) {
            if (((AbstractMap) m11994p(this)).equals(m11994p(valueGraph))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractMap) m11994p(this)).hashCode();
    }

    public String toString() {
        boolean mo11989b = mo11989b();
        boolean mo11990c = mo11990c();
        String valueOf = String.valueOf(mo11991e());
        String valueOf2 = String.valueOf(m11994p(this));
        StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 59);
        sb.append("isDirected: ");
        sb.append(mo11989b);
        sb.append(", allowsSelfLoops: ");
        sb.append(mo11990c);
        return C0000a.m22s(sb, ", nodes: ", valueOf, ", edges: ", valueOf2);
    }
}
