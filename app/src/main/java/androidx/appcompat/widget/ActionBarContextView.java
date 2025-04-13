package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0055R;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.AbsActionBarView;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import com.swiftsoft.anixartd.C2507R;

@RestrictTo
/* loaded from: classes.dex */
public class ActionBarContextView extends AbsActionBarView {

    /* renamed from: j */
    public CharSequence f994j;

    /* renamed from: k */
    public CharSequence f995k;

    /* renamed from: l */
    public View f996l;

    /* renamed from: m */
    public View f997m;

    /* renamed from: n */
    public View f998n;

    /* renamed from: o */
    public LinearLayout f999o;

    /* renamed from: p */
    public TextView f1000p;

    /* renamed from: q */
    public TextView f1001q;

    /* renamed from: r */
    public int f1002r;

    /* renamed from: s */
    public int f1003s;

    /* renamed from: t */
    public boolean f1004t;

    /* renamed from: u */
    public int f1005u;

    public ActionBarContextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, C2507R.attr.actionModeStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0055R.styleable.f293d, C2507R.attr.actionModeStyle, 0);
        TintTypedArray tintTypedArray = new TintTypedArray(context, obtainStyledAttributes);
        ViewCompat.m2204i0(this, tintTypedArray.m958g(0));
        this.f1002r = tintTypedArray.m964m(5, 0);
        this.f1003s = tintTypedArray.m964m(4, 0);
        this.f976f = tintTypedArray.m963l(3, 0);
        this.f1005u = tintTypedArray.m964m(2, C2507R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: e */
    public void m664e(final ActionMode actionMode) {
        View view = this.f996l;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1005u, (ViewGroup) this, false);
            this.f996l = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f996l);
        }
        View findViewById = this.f996l.findViewById(C2507R.id.action_mode_close_button);
        this.f997m = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener(this) { // from class: androidx.appcompat.widget.ActionBarContextView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                actionMode.mo482c();
            }
        });
        MenuBuilder menuBuilder = (MenuBuilder) actionMode.mo484e();
        ActionMenuPresenter actionMenuPresenter = this.f975e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m689p();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f975e = actionMenuPresenter2;
        actionMenuPresenter2.f1041n = true;
        actionMenuPresenter2.f1042o = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuBuilder.m600b(this.f975e, this.f973c);
        ActionMenuPresenter actionMenuPresenter3 = this.f975e;
        MenuView menuView = actionMenuPresenter3.f787i;
        if (menuView == null) {
            MenuView menuView2 = (MenuView) actionMenuPresenter3.f783e.inflate(actionMenuPresenter3.f785g, (ViewGroup) this, false);
            actionMenuPresenter3.f787i = menuView2;
            menuView2.mo588b(actionMenuPresenter3.f782d);
            actionMenuPresenter3.mo559d(true);
        }
        MenuView menuView3 = actionMenuPresenter3.f787i;
        if (menuView != menuView3) {
            ((ActionMenuView) menuView3).setPresenter(actionMenuPresenter3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) menuView3;
        this.f974d = actionMenuView;
        ViewCompat.m2204i0(actionMenuView, null);
        addView(this.f974d, layoutParams);
    }

    /* renamed from: f */
    public final void m665f() {
        if (this.f999o == null) {
            LayoutInflater.from(getContext()).inflate(C2507R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f999o = linearLayout;
            this.f1000p = (TextView) linearLayout.findViewById(C2507R.id.action_bar_title);
            this.f1001q = (TextView) this.f999o.findViewById(C2507R.id.action_bar_subtitle);
            if (this.f1002r != 0) {
                this.f1000p.setTextAppearance(getContext(), this.f1002r);
            }
            if (this.f1003s != 0) {
                this.f1001q.setTextAppearance(getContext(), this.f1003s);
            }
        }
        this.f1000p.setText(this.f994j);
        this.f1001q.setText(this.f995k);
        boolean z = !TextUtils.isEmpty(this.f994j);
        boolean z2 = !TextUtils.isEmpty(this.f995k);
        int i2 = 0;
        this.f1001q.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f999o;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.f999o.getParent() == null) {
            addView(this.f999o);
        }
    }

    /* renamed from: g */
    public void m666g() {
        removeAllViews();
        this.f998n = null;
        this.f974d = null;
        this.f975e = null;
        View view = this.f997m;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f995k;
    }

    public CharSequence getTitle() {
        return this.f994j;
    }

    /* renamed from: h */
    public ViewPropertyAnimatorCompat m667h(int i2, long j2) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f977g;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.m2389b();
        }
        if (i2 != 0) {
            ViewPropertyAnimatorCompat m2189b = ViewCompat.m2189b(this);
            m2189b.m2388a(0.0f);
            m2189b.m2390c(j2);
            AbsActionBarView.VisibilityAnimListener visibilityAnimListener = this.f972b;
            AbsActionBarView.this.f977g = m2189b;
            visibilityAnimListener.f981b = i2;
            View view = m2189b.f3672a.get();
            if (view != null) {
                m2189b.m2392e(view, visibilityAnimListener);
            }
            return m2189b;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ViewPropertyAnimatorCompat m2189b2 = ViewCompat.m2189b(this);
        m2189b2.m2388a(1.0f);
        m2189b2.m2390c(j2);
        AbsActionBarView.VisibilityAnimListener visibilityAnimListener2 = this.f972b;
        AbsActionBarView.this.f977g = m2189b2;
        visibilityAnimListener2.f981b = i2;
        View view2 = m2189b2.f3672a.get();
        if (view2 == null) {
            return m2189b2;
        }
        m2189b2.m2392e(view2, visibilityAnimListener2);
        return m2189b2;
    }

    /* renamed from: i */
    public boolean m668i() {
        ActionMenuPresenter actionMenuPresenter = this.f975e;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.m692s();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f975e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m690q();
            ActionMenuPresenter.ActionButtonSubmenu actionButtonSubmenu = this.f975e.f1049v;
            if (actionButtonSubmenu != null) {
                actionButtonSubmenu.m647a();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean m1007b = ViewUtils.m1007b(this);
        int paddingRight = m1007b ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f996l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f996l.getLayoutParams();
            int i6 = m1007b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = m1007b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i8 = m1007b ? paddingRight - i6 : paddingRight + i6;
            int m660d = i8 + m660d(this.f996l, i8, paddingTop, paddingTop2, m1007b);
            paddingRight = m1007b ? m660d - i7 : m660d + i7;
        }
        int i9 = paddingRight;
        LinearLayout linearLayout = this.f999o;
        if (linearLayout != null && this.f998n == null && linearLayout.getVisibility() != 8) {
            i9 += m660d(this.f999o, i9, paddingTop, paddingTop2, m1007b);
        }
        int i10 = i9;
        View view2 = this.f998n;
        if (view2 != null) {
            m660d(view2, i10, paddingTop, paddingTop2, m1007b);
        }
        int paddingLeft = m1007b ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f974d;
        if (actionMenuView != null) {
            m660d(actionMenuView, paddingLeft, paddingTop, paddingTop2, !m1007b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i2);
        int i4 = this.f976f;
        if (i4 <= 0) {
            i4 = View.MeasureSpec.getSize(i3);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i5 = i4 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        View view = this.f996l;
        if (view != null) {
            int m659c = m659c(view, paddingLeft, makeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f996l.getLayoutParams();
            paddingLeft = m659c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f974d;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m659c(this.f974d, paddingLeft, makeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f999o;
        if (linearLayout != null && this.f998n == null) {
            if (this.f1004t) {
                this.f999o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f999o.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f999o.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m659c(linearLayout, paddingLeft, makeMeasureSpec, 0);
            }
        }
        View view2 = this.f998n;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i6 = layoutParams.width;
            int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i6 >= 0) {
                paddingLeft = Math.min(i6, paddingLeft);
            }
            int i8 = layoutParams.height;
            int i9 = i8 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i8 >= 0) {
                i5 = Math.min(i8, i5);
            }
            this.f998n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i9));
        }
        if (this.f976f > 0) {
            setMeasuredDimension(size, i4);
            return;
        }
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i10) {
                i10 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i10);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public void setContentHeight(int i2) {
        this.f976f = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f998n;
        if (view2 != null) {
            removeView(view2);
        }
        this.f998n = view;
        if (view != null && (linearLayout = this.f999o) != null) {
            removeView(linearLayout);
            this.f999o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f995k = charSequence;
        m665f();
    }

    public void setTitle(CharSequence charSequence) {
        this.f994j = charSequence;
        m665f();
        ViewCompat.m2202h0(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1004t) {
            requestLayout();
        }
        this.f1004t = z;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
