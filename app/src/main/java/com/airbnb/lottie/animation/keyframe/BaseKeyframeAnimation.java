package com.airbnb.lottie.animation.keyframe;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C0720L;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BaseKeyframeAnimation<K, A> {

    /* renamed from: c */
    public final KeyframesWrapper<K> f7412c;

    /* renamed from: e */
    @Nullable
    public LottieValueCallback<A> f7414e;

    /* renamed from: a */
    public final List<AnimationListener> f7410a = new ArrayList(1);

    /* renamed from: b */
    public boolean f7411b = false;

    /* renamed from: d */
    public float f7413d = 0.0f;

    /* renamed from: f */
    @Nullable
    public A f7415f = null;

    /* renamed from: g */
    public float f7416g = -1.0f;

    /* renamed from: h */
    public float f7417h = -1.0f;

    public interface AnimationListener {
        /* renamed from: a */
        void mo4688a();
    }

    public static final class EmptyKeyframeWrapper<T> implements KeyframesWrapper<T> {
        public EmptyKeyframeWrapper() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* renamed from: a */
        public boolean mo4711a(float f2) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* renamed from: b */
        public Keyframe<T> mo4712b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* renamed from: c */
        public boolean mo4713c(float f2) {
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* renamed from: d */
        public float mo4714d() {
            return 1.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* renamed from: e */
        public float mo4715e() {
            return 0.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isEmpty() {
            return true;
        }

        public EmptyKeyframeWrapper(C07621 c07621) {
        }
    }

    public interface KeyframesWrapper<T> {
        /* renamed from: a */
        boolean mo4711a(float f2);

        /* renamed from: b */
        Keyframe<T> mo4712b();

        /* renamed from: c */
        boolean mo4713c(float f2);

        @FloatRange
        /* renamed from: d */
        float mo4714d();

        @FloatRange
        /* renamed from: e */
        float mo4715e();

        boolean isEmpty();
    }

    public static final class KeyframesWrapperImpl<T> implements KeyframesWrapper<T> {

        /* renamed from: a */
        public final List<? extends Keyframe<T>> f7418a;

        /* renamed from: c */
        public Keyframe<T> f7420c = null;

        /* renamed from: d */
        public float f7421d = -1.0f;

        /* renamed from: b */
        @NonNull
        public Keyframe<T> f7419b = m4716f(0.0f);

        public KeyframesWrapperImpl(List<? extends Keyframe<T>> list) {
            this.f7418a = list;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* renamed from: a */
        public boolean mo4711a(float f2) {
            Keyframe<T> keyframe = this.f7420c;
            Keyframe<T> keyframe2 = this.f7419b;
            if (keyframe == keyframe2 && this.f7421d == f2) {
                return true;
            }
            this.f7420c = keyframe2;
            this.f7421d = f2;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        @NonNull
        /* renamed from: b */
        public Keyframe<T> mo4712b() {
            return this.f7419b;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* renamed from: c */
        public boolean mo4713c(float f2) {
            if (this.f7419b.m4857a(f2)) {
                return !this.f7419b.m4860d();
            }
            this.f7419b = m4716f(f2);
            return true;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* renamed from: d */
        public float mo4714d() {
            return this.f7418a.get(r0.size() - 1).m4858b();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* renamed from: e */
        public float mo4715e() {
            return this.f7418a.get(0).m4859c();
        }

        /* renamed from: f */
        public final Keyframe<T> m4716f(float f2) {
            List<? extends Keyframe<T>> list = this.f7418a;
            Keyframe<T> keyframe = list.get(list.size() - 1);
            if (f2 >= keyframe.m4859c()) {
                return keyframe;
            }
            for (int size = this.f7418a.size() - 2; size >= 1; size--) {
                Keyframe<T> keyframe2 = this.f7418a.get(size);
                if (this.f7419b != keyframe2 && keyframe2.m4857a(f2)) {
                    return keyframe2;
                }
            }
            return this.f7418a.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isEmpty() {
            return false;
        }
    }

    public static final class SingleKeyframeWrapper<T> implements KeyframesWrapper<T> {

        /* renamed from: a */
        @NonNull
        public final Keyframe<T> f7422a;

        /* renamed from: b */
        public float f7423b = -1.0f;

        public SingleKeyframeWrapper(List<? extends Keyframe<T>> list) {
            this.f7422a = list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* renamed from: a */
        public boolean mo4711a(float f2) {
            if (this.f7423b == f2) {
                return true;
            }
            this.f7423b = f2;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* renamed from: b */
        public Keyframe<T> mo4712b() {
            return this.f7422a;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* renamed from: c */
        public boolean mo4713c(float f2) {
            return !this.f7422a.m4860d();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* renamed from: d */
        public float mo4714d() {
            return this.f7422a.m4858b();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        /* renamed from: e */
        public float mo4715e() {
            return this.f7422a.m4859c();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isEmpty() {
            return false;
        }
    }

    public BaseKeyframeAnimation(List<? extends Keyframe<K>> list) {
        KeyframesWrapper singleKeyframeWrapper;
        if (list.isEmpty()) {
            singleKeyframeWrapper = new EmptyKeyframeWrapper(null);
        } else {
            singleKeyframeWrapper = list.size() == 1 ? new SingleKeyframeWrapper(list) : new KeyframesWrapperImpl(list);
        }
        this.f7412c = singleKeyframeWrapper;
    }

    /* renamed from: a */
    public Keyframe<K> m4703a() {
        Keyframe<K> mo4712b = this.f7412c.mo4712b();
        C0720L.m4640a("BaseKeyframeAnimation#getCurrentKeyframe");
        return mo4712b;
    }

    @FloatRange
    /* renamed from: b */
    public float mo4704b() {
        if (this.f7417h == -1.0f) {
            this.f7417h = this.f7412c.mo4714d();
        }
        return this.f7417h;
    }

    /* renamed from: c */
    public float m4705c() {
        Keyframe<K> m4703a = m4703a();
        if (m4703a.m4860d()) {
            return 0.0f;
        }
        return m4703a.f7856d.getInterpolation(m4706d());
    }

    /* renamed from: d */
    public float m4706d() {
        if (this.f7411b) {
            return 0.0f;
        }
        Keyframe<K> m4703a = m4703a();
        if (m4703a.m4860d()) {
            return 0.0f;
        }
        return (this.f7413d - m4703a.m4859c()) / (m4703a.m4858b() - m4703a.m4859c());
    }

    /* renamed from: e */
    public A mo4707e() {
        float m4705c = m4705c();
        if (this.f7414e == null && this.f7412c.mo4711a(m4705c)) {
            return this.f7415f;
        }
        A mo4708f = mo4708f(m4703a(), m4705c);
        this.f7415f = mo4708f;
        return mo4708f;
    }

    /* renamed from: f */
    public abstract A mo4708f(Keyframe<K> keyframe, float f2);

    /* renamed from: g */
    public void mo4709g() {
        for (int i2 = 0; i2 < this.f7410a.size(); i2++) {
            this.f7410a.get(i2).mo4688a();
        }
    }

    /* renamed from: h */
    public void mo4710h(@FloatRange float f2) {
        if (this.f7412c.isEmpty()) {
            return;
        }
        if (this.f7416g == -1.0f) {
            this.f7416g = this.f7412c.mo4715e();
        }
        float f3 = this.f7416g;
        if (f2 < f3) {
            if (f3 == -1.0f) {
                this.f7416g = this.f7412c.mo4715e();
            }
            f2 = this.f7416g;
        } else if (f2 > mo4704b()) {
            f2 = mo4704b();
        }
        if (f2 == this.f7413d) {
            return;
        }
        this.f7413d = f2;
        if (this.f7412c.mo4713c(f2)) {
            mo4709g();
        }
    }
}
