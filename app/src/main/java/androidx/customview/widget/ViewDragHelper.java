package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import java.util.Arrays;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ViewDragHelper {

    /* renamed from: x */
    public static final Interpolator f3894x = new Interpolator() { // from class: androidx.customview.widget.ViewDragHelper.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };

    /* renamed from: a */
    public int f3895a;

    /* renamed from: b */
    public int f3896b;

    /* renamed from: d */
    public float[] f3898d;

    /* renamed from: e */
    public float[] f3899e;

    /* renamed from: f */
    public float[] f3900f;

    /* renamed from: g */
    public float[] f3901g;

    /* renamed from: h */
    public int[] f3902h;

    /* renamed from: i */
    public int[] f3903i;

    /* renamed from: j */
    public int[] f3904j;

    /* renamed from: k */
    public int f3905k;

    /* renamed from: l */
    public VelocityTracker f3906l;

    /* renamed from: m */
    public float f3907m;

    /* renamed from: n */
    public float f3908n;

    /* renamed from: o */
    public int f3909o;

    /* renamed from: p */
    public final int f3910p;

    /* renamed from: q */
    public int f3911q;

    /* renamed from: r */
    public OverScroller f3912r;

    /* renamed from: s */
    public final Callback f3913s;

    /* renamed from: t */
    public View f3914t;

    /* renamed from: u */
    public boolean f3915u;

    /* renamed from: v */
    public final ViewGroup f3916v;

    /* renamed from: c */
    public int f3897c = -1;

    /* renamed from: w */
    public final Runnable f3917w = new Runnable() { // from class: androidx.customview.widget.ViewDragHelper.2
        @Override // java.lang.Runnable
        public void run() {
            ViewDragHelper.this.m2733w(0);
        }
    };

    public static abstract class Callback {
        /* renamed from: a */
        public int mo2737a(@NonNull View view, int i2, int i3) {
            return 0;
        }

        /* renamed from: b */
        public int mo2738b(@NonNull View view, int i2, int i3) {
            return 0;
        }

        /* renamed from: c */
        public int mo2739c(@NonNull View view) {
            return 0;
        }

        /* renamed from: d */
        public int mo2740d(@NonNull View view) {
            return 0;
        }

        /* renamed from: e */
        public void mo2741e(int i2, int i3) {
        }

        /* renamed from: f */
        public void mo2742f(int i2, int i3) {
        }

        /* renamed from: g */
        public void mo2743g(@NonNull View view, int i2) {
        }

        /* renamed from: h */
        public void mo2744h(int i2) {
        }

        /* renamed from: i */
        public void mo2745i(@NonNull View view, int i2, int i3, @Px int i4, @Px int i5) {
        }

        /* renamed from: j */
        public void mo2746j(@NonNull View view, float f2, float f3) {
        }

        /* renamed from: k */
        public abstract boolean mo2747k(@NonNull View view, int i2);
    }

    public ViewDragHelper(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f3916v = viewGroup;
        this.f3913s = callback;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i2 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f3910p = i2;
        this.f3909o = i2;
        this.f3896b = viewConfiguration.getScaledTouchSlop();
        this.f3907m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3908n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3912r = new OverScroller(context, f3894x);
    }

    /* renamed from: k */
    public static ViewDragHelper m2710k(@NonNull ViewGroup viewGroup, float f2, @NonNull Callback callback) {
        ViewDragHelper viewDragHelper = new ViewDragHelper(viewGroup.getContext(), viewGroup, callback);
        viewDragHelper.f3896b = (int) ((1.0f / f2) * viewDragHelper.f3896b);
        return viewDragHelper;
    }

    /* renamed from: A */
    public boolean m2711A(View view, int i2) {
        if (view == this.f3914t && this.f3897c == i2) {
            return true;
        }
        if (view == null || !this.f3913s.mo2747k(view, i2)) {
            return false;
        }
        this.f3897c = i2;
        m2714c(view, i2);
        return true;
    }

    /* renamed from: a */
    public void m2712a() {
        m2713b();
        if (this.f3895a == 2) {
            int currX = this.f3912r.getCurrX();
            int currY = this.f3912r.getCurrY();
            this.f3912r.abortAnimation();
            int currX2 = this.f3912r.getCurrX();
            int currY2 = this.f3912r.getCurrY();
            this.f3913s.mo2745i(this.f3914t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        m2733w(0);
    }

    /* renamed from: b */
    public void m2713b() {
        this.f3897c = -1;
        float[] fArr = this.f3898d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f3899e, 0.0f);
            Arrays.fill(this.f3900f, 0.0f);
            Arrays.fill(this.f3901g, 0.0f);
            Arrays.fill(this.f3902h, 0);
            Arrays.fill(this.f3903i, 0);
            Arrays.fill(this.f3904j, 0);
            this.f3905k = 0;
        }
        VelocityTracker velocityTracker = this.f3906l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3906l = null;
        }
    }

    /* renamed from: c */
    public void m2714c(@NonNull View view, int i2) {
        if (view.getParent() != this.f3916v) {
            StringBuilder m24u = C0000a.m24u("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            m24u.append(this.f3916v);
            m24u.append(")");
            throw new IllegalArgumentException(m24u.toString());
        }
        this.f3914t = view;
        this.f3897c = i2;
        this.f3913s.mo2743g(view, i2);
        m2733w(1);
    }

    /* renamed from: d */
    public final boolean m2715d(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.f3902h[i2] & i3) != i3 || (this.f3911q & i3) == 0 || (this.f3904j[i2] & i3) == i3 || (this.f3903i[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.f3896b;
        if (abs <= i4 && abs2 <= i4) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            Objects.requireNonNull(this.f3913s);
        }
        return (this.f3903i[i2] & i3) == 0 && abs > ((float) this.f3896b);
    }

    /* renamed from: e */
    public final boolean m2716e(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.f3913s.mo2739c(view) > 0;
        boolean z2 = this.f3913s.mo2740d(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.f3896b) : z2 && Math.abs(f3) > ((float) this.f3896b);
        }
        float f4 = (f3 * f3) + (f2 * f2);
        int i2 = this.f3896b;
        return f4 > ((float) (i2 * i2));
    }

    /* renamed from: f */
    public final float m2717f(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        return abs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    /* renamed from: g */
    public final int m2718g(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        return abs > i4 ? i2 > 0 ? i4 : -i4 : i2;
    }

    /* renamed from: h */
    public final void m2719h(int i2) {
        if (this.f3898d == null || !m2725o(i2)) {
            return;
        }
        this.f3898d[i2] = 0.0f;
        this.f3899e[i2] = 0.0f;
        this.f3900f[i2] = 0.0f;
        this.f3901g[i2] = 0.0f;
        this.f3902h[i2] = 0;
        this.f3903i[i2] = 0;
        this.f3904j[i2] = 0;
        this.f3905k = (~(1 << i2)) & this.f3905k;
    }

    /* renamed from: i */
    public final int m2720i(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        float width = this.f3916v.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i2) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i3);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i2) / i4) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: j */
    public boolean m2721j(boolean z) {
        if (this.f3895a == 2) {
            boolean computeScrollOffset = this.f3912r.computeScrollOffset();
            int currX = this.f3912r.getCurrX();
            int currY = this.f3912r.getCurrY();
            int left = currX - this.f3914t.getLeft();
            int top = currY - this.f3914t.getTop();
            if (left != 0) {
                ViewCompat.m2178R(this.f3914t, left);
            }
            if (top != 0) {
                ViewCompat.m2179S(this.f3914t, top);
            }
            if (left != 0 || top != 0) {
                this.f3913s.mo2745i(this.f3914t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f3912r.getFinalX() && currY == this.f3912r.getFinalY()) {
                this.f3912r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f3916v.post(this.f3917w);
                } else {
                    m2733w(0);
                }
            }
        }
        return this.f3895a == 2;
    }

    /* renamed from: l */
    public final void m2722l(float f2, float f3) {
        this.f3915u = true;
        this.f3913s.mo2746j(this.f3914t, f2, f3);
        this.f3915u = false;
        if (this.f3895a == 1) {
            m2733w(0);
        }
    }

    @Nullable
    /* renamed from: m */
    public View m2723m(int i2, int i3) {
        for (int childCount = this.f3916v.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f3916v;
            Objects.requireNonNull(this.f3913s);
            View childAt = viewGroup.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: n */
    public final boolean m2724n(int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int left = this.f3914t.getLeft();
        int top = this.f3914t.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.f3912r.abortAnimation();
            m2733w(0);
            return false;
        }
        View view = this.f3914t;
        int m2718g = m2718g(i4, (int) this.f3908n, (int) this.f3907m);
        int m2718g2 = m2718g(i5, (int) this.f3908n, (int) this.f3907m);
        int abs = Math.abs(i6);
        int abs2 = Math.abs(i7);
        int abs3 = Math.abs(m2718g);
        int abs4 = Math.abs(m2718g2);
        int i8 = abs3 + abs4;
        int i9 = abs + abs2;
        if (m2718g != 0) {
            f2 = abs3;
            f3 = i8;
        } else {
            f2 = abs;
            f3 = i9;
        }
        float f6 = f2 / f3;
        if (m2718g2 != 0) {
            f4 = abs4;
            f5 = i8;
        } else {
            f4 = abs2;
            f5 = i9;
        }
        int m2720i = m2720i(i6, m2718g, this.f3913s.mo2739c(view));
        this.f3912r.startScroll(left, top, i6, i7, (int) ((m2720i(i7, m2718g2, this.f3913s.mo2740d(view)) * (f4 / f5)) + (m2720i * f6)));
        m2733w(2);
        return true;
    }

    /* renamed from: o */
    public boolean m2725o(int i2) {
        return ((1 << i2) & this.f3905k) != 0;
    }

    /* renamed from: p */
    public final boolean m2726p(int i2) {
        if (m2725o(i2)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: q */
    public boolean m2727q(@Nullable View view, int i2, int i3) {
        return view != null && i2 >= view.getLeft() && i2 < view.getRight() && i3 >= view.getTop() && i3 < view.getBottom();
    }

    /* renamed from: r */
    public void m2728r(@NonNull MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m2713b();
        }
        if (this.f3906l == null) {
            this.f3906l = VelocityTracker.obtain();
        }
        this.f3906l.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View m2723m = m2723m((int) x, (int) y);
            m2731u(x, y, pointerId);
            m2711A(m2723m, pointerId);
            int i4 = this.f3902h[pointerId];
            int i5 = this.f3911q;
            if ((i4 & i5) != 0) {
                this.f3913s.mo2742f(i4 & i5, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f3895a == 1) {
                m2729s();
            }
            m2713b();
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f3895a == 1) {
                    m2722l(0.0f, 0.0f);
                }
                m2713b();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m2731u(x2, y2, pointerId2);
                if (this.f3895a != 0) {
                    if (m2727q(this.f3914t, (int) x2, (int) y2)) {
                        m2711A(this.f3914t, pointerId2);
                        return;
                    }
                    return;
                }
                m2711A(m2723m((int) x2, (int) y2), pointerId2);
                int i6 = this.f3902h[pointerId2];
                int i7 = this.f3911q;
                if ((i6 & i7) != 0) {
                    this.f3913s.mo2742f(i6 & i7, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f3895a == 1 && pointerId3 == this.f3897c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i3 >= pointerCount) {
                        i2 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i3);
                    if (pointerId4 != this.f3897c) {
                        View m2723m2 = m2723m((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                        View view = this.f3914t;
                        if (m2723m2 == view && m2711A(view, pointerId4)) {
                            i2 = this.f3897c;
                            break;
                        }
                    }
                    i3++;
                }
                if (i2 == -1) {
                    m2729s();
                }
            }
            m2719h(pointerId3);
            return;
        }
        if (this.f3895a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i3 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i3);
                if (m2726p(pointerId5)) {
                    float x3 = motionEvent.getX(i3);
                    float y3 = motionEvent.getY(i3);
                    float f2 = x3 - this.f3898d[pointerId5];
                    float f3 = y3 - this.f3899e[pointerId5];
                    m2730t(f2, f3, pointerId5);
                    if (this.f3895a != 1) {
                        View m2723m3 = m2723m((int) x3, (int) y3);
                        if (m2716e(m2723m3, f2, f3) && m2711A(m2723m3, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i3++;
            }
            m2732v(motionEvent);
            return;
        }
        if (m2726p(this.f3897c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f3897c);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f3900f;
            int i8 = this.f3897c;
            int i9 = (int) (x4 - fArr[i8]);
            int i10 = (int) (y4 - this.f3901g[i8]);
            int left = this.f3914t.getLeft() + i9;
            int top = this.f3914t.getTop() + i10;
            int left2 = this.f3914t.getLeft();
            int top2 = this.f3914t.getTop();
            if (i9 != 0) {
                left = this.f3913s.mo2737a(this.f3914t, left, i9);
                ViewCompat.m2178R(this.f3914t, left - left2);
            }
            int i11 = left;
            if (i10 != 0) {
                top = this.f3913s.mo2738b(this.f3914t, top, i10);
                ViewCompat.m2179S(this.f3914t, top - top2);
            }
            int i12 = top;
            if (i9 != 0 || i10 != 0) {
                this.f3913s.mo2745i(this.f3914t, i11, i12, i11 - left2, i12 - top2);
            }
            m2732v(motionEvent);
        }
    }

    /* renamed from: s */
    public final void m2729s() {
        this.f3906l.computeCurrentVelocity(1000, this.f3907m);
        m2722l(m2717f(this.f3906l.getXVelocity(this.f3897c), this.f3908n, this.f3907m), m2717f(this.f3906l.getYVelocity(this.f3897c), this.f3908n, this.f3907m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.ViewDragHelper$Callback] */
    /* renamed from: t */
    public final void m2730t(float f2, float f3, int i2) {
        boolean m2715d = m2715d(f2, f3, i2, 1);
        boolean z = m2715d;
        if (m2715d(f3, f2, i2, 4)) {
            z = (m2715d ? 1 : 0) | 4;
        }
        boolean z2 = z;
        if (m2715d(f2, f3, i2, 2)) {
            z2 = (z ? 1 : 0) | 2;
        }
        ?? r0 = z2;
        if (m2715d(f3, f2, i2, 8)) {
            r0 = (z2 ? 1 : 0) | 8;
        }
        if (r0 != 0) {
            int[] iArr = this.f3903i;
            iArr[i2] = iArr[i2] | r0;
            this.f3913s.mo2741e(r0, i2);
        }
    }

    /* renamed from: u */
    public final void m2731u(float f2, float f3, int i2) {
        float[] fArr = this.f3898d;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f3899e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f3900f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f3901g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f3902h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f3903i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3904j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f3898d = fArr2;
            this.f3899e = fArr3;
            this.f3900f = fArr4;
            this.f3901g = fArr5;
            this.f3902h = iArr;
            this.f3903i = iArr2;
            this.f3904j = iArr3;
        }
        float[] fArr9 = this.f3898d;
        this.f3900f[i2] = f2;
        fArr9[i2] = f2;
        float[] fArr10 = this.f3899e;
        this.f3901g[i2] = f3;
        fArr10[i2] = f3;
        int[] iArr7 = this.f3902h;
        int i4 = (int) f2;
        int i5 = (int) f3;
        int i6 = i4 < this.f3916v.getLeft() + this.f3909o ? 1 : 0;
        if (i5 < this.f3916v.getTop() + this.f3909o) {
            i6 |= 4;
        }
        if (i4 > this.f3916v.getRight() - this.f3909o) {
            i6 |= 2;
        }
        if (i5 > this.f3916v.getBottom() - this.f3909o) {
            i6 |= 8;
        }
        iArr7[i2] = i6;
        this.f3905k |= 1 << i2;
    }

    /* renamed from: v */
    public final void m2732v(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (m2726p(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f3900f[pointerId] = x;
                this.f3901g[pointerId] = y;
            }
        }
    }

    /* renamed from: w */
    public void m2733w(int i2) {
        this.f3916v.removeCallbacks(this.f3917w);
        if (this.f3895a != i2) {
            this.f3895a = i2;
            this.f3913s.mo2744h(i2);
            if (this.f3895a == 0) {
                this.f3914t = null;
            }
        }
    }

    /* renamed from: x */
    public boolean m2734x(int i2, int i3) {
        if (this.f3915u) {
            return m2724n(i2, i3, (int) this.f3906l.getXVelocity(this.f3897c), (int) this.f3906l.getYVelocity(this.f3897c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00de, code lost:
    
        if (r12 != r11) goto L54;
     */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m2735y(@androidx.annotation.NonNull android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.ViewDragHelper.m2735y(android.view.MotionEvent):boolean");
    }

    /* renamed from: z */
    public boolean m2736z(@NonNull View view, int i2, int i3) {
        this.f3914t = view;
        this.f3897c = -1;
        boolean m2724n = m2724n(i2, i3, 0, 0);
        if (!m2724n && this.f3895a == 0 && this.f3914t != null) {
            this.f3914t = null;
        }
        return m2724n;
    }
}
