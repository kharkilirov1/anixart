package com.google.android.material.dialog;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
public class InsetDialogOnTouchListener implements View.OnTouchListener {

    /* renamed from: b */
    @NonNull
    public final Dialog f18065b;

    /* renamed from: c */
    public final int f18066c;

    /* renamed from: d */
    public final int f18067d;

    /* renamed from: e */
    public final int f18068e;

    public InsetDialogOnTouchListener(@NonNull Dialog dialog, @NonNull Rect rect) {
        this.f18065b = dialog;
        this.f18066c = rect.left;
        this.f18067d = rect.top;
        this.f18068e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f18066c;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f18067d, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i2 = this.f18068e;
            obtain.setLocation((-i2) - 1, (-i2) - 1);
        }
        view.performClick();
        return this.f18065b.onTouchEvent(obtain);
    }
}
