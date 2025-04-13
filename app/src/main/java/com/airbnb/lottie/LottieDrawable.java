package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.manager.FontAssetManager;
import com.airbnb.lottie.manager.ImageAssetManager;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.layer.CompositionLayer;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.LayerParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.LottieValueAnimator;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinVersion;
import p000a.C0000a;

/* loaded from: classes.dex */
public class LottieDrawable extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: b */
    public final Matrix f7168b = new Matrix();

    /* renamed from: c */
    public LottieComposition f7169c;

    /* renamed from: d */
    public final LottieValueAnimator f7170d;

    /* renamed from: e */
    public float f7171e;

    /* renamed from: f */
    public boolean f7172f;

    /* renamed from: g */
    public boolean f7173g;

    /* renamed from: h */
    public final ArrayList<LazyCompositionTask> f7174h;

    /* renamed from: i */
    @Nullable
    public ImageView.ScaleType f7175i;

    /* renamed from: j */
    @Nullable
    public ImageAssetManager f7176j;

    /* renamed from: k */
    @Nullable
    public String f7177k;

    /* renamed from: l */
    @Nullable
    public ImageAssetDelegate f7178l;

    /* renamed from: m */
    @Nullable
    public FontAssetManager f7179m;

    /* renamed from: n */
    @Nullable
    public FontAssetDelegate f7180n;

    /* renamed from: o */
    @Nullable
    public TextDelegate f7181o;

    /* renamed from: p */
    public boolean f7182p;

    /* renamed from: q */
    @Nullable
    public CompositionLayer f7183q;

    /* renamed from: r */
    public int f7184r;

    /* renamed from: s */
    public boolean f7185s;

    /* renamed from: t */
    public boolean f7186t;

    /* renamed from: u */
    public boolean f7187u;

    /* renamed from: v */
    public boolean f7188v;

    /* renamed from: com.airbnb.lottie.LottieDrawable$11 */
    class C074111 implements LazyCompositionTask {

        /* renamed from: a */
        public final /* synthetic */ String f7192a;

        /* renamed from: b */
        public final /* synthetic */ String f7193b;

        /* renamed from: c */
        public final /* synthetic */ boolean f7194c;

        public C074111(String str, String str2, boolean z) {
            this.f7192a = str;
            this.f7193b = str2;
            this.f7194c = z;
        }

        @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
        /* renamed from: a */
        public void mo4682a(LottieComposition lottieComposition) {
            LottieDrawable lottieDrawable = LottieDrawable.this;
            String str = this.f7192a;
            String str2 = this.f7193b;
            boolean z = this.f7194c;
            LottieComposition lottieComposition2 = lottieDrawable.f7169c;
            if (lottieComposition2 == null) {
                lottieDrawable.f7174h.add(lottieDrawable.new C074111(str, str2, z));
                return;
            }
            Marker m4649d = lottieComposition2.m4649d(str);
            if (m4649d == null) {
                throw new IllegalArgumentException(C0000a.m16m("Cannot find marker with name ", str, "."));
            }
            int i2 = (int) m4649d.f7496b;
            Marker m4649d2 = lottieDrawable.f7169c.m4649d(str2);
            if (str2 == null) {
                throw new IllegalArgumentException(C0000a.m16m("Cannot find marker with name ", str2, "."));
            }
            lottieDrawable.m4674p(i2, (int) (m4649d2.f7496b + (z ? 1.0f : 0.0f)));
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$13 */
    class C074313 implements LazyCompositionTask {

        /* renamed from: a */
        public final /* synthetic */ float f7199a;

        /* renamed from: b */
        public final /* synthetic */ float f7200b;

        public C074313(float f2, float f3) {
            this.f7199a = f2;
            this.f7200b = f3;
        }

        @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
        /* renamed from: a */
        public void mo4682a(LottieComposition lottieComposition) {
            LottieDrawable lottieDrawable = LottieDrawable.this;
            float f2 = this.f7199a;
            float f3 = this.f7200b;
            LottieComposition lottieComposition2 = lottieDrawable.f7169c;
            if (lottieComposition2 == null) {
                lottieDrawable.f7174h.add(lottieDrawable.new C074313(f2, f3));
                return;
            }
            int m4848e = (int) MiscUtils.m4848e(lottieComposition2.f7149k, lottieComposition2.f7150l, f2);
            LottieComposition lottieComposition3 = lottieDrawable.f7169c;
            lottieDrawable.m4674p(m4848e, (int) MiscUtils.m4848e(lottieComposition3.f7149k, lottieComposition3.f7150l, f3));
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$17 */
    class C074717 extends LottieValueCallback<Object> {
        @Override // com.airbnb.lottie.value.LottieValueCallback
        /* renamed from: a */
        public Object mo4645a(LottieFrameInfo<Object> lottieFrameInfo) {
            throw null;
        }
    }

    public static class ColorFilterData {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ColorFilterData) && hashCode() == ((ColorFilterData) obj).hashCode();
        }

        public int hashCode() {
            return 17;
        }
    }

    public interface LazyCompositionTask {
        /* renamed from: a */
        void mo4682a(LottieComposition lottieComposition);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    public LottieDrawable() {
        LottieValueAnimator lottieValueAnimator = new LottieValueAnimator();
        this.f7170d = lottieValueAnimator;
        this.f7171e = 1.0f;
        this.f7172f = true;
        this.f7173g = false;
        new HashSet();
        this.f7174h = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.airbnb.lottie.LottieDrawable.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LottieDrawable lottieDrawable = LottieDrawable.this;
                CompositionLayer compositionLayer = lottieDrawable.f7183q;
                if (compositionLayer != null) {
                    compositionLayer.mo4752o(lottieDrawable.f7170d.m4836d());
                }
            }
        };
        this.f7184r = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f7187u = true;
        this.f7188v = false;
        lottieValueAnimator.f7831b.add(animatorUpdateListener);
    }

    /* renamed from: a */
    public <T> void m4659a(final KeyPath keyPath, final T t, final LottieValueCallback<T> lottieValueCallback) {
        List list;
        CompositionLayer compositionLayer = this.f7183q;
        if (compositionLayer == null) {
            this.f7174h.add(new LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable.16
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                /* renamed from: a */
                public void mo4682a(LottieComposition lottieComposition) {
                    LottieDrawable.this.m4659a(keyPath, t, lottieValueCallback);
                }
            });
            return;
        }
        KeyPathElement keyPathElement = keyPath.f7492b;
        boolean z = true;
        if (keyPathElement != null) {
            keyPathElement.mo4693g(t, lottieValueCallback);
        } else {
            if (compositionLayer == null) {
                Logger.m4833a("Cannot resolve KeyPath. Composition is not set yet.");
                list = Collections.emptyList();
            } else {
                ArrayList arrayList = new ArrayList();
                this.f7183q.mo4690c(keyPath, 0, arrayList, new KeyPath(new String[0]));
                list = arrayList;
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((KeyPath) list.get(i2)).f7492b.mo4693g(t, lottieValueCallback);
            }
            z = true ^ list.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == LottieProperty.f7229A) {
                m4679u(m4665g());
            }
        }
    }

    /* renamed from: b */
    public final void m4660b() {
        LottieComposition lottieComposition = this.f7169c;
        JsonReader.Options options = LayerParser.f7751a;
        Rect rect = lottieComposition.f7148j;
        Layer layer = new Layer(Collections.emptyList(), lottieComposition, "__container", -1L, Layer.LayerType.PRE_COMP, -1L, null, Collections.emptyList(), new AnimatableTransform(null, null, null, null, null, null, null, null, null), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), Layer.MatteType.NONE, null, false);
        LottieComposition lottieComposition2 = this.f7169c;
        this.f7183q = new CompositionLayer(this, layer, lottieComposition2.f7147i, lottieComposition2);
    }

    /* renamed from: c */
    public void m4661c() {
        if (this.f7170d.isRunning()) {
            this.f7170d.cancel();
        }
        this.f7169c = null;
        this.f7183q = null;
        this.f7176j = null;
        LottieValueAnimator lottieValueAnimator = this.f7170d;
        lottieValueAnimator.f7842k = null;
        lottieValueAnimator.f7840i = -2.1474836E9f;
        lottieValueAnimator.f7841j = 2.1474836E9f;
        invalidateSelf();
    }

    /* renamed from: d */
    public final void m4662d(@NonNull Canvas canvas) {
        float f2;
        float f3;
        int i2 = -1;
        if (ImageView.ScaleType.FIT_XY != this.f7175i) {
            if (this.f7183q == null) {
                return;
            }
            float f4 = this.f7171e;
            float min = Math.min(canvas.getWidth() / this.f7169c.f7148j.width(), canvas.getHeight() / this.f7169c.f7148j.height());
            if (f4 > min) {
                f2 = this.f7171e / min;
            } else {
                min = f4;
                f2 = 1.0f;
            }
            if (f2 > 1.0f) {
                i2 = canvas.save();
                float width = this.f7169c.f7148j.width() / 2.0f;
                float height = this.f7169c.f7148j.height() / 2.0f;
                float f5 = width * min;
                float f6 = height * min;
                float f7 = this.f7171e;
                canvas.translate((width * f7) - f5, (f7 * height) - f6);
                canvas.scale(f2, f2, f5, f6);
            }
            this.f7168b.reset();
            this.f7168b.preScale(min, min);
            this.f7183q.mo4692f(canvas, this.f7168b, this.f7184r);
            if (i2 > 0) {
                canvas.restoreToCount(i2);
                return;
            }
            return;
        }
        if (this.f7183q == null) {
            return;
        }
        Rect bounds = getBounds();
        float width2 = bounds.width() / this.f7169c.f7148j.width();
        float height2 = bounds.height() / this.f7169c.f7148j.height();
        if (this.f7187u) {
            float min2 = Math.min(width2, height2);
            if (min2 < 1.0f) {
                f3 = 1.0f / min2;
                width2 /= f3;
                height2 /= f3;
            } else {
                f3 = 1.0f;
            }
            if (f3 > 1.0f) {
                i2 = canvas.save();
                float width3 = bounds.width() / 2.0f;
                float height3 = bounds.height() / 2.0f;
                float f8 = width3 * min2;
                float f9 = min2 * height3;
                canvas.translate(width3 - f8, height3 - f9);
                canvas.scale(f3, f3, f8, f9);
            }
        }
        this.f7168b.reset();
        this.f7168b.preScale(width2, height2);
        this.f7183q.mo4692f(canvas, this.f7168b, this.f7184r);
        if (i2 > 0) {
            canvas.restoreToCount(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f7188v = false;
        if (this.f7173g) {
            try {
                m4662d(canvas);
            } catch (Throwable unused) {
                Objects.requireNonNull(Logger.f7834a);
            }
        } else {
            m4662d(canvas);
        }
        C0720L.m4640a("Drawable#draw");
    }

    /* renamed from: e */
    public float m4663e() {
        return this.f7170d.m4837e();
    }

    /* renamed from: f */
    public float m4664f() {
        return this.f7170d.m4838f();
    }

    @FloatRange
    /* renamed from: g */
    public float m4665g() {
        return this.f7170d.m4836d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f7184r;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f7169c == null) {
            return -1;
        }
        return (int) (r0.f7148j.height() * this.f7171e);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f7169c == null) {
            return -1;
        }
        return (int) (r0.f7148j.width() * this.f7171e);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public int m4666h() {
        return this.f7170d.getRepeatCount();
    }

    /* renamed from: i */
    public boolean m4667i() {
        LottieValueAnimator lottieValueAnimator = this.f7170d;
        if (lottieValueAnimator == null) {
            return false;
        }
        return lottieValueAnimator.isRunning();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f7188v) {
            return;
        }
        this.f7188v = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return m4667i();
    }

    @MainThread
    /* renamed from: j */
    public void m4668j() {
        if (this.f7183q == null) {
            this.f7174h.add(new LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable.2
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                /* renamed from: a */
                public void mo4682a(LottieComposition lottieComposition) {
                    LottieDrawable.this.m4668j();
                }
            });
            return;
        }
        if (this.f7172f || m4666h() == 0) {
            LottieValueAnimator lottieValueAnimator = this.f7170d;
            lottieValueAnimator.f7843l = true;
            boolean m4839g = lottieValueAnimator.m4839g();
            for (Animator.AnimatorListener animatorListener : lottieValueAnimator.f7832c) {
                if (Build.VERSION.SDK_INT >= 26) {
                    animatorListener.onAnimationStart(lottieValueAnimator, m4839g);
                } else {
                    animatorListener.onAnimationStart(lottieValueAnimator);
                }
            }
            lottieValueAnimator.m4842j((int) (lottieValueAnimator.m4839g() ? lottieValueAnimator.m4837e() : lottieValueAnimator.m4838f()));
            lottieValueAnimator.f7837f = 0L;
            lottieValueAnimator.f7839h = 0;
            lottieValueAnimator.m4840h();
        }
        if (this.f7172f) {
            return;
        }
        m4670l((int) (this.f7170d.f7835d < 0.0f ? m4664f() : m4663e()));
        this.f7170d.m4835c();
    }

    @MainThread
    /* renamed from: k */
    public void m4669k() {
        if (this.f7183q == null) {
            this.f7174h.add(new LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable.3
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                /* renamed from: a */
                public void mo4682a(LottieComposition lottieComposition) {
                    LottieDrawable.this.m4669k();
                }
            });
            return;
        }
        if (this.f7172f || m4666h() == 0) {
            LottieValueAnimator lottieValueAnimator = this.f7170d;
            lottieValueAnimator.f7843l = true;
            lottieValueAnimator.m4840h();
            lottieValueAnimator.f7837f = 0L;
            if (lottieValueAnimator.m4839g() && lottieValueAnimator.f7838g == lottieValueAnimator.m4838f()) {
                lottieValueAnimator.f7838g = lottieValueAnimator.m4837e();
            } else if (!lottieValueAnimator.m4839g() && lottieValueAnimator.f7838g == lottieValueAnimator.m4837e()) {
                lottieValueAnimator.f7838g = lottieValueAnimator.m4838f();
            }
        }
        if (this.f7172f) {
            return;
        }
        m4670l((int) (this.f7170d.f7835d < 0.0f ? m4664f() : m4663e()));
        this.f7170d.m4835c();
    }

    /* renamed from: l */
    public void m4670l(final int i2) {
        if (this.f7169c == null) {
            this.f7174h.add(new LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable.14
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                /* renamed from: a */
                public void mo4682a(LottieComposition lottieComposition) {
                    LottieDrawable.this.m4670l(i2);
                }
            });
        } else {
            this.f7170d.m4842j(i2);
        }
    }

    /* renamed from: m */
    public void m4671m(final int i2) {
        if (this.f7169c == null) {
            this.f7174h.add(new LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable.6
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                /* renamed from: a */
                public void mo4682a(LottieComposition lottieComposition) {
                    LottieDrawable.this.m4671m(i2);
                }
            });
            return;
        }
        LottieValueAnimator lottieValueAnimator = this.f7170d;
        lottieValueAnimator.m4843k(lottieValueAnimator.f7840i, i2 + 0.99f);
    }

    /* renamed from: n */
    public void m4672n(final String str) {
        LottieComposition lottieComposition = this.f7169c;
        if (lottieComposition == null) {
            this.f7174h.add(new LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable.9
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                /* renamed from: a */
                public void mo4682a(LottieComposition lottieComposition2) {
                    LottieDrawable.this.m4672n(str);
                }
            });
            return;
        }
        Marker m4649d = lottieComposition.m4649d(str);
        if (m4649d == null) {
            throw new IllegalArgumentException(C0000a.m16m("Cannot find marker with name ", str, "."));
        }
        m4671m((int) (m4649d.f7496b + m4649d.f7497c));
    }

    /* renamed from: o */
    public void m4673o(@FloatRange final float f2) {
        LottieComposition lottieComposition = this.f7169c;
        if (lottieComposition == null) {
            this.f7174h.add(new LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable.7
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                /* renamed from: a */
                public void mo4682a(LottieComposition lottieComposition2) {
                    LottieDrawable.this.m4673o(f2);
                }
            });
        } else {
            m4671m((int) MiscUtils.m4848e(lottieComposition.f7149k, lottieComposition.f7150l, f2));
        }
    }

    /* renamed from: p */
    public void m4674p(final int i2, final int i3) {
        if (this.f7169c == null) {
            this.f7174h.add(new LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable.12
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                /* renamed from: a */
                public void mo4682a(LottieComposition lottieComposition) {
                    LottieDrawable.this.m4674p(i2, i3);
                }
            });
        } else {
            this.f7170d.m4843k(i2, i3 + 0.99f);
        }
    }

    /* renamed from: q */
    public void m4675q(final String str) {
        LottieComposition lottieComposition = this.f7169c;
        if (lottieComposition == null) {
            this.f7174h.add(new LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable.10
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                /* renamed from: a */
                public void mo4682a(LottieComposition lottieComposition2) {
                    LottieDrawable.this.m4675q(str);
                }
            });
            return;
        }
        Marker m4649d = lottieComposition.m4649d(str);
        if (m4649d == null) {
            throw new IllegalArgumentException(C0000a.m16m("Cannot find marker with name ", str, "."));
        }
        int i2 = (int) m4649d.f7496b;
        m4674p(i2, ((int) m4649d.f7497c) + i2);
    }

    /* renamed from: r */
    public void m4676r(final int i2) {
        if (this.f7169c == null) {
            this.f7174h.add(new LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable.4
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                /* renamed from: a */
                public void mo4682a(LottieComposition lottieComposition) {
                    LottieDrawable.this.m4676r(i2);
                }
            });
        } else {
            this.f7170d.m4843k(i2, (int) r0.f7841j);
        }
    }

    /* renamed from: s */
    public void m4677s(final String str) {
        LottieComposition lottieComposition = this.f7169c;
        if (lottieComposition == null) {
            this.f7174h.add(new LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable.8
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                /* renamed from: a */
                public void mo4682a(LottieComposition lottieComposition2) {
                    LottieDrawable.this.m4677s(str);
                }
            });
            return;
        }
        Marker m4649d = lottieComposition.m4649d(str);
        if (m4649d == null) {
            throw new IllegalArgumentException(C0000a.m16m("Cannot find marker with name ", str, "."));
        }
        m4676r((int) m4649d.f7496b);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange int i2) {
        this.f7184r = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        Logger.m4833a("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void start() {
        m4668j();
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void stop() {
        this.f7174h.clear();
        this.f7170d.m4835c();
    }

    /* renamed from: t */
    public void m4678t(final float f2) {
        LottieComposition lottieComposition = this.f7169c;
        if (lottieComposition == null) {
            this.f7174h.add(new LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable.5
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                /* renamed from: a */
                public void mo4682a(LottieComposition lottieComposition2) {
                    LottieDrawable.this.m4678t(f2);
                }
            });
        } else {
            m4676r((int) MiscUtils.m4848e(lottieComposition.f7149k, lottieComposition.f7150l, f2));
        }
    }

    /* renamed from: u */
    public void m4679u(@FloatRange final float f2) {
        LottieComposition lottieComposition = this.f7169c;
        if (lottieComposition == null) {
            this.f7174h.add(new LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable.15
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                /* renamed from: a */
                public void mo4682a(LottieComposition lottieComposition2) {
                    LottieDrawable.this.m4679u(f2);
                }
            });
        } else {
            this.f7170d.m4842j(MiscUtils.m4848e(lottieComposition.f7149k, lottieComposition.f7150l, f2));
            C0720L.m4640a("Drawable#setProgress");
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    /* renamed from: v */
    public final void m4680v() {
        if (this.f7169c == null) {
            return;
        }
        float f2 = this.f7171e;
        setBounds(0, 0, (int) (r0.f7148j.width() * f2), (int) (this.f7169c.f7148j.height() * f2));
    }

    /* renamed from: w */
    public boolean m4681w() {
        return this.f7181o == null && this.f7169c.f7145g.m1133g() > 0;
    }
}
