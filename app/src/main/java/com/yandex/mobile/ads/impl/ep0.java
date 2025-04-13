package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes3.dex */
public class ep0 extends IOException {

    /* renamed from: a */
    public final boolean f50031a;

    /* renamed from: b */
    public final int f50032b;

    public ep0(@Nullable String str, @Nullable Exception exc, boolean z, int i2) {
        super(str, exc);
        this.f50031a = z;
        this.f50032b = i2;
    }

    /* renamed from: a */
    public static ep0 m24226a(@Nullable String str, @Nullable IllegalArgumentException illegalArgumentException) {
        return new ep0(str, illegalArgumentException, true, 0);
    }

    /* renamed from: a */
    public static ep0 m24225a(@Nullable String str, @Nullable Exception exc) {
        return new ep0(str, exc, true, 1);
    }

    /* renamed from: a */
    public static ep0 m24224a(@Nullable String str) {
        return new ep0(str, null, false, 1);
    }
}
