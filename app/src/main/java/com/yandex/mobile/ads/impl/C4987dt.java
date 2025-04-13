package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.dt */
/* loaded from: classes3.dex */
public final class C4987dt implements e70 {

    /* renamed from: a */
    @Nullable
    private final RectF f49735a;

    /* renamed from: b */
    private final int f49736b;

    public C4987dt(int i2, @Nullable RectF rectF) {
        this.f49736b = i2;
        this.f49735a = rectF;
    }

    @Override // com.yandex.mobile.ads.impl.e70
    @NonNull
    /* renamed from: a */
    public final String mo23814a() {
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.f49736b);
        RectF rectF = this.f49735a;
        objArr[1] = rectF != null ? String.format("{x:%s,y:%s,width:%s,height:%s}", Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.width()), Float.valueOf(rectF.height())) : null;
        return String.format("exposure:{exposedPercentage:%s,visibleRectangle:%s,occlusionRectangles:[]}", objArr);
    }
}
