package com.google.android.material.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;

@RestrictTo
/* loaded from: classes.dex */
public class NavigationMenuPresenter implements MenuPresenter {

    /* renamed from: b */
    public MenuBuilder f18321b;

    /* renamed from: c */
    public boolean f18322c = true;

    /* renamed from: com.google.android.material.internal.NavigationMenuPresenter$1 */
    public class ViewOnClickListenerC13201 implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ NavigationMenuPresenter f18323b;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Objects.requireNonNull(this.f18323b);
            MenuItemImpl itemData = ((NavigationMenuItemView) view).getItemData();
            NavigationMenuPresenter navigationMenuPresenter = this.f18323b;
            boolean m616r = navigationMenuPresenter.f18321b.m616r(itemData, navigationMenuPresenter, 0);
            if (itemData != null && itemData.isCheckable() && m616r) {
                Objects.requireNonNull(this.f18323b);
                throw null;
            }
            Objects.requireNonNull(this.f18323b);
        }
    }

    public static class HeaderViewHolder extends ViewHolder {
    }

    public class NavigationMenuAdapter extends RecyclerView.Adapter<ViewHolder> {
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i2) {
            throw null;
        }

        /* renamed from: k */
        public final void m10148k(View view, int i2, boolean z) {
            ViewCompat.m2196e0(view, new AccessibilityDelegateCompat(i2, z) { // from class: com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuAdapter.1

                /* renamed from: d */
                public final /* synthetic */ int f18324d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(AccessibilityDelegateCompat.f3569c);
                }

                @Override // androidx.core.view.AccessibilityDelegateCompat
                /* renamed from: d */
                public void mo2044d(@NonNull View view2, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    this.f3570a.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat.f3743a);
                    NavigationMenuAdapter navigationMenuAdapter = NavigationMenuAdapter.this;
                    int i3 = this.f18324d;
                    Objects.requireNonNull(navigationMenuAdapter);
                    if (i3 > 0) {
                        Objects.requireNonNull(null);
                        throw null;
                    }
                    Objects.requireNonNull(null);
                    throw null;
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i2) {
            ViewHolder viewHolder2 = viewHolder;
            int itemViewType = getItemViewType(i2);
            if (itemViewType == 0) {
                throw null;
            }
            if (itemViewType == 1) {
                throw null;
            }
            if (itemViewType == 2) {
                throw null;
            }
            if (itemViewType != 3) {
                return;
            }
            m10148k(viewHolder2.itemView, i2, true);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @Nullable
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
            if (i2 == 0) {
                throw null;
            }
            if (i2 == 1) {
                throw null;
            }
            if (i2 == 2) {
                throw null;
            }
            if (i2 != 3) {
                return null;
            }
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(ViewHolder viewHolder) {
            ViewHolder viewHolder2 = viewHolder;
            if (viewHolder2 instanceof NormalViewHolder) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder2.itemView;
                FrameLayout frameLayout = navigationMenuItemView.f18310A;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                navigationMenuItemView.f18319z.setCompoundDrawables(null, null, null, null);
            }
        }
    }

    public static class NavigationMenuHeaderItem implements NavigationMenuItem {
    }

    public interface NavigationMenuItem {
    }

    public static class NavigationMenuSeparatorItem implements NavigationMenuItem {
    }

    public static class NavigationMenuTextItem implements NavigationMenuItem {
    }

    public class NavigationMenuViewAccessibilityDelegate extends RecyclerViewAccessibilityDelegate {
        @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: d */
        public void mo2044d(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.mo2044d(view, accessibilityNodeInfoCompat);
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public static class NormalViewHolder extends ViewHolder {
    }

    public static class SeparatorViewHolder extends ViewHolder {
    }

    public static class SubheaderViewHolder extends ViewHolder {
    }

    public static abstract class ViewHolder extends RecyclerView.ViewHolder {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: b */
    public void mo557b(MenuBuilder menuBuilder, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: d */
    public void mo559d(boolean z) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: e */
    public boolean mo560e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: f */
    public boolean mo561f(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: g */
    public boolean mo562g(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: i */
    public void mo564i(@NonNull Context context, @NonNull MenuBuilder menuBuilder) {
        LayoutInflater.from(context);
        this.f18321b = menuBuilder;
        context.getResources().getDimensionPixelOffset(C2507R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: j */
    public void mo573j(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.getSparseParcelableArray("android:menu:list") != null) {
                throw null;
            }
            if (bundle.getBundle("android:menu:adapter") != null) {
                throw null;
            }
            if (bundle.getSparseParcelableArray("android:menu:header") != null) {
                throw null;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: l */
    public boolean mo566l(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    @NonNull
    /* renamed from: m */
    public Parcelable mo575m() {
        return new Bundle();
    }
}
