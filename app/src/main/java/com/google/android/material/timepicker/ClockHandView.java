package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import com.google.android.material.C1195R;
import com.swiftsoft.anixartd.C2507R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
class ClockHandView extends View {

    /* renamed from: u */
    public static final /* synthetic */ int f19191u = 0;

    /* renamed from: b */
    public final ValueAnimator f19192b;

    /* renamed from: c */
    public boolean f19193c;

    /* renamed from: d */
    public float f19194d;

    /* renamed from: e */
    public float f19195e;

    /* renamed from: f */
    public boolean f19196f;

    /* renamed from: g */
    public final int f19197g;

    /* renamed from: h */
    public boolean f19198h;

    /* renamed from: i */
    public final List<OnRotateListener> f19199i;

    /* renamed from: j */
    public final int f19200j;

    /* renamed from: k */
    public final float f19201k;

    /* renamed from: l */
    public final Paint f19202l;

    /* renamed from: m */
    public final RectF f19203m;

    /* renamed from: n */
    @Px
    public final int f19204n;

    /* renamed from: o */
    public float f19205o;

    /* renamed from: p */
    public boolean f19206p;

    /* renamed from: q */
    public OnActionUpListener f19207q;

    /* renamed from: r */
    public double f19208r;

    /* renamed from: s */
    public int f19209s;

    /* renamed from: t */
    public int f19210t;

    public interface OnActionUpListener {
        /* renamed from: c */
        void mo10546c(@FloatRange float f2, boolean z);
    }

