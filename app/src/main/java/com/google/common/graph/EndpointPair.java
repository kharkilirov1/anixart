package com.google.common.graph;

import androidx.room.util.C0576a;
import com.google.common.annotations.Beta;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.Immutable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable
@Beta
/* loaded from: classes.dex */
public abstract class EndpointPair<N> implements Iterable<N> {

    /* renamed from: b */
    public final N f21709b;

    /* renamed from: c */
    public final N f21710c;

    public static final class Ordered<N> extends EndpointPair<N> {
        public Ordered(Object obj, Object obj2, C18421 c18421) {
            super(obj, obj2, null);
        }

        @Override // com.google.common.graph.EndpointPair
        /* renamed from: b */
        public boolean mo11998b() {
            return true;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair endpointPair = (EndpointPair) obj;
            return true == endpointPair.mo11998b() && this.f21709b.equals(endpointPair.mo12000f()) && this.f21710c.equals(endpointPair.mo12001g());
        }

        @Override // com.google.common.graph.EndpointPair
        /* renamed from: f */
        public N mo12000f() {
            return this.f21709b;
        }

        @Override // com.google.common.graph.EndpointPair
        /* renamed from: g */
        public N mo12001g() {
            return this.f21710c;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f21709b, this.f21710c});
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return iterator();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f21709b);
            String valueOf2 = String.valueOf(this.f21710c);
            StringBuilder m4122u = C0576a.m4122u(valueOf2.length() + valueOf.length() + 6, "<", valueOf, " -> ", valueOf2);
            m4122u.append(">");
            return m4122u.toString();
        }
    }

    public static final class Unordered<N> extends EndpointPair<N> {
        public Unordered(Object obj, Object obj2, C18421 c18421) {
            super(obj, obj2, null);
        }

        @Override // com.google.common.graph.EndpointPair
        /* renamed from: b */
        public boolean mo11998b() {
            return false;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair endpointPair = (EndpointPair) obj;
            if (endpointPair.mo11998b()) {
                return false;
            }
            return this.f21709b.equals(endpointPair.f21709b) ? this.f21710c.equals(endpointPair.f21710c) : this.f21709b.equals(endpointPair.f21710c) && this.f21710c.equals(endpointPair.f21709b);
        }

        @Override // com.google.common.graph.EndpointPair
        /* renamed from: f */
        public N mo12000f() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        @Override // com.google.common.graph.EndpointPair
        /* renamed from: g */
        public N mo12001g() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        public int hashCode() {
            return this.f21710c.hashCode() + this.f21709b.hashCode();
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return iterator();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f21709b);
            String valueOf2 = String.valueOf(this.f21710c);
            StringBuilder m4122u = C0576a.m4122u(valueOf2.length() + valueOf.length() + 4, "[", valueOf, ", ", valueOf2);
            m4122u.append("]");
            return m4122u.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EndpointPair(Object obj, Object obj2, C18421 c18421) {
        Objects.requireNonNull(obj);
        this.f21709b = obj;
        Objects.requireNonNull(obj2);
        this.f21710c = obj2;
    }

    /* renamed from: e */
    public static <N> EndpointPair<N> m11996e(N n, N n2) {
        return new Ordered(n, n2, null);
    }

    /* renamed from: r */
    public static <N> EndpointPair<N> m11997r(N n, N n2) {
        return new Unordered(n2, n, null);
    }

    /* renamed from: b */
    public abstract boolean mo11998b();

    @Override // java.lang.Iterable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final UnmodifiableIterator<N> iterator() {
        return Iterators.m11713h(this.f21709b, this.f21710c);
    }

    /* renamed from: f */
    public abstract N mo12000f();

    /* renamed from: g */
    public abstract N mo12001g();
}
