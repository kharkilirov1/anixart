package com.yandex.mobile.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.impl.C4975dl;
import com.yandex.mobile.ads.impl.C5805tj;
import com.yandex.mobile.ads.impl.ea0;
import com.yandex.mobile.ads.impl.f11;
import com.yandex.mobile.ads.impl.fa0;
import com.yandex.mobile.ads.impl.ga0;

/* loaded from: classes2.dex */
public class ExtendedViewContainer extends FrameLayout {

    /* renamed from: a */
    @NonNull
    private final C4975dl f48272a;

    /* renamed from: b */
    @NonNull
    private final ga0 f48273b;

    /* renamed from: c */
    @NonNull
    private ga0 f48274c;

    public ExtendedViewContainer(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    /* renamed from: a */
    private C5805tj m22335a(float f2, float f3) {
        return new C5805tj(new fa0(this, f2), new ea0(this, f3));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.f48272a.m23904a(canvas);
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        ga0.C5115a mo22622a = this.f48274c.mo22622a(i2, i3);
        super.onMeasure(mo22622a.f50538a, mo22622a.f50539b);
        this.f48272a.m23903a();
    }

    public void setMeasureSpecProvider(@NonNull ga0 ga0Var) {
        this.f48274c = new C5805tj(this.f48273b, ga0Var);
        requestLayout();
        invalidate();
    }

    public ExtendedViewContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint
    public ExtendedViewContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int i3;
        int i4;
        int i5;
        int i6;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4632R.styleable.YandexAdsInternalExtendedViewContainer, i2, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C4632R.styleable.YandexAdsInternalExtendedViewContainer_yandex_corner_radius, 0);
            i4 = obtainStyledAttributes.getDimensionPixelSize(C4632R.styleable.f47622xd97899c4, dimensionPixelSize);
            i5 = obtainStyledAttributes.getDimensionPixelSize(C4632R.styleable.f47623xd226f699, dimensionPixelSize);
            i6 = obtainStyledAttributes.getDimensionPixelSize(C4632R.styleable.f47621x2df9c8db, dimensionPixelSize);
            i3 = obtainStyledAttributes.getDimensionPixelSize(C4632R.styleable.f47620x26c17742, dimensionPixelSize);
            this.f48273b = m22335a(obtainStyledAttributes.getFloat(C4632R.styleable.YandexAdsInternalExtendedViewContainer_yandex_max_screen_width, 1.0f), obtainStyledAttributes.getFloat(C4632R.styleable.YandexAdsInternalExtendedViewContainer_yandex_max_screen_height, 1.0f));
            obtainStyledAttributes.recycle();
        } else {
            this.f48273b = new f11();
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        this.f48274c = this.f48273b;
        this.f48272a = new C4975dl(this, i4, i5, i6, i3);
        setWillNotDraw(false);
    }
}
