package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RatingBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.nativeads.Rating;

/* loaded from: classes3.dex */
public class yt0 extends RatingBar implements Rating {
    public yt0(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    @Override // android.widget.RatingBar, com.yandex.mobile.ads.nativeads.Rating
    public final float getRating() {
        return super.getRating();
    }

    @Override // android.widget.RatingBar, com.yandex.mobile.ads.nativeads.Rating
    public void setRating(float f2) {
        super.setRating(f2);
    }

    public yt0(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public yt0(@NonNull Context context) {
        super(context);
    }
}
