package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0055R;
import androidx.core.view.ViewCompat;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.swiftsoft.anixartd.C2507R;

@RestrictTo
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: b */
    public boolean f984b;

    /* renamed from: c */
    public View f985c;

    /* renamed from: d */
    public View f986d;

    /* renamed from: e */
    public View f987e;

    /* renamed from: f */
    public Drawable f988f;

    /* renamed from: g */
    public Drawable f989g;

    /* renamed from: h */
    public Drawable f990h;

    /* renamed from: i */
    public boolean f991i;

    /* renamed from: j */
    public boolean f992j;

    /* renamed from: k */
    public int f993k;

    @RequiresApi
    public static class Api21Impl {
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewCompat.m2204i0(this, new ActionBarBackgroundDrawable(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0055R.styleable.f290a);
        boolean z = false;
        this.f988f = obtainStyledAttributes.getDrawable(0);
        this.f989g = obtainStyledAttributes.getDrawable(2);
        this.f993k = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == C2507R.id.split_action_bar) {
            this.f991i = true;
            this.f990h = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f991i ? !(this.f988f != null || this.f989g != null) : this.f990h == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    public final int m662a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    public final boolean m663b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f988f;
        if (drawable != null && drawable.isStateful()) {
            this.f988f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f989g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f989g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f990h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f990h.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f985c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f988f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f989g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f990h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f986d = findViewById(C2507R.id.action_bar);
        this.f987e = findViewById(C2507R.id.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f984b || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        super.onLayout(z, i2, i3, i4, i5);
        View view = this.f985c;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i6 = layoutParams.bottomMargin;
            view.layout(i2, measuredHeight2 - i6, i4, measuredHeight - i6);
        }
        if (this.f991i) {
            Drawable drawable2 = this.f990h;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f988f != null) {
                if (this.f986d.getVisibility() == 0) {
                    this.f988f.setBounds(this.f986d.getLeft(), this.f986d.getTop(), this.f986d.getRight(), this.f986d.getBottom());
                } else {
                    View view2 = this.f987e;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f988f.setBounds(0, 0, 0, 0);
                    } else {
                        this.f988f.setBounds(this.f987e.getLeft(), this.f987e.getTop(), this.f987e.getRight(), this.f987e.getBottom());
                    }
                }
                z3 = true;
            }
            this.f992j = z4;
            if (!z4 || (drawable = this.f989g) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        if (this.f986d == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.f993k) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f986d == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        View view = this.f985c;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(m662a(this.f985c) + (!m663b(this.f986d) ? m662a(this.f986d) : !m663b(this.f987e) ? m662a(this.f987e) : 0), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i3) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f988f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f988f);
        }
        this.f988f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f986d;
            if (view != null) {
                this.f988f.setBounds(view.getLeft(), this.f986d.getTop(), this.f986d.getRight(), this.f986d.getBottom());
            }
        }
        boolean z = true;
        if (!this.f991i ? this.f988f != null || this.f989g != null : this.f990h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f990h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f990h);
        }
        this.f990h = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f991i && (drawable2 = this.f990h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f991i ? !(this.f988f != null || this.f989g != null) : this.f990h == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f989g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f989g);
        }
        this.f989g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f992j && (drawable2 = this.f989g) != null) {
                drawable2.setBounds(this.f985c.getLeft(), this.f985c.getTop(), this.f985c.getRight(), this.f985c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f991i ? this.f988f != null || this.f989g != null : this.f990h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f985c;
        if (view != null) {
            removeView(view);
        }
        this.f985c = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f984b = z;
        setDescendantFocusability(z ? 393216 : PrimitiveArrayBuilder.MAX_CHUNK_SIZE);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f988f;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f989g;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f990h;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f988f && !this.f991i) || (drawable == this.f989g && this.f992j) || ((drawable == this.f990h && this.f991i) || super.verifyDrawable(drawable));
    }
}
