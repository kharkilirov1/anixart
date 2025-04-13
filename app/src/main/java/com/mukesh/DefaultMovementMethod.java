package com.mukesh;

import android.text.Selection;
import android.text.Spannable;
import android.text.method.MovementMethod;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;

/* loaded from: classes2.dex */
class DefaultMovementMethod implements MovementMethod {

    /* renamed from: a */
    public static DefaultMovementMethod f24518a;

    @Override // android.text.method.MovementMethod
    public boolean canSelectArbitrarily() {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public void initialize(TextView textView, Spannable spannable) {
        Selection.setSelection(spannable, 0);
    }

    @Override // android.text.method.MovementMethod
    public boolean onGenericMotionEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public boolean onKeyDown(TextView textView, Spannable spannable, int i2, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public boolean onKeyOther(TextView textView, Spannable spannable, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public boolean onKeyUp(TextView textView, Spannable spannable, int i2, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public void onTakeFocus(TextView textView, Spannable spannable, int i2) {
    }

    @Override // android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public boolean onTrackballEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        return false;
    }
}
