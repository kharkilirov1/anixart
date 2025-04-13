package com.yandex.div.internal.viewpool;

import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;

/* compiled from: ProfilingSession.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ProfilingSessionKt {
    @VisibleForTesting
    /* renamed from: a */
    public static final long m17405a(long j2) {
        long j3;
        long j4;
        long j5;
        if (j2 < 0) {
            return 0L;
        }
        long j6 = 100;
        if (j2 >= 100) {
            if (j2 < 1000) {
                j3 = j2 / 100;
            } else {
                j6 = 2000;
                if (j2 < 2000) {
                    j4 = 200;
                    j5 = j2 / 200;
                } else if (j2 < 5000) {
                    j4 = 500;
                    j5 = j2 / 500;
                } else {
                    if (j2 < 10000) {
                        return (j2 / 1000) * 1000;
                    }
                    if (j2 >= 20000) {
                        if (j2 < 50000) {
                            return (j2 / 5000) * 5000;
                        }
                        return 50000L;
                    }
                    j3 = j2 / 2000;
                }
            }
            return j3 * j6;
        }
        j4 = 20;
        j5 = j2 / 20;
        return j4 * j5;
    }
}
