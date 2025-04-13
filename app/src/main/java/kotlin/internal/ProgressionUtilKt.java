package kotlin.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;

/* compiled from: progressionUtil.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-stdlib"}, m31885k = 2, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class ProgressionUtilKt {
    @PublishedApi
    /* renamed from: a */
    public static final int m32132a(int i2, int i3, int i4) {
        if (i4 > 0) {
            return i2 >= i3 ? i3 : i3 - m32133b(m32133b(i3, i4) - m32133b(i2, i4), i4);
        }
        if (i4 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i2 <= i3) {
            return i3;
        }
        int i5 = -i4;
        return i3 + m32133b(m32133b(i2, i5) - m32133b(i3, i5), i5);
    }

    /* renamed from: b */
    public static final int m32133b(int i2, int i3) {
        int i4 = i2 % i3;
        return i4 >= 0 ? i4 : i4 + i3;
    }

    /* renamed from: c */
    public static final long m32134c(long j2, long j3) {
        long j4 = j2 % j3;
        return j4 >= 0 ? j4 : j4 + j3;
    }
}
