package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.nativeads.Rating;

/* loaded from: classes3.dex */
public final class zt0 extends FrameLayout implements Rating {

    /* renamed from: a */
    private float f57319a;

    public zt0(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f57319a = 0.0f;
    }

    @Override // com.yandex.mobile.ads.nativeads.Rating
    public final float getRating() {
        return this.f57319a;
    }

    @Override // com.yandex.mobile.ads.nativeads.Rating
    public void setRating(float f2) {
        this.f57319a = f2;
    }

    public zt0(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57319a = 0.0f;
    }

    public zt0(@NonNull Context context) {
        super(context);
        this.f57319a = 0.0f;
    }
}
