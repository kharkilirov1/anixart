package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback.C06491;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class AnimatedVectorDrawableCompat extends VectorDrawableCommon implements Animatable2Compat {

    /* renamed from: c */
    public AnimatedVectorDrawableCompatState f6390c;

    /* renamed from: d */
    public Context f6391d;

    /* renamed from: e */
    public android.animation.ArgbEvaluator f6392e;

    /* renamed from: f */
    public Animator.AnimatorListener f6393f;

    /* renamed from: g */
    public ArrayList<Animatable2Compat.AnimationCallback> f6394g;

    /* renamed from: h */
    public final Drawable.Callback f6395h;

    public static class AnimatedVectorDrawableCompatState extends Drawable.ConstantState {

        /* renamed from: a */
        public int f6398a;

        /* renamed from: b */
        public VectorDrawableCompat f6399b;

        /* renamed from: c */
        public AnimatorSet f6400c;

        /* renamed from: d */
        public ArrayList<Animator> f6401d;

        /* renamed from: e */
        public ArrayMap<Animator, String> f6402e;

        public AnimatedVectorDrawableCompatState(AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState, Drawable.Callback callback, Resources resources) {
            if (animatedVectorDrawableCompatState != null) {
                this.f6398a = animatedVectorDrawableCompatState.f6398a;
                VectorDrawableCompat vectorDrawableCompat = animatedVectorDrawableCompatState.f6399b;
                if (vectorDrawableCompat != null) {
                    Drawable.ConstantState constantState = vectorDrawableCompat.getConstantState();
                    if (resources != null) {
                        this.f6399b = (VectorDrawableCompat) constantState.newDrawable(resources);
                    } else {
                        this.f6399b = (VectorDrawableCompat) constantState.newDrawable();
                    }
                    VectorDrawableCompat vectorDrawableCompat2 = (VectorDrawableCompat) this.f6399b.mutate();
                    this.f6399b = vectorDrawableCompat2;
                    vectorDrawableCompat2.setCallback(callback);
                    this.f6399b.setBounds(animatedVectorDrawableCompatState.f6399b.getBounds());
                    this.f6399b.f6414g = false;
                }
                ArrayList<Animator> arrayList = animatedVectorDrawableCompatState.f6401d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f6401d = new ArrayList<>(size);
                    this.f6402e = new ArrayMap<>(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        Animator animator = animatedVectorDrawableCompatState.f6401d.get(i2);
                        Animator clone = animator.clone();
                        String str = animatedVectorDrawableCompatState.f6402e.get(animator);
                        clone.setTarget(this.f6399b.f6410c.f6465b.f6463p.get(str));
                        this.f6401d.add(clone);
                        this.f6402e.put(clone, str);
                    }
                    if (this.f6400c == null) {
                        this.f6400c = new AnimatorSet();
                    }
                    this.f6400c.playTogether(this.f6401d);
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6398a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public AnimatedVectorDrawableCompat() {
        this(null, null, null);
    }

    @Nullable
    /* renamed from: a */
    public static AnimatedVectorDrawableCompat m4294a(@NonNull Context context, @DrawableRes int i2) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(context, null, null);
            Drawable m1733c = ResourcesCompat.m1733c(context.getResources(), i2, context.getTheme());
            animatedVectorDrawableCompat.f6408b = m1733c;
            m1733c.setCallback(animatedVectorDrawableCompat.f6395h);
            new AnimatedVectorDrawableDelegateState(animatedVectorDrawableCompat.f6408b.getConstantState());
            return animatedVectorDrawableCompat;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i2);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return m4295b(context, context.getResources(), xml, asAttributeSet, context.getTheme());
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e2) {
            Log.e("AnimatedVDCompat", "parser error", e2);
            return null;
        } catch (XmlPullParserException e3) {
            Log.e("AnimatedVDCompat", "parser error", e3);
            return null;
        }
    }

    /* renamed from: b */
    public static AnimatedVectorDrawableCompat m4295b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(context, null, null);
        animatedVectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return animatedVectorDrawableCompat;
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            DrawableCompat.m1829a(drawable, theme);
        }
    }

    /* renamed from: c */
    public void m4296c(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
            if (animationCallback.f6388a == null) {
                animationCallback.f6388a = animationCallback.new C06491();
            }
            animatedVectorDrawable.registerAnimationCallback(animationCallback.f6388a);
            return;
        }
        if (animationCallback == null) {
            return;
        }
        if (this.f6394g == null) {
            this.f6394g = new ArrayList<>();
        }
        if (this.f6394g.contains(animationCallback)) {
            return;
        }
        this.f6394g.add(animationCallback);
        if (this.f6393f == null) {
            this.f6393f = new AnimatorListenerAdapter() { // from class: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    ArrayList arrayList = new ArrayList(AnimatedVectorDrawableCompat.this.f6394g);
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((Animatable2Compat.AnimationCallback) arrayList.get(i2)).mo4292a(AnimatedVectorDrawableCompat.this);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    ArrayList arrayList = new ArrayList(AnimatedVectorDrawableCompat.this.f6394g);
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((Animatable2Compat.AnimationCallback) arrayList.get(i2)).mo4293b(AnimatedVectorDrawableCompat.this);
                    }
                }
            };
        }
        this.f6390c.f6400c.addListener(this.f6393f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            return DrawableCompat.m1830b(drawable);
        }
        return false;
    }

    /* renamed from: d */
    public boolean m4297d(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        Animator.AnimatorListener animatorListener;
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
            if (animationCallback.f6388a == null) {
                animationCallback.f6388a = animationCallback.new C06491();
            }
            animatedVectorDrawable.unregisterAnimationCallback(animationCallback.f6388a);
        }
        ArrayList<Animatable2Compat.AnimationCallback> arrayList = this.f6394g;
        if (arrayList == null || animationCallback == null) {
            return false;
        }
        boolean remove = arrayList.remove(animationCallback);
        if (this.f6394g.size() == 0 && (animatorListener = this.f6393f) != null) {
            this.f6390c.f6400c.removeListener(animatorListener);
            this.f6393f = null;
        }
        return remove;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f6390c.f6399b.draw(canvas);
        if (this.f6390c.f6400c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f6408b;
        return drawable != null ? DrawableCompat.m1832d(drawable) : this.f6390c.f6399b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f6408b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f6390c.f6398a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f6408b;
        return drawable != null ? DrawableCompat.m1833e(drawable) : this.f6390c.f6399b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f6408b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new AnimatedVectorDrawableDelegateState(this.f6408b.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f6408b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f6390c.f6399b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f6408b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f6390c.f6399b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f6408b;
        return drawable != null ? drawable.getOpacity() : this.f6390c.f6399b.getOpacity();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void inflate(android.content.res.Resources r21, org.xmlpull.v1.XmlPullParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f6408b;
        return drawable != null ? DrawableCompat.m1836h(drawable) : this.f6390c.f6399b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f6408b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f6390c.f6400c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f6408b;
        return drawable != null ? drawable.isStateful() : this.f6390c.f6399b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f6390c.f6399b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f6408b;
        return drawable != null ? drawable.setLevel(i2) : this.f6390c.f6399b.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f6408b;
        return drawable != null ? drawable.setState(iArr) : this.f6390c.f6399b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f6390c.f6399b.setAlpha(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            DrawableCompat.m1837i(drawable, z);
        } else {
            this.f6390c.f6399b.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f6390c.f6399b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i2) {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            DrawableCompat.m1841m(drawable, i2);
        } else {
            this.f6390c.f6399b.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            DrawableCompat.m1842n(drawable, colorStateList);
        } else {
            this.f6390c.f6399b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            DrawableCompat.m1843o(drawable, mode);
        } else {
            this.f6390c.f6399b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f6390c.f6399b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f6390c.f6400c.isStarted()) {
                return;
            }
            this.f6390c.f6400c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f6390c.f6400c.end();
        }
    }

    public AnimatedVectorDrawableCompat(@Nullable Context context, @Nullable AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState, @Nullable Resources resources) {
        this.f6392e = null;
        this.f6393f = null;
        this.f6394g = null;
        Drawable.Callback callback = new Drawable.Callback() { // from class: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.1
            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(Drawable drawable) {
                AnimatedVectorDrawableCompat.this.invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
                AnimatedVectorDrawableCompat.this.scheduleSelf(runnable, j2);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                AnimatedVectorDrawableCompat.this.unscheduleSelf(runnable);
            }
        };
        this.f6395h = callback;
        this.f6391d = context;
        this.f6390c = new AnimatedVectorDrawableCompatState(null, callback, null);
    }

    @RequiresApi
    public static class AnimatedVectorDrawableDelegateState extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f6403a;

        public AnimatedVectorDrawableDelegateState(Drawable.ConstantState constantState) {
            this.f6403a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f6403a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6403a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(null, null, null);
            Drawable newDrawable = this.f6403a.newDrawable();
            animatedVectorDrawableCompat.f6408b = newDrawable;
            newDrawable.setCallback(animatedVectorDrawableCompat.f6395h);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(null, null, null);
            Drawable newDrawable = this.f6403a.newDrawable(resources);
            animatedVectorDrawableCompat.f6408b = newDrawable;
            newDrawable.setCallback(animatedVectorDrawableCompat.f6395h);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(null, null, null);
            Drawable newDrawable = this.f6403a.newDrawable(resources, theme);
            animatedVectorDrawableCompat.f6408b = newDrawable;
            newDrawable.setCallback(animatedVectorDrawableCompat.f6395h);
            return animatedVectorDrawableCompat;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
