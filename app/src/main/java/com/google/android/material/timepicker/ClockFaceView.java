package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.C1195R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.timepicker.ClockHandView;
import com.swiftsoft.anixartd.C2507R;
import java.util.Arrays;

/* loaded from: classes.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.OnRotateListener {

    /* renamed from: A */
    public final SparseArray<TextView> f19174A;

    /* renamed from: B */
    public final AccessibilityDelegateCompat f19175B;

    /* renamed from: C */
    public final int[] f19176C;

    /* renamed from: D */
    public final float[] f19177D;

    /* renamed from: E */
    public final int f19178E;

    /* renamed from: F */
    public final int f19179F;

    /* renamed from: G */
    public final int f19180G;

    /* renamed from: H */
    public final int f19181H;

    /* renamed from: I */
    public String[] f19182I;

    /* renamed from: J */
    public float f19183J;

    /* renamed from: K */
    public final ColorStateList f19184K;

    /* renamed from: w */
    public final ClockHandView f19185w;

    /* renamed from: x */
    public final Rect f19186x;

    /* renamed from: y */
    public final RectF f19187y;

    /* renamed from: z */
    public final Rect f19188z;

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, C2507R.attr.materialClockStyle);
        this.f19186x = new Rect();
        this.f19187y = new RectF();
        this.f19188z = new Rect();
        this.f19174A = new SparseArray<>();
        this.f19177D = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1195R.styleable.f17325j, C2507R.attr.materialClockStyle, C2507R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList m10240a = MaterialResources.m10240a(context, obtainStyledAttributes, 1);
        this.f19184K = m10240a;
        LayoutInflater.from(context).inflate(C2507R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C2507R.id.material_clock_hand);
        this.f19185w = clockHandView;
        this.f19178E = resources.getDimensionPixelSize(C2507R.dimen.material_clock_hand_padding);
        int colorForState = m10240a.getColorForState(new int[]{R.attr.state_selected}, m10240a.getDefaultColor());
        this.f19176C = new int[]{colorForState, colorForState, m10240a.getDefaultColor()};
        clockHandView.f19199i.add(this);
        int defaultColor = AppCompatResources.m496a(context, C2507R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList m10240a2 = MaterialResources.m10240a(context, obtainStyledAttributes, 0);
        setBackgroundColor(m10240a2 != null ? m10240a2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.timepicker.ClockFaceView.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (!ClockFaceView.this.isShown()) {
                    return true;
                }
                ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                int height = ClockFaceView.this.getHeight() / 2;
                ClockFaceView clockFaceView = ClockFaceView.this;
                int i2 = (height - clockFaceView.f19185w.f19200j) - clockFaceView.f19178E;
                if (i2 != clockFaceView.f19238u) {
                    clockFaceView.f19238u = i2;
                    clockFaceView.mo10539t();
                    ClockHandView clockHandView2 = clockFaceView.f19185w;
                    clockHandView2.f19209s = clockFaceView.f19238u;
                    clockHandView2.invalidate();
                }
                return true;
            }
        });
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f19175B = new AccessibilityDelegateCompat() { // from class: com.google.android.material.timepicker.ClockFaceView.2
            {
                View.AccessibilityDelegate accessibilityDelegate = AccessibilityDelegateCompat.f3569c;
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            /* renamed from: d */
            public void mo2044d(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                this.f3570a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f3743a);
                int intValue = ((Integer) view.getTag(C2507R.id.material_value_index)).intValue();
                if (intValue > 0) {
                    accessibilityNodeInfoCompat.m2515u(ClockFaceView.this.f19174A.get(intValue - 1));
                }
                accessibilityNodeInfoCompat.m2512r(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.m2519a(0, 1, intValue, 1, false, view.isSelected()));
                accessibilityNodeInfoCompat.f3743a.setClickable(true);
                accessibilityNodeInfoCompat.m2497a(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3748g);
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            /* renamed from: g */
            public boolean mo2047g(View view, int i2, Bundle bundle) {
                if (i2 != 16) {
                    return super.mo2047g(view, i2, bundle);
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                view.getHitRect(ClockFaceView.this.f19186x);
                float centerX = ClockFaceView.this.f19186x.centerX();
                float centerY = ClockFaceView.this.f19186x.centerY();
                ClockFaceView.this.f19185w.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
                ClockFaceView.this.f19185w.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
                return true;
            }
        };
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        m10541v(strArr, 0);
        this.f19179F = resources.getDimensionPixelSize(C2507R.dimen.material_time_picker_minimum_screen_height);
        this.f19180G = resources.getDimensionPixelSize(C2507R.dimen.material_time_picker_minimum_screen_width);
        this.f19181H = resources.getDimensionPixelSize(C2507R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    /* renamed from: b */
    public void mo10538b(float f2, boolean z) {
        if (Math.abs(this.f19183J - f2) > 0.001f) {
            this.f19183J = f2;
            m10540u();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new AccessibilityNodeInfoCompat(accessibilityNodeInfo).m2511q(AccessibilityNodeInfoCompat.CollectionInfoCompat.m2518a(1, this.f19182I.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        m10540u();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f19181H / Math.max(Math.max(this.f19179F / displayMetrics.heightPixels, this.f19180G / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    /* renamed from: t */
    public void mo10539t() {
        super.mo10539t();
        for (int i2 = 0; i2 < this.f19174A.size(); i2++) {
            this.f19174A.get(i2).setVisibility(0);
        }
    }

    /* renamed from: u */
    public final void m10540u() {
        RectF rectF = this.f19185w.f19203m;
        float f2 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i2 = 0; i2 < this.f19174A.size(); i2++) {
            TextView textView2 = this.f19174A.get(i2);
            if (textView2 != null) {
                textView2.getHitRect(this.f19186x);
                this.f19187y.set(this.f19186x);
                this.f19187y.union(rectF);
                float height = this.f19187y.height() * this.f19187y.width();
                if (height < f2) {
                    textView = textView2;
                    f2 = height;
                }
            }
        }
        for (int i3 = 0; i3 < this.f19174A.size(); i3++) {
            TextView textView3 = this.f19174A.get(i3);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(this.f19186x);
                this.f19187y.set(this.f19186x);
                textView3.getLineBounds(0, this.f19188z);
                RectF rectF2 = this.f19187y;
                Rect rect = this.f19188z;
                rectF2.inset(rect.left, rect.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF, this.f19187y) ? null : new RadialGradient(rectF.centerX() - this.f19187y.left, rectF.centerY() - this.f19187y.top, 0.5f * rectF.width(), this.f19176C, this.f19177D, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    /* renamed from: v */
    public void m10541v(String[] strArr, @StringRes int i2) {
        this.f19182I = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f19174A.size();
        boolean z = false;
        for (int i3 = 0; i3 < Math.max(this.f19182I.length, size); i3++) {
            TextView textView = this.f19174A.get(i3);
            if (i3 >= this.f19182I.length) {
                removeView(textView);
                this.f19174A.remove(i3);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(C2507R.layout.material_clockface_textview, (ViewGroup) this, false);
                    this.f19174A.put(i3, textView);
                    addView(textView);
                }
                textView.setText(this.f19182I[i3]);
                textView.setTag(C2507R.id.material_value_index, Integer.valueOf(i3));
                int i4 = (i3 / 12) + 1;
                textView.setTag(C2507R.id.material_clock_level, Integer.valueOf(i4));
                if (i4 > 1) {
                    z = true;
                }
                ViewCompat.m2196e0(textView, this.f19175B);
                textView.setTextColor(this.f19184K);
                if (i2 != 0) {
                    textView.setContentDescription(getResources().getString(i2, this.f19182I[i3]));
                }
            }
        }
        ClockHandView clockHandView = this.f19185w;
        if (clockHandView.f19198h && !z) {
            clockHandView.f19210t = 1;
        }
        clockHandView.f19198h = z;
        clockHandView.invalidate();
    }
}
