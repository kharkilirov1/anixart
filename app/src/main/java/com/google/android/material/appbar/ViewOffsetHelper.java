package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
class ViewOffsetHelper {

    /* renamed from: a */
    public final View f17461a;

    /* renamed from: b */
    public int f17462b;

    /* renamed from: c */
    public int f17463c;

    /* renamed from: d */
    public int f17464d;

    /* renamed from: e */
    public int f17465e;

    public ViewOffsetHelper(View view) {
        this.f17461a = view;
    }

    /* renamed from: a */
    public void m9797a() {
        View view = this.f17461a;
        ViewCompat.m2179S(view, this.f17464d - (view.getTop() - this.f17462b));
        View view2 = this.f17461a;
        ViewCompat.m2178R(view2, this.f17465e - (view2.getLeft() - this.f17463c));
    }

    /* renamed from: b */
    public boolean m9798b(int i2) {
        if (this.f17464d == i2) {
            return false;
        }
        this.f17464d = i2;
        m9797a();
        return true;
    }
}
