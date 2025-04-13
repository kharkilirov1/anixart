package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.graphics.drawable.DrawableContainer;
import androidx.appcompat.graphics.drawable.StateListDrawable;
import androidx.appcompat.resources.Compatibility;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

/* loaded from: classes.dex */
public class AnimatedStateListDrawableCompat extends StateListDrawable implements TintAwareDrawable {

    /* renamed from: q */
    public AnimatedStateListState f604q;

    /* renamed from: r */
    public Transition f605r;

    /* renamed from: s */
    public int f606s;

    /* renamed from: t */
    public int f607t;

    /* renamed from: u */
    public boolean f608u;

    public static class AnimatableTransition extends Transition {

        /* renamed from: a */
        public final Animatable f609a;

        public AnimatableTransition(Animatable animatable) {
            super(null);
            this.f609a = animatable;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        /* renamed from: c */
        public void mo502c() {
            this.f609a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        /* renamed from: d */
        public void mo503d() {
            this.f609a.stop();
        }
    }

    public static class AnimatedStateListState extends StateListDrawable.StateListState {

        /* renamed from: K */
        public LongSparseArray<Long> f610K;

        /* renamed from: L */
        public SparseArrayCompat<Integer> f611L;

        public AnimatedStateListState(@Nullable AnimatedStateListState animatedStateListState, @NonNull AnimatedStateListDrawableCompat animatedStateListDrawableCompat, @Nullable Resources resources) {
            super(animatedStateListState, animatedStateListDrawableCompat, resources);
            if (animatedStateListState != null) {
                this.f610K = animatedStateListState.f610K;
                this.f611L = animatedStateListState.f611L;
            } else {
                this.f610K = new LongSparseArray<>(10);
                this.f611L = new SparseArrayCompat<>();
            }
        }

        /* renamed from: i */
        public static long m504i(int i2, int i3) {
            return i3 | (i2 << 32);
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawable.StateListState, androidx.appcompat.graphics.drawable.DrawableContainer.DrawableContainerState
        /* renamed from: f */
        public void mo505f() {
            this.f610K = this.f610K.clone();
            this.f611L = this.f611L.clone();
        }

        /* renamed from: j */
        public int m506j(int i2) {
            if (i2 < 0) {
                return 0;
            }
            return this.f611L.m1130d(i2, 0).intValue();
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawable.StateListState, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new AnimatedStateListDrawableCompat(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawable.StateListState, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new AnimatedStateListDrawableCompat(this, resources);
        }
    }

    public static class AnimatedVectorDrawableTransition extends Transition {

        /* renamed from: a */
        public final AnimatedVectorDrawableCompat f612a;

        public AnimatedVectorDrawableTransition(AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
            super(null);
            this.f612a = animatedVectorDrawableCompat;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        /* renamed from: c */
        public void mo502c() {
            this.f612a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        /* renamed from: d */
        public void mo503d() {
            this.f612a.stop();
        }
    }

    public static class AnimationDrawableTransition extends Transition {

        /* renamed from: a */
        public final ObjectAnimator f613a;

        /* renamed from: b */
        public final boolean f614b;

        public AnimationDrawableTransition(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super(null);
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i2 = z ? numberOfFrames - 1 : 0;
            int i3 = z ? 0 : numberOfFrames - 1;
            FrameInterpolator frameInterpolator = new FrameInterpolator(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i2, i3);
            Compatibility.Api18Impl.m521a(ofInt, true);
            ofInt.setDuration(frameInterpolator.f617c);
            ofInt.setInterpolator(frameInterpolator);
            this.f614b = z2;
            this.f613a = ofInt;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        /* renamed from: a */
        public boolean mo507a() {
            return this.f614b;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        /* renamed from: b */
        public void mo508b() {
            this.f613a.reverse();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        /* renamed from: c */
        public void mo502c() {
            this.f613a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        /* renamed from: d */
        public void mo503d() {
            this.f613a.cancel();
        }
    }

    public static class FrameInterpolator implements TimeInterpolator {

        /* renamed from: a */
        public int[] f615a;

        /* renamed from: b */
        public int f616b;

        /* renamed from: c */
        public int f617c;

        public FrameInterpolator(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f616b = numberOfFrames;
            int[] iArr = this.f615a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f615a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f615a;
            int i2 = 0;
            for (int i3 = 0; i3 < numberOfFrames; i3++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i3) - 1 : i3);
                iArr2[i3] = duration;
                i2 += duration;
            }
            this.f617c = i2;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            int i2 = (int) ((f2 * this.f617c) + 0.5f);
            int i3 = this.f616b;
            int[] iArr = this.f615a;
            int i4 = 0;
            while (i4 < i3 && i2 >= iArr[i4]) {
                i2 -= iArr[i4];
                i4++;
            }
            return (i4 / i3) + (i4 < i3 ? i2 / this.f617c : 0.0f);
        }
    }

    public static abstract class Transition {
        public Transition() {
        }

        /* renamed from: a */
        public boolean mo507a() {
            return false;
        }

        /* renamed from: b */
        public void mo508b() {
        }

        /* renamed from: c */
        public abstract void mo502c();

        /* renamed from: d */
        public abstract void mo503d();

        public Transition(C00841 c00841) {
        }
    }

    public AnimatedStateListDrawableCompat() {
        this(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ef, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(p000a.C0000a.m23t(r21, new java.lang.StringBuilder(), ": <transition> tag requires 'fromId' & 'toId' attributes"));
     */
    @androidx.annotation.NonNull
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat m498g(@androidx.annotation.NonNull android.content.Context r19, @androidx.annotation.NonNull android.content.res.Resources r20, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r21, @androidx.annotation.NonNull android.util.AttributeSet r22, @androidx.annotation.Nullable android.content.res.Resources.Theme r23) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            Method dump skipped, instructions count: 563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.m498g(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat");
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawable, androidx.appcompat.graphics.drawable.DrawableContainer
    /* renamed from: b */
    public DrawableContainer.DrawableContainerState mo499b() {
        return new AnimatedStateListState(this.f604q, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawable, androidx.appcompat.graphics.drawable.DrawableContainer
    /* renamed from: e */
    public void mo500e(@NonNull DrawableContainer.DrawableContainerState drawableContainerState) {
        super.mo500e(drawableContainerState);
        if (drawableContainerState instanceof AnimatedStateListState) {
            this.f604q = (AnimatedStateListState) drawableContainerState;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawable
    /* renamed from: f */
    public StateListDrawable.StateListState mo499b() {
        return new AnimatedStateListState(this.f604q, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        Transition transition = this.f605r;
        if (transition != null) {
            transition.mo503d();
            this.f605r = null;
            m511d(this.f606s);
            this.f606s = -1;
            this.f607t = -1;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawable, androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f608u) {
            super.mutate();
            this.f604q.mo505f();
            this.f608u = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ed  */
    @Override // androidx.appcompat.graphics.drawable.StateListDrawable, androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onStateChange(@androidx.annotation.NonNull int[] r19) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.onStateChange(int[]):boolean");
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Transition transition = this.f605r;
        if (transition != null && (visible || z2)) {
            if (z) {
                transition.mo502c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public AnimatedStateListDrawableCompat(@Nullable AnimatedStateListState animatedStateListState, @Nullable Resources resources) {
        super(null);
        this.f606s = -1;
        this.f607t = -1;
        AnimatedStateListState animatedStateListState2 = new AnimatedStateListState(animatedStateListState, this, resources);
        super.mo500e(animatedStateListState2);
        this.f604q = animatedStateListState2;
        onStateChange(getState());
        jumpToCurrentState();
    }
}
