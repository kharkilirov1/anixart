package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
class FragmentLifecycleCallbacksDispatcher {

    /* renamed from: a */
    @NonNull
    public final CopyOnWriteArrayList<FragmentLifecycleCallbacksHolder> f4318a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    @NonNull
    public final FragmentManager f4319b;

    public static final class FragmentLifecycleCallbacksHolder {

        /* renamed from: a */
        @NonNull
        public final FragmentManager.FragmentLifecycleCallbacks f4320a;

        /* renamed from: b */
        public final boolean f4321b;

        public FragmentLifecycleCallbacksHolder(@NonNull FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z) {
            this.f4320a = fragmentLifecycleCallbacks;
            this.f4321b = z;
        }
    }

    public FragmentLifecycleCallbacksDispatcher(@NonNull FragmentManager fragmentManager) {
        this.f4319b = fragmentManager;
    }

    /* renamed from: a */
    public void m2978a(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z) {
        Fragment fragment2 = this.f4319b.f4360x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f4350n.m2978a(fragment, bundle, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.f4318a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.f4321b) {
                next.f4320a.onFragmentActivityCreated(this.f4319b, fragment, bundle);
            }
        }
    }

    /* renamed from: b */
    public void m2979b(@NonNull Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.f4319b;
        Context context = fragmentManager.f4358v.f4312c;
        Fragment fragment2 = fragmentManager.f4360x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f4350n.m2979b(fragment, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.f4318a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.f4321b) {
                next.f4320a.onFragmentAttached(this.f4319b, fragment, context);
            }
        }
    }

    /* renamed from: c */
    public void m2980c(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z) {
        Fragment fragment2 = this.f4319b.f4360x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f4350n.m2980c(fragment, bundle, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.f4318a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.f4321b) {
                next.f4320a.onFragmentCreated(this.f4319b, fragment, bundle);
            }
        }
    }

    /* renamed from: d */
    public void m2981d(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.f4319b.f4360x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f4350n.m2981d(fragment, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.f4318a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.f4321b) {
                next.f4320a.onFragmentDestroyed(this.f4319b, fragment);
            }
        }
    }

    /* renamed from: e */
    public void m2982e(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.f4319b.f4360x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f4350n.m2982e(fragment, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.f4318a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.f4321b) {
                next.f4320a.onFragmentDetached(this.f4319b, fragment);
            }
        }
    }

    /* renamed from: f */
    public void m2983f(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.f4319b.f4360x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f4350n.m2983f(fragment, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.f4318a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.f4321b) {
                next.f4320a.onFragmentPaused(this.f4319b, fragment);
            }
        }
    }

    /* renamed from: g */
    public void m2984g(@NonNull Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.f4319b;
        Context context = fragmentManager.f4358v.f4312c;
        Fragment fragment2 = fragmentManager.f4360x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f4350n.m2984g(fragment, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.f4318a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.f4321b) {
                next.f4320a.onFragmentPreAttached(this.f4319b, fragment, context);
            }
        }
    }

    /* renamed from: h */
    public void m2985h(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z) {
        Fragment fragment2 = this.f4319b.f4360x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f4350n.m2985h(fragment, bundle, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.f4318a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.f4321b) {
                next.f4320a.onFragmentPreCreated(this.f4319b, fragment, bundle);
            }
        }
    }

    /* renamed from: i */
    public void m2986i(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.f4319b.f4360x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f4350n.m2986i(fragment, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.f4318a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.f4321b) {
                next.f4320a.onFragmentResumed(this.f4319b, fragment);
            }
        }
    }

    /* renamed from: j */
    public void m2987j(@NonNull Fragment fragment, @NonNull Bundle bundle, boolean z) {
        Fragment fragment2 = this.f4319b.f4360x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f4350n.m2987j(fragment, bundle, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.f4318a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.f4321b) {
                next.f4320a.onFragmentSaveInstanceState(this.f4319b, fragment, bundle);
            }
        }
    }

    /* renamed from: k */
    public void m2988k(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.f4319b.f4360x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f4350n.m2988k(fragment, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.f4318a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.f4321b) {
                next.f4320a.onFragmentStarted(this.f4319b, fragment);
            }
        }
    }

    /* renamed from: l */
    public void m2989l(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.f4319b.f4360x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f4350n.m2989l(fragment, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.f4318a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.f4321b) {
                next.f4320a.onFragmentStopped(this.f4319b, fragment);
            }
        }
    }

    /* renamed from: m */
    public void m2990m(@NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle, boolean z) {
        Fragment fragment2 = this.f4319b.f4360x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f4350n.m2990m(fragment, view, bundle, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.f4318a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.f4321b) {
                next.f4320a.onFragmentViewCreated(this.f4319b, fragment, view, bundle);
            }
        }
    }

    /* renamed from: n */
    public void m2991n(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.f4319b.f4360x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f4350n.m2991n(fragment, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.f4318a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.f4321b) {
                next.f4320a.onFragmentViewDestroyed(this.f4319b, fragment);
            }
        }
    }
}
