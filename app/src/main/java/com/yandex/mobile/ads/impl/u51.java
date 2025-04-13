package com.yandex.mobile.ads.impl;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class u51<T extends TextView> implements InterfaceC4962d9<T> {

    /* renamed from: a */
    @NonNull
    private final ArgbEvaluator f55403a = new ArgbEvaluator();

    /* renamed from: b */
    @Nullable
    private ValueAnimator f55404b;

    /* renamed from: c */
    private final int f55405c;

    /* renamed from: com.yandex.mobile.ads.impl.u51$a */
    public static class C5845a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        @NonNull
        private final TextView f55406a;

        public C5845a(@NonNull TextView textView) {
            this.f55406a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue instanceof Integer) {
                this.f55406a.setTextColor(((Integer) animatedValue).intValue());
            }
        }
    }

    public u51(@ColorInt int i2) {
        this.f55405c = i2;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4962d9
    /* renamed from: a */
    public final void mo23834a(@NonNull View view) {
        TextView textView = (TextView) view;
        ValueAnimator ofObject = ValueAnimator.ofObject(this.f55403a, Integer.valueOf(textView.getCurrentTextColor()), Integer.valueOf(this.f55405c));
        this.f55404b = ofObject;
        ofObject.addUpdateListener(new C5845a(textView));
        this.f55404b.setDuration(500);
        this.f55404b.start();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4962d9
    public final void cancel() {
        ValueAnimator valueAnimator = this.f55404b;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.f55404b.cancel();
        }
    }
}
