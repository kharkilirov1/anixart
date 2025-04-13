package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.TextureView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ga0;

@SuppressLint
/* loaded from: classes3.dex */
public final class sl0 extends FrameLayout {

    /* renamed from: a */
    @Nullable
    private el0 f54751a;

    /* renamed from: b */
    @NonNull
    private ga0 f54752b;

    /* renamed from: c */
    @NonNull
    private final te1 f54753c;

    /* renamed from: d */
    @NonNull
    private final TextureView f54754d;

    /* renamed from: e */
    @NonNull
    private final rk0 f54755e;

    public sl0(@NonNull Context context, @NonNull te1 te1Var, @NonNull TextureView textureView, @NonNull rk0 rk0Var) {
        super(context);
        this.f54751a = null;
        this.f54753c = te1Var;
        this.f54754d = textureView;
        this.f54755e = rk0Var;
        this.f54752b = new f11();
    }

    @NonNull
    /* renamed from: a */
    public final rk0 m28319a() {
        return this.f54755e;
    }

    @NonNull
    /* renamed from: b */
    public final te1 m28320b() {
        return this.f54753c;
    }

    @NonNull
    /* renamed from: c */
    public final TextureView m28321c() {
        return this.f54754d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        el0 el0Var = this.f54751a;
        if (el0Var != null) {
            ((al0) el0Var).m22541a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        el0 el0Var = this.f54751a;
        if (el0Var != null) {
            ((al0) el0Var).m22542b();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        ga0.C5115a mo22622a = this.f54752b.mo22622a(i2, i3);
        super.onMeasure(mo22622a.f50538a, mo22622a.f50539b);
    }

    public void setAspectRatio(float f2) {
        this.f54752b = new at0(f2);
    }

    public void setOnAttachStateChangeListener(@Nullable el0 el0Var) {
        this.f54751a = el0Var;
    }
}
