package com.yandex.mobile.ads.nativeads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.impl.kf1;

/* loaded from: classes3.dex */
public class CustomizableMediaView extends FrameLayout {

    /* renamed from: e */
    @LayoutRes
    private static final int f57597e = C4632R.layout.yandex_ads_internal_outstream_controls_default;

    /* renamed from: a */
    @LayoutRes
    private int f57598a;

    /* renamed from: b */
    @Nullable
    private final int f57599b;

    /* renamed from: c */
    private int f57600c;

    /* renamed from: d */
    private int f57601d;

    public CustomizableMediaView(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final int m30443a() {
        return this.f57598a;
    }

    @Nullable
    /* renamed from: b */
    public final int m30444b() {
        return this.f57599b;
    }

    public int getHeightMeasureSpec() {
        return this.f57601d;
    }

    public int getWidthMeasureSpec() {
        return this.f57600c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.f57600c = i2;
        this.f57601d = i3;
    }

    public void setVideoControls(@LayoutRes int i2) {
        this.f57598a = i2;
    }

    public CustomizableMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint
    public CustomizableMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4632R.styleable.YandexAdsInternalMediaView);
            this.f57598a = obtainStyledAttributes.getResourceId(C4632R.styleable.YandexAdsInternalMediaView_yandex_video_controls_layout, f57597e);
            this.f57599b = kf1.m26118a(obtainStyledAttributes);
            obtainStyledAttributes.recycle();
            return;
        }
        this.f57598a = f57597e;
        this.f57599b = 0;
    }
}
