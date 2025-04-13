package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    public ViewOffsetHelper f17459a;

    /* renamed from: b */
    public int f17460b;

    public ViewOffsetBehavior() {
        this.f17460b = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: h */
    public boolean mo1499h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i2) {
        mo9792t(coordinatorLayout, v, i2);
        if (this.f17459a == null) {
            this.f17459a = new ViewOffsetHelper(v);
        }
        ViewOffsetHelper viewOffsetHelper = this.f17459a;
        viewOffsetHelper.f17462b = viewOffsetHelper.f17461a.getTop();
        viewOffsetHelper.f17463c = viewOffsetHelper.f17461a.getLeft();
        this.f17459a.m9797a();
        int i3 = this.f17460b;
        if (i3 == 0) {
            return true;
        }
        this.f17459a.m9798b(i3);
        this.f17460b = 0;
        return true;
    }

    /* renamed from: s */
    public int m9795s() {
        ViewOffsetHelper viewOffsetHelper = this.f17459a;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.f17464d;
        }
        return 0;
    }

    /* renamed from: t */
    public void mo9792t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i2) {
        coordinatorLayout.m1486u(v, i2);
    }

    /* renamed from: u */
    public boolean m9796u(int i2) {
        ViewOffsetHelper viewOffsetHelper = this.f17459a;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.m9798b(i2);
        }
        this.f17460b = i2;
        return false;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17460b = 0;
    }
}
