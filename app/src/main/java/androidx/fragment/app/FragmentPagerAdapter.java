package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;
import java.util.Objects;

@Deprecated
/* loaded from: classes.dex */
public abstract class FragmentPagerAdapter extends PagerAdapter {

    /* renamed from: c */
    public Fragment f4392c;

    @Override // androidx.viewpager.widget.PagerAdapter
    /* renamed from: a */
    public void mo3073a(@NonNull ViewGroup viewGroup, int i2, @NonNull Object obj) {
        Objects.requireNonNull(null);
        throw null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* renamed from: b */
    public void mo3074b(@NonNull ViewGroup viewGroup) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NonNull
    /* renamed from: f */
    public Object mo3075f(@NonNull ViewGroup viewGroup, int i2) {
        Objects.requireNonNull(null);
        throw null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* renamed from: g */
    public boolean mo3076g(@NonNull View view, @NonNull Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* renamed from: h */
    public void mo3077h(@Nullable Parcelable parcelable, @Nullable ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Nullable
    /* renamed from: i */
    public Parcelable mo3078i() {
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* renamed from: j */
    public void mo3079j(@NonNull ViewGroup viewGroup, int i2, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f4392c;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f4392c.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.f4392c = fragment;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* renamed from: k */
    public void mo3080k(@NonNull ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
