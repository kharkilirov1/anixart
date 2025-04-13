package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.C0055R;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import com.swiftsoft.anixartd.C2507R;
import p000a.C0000a;

/* loaded from: classes.dex */
abstract class AbsActionBarView extends ViewGroup {

    /* renamed from: b */
    public final VisibilityAnimListener f972b;

    /* renamed from: c */
    public final Context f973c;

    /* renamed from: d */
    public ActionMenuView f974d;

    /* renamed from: e */
    public ActionMenuPresenter f975e;

    /* renamed from: f */
    public int f976f;

    /* renamed from: g */
    public ViewPropertyAnimatorCompat f977g;

    /* renamed from: h */
    public boolean f978h;

    /* renamed from: i */
    public boolean f979i;

    /* renamed from: androidx.appcompat.widget.AbsActionBarView$1 */
    class RunnableC00951 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    public class VisibilityAnimListener implements ViewPropertyAnimatorListener {

        /* renamed from: a */
        public boolean f980a = false;

        /* renamed from: b */
        public int f981b;

        public VisibilityAnimListener() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        /* renamed from: a */
        public void mo661a(View view) {
            this.f980a = true;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        /* renamed from: b */
        public void mo436b(View view) {
            if (this.f980a) {
                return;
            }
            AbsActionBarView absActionBarView = AbsActionBarView.this;
            absActionBarView.f977g = null;
            AbsActionBarView.super.setVisibility(this.f981b);
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        /* renamed from: c */
        public void mo437c(View view) {
            AbsActionBarView.super.setVisibility(0);
            this.f980a = false;
        }
    }

    public AbsActionBarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    public int m659c(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    /* renamed from: d */
    public int m660d(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int m5b = C0000a.m5b(i4, measuredHeight, 2, i3);
        if (z) {
            view.layout(i2 - measuredWidth, m5b, i2, measuredHeight + m5b);
        } else {
            view.layout(i2, m5b, i2 + measuredWidth, measuredHeight + m5b);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public int getAnimatedVisibility() {
        return this.f977g != null ? this.f972b.f981b : getVisibility();
    }

    public int getContentHeight() {
        return this.f976f;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0055R.styleable.f290a, C2507R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f975e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.f1045r = new ActionBarPolicy(actionMenuPresenter.f781c).m525a();
            MenuBuilder menuBuilder = actionMenuPresenter.f782d;
            if (menuBuilder != null) {
                menuBuilder.mo614p(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f979i = false;
        }
        if (!this.f979i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f979i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f979i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f978h = false;
        }
        if (!this.f978h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f978h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f978h = false;
        }
        return true;
    }

    public void setContentHeight(int i2) {
        this.f976f = i2;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f977g;
            if (viewPropertyAnimatorCompat != null) {
                viewPropertyAnimatorCompat.m2389b();
            }
            super.setVisibility(i2);
        }
    }

    public AbsActionBarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f972b = new VisibilityAnimListener();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C2507R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f973c = context;
        } else {
            this.f973c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
