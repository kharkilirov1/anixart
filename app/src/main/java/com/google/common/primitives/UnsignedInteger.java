package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes2.dex */
public final class UnsignedInteger extends Number implements Comparable<UnsignedInteger> {

    /* renamed from: b */
    public final int f21976b;

    static {
        new UnsignedInteger(0);
        new UnsignedInteger(1);
        new UnsignedInteger(-1);
    }

    public UnsignedInteger(int i2) {
        this.f21976b = i2 & (-1);
    }

    @Override // java.lang.Comparable
    public int compareTo(UnsignedInteger unsignedInteger) {
        UnsignedInteger unsignedInteger2 = unsignedInteger;
        Objects.requireNonNull(unsignedInteger2);
        return Ints.m12081c(this.f21976b ^ Integer.MIN_VALUE, unsignedInteger2.f21976b ^ Integer.MIN_VALUE);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return longValue();
    }

    public boolean equals(@NullableDecl Object obj) {
        return (obj instanceof UnsignedInteger) && this.f21976b == ((UnsignedInteger) obj).f21976b;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return longValue();
    }

    public int hashCode() {
        return this.f21976b;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.f21976b;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f21976b & 4294967295L;
    }

    public String toString() {
        return Long.toString(this.f21976b & 4294967295L, 10);
    }
}
