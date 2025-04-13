package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.TintTypedArray;

@RestrictTo
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements MenuBuilder.ItemInvoker, MenuView, AdapterView.OnItemClickListener {

    /* renamed from: c */
    public static final int[] f828c = {R.attr.background, R.attr.divider};

    /* renamed from: b */
    public MenuBuilder f829b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f828c, R.attr.listViewStyle, 0);
        TintTypedArray tintTypedArray = new TintTypedArray(context, obtainStyledAttributes);
        if (tintTypedArray.m967p(0)) {
            setBackgroundDrawable(tintTypedArray.m958g(0));
        }
        if (tintTypedArray.m967p(1)) {
            setDivider(tintTypedArray.m958g(1));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.ItemInvoker
    /* renamed from: a */
    public boolean mo587a(MenuItemImpl menuItemImpl) {
        return this.f829b.m616r(menuItemImpl, null, 0);
    }

    @Override // androidx.appcompat.view.menu.MenuView
    /* renamed from: b */
    public void mo588b(MenuBuilder menuBuilder) {
        this.f829b = menuBuilder;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        mo587a((MenuItemImpl) getAdapter().getItem(i2));
    }
}
