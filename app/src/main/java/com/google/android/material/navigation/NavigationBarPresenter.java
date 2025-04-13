package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.ParcelableSparseArray;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;

@RestrictTo
/* loaded from: classes.dex */
public class NavigationBarPresenter implements MenuPresenter {

    /* renamed from: b */
    public NavigationBarMenuView f18462b;

    /* renamed from: c */
    public boolean f18463c = false;

    /* renamed from: d */
    public int f18464d;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.material.navigation.NavigationBarPresenter.SavedState.1
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* renamed from: b */
        public int f18465b;

        /* renamed from: c */
        @Nullable
        public ParcelableSparseArray f18466c;

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i2) {
            parcel.writeInt(this.f18465b);
            parcel.writeParcelable(this.f18466c, 0);
        }

        public SavedState(@NonNull Parcel parcel) {
            this.f18465b = parcel.readInt();
            this.f18466c = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: b */
    public void mo557b(@Nullable MenuBuilder menuBuilder, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: d */
    public void mo559d(boolean z) {
        TransitionSet transitionSet;
        if (this.f18463c) {
            return;
        }
        if (z) {
            this.f18462b.m10198a();
            return;
        }
        NavigationBarMenuView navigationBarMenuView = this.f18462b;
        MenuBuilder menuBuilder = navigationBarMenuView.f18435D;
        if (menuBuilder == null || navigationBarMenuView.f18441g == null) {
            return;
        }
        int size = menuBuilder.size();
        if (size != navigationBarMenuView.f18441g.length) {
            navigationBarMenuView.m10198a();
            return;
        }
        int i2 = navigationBarMenuView.f18442h;
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = navigationBarMenuView.f18435D.getItem(i3);
            if (item.isChecked()) {
                navigationBarMenuView.f18442h = item.getItemId();
                navigationBarMenuView.f18443i = i3;
            }
        }
        if (i2 != navigationBarMenuView.f18442h && (transitionSet = navigationBarMenuView.f18436b) != null) {
            TransitionManager.m4256a(navigationBarMenuView, transitionSet);
        }
        boolean m10201f = navigationBarMenuView.m10201f(navigationBarMenuView.f18440f, navigationBarMenuView.f18435D.m610l().size());
        for (int i4 = 0; i4 < size; i4++) {
            navigationBarMenuView.f18434C.f18463c = true;
            navigationBarMenuView.f18441g[i4].setLabelVisibilityMode(navigationBarMenuView.f18440f);
            navigationBarMenuView.f18441g[i4].setShifting(m10201f);
            navigationBarMenuView.f18441g[i4].mo550f((MenuItemImpl) navigationBarMenuView.f18435D.getItem(i4), 0);
            navigationBarMenuView.f18434C.f18463c = false;
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: e */
    public boolean mo560e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: f */
    public boolean mo561f(@Nullable MenuBuilder menuBuilder, @Nullable MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: g */
    public boolean mo562g(@Nullable MenuBuilder menuBuilder, @Nullable MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.f18464d;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: i */
    public void mo564i(@NonNull Context context, @NonNull MenuBuilder menuBuilder) {
        this.f18462b.f18435D = menuBuilder;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: j */
    public void mo573j(@NonNull Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            NavigationBarMenuView navigationBarMenuView = this.f18462b;
            SavedState savedState = (SavedState) parcelable;
            int i2 = savedState.f18465b;
            int size = navigationBarMenuView.f18435D.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                MenuItem item = navigationBarMenuView.f18435D.getItem(i3);
                if (i2 == item.getItemId()) {
                    navigationBarMenuView.f18442h = i2;
                    navigationBarMenuView.f18443i = i3;
                    item.setChecked(true);
                    break;
                }
                i3++;
            }
            Context context = this.f18462b.getContext();
            ParcelableSparseArray parcelableSparseArray = savedState.f18466c;
            SparseArray sparseArray = new SparseArray(parcelableSparseArray.size());
            for (int i4 = 0; i4 < parcelableSparseArray.size(); i4++) {
                int keyAt = parcelableSparseArray.keyAt(i4);
                BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i4);
                if (state == null) {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
                sparseArray.put(keyAt, new BadgeDrawable(context, 0, C2507R.attr.badgeStyle, C2507R.style.Widget_MaterialComponents_Badge, state));
            }
            NavigationBarMenuView navigationBarMenuView2 = this.f18462b;
            Objects.requireNonNull(navigationBarMenuView2);
            for (int i5 = 0; i5 < sparseArray.size(); i5++) {
                int keyAt2 = sparseArray.keyAt(i5);
                if (navigationBarMenuView2.f18453s.indexOfKey(keyAt2) < 0) {
                    navigationBarMenuView2.f18453s.append(keyAt2, (BadgeDrawable) sparseArray.get(keyAt2));
                }
            }
            NavigationBarItemView[] navigationBarItemViewArr = navigationBarMenuView2.f18441g;
            if (navigationBarItemViewArr != null) {
                for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                    navigationBarItemView.setBadge(navigationBarMenuView2.f18453s.get(navigationBarItemView.getId()));
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: l */
    public boolean mo566l(@Nullable SubMenuBuilder subMenuBuilder) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    @NonNull
    /* renamed from: m */
    public Parcelable mo575m() {
        SavedState savedState = new SavedState();
        savedState.f18465b = this.f18462b.getSelectedItemId();
        SparseArray<BadgeDrawable> badgeDrawables = this.f18462b.getBadgeDrawables();
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i2 = 0; i2 < badgeDrawables.size(); i2++) {
            int keyAt = badgeDrawables.keyAt(i2);
            BadgeDrawable valueAt = badgeDrawables.valueAt(i2);
            if (valueAt == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            parcelableSparseArray.put(keyAt, valueAt.f17471f.f17483a);
        }
        savedState.f18466c = parcelableSparseArray;
        return savedState;
    }
}
