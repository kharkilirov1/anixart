package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class WindowInsetsAnimationCompat {

    /* renamed from: a */
    public Impl f3677a;

    public static final class BoundsCompat {

        /* renamed from: a */
        public final Insets f3678a;

        /* renamed from: b */
        public final Insets f3679b;

        public BoundsCompat(@NonNull Insets insets, @NonNull Insets insets2) {
            this.f3678a = insets;
            this.f3679b = insets2;
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("Bounds{lower=");
            m24u.append(this.f3678a);
            m24u.append(" upper=");
            m24u.append(this.f3679b);
            m24u.append("}");
            return m24u.toString();
        }
    }

    public static abstract class Callback {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface DispatchMode {
        }
    }

    public static class Impl {

        /* renamed from: a */
        public float f3680a;

        /* renamed from: b */
        @Nullable
        public final Interpolator f3681b;

        /* renamed from: c */
        public final long f3682c;

        public Impl(int i2, @Nullable Interpolator interpolator, long j2) {
            this.f3681b = interpolator;
            this.f3682c = j2;
        }

        /* renamed from: a */
        public long mo2408a() {
            return this.f3682c;
        }

        /* renamed from: b */
        public float mo2409b() {
            Interpolator interpolator = this.f3681b;
            return interpolator != null ? interpolator.getInterpolation(this.f3680a) : this.f3680a;
        }

        /* renamed from: c */
        public void mo2410c(float f2) {
            this.f3680a = f2;
        }
    }

    @RequiresApi
    public static class Impl21 extends Impl {

        @RequiresApi
        public static class Impl21OnApplyWindowInsetsListener implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            public WindowInsetsCompat f3683a;

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(final View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f3683a = WindowInsetsCompat.m2419p(windowInsets, view);
                    return Impl21.m2415h(view, windowInsets);
                }
                final WindowInsetsCompat m2419p = WindowInsetsCompat.m2419p(windowInsets, view);
                if (this.f3683a == null) {
                    this.f3683a = ViewCompat.m2163D(view);
                }
                if (this.f3683a == null) {
                    this.f3683a = m2419p;
                    return Impl21.m2415h(view, windowInsets);
                }
                Impl21.m2416i(view);
                WindowInsetsCompat windowInsetsCompat = this.f3683a;
                final int i2 = 0;
                for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                    if (!m2419p.m2423d(i3).equals(windowInsetsCompat.m2423d(i3))) {
                        i2 |= i3;
                    }
                }
                if (i2 == 0) {
                    return Impl21.m2415h(view, windowInsets);
                }
                final WindowInsetsCompat windowInsetsCompat2 = this.f3683a;
                final WindowInsetsAnimationCompat windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(i2, new DecelerateInterpolator(), 160L);
                windowInsetsAnimationCompat.f3677a.mo2410c(0.0f);
                final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(windowInsetsAnimationCompat.f3677a.mo2408a());
                Insets mo2449f = m2419p.f3699a.mo2449f(i2);
                Insets mo2449f2 = windowInsetsCompat2.f3699a.mo2449f(i2);
                final BoundsCompat boundsCompat = new BoundsCompat(Insets.m1779b(Math.min(mo2449f.f3368a, mo2449f2.f3368a), Math.min(mo2449f.f3369b, mo2449f2.f3369b), Math.min(mo2449f.f3370c, mo2449f2.f3370c), Math.min(mo2449f.f3371d, mo2449f2.f3371d)), Insets.m1779b(Math.max(mo2449f.f3368a, mo2449f2.f3368a), Math.max(mo2449f.f3369b, mo2449f2.f3369b), Math.max(mo2449f.f3370c, mo2449f2.f3370c), Math.max(mo2449f.f3371d, mo2449f2.f3371d)));
                Impl21.m2412e(view, windowInsetsAnimationCompat, windowInsets, false);
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        WindowInsetsCompat windowInsetsCompat3;
                        WindowInsetsCompat windowInsetsCompat4;
                        float f2;
                        windowInsetsAnimationCompat.f3677a.mo2410c(valueAnimator.getAnimatedFraction());
                        WindowInsetsCompat windowInsetsCompat5 = m2419p;
                        WindowInsetsCompat windowInsetsCompat6 = windowInsetsCompat2;
                        float mo2409b = windowInsetsAnimationCompat.f3677a.mo2409b();
                        int i4 = i2;
                        WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder(windowInsetsCompat5);
                        int i5 = 1;
                        while (i5 <= 256) {
                            if ((i4 & i5) == 0) {
                                builder.f3704a.mo2437c(i5, windowInsetsCompat5.m2423d(i5));
                                windowInsetsCompat3 = windowInsetsCompat5;
                                windowInsetsCompat4 = windowInsetsCompat6;
                                f2 = mo2409b;
                            } else {
                                Insets m2423d = windowInsetsCompat5.m2423d(i5);
                                Insets m2423d2 = windowInsetsCompat6.m2423d(i5);
                                float f3 = 1.0f - mo2409b;
                                int i6 = (int) (((m2423d.f3368a - m2423d2.f3368a) * f3) + 0.5d);
                                int i7 = (int) (((m2423d.f3369b - m2423d2.f3369b) * f3) + 0.5d);
                                float f4 = (m2423d.f3370c - m2423d2.f3370c) * f3;
                                windowInsetsCompat3 = windowInsetsCompat5;
                                windowInsetsCompat4 = windowInsetsCompat6;
                                float f5 = (m2423d.f3371d - m2423d2.f3371d) * f3;
                                f2 = mo2409b;
                                builder.f3704a.mo2437c(i5, WindowInsetsCompat.m2417k(m2423d, i6, i7, (int) (f4 + 0.5d), (int) (f5 + 0.5d)));
                            }
                            i5 <<= 1;
                            windowInsetsCompat6 = windowInsetsCompat4;
                            mo2409b = f2;
                            windowInsetsCompat5 = windowInsetsCompat3;
                        }
                        Impl21.m2413f(view, builder.m2433a(), Collections.singletonList(windowInsetsAnimationCompat));
                    }
                });
                duration.addListener(new AnimatorListenerAdapter(this) { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        windowInsetsAnimationCompat.f3677a.mo2410c(1.0f);
                        Impl21.m2411d(view, windowInsetsAnimationCompat);
                    }
                });
                OneShotPreDrawListener.m2149a(view, new Runnable(this) { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.3
                    @Override // java.lang.Runnable
                    public void run() {
                        Impl21.m2414g(view, windowInsetsAnimationCompat, boundsCompat);
                        duration.start();
                    }
                });
                this.f3683a = m2419p;
                return Impl21.m2415h(view, windowInsets);
            }
        }

        public Impl21(int i2, @Nullable Interpolator interpolator, long j2) {
            super(i2, interpolator, j2);
        }

        /* renamed from: d */
        public static void m2411d(@NonNull View view, @NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            m2416i(view);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    m2411d(viewGroup.getChildAt(i2), windowInsetsAnimationCompat);
                }
            }
        }

        /* renamed from: e */
        public static void m2412e(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsets windowInsets, boolean z) {
            m2416i(view);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    m2412e(viewGroup.getChildAt(i2), windowInsetsAnimationCompat, windowInsets, z);
                }
            }
        }

        /* renamed from: f */
        public static void m2413f(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<WindowInsetsAnimationCompat> list) {
            m2416i(view);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    m2413f(viewGroup.getChildAt(i2), windowInsetsCompat, list);
                }
            }
        }

        /* renamed from: g */
        public static void m2414g(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, BoundsCompat boundsCompat) {
            m2416i(view);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    m2414g(viewGroup.getChildAt(i2), windowInsetsAnimationCompat, boundsCompat);
                }
            }
        }

        @NonNull
        /* renamed from: h */
        public static WindowInsets m2415h(@NonNull View view, @NonNull WindowInsets windowInsets) {
            return view.getTag(C2507R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        @Nullable
        /* renamed from: i */
        public static Callback m2416i(View view) {
            Object tag = view.getTag(C2507R.id.tag_window_insets_animation_callback);
            if (!(tag instanceof Impl21OnApplyWindowInsetsListener)) {
                return null;
            }
            Objects.requireNonNull((Impl21OnApplyWindowInsetsListener) tag);
            return null;
        }
    }

    @RequiresApi
    public static class Impl30 extends Impl {

        /* renamed from: d */
        @NonNull
        public final WindowInsetsAnimation f3695d;

        @RequiresApi
        public static class ProxyCallback extends WindowInsetsAnimation.Callback {

            /* renamed from: a */
            public List<WindowInsetsAnimationCompat> f3696a;

            /* renamed from: b */
            public ArrayList<WindowInsetsAnimationCompat> f3697b;

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onEnd(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                throw null;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onPrepare(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                throw null;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            @NonNull
            public WindowInsets onProgress(@NonNull WindowInsets windowInsets, @NonNull List<WindowInsetsAnimation> list) {
                ArrayList<WindowInsetsAnimationCompat> arrayList = this.f3697b;
                if (arrayList == null) {
                    ArrayList<WindowInsetsAnimationCompat> arrayList2 = new ArrayList<>(list.size());
                    this.f3697b = arrayList2;
                    this.f3696a = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                int size = list.size() - 1;
                if (size >= 0) {
                    list.get(size);
                    throw null;
                }
                WindowInsetsCompat.m2419p(windowInsets, null);
                throw null;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            @NonNull
            public WindowInsetsAnimation.Bounds onStart(@NonNull WindowInsetsAnimation windowInsetsAnimation, @NonNull WindowInsetsAnimation.Bounds bounds) {
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Impl30(int i2, Interpolator interpolator, long j2) {
            super(0, null, 0L);
            WindowInsetsAnimation windowInsetsAnimation = new WindowInsetsAnimation(i2, interpolator, j2);
            this.f3695d = windowInsetsAnimation;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        /* renamed from: a */
        public long mo2408a() {
            return this.f3695d.getDurationMillis();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        /* renamed from: b */
        public float mo2409b() {
            return this.f3695d.getInterpolatedFraction();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        /* renamed from: c */
        public void mo2410c(float f2) {
            this.f3695d.setFraction(f2);
        }
    }

    public WindowInsetsAnimationCompat(int i2, @Nullable Interpolator interpolator, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f3677a = new Impl30(i2, interpolator, j2);
        } else {
            this.f3677a = new Impl21(i2, interpolator, j2);
        }
    }
}
