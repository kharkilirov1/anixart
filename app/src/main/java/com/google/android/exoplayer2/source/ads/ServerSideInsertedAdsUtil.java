package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.source.MediaPeriodId;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;

/* loaded from: classes.dex */
public final class ServerSideInsertedAdsUtil {
    /* renamed from: a */
    public static long m6951a(long j2, MediaPeriodId mediaPeriodId, AdPlaybackState adPlaybackState) {
        return mediaPeriodId.m6828a() ? m6952b(j2, mediaPeriodId.f12357b, mediaPeriodId.f12358c, adPlaybackState) : m6953c(j2, mediaPeriodId.f12360e, adPlaybackState);
    }

    /* renamed from: b */
    public static long m6952b(long j2, int i2, int i3, AdPlaybackState adPlaybackState) {
        int i4;
        AdPlaybackState.AdGroup m6925b = adPlaybackState.m6925b(i2);
        long j3 = j2 - m6925b.f12609b;
        int i5 = adPlaybackState.f12606f;
        while (true) {
            if (i5 >= i2) {
                break;
            }
            AdPlaybackState.AdGroup m6925b2 = adPlaybackState.m6925b(i5);
            int i6 = 0;
            while (true) {
                int i7 = adPlaybackState.m6925b(i5).f12610c;
                if (i7 == -1) {
                    i7 = 0;
                }
                if (i6 < i7) {
                    j3 -= m6925b2.f12613f[i6];
                    i6++;
                }
            }
            j3 += m6925b2.f12614g;
            i5++;
        }
        int i8 = adPlaybackState.m6925b(i2).f12610c;
        if (i8 == -1) {
            i8 = 0;
        }
        if (i3 < i8) {
            for (i4 = 0; i4 < i3; i4++) {
                j3 -= m6925b.f12613f[i4];
            }
        }
        return j3;
    }

    /* renamed from: c */
    public static long m6953c(long j2, int i2, AdPlaybackState adPlaybackState) {
        if (i2 == -1) {
            i2 = adPlaybackState.f12603c;
        }
        long j3 = 0;
        for (int i3 = adPlaybackState.f12606f; i3 < i2; i3++) {
            AdPlaybackState.AdGroup m6925b = adPlaybackState.m6925b(i3);
            long j4 = m6925b.f12609b;
            if (j4 == Long.MIN_VALUE || j4 > j2 - j3) {
                break;
            }
            int i4 = 0;
            while (true) {
                int i5 = adPlaybackState.m6925b(i3).f12610c;
                if (i5 == -1) {
                    i5 = 0;
                }
                if (i4 >= i5) {
                    break;
                }
                j3 += m6925b.f12613f[i4];
                i4++;
            }
            long j5 = m6925b.f12614g;
            j3 -= j5;
            long j6 = m6925b.f12609b;
            long j7 = j2 - j3;
            if (j5 + j6 > j7) {
                return Math.max(j6, j7);
            }
        }
        return j2 - j3;
    }

    /* renamed from: d */
    public static long m6954d(long j2, MediaPeriodId mediaPeriodId, AdPlaybackState adPlaybackState) {
        if (mediaPeriodId.m6828a()) {
            int i2 = mediaPeriodId.f12357b;
            int i3 = mediaPeriodId.f12358c;
            AdPlaybackState.AdGroup m6925b = adPlaybackState.m6925b(i2);
            long j3 = j2 + m6925b.f12609b;
            for (int i4 = adPlaybackState.f12606f; i4 < i2; i4++) {
                AdPlaybackState.AdGroup m6925b2 = adPlaybackState.m6925b(i4);
                int i5 = 0;
                while (true) {
                    int i6 = adPlaybackState.m6925b(i4).f12610c;
                    if (i6 == -1) {
                        i6 = 0;
                    }
                    if (i5 < i6) {
                        j3 += m6925b2.f12613f[i5];
                        i5++;
                    }
                }
                j3 -= m6925b2.f12614g;
            }
            int i7 = adPlaybackState.m6925b(i2).f12610c;
            if (i7 == -1) {
                i7 = 0;
            }
            if (i3 >= i7) {
                return j3;
            }
            for (int i8 = 0; i8 < i3; i8++) {
                j3 += m6925b.f12613f[i8];
            }
            return j3;
        }
        int i9 = mediaPeriodId.f12360e;
        if (i9 == -1) {
            i9 = adPlaybackState.f12603c;
        }
        long j4 = 0;
        for (int i10 = adPlaybackState.f12606f; i10 < i9; i10++) {
            AdPlaybackState.AdGroup m6925b3 = adPlaybackState.m6925b(i10);
            long j5 = m6925b3.f12609b;
            if (j5 == Long.MIN_VALUE || j5 > j2) {
                break;
            }
            long j6 = j5 + j4;
            int i11 = 0;
            while (true) {
                int i12 = adPlaybackState.m6925b(i10).f12610c;
                if (i12 == -1) {
                    i12 = 0;
                }
                if (i11 >= i12) {
                    break;
                }
                j4 += m6925b3.f12613f[i11];
                i11++;
            }
            long j7 = m6925b3.f12614g;
            j4 -= j7;
            if (m6925b3.f12609b + j7 > j2) {
                return Math.max(j6, j2 + j4);
            }
        }
        return j2 + j4;
    }
}
