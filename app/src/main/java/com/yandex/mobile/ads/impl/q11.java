package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.SizeInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class q11 {

    /* renamed from: a */
    @Nullable
    private SizeInfo f53910a;

    @Nullable
    /* renamed from: a */
    public final SizeInfo m27600a() {
        return this.f53910a;
    }

    /* renamed from: a */
    public final void m27601a(@Nullable SizeInfo sizeInfo) {
        if (sizeInfo == null) {
            e60.m24037c("Ad size can't be null or empty.", new Object[0]);
            return;
        }
        SizeInfo sizeInfo2 = this.f53910a;
        if (sizeInfo2 == null || Intrinsics.m32174c(sizeInfo2, sizeInfo)) {
            this.f53910a = sizeInfo;
        } else {
            e60.m24037c("Ad size can't be set twice.", new Object[0]);
        }
    }
}
