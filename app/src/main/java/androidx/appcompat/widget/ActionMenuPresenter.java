package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.BaseMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ActionProvider;
import com.swiftsoft.anixartd.C2507R;
import java.util.ArrayList;

/* loaded from: classes.dex */
class ActionMenuPresenter extends BaseMenuPresenter implements ActionProvider.SubUiVisibilityListener {

    /* renamed from: k */
    public OverflowMenuButton f1038k;

    /* renamed from: l */
    public Drawable f1039l;

    /* renamed from: m */
    public boolean f1040m;

    /* renamed from: n */
    public boolean f1041n;

    /* renamed from: o */
    public boolean f1042o;

    /* renamed from: p */
    public int f1043p;

    /* renamed from: q */
    public int f1044q;

    /* renamed from: r */
    public int f1045r;

    /* renamed from: s */
    public boolean f1046s;

    /* renamed from: t */
    public final SparseBooleanArray f1047t;

    /* renamed from: u */
    public OverflowPopup f1048u;

    /* renamed from: v */
    public ActionButtonSubmenu f1049v;

    /* renamed from: w */
    public OpenOverflowRunnable f1050w;

    /* renamed from: x */
    public ActionMenuPopupCallback f1051x;

    /* renamed from: y */
    public final PopupPresenterCallback f1052y;

    /* renamed from: z */
    public int f1053z;

    public class ActionButtonSubmenu extends MenuPopupHelper {
        public ActionButtonSubmenu(Context context, SubMenuBuilder subMenuBuilder, View view) {
            super(context, subMenuBuilder, view, false, C2507R.attr.actionOverflowMenuStyle, 0);
            if (!((MenuItemImpl) subMenuBuilder.getItem()).m629g()) {
                View view2 = ActionMenuPresenter.this.f1038k;
                this.f938f = view2 == null ? (View) ActionMenuPresenter.this.f787i : view2;
            }
            m652f(ActionMenuPresenter.this.f1052y);
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        /* renamed from: d */
        public void mo650d() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f1049v = null;
            actionMenuPresenter.f1053z = 0;
            super.mo650d();
        }
    }

    public class ActionMenuPopupCallback extends ActionMenuItemView.PopupCallback {
        public ActionMenuPopupCallback() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback
        /* renamed from: a */
        public ShowableListMenu mo556a() {
            ActionButtonSubmenu actionButtonSubmenu = ActionMenuPresenter.this.f1049v;
            if (actionButtonSubmenu != null) {
                return actionButtonSubmenu.m648b();
            }
            return null;
        }
    }

    public class OpenOverflowRunnable implements Runnable {

        /* renamed from: b */
        public OverflowPopup f1056b;

        public OpenOverflowRunnable(OverflowPopup overflowPopup) {
            this.f1056b = overflowPopup;
        }

        @Override // java.lang.Runnable
        public void run() {
            MenuBuilder.Callback callback;
            MenuBuilder menuBuilder = ActionMenuPresenter.this.f782d;
            if (menuBuilder != null && (callback = menuBuilder.f868e) != null) {
                callback.mo431b(menuBuilder);
            }
            View view = (View) ActionMenuPresenter.this.f787i;
            if (view != null && view.getWindowToken() != null && this.f1056b.m655i()) {
                ActionMenuPresenter.this.f1048u = this.f1056b;
            }
            ActionMenuPresenter.this.f1050w = null;
        }
    }

