package androidx.fragment.app;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import java.io.PrintWriter;
import java.util.ArrayList;
import p000a.C0000a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BackStackRecord extends FragmentTransaction implements FragmentManager.BackStackEntry, FragmentManager.OpGenerator {

    /* renamed from: q */
    public final FragmentManager f4197q;

    /* renamed from: r */
    public boolean f4198r;

    /* renamed from: s */
    public int f4199s;

    /* renamed from: t */
    public boolean f4200t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BackStackRecord(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r3) {
        /*
            r2 = this;
            androidx.fragment.app.FragmentFactory r0 = r3.m3005M()
            androidx.fragment.app.FragmentHostCallback<?> r1 = r3.f4358v
            if (r1 == 0) goto Lf
            android.content.Context r1 = r1.f4312c
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L10
        Lf:
            r1 = 0
        L10:
            r2.<init>(r0, r1)
            r0 = -1
            r2.f4199s = r0
            r0 = 0
            r2.f4200t = r0
            r2.f4197q = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.BackStackRecord.<init>(androidx.fragment.app.FragmentManager):void");
    }

    @Override // androidx.fragment.app.FragmentManager.OpGenerator
    /* renamed from: a */
    public boolean mo2935a(@NonNull ArrayList<BackStackRecord> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (FragmentManager.m2992Q(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f4432g) {
            return true;
        }
        FragmentManager fragmentManager = this.f4197q;
        if (fragmentManager.f4340d == null) {
            fragmentManager.f4340d = new ArrayList<>();
        }
        fragmentManager.f4340d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    /* renamed from: e */
    public int mo2936e() {
        return m2948s(false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    /* renamed from: f */
    public int mo2937f() {
        return m2948s(true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    /* renamed from: g */
    public void mo2938g() {
        m3117j();
        this.f4197q.m2995C(this, false);
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getId() {
        return this.f4199s;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    /* renamed from: h */
    public void mo2939h() {
        m3117j();
        this.f4197q.m2995C(this, true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @NonNull
    /* renamed from: i */
    public FragmentTransaction mo2940i(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f4197q) {
            super.mo2940i(fragment);
            return this;
        }
        StringBuilder m24u = C0000a.m24u("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        m24u.append(fragment.toString());
        m24u.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(m24u.toString());
    }

    @Override // androidx.fragment.app.FragmentTransaction
    /* renamed from: k */
    public void mo2941k(int i2, Fragment fragment, @Nullable String str, int i3) {
        super.mo2941k(i2, fragment, str, i3);
        fragment.mFragmentManager = this.f4197q;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @NonNull
    /* renamed from: l */
    public FragmentTransaction mo2942l(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f4197q) {
            super.mo2942l(fragment);
            return this;
        }
        StringBuilder m24u = C0000a.m24u("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
        m24u.append(fragment.toString());
        m24u.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(m24u.toString());
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @NonNull
    /* renamed from: m */
    public FragmentTransaction mo2943m(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f4197q) {
            super.mo2943m(fragment);
            return this;
        }
        StringBuilder m24u = C0000a.m24u("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        m24u.append(fragment.toString());
        m24u.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(m24u.toString());
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @NonNull
    /* renamed from: o */
    public FragmentTransaction mo2944o(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        if (fragment.mFragmentManager != this.f4197q) {
            StringBuilder m24u = C0000a.m24u("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            m24u.append(this.f4197q);
            throw new IllegalArgumentException(m24u.toString());
        }
        if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        }
        if (state != Lifecycle.State.DESTROYED) {
            super.mo2944o(fragment, state);
            return this;
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @NonNull
    /* renamed from: p */
    public FragmentTransaction mo2945p(@Nullable Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f4197q) {
            m3114b(new FragmentTransaction.C0373Op(8, fragment));
            return this;
        }
        StringBuilder m24u = C0000a.m24u("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
        m24u.append(fragment.toString());
        m24u.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(m24u.toString());
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @NonNull
    /* renamed from: q */
    public FragmentTransaction mo2946q(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f4197q) {
            m3114b(new FragmentTransaction.C0373Op(5, fragment));
            return this;
        }
        StringBuilder m24u = C0000a.m24u("Cannot show Fragment attached to a different FragmentManager. Fragment ");
        m24u.append(fragment.toString());
        m24u.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(m24u.toString());
    }

    /* renamed from: r */
    public void m2947r(int i2) {
        if (this.f4432g) {
            if (FragmentManager.m2992Q(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.f4426a.size();
            for (int i3 = 0; i3 < size; i3++) {
                FragmentTransaction.C0373Op c0373Op = this.f4426a.get(i3);
                Fragment fragment = c0373Op.f4443b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i2;
                    if (FragmentManager.m2992Q(2)) {
                        StringBuilder m24u = C0000a.m24u("Bump nesting of ");
                        m24u.append(c0373Op.f4443b);
                        m24u.append(" to ");
                        m24u.append(c0373Op.f4443b.mBackStackNesting);
                        Log.v("FragmentManager", m24u.toString());
                    }
                }
            }
        }
    }

    /* renamed from: s */
    public int m2948s(boolean z) {
        if (this.f4198r) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.m2992Q(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new LogWriter("FragmentManager"));
            m2949t("  ", printWriter, true);
            printWriter.close();
        }
        this.f4198r = true;
        if (this.f4432g) {
            this.f4199s = this.f4197q.f4345i.getAndIncrement();
        } else {
            this.f4199s = -1;
        }
        this.f4197q.m3062z(this, z);
        return this.f4199s;
    }

    /* renamed from: t */
    public void m2949t(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f4434i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f4199s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f4198r);
            if (this.f4431f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f4431f));
            }
            if (this.f4427b != 0 || this.f4428c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4427b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4428c));
            }
            if (this.f4429d != 0 || this.f4430e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4429d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4430e));
            }
            if (this.f4435j != 0 || this.f4436k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4435j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f4436k);
            }
            if (this.f4437l != 0 || this.f4438m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4437l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f4438m);
            }
        }
        if (this.f4426a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f4426a.size();
        for (int i2 = 0; i2 < size; i2++) {
            FragmentTransaction.C0373Op c0373Op = this.f4426a.get(i2);
            switch (c0373Op.f4442a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    StringBuilder m24u = C0000a.m24u("cmd=");
                    m24u.append(c0373Op.f4442a);
                    str2 = m24u.toString();
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0373Op.f4443b);
            if (z) {
                if (c0373Op.f4445d != 0 || c0373Op.f4446e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0373Op.f4445d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0373Op.f4446e));
                }
                if (c0373Op.f4447f != 0 || c0373Op.f4448g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0373Op.f4447f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0373Op.f4448g));
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f4199s >= 0) {
            sb.append(" #");
            sb.append(this.f4199s);
        }
        if (this.f4434i != null) {
            sb.append(" ");
            sb.append(this.f4434i);
        }
        sb.append("}");
        return sb.toString();
    }
}
