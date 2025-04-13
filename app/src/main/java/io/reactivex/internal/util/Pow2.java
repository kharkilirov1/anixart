package io.reactivex.internal.util;

/* loaded from: classes3.dex */
public final class Pow2 {
    public Pow2() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static int m31840a(int i2) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i2 - 1));
    }
}
