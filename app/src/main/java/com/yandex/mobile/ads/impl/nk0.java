package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.nativeads.NativeAdType;

/* loaded from: classes3.dex */
public final class nk0 {

    /* renamed from: com.yandex.mobile.ads.impl.nk0$a */
    public static /* synthetic */ class C5500a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53026a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f53027b;

        static {
            int[] iArr = new int[NativeAdType.values().length];
            f53027b = iArr;
            try {
                iArr[NativeAdType.APP_INSTALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53027b[NativeAdType.CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53027b[NativeAdType.MEDIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[C5782t5.m28465b(3).length];
            f53026a = iArr2;
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53026a[0] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53026a[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public static int m26921a(@NonNull NativeAdType nativeAdType) {
        int i2 = C5500a.f53027b[nativeAdType.ordinal()];
        if (i2 != 1) {
            return (i2 == 2 || i2 != 3) ? 1 : 3;
        }
        return 2;
    }
}
