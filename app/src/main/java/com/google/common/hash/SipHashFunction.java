package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable
/* loaded from: classes.dex */
final class SipHashFunction extends AbstractHashFunction implements Serializable {

    /* renamed from: b */
    public final int f21800b;

    /* renamed from: c */
    public final int f21801c;

    /* renamed from: d */
    public final long f21802d;

    /* renamed from: e */
    public final long f21803e;

    public static final class SipHasher extends AbstractStreamingHasher {
    }

    static {
        new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);
    }

    public SipHashFunction(int i2, int i3, long j2, long j3) {
        Preconditions.m11181e(i2 > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", i2);
        Preconditions.m11181e(i3 > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", i3);
        this.f21800b = i2;
        this.f21801c = i3;
        this.f21802d = j2;
        this.f21803e = j3;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof SipHashFunction)) {
            return false;
        }
        SipHashFunction sipHashFunction = (SipHashFunction) obj;
        return this.f21800b == sipHashFunction.f21800b && this.f21801c == sipHashFunction.f21801c && this.f21802d == sipHashFunction.f21802d && this.f21803e == sipHashFunction.f21803e;
    }

    public int hashCode() {
        return (int) ((((SipHashFunction.class.hashCode() ^ this.f21800b) ^ this.f21801c) ^ this.f21802d) ^ this.f21803e);
    }

    public String toString() {
        int i2 = this.f21800b;
        int i3 = this.f21801c;
        long j2 = this.f21802d;
        long j3 = this.f21803e;
        StringBuilder sb = new StringBuilder(81);
        sb.append("Hashing.sipHash");
        sb.append(i2);
        sb.append(i3);
        sb.append("(");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(")");
        return sb.toString();
    }
}
