package com.google.common.graph;

import com.google.common.annotations.Beta;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p000a.C0000a;

@Beta
/* loaded from: classes.dex */
public abstract class AbstractGraph<N> extends AbstractBaseGraph<N> implements Graph<N> {
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Graph)) {
            return false;
        }
        Graph graph = (Graph) obj;
        return mo11989b() == graph.mo11989b() && mo11991e().equals(graph.mo11991e()) && mo11981a().equals(graph.mo11981a());
    }

    public final int hashCode() {
        return mo11981a().hashCode();
    }

    public String toString() {
        boolean mo11989b = mo11989b();
        boolean mo11990c = mo11990c();
        String valueOf = String.valueOf(mo11991e());
        String valueOf2 = String.valueOf(mo11981a());
        StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 59);
        sb.append("isDirected: ");
        sb.append(mo11989b);
        sb.append(", allowsSelfLoops: ");
        sb.append(mo11990c);
        return C0000a.m22s(sb, ", nodes: ", valueOf, ", edges: ", valueOf2);
    }
}
