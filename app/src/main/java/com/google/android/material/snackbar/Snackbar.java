package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarManager;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: B */
    public static final int[] f18859B = {C2507R.attr.snackbarButtonStyle, C2507R.attr.snackbarTextViewStyle};

    /* renamed from: A */
    public boolean f18860A;

    /* renamed from: z */
    @Nullable
    public final AccessibilityManager f18861z;

    public static class Callback extends BaseTransientBottomBar.BaseCallback<Snackbar> {
    }

    @RestrictTo
    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.widget.FrameLayout, android.view.View
        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(@Nullable Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@Nullable Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    public Snackbar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull ContentViewCallback contentViewCallback) {
        super(context, viewGroup, view, contentViewCallback);
        this.f18861z = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    @NonNull
    /* renamed from: j */
    public static Snackbar m10377j(@NonNull View view, @NonNull CharSequence charSequence, int i2) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f18859B);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate((resourceId == -1 || resourceId2 == -1) ? false : true ? C2507R.layout.mtrl_layout_snackbar_include : C2507R.layout.design_layout_snackbar_include, viewGroup, false);
        Snackbar snackbar = new Snackbar(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) snackbar.f18817i.getChildAt(0)).getMessageView().setText(charSequence);
        snackbar.f18819k = i2;
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: a */
    public void mo10364a() {
        m10365b(3);
    }

    /* renamed from: i */
    public int m10378i() {
        int i2 = this.f18819k;
        if (i2 == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f18861z.getRecommendedTimeoutMillis(i2, (this.f18860A ? 4 : 0) | 1 | 2);
        }
        if (this.f18860A && this.f18861z.isTouchExplorationEnabled()) {
            return -2;
        }
        return i2;
    }

    @NonNull
    @CanIgnoreReturnValue
    /* renamed from: k */
    public Snackbar m10379k(@Nullable CharSequence charSequence, @Nullable View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.f18817i.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence)) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.f18860A = false;
        } else {
            this.f18860A = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new ViewOnClickListenerC1394a(this, onClickListener, 0));
        }
        return this;
    }

    /* renamed from: l */
    public void m10380l() {
        SnackbarManager m10382b = SnackbarManager.m10382b();
        int m10378i = m10378i();
        SnackbarManager.Callback callback = this.f18827s;
        synchronized (m10382b.f18867a) {
            if (m10382b.m10384c(callback)) {
                SnackbarManager.SnackbarRecord snackbarRecord = m10382b.f18869c;
                snackbarRecord.f18873b = m10378i;
                m10382b.f18868b.removeCallbacksAndMessages(snackbarRecord);
                m10382b.m10388g(m10382b.f18869c);
                return;
            }
            if (m10382b.m10385d(callback)) {
                m10382b.f18870d.f18873b = m10378i;
            } else {
                m10382b.f18870d = new SnackbarManager.SnackbarRecord(m10378i, callback);
            }
            SnackbarManager.SnackbarRecord snackbarRecord2 = m10382b.f18869c;
            if (snackbarRecord2 == null || !m10382b.m10383a(snackbarRecord2, 4)) {
                m10382b.f18869c = null;
                m10382b.m10389h();
            }
        }
    }
}
