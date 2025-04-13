package com.yandex.mobile.ads.impl;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class b61 extends Spannable.Factory {

    /* renamed from: a */
    @Nullable
    private final Drawable f48768a;

    /* renamed from: b */
    private final int f48769b;

    /* renamed from: c */
    private final int f48770c;

    public b61(@Nullable Drawable drawable, int i2, int i3) {
        this.f48768a = drawable;
        this.f48769b = i2;
        this.f48770c = i3;
    }

    @Override // android.text.Spannable.Factory
    public final Spannable newSpannable(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.f48768a != null && this.f48769b > 0) {
            spannableStringBuilder.append((CharSequence) "  ");
            Drawable drawable = this.f48768a;
            int i2 = this.f48769b;
            drawable.setBounds(0, 0, i2, i2);
            C5381l8 c5381l8 = new C5381l8(drawable);
            ColorDrawable colorDrawable = new ColorDrawable(0);
            int i3 = this.f48770c;
            colorDrawable.setBounds(0, 0, i3, i3);
            C5381l8 c5381l82 = new C5381l8(colorDrawable);
            spannableStringBuilder.setSpan(c5381l8, 0, 1, 33);
            spannableStringBuilder.setSpan(c5381l82, 1, 2, 33);
        }
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }
}
