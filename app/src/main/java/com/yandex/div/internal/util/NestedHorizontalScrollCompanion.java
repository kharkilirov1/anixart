package com.yandex.div.internal.util;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes2.dex */
public class NestedHorizontalScrollCompanion {

    /* renamed from: a */
    public final View f33889a;

    /* renamed from: b */
    public boolean f33890b;

    /* renamed from: c */
    public final float f33891c;

    /* renamed from: d */
    public float f33892d;

    /* renamed from: e */
    public float f33893e;

    public class NestedScrollPageChangeListener extends ViewPager.SimpleOnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        /* renamed from: c */
        public void mo4344c(int i2, float f2, int i3) {
            throw null;
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        /* renamed from: d */
        public void mo4345d(int i2) {
        }
    }

    public NestedHorizontalScrollCompanion(@NonNull View view) {
        float scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f33889a = view;
        ViewCompat.m2222r0(view, true);
        this.f33891c = scaledTouchSlop;
    }

    /* renamed from: a */
    public void m17392a(boolean z) {
        if (this.f33890b && z) {
            ViewCompat.m2199g(this.f33889a, 0, 0, 1, 0, null);
        }
    }

    /* renamed from: b */
    public void m17393b(@NonNull MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f33892d = motionEvent.getX();
            this.f33893e = motionEvent.getY();
            return;
        }
        if (action != 1) {
            if (action == 2) {
                float abs = Math.abs(motionEvent.getX() - this.f33892d);
                float abs2 = Math.abs(motionEvent.getY() - this.f33893e);
                if (this.f33890b || abs < this.f33891c || abs <= abs2) {
                    return;
                }
                this.f33890b = true;
                ViewCompat.m2160B0(this.f33889a, 1);
                return;
            }
            if (action != 3) {
                return;
            }
        }
        this.f33890b = false;
        ViewCompat.m2162C0(this.f33889a);
    }

    public NestedHorizontalScrollCompanion(@NonNull ViewPager viewPager) {
        float scaledTouchSlop = ViewConfiguration.get(viewPager.getContext()).getScaledTouchSlop();
        this.f33889a = viewPager;
        ViewCompat.m2222r0(viewPager, true);
        this.f33891c = scaledTouchSlop;
    }
}
