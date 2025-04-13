package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.CancellationSignal;
import androidx.core.view.ViewCompat;
import com.swiftsoft.anixartd.C2507R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes.dex */
abstract class SpecialEffectsController {

    /* renamed from: a */
    public final ViewGroup f4487a;

    /* renamed from: b */
    public final ArrayList<Operation> f4488b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<Operation> f4489c = new ArrayList<>();

    /* renamed from: d */
    public boolean f4490d = false;

    /* renamed from: e */
    public boolean f4491e = false;

    /* renamed from: androidx.fragment.app.SpecialEffectsController$3 */
    public static /* synthetic */ class C03843 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4496a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f4497b;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            f4497b = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4497b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4497b[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Operation.State.values().length];
            f4496a = iArr2;
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4496a[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4496a[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4496a[3] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static class FragmentStateManagerOperation extends Operation {

        /* renamed from: h */
        @NonNull
        public final FragmentStateManager f4498h;

        public FragmentStateManagerOperation(@NonNull Operation.State state, @NonNull Operation.LifecycleImpact lifecycleImpact, @NonNull FragmentStateManager fragmentStateManager, @NonNull CancellationSignal cancellationSignal) {
            super(state, lifecycleImpact, fragmentStateManager.f4408c, cancellationSignal);
            this.f4498h = fragmentStateManager;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        /* renamed from: b */
        public void mo3156b() {
            super.mo3156b();
            this.f4498h.m3092k();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        /* renamed from: d */
        public void mo3157d() {
            Operation.LifecycleImpact lifecycleImpact = this.f4500b;
            if (lifecycleImpact != Operation.LifecycleImpact.ADDING) {
                if (lifecycleImpact == Operation.LifecycleImpact.REMOVING) {
                    Fragment fragment = this.f4498h.f4408c;
                    View requireView = fragment.requireView();
                    if (FragmentManager.m2992Q(2)) {
                        StringBuilder m24u = C0000a.m24u("Clearing focus ");
                        m24u.append(requireView.findFocus());
                        m24u.append(" on view ");
                        m24u.append(requireView);
                        m24u.append(" for Fragment ");
                        m24u.append(fragment);
                        Log.v("FragmentManager", m24u.toString());
                    }
                    requireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragment2 = this.f4498h.f4408c;
            View findFocus = fragment2.mView.findFocus();
            if (findFocus != null) {
                fragment2.setFocusedView(findFocus);
                if (FragmentManager.m2992Q(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment2);
                }
            }
            View requireView2 = this.f4501c.requireView();
            if (requireView2.getParent() == null) {
                this.f4498h.m3083b();
                requireView2.setAlpha(0.0f);
            }
            if (requireView2.getAlpha() == 0.0f && requireView2.getVisibility() == 0) {
                requireView2.setVisibility(4);
            }
            requireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
        }
    }

    public static class Operation {

        /* renamed from: a */
        @NonNull
        public State f4499a;

        /* renamed from: b */
        @NonNull
        public LifecycleImpact f4500b;

        /* renamed from: c */
        @NonNull
        public final Fragment f4501c;

        /* renamed from: d */
        @NonNull
        public final List<Runnable> f4502d = new ArrayList();

        /* renamed from: e */
        @NonNull
        public final HashSet<CancellationSignal> f4503e = new HashSet<>();

        /* renamed from: f */
        public boolean f4504f = false;

        /* renamed from: g */
        public boolean f4505g = false;

        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            @NonNull
            /* renamed from: b */
            public static State m3160b(int i2) {
                if (i2 == 0) {
                    return VISIBLE;
                }
                if (i2 == 4) {
                    return INVISIBLE;
                }
                if (i2 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException(C0000a.m7d("Unknown visibility ", i2));
            }

            @NonNull
            /* renamed from: c */
            public static State m3161c(@NonNull View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : m3160b(view.getVisibility());
            }

            /* renamed from: a */
            public void m3162a(@NonNull View view) {
                int ordinal = ordinal();
                if (ordinal == 0) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.m2992Q(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (ordinal == 1) {
                    if (FragmentManager.m2992Q(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (ordinal == 2) {
                    if (FragmentManager.m2992Q(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (ordinal != 3) {
                    return;
                }
                if (FragmentManager.m2992Q(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        public Operation(@NonNull State state, @NonNull LifecycleImpact lifecycleImpact, @NonNull Fragment fragment, @NonNull CancellationSignal cancellationSignal) {
            this.f4499a = state;
            this.f4500b = lifecycleImpact;
            this.f4501c = fragment;
            cancellationSignal.m1947c(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.SpecialEffectsController.Operation.1
                @Override // androidx.core.os.CancellationSignal.OnCancelListener
                public void onCancel() {
                    Operation.this.m3158a();
                }
            });
        }

        /* renamed from: a */
        public final void m3158a() {
            if (this.f4504f) {
                return;
            }
            this.f4504f = true;
            if (this.f4503e.isEmpty()) {
                mo3156b();
                return;
            }
            Iterator it = new ArrayList(this.f4503e).iterator();
            while (it.hasNext()) {
                ((CancellationSignal) it.next()).m1945a();
            }
        }

        @CallSuper
        /* renamed from: b */
        public void mo3156b() {
            if (this.f4505g) {
                return;
            }
            if (FragmentManager.m2992Q(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f4505g = true;
            Iterator<Runnable> it = this.f4502d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        /* renamed from: c */
        public final void m3159c(@NonNull State state, @NonNull LifecycleImpact lifecycleImpact) {
            State state2 = State.REMOVED;
            int ordinal = lifecycleImpact.ordinal();
            if (ordinal == 0) {
                if (this.f4499a != state2) {
                    if (FragmentManager.m2992Q(2)) {
                        StringBuilder m24u = C0000a.m24u("SpecialEffectsController: For fragment ");
                        m24u.append(this.f4501c);
                        m24u.append(" mFinalState = ");
                        m24u.append(this.f4499a);
                        m24u.append(" -> ");
                        m24u.append(state);
                        m24u.append(". ");
                        Log.v("FragmentManager", m24u.toString());
                    }
                    this.f4499a = state;
                    return;
                }
                return;
            }
            if (ordinal == 1) {
                if (this.f4499a == state2) {
                    if (FragmentManager.m2992Q(2)) {
                        StringBuilder m24u2 = C0000a.m24u("SpecialEffectsController: For fragment ");
                        m24u2.append(this.f4501c);
                        m24u2.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                        m24u2.append(this.f4500b);
                        m24u2.append(" to ADDING.");
                        Log.v("FragmentManager", m24u2.toString());
                    }
                    this.f4499a = State.VISIBLE;
                    this.f4500b = LifecycleImpact.ADDING;
                    return;
                }
                return;
            }
            if (ordinal != 2) {
                return;
            }
            if (FragmentManager.m2992Q(2)) {
                StringBuilder m24u3 = C0000a.m24u("SpecialEffectsController: For fragment ");
                m24u3.append(this.f4501c);
                m24u3.append(" mFinalState = ");
                m24u3.append(this.f4499a);
                m24u3.append(" -> REMOVED. mLifecycleImpact  = ");
                m24u3.append(this.f4500b);
                m24u3.append(" to REMOVING.");
                Log.v("FragmentManager", m24u3.toString());
            }
            this.f4499a = state2;
            this.f4500b = LifecycleImpact.REMOVING;
        }

        /* renamed from: d */
        public void mo3157d() {
        }

        @NonNull
        public String toString() {
            StringBuilder m27x = C0000a.m27x("Operation ", "{");
            m27x.append(Integer.toHexString(System.identityHashCode(this)));
            m27x.append("} ");
            m27x.append("{");
            m27x.append("mFinalState = ");
            m27x.append(this.f4499a);
            m27x.append("} ");
            m27x.append("{");
            m27x.append("mLifecycleImpact = ");
            m27x.append(this.f4500b);
            m27x.append("} ");
            m27x.append("{");
            m27x.append("mFragment = ");
            m27x.append(this.f4501c);
            m27x.append("}");
            return m27x.toString();
        }
    }

    public SpecialEffectsController(@NonNull ViewGroup viewGroup) {
        this.f4487a = viewGroup;
    }

    @NonNull
    /* renamed from: f */
    public static SpecialEffectsController m3148f(@NonNull ViewGroup viewGroup, @NonNull FragmentManager fragmentManager) {
        return m3149g(viewGroup, fragmentManager.m3007O());
    }

    @NonNull
    /* renamed from: g */
    public static SpecialEffectsController m3149g(@NonNull ViewGroup viewGroup, @NonNull SpecialEffectsControllerFactory specialEffectsControllerFactory) {
        Object tag = viewGroup.getTag(C2507R.id.special_effects_controller_view_tag);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController) tag;
        }
        SpecialEffectsController mo3063a = specialEffectsControllerFactory.mo3063a(viewGroup);
        viewGroup.setTag(C2507R.id.special_effects_controller_view_tag, mo3063a);
        return mo3063a;
    }

    /* renamed from: a */
    public final void m3150a(@NonNull Operation.State state, @NonNull Operation.LifecycleImpact lifecycleImpact, @NonNull FragmentStateManager fragmentStateManager) {
        synchronized (this.f4488b) {
            CancellationSignal cancellationSignal = new CancellationSignal();
            Operation m3152d = m3152d(fragmentStateManager.f4408c);
            if (m3152d != null) {
                m3152d.m3159c(state, lifecycleImpact);
                return;
            }
            final FragmentStateManagerOperation fragmentStateManagerOperation = new FragmentStateManagerOperation(state, lifecycleImpact, fragmentStateManager, cancellationSignal);
            this.f4488b.add(fragmentStateManagerOperation);
            fragmentStateManagerOperation.f4502d.add(new Runnable() { // from class: androidx.fragment.app.SpecialEffectsController.1
                @Override // java.lang.Runnable
                public void run() {
                    if (SpecialEffectsController.this.f4488b.contains(fragmentStateManagerOperation)) {
                        FragmentStateManagerOperation fragmentStateManagerOperation2 = fragmentStateManagerOperation;
                        fragmentStateManagerOperation2.f4499a.m3162a(fragmentStateManagerOperation2.f4501c.mView);
                    }
                }
            });
            fragmentStateManagerOperation.f4502d.add(new Runnable() { // from class: androidx.fragment.app.SpecialEffectsController.2
                @Override // java.lang.Runnable
                public void run() {
                    SpecialEffectsController.this.f4488b.remove(fragmentStateManagerOperation);
                    SpecialEffectsController.this.f4489c.remove(fragmentStateManagerOperation);
                }
            });
        }
    }

    /* renamed from: b */
    public abstract void mo2951b(@NonNull List<Operation> list, boolean z);

    /* renamed from: c */
    public void m3151c() {
        if (this.f4491e) {
            return;
        }
        if (!ViewCompat.m2173M(this.f4487a)) {
            m3153e();
            this.f4490d = false;
            return;
        }
        synchronized (this.f4488b) {
            if (!this.f4488b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f4489c);
                this.f4489c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Operation operation = (Operation) it.next();
                    if (FragmentManager.m2992Q(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + operation);
                    }
                    operation.m3158a();
                    if (!operation.f4505g) {
                        this.f4489c.add(operation);
                    }
                }
                m3155i();
                ArrayList arrayList2 = new ArrayList(this.f4488b);
                this.f4488b.clear();
                this.f4489c.addAll(arrayList2);
                if (FragmentManager.m2992Q(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((Operation) it2.next()).mo3157d();
                }
                mo2951b(arrayList2, this.f4490d);
                this.f4490d = false;
                if (FragmentManager.m2992Q(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                }
            }
        }
    }

    @Nullable
    /* renamed from: d */
    public final Operation m3152d(@NonNull Fragment fragment) {
        Iterator<Operation> it = this.f4488b.iterator();
        while (it.hasNext()) {
            Operation next = it.next();
            if (next.f4501c.equals(fragment) && !next.f4504f) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: e */
    public void m3153e() {
        String str;
        String str2;
        if (FragmentManager.m2992Q(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean m2173M = ViewCompat.m2173M(this.f4487a);
        synchronized (this.f4488b) {
            m3155i();
            Iterator<Operation> it = this.f4488b.iterator();
            while (it.hasNext()) {
                it.next().mo3157d();
            }
            Iterator it2 = new ArrayList(this.f4489c).iterator();
            while (it2.hasNext()) {
                Operation operation = (Operation) it2.next();
                if (FragmentManager.m2992Q(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (m2173M) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f4487a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(operation);
                    Log.v("FragmentManager", sb.toString());
                }
                operation.m3158a();
            }
            Iterator it3 = new ArrayList(this.f4488b).iterator();
            while (it3.hasNext()) {
                Operation operation2 = (Operation) it3.next();
                if (FragmentManager.m2992Q(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (m2173M) {
                        str = "";
                    } else {
                        str = "Container " + this.f4487a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(operation2);
                    Log.v("FragmentManager", sb2.toString());
                }
                operation2.m3158a();
            }
        }
    }

    /* renamed from: h */
    public void m3154h() {
        synchronized (this.f4488b) {
            m3155i();
            this.f4491e = false;
            int size = this.f4488b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Operation operation = this.f4488b.get(size);
                Operation.State m3161c = Operation.State.m3161c(operation.f4501c.mView);
                Operation.State state = operation.f4499a;
                Operation.State state2 = Operation.State.VISIBLE;
                if (state == state2 && m3161c != state2) {
                    this.f4491e = operation.f4501c.isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    /* renamed from: i */
    public final void m3155i() {
        Iterator<Operation> it = this.f4488b.iterator();
        while (it.hasNext()) {
            Operation next = it.next();
            if (next.f4500b == Operation.LifecycleImpact.ADDING) {
                next.m3159c(Operation.State.m3160b(next.f4501c.requireView().getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }
}
