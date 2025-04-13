package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import kotlin.KotlinVersion;
import p000a.C0000a;

/* loaded from: classes.dex */
public class CircularProgressDrawable extends Drawable implements Animatable {

    /* renamed from: h */
    public static final Interpolator f6048h = new LinearInterpolator();

    /* renamed from: i */
    public static final Interpolator f6049i = new FastOutSlowInInterpolator();

    /* renamed from: j */
    public static final int[] f6050j = {-16777216};

    /* renamed from: b */
    public final Ring f6051b;

    /* renamed from: c */
    public float f6052c;

    /* renamed from: d */
    public Resources f6053d;

    /* renamed from: e */
    public Animator f6054e;

    /* renamed from: f */
    public float f6055f;

    /* renamed from: g */
    public boolean f6056g;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ProgressDrawableSize {
    }

    public static class Ring {

        /* renamed from: a */
        public final RectF f6061a = new RectF();

        /* renamed from: b */
        public final Paint f6062b;

        /* renamed from: c */
        public final Paint f6063c;

        /* renamed from: d */
        public final Paint f6064d;

        /* renamed from: e */
        public float f6065e;

        /* renamed from: f */
        public float f6066f;

        /* renamed from: g */
        public float f6067g;

        /* renamed from: h */
        public float f6068h;

        /* renamed from: i */
        public int[] f6069i;

        /* renamed from: j */
        public int f6070j;

        /* renamed from: k */
        public float f6071k;

        /* renamed from: l */
        public float f6072l;

        /* renamed from: m */
        public float f6073m;

        /* renamed from: n */
        public boolean f6074n;

        /* renamed from: o */
        public Path f6075o;

        /* renamed from: p */
        public float f6076p;

        /* renamed from: q */
        public float f6077q;

        /* renamed from: r */
        public int f6078r;

        /* renamed from: s */
        public int f6079s;

        /* renamed from: t */
        public int f6080t;

        /* renamed from: u */
        public int f6081u;

        public Ring() {
            Paint paint = new Paint();
            this.f6062b = paint;
            Paint paint2 = new Paint();
            this.f6063c = paint2;
            Paint paint3 = new Paint();
            this.f6064d = paint3;
            this.f6065e = 0.0f;
            this.f6066f = 0.0f;
            this.f6067g = 0.0f;
            this.f6068h = 5.0f;
            this.f6076p = 1.0f;
            this.f6080t = KotlinVersion.MAX_COMPONENT_VALUE;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* renamed from: a */
        public void m4168a(int i2) {
            this.f6070j = i2;
            this.f6081u = this.f6069i[i2];
        }

        /* renamed from: b */
        public void m4169b(boolean z) {
            if (this.f6074n != z) {
                this.f6074n = z;
            }
        }
    }

