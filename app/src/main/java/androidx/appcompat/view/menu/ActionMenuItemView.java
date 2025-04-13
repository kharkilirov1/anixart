package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0055R;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.ForwardingListener;
import androidx.appcompat.widget.TooltipCompat;

@RestrictTo
/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements MenuView.ItemView, View.OnClickListener, ActionMenuView.ActionMenuChildView {

    /* renamed from: h */
    public MenuItemImpl f768h;

    /* renamed from: i */
    public CharSequence f769i;

    /* renamed from: j */
    public Drawable f770j;

    /* renamed from: k */
    public MenuBuilder.ItemInvoker f771k;

    /* renamed from: l */
    public ForwardingListener f772l;

    /* renamed from: m */
    public PopupCallback f773m;

    /* renamed from: n */
    public boolean f774n;

    /* renamed from: o */
    public boolean f775o;

    /* renamed from: p */
    public int f776p;

    /* renamed from: q */
    public int f777q;

    /* renamed from: r */
    public int f778r;

    public class ActionMenuItemForwardingListener extends ForwardingListener {
        public ActionMenuItemForwardingListener() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        /* renamed from: b */
        public ShowableListMenu mo554b() {
            PopupCallback popupCallback = ActionMenuItemView.this.f773m;
            if (popupCallback != null) {
                return popupCallback.mo556a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        /* renamed from: c */
        public boolean mo555c() {
            ShowableListMenu mo554b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            MenuBuilder.ItemInvoker itemInvoker = actionMenuItemView.f771k;
            return itemInvoker != null && itemInvoker.mo587a(actionMenuItemView.f768h) && (mo554b = mo554b()) != null && mo554b.mo572c();
        }
    }

    public static abstract class PopupCallback {
        /* renamed from: a */
        public abstract ShowableListMenu mo556a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f774n = m552i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0055R.styleable.f292c, 0, 0);
        this.f776p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f778r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f777q = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    /* renamed from: b */
    public boolean mo548b() {
        return m551g();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    /* renamed from: d */
    public boolean mo549d() {
        return m551g() && this.f768h.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    /* renamed from: f */
    public void mo550f(MenuItemImpl menuItemImpl, int i2) {
        this.f768h = menuItemImpl;
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitleCondensed());
        setId(menuItemImpl.f895a);
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        setEnabled(menuItemImpl.isEnabled());
        if (menuItemImpl.hasSubMenu() && this.f772l == null) {
            this.f772l = new ActionMenuItemForwardingListener();
        }
    }

    /* renamed from: g */
    public boolean m551g() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
        return this.f768h;
    }

    /* renamed from: i */
    public final boolean m552i() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: j */
    public final void m553j() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f769i);
        if (this.f770j != null) {
            if (!((this.f768h.f919y & 4) == 4) || (!this.f774n && !this.f775o)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f769i : null);
        CharSequence charSequence = this.f768h.f911q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f768h.f899e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f768h.f912r;
        if (TextUtils.isEmpty(charSequence2)) {
            TooltipCompat.m998a(this, z3 ? null : this.f768h.f899e);
        } else {
            TooltipCompat.m998a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        MenuBuilder.ItemInvoker itemInvoker = this.f771k;
        if (itemInvoker != null) {
            itemInvoker.mo587a(this.f768h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f774n = m552i();
        m553j();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        boolean m551g = m551g();
        if (m551g && (i4 = this.f777q) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f776p) : this.f776p;
        if (mode != 1073741824 && this.f776p > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (m551g || this.f770j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f770j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener forwardingListener;
        if (this.f768h.hasSubMenu() && (forwardingListener = this.f772l) != null && forwardingListener.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f775o != z) {
            this.f775o = z;
            MenuItemImpl menuItemImpl = this.f768h;
            if (menuItemImpl != null) {
                MenuBuilder menuBuilder = menuItemImpl.f908n;
                menuBuilder.f874k = true;
                menuBuilder.mo614p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f770j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f778r;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        m553j();
    }

    public void setItemInvoker(MenuBuilder.ItemInvoker itemInvoker) {
        this.f771k = itemInvoker;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        this.f777q = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(PopupCallback popupCallback) {
        this.f773m = popupCallback;
    }

    public void setTitle(CharSequence charSequence) {
        this.f769i = charSequence;
        m553j();
    }
}
