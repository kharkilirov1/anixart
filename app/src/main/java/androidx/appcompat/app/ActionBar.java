package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0055R;
import androidx.appcompat.view.ActionMode;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public abstract class ActionBar {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface DisplayOptions {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface NavigationMode {
    }

    public interface OnMenuVisibilityListener {
        /* renamed from: a */
        void m348a(boolean z);
    }

    @Deprecated
    public interface OnNavigationListener {
    }

    @Deprecated
    public static abstract class Tab {
        /* renamed from: a */
        public abstract CharSequence mo349a();

        /* renamed from: b */
        public abstract View mo350b();

        /* renamed from: c */
        public abstract Drawable mo351c();

        /* renamed from: d */
        public abstract CharSequence mo352d();

        /* renamed from: e */
        public abstract void mo353e();
    }

    @Deprecated
    public interface TabListener {
    }

    @RestrictTo
    /* renamed from: g */
    public boolean mo328g() {
        return false;
    }

    @RestrictTo
    /* renamed from: h */
    public boolean mo329h() {
        return false;
    }

    @RestrictTo
    /* renamed from: i */
    public void mo330i(boolean z) {
    }

    /* renamed from: j */
    public abstract int mo331j();

    /* renamed from: k */
    public Context mo332k() {
        return null;
    }

    @RestrictTo
    /* renamed from: l */
    public boolean mo333l() {
        return false;
    }

    @RestrictTo
    /* renamed from: m */
    public void mo334m(Configuration configuration) {
    }

    /* renamed from: n */
    public void mo335n() {
    }

    @RestrictTo
    /* renamed from: o */
    public boolean mo336o(int i2, KeyEvent keyEvent) {
        return false;
    }

    @RestrictTo
    /* renamed from: p */
    public boolean mo337p(KeyEvent keyEvent) {
        return false;
    }

    @RestrictTo
    /* renamed from: q */
    public boolean mo338q() {
        return false;
    }

    /* renamed from: r */
    public abstract void mo339r(@Nullable Drawable drawable);

    @RestrictTo
    /* renamed from: s */
    public void mo340s(boolean z) {
    }

    /* renamed from: t */
    public abstract void mo341t(boolean z);

    /* renamed from: u */
    public abstract void mo342u(boolean z);

    /* renamed from: v */
    public abstract void mo343v(boolean z);

    @RestrictTo
    /* renamed from: w */
    public void mo344w(boolean z) {
    }

    /* renamed from: x */
    public abstract void mo345x(CharSequence charSequence);

    @RestrictTo
    /* renamed from: y */
    public void mo346y(CharSequence charSequence) {
    }

    @RestrictTo
    /* renamed from: z */
    public ActionMode mo347z(ActionMode.Callback callback) {
        return null;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f316a;

        public LayoutParams(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f316a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0055R.styleable.f291b);
            this.f316a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.f316a = 0;
            this.f316a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f316a = 0;
            this.f316a = layoutParams.f316a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f316a = 0;
        }
    }
}
