package androidx.legacy.app;

import android.app.Fragment;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import java.util.Objects;

@Deprecated
/* loaded from: classes.dex */
public abstract class FragmentPagerAdapter extends PagerAdapter {

    /* renamed from: c */
    public Fragment f4542c;

    @Override // androidx.viewpager.widget.PagerAdapter
    @Deprecated
    /* renamed from: a */
    public void mo3073a(ViewGroup viewGroup, int i2, Object obj) {
        Objects.requireNonNull(null);
        throw null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Deprecated
    /* renamed from: b */
    public void mo3074b(ViewGroup viewGroup) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Deprecated
    /* renamed from: f */
    public Object mo3075f(ViewGroup viewGroup, int i2) {
        Objects.requireNonNull(null);
        throw null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Deprecated
    /* renamed from: g */
    public boolean mo3076g(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Deprecated
    /* renamed from: h */
    public void mo3077h(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Deprecated
    /* renamed from: i */
    public Parcelable mo3078i() {
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Deprecated
    /* renamed from: j */
    public void mo3079j(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f4542c;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                FragmentCompat.f4541a.mo3170a(this.f4542c, false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                FragmentCompat.f4541a.mo3170a(fragment, true);
            }
            this.f4542c = fragment;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Deprecated
    /* renamed from: k */
    public void mo3080k(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