    public CircularProgressDrawable(@NonNull Context context) {
        Objects.requireNonNull(context);
        this.f6053d = context.getResources();
        final Ring ring = new Ring();
        this.f6051b = ring;
        ring.f6069i = f6050j;
        ring.m4168a(0);
        ring.f6068h = 2.5f;
        ring.f6062b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.swiperefreshlayout.widget.CircularProgressDrawable.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressDrawable.this.m4167d(floatValue, ring);
                CircularProgressDrawable.this.m4164a(floatValue, ring, false);
                CircularProgressDrawable.this.invalidateSelf();
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f6048h);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: androidx.swiperefreshlayout.widget.CircularProgressDrawable.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                CircularProgressDrawable.this.m4164a(1.0f, ring, true);
                Ring ring2 = ring;
                ring2.f6071k = ring2.f6065e;
                ring2.f6072l = ring2.f6066f;
                ring2.f6073m = ring2.f6067g;
                ring2.m4168a((ring2.f6070j + 1) % ring2.f6069i.length);
                CircularProgressDrawable circularProgressDrawable = CircularProgressDrawable.this;
                if (!circularProgressDrawable.f6056g) {
                    circularProgressDrawable.f6055f += 1.0f;
                    return;
                }
                circularProgressDrawable.f6056g = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                ring.m4169b(false);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                CircularProgressDrawable.this.f6055f = 0.0f;
            }
        });
        this.f6054e = ofFloat;
    }

    /* renamed from: a */
    public void m4164a(float f2, Ring ring, boolean z) {
        float interpolation;
        float f3;
        if (this.f6056g) {
            m4167d(f2, ring);
            float floor = (float) (Math.floor(ring.f6073m / 0.8f) + 1.0d);
            float f4 = ring.f6071k;
            float f5 = ring.f6072l;
            ring.f6065e = (((f5 - 0.01f) - f4) * f2) + f4;
            ring.f6066f = f5;
            float f6 = ring.f6073m;
            ring.f6067g = C0000a.m4a(floor, f6, f2, f6);
            return;
        }
        if (f2 != 1.0f || z) {
            float f7 = ring.f6073m;
            if (f2 < 0.5f) {
                interpolation = ring.f6071k;
                f3 = (((FastOutSlowInInterpolator) f6049i).getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f8 = ring.f6071k + 0.79f;
                interpolation = f8 - (((1.0f - ((FastOutSlowInInterpolator) f6049i).getInterpolation((f2 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f3 = f8;
            }
            float f9 = (0.20999998f * f2) + f7;
            float f10 = (f2 + this.f6055f) * 216.0f;
            ring.f6065e = interpolation;
            ring.f6066f = f3;
            ring.f6067g = f9;
            this.f6052c = f10;
        }
    }

    /* renamed from: b */
    public final void m4165b(float f2, float f3, float f4, float f5) {
        Ring ring = this.f6051b;
        float f6 = this.f6053d.getDisplayMetrics().density;
        float f7 = f3 * f6;
        ring.f6068h = f7;
        ring.f6062b.setStrokeWidth(f7);
        ring.f6077q = f2 * f6;
        ring.m4168a(0);
        ring.f6078r = (int) (f4 * f6);
        ring.f6079s = (int) (f5 * f6);
    }

    /* renamed from: c */
    public void m4166c(int i2) {
        if (i2 == 0) {
            m4165b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m4165b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: d */
    public void m4167d(float f2, Ring ring) {
        if (f2 <= 0.75f) {
            ring.f6081u = ring.f6069i[ring.f6070j];
            return;
        }
        float f3 = (f2 - 0.75f) / 0.25f;
        int[] iArr = ring.f6069i;
        int i2 = ring.f6070j;
        int i3 = iArr[i2];
        int i4 = iArr[(i2 + 1) % iArr.length];
        ring.f6081u = ((((i3 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) + ((int) ((((i4 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) - r1) * f3))) << 24) | ((((i3 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) + ((int) ((((i4 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) - r3) * f3))) << 16) | ((((i3 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) + ((int) ((((i4 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) - r4) * f3))) << 8) | ((i3 & KotlinVersion.MAX_COMPONENT_VALUE) + ((int) (f3 * ((i4 & KotlinVersion.MAX_COMPONENT_VALUE) - r2))));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f6052c, bounds.exactCenterX(), bounds.exactCenterY());
        Ring ring = this.f6051b;
        RectF rectF = ring.f6061a;
        float f2 = ring.f6077q;
        float f3 = (ring.f6068h / 2.0f) + f2;
        if (f2 <= 0.0f) {
            f3 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((ring.f6078r * ring.f6076p) / 2.0f, ring.f6068h / 2.0f);
        }
        rectF.set(bounds.centerX() - f3, bounds.centerY() - f3, bounds.centerX() + f3, bounds.centerY() + f3);
        float f4 = ring.f6065e;
        float f5 = ring.f6067g;
        float f6 = (f4 + f5) * 360.0f;
        float f7 = ((ring.f6066f + f5) * 360.0f) - f6;
        ring.f6062b.setColor(ring.f6081u);
        ring.f6062b.setAlpha(ring.f6080t);
        float f8 = ring.f6068h / 2.0f;
        rectF.inset(f8, f8);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, ring.f6064d);
        float f9 = -f8;
        rectF.inset(f9, f9);
        canvas.drawArc(rectF, f6, f7, false, ring.f6062b);
        if (ring.f6074n) {
            Path path = ring.f6075o;
            if (path == null) {
                Path path2 = new Path();
                ring.f6075o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f10 = (ring.f6078r * ring.f6076p) / 2.0f;
            ring.f6075o.moveTo(0.0f, 0.0f);
            ring.f6075o.lineTo(ring.f6078r * ring.f6076p, 0.0f);
            Path path3 = ring.f6075o;
            float f11 = ring.f6078r;
            float f12 = ring.f6076p;
            path3.lineTo((f11 * f12) / 2.0f, ring.f6079s * f12);
            ring.f6075o.offset((rectF.centerX() + min) - f10, (ring.f6068h / 2.0f) + rectF.centerY());
            ring.f6075o.close();
            ring.f6063c.setColor(ring.f6081u);
            ring.f6063c.setAlpha(ring.f6080t);
            canvas.save();
            canvas.rotate(f6 + f7, rectF.centerX(), rectF.centerY());
            canvas.drawPath(ring.f6075o, ring.f6063c);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f6051b.f6080t;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f6054e.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f6051b.f6080t = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6051b.f6062b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f6054e.cancel();
        Ring ring = this.f6051b;
        float f2 = ring.f6065e;
        ring.f6071k = f2;
        float f3 = ring.f6066f;
        ring.f6072l = f3;
        ring.f6073m = ring.f6067g;
        if (f3 != f2) {
            this.f6056g = true;
            this.f6054e.setDuration(666L);
            this.f6054e.start();
            return;
        }
        ring.m4168a(0);
        Ring ring2 = this.f6051b;
        ring2.f6071k = 0.0f;
        ring2.f6072l = 0.0f;
        ring2.f6073m = 0.0f;
        ring2.f6065e = 0.0f;
        ring2.f6066f = 0.0f;
        ring2.f6067g = 0.0f;
        this.f6054e.setDuration(1332L);
        this.f6054e.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f6054e.cancel();
        this.f6052c = 0.0f;
        this.f6051b.m4169b(false);
        this.f6051b.m4168a(0);
        Ring ring = this.f6051b;
        ring.f6071k = 0.0f;
        ring.f6072l = 0.0f;
        ring.f6073m = 0.0f;
        ring.f6065e = 0.0f;
        ring.f6066f = 0.0f;
        ring.f6067g = 0.0f;
        invalidateSelf();
    }
}
