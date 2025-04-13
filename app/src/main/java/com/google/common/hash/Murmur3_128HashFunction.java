package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable
/* loaded from: classes.dex */
final class Murmur3_128HashFunction extends AbstractHashFunction implements Serializable {

    /* renamed from: c */
    public static final HashFunction f21797c = new Murmur3_128HashFunction(0);

    /* renamed from: b */
    public final int f21798b;

    public static final class Murmur3_128Hasher extends AbstractStreamingHasher {
    }

    static {
        int i2 = Hashing.f21780a;
    }

    public Murmur3_128HashFunction(int i2) {
        this.f21798b = i2;
    }

    public boolean equals(@NullableDecl Object obj) {
        return (obj instanceof Murmur3_128HashFunction) && this.f21798b == ((Murmur3_128HashFunction) obj).f21798b;
    }

    public int hashCode() {
        return Murmur3_128HashFunction.class.hashCode() ^ this.f21798b;
    }

    public String toString() {
        int i2 = this.f21798b;
        StringBuilder sb = new StringBuilder(32);
        sb.append("Hashing.murmur3_128(");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