    public interface OnRotateListener {
        /* renamed from: b */
        void mo10538b(@FloatRange float f2, boolean z);
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, C2507R.attr.materialClockStyle);
        this.f19192b = new ValueAnimator();
        this.f19199i = new ArrayList();
        Paint paint = new Paint();
        this.f19202l = paint;
        this.f19203m = new RectF();
        this.f19210t = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1195R.styleable.f17326k, C2507R.attr.materialClockStyle, C2507R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.f19209s = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f19200j = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f19204n = getResources().getDimensionPixelSize(C2507R.dimen.material_clock_hand_stroke_width);
        this.f19201k = r4.getDimensionPixelSize(C2507R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m10544c(0.0f, false);
        this.f19197g = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewCompat.m2216o0(this, 2);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final int m10542a(float f2, float f3) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f3 - (getHeight() / 2), f2 - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    @Dimension
    /* renamed from: b */
    public final int m10543b(int i2) {
        return i2 == 2 ? Math.round(this.f19209s * 0.66f) : this.f19209s;
    }

    /* renamed from: c */
    public void m10544c(@FloatRange float f2, boolean z) {
        ValueAnimator valueAnimator = this.f19192b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            m10545d(f2, false);
            return;
        }
        float f3 = this.f19205o;
        if (Math.abs(f3 - f2) > 180.0f) {
            if (f3 > 180.0f && f2 < 180.0f) {
                f2 += 360.0f;
            }
            if (f3 < 180.0f && f2 > 180.0f) {
                f3 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f3), Float.valueOf(f2));
        this.f19192b.setFloatValues(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        this.f19192b.setDuration(200L);
        this.f19192b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView clockHandView = ClockHandView.this;
                int i2 = ClockHandView.f19191u;
                Objects.requireNonNull(clockHandView);
                clockHandView.m10545d(((Float) valueAnimator2.getAnimatedValue()).floatValue(), true);
            }
        });
        this.f19192b.addListener(new AnimatorListenerAdapter(this) { // from class: com.google.android.material.timepicker.ClockHandView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                animator.end();
            }
        });
        this.f19192b.start();
    }

    /* renamed from: d */
    public final void m10545d(@FloatRange float f2, boolean z) {
        float f3 = f2 % 360.0f;
        this.f19205o = f3;
        this.f19208r = Math.toRadians(f3 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float m10543b = m10543b(this.f19210t);
        float cos = (((float) Math.cos(this.f19208r)) * m10543b) + width;
        float sin = (m10543b * ((float) Math.sin(this.f19208r))) + height;
        RectF rectF = this.f19203m;
        int i2 = this.f19200j;
        rectF.set(cos - i2, sin - i2, cos + i2, sin + i2);
        Iterator<OnRotateListener> it = this.f19199i.iterator();
        while (it.hasNext()) {
            it.next().mo10538b(f3, z);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f2 = width;
        float m10543b = m10543b(this.f19210t);
        float cos = (((float) Math.cos(this.f19208r)) * m10543b) + f2;
        float f3 = height;
        float sin = (m10543b * ((float) Math.sin(this.f19208r))) + f3;
        this.f19202l.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f19200j, this.f19202l);
        double sin2 = Math.sin(this.f19208r);
        double cos2 = Math.cos(this.f19208r);
        this.f19202l.setStrokeWidth(this.f19204n);
        canvas.drawLine(f2, f3, width + ((int) (cos2 * r7)), height + ((int) (r7 * sin2)), this.f19202l);
        canvas.drawCircle(f2, f3, this.f19201k, this.f19202l);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (this.f19192b.isRunning()) {
            return;
        }
        m10544c(this.f19205o, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    @Override // android.view.View
    @android.annotation.SuppressLint
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            int r0 = r11.getActionMasked()
            float r1 = r11.getX()
            float r11 = r11.getY()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L66
            r4 = 2
            if (r0 == r3) goto L19
            if (r0 == r4) goto L19
            r0 = 0
            r4 = 0
        L17:
            r5 = 0
            goto L71
        L19:
            float r5 = r10.f19194d
            float r5 = r1 - r5
            int r5 = (int) r5
            float r6 = r10.f19195e
            float r6 = r11 - r6
            int r6 = (int) r6
            int r5 = r5 * r5
            int r6 = r6 * r6
            int r6 = r6 + r5
            int r5 = r10.f19197g
            if (r6 <= r5) goto L2e
            r5 = 1
            goto L2f
        L2e:
            r5 = 0
        L2f:
            r10.f19196f = r5
            boolean r5 = r10.f19206p
            if (r0 != r3) goto L37
            r0 = 1
            goto L38
        L37:
            r0 = 0
        L38:
            boolean r6 = r10.f19198h
            if (r6 == 0) goto L64
            int r6 = r10.getWidth()
            int r6 = r6 / r4
            int r7 = r10.getHeight()
            int r7 = r7 / r4
            float r6 = (float) r6
            float r7 = (float) r7
            float r6 = com.google.android.material.math.MathUtils.m10179a(r6, r7, r1, r11)
            int r7 = r10.m10543b(r4)
            android.content.Context r8 = r10.getContext()
            r9 = 12
            float r8 = com.google.android.material.internal.ViewUtils.m10165b(r8, r9)
            float r7 = (float) r7
            float r7 = r7 + r8
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 > 0) goto L61
            goto L62
        L61:
            r4 = 1
        L62:
            r10.f19210t = r4
        L64:
            r4 = 0
            goto L71
        L66:
            r10.f19194d = r1
            r10.f19195e = r11
            r10.f19196f = r3
            r10.f19206p = r2
            r0 = 0
            r4 = 1
            goto L17
        L71:
            boolean r6 = r10.f19206p
            int r7 = r10.m10542a(r1, r11)
            float r8 = r10.f19205o
            float r7 = (float) r7
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 == 0) goto L80
            r8 = 1
            goto L81
        L80:
            r8 = 0
        L81:
            if (r4 == 0) goto L87
            if (r8 == 0) goto L87
        L85:
            r2 = 1
            goto L96
        L87:
            if (r8 != 0) goto L8b
            if (r5 == 0) goto L96
        L8b:
            if (r0 == 0) goto L92
            boolean r4 = r10.f19193c
            if (r4 == 0) goto L92
            r2 = 1
        L92:
            r10.m10544c(r7, r2)
            goto L85
        L96:
            r2 = r2 | r6
            r10.f19206p = r2
            if (r2 == 0) goto Lab
            if (r0 == 0) goto Lab
            com.google.android.material.timepicker.ClockHandView$OnActionUpListener r0 = r10.f19207q
            if (r0 == 0) goto Lab
            int r11 = r10.m10542a(r1, r11)
            float r11 = (float) r11
            boolean r1 = r10.f19196f
            r0.mo10546c(r11, r1)
        Lab:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.ClockHandView.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
