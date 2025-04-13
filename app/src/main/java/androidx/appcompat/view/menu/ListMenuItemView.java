package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0055R;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;

@RestrictTo
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements MenuView.ItemView, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b */
    public MenuItemImpl f830b;

    /* renamed from: c */
    public ImageView f831c;

    /* renamed from: d */
    public RadioButton f832d;

    /* renamed from: e */
    public TextView f833e;

    /* renamed from: f */
    public CheckBox f834f;

    /* renamed from: g */
    public TextView f835g;

    /* renamed from: h */
    public ImageView f836h;

    /* renamed from: i */
    public ImageView f837i;

    /* renamed from: j */
    public LinearLayout f838j;

    /* renamed from: k */
    public Drawable f839k;

    /* renamed from: l */
    public int f840l;

    /* renamed from: m */
    public Context f841m;

    /* renamed from: n */
    public boolean f842n;

    /* renamed from: o */
    public Drawable f843o;

    /* renamed from: p */
    public boolean f844p;

    /* renamed from: q */
    public LayoutInflater f845q;

    /* renamed from: r */
    public boolean f846r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TintTypedArray m951r = TintTypedArray.m951r(getContext(), attributeSet, C0055R.styleable.f308s, C2507R.attr.listMenuViewStyle, 0);
        this.f839k = m951r.m958g(5);
        this.f840l = m951r.m964m(1, -1);
        this.f842n = m951r.m952a(7, false);
        this.f841m = context;
        this.f843o = m951r.m958g(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C2507R.attr.dropDownListViewStyle, 0);
        this.f844p = obtainStyledAttributes.hasValue(0);
        m951r.f1582b.recycle();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f845q == null) {
            this.f845q = LayoutInflater.from(getContext());
        }
        return this.f845q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f836h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public final void m589a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C2507R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f834f = checkBox;
        LinearLayout linearLayout = this.f838j;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f837i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f837i.getLayoutParams();
        rect.top = this.f837i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* renamed from: b */
    public final void m590b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C2507R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f832d = radioButton;
        LinearLayout linearLayout = this.f838j;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    /* renamed from: f */
    public void mo550f(MenuItemImpl menuItemImpl, int i2) {
        String sb;
        this.f830b = menuItemImpl;
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        setTitle(menuItemImpl.f899e);
        setCheckable(menuItemImpl.isCheckable());
        boolean m636n = menuItemImpl.m636n();
        menuItemImpl.m627e();
        int i3 = (m636n && this.f830b.m636n()) ? 0 : 8;
        if (i3 == 0) {
            TextView textView = this.f835g;
            MenuItemImpl menuItemImpl2 = this.f830b;
            char m627e = menuItemImpl2.m627e();
            if (m627e == 0) {
                sb = "";
            } else {
                Resources resources = menuItemImpl2.f908n.f864a.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(menuItemImpl2.f908n.f864a).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(C2507R.string.abc_prepend_shortcut_label));
                }
                int i4 = menuItemImpl2.f908n.mo612n() ? menuItemImpl2.f905k : menuItemImpl2.f903i;
                MenuItemImpl.m625c(sb2, i4, TextBuffer.MAX_SEGMENT_LEN, resources.getString(C2507R.string.abc_menu_meta_shortcut_label));
                MenuItemImpl.m625c(sb2, i4, RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT, resources.getString(C2507R.string.abc_menu_ctrl_shortcut_label));
                MenuItemImpl.m625c(sb2, i4, 2, resources.getString(C2507R.string.abc_menu_alt_shortcut_label));
                MenuItemImpl.m625c(sb2, i4, 1, resources.getString(C2507R.string.abc_menu_shift_shortcut_label));
                MenuItemImpl.m625c(sb2, i4, 4, resources.getString(C2507R.string.abc_menu_sym_shortcut_label));
                MenuItemImpl.m625c(sb2, i4, 8, resources.getString(C2507R.string.abc_menu_function_shortcut_label));
                if (m627e == '\b') {
                    sb2.append(resources.getString(C2507R.string.abc_menu_delete_shortcut_label));
                } else if (m627e == '\n') {
                    sb2.append(resources.getString(C2507R.string.abc_menu_enter_shortcut_label));
                } else if (m627e != ' ') {
                    sb2.append(m627e);
                } else {
                    sb2.append(resources.getString(C2507R.string.abc_menu_space_shortcut_label));
                }
                sb = sb2.toString();
            }
            textView.setText(sb);
        }
        if (this.f835g.getVisibility() != i3) {
            this.f835g.setVisibility(i3);
        }
        setIcon(menuItemImpl.getIcon());
        setEnabled(menuItemImpl.isEnabled());
        setSubMenuArrowVisible(menuItemImpl.hasSubMenu());
        setContentDescription(menuItemImpl.f911q);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
        return this.f830b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        ViewCompat.m2204i0(this, this.f839k);
        TextView textView = (TextView) findViewById(C2507R.id.title);
        this.f833e = textView;
        int i2 = this.f840l;
        if (i2 != -1) {
            textView.setTextAppearance(this.f841m, i2);
        }
        this.f835g = (TextView) findViewById(C2507R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(C2507R.id.submenuarrow);
        this.f836h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f843o);
        }
        this.f837i = (ImageView) findViewById(C2507R.id.group_divider);
        this.f838j = (LinearLayout) findViewById(C2507R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        if (this.f831c != null && this.f842n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f831c.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f832d == null && this.f834f == null) {
            return;
        }
        if (this.f830b.m630h()) {
            if (this.f832d == null) {
                m590b();
            }
            compoundButton = this.f832d;
            compoundButton2 = this.f834f;
        } else {
            if (this.f834f == null) {
                m589a();
            }
            compoundButton = this.f834f;
            compoundButton2 = this.f832d;
        }
        if (z) {
            compoundButton.setChecked(this.f830b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f834f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f832d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f830b.m630h()) {
            if (this.f832d == null) {
                m590b();
            }
            compoundButton = this.f832d;
        } else {
            if (this.f834f == null) {
                m589a();
            }
            compoundButton = this.f834f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f846r = z;
        this.f842n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f837i;
        if (imageView != null) {
            imageView.setVisibility((this.f844p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        Objects.requireNonNull(this.f830b.f908n);
        boolean z = this.f846r;
        if (z || this.f842n) {
            ImageView imageView = this.f831c;
            if (imageView == null && drawable == null && !this.f842n) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(C2507R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f831c = imageView2;
                LinearLayout linearLayout = this.f838j;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f842n) {
                this.f831c.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f831c;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f831c.getVisibility() != 0) {
                this.f831c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f833e.getVisibility() != 8) {
                this.f833e.setVisibility(8);
            }
        } else {
            this.f833e.setText(charSequence);
            if (this.f833e.getVisibility() != 0) {
                this.f833e.setVisibility(0);
            }
        }
    }
}
