package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class wi0 implements View.OnTouchListener, View.OnClickListener {

    /* renamed from: a */
    @NonNull
    private final ViewOnTouchListenerC5639qh f56137a;

    /* renamed from: b */
    @NonNull
    private final ii0 f56138b = ii0.m25538a();

    public wi0(@NonNull Context context, @NonNull View.OnClickListener onClickListener) {
        this.f56137a = new ViewOnTouchListenerC5639qh(context, onClickListener);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        this.f56137a.onClick(view);
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f56138b.m25542b(view, motionEvent);
        return this.f56137a.onTouch(view, motionEvent);
    }
}
