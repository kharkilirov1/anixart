package kotlin.internal;

import kotlin.Metadata;
import kotlin.UnsignedKt;

/* compiled from: UProgressionUtil.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-stdlib"}, m31885k = 2, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class UProgressionUtilKt {
    /* renamed from: a */
    public static final int m32135a(int i2, int i3, int i4) {
        long j2 = i4 & 4294967295L;
        int i5 = (int) ((i2 & 4294967295L) % j2);
        int i6 = (int) ((i3 & 4294967295L) % j2);
        int m31900a = UnsignedKt.m31900a(i5, i6);
        int i7 = i5 - i6;
        return m31900a >= 0 ? i7 : i7 + i4;
    }

    /* renamed from: b */
    public static final long m32136b(long j2, long j3, long j4) {
        long m31902c = UnsignedKt.m31902c(j2, j4);
        long m31902c2 = UnsignedKt.m31902c(j3, j4);
        int m31901b = UnsignedKt.m31901b(m31902c, m31902c2);
        long j5 = m31902c - m31902c2;
        return m31901b >= 0 ? j5 : j5 + j4;
    }
}
