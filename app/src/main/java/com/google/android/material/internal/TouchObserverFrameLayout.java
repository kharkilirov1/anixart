package com.google.android.material.internal;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
public class TouchObserverFrameLayout extends FrameLayout {

    /* renamed from: b */
    @Nullable
    public View.OnTouchListener f18362b;

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.f18362b;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnTouchListener(@Nullable View.OnTouchListener onTouchListener) {
        this.f18362b = onTouchListener;
    }
}
