package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes2.dex */
public final class UnsignedLong extends Number implements Comparable<UnsignedLong> {

    /* renamed from: b */
    public final long f21979b;

    static {
        new UnsignedLong(0L);
        new UnsignedLong(1L);
        new UnsignedLong(-1L);
    }

    public UnsignedLong(long j2) {
        this.f21979b = j2;
    }

    @Override // java.lang.Comparable
    public int compareTo(UnsignedLong unsignedLong) {
        UnsignedLong unsignedLong2 = unsignedLong;
        Objects.requireNonNull(unsignedLong2);
        return UnsignedLongs.m12092a(this.f21979b, unsignedLong2.f21979b);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        long j2 = this.f21979b;
        double d = Long.MAX_VALUE & j2;
        return j2 < 0 ? d + 9.223372036854776E18d : d;
    }

    public boolean equals(@NullableDecl Object obj) {
        return (obj instanceof UnsignedLong) && this.f21979b == ((UnsignedLong) obj).f21979b;
    }

    @Override // java.lang.Number
    public float floatValue() {
        long j2 = this.f21979b;
        float f2 = Long.MAX_VALUE & j2;
        return j2 < 0 ? f2 + 9.223372E18f : f2;
    }

    public int hashCode() {
        return Longs.m12088c(this.f21979b);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.f21979b;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f21979b;
    }

    public String toString() {
        long j2 = this.f21979b;
        if (j2 == 0) {
            return "0";
        }
        if (j2 > 0) {
            return Long.toString(j2, 10);
        }
        char[] cArr = new char[64];
        long j3 = (j2 >>> 1) / 5;
        long j4 = 10;
        int i2 = 63;
        cArr[63] = Character.forDigit((int) (j2 - (j3 * j4)), 10);
        while (j3 > 0) {
            i2--;
            cArr[i2] = Character.forDigit((int) (j3 % j4), 10);
            j3 /= j4;
        }
        return new String(cArr, i2, 64 - i2);
    }
}
