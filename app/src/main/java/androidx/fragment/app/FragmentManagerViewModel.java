package androidx.fragment.app;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.lifecycle.C0414b;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
final class FragmentManagerViewModel extends ViewModel {

    /* renamed from: j */
    public static final ViewModelProvider.Factory f4385j = new ViewModelProvider.Factory() { // from class: androidx.fragment.app.FragmentManagerViewModel.1
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @NonNull
        /* renamed from: a */
        public <T extends ViewModel> T mo3071a(@NonNull Class<T> cls) {
            return new FragmentManagerViewModel(true);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        /* renamed from: b */
        public /* synthetic */ ViewModel mo3072b(Class cls, CreationExtras creationExtras) {
            return C0414b.m3248a(this, cls, creationExtras);
        }
    };

    /* renamed from: g */
    public final boolean f4389g;

    /* renamed from: d */
    public final HashMap<String, Fragment> f4386d = new HashMap<>();

    /* renamed from: e */
    public final HashMap<String, FragmentManagerViewModel> f4387e = new HashMap<>();

    /* renamed from: f */
    public final HashMap<String, ViewModelStore> f4388f = new HashMap<>();

    /* renamed from: h */
    public boolean f4390h = false;

    /* renamed from: i */
    public boolean f4391i = false;

    public FragmentManagerViewModel(boolean z) {
        this.f4389g = z;
    }

    @Override // androidx.lifecycle.ViewModel
    /* renamed from: b */
    public void mo3065b() {
        if (FragmentManager.m2992Q(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f4390h = true;
    }

    /* renamed from: d */
    public void m3066d(@NonNull Fragment fragment) {
        if (this.f4391i) {
            if (FragmentManager.m2992Q(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f4386d.containsKey(fragment.mWho)) {
                return;
            }
            this.f4386d.put(fragment.mWho, fragment);
            if (FragmentManager.m2992Q(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* renamed from: e */
    public void m3067e(@NonNull Fragment fragment) {
        if (FragmentManager.m2992Q(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        m3068f(fragment.mWho);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FragmentManagerViewModel.class != obj.getClass()) {
            return false;
        }
        FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) obj;
        return this.f4386d.equals(fragmentManagerViewModel.f4386d) && this.f4387e.equals(fragmentManagerViewModel.f4387e) && this.f4388f.equals(fragmentManagerViewModel.f4388f);
    }

    /* renamed from: f */
    public final void m3068f(@NonNull String str) {
        FragmentManagerViewModel fragmentManagerViewModel = this.f4387e.get(str);
        if (fragmentManagerViewModel != null) {
            fragmentManagerViewModel.mo3065b();
            this.f4387e.remove(str);
        }
        ViewModelStore viewModelStore = this.f4388f.get(str);
        if (viewModelStore != null) {
            viewModelStore.m3247a();
            this.f4388f.remove(str);
        }
    }

    /* renamed from: g */
    public void m3069g(@NonNull Fragment fragment) {
        if (this.f4391i) {
            if (FragmentManager.m2992Q(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f4386d.remove(fragment.mWho) != null) && FragmentManager.m2992Q(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* renamed from: h */
    public boolean m3070h(@NonNull Fragment fragment) {
        if (this.f4386d.containsKey(fragment.mWho) && this.f4389g) {
            return this.f4390h;
        }
        return true;
    }

    public int hashCode() {
        return this.f4388f.hashCode() + ((this.f4387e.hashCode() + (this.f4386d.hashCode() * 31)) * 31);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f4386d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f4387e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f4388f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
