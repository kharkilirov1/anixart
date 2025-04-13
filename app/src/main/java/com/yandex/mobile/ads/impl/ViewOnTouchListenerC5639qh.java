package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import kotlin.KotlinVersion;

/* renamed from: com.yandex.mobile.ads.impl.qh */
/* loaded from: classes3.dex */
public final class ViewOnTouchListenerC5639qh implements View.OnTouchListener, View.OnClickListener {

    /* renamed from: a */
    @NonNull
    private final View.OnClickListener f54047a;

    /* renamed from: b */
    private final int f54048b;

    /* renamed from: c */
    private boolean f54049c;

    /* renamed from: d */
    private float f54050d;

    /* renamed from: e */
    private float f54051e;

    public ViewOnTouchListenerC5639qh(@NonNull Context context, @NonNull View.OnClickListener onClickListener) {
        this.f54047a = onClickListener;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f54048b = scaledTouchSlop * scaledTouchSlop;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        this.f54047a.onClick(view);
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int i2 = action & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i2 == 0) {
            this.f54050d = x;
            this.f54051e = y;
            this.f54049c = true;
        } else {
            if (i2 == 1) {
                if (!this.f54049c) {
                    return true;
                }
                this.f54047a.onClick(view);
                return true;
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    this.f54049c = false;
                }
            } else if (this.f54049c) {
                int i3 = (int) (x - this.f54050d);
                int i4 = (int) (y - this.f54051e);
                if ((i4 * i4) + (i3 * i3) > this.f54048b) {
                    this.f54049c = false;
                }
            }
        }
        return false;
    }
}
