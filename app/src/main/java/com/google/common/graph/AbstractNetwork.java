package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p000a.C0000a;

@Beta
/* loaded from: classes.dex */
public abstract class AbstractNetwork<N, E> implements Network<N, E> {

    /* renamed from: com.google.common.graph.AbstractNetwork$1 */
    class C18271 extends AbstractGraph<Object> {

        /* renamed from: com.google.common.graph.AbstractNetwork$1$1, reason: invalid class name */
        public class AnonymousClass1 extends AbstractSet<EndpointPair<Object>> {

            /* renamed from: b */
            public final /* synthetic */ C18271 f21683b;

            /* renamed from: com.google.common.graph.AbstractNetwork$1$1$1, reason: invalid class name and collision with other inner class name */
            public class C69941 implements Function<Object, EndpointPair<Object>> {

                /* renamed from: b */
                public final /* synthetic */ AnonymousClass1 f21684b;

                @Override // com.google.common.base.Function
                public EndpointPair<Object> apply(Object obj) {
                    Objects.requireNonNull(this.f21684b.f21683b);
                    throw null;
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@NullableDecl Object obj) {
                if (!(obj instanceof EndpointPair)) {
                    return false;
                }
                if (!this.f21683b.m11987o((EndpointPair) obj)) {
                    return false;
                }
                Objects.requireNonNull(this.f21683b);
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<EndpointPair<Object>> iterator() {
                Objects.requireNonNull(this.f21683b);
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Objects.requireNonNull(this.f21683b);
                throw null;
            }
        }

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

        @Override // com.google.common.graph.BaseGraph
        /* renamed from: g */
        public Set<Object> mo11992g(Object obj) {
            throw null;
        }

        @Override // com.google.common.graph.BaseGraph
        /* renamed from: i */
        public Set<Object> mo11993i(Object obj) {
            throw null;
        }

        @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.SuccessorsFunction
        /* renamed from: d */
        public Set<Object> mo11982d(Object obj) {
            throw null;
        }
    }

    /* renamed from: com.google.common.graph.AbstractNetwork$2 */
    class C18282 implements Predicate<Object> {
        @Override // com.google.common.base.Predicate
        public boolean apply(Object obj) {
            throw null;
        }
    }

    /* renamed from: n */
    public static <N, E> Map<E, EndpointPair<N>> m11988n(final Network<N, E> network) {
        return Maps.m11785b(network.mo12004a(), new Function<E, EndpointPair<N>>() { // from class: com.google.common.graph.AbstractNetwork.3
            @Override // com.google.common.base.Function
            public Object apply(Object obj) {
                return Network.this.mo12009l(obj);
            }
        });
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Network)) {
            return false;
        }
        Network network = (Network) obj;
        if (mo12005b() == network.mo12005b() && mo12007e().equals(network.mo12007e())) {
            if (((AbstractMap) m11988n(this)).equals(m11988n(network))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractMap) m11988n(this)).hashCode();
    }

    public String toString() {
        boolean mo12005b = mo12005b();
        boolean mo12008k = mo12008k();
        boolean mo12006c = mo12006c();
        String valueOf = String.valueOf(mo12007e());
        String valueOf2 = String.valueOf(m11988n(this));
        StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 87);
        sb.append("isDirected: ");
        sb.append(mo12005b);
        sb.append(", allowsParallelEdges: ");
        sb.append(mo12008k);
        sb.append(", allowsSelfLoops: ");
        sb.append(mo12006c);
        sb.append(", nodes: ");
        sb.append(valueOf);
        return C0000a.m20q(sb, ", edges: ", valueOf2);
    }
}
