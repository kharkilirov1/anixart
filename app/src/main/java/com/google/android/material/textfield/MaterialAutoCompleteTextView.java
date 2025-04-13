package com.google.android.material.textfield;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.ArrayRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.C1195R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.swiftsoft.anixartd.C2507R;
import java.util.Locale;

/* loaded from: classes.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* renamed from: f */
    @NonNull
    public final ListPopupWindow f19047f;

    /* renamed from: g */
    @Nullable
    public final AccessibilityManager f19048g;

    /* renamed from: h */
    @NonNull
    public final Rect f19049h;

    /* renamed from: i */
    @LayoutRes
    public final int f19050i;

    /* renamed from: j */
    public final float f19051j;

    /* renamed from: k */
    public int f19052k;

    /* renamed from: l */
    @Nullable
    public ColorStateList f19053l;

    public class MaterialArrayAdapter<T> extends ArrayAdapter<String> {

        /* renamed from: b */
        @Nullable
        public ColorStateList f19055b;

        /* renamed from: c */
        @Nullable
        public ColorStateList f19056c;

        public MaterialArrayAdapter(@NonNull Context context, int i2, @NonNull String[] strArr) {
            super(context, i2, strArr);
            m10497a();
        }

        /* renamed from: a */
        public void m10497a() {
            ColorStateList colorStateList;
            ColorStateList colorStateList2 = MaterialAutoCompleteTextView.this.f19053l;
            ColorStateList colorStateList3 = null;
            if (colorStateList2 != null) {
                int[] iArr = {R.attr.state_pressed};
                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
            } else {
                colorStateList = null;
            }
            this.f19056c = colorStateList;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            if (materialAutoCompleteTextView.f19052k != 0) {
                ColorStateList colorStateList4 = materialAutoCompleteTextView.f19053l;
                if (colorStateList4 != null) {
                    int[] iArr2 = {R.attr.state_hovered, -16842919};
                    int[] iArr3 = {R.attr.state_selected, -16842919};
                    colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{ColorUtils.m1773b(colorStateList4.getColorForState(iArr3, 0), MaterialAutoCompleteTextView.this.f19052k), ColorUtils.m1773b(MaterialAutoCompleteTextView.this.f19053l.getColorForState(iArr2, 0), MaterialAutoCompleteTextView.this.f19052k), MaterialAutoCompleteTextView.this.f19052k});
                }
            }
            this.f19055b = colorStateList3;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i2, @Nullable View view, ViewGroup viewGroup) {
            View view2 = super.getView(i2, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                Drawable drawable = null;
                if (MaterialAutoCompleteTextView.this.getText().toString().contentEquals(textView.getText())) {
                    if (MaterialAutoCompleteTextView.this.f19052k != 0) {
                        ColorDrawable colorDrawable = new ColorDrawable(MaterialAutoCompleteTextView.this.f19052k);
                        if (this.f19056c != null) {
                            DrawableCompat.m1842n(colorDrawable, this.f19055b);
                            drawable = new RippleDrawable(this.f19056c, colorDrawable, null);
                        } else {
                            drawable = colorDrawable;
                        }
                    }
                }
                ViewCompat.m2204i0(textView, drawable);
            }
            return view2;
        }
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(MaterialThemeOverlay.m10534a(context, attributeSet, C2507R.attr.autoCompleteTextViewStyle, 0), attributeSet, C2507R.attr.autoCompleteTextViewStyle);
        this.f19049h = new Rect();
        Context context2 = getContext();
        TypedArray m10159d = ThemeEnforcement.m10159d(context2, attributeSet, C1195R.styleable.f17334s, C2507R.attr.autoCompleteTextViewStyle, 2132017995, new int[0]);
        if (m10159d.hasValue(0) && m10159d.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f19050i = m10159d.getResourceId(2, C2507R.layout.mtrl_auto_complete_simple_item);
        this.f19051j = m10159d.getDimensionPixelOffset(1, C2507R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        this.f19052k = m10159d.getColor(3, 0);
        this.f19053l = MaterialResources.m10240a(context2, m10159d, 4);
        this.f19048g = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2, null, C2507R.attr.listPopupWindowStyle, 0);
        this.f19047f = listPopupWindow;
        listPopupWindow.m871s(true);
        listPopupWindow.f1369p = this;
        listPopupWindow.f1354A.setInputMethodMode(2);
        listPopupWindow.mo777p(getAdapter());
        listPopupWindow.f1370q = new AdapterView.OnItemClickListener() { // from class: com.google.android.material.textfield.MaterialAutoCompleteTextView.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                Object item;
                MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
                if (i2 < 0) {
                    ListPopupWindow listPopupWindow2 = materialAutoCompleteTextView.f19047f;
                    item = !listPopupWindow2.mo572c() ? null : listPopupWindow2.f1357d.getSelectedItem();
                } else {
                    item = materialAutoCompleteTextView.getAdapter().getItem(i2);
                }
                MaterialAutoCompleteTextView.m10495a(MaterialAutoCompleteTextView.this, item);
                AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i2 < 0) {
                        ListPopupWindow listPopupWindow3 = MaterialAutoCompleteTextView.this.f19047f;
                        view = !listPopupWindow3.mo572c() ? null : listPopupWindow3.f1357d.getSelectedView();
                        ListPopupWindow listPopupWindow4 = MaterialAutoCompleteTextView.this.f19047f;
                        i2 = !listPopupWindow4.mo572c() ? -1 : listPopupWindow4.f1357d.getSelectedItemPosition();
                        ListPopupWindow listPopupWindow5 = MaterialAutoCompleteTextView.this.f19047f;
                        j2 = !listPopupWindow5.mo572c() ? Long.MIN_VALUE : listPopupWindow5.f1357d.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f19047f.f1357d, view, i2, j2);
                }
                MaterialAutoCompleteTextView.this.f19047f.dismiss();
            }
        };
        if (m10159d.hasValue(5)) {
            setSimpleItems(m10159d.getResourceId(5, 0));
        }
        m10159d.recycle();
    }

    /* renamed from: a */
    public static void m10495a(MaterialAutoCompleteTextView materialAutoCompleteTextView, Object obj) {
        materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(obj), false);
    }

    @Nullable
    /* renamed from: b */
    public final TextInputLayout m10496b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout m10496b = m10496b();
        return (m10496b == null || !m10496b.f19077D) ? super.getHint() : m10496b.getHint();
    }

    public float getPopupElevation() {
        return this.f19051j;
    }

    public int getSimpleItemSelectedColor() {
        return this.f19052k;
    }

    @Nullable
    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f19053l;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout m10496b = m10496b();
        if (m10496b != null && m10496b.f19077D && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout m10496b = m10496b();
            int i4 = 0;
            if (adapter != null && m10496b != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                ListPopupWindow listPopupWindow = this.f19047f;
                int min = Math.min(adapter.getCount(), Math.max(0, !listPopupWindow.mo572c() ? -1 : listPopupWindow.f1357d.getSelectedItemPosition()) + 15);
                View view = null;
                int i5 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i4) {
                        view = null;
                        i4 = itemViewType;
                    }
                    view = adapter.getView(max, view, m10496b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i5 = Math.max(i5, view.getMeasuredWidth());
                }
                Drawable m864d = this.f19047f.m864d();
                if (m864d != null) {
                    m864d.getPadding(this.f19049h);
                    Rect rect = this.f19049h;
                    i5 += rect.left + rect.right;
                }
                i4 = m10496b.getEndIconView().getMeasuredWidth() + i5;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i4), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@Nullable T t) {
        super.setAdapter(t);
        this.f19047f.mo777p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f19047f.f1371r = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i2) {
        super.setRawInputType(i2);
        TextInputLayout m10496b = m10496b();
        if (m10496b != null) {
            m10496b.m10525r();
        }
    }

    public void setSimpleItemSelectedColor(int i2) {
        this.f19052k = i2;
        if (getAdapter() instanceof MaterialArrayAdapter) {
            ((MaterialArrayAdapter) getAdapter()).m10497a();
        }
    }

    public void setSimpleItemSelectedRippleColor(@Nullable ColorStateList colorStateList) {
        this.f19053l = colorStateList;
        if (getAdapter() instanceof MaterialArrayAdapter) {
            ((MaterialArrayAdapter) getAdapter()).m10497a();
        }
    }

    public void setSimpleItems(@ArrayRes int i2) {
        setSimpleItems(getResources().getStringArray(i2));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f19048g;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f19047f.mo571a();
        }
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new MaterialArrayAdapter(getContext(), this.f19050i, strArr));
    }
}