    public class OverflowMenuButton extends AppCompatImageView implements ActionMenuView.ActionMenuChildView {
        public OverflowMenuButton(Context context) {
            super(context, null, C2507R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            TooltipCompat.m998a(this, getContentDescription());
            setOnTouchListener(new ForwardingListener(this, ActionMenuPresenter.this) { // from class: androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton.1
                @Override // androidx.appcompat.widget.ForwardingListener
                /* renamed from: b */
                public ShowableListMenu mo554b() {
                    OverflowPopup overflowPopup = ActionMenuPresenter.this.f1048u;
                    if (overflowPopup == null) {
                        return null;
                    }
                    return overflowPopup.m648b();
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                /* renamed from: c */
                public boolean mo555c() {
                    ActionMenuPresenter.this.m692s();
                    return true;
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                /* renamed from: d */
                public boolean mo693d() {
                    ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                    if (actionMenuPresenter.f1050w != null) {
                        return false;
                    }
                    actionMenuPresenter.m690q();
                    return true;
                }
            });
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        /* renamed from: b */
        public boolean mo548b() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        /* renamed from: d */
        public boolean mo549d() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.m692s();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                DrawableCompat.m1839k(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public class OverflowPopup extends MenuPopupHelper {
        public OverflowPopup(Context context, MenuBuilder menuBuilder, View view, boolean z) {
            super(context, menuBuilder, view, z, C2507R.attr.actionOverflowMenuStyle, 0);
            this.f939g = 8388613;
            m652f(ActionMenuPresenter.this.f1052y);
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        /* renamed from: d */
        public void mo650d() {
            MenuBuilder menuBuilder = ActionMenuPresenter.this.f782d;
            if (menuBuilder != null) {
                menuBuilder.close();
            }
            ActionMenuPresenter.this.f1048u = null;
            super.mo650d();
        }
    }

    public class PopupPresenterCallback implements MenuPresenter.Callback {
        public PopupPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        /* renamed from: b */
        public void mo439b(@NonNull MenuBuilder menuBuilder, boolean z) {
            if (menuBuilder instanceof SubMenuBuilder) {
                menuBuilder.mo609k().m601c(false);
            }
            MenuPresenter.Callback callback = ActionMenuPresenter.this.f784f;
            if (callback != null) {
                callback.mo439b(menuBuilder, z);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        /* renamed from: c */
        public boolean mo440c(@NonNull MenuBuilder menuBuilder) {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (menuBuilder == actionMenuPresenter.f782d) {
                return false;
            }
            actionMenuPresenter.f1053z = ((SubMenuBuilder) menuBuilder).getItem().getItemId();
            MenuPresenter.Callback callback = ActionMenuPresenter.this.f784f;
            if (callback != null) {
                return callback.mo440c(menuBuilder);
            }
            return false;
        }
    }

    @SuppressLint
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.appcompat.widget.ActionMenuPresenter.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* renamed from: b */
        public int f1062b;

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f1062b);
        }

        public SavedState(Parcel parcel) {
            this.f1062b = parcel.readInt();
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C2507R.layout.abc_action_menu_layout, C2507R.layout.abc_action_menu_item_layout);
        this.f1047t = new SparseBooleanArray();
        this.f1052y = new PopupPresenterCallback();
    }

    @Override // androidx.core.view.ActionProvider.SubUiVisibilityListener
    /* renamed from: a */
    public void mo688a(boolean z) {
        if (z) {
            super.mo566l(null);
            return;
        }
        MenuBuilder menuBuilder = this.f782d;
        if (menuBuilder != null) {
            menuBuilder.m601c(false);
        }
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: b */
    public void mo557b(MenuBuilder menuBuilder, boolean z) {
        m689p();
        MenuPresenter.Callback callback = this.f784f;
        if (callback != null) {
            callback.mo439b(menuBuilder, z);
        }
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    /* renamed from: c */
    public void mo558c(MenuItemImpl menuItemImpl, MenuView.ItemView itemView) {
        itemView.mo550f(menuItemImpl, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) itemView;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f787i);
        if (this.f1051x == null) {
            this.f1051x = new ActionMenuPopupCallback();
        }
        actionMenuItemView.setPopupCallback(this.f1051x);
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: d */
    public void mo559d(boolean z) {
        ArrayList<MenuItemImpl> arrayList;
        super.mo559d(z);
        ((View) this.f787i).requestLayout();
        MenuBuilder menuBuilder = this.f782d;
        boolean z2 = false;
        if (menuBuilder != null) {
            menuBuilder.m607i();
            ArrayList<MenuItemImpl> arrayList2 = menuBuilder.f872i;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ActionProvider actionProvider = arrayList2.get(i2).f891A;
                if (actionProvider != null) {
                    actionProvider.f3573a = this;
                }
            }
        }
        MenuBuilder menuBuilder2 = this.f782d;
        if (menuBuilder2 != null) {
            menuBuilder2.m607i();
            arrayList = menuBuilder2.f873j;
        } else {
            arrayList = null;
        }
        if (this.f1041n && arrayList != null) {
            int size2 = arrayList.size();
            if (size2 == 1) {
                z2 = !arrayList.get(0).f893C;
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f1038k == null) {
                this.f1038k = new OverflowMenuButton(this.f780b);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1038k.getParent();
            if (viewGroup != this.f787i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1038k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f787i;
                OverflowMenuButton overflowMenuButton = this.f1038k;
                ActionMenuView.LayoutParams generateDefaultLayoutParams = actionMenuView.generateDefaultLayoutParams();
                generateDefaultLayoutParams.f1075a = true;
                actionMenuView.addView(overflowMenuButton, generateDefaultLayoutParams);
            }
        } else {
            OverflowMenuButton overflowMenuButton2 = this.f1038k;
            if (overflowMenuButton2 != null) {
                Object parent = overflowMenuButton2.getParent();
                Object obj = this.f787i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f1038k);
                }
            }
        }
        ((ActionMenuView) this.f787i).setOverflowReserved(this.f1041n);
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: e */
    public boolean mo560e() {
        ArrayList<MenuItemImpl> arrayList;
        int i2;
        int i3;
        boolean z;
        MenuBuilder menuBuilder = this.f782d;
        if (menuBuilder != null) {
            arrayList = menuBuilder.m610l();
            i2 = arrayList.size();
        } else {
            arrayList = null;
            i2 = 0;
        }
        int i4 = this.f1045r;
        int i5 = this.f1044q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f787i;
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i3 = 2;
            z = true;
            if (i6 >= i2) {
                break;
            }
            MenuItemImpl menuItemImpl = arrayList.get(i6);
            int i9 = menuItemImpl.f919y;
            if ((i9 & 2) == 2) {
                i8++;
            } else if ((i9 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (this.f1046s && menuItemImpl.f893C) {
                i4 = 0;
            }
            i6++;
        }
        if (this.f1041n && (z2 || i7 + i8 > i4)) {
            i4--;
        }
        int i10 = i4 - i8;
        SparseBooleanArray sparseBooleanArray = this.f1047t;
        sparseBooleanArray.clear();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i2) {
            MenuItemImpl menuItemImpl2 = arrayList.get(i11);
            int i13 = menuItemImpl2.f919y;
            if ((i13 & 2) == i3) {
                View mo567n = mo567n(menuItemImpl2, null, viewGroup);
                mo567n.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = mo567n.getMeasuredWidth();
                i5 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                int i14 = menuItemImpl2.f896b;
                if (i14 != 0) {
                    sparseBooleanArray.put(i14, z);
                }
                menuItemImpl2.m634l(z);
            } else if ((i13 & 1) == z) {
                int i15 = menuItemImpl2.f896b;
                boolean z3 = sparseBooleanArray.get(i15);
                boolean z4 = (i10 > 0 || z3) && i5 > 0;
                if (z4) {
                    View mo567n2 = mo567n(menuItemImpl2, null, viewGroup);
                    mo567n2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = mo567n2.getMeasuredWidth();
                    i5 -= measuredWidth2;
                    if (i12 == 0) {
                        i12 = measuredWidth2;
                    }
                    z4 &= i5 + i12 > 0;
                }
                if (z4 && i15 != 0) {
                    sparseBooleanArray.put(i15, true);
                } else if (z3) {
                    sparseBooleanArray.put(i15, false);
                    for (int i16 = 0; i16 < i11; i16++) {
                        MenuItemImpl menuItemImpl3 = arrayList.get(i16);
                        if (menuItemImpl3.f896b == i15) {
                            if (menuItemImpl3.m629g()) {
                                i10++;
                            }
                            menuItemImpl3.m634l(false);
                        }
                    }
                }
                if (z4) {
                    i10--;
                }
                menuItemImpl2.m634l(z4);
            } else {
                menuItemImpl2.m634l(false);
                i11++;
                i3 = 2;
                z = true;
            }
            i11++;
            i3 = 2;
            z = true;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: i */
    public void mo564i(@NonNull Context context, @Nullable MenuBuilder menuBuilder) {
        this.f781c = context;
        LayoutInflater.from(context);
        this.f782d = menuBuilder;
        Resources resources = context.getResources();
        ActionBarPolicy actionBarPolicy = new ActionBarPolicy(context);
        if (!this.f1042o) {
            this.f1041n = true;
        }
        this.f1043p = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.f1045r = actionBarPolicy.m525a();
        int i2 = this.f1043p;
        if (this.f1041n) {
            if (this.f1038k == null) {
                OverflowMenuButton overflowMenuButton = new OverflowMenuButton(this.f780b);
                this.f1038k = overflowMenuButton;
                if (this.f1040m) {
                    overflowMenuButton.setImageDrawable(this.f1039l);
                    this.f1039l = null;
                    this.f1040m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1038k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i2 -= this.f1038k.getMeasuredWidth();
        } else {
            this.f1038k = null;
        }
        this.f1044q = i2;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: j */
    public void mo573j(Parcelable parcelable) {
        int i2;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i2 = ((SavedState) parcelable).f1062b) > 0 && (findItem = this.f782d.findItem(i2)) != null) {
            mo566l((SubMenuBuilder) findItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    /* renamed from: k */
    public boolean mo565k(ViewGroup viewGroup, int i2) {
        if (viewGroup.getChildAt(i2) == this.f1038k) {
            return false;
        }
        viewGroup.removeViewAt(i2);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: l */
    public boolean mo566l(SubMenuBuilder subMenuBuilder) {
        boolean z = false;
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        SubMenuBuilder subMenuBuilder2 = subMenuBuilder;
        while (true) {
            MenuBuilder menuBuilder = subMenuBuilder2.f970z;
            if (menuBuilder == this.f782d) {
                break;
            }
            subMenuBuilder2 = (SubMenuBuilder) menuBuilder;
        }
        MenuItem item = subMenuBuilder2.getItem();
        ViewGroup viewGroup = (ViewGroup) this.f787i;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i2);
                if ((childAt instanceof MenuView.ItemView) && ((MenuView.ItemView) childAt).getItemData() == item) {
                    view = childAt;
                    break;
                }
                i2++;
            }
        }
        if (view == null) {
            return false;
        }
        this.f1053z = subMenuBuilder.getItem().getItemId();
        int size = subMenuBuilder.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            MenuItem item2 = subMenuBuilder.getItem(i3);
            if (item2.isVisible() && item2.getIcon() != null) {
                z = true;
                break;
            }
            i3++;
        }
        ActionButtonSubmenu actionButtonSubmenu = new ActionButtonSubmenu(this.f781c, subMenuBuilder, view);
        this.f1049v = actionButtonSubmenu;
        actionButtonSubmenu.m651e(z);
        this.f1049v.m653g();
        super.mo566l(subMenuBuilder);
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: m */
    public Parcelable mo575m() {
        SavedState savedState = new SavedState();
        savedState.f1062b = this.f1053z;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    /* renamed from: n */
    public View mo567n(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        View actionView = menuItemImpl.getActionView();
        if (actionView == null || menuItemImpl.m628f()) {
            actionView = super.mo567n(menuItemImpl, view, viewGroup);
        }
        actionView.setVisibility(menuItemImpl.f893C ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    /* renamed from: o */
    public boolean mo568o(int i2, MenuItemImpl menuItemImpl) {
        return menuItemImpl.m629g();
    }

    /* renamed from: p */
    public boolean m689p() {
        boolean z;
        boolean m690q = m690q();
        ActionButtonSubmenu actionButtonSubmenu = this.f1049v;
        if (actionButtonSubmenu != null) {
            actionButtonSubmenu.m647a();
            z = true;
        } else {
            z = false;
        }
        return m690q | z;
    }

    /* renamed from: q */
    public boolean m690q() {
        Object obj;
        OpenOverflowRunnable openOverflowRunnable = this.f1050w;
        if (openOverflowRunnable != null && (obj = this.f787i) != null) {
            ((View) obj).removeCallbacks(openOverflowRunnable);
            this.f1050w = null;
            return true;
        }
        OverflowPopup overflowPopup = this.f1048u;
        if (overflowPopup == null) {
            return false;
        }
        overflowPopup.m647a();
        return true;
    }

    /* renamed from: r */
    public boolean m691r() {
        OverflowPopup overflowPopup = this.f1048u;
        return overflowPopup != null && overflowPopup.m649c();
    }

    /* renamed from: s */
    public boolean m692s() {
        MenuBuilder menuBuilder;
        if (!this.f1041n || m691r() || (menuBuilder = this.f782d) == null || this.f787i == null || this.f1050w != null) {
            return false;
        }
        menuBuilder.m607i();
        if (menuBuilder.f873j.isEmpty()) {
            return false;
        }
        OpenOverflowRunnable openOverflowRunnable = new OpenOverflowRunnable(new OverflowPopup(this.f781c, this.f782d, this.f1038k, true));
        this.f1050w = openOverflowRunnable;
        ((View) this.f787i).post(openOverflowRunnable);
        return true;
    }
}
