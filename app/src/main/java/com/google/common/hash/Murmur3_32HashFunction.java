package com.google.common.hash;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable
/* loaded from: classes.dex */
final class Murmur3_32HashFunction extends AbstractHashFunction implements Serializable {

    /* renamed from: b */
    public final int f21799b;

    @CanIgnoreReturnValue
    public static final class Murmur3_32Hasher extends AbstractHasher {
    }

    static {
        int i2 = Hashing.f21780a;
    }

    public boolean equals(@NullableDecl Object obj) {
        return (obj instanceof Murmur3_32HashFunction) && this.f21799b == ((Murmur3_32HashFunction) obj).f21799b;
    }

    public int hashCode() {
        return Murmur3_32HashFunction.class.hashCode() ^ this.f21799b;
    }

    public String toString() {
        int i2 = this.f21799b;
        StringBuilder sb = new StringBuilder(31);
        sb.append("Hashing.murmur3_32(");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
