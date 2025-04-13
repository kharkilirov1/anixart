package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;
import java.util.ArrayList;
import p000a.C0000a;

@Deprecated
/* loaded from: classes.dex */
public abstract class FragmentStatePagerAdapter extends PagerAdapter {

    /* renamed from: c */
    public final FragmentManager f4413c;

    /* renamed from: d */
    public final int f4414d;

    /* renamed from: e */
    public FragmentTransaction f4415e = null;

    /* renamed from: f */
    public ArrayList<Fragment.SavedState> f4416f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<Fragment> f4417g = new ArrayList<>();

    /* renamed from: h */
    public Fragment f4418h = null;

    /* renamed from: i */
    public boolean f4419i;

    public FragmentStatePagerAdapter(@NonNull FragmentManager fragmentManager, int i2) {
        this.f4413c = fragmentManager;
        this.f4414d = i2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* renamed from: a */
    public void mo3073a(@NonNull ViewGroup viewGroup, int i2, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f4415e == null) {
            this.f4415e = new BackStackRecord(this.f4413c);
        }
        while (this.f4416f.size() <= i2) {
            this.f4416f.add(null);
        }
        this.f4416f.set(i2, fragment.isAdded() ? this.f4413c.m3035i0(fragment) : null);
        this.f4417g.set(i2, null);
        this.f4415e.mo2943m(fragment);
        if (fragment.equals(this.f4418h)) {
            this.f4418h = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* renamed from: b */
    public void mo3074b(@NonNull ViewGroup viewGroup) {
        FragmentTransaction fragmentTransaction = this.f4415e;
        if (fragmentTransaction != null) {
            if (!this.f4419i) {
                try {
                    this.f4419i = true;
                    fragmentTransaction.mo2939h();
                } finally {
                    this.f4419i = false;
                }
            }
            this.f4415e = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NonNull
    /* renamed from: f */
    public Object mo3075f(@NonNull ViewGroup viewGroup, int i2) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f4417g.size() > i2 && (fragment = this.f4417g.get(i2)) != null) {
            return fragment;
        }
        if (this.f4415e == null) {
            this.f4415e = new BackStackRecord(this.f4413c);
        }
        Fragment mo3101l = mo3101l(i2);
        if (this.f4416f.size() > i2 && (savedState = this.f4416f.get(i2)) != null) {
            mo3101l.setInitialSavedState(savedState);
        }
        while (this.f4417g.size() <= i2) {
            this.f4417g.add(null);
        }
        mo3101l.setMenuVisibility(false);
        if (this.f4414d == 0) {
            mo3101l.setUserVisibleHint(false);
        }
        this.f4417g.set(i2, mo3101l);
        this.f4415e.mo2941k(viewGroup.getId(), mo3101l, null, 1);
        if (this.f4414d == 1) {
            this.f4415e.mo2944o(mo3101l, Lifecycle.State.STARTED);
        }
        return mo3101l;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* renamed from: g */
    public boolean mo3076g(@NonNull View view, @NonNull Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* renamed from: h */
    public void mo3077h(@Nullable Parcelable parcelable, @Nullable ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f4416f.clear();
            this.f4417g.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f4416f.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment m3003K = this.f4413c.m3003K(bundle, str);
                    if (m3003K != null) {
                        while (this.f4417g.size() <= parseInt) {
                            this.f4417g.add(null);
                        }
                        m3003K.setMenuVisibility(false);
                        this.f4417g.set(parseInt, m3003K);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Nullable
    /* renamed from: i */
    public Parcelable mo3078i() {
        Bundle bundle;
        if (this.f4416f.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f4416f.size()];
            this.f4416f.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i2 = 0; i2 < this.f4417g.size(); i2++) {
            Fragment fragment = this.f4417g.get(i2);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f4413c.m3023c0(bundle, C0000a.m7d("f", i2), fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* renamed from: j */
    public void mo3079j(@NonNull ViewGroup viewGroup, int i2, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f4418h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f4414d == 1) {
                    if (this.f4415e == null) {
                        this.f4415e = new BackStackRecord(this.f4413c);
                    }
                    this.f4415e.mo2944o(this.f4418h, Lifecycle.State.STARTED);
                } else {
                    this.f4418h.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f4414d == 1) {
                if (this.f4415e == null) {
                    this.f4415e = new BackStackRecord(this.f4413c);
                }
                this.f4415e.mo2944o(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f4418h = fragment;
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

    @NonNull
    /* renamed from: l */
    public abstract Fragment mo3101l(int i2);
}
