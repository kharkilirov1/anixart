package androidx.dynamicanimation.animation;

import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.AnimationHandler;
import androidx.dynamicanimation.animation.DynamicAnimation;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class DynamicAnimation<T extends DynamicAnimation<T>> implements AnimationHandler.AnimationFrameCallback {

    /* renamed from: l */
    public static final ViewProperty f3966l = new ViewProperty("scaleX") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.4
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float mo2780a(View view) {
            return view.getScaleX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void mo2781b(View view, float f2) {
            view.setScaleX(f2);
        }
    };

    /* renamed from: m */
    public static final ViewProperty f3967m = new ViewProperty("scaleY") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.5
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float mo2780a(View view) {
            return view.getScaleY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void mo2781b(View view, float f2) {
            view.setScaleY(f2);
        }
    };

    /* renamed from: n */
    public static final ViewProperty f3968n = new ViewProperty("rotation") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.6
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float mo2780a(View view) {
            return view.getRotation();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void mo2781b(View view, float f2) {
            view.setRotation(f2);
        }
    };

    /* renamed from: o */
    public static final ViewProperty f3969o = new ViewProperty("rotationX") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.7
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float mo2780a(View view) {
            return view.getRotationX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void mo2781b(View view, float f2) {
            view.setRotationX(f2);
        }
    };

    /* renamed from: p */
    public static final ViewProperty f3970p = new ViewProperty("rotationY") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.8
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float mo2780a(View view) {
            return view.getRotationY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void mo2781b(View view, float f2) {
            view.setRotationY(f2);
        }
    };

    /* renamed from: q */
    public static final ViewProperty f3971q = new ViewProperty("alpha") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.12
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float mo2780a(View view) {
            return view.getAlpha();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void mo2781b(View view, float f2) {
            view.setAlpha(f2);
        }
    };

    /* renamed from: d */
    public final Object f3975d;

    /* renamed from: e */
    public final FloatPropertyCompat f3976e;

    /* renamed from: i */
    public float f3980i;

    /* renamed from: a */
    public float f3972a = 0.0f;

    /* renamed from: b */
    public float f3973b = Float.MAX_VALUE;

    /* renamed from: c */
    public boolean f3974c = false;

    /* renamed from: f */
    public boolean f3977f = false;

    /* renamed from: g */
    public float f3978g = -3.4028235E38f;

    /* renamed from: h */
    public long f3979h = 0;

    /* renamed from: j */
    public final ArrayList<OnAnimationEndListener> f3981j = new ArrayList<>();

    /* renamed from: k */
    public final ArrayList<OnAnimationUpdateListener> f3982k = new ArrayList<>();

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$1 */
    public static class C02951 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float mo2780a(View view) {
            return view.getTranslationX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void mo2781b(View view, float f2) {
            view.setTranslationX(f2);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$10 */
    public static class C029610 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float mo2780a(View view) {
            return view.getY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void mo2781b(View view, float f2) {
            view.setY(f2);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$11 */
    public static class C029711 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float mo2780a(View view) {
            return ViewCompat.m2169I(view);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void mo2781b(View view, float f2) {
            ViewCompat.m2158A0(view, f2);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$13 */
    public static class C029913 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float mo2780a(View view) {
            return view.getScrollX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void mo2781b(View view, float f2) {
            view.setScrollX((int) f2);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$14 */
    public static class C030014 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float mo2780a(View view) {
            return view.getScrollY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void mo2781b(View view, float f2) {
            view.setScrollY((int) f2);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$15 */
    class C030115 extends FloatPropertyCompat {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float mo2780a(Object obj) {
            throw null;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void mo2781b(Object obj, float f2) {
            throw null;
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$2 */
    public static class C03022 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float mo2780a(View view) {
            return view.getTranslationY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void mo2781b(View view, float f2) {
            view.setTranslationY(f2);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$3 */
    public static class C03033 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float mo2780a(View view) {
            return ViewCompat.m2166F(view);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void mo2781b(View view, float f2) {
            ViewCompat.m2238z0(view, f2);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$9 */
    public static class C03099 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float mo2780a(View view) {
            return view.getX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void mo2781b(View view, float f2) {
            view.setX(f2);
        }
    }

    public static class MassState {

        /* renamed from: a */
        public float f3983a;

        /* renamed from: b */
        public float f3984b;
    }

    public interface OnAnimationEndListener {
        /* renamed from: a */
        void m2782a(DynamicAnimation dynamicAnimation, boolean z, float f2, float f3);
    }

    public interface OnAnimationUpdateListener {
        /* renamed from: a */
        void m2783a(DynamicAnimation dynamicAnimation, float f2, float f3);
    }

    public static abstract class ViewProperty extends FloatPropertyCompat<View> {
        public ViewProperty(String str, C02951 c02951) {
            super(str);
        }
    }

    public <K> DynamicAnimation(K k2, FloatPropertyCompat<K> floatPropertyCompat) {
        this.f3975d = k2;
        this.f3976e = floatPropertyCompat;
        if (floatPropertyCompat == f3968n || floatPropertyCompat == f3969o || floatPropertyCompat == f3970p) {
            this.f3980i = 0.1f;
            return;
        }
        if (floatPropertyCompat == f3971q) {
            this.f3980i = 0.00390625f;
        } else if (floatPropertyCompat == f3966l || floatPropertyCompat == f3967m) {
            this.f3980i = 0.00390625f;
        } else {
            this.f3980i = 1.0f;
        }
    }

    /* renamed from: b */
    public static <T> void m2777b(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallback
    @RestrictTo
    /* renamed from: a */
    public boolean mo2775a(long j2) {
        long j3 = this.f3979h;
        if (j3 == 0) {
            this.f3979h = j2;
            m2778c(this.f3973b);
            return false;
        }
        this.f3979h = j2;
        boolean mo2779d = mo2779d(j2 - j3);
        float min = Math.min(this.f3973b, Float.MAX_VALUE);
        this.f3973b = min;
        float max = Math.max(min, this.f3978g);
        this.f3973b = max;
        m2778c(max);
        if (mo2779d) {
            this.f3977f = false;
            AnimationHandler m2773a = AnimationHandler.m2773a();
            m2773a.f3951a.remove(this);
            int indexOf = m2773a.f3952b.indexOf(this);
            if (indexOf >= 0) {
                m2773a.f3952b.set(indexOf, null);
                m2773a.f3956f = true;
            }
            this.f3979h = 0L;
            this.f3974c = false;
            for (int i2 = 0; i2 < this.f3981j.size(); i2++) {
                if (this.f3981j.get(i2) != null) {
                    this.f3981j.get(i2).m2782a(this, false, this.f3973b, this.f3972a);
                }
            }
            m2777b(this.f3981j);
        }
        return mo2779d;
    }

    /* renamed from: c */
    public void m2778c(float f2) {
        this.f3976e.mo2781b(this.f3975d, f2);
        for (int i2 = 0; i2 < this.f3982k.size(); i2++) {
            if (this.f3982k.get(i2) != null) {
                this.f3982k.get(i2).m2783a(this, this.f3973b, this.f3972a);
            }
        }
        m2777b(this.f3982k);
    }

    /* renamed from: d */
    public abstract boolean mo2779d(long j2);
}
