package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;

/* renamed from: com.yandex.mobile.ads.impl.x1 */
/* loaded from: classes3.dex */
public final class C6002x1 {

    /* renamed from: a */
    @NonNull
    private final je1 f56319a;

    /* renamed from: com.yandex.mobile.ads.impl.x1$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56320a;

        static {
            int[] iArr = new int[InstreamAdBreakPosition.Type.values().length];
            f56320a = iArr;
            try {
                iArr[InstreamAdBreakPosition.Type.MILLISECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56320a[InstreamAdBreakPosition.Type.PERCENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56320a[InstreamAdBreakPosition.Type.POSITION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C6002x1(@NonNull je1 je1Var) {
        this.f56319a = je1Var;
    }

    /* renamed from: a */
    public final long m29623a(@NonNull InstreamAdBreakPosition instreamAdBreakPosition) {
        long value = instreamAdBreakPosition.getValue();
        int i2 = a.f56320a[instreamAdBreakPosition.getPositionType().ordinal()];
        if (i2 == 1) {
            return value;
        }
        if (i2 == 2) {
            if (value == 100) {
                return Long.MIN_VALUE;
            }
            if (value == 0) {
                return 0L;
            }
            long m25878a = this.f56319a.m25878a();
            if (m25878a != -9223372036854775807L) {
                return (long) ((value / 100.0f) * m25878a);
            }
        }
        return -1L;
    }
}
