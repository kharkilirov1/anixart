package com.yandex.mobile.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.impl.C4975dl;

/* loaded from: classes2.dex */
public class RoundImageView extends ImageView {

    /* renamed from: a */
    @NonNull
    private final C4975dl f48275a;

    public RoundImageView(@NonNull Context context) {
        this(context, null, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        this.f48275a.m23904a(canvas);
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.f48275a.m23903a();
    }

    public RoundImageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint
    public RoundImageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        float f2;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4632R.styleable.YandexAdsInternalRoundImageView, i2, 0);
            f2 = obtainStyledAttributes.getDimensionPixelSize(C4632R.styleable.YandexAdsInternalRoundImageView_yandex_corner_radius, 0);
            obtainStyledAttributes.recycle();
        } else {
            f2 = 0.0f;
        }
        this.f48275a = new C4975dl(this, f2);
    }
}
