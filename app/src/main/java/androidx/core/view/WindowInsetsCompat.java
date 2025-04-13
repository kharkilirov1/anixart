package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.Insets;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.C0000a;

/* loaded from: classes.dex */
public class WindowInsetsCompat {

    /* renamed from: b */
    @NonNull
    public static final WindowInsetsCompat f3698b;

    /* renamed from: a */
    public final Impl f3699a;

    @RequiresApi
    @SuppressLint
    public static class Api21ReflectionHolder {

        /* renamed from: a */
        public static Field f3700a;

        /* renamed from: b */
        public static Field f3701b;

        /* renamed from: c */
        public static Field f3702c;

        /* renamed from: d */
        public static boolean f3703d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f3700a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f3701b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f3702c = declaredField3;
                declaredField3.setAccessible(true);
                f3703d = true;
            } catch (ReflectiveOperationException e2) {
                StringBuilder m24u = C0000a.m24u("Failed to get visible insets from AttachInfo ");
                m24u.append(e2.getMessage());
                Log.w("WindowInsetsCompat", m24u.toString(), e2);
            }
        }
    }

    public static class BuilderImpl {

        /* renamed from: a */
        public final WindowInsetsCompat f3705a;

        /* renamed from: b */
        public Insets[] f3706b;

        public BuilderImpl() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }

        /* renamed from: a */
        public final void m2435a() {
            Insets[] insetsArr = this.f3706b;
            if (insetsArr != null) {
                Insets insets = insetsArr[Type.m2467a(1)];
                Insets insets2 = this.f3706b[Type.m2467a(2)];
                if (insets2 == null) {
                    insets2 = this.f3705a.m2423d(2);
                }
                if (insets == null) {
                    insets = this.f3705a.m2423d(1);
                }
                mo2441g(Insets.m1778a(insets, insets2));
                Insets insets3 = this.f3706b[Type.m2467a(16)];
                if (insets3 != null) {
                    mo2440f(insets3);
                }
                Insets insets4 = this.f3706b[Type.m2467a(32)];
                if (insets4 != null) {
                    mo2438d(insets4);
                }
                Insets insets5 = this.f3706b[Type.m2467a(64)];
                if (insets5 != null) {
                    mo2442h(insets5);
                }
            }
        }

        @NonNull
        /* renamed from: b */
        public WindowInsetsCompat mo2436b() {
            m2435a();
            return this.f3705a;
        }

        /* renamed from: c */
        public void mo2437c(int i2, @NonNull Insets insets) {
            if (this.f3706b == null) {
                this.f3706b = new Insets[9];
            }
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    this.f3706b[Type.m2467a(i3)] = insets;
                }
            }
        }

        /* renamed from: d */
        public void mo2438d(@NonNull Insets insets) {
        }

        /* renamed from: e */
        public void mo2439e(@NonNull Insets insets) {
        }

        /* renamed from: f */
        public void mo2440f(@NonNull Insets insets) {
        }

        /* renamed from: g */
        public void mo2441g(@NonNull Insets insets) {
        }

        /* renamed from: h */
        public void mo2442h(@NonNull Insets insets) {
        }

        public BuilderImpl(@NonNull WindowInsetsCompat windowInsetsCompat) {
            this.f3705a = windowInsetsCompat;
        }
    }

    @RequiresApi
    public static class BuilderImpl30 extends BuilderImpl29 {
        public BuilderImpl30() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        /* renamed from: c */
        public void mo2437c(int i2, @NonNull Insets insets) {
            this.f3713c.setInsets(TypeImpl30.m2468a(i2), insets.m1781d());
        }

        public BuilderImpl30(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    public static class Impl {

        /* renamed from: b */
        @NonNull
        public static final WindowInsetsCompat f3714b = new Builder().m2433a().f3699a.mo2444a().f3699a.mo2445b().m2422c();

        /* renamed from: a */
        public final WindowInsetsCompat f3715a;

        public Impl(@NonNull WindowInsetsCompat windowInsetsCompat) {
            this.f3715a = windowInsetsCompat;
        }

        @NonNull
        /* renamed from: a */
        public WindowInsetsCompat mo2444a() {
            return this.f3715a;
        }

        @NonNull
        /* renamed from: b */
        public WindowInsetsCompat mo2445b() {
            return this.f3715a;
        }

        @NonNull
        /* renamed from: c */
        public WindowInsetsCompat mo2446c() {
            return this.f3715a;
        }

        /* renamed from: d */
        public void mo2447d(@NonNull View view) {
        }

        @Nullable
        /* renamed from: e */
        public DisplayCutoutCompat mo2448e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl)) {
                return false;
            }
            Impl impl = (Impl) obj;
            return mo2457n() == impl.mo2457n() && mo2456m() == impl.mo2456m() && ObjectsCompat.m2022a(mo2453j(), impl.mo2453j()) && ObjectsCompat.m2022a(mo2451h(), impl.mo2451h()) && ObjectsCompat.m2022a(mo2448e(), impl.mo2448e());
        }

        @NonNull
        /* renamed from: f */
        public Insets mo2449f(int i2) {
            return Insets.f3367e;
        }

        @NonNull
        /* renamed from: g */
        public Insets mo2450g() {
            return mo2453j();
        }

        @NonNull
        /* renamed from: h */
        public Insets mo2451h() {
            return Insets.f3367e;
        }

        public int hashCode() {
            return ObjectsCompat.m2023b(Boolean.valueOf(mo2457n()), Boolean.valueOf(mo2456m()), mo2453j(), mo2451h(), mo2448e());
        }

        @NonNull
        /* renamed from: i */
        public Insets mo2452i() {
            return mo2453j();
        }

        @NonNull
        /* renamed from: j */
        public Insets mo2453j() {
            return Insets.f3367e;
        }

        @NonNull
        /* renamed from: k */
        public Insets mo2454k() {
            return mo2453j();
        }

        @NonNull
        /* renamed from: l */
        public WindowInsetsCompat mo2455l(int i2, int i3, int i4, int i5) {
            return f3714b;
        }

        /* renamed from: m */
        public boolean mo2456m() {
            return false;
        }

        /* renamed from: n */
        public boolean mo2457n() {
            return false;
        }

        /* renamed from: o */
        public void mo2458o(Insets[] insetsArr) {
        }

        /* renamed from: p */
        public void mo2459p(@Nullable WindowInsetsCompat windowInsetsCompat) {
        }

        /* renamed from: q */
        public void mo2460q(Insets insets) {
        }
    }

    @RequiresApi
    public static class Impl20 extends Impl {

        /* renamed from: h */
        public static boolean f3716h = false;

        /* renamed from: i */
        public static Method f3717i;

        /* renamed from: j */
        public static Class<?> f3718j;

        /* renamed from: k */
        public static Field f3719k;

        /* renamed from: l */
        public static Field f3720l;

        /* renamed from: c */
        @NonNull
        public final WindowInsets f3721c;

        /* renamed from: d */
        public Insets[] f3722d;

        /* renamed from: e */
        public Insets f3723e;

        /* renamed from: f */
        public WindowInsetsCompat f3724f;

        /* renamed from: g */
        public Insets f3725g;

        public Impl20(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.f3723e = null;
            this.f3721c = windowInsets;
        }

        @NonNull
        @SuppressLint
        /* renamed from: r */
        private Insets m2461r(int i2, boolean z) {
            Insets insets = Insets.f3367e;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    insets = Insets.m1778a(insets, m2465s(i3, z));
                }
            }
            return insets;
        }

        /* renamed from: t */
        private Insets m2462t() {
            WindowInsetsCompat windowInsetsCompat = this.f3724f;
            return windowInsetsCompat != null ? windowInsetsCompat.f3699a.mo2451h() : Insets.f3367e;
        }

        @Nullable
        /* renamed from: u */
        private Insets m2463u(@NonNull View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f3716h) {
                m2464v();
            }
            Method method = f3717i;
            if (method != null && f3718j != null && f3719k != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f3719k.get(f3720l.get(invoke));
                    if (rect != null) {
                        return Insets.m1779b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e2) {
                    StringBuilder m24u = C0000a.m24u("Failed to get visible insets. (Reflection error). ");
                    m24u.append(e2.getMessage());
                    Log.e("WindowInsetsCompat", m24u.toString(), e2);
                }
            }
            return null;
        }

        @SuppressLint
        /* renamed from: v */
        private static void m2464v() {
            try {
                f3717i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f3718j = cls;
                f3719k = cls.getDeclaredField("mVisibleInsets");
                f3720l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f3719k.setAccessible(true);
                f3720l.setAccessible(true);
            } catch (ReflectiveOperationException e2) {
                StringBuilder m24u = C0000a.m24u("Failed to get visible insets. (Reflection error). ");
                m24u.append(e2.getMessage());
                Log.e("WindowInsetsCompat", m24u.toString(), e2);
            }
            f3716h = true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        /* renamed from: d */
        public void mo2447d(@NonNull View view) {
            Insets m2463u = m2463u(view);
            if (m2463u == null) {
                m2463u = Insets.f3367e;
            }
            m2466w(m2463u);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f3725g, ((Impl20) obj).f3725g);
            }
            return false;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* renamed from: f */
        public Insets mo2449f(int i2) {
            return m2461r(i2, false);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* renamed from: j */
        public final Insets mo2453j() {
            if (this.f3723e == null) {
                this.f3723e = Insets.m1779b(this.f3721c.getSystemWindowInsetLeft(), this.f3721c.getSystemWindowInsetTop(), this.f3721c.getSystemWindowInsetRight(), this.f3721c.getSystemWindowInsetBottom());
            }
            return this.f3723e;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* renamed from: l */
        public WindowInsetsCompat mo2455l(int i2, int i3, int i4, int i5) {
            Builder builder = new Builder(WindowInsetsCompat.m2418o(this.f3721c));
            builder.f3704a.mo2441g(WindowInsetsCompat.m2417k(mo2453j(), i2, i3, i4, i5));
            builder.f3704a.mo2439e(WindowInsetsCompat.m2417k(mo2451h(), i2, i3, i4, i5));
            return builder.m2433a();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        /* renamed from: n */
        public boolean mo2457n() {
            return this.f3721c.isRound();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        /* renamed from: o */
        public void mo2458o(Insets[] insetsArr) {
            this.f3722d = insetsArr;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        /* renamed from: p */
        public void mo2459p(@Nullable WindowInsetsCompat windowInsetsCompat) {
            this.f3724f = windowInsetsCompat;
        }

        @NonNull
        /* renamed from: s */
        public Insets m2465s(int i2, boolean z) {
            Insets mo2451h;
            int i3;
            if (i2 == 1) {
                return z ? Insets.m1779b(0, Math.max(m2462t().f3369b, mo2453j().f3369b), 0, 0) : Insets.m1779b(0, mo2453j().f3369b, 0, 0);
            }
            if (i2 == 2) {
                if (z) {
                    Insets m2462t = m2462t();
                    Insets mo2451h2 = mo2451h();
                    return Insets.m1779b(Math.max(m2462t.f3368a, mo2451h2.f3368a), 0, Math.max(m2462t.f3370c, mo2451h2.f3370c), Math.max(m2462t.f3371d, mo2451h2.f3371d));
                }
                Insets mo2453j = mo2453j();
                WindowInsetsCompat windowInsetsCompat = this.f3724f;
                mo2451h = windowInsetsCompat != null ? windowInsetsCompat.f3699a.mo2451h() : null;
                int i4 = mo2453j.f3371d;
                if (mo2451h != null) {
                    i4 = Math.min(i4, mo2451h.f3371d);
                }
                return Insets.m1779b(mo2453j.f3368a, 0, mo2453j.f3370c, i4);
            }
            if (i2 == 8) {
                Insets[] insetsArr = this.f3722d;
                mo2451h = insetsArr != null ? insetsArr[Type.m2467a(8)] : null;
                if (mo2451h != null) {
                    return mo2451h;
                }
                Insets mo2453j2 = mo2453j();
                Insets m2462t2 = m2462t();
                int i5 = mo2453j2.f3371d;
                if (i5 > m2462t2.f3371d) {
                    return Insets.m1779b(0, 0, 0, i5);
                }
                Insets insets = this.f3725g;
                return (insets == null || insets.equals(Insets.f3367e) || (i3 = this.f3725g.f3371d) <= m2462t2.f3371d) ? Insets.f3367e : Insets.m1779b(0, 0, 0, i3);
            }
            if (i2 == 16) {
                return mo2452i();
            }
            if (i2 == 32) {
                return mo2450g();
            }
            if (i2 == 64) {
                return mo2454k();
            }
            if (i2 != 128) {
                return Insets.f3367e;
            }
            WindowInsetsCompat windowInsetsCompat2 = this.f3724f;
            DisplayCutoutCompat mo2448e = windowInsetsCompat2 != null ? windowInsetsCompat2.f3699a.mo2448e() : mo2448e();
            if (mo2448e == null) {
                return Insets.f3367e;
            }
            int i6 = Build.VERSION.SDK_INT;
            return Insets.m1779b(i6 >= 28 ? DisplayCutoutCompat.Api28Impl.m2074d(mo2448e.f3589a) : 0, i6 >= 28 ? DisplayCutoutCompat.Api28Impl.m2076f(mo2448e.f3589a) : 0, i6 >= 28 ? DisplayCutoutCompat.Api28Impl.m2075e(mo2448e.f3589a) : 0, i6 >= 28 ? DisplayCutoutCompat.Api28Impl.m2073c(mo2448e.f3589a) : 0);
        }

        /* renamed from: w */
        public void m2466w(@NonNull Insets insets) {
            this.f3725g = insets;
        }
    }

    @RequiresApi
    public static class Impl21 extends Impl20 {

        /* renamed from: m */
        public Insets f3726m;

        public Impl21(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f3726m = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* renamed from: b */
        public WindowInsetsCompat mo2445b() {
            return WindowInsetsCompat.m2418o(this.f3721c.consumeStableInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* renamed from: c */
        public WindowInsetsCompat mo2446c() {
            return WindowInsetsCompat.m2418o(this.f3721c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* renamed from: h */
        public final Insets mo2451h() {
            if (this.f3726m == null) {
                this.f3726m = Insets.m1779b(this.f3721c.getStableInsetLeft(), this.f3721c.getStableInsetTop(), this.f3721c.getStableInsetRight(), this.f3721c.getStableInsetBottom());
            }
            return this.f3726m;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        /* renamed from: m */
        public boolean mo2456m() {
            return this.f3721c.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        /* renamed from: q */
        public void mo2460q(@Nullable Insets insets) {
            this.f3726m = insets;
        }
    }

    @RequiresApi
    public static class Impl28 extends Impl21 {
        public Impl28(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* renamed from: a */
        public WindowInsetsCompat mo2444a() {
            return WindowInsetsCompat.m2418o(this.f3721c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @Nullable
        /* renamed from: e */
        public DisplayCutoutCompat mo2448e() {
            DisplayCutout displayCutout = this.f3721c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new DisplayCutoutCompat(displayCutout);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl28)) {
                return false;
            }
            Impl28 impl28 = (Impl28) obj;
            return Objects.equals(this.f3721c, impl28.f3721c) && Objects.equals(this.f3725g, impl28.f3725g);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public int hashCode() {
            return this.f3721c.hashCode();
        }
    }

    @RequiresApi
    public static class Impl29 extends Impl28 {

        /* renamed from: n */
        public Insets f3727n;

        /* renamed from: o */
        public Insets f3728o;

        /* renamed from: p */
        public Insets f3729p;

        public Impl29(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f3727n = null;
            this.f3728o = null;
            this.f3729p = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* renamed from: g */
        public Insets mo2450g() {
            if (this.f3728o == null) {
                this.f3728o = Insets.m1780c(this.f3721c.getMandatorySystemGestureInsets());
            }
            return this.f3728o;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* renamed from: i */
        public Insets mo2452i() {
            if (this.f3727n == null) {
                this.f3727n = Insets.m1780c(this.f3721c.getSystemGestureInsets());
            }
            return this.f3727n;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* renamed from: k */
        public Insets mo2454k() {
            if (this.f3729p == null) {
                this.f3729p = Insets.m1780c(this.f3721c.getTappableElementInsets());
            }
            return this.f3729p;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* renamed from: l */
        public WindowInsetsCompat mo2455l(int i2, int i3, int i4, int i5) {
            return WindowInsetsCompat.m2418o(this.f3721c.inset(i2, i3, i4, i5));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl21, androidx.core.view.WindowInsetsCompat.Impl
        /* renamed from: q */
        public void mo2460q(@Nullable Insets insets) {
        }
    }

    @RequiresApi
    public static class Impl30 extends Impl29 {

        /* renamed from: q */
        @NonNull
        public static final WindowInsetsCompat f3730q = WindowInsetsCompat.m2418o(WindowInsets.CONSUMED);

        public Impl30(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        /* renamed from: d */
        public final void mo2447d(@NonNull View view) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        /* renamed from: f */
        public Insets mo2449f(int i2) {
            return Insets.m1780c(this.f3721c.getInsets(TypeImpl30.m2468a(i2)));
        }
    }

    public static final class Type {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface InsetsType {
        }

        /* renamed from: a */
        public static int m2467a(int i2) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 2) {
                return 1;
            }
            if (i2 == 4) {
                return 2;
            }
            if (i2 == 8) {
                return 3;
            }
            if (i2 == 16) {
                return 4;
            }
            if (i2 == 32) {
                return 5;
            }
            if (i2 == 64) {
                return 6;
            }
            if (i2 == 128) {
                return 7;
            }
            if (i2 == 256) {
                return 8;
            }
            throw new IllegalArgumentException(C0000a.m7d("type needs to be >= FIRST and <= LAST, type=", i2));
        }
    }

    @RequiresApi
    public static final class TypeImpl30 {
        private TypeImpl30() {
        }

        /* renamed from: a */
        public static int m2468a(int i2) {
            int statusBars;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i2 & i4) != 0) {
                    if (i4 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i4 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i4 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i4 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i4 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i4 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i4 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i3 |= statusBars;
                }
            }
            return i3;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f3698b = Impl30.f3730q;
        } else {
            f3698b = Impl.f3714b;
        }
    }

    @RequiresApi
    public WindowInsetsCompat(@NonNull WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f3699a = new Impl30(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f3699a = new Impl29(this, windowInsets);
        } else if (i2 >= 28) {
            this.f3699a = new Impl28(this, windowInsets);
        } else {
            this.f3699a = new Impl21(this, windowInsets);
        }
    }

    /* renamed from: k */
    public static Insets m2417k(@NonNull Insets insets, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, insets.f3368a - i2);
        int max2 = Math.max(0, insets.f3369b - i3);
        int max3 = Math.max(0, insets.f3370c - i4);
        int max4 = Math.max(0, insets.f3371d - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? insets : Insets.m1779b(max, max2, max3, max4);
    }

    @NonNull
    @RequiresApi
    /* renamed from: o */
    public static WindowInsetsCompat m2418o(@NonNull WindowInsets windowInsets) {
        return m2419p(windowInsets, null);
    }

    @NonNull
    @RequiresApi
    /* renamed from: p */
    public static WindowInsetsCompat m2419p(@NonNull WindowInsets windowInsets, @Nullable View view) {
        Objects.requireNonNull(windowInsets);
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat(windowInsets);
        if (view != null) {
            WeakHashMap<View, ViewPropertyAnimatorCompat> weakHashMap = ViewCompat.f3638a;
            if (ViewCompat.Api19Impl.m2280b(view)) {
                windowInsetsCompat.f3699a.mo2459p(ViewCompat.m2163D(view));
                windowInsetsCompat.f3699a.mo2447d(view.getRootView());
            }
        }
        return windowInsetsCompat;
    }

    @NonNull
    @Deprecated
    /* renamed from: a */
    public WindowInsetsCompat m2420a() {
        return this.f3699a.mo2444a();
    }

    @NonNull
    @Deprecated
    /* renamed from: b */
    public WindowInsetsCompat m2421b() {
        return this.f3699a.mo2445b();
    }

    @NonNull
    @Deprecated
    /* renamed from: c */
    public WindowInsetsCompat m2422c() {
        return this.f3699a.mo2446c();
    }

    @NonNull
    /* renamed from: d */
    public Insets m2423d(int i2) {
        return this.f3699a.mo2449f(i2);
    }

    @NonNull
    @Deprecated
    /* renamed from: e */
    public Insets m2424e() {
        return this.f3699a.mo2452i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WindowInsetsCompat) {
            return ObjectsCompat.m2022a(this.f3699a, ((WindowInsetsCompat) obj).f3699a);
        }
        return false;
    }

    @Deprecated
    /* renamed from: f */
    public int m2425f() {
        return this.f3699a.mo2453j().f3371d;
    }

    @Deprecated
    /* renamed from: g */
    public int m2426g() {
        return this.f3699a.mo2453j().f3368a;
    }

    @Deprecated
    /* renamed from: h */
    public int m2427h() {
        return this.f3699a.mo2453j().f3370c;
    }

    public int hashCode() {
        Impl impl = this.f3699a;
        if (impl == null) {
            return 0;
        }
        return impl.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public int m2428i() {
        return this.f3699a.mo2453j().f3369b;
    }

    @NonNull
    /* renamed from: j */
    public WindowInsetsCompat m2429j(@IntRange int i2, @IntRange int i3, @IntRange int i4, @IntRange int i5) {
        return this.f3699a.mo2455l(i2, i3, i4, i5);
    }

    /* renamed from: l */
    public boolean m2430l() {
        return this.f3699a.mo2456m();
    }

    @NonNull
    @Deprecated
    /* renamed from: m */
    public WindowInsetsCompat m2431m(int i2, int i3, int i4, int i5) {
        Builder builder = new Builder(this);
        builder.f3704a.mo2441g(Insets.m1779b(i2, i3, i4, i5));
        return builder.m2433a();
    }

    @Nullable
    @RequiresApi
    /* renamed from: n */
    public WindowInsets m2432n() {
        Impl impl = this.f3699a;
        if (impl instanceof Impl20) {
            return ((Impl20) impl).f3721c;
        }
        return null;
    }

    @RequiresApi
    public static class BuilderImpl20 extends BuilderImpl {

        /* renamed from: e */
        public static Field f3707e = null;

        /* renamed from: f */
        public static boolean f3708f = false;

        /* renamed from: g */
        public static Constructor<WindowInsets> f3709g = null;

        /* renamed from: h */
        public static boolean f3710h = false;

        /* renamed from: c */
        public WindowInsets f3711c;

        /* renamed from: d */
        public Insets f3712d;

        public BuilderImpl20() {
            this.f3711c = m2443i();
        }

        @Nullable
        /* renamed from: i */
        private static WindowInsets m2443i() {
            if (!f3708f) {
                try {
                    f3707e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f3708f = true;
            }
            Field field = f3707e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!f3710h) {
                try {
                    f3709g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f3710h = true;
            }
            Constructor<WindowInsets> constructor = f3709g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        @NonNull
        /* renamed from: b */
        public WindowInsetsCompat mo2436b() {
            m2435a();
            WindowInsetsCompat m2418o = WindowInsetsCompat.m2418o(this.f3711c);
            m2418o.f3699a.mo2458o(this.f3706b);
            m2418o.f3699a.mo2460q(this.f3712d);
            return m2418o;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        /* renamed from: e */
        public void mo2439e(@Nullable Insets insets) {
            this.f3712d = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        /* renamed from: g */
        public void mo2441g(@NonNull Insets insets) {
            WindowInsets windowInsets = this.f3711c;
            if (windowInsets != null) {
                this.f3711c = windowInsets.replaceSystemWindowInsets(insets.f3368a, insets.f3369b, insets.f3370c, insets.f3371d);
            }
        }

        public BuilderImpl20(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.f3711c = windowInsetsCompat.m2432n();
        }
    }

    @RequiresApi
    public static class BuilderImpl29 extends BuilderImpl {

        /* renamed from: c */
        public final WindowInsets.Builder f3713c;

        public BuilderImpl29() {
            this.f3713c = new WindowInsets.Builder();
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        @NonNull
        /* renamed from: b */
        public WindowInsetsCompat mo2436b() {
            m2435a();
            WindowInsetsCompat m2418o = WindowInsetsCompat.m2418o(this.f3713c.build());
            m2418o.f3699a.mo2458o(this.f3706b);
            return m2418o;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        /* renamed from: d */
        public void mo2438d(@NonNull Insets insets) {
            this.f3713c.setMandatorySystemGestureInsets(insets.m1781d());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        /* renamed from: e */
        public void mo2439e(@NonNull Insets insets) {
            this.f3713c.setStableInsets(insets.m1781d());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        /* renamed from: f */
        public void mo2440f(@NonNull Insets insets) {
            this.f3713c.setSystemGestureInsets(insets.m1781d());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        /* renamed from: g */
        public void mo2441g(@NonNull Insets insets) {
            this.f3713c.setSystemWindowInsets(insets.m1781d());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        /* renamed from: h */
        public void mo2442h(@NonNull Insets insets) {
            this.f3713c.setTappableElementInsets(insets.m1781d());
        }

        public BuilderImpl29(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            WindowInsets.Builder builder;
            WindowInsets m2432n = windowInsetsCompat.m2432n();
            if (m2432n != null) {
                builder = new WindowInsets.Builder(m2432n);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f3713c = builder;
        }
    }

    public static final class Builder {

        /* renamed from: a */
        public final BuilderImpl f3704a;

        public Builder() {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                this.f3704a = new BuilderImpl30();
            } else if (i2 >= 29) {
                this.f3704a = new BuilderImpl29();
            } else {
                this.f3704a = new BuilderImpl20();
            }
        }

        @NonNull
        /* renamed from: a */
        public WindowInsetsCompat m2433a() {
            return this.f3704a.mo2436b();
        }

        @NonNull
        @Deprecated
        /* renamed from: b */
        public Builder m2434b(@NonNull Insets insets) {
            this.f3704a.mo2441g(insets);
            return this;
        }

        public Builder(@NonNull WindowInsetsCompat windowInsetsCompat) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                this.f3704a = new BuilderImpl30(windowInsetsCompat);
            } else if (i2 >= 29) {
                this.f3704a = new BuilderImpl29(windowInsetsCompat);
            } else {
                this.f3704a = new BuilderImpl20(windowInsetsCompat);
            }
        }
    }

    public WindowInsetsCompat(@Nullable WindowInsetsCompat windowInsetsCompat) {
        this.f3699a = new Impl(this);
    }
}
