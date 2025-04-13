package androidx.fragment.app;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
class FragmentStore {

    /* renamed from: a */
    public final ArrayList<Fragment> f4420a = new ArrayList<>();

    /* renamed from: b */
    public final HashMap<String, FragmentStateManager> f4421b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, FragmentState> f4422c = new HashMap<>();

    /* renamed from: d */
    public FragmentManagerViewModel f4423d;

    /* renamed from: a */
    public void m3102a(@NonNull Fragment fragment) {
        if (this.f4420a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f4420a) {
            this.f4420a.add(fragment);
        }
        fragment.mAdded = true;
    }

    /* renamed from: b */
    public void m3103b() {
        this.f4421b.values().removeAll(Collections.singleton(null));
    }

    @Nullable
    /* renamed from: c */
    public Fragment m3104c(@NonNull String str) {
        FragmentStateManager fragmentStateManager = this.f4421b.get(str);
        if (fragmentStateManager != null) {
            return fragmentStateManager.f4408c;
        }
        return null;
    }

    @Nullable
    /* renamed from: d */
    public Fragment m3105d(@NonNull String str) {
        Fragment findFragmentByWho;
        for (FragmentStateManager fragmentStateManager : this.f4421b.values()) {
            if (fragmentStateManager != null && (findFragmentByWho = fragmentStateManager.f4408c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    @NonNull
    /* renamed from: e */
    public List<FragmentStateManager> m3106e() {
        ArrayList arrayList = new ArrayList();
        for (FragmentStateManager fragmentStateManager : this.f4421b.values()) {
            if (fragmentStateManager != null) {
                arrayList.add(fragmentStateManager);
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: f */
    public List<Fragment> m3107f() {
        ArrayList arrayList = new ArrayList();
        for (FragmentStateManager fragmentStateManager : this.f4421b.values()) {
            if (fragmentStateManager != null) {
                arrayList.add(fragmentStateManager.f4408c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: g */
    public FragmentStateManager m3108g(@NonNull String str) {
        return this.f4421b.get(str);
    }

    @NonNull
    /* renamed from: h */
    public List<Fragment> m3109h() {
        ArrayList arrayList;
        if (this.f4420a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f4420a) {
            arrayList = new ArrayList(this.f4420a);
        }
        return arrayList;
    }

    /* renamed from: i */
    public void m3110i(@NonNull FragmentStateManager fragmentStateManager) {
        Fragment fragment = fragmentStateManager.f4408c;
        if (this.f4421b.get(fragment.mWho) != null) {
            return;
        }
        this.f4421b.put(fragment.mWho, fragmentStateManager);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.f4423d.m3066d(fragment);
            } else {
                this.f4423d.m3069g(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.m2992Q(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    /* renamed from: j */
    public void m3111j(@NonNull FragmentStateManager fragmentStateManager) {
        Fragment fragment = fragmentStateManager.f4408c;
        if (fragment.mRetainInstance) {
            this.f4423d.m3069g(fragment);
        }
        if (this.f4421b.put(fragment.mWho, null) != null && FragmentManager.m2992Q(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    /* renamed from: k */
    public void m3112k(@NonNull Fragment fragment) {
        synchronized (this.f4420a) {
            this.f4420a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    @Nullable
    /* renamed from: l */
    public FragmentState m3113l(@NonNull String str, @Nullable FragmentState fragmentState) {
        return fragmentState != null ? this.f4422c.put(str, fragmentState) : this.f4422c.remove(str);
    }
}
