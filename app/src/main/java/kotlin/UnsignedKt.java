package kotlin;

import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnsignedUtils.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-stdlib"}, m31885k = 2, m31886mv = {1, 7, 1})
@JvmName
/* loaded from: classes3.dex */
public final class UnsignedKt {
    @PublishedApi
    /* renamed from: a */
    public static final int m31900a(int i2, int i3) {
        return Intrinsics.m32181j(i2 ^ Integer.MIN_VALUE, i3 ^ Integer.MIN_VALUE);
    }

    @PublishedApi
    /* renamed from: b */
    public static final int m31901b(long j2, long j3) {
        return Intrinsics.m32182k(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE);
    }

    @PublishedApi
    /* renamed from: c */
    public static final long m31902c(long j2, long j3) {
        if (j3 < 0) {
            return m31901b(j2, j3) < 0 ? j2 : j2 - j3;
        }
        if (j2 >= 0) {
            return j2 % j3;
        }
        long j4 = j2 - ((((j2 >>> 1) / j3) << 1) * j3);
        if (m31901b(j4, j3) < 0) {
            j3 = 0;
        }
        return j4 - j3;
    }
}
