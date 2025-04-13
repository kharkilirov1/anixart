package com.google.android.exoplayer2.p009ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.p009ui.TimeBar;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class DefaultTimeBar extends View implements TimeBar {

    /* renamed from: P */
    public static final /* synthetic */ int f14086P = 0;

    /* renamed from: A */
    public final float f14087A;

    /* renamed from: B */
    public int f14088B;

    /* renamed from: C */
    public long f14089C;

    /* renamed from: D */
    public int f14090D;

    /* renamed from: E */
    public Rect f14091E;

    /* renamed from: F */
    public ValueAnimator f14092F;

    /* renamed from: G */
    public float f14093G;

    /* renamed from: H */
    public boolean f14094H;

    /* renamed from: I */
    public long f14095I;

    /* renamed from: J */
    public long f14096J;

    /* renamed from: K */
    public long f14097K;

    /* renamed from: L */
    public long f14098L;

    /* renamed from: M */
    public int f14099M;

    /* renamed from: N */
    @Nullable
    public long[] f14100N;

    /* renamed from: O */
    @Nullable
    public boolean[] f14101O;

    /* renamed from: b */
    public final Rect f14102b;

    /* renamed from: c */
    public final Rect f14103c;

    /* renamed from: d */
    public final Rect f14104d;

    /* renamed from: e */
    public final Rect f14105e;

    /* renamed from: f */
    public final Paint f14106f;

    /* renamed from: g */
    public final Paint f14107g;

    /* renamed from: h */
    public final Paint f14108h;

    /* renamed from: i */
    public final Paint f14109i;

    /* renamed from: j */
    public final Paint f14110j;

    /* renamed from: k */
    public final Paint f14111k;

    /* renamed from: l */
    @Nullable
    public final Drawable f14112l;

    /* renamed from: m */
    public final int f14113m;

    /* renamed from: n */
    public final int f14114n;

    /* renamed from: o */
    public final int f14115o;

    /* renamed from: p */
    public final int f14116p;

    /* renamed from: q */
    public final int f14117q;

    /* renamed from: r */
    public final int f14118r;

    /* renamed from: s */
    public final int f14119s;

    /* renamed from: t */
    public final int f14120t;

    /* renamed from: u */
    public final int f14121u;

    /* renamed from: v */
    public final StringBuilder f14122v;

    /* renamed from: w */
    public final Formatter f14123w;

    /* renamed from: x */
    public final Runnable f14124x;

    /* renamed from: y */
    public final CopyOnWriteArraySet<TimeBar.OnScrubListener> f14125y;

    /* renamed from: z */
    public final Point f14126z;

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, attributeSet);
    }

    /* renamed from: c */
    public static int m7345c(float f2, int i2) {
        return (int) ((i2 * f2) + 0.5f);
    }

    private long getPositionIncrement() {
        long j2 = this.f14089C;
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        long j3 = this.f14096J;
        if (j3 == -9223372036854775807L) {
            return 0L;
        }
        return j3 / this.f14088B;
    }

    private String getProgressText() {
        return Util.m7706E(this.f14122v, this.f14123w, this.f14097K);
    }

    private long getScrubberPosition() {
        if (this.f14103c.width() <= 0 || this.f14096J == -9223372036854775807L) {
            return 0L;
        }
        return (this.f14105e.width() * this.f14096J) / this.f14103c.width();
    }

    @Override // com.google.android.exoplayer2.p009ui.TimeBar
    /* renamed from: a */
    public void mo7346a(@Nullable long[] jArr, @Nullable boolean[] zArr, int i2) {
        Assertions.m7513a(i2 == 0 || !(jArr == null || zArr == null));
        this.f14099M = i2;
        this.f14100N = jArr;
        this.f14101O = zArr;
        m7352h();
    }

    @Override // com.google.android.exoplayer2.p009ui.TimeBar
    /* renamed from: b */
    public void mo7347b(TimeBar.OnScrubListener onScrubListener) {
        this.f14125y.add(onScrubListener);
    }

    /* renamed from: d */
    public final void m7348d(float f2) {
        Rect rect = this.f14105e;
        Rect rect2 = this.f14103c;
        rect.right = Util.m7741j((int) f2, rect2.left, rect2.right);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        m7353i();
    }

    /* renamed from: e */
    public final boolean m7349e(long j2) {
        long j3 = this.f14096J;
        if (j3 <= 0) {
            return false;
        }
        long j4 = this.f14094H ? this.f14095I : this.f14097K;
        long m7742k = Util.m7742k(j4 + j2, 0L, j3);
        if (m7742k == j4) {
            return false;
        }
        if (this.f14094H) {
            m7354j(m7742k);
        } else {
            m7350f(m7742k);
        }
        m7352h();
        return true;
    }

    /* renamed from: f */
    public final void m7350f(long j2) {
        this.f14095I = j2;
        this.f14094H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<TimeBar.OnScrubListener> it = this.f14125y.iterator();
        while (it.hasNext()) {
            it.next().mo7376c(this, j2);
        }
    }

    /* renamed from: g */
    public final void m7351g(boolean z) {
        removeCallbacks(this.f14124x);
        this.f14094H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<TimeBar.OnScrubListener> it = this.f14125y.iterator();
        while (it.hasNext()) {
            it.next().mo7375b(this, this.f14095I, z);
        }
    }

    @Override // com.google.android.exoplayer2.p009ui.TimeBar
    public long getPreferredUpdateDelay() {
        int width = (int) (this.f14103c.width() / this.f14087A);
        if (width != 0) {
            long j2 = this.f14096J;
            if (j2 != 0 && j2 != -9223372036854775807L) {
                return j2 / width;
            }
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: h */
    public final void m7352h() {
        this.f14104d.set(this.f14103c);
        this.f14105e.set(this.f14103c);
        long j2 = this.f14094H ? this.f14095I : this.f14097K;
        if (this.f14096J > 0) {
            int width = (int) ((this.f14103c.width() * this.f14098L) / this.f14096J);
            Rect rect = this.f14104d;
            Rect rect2 = this.f14103c;
            rect.right = Math.min(rect2.left + width, rect2.right);
            int width2 = (int) ((this.f14103c.width() * j2) / this.f14096J);
            Rect rect3 = this.f14105e;
            Rect rect4 = this.f14103c;
            rect3.right = Math.min(rect4.left + width2, rect4.right);
        } else {
            Rect rect5 = this.f14104d;
            int i2 = this.f14103c.left;
            rect5.right = i2;
            this.f14105e.right = i2;
        }
        invalidate(this.f14102b);
    }

    /* renamed from: i */
    public final void m7353i() {
        Drawable drawable = this.f14112l;
        if (drawable != null && drawable.isStateful() && this.f14112l.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* renamed from: j */
    public final void m7354j(long j2) {
        if (this.f14095I == j2) {
            return;
        }
        this.f14095I = j2;
        Iterator<TimeBar.OnScrubListener> it = this.f14125y.iterator();
        while (it.hasNext()) {
            it.next().mo7374a(this, j2);
        }
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f14112l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        int height = this.f14103c.height();
        int centerY = this.f14103c.centerY() - (height / 2);
        int i2 = height + centerY;
        if (this.f14096J <= 0) {
            Rect rect = this.f14103c;
            canvas.drawRect(rect.left, centerY, rect.right, i2, this.f14108h);
        } else {
            Rect rect2 = this.f14104d;
            int i3 = rect2.left;
            int i4 = rect2.right;
            int max = Math.max(Math.max(this.f14103c.left, i4), this.f14105e.right);
            int i5 = this.f14103c.right;
            if (max < i5) {
                canvas.drawRect(max, centerY, i5, i2, this.f14108h);
            }
            int max2 = Math.max(i3, this.f14105e.right);
            if (i4 > max2) {
                canvas.drawRect(max2, centerY, i4, i2, this.f14107g);
            }
            if (this.f14105e.width() > 0) {
                Rect rect3 = this.f14105e;
                canvas.drawRect(rect3.left, centerY, rect3.right, i2, this.f14106f);
            }
            if (this.f14099M != 0) {
                long[] jArr = this.f14100N;
                Objects.requireNonNull(jArr);
                boolean[] zArr = this.f14101O;
                Objects.requireNonNull(zArr);
                int i6 = this.f14116p / 2;
                for (int i7 = 0; i7 < this.f14099M; i7++) {
                    int width = ((int) ((this.f14103c.width() * Util.m7742k(jArr[i7], 0L, this.f14096J)) / this.f14096J)) - i6;
                    Rect rect4 = this.f14103c;
                    canvas.drawRect(Math.min(rect4.width() - this.f14116p, Math.max(0, width)) + rect4.left, centerY, r1 + this.f14116p, i2, zArr[i7] ? this.f14110j : this.f14109i);
                }
            }
        }
        if (this.f14096J > 0) {
            Rect rect5 = this.f14105e;
            int m7741j = Util.m7741j(rect5.right, rect5.left, this.f14103c.right);
            int centerY2 = this.f14105e.centerY();
            if (this.f14112l == null) {
                canvas.drawCircle(m7741j, centerY2, (int) ((((this.f14094H || isFocused()) ? this.f14119s : isEnabled() ? this.f14117q : this.f14118r) * this.f14093G) / 2.0f), this.f14111k);
            } else {
                int intrinsicWidth = ((int) (r3.getIntrinsicWidth() * this.f14093G)) / 2;
                int intrinsicHeight = ((int) (this.f14112l.getIntrinsicHeight() * this.f14093G)) / 2;
                this.f14112l.setBounds(m7741j - intrinsicWidth, centerY2 - intrinsicHeight, m7741j + intrinsicWidth, centerY2 + intrinsicHeight);
                this.f14112l.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i2, @Nullable Rect rect) {
        super.onFocusChanged(z, i2, rect);
        if (!this.f14094H || z) {
            return;
        }
        m7351g(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f14096J <= 0) {
            return;
        }
        if (Util.f14736a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT);
            accessibilityNodeInfo.addAction(RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.m7349e(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.f14124x
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f14124x
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.f14094H
            if (r0 == 0) goto L30
            r5 = 0
            r4.m7351g(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p009ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        Rect rect;
        int i8 = i4 - i2;
        int i9 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i8 - getPaddingRight();
        int i10 = this.f14120t;
        if (this.f14115o == 1) {
            i6 = (i9 - getPaddingBottom()) - this.f14114n;
            int paddingBottom = i9 - getPaddingBottom();
            int i11 = this.f14113m;
            i7 = (paddingBottom - i11) - Math.max(i10 - (i11 / 2), 0);
        } else {
            i6 = (i9 - this.f14114n) / 2;
            i7 = (i9 - this.f14113m) / 2;
        }
        this.f14102b.set(paddingLeft, i6, paddingRight, this.f14114n + i6);
        Rect rect2 = this.f14103c;
        Rect rect3 = this.f14102b;
        rect2.set(rect3.left + i10, i7, rect3.right - i10, this.f14113m + i7);
        if (Util.f14736a >= 29 && ((rect = this.f14091E) == null || rect.width() != i8 || this.f14091E.height() != i9)) {
            Rect rect4 = new Rect(0, 0, i8, i9);
            this.f14091E = rect4;
            setSystemGestureExclusionRects(Collections.singletonList(rect4));
        }
        m7352h();
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == 0) {
            size = this.f14114n;
        } else if (mode != 1073741824) {
            size = Math.min(this.f14114n, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i2), size);
        m7353i();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        Drawable drawable = this.f14112l;
        if (drawable != null) {
            if (Util.f14736a >= 23 && drawable.setLayoutDirection(i2)) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r3 != 3) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L89
            long r2 = r7.f14096J
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto L89
        L11:
            android.graphics.Point r0 = r7.f14126z
            float r2 = r8.getX()
            int r2 = (int) r2
            float r3 = r8.getY()
            int r3 = (int) r3
            r0.set(r2, r3)
            android.graphics.Point r0 = r7.f14126z
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L6c
            r5 = 3
            if (r3 == r4) goto L5d
            r6 = 2
            if (r3 == r6) goto L36
            if (r3 == r5) goto L5d
            goto L89
        L36:
            boolean r8 = r7.f14094H
            if (r8 == 0) goto L89
            int r8 = r7.f14121u
            if (r0 >= r8) goto L49
            int r8 = r7.f14090D
            int r8 = p000a.C0000a.m5b(r2, r8, r5, r8)
            float r8 = (float) r8
            r7.m7348d(r8)
            goto L4f
        L49:
            r7.f14090D = r2
            float r8 = (float) r2
            r7.m7348d(r8)
        L4f:
            long r0 = r7.getScrubberPosition()
            r7.m7354j(r0)
            r7.m7352h()
            r7.invalidate()
            return r4
        L5d:
            boolean r0 = r7.f14094H
            if (r0 == 0) goto L89
            int r8 = r8.getAction()
            if (r8 != r5) goto L68
            r1 = 1
        L68:
            r7.m7351g(r1)
            return r4
        L6c:
            float r8 = (float) r2
            float r0 = (float) r0
            android.graphics.Rect r2 = r7.f14102b
            int r3 = (int) r8
            int r0 = (int) r0
            boolean r0 = r2.contains(r3, r0)
            if (r0 == 0) goto L89
            r7.m7348d(r8)
            long r0 = r7.getScrubberPosition()
            r7.m7350f(r0)
            r7.m7352h()
            r7.invalidate()
            return r4
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p009ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i2, @Nullable Bundle bundle) {
        if (super.performAccessibilityAction(i2, bundle)) {
            return true;
        }
        if (this.f14096J <= 0) {
            return false;
        }
        if (i2 == 8192) {
            if (m7349e(-getPositionIncrement())) {
                m7351g(false);
            }
        } else {
            if (i2 != 4096) {
                return false;
            }
            if (m7349e(getPositionIncrement())) {
                m7351g(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(@ColorInt int i2) {
        this.f14109i.setColor(i2);
        invalidate(this.f14102b);
    }

    public void setBufferedColor(@ColorInt int i2) {
        this.f14107g.setColor(i2);
        invalidate(this.f14102b);
    }

    @Override // com.google.android.exoplayer2.p009ui.TimeBar
    public void setBufferedPosition(long j2) {
        if (this.f14098L == j2) {
            return;
        }
        this.f14098L = j2;
        m7352h();
    }

    @Override // com.google.android.exoplayer2.p009ui.TimeBar
    public void setDuration(long j2) {
        if (this.f14096J == j2) {
            return;
        }
        this.f14096J = j2;
        if (this.f14094H && j2 == -9223372036854775807L) {
            m7351g(true);
        }
        m7352h();
    }

    @Override // android.view.View, com.google.android.exoplayer2.p009ui.TimeBar
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.f14094H || z) {
            return;
        }
        m7351g(true);
    }

    public void setKeyCountIncrement(int i2) {
        Assertions.m7513a(i2 > 0);
        this.f14088B = i2;
        this.f14089C = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j2) {
        Assertions.m7513a(j2 > 0);
        this.f14088B = -1;
        this.f14089C = j2;
    }

    public void setPlayedAdMarkerColor(@ColorInt int i2) {
        this.f14110j.setColor(i2);
        invalidate(this.f14102b);
    }

    public void setPlayedColor(@ColorInt int i2) {
        this.f14106f.setColor(i2);
        invalidate(this.f14102b);
    }

    @Override // com.google.android.exoplayer2.p009ui.TimeBar
    public void setPosition(long j2) {
        if (this.f14097K == j2) {
            return;
        }
        this.f14097K = j2;
        setContentDescription(getProgressText());
        m7352h();
    }

    public void setScrubberColor(@ColorInt int i2) {
        this.f14111k.setColor(i2);
        invalidate(this.f14102b);
    }

    public void setUnplayedColor(@ColorInt int i2) {
        this.f14108h.setColor(i2);
        invalidate(this.f14102b);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet, int i2, @Nullable AttributeSet attributeSet2) {
        super(context, attributeSet, i2);
        this.f14102b = new Rect();
        this.f14103c = new Rect();
        this.f14104d = new Rect();
        this.f14105e = new Rect();
        Paint paint = new Paint();
        this.f14106f = paint;
        Paint paint2 = new Paint();
        this.f14107g = paint2;
        Paint paint3 = new Paint();
        this.f14108h = paint3;
        Paint paint4 = new Paint();
        this.f14109i = paint4;
        Paint paint5 = new Paint();
        this.f14110j = paint5;
        Paint paint6 = new Paint();
        this.f14111k = paint6;
        paint6.setAntiAlias(true);
        this.f14125y = new CopyOnWriteArraySet<>();
        this.f14126z = new Point();
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f14087A = f2;
        this.f14121u = m7345c(f2, -50);
        int m7345c = m7345c(f2, 4);
        int m7345c2 = m7345c(f2, 26);
        int m7345c3 = m7345c(f2, 4);
        int m7345c4 = m7345c(f2, 12);
        int m7345c5 = m7345c(f2, 0);
        int m7345c6 = m7345c(f2, 16);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C1140R.styleable.f14216b, i2, 0);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(10);
                this.f14112l = drawable;
                if (drawable != null) {
                    int i3 = Util.f14736a;
                    if (i3 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i3 >= 23) {
                            drawable.setLayoutDirection(layoutDirection);
                        }
                    }
                    m7345c2 = Math.max(drawable.getMinimumHeight(), m7345c2);
                }
                this.f14113m = obtainStyledAttributes.getDimensionPixelSize(3, m7345c);
                this.f14114n = obtainStyledAttributes.getDimensionPixelSize(12, m7345c2);
                this.f14115o = obtainStyledAttributes.getInt(2, 0);
                this.f14116p = obtainStyledAttributes.getDimensionPixelSize(1, m7345c3);
                this.f14117q = obtainStyledAttributes.getDimensionPixelSize(11, m7345c4);
                this.f14118r = obtainStyledAttributes.getDimensionPixelSize(8, m7345c5);
                this.f14119s = obtainStyledAttributes.getDimensionPixelSize(9, m7345c6);
                int i4 = obtainStyledAttributes.getInt(6, -1);
                int i5 = obtainStyledAttributes.getInt(7, -1);
                int i6 = obtainStyledAttributes.getInt(4, -855638017);
                int i7 = obtainStyledAttributes.getInt(13, 872415231);
                int i8 = obtainStyledAttributes.getInt(0, -1291845888);
                int i9 = obtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i4);
                paint6.setColor(i5);
                paint2.setColor(i6);
                paint3.setColor(i7);
                paint4.setColor(i8);
                paint5.setColor(i9);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.f14113m = m7345c;
            this.f14114n = m7345c2;
            this.f14115o = 0;
            this.f14116p = m7345c3;
            this.f14117q = m7345c4;
            this.f14118r = m7345c5;
            this.f14119s = m7345c6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f14112l = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f14122v = sb;
        this.f14123w = new Formatter(sb, Locale.getDefault());
        this.f14124x = new RunnableC1156b(this, 2);
        Drawable drawable2 = this.f14112l;
        if (drawable2 != null) {
            this.f14120t = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f14120t = (Math.max(this.f14118r, Math.max(this.f14117q, this.f14119s)) + 1) / 2;
        }
        this.f14093G = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f14092F = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DefaultTimeBar defaultTimeBar = DefaultTimeBar.this;
                int i10 = DefaultTimeBar.f14086P;
                Objects.requireNonNull(defaultTimeBar);
                defaultTimeBar.f14093G = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                defaultTimeBar.invalidate(defaultTimeBar.f14102b);
            }
        });
        this.f14096J = -9223372036854775807L;
        this.f14089C = -9223372036854775807L;
        this.f14088B = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
