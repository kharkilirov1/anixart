package com.yandex.mobile.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.impl.b61;

/* loaded from: classes2.dex */
public class CallToActionView extends Button {

    /* renamed from: a */
    @Nullable
    private CharSequence f48267a;

    public CallToActionView(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    /* renamed from: a */
    private static Drawable m22333a(@NonNull Context context, int i2) {
        return ContextCompat.m1671d(context, i2);
    }

    @Override // android.widget.TextView
    @Nullable
    public final CharSequence getText() {
        return this.f48267a;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (charSequence instanceof String) {
            this.f48267a = charSequence;
        }
        super.setText(this.f48267a, TextView.BufferType.SPANNABLE);
    }

    public CallToActionView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void m22334a() {
        setSpannableFactory(Spannable.Factory.getInstance());
        setText(this.f48267a);
    }

    @SuppressLint
    public CallToActionView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int i3;
        int i4 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4632R.styleable.YandexAdsInternalIconButton, i2, 0);
            int resourceId = obtainStyledAttributes.getResourceId(C4632R.styleable.YandexAdsInternalIconButton_yandex_icon, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C4632R.styleable.YandexAdsInternalIconButton_yandex_icon_size, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(C4632R.styleable.YandexAdsInternalIconButton_yandex_icon_offset, 0);
            obtainStyledAttributes.recycle();
            r0 = resourceId != 0 ? m22333a(context, resourceId) : null;
            i3 = dimensionPixelSize2;
            i4 = dimensionPixelSize;
        } else {
            i3 = 0;
        }
        setSpannableFactory(new b61(r0, i4, i3));
    }
}
