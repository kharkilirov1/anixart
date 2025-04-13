package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public class AtomicDouble extends Number {

    /* renamed from: b */
    public transient AtomicLong f22131b = new AtomicLong(Double.doubleToRawLongBits(0.0d));

    /* renamed from: a */
    public final double m12173a() {
        return Double.longBitsToDouble(this.f22131b.get());
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return m12173a();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) m12173a();
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) m12173a();
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) m12173a();
    }

    public String toString() {
        return Double.toString(m12173a());
    }
}
