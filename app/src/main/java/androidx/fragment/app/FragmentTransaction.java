package androidx.fragment.app;

import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class FragmentTransaction {

    /* renamed from: b */
    public int f4427b;

    /* renamed from: c */
    public int f4428c;

    /* renamed from: d */
    public int f4429d;

    /* renamed from: e */
    public int f4430e;

    /* renamed from: f */
    public int f4431f;

    /* renamed from: g */
    public boolean f4432g;

    /* renamed from: i */
    @Nullable
    public String f4434i;

    /* renamed from: j */
    public int f4435j;

    /* renamed from: k */
    public CharSequence f4436k;

    /* renamed from: l */
    public int f4437l;

    /* renamed from: m */
    public CharSequence f4438m;

    /* renamed from: n */
    public ArrayList<String> f4439n;

    /* renamed from: o */
    public ArrayList<String> f4440o;

    /* renamed from: a */
    public ArrayList<C0373Op> f4426a = new ArrayList<>();

    /* renamed from: h */
    public boolean f4433h = true;

    /* renamed from: p */
    public boolean f4441p = false;

    /* renamed from: androidx.fragment.app.FragmentTransaction$Op */
    public static final class C0373Op {

        /* renamed from: a */
        public int f4442a;

        /* renamed from: b */
        public Fragment f4443b;

        /* renamed from: c */
        public boolean f4444c;

        /* renamed from: d */
        public int f4445d;

        /* renamed from: e */
        public int f4446e;

        /* renamed from: f */
        public int f4447f;

        /* renamed from: g */
        public int f4448g;

        /* renamed from: h */
        public Lifecycle.State f4449h;

        /* renamed from: i */
        public Lifecycle.State f4450i;

        public C0373Op() {
        }

        public C0373Op(int i2, Fragment fragment) {
            this.f4442a = i2;
            this.f4443b = fragment;
            this.f4444c = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f4449h = state;
            this.f4450i = state;
        }

        public C0373Op(int i2, Fragment fragment, boolean z) {
            this.f4442a = i2;
            this.f4443b = fragment;
            this.f4444c = z;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f4449h = state;
            this.f4450i = state;
        }

        public C0373Op(int i2, @NonNull Fragment fragment, Lifecycle.State state) {
            this.f4442a = i2;
            this.f4443b = fragment;
            this.f4444c = false;
            this.f4449h = fragment.mMaxState;
            this.f4450i = state;
        }
    }

    @Deprecated
    public FragmentTransaction() {
    }

    /* renamed from: b */
    public void m3114b(C0373Op c0373Op) {
        this.f4426a.add(c0373Op);
        c0373Op.f4445d = this.f4427b;
        c0373Op.f4446e = this.f4428c;
        c0373Op.f4447f = this.f4429d;
        c0373Op.f4448g = this.f4430e;
    }

    @NonNull
    /* renamed from: c */
    public FragmentTransaction m3115c(@NonNull View view, @NonNull String str) {
        FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.f4451a;
        String m2165E = ViewCompat.m2165E(view);
        if (m2165E == null) {
            throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
        }
        if (this.f4439n == null) {
            this.f4439n = new ArrayList<>();
            this.f4440o = new ArrayList<>();
        } else {
            if (this.f4440o.contains(str)) {
                throw new IllegalArgumentException(C0000a.m16m("A shared element with the target name '", str, "' has already been added to the transaction."));
            }
            if (this.f4439n.contains(m2165E)) {
                throw new IllegalArgumentException(C0000a.m16m("A shared element with the source name '", m2165E, "' has already been added to the transaction."));
            }
        }
        this.f4439n.add(m2165E);
        this.f4440o.add(str);
        return this;
    }

    @NonNull
    /* renamed from: d */
    public FragmentTransaction m3116d(@NonNull Fragment fragment) {
        m3114b(new C0373Op(7, fragment));
        return this;
    }

    /* renamed from: e */
    public abstract int mo2936e();

    /* renamed from: f */
    public abstract int mo2937f();

    /* renamed from: g */
    public abstract void mo2938g();

    /* renamed from: h */
    public abstract void mo2939h();

    @NonNull
    /* renamed from: i */
    public FragmentTransaction mo2940i(@NonNull Fragment fragment) {
        m3114b(new C0373Op(6, fragment));
        return this;
    }

    @NonNull
    /* renamed from: j */
    public FragmentTransaction m3117j() {
        if (this.f4432g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f4433h = false;
        return this;
    }

    /* renamed from: k */
    public void mo2941k(int i2, Fragment fragment, @Nullable String str, int i3) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.m3163d(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder m24u = C0000a.m24u("Fragment ");
            m24u.append(cls.getCanonicalName());
            m24u.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(m24u.toString());
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(": was ");
                throw new IllegalStateException(C0000a.m21r(sb, fragment.mTag, " now ", str));
            }
            fragment.mTag = str;
        }
        if (i2 != 0) {
            if (i2 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i4 = fragment.mFragmentId;
            if (i4 != 0 && i4 != i2) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i2);
            }
            fragment.mFragmentId = i2;
            fragment.mContainerId = i2;
        }
        m3114b(new C0373Op(i3, fragment));
    }

    @NonNull
    /* renamed from: l */
    public FragmentTransaction mo2942l(@NonNull Fragment fragment) {
        m3114b(new C0373Op(4, fragment));
        return this;
    }

    @NonNull
    /* renamed from: m */
    public FragmentTransaction mo2943m(@NonNull Fragment fragment) {
        m3114b(new C0373Op(3, fragment));
        return this;
    }

    @NonNull
    /* renamed from: n */
    public FragmentTransaction m3118n(@IdRes int i2, @NonNull Fragment fragment) {
        if (i2 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        mo2941k(i2, fragment, null, 2);
        return this;
    }

    @NonNull
    /* renamed from: o */
    public FragmentTransaction mo2944o(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        m3114b(new C0373Op(10, fragment, state));
        return this;
    }

    @NonNull
    /* renamed from: p */
    public FragmentTransaction mo2945p(@Nullable Fragment fragment) {
        m3114b(new C0373Op(8, fragment));
        return this;
    }

    @NonNull
    /* renamed from: q */
    public FragmentTransaction mo2946q(@NonNull Fragment fragment) {
        m3114b(new C0373Op(5, fragment));
        return this;
    }

    public FragmentTransaction(@NonNull FragmentFactory fragmentFactory, @Nullable ClassLoader classLoader) {
    }
}
