package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.math.MathUtils;

/* loaded from: classes.dex */
public interface CircularRevealWidget extends CircularRevealHelper.Delegate {

    public static class CircularRevealEvaluator implements TypeEvaluator<RevealInfo> {

        /* renamed from: b */
        public static final TypeEvaluator<RevealInfo> f17875b = new CircularRevealEvaluator();

        /* renamed from: a */
        public final RevealInfo f17876a = new RevealInfo(null);

        @Override // android.animation.TypeEvaluator
        @NonNull
        public RevealInfo evaluate(float f2, @NonNull RevealInfo revealInfo, @NonNull RevealInfo revealInfo2) {
            RevealInfo revealInfo3 = revealInfo;
            RevealInfo revealInfo4 = revealInfo2;
            RevealInfo revealInfo5 = this.f17876a;
            float m10181c = MathUtils.m10181c(revealInfo3.f17879a, revealInfo4.f17879a, f2);
            float m10181c2 = MathUtils.m10181c(revealInfo3.f17880b, revealInfo4.f17880b, f2);
            float m10181c3 = MathUtils.m10181c(revealInfo3.f17881c, revealInfo4.f17881c, f2);
            revealInfo5.f17879a = m10181c;
            revealInfo5.f17880b = m10181c2;
            revealInfo5.f17881c = m10181c3;
            return this.f17876a;
        }
    }

    public static class CircularRevealProperty extends Property<CircularRevealWidget, RevealInfo> {

        /* renamed from: a */
        public static final Property<CircularRevealWidget, RevealInfo> f17877a = new CircularRevealProperty("circularReveal");

        public CircularRevealProperty(String str) {
            super(RevealInfo.class, str);
        }

        @Override // android.util.Property
        @Nullable
        public RevealInfo get(@NonNull CircularRevealWidget circularRevealWidget) {
            return circularRevealWidget.getRevealInfo();
        }

        @Override // android.util.Property
        public void set(@NonNull CircularRevealWidget circularRevealWidget, @Nullable RevealInfo revealInfo) {
            circularRevealWidget.setRevealInfo(revealInfo);
        }
    }

    public static class CircularRevealScrimColorProperty extends Property<CircularRevealWidget, Integer> {

        /* renamed from: a */
        public static final Property<CircularRevealWidget, Integer> f17878a = new CircularRevealScrimColorProperty("circularRevealScrimColor");

        public CircularRevealScrimColorProperty(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        @NonNull
        public Integer get(@NonNull CircularRevealWidget circularRevealWidget) {
            return Integer.valueOf(circularRevealWidget.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public void set(@NonNull CircularRevealWidget circularRevealWidget, @NonNull Integer num) {
            circularRevealWidget.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class RevealInfo {

        /* renamed from: a */
        public float f17879a;

        /* renamed from: b */
        public float f17880b;

        /* renamed from: c */
        public float f17881c;

        public RevealInfo() {
        }

        public RevealInfo(C12531 c12531) {
        }

        public RevealInfo(float f2, float f3, float f4) {
            this.f17879a = f2;
            this.f17880b = f3;
            this.f17881c = f4;
        }
    }

    /* renamed from: a */
    void mo9965a();

    /* renamed from: b */
    void mo9966b();

    @ColorInt
    int getCircularRevealScrimColor();

    @Nullable
    RevealInfo getRevealInfo();

    void setCircularRevealOverlayDrawable(@Nullable Drawable drawable);

    void setCircularRevealScrimColor(@ColorInt int i2);

    void setRevealInfo(@Nullable RevealInfo revealInfo);
}
