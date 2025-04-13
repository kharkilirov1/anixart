package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.MotionEffect;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayoutStates;
import androidx.core.view.NestedScrollingParent3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.C0000a;

/* loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements NestedScrollingParent3 {

    /* renamed from: m0 */
    public static final /* synthetic */ int f2567m0 = 0;

    /* renamed from: A */
    public int f2568A;

    /* renamed from: B */
    public boolean f2569B;

    /* renamed from: C */
    public float f2570C;

    /* renamed from: D */
    public float f2571D;

    /* renamed from: E */
    public float f2572E;

    /* renamed from: F */
    public long f2573F;

    /* renamed from: G */
    public float f2574G;

    /* renamed from: H */
    public boolean f2575H;

    /* renamed from: I */
    public boolean f2576I;

    /* renamed from: J */
    public TransitionListener f2577J;

    /* renamed from: K */
    public int f2578K;

    /* renamed from: L */
    public DevModeDraw f2579L;

    /* renamed from: M */
    public DesignTool f2580M;

    /* renamed from: N */
    public int f2581N;

    /* renamed from: O */
    public int f2582O;

    /* renamed from: P */
    public boolean f2583P;

    /* renamed from: Q */
    public long f2584Q;

    /* renamed from: R */
    public float f2585R;

    /* renamed from: S */
    public boolean f2586S;

    /* renamed from: T */
    public ArrayList<MotionHelper> f2587T;

    /* renamed from: U */
    public ArrayList<MotionHelper> f2588U;

    /* renamed from: V */
    public ArrayList<MotionHelper> f2589V;

    /* renamed from: W */
    public CopyOnWriteArrayList<TransitionListener> f2590W;

    /* renamed from: a0 */
    public int f2591a0;

    /* renamed from: b0 */
    public long f2592b0;

    /* renamed from: c0 */
    public float f2593c0;

    /* renamed from: d0 */
    public int f2594d0;

    /* renamed from: e0 */
    public float f2595e0;

    /* renamed from: f0 */
    public float f2596f0;

    /* renamed from: g0 */
    public boolean f2597g0;

    /* renamed from: h0 */
    public StateCache f2598h0;

    /* renamed from: i0 */
    public Runnable f2599i0;

    /* renamed from: j0 */
    public boolean f2600j0;

    /* renamed from: k0 */
    public TransitionState f2601k0;

    /* renamed from: l0 */
    public boolean f2602l0;

    /* renamed from: t */
    public MotionScene f2603t;

    /* renamed from: u */
    public Interpolator f2604u;

    /* renamed from: v */
    public float f2605v;

    /* renamed from: w */
    public int f2606w;

    /* renamed from: x */
    public int f2607x;

    /* renamed from: y */
    public int f2608y;

    /* renamed from: z */
    public int f2609z;

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$1 */
    class RunnableC01971 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$2 */
    class RunnableC01982 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$3 */
    public class RunnableC01993 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ View f2610b;

        @Override // java.lang.Runnable
        public void run() {
            this.f2610b.setNestedScrollingEnabled(true);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$5 */
    public static /* synthetic */ class C02015 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2612a;

        static {
            int[] iArr = new int[TransitionState.values().length];
            f2612a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2612a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2612a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2612a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class DecelerateInterpolator extends MotionInterpolator {

        /* renamed from: a */
        public float f2613a;

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            if (this.f2613a > 0.0f) {
                throw null;
            }
            throw null;
        }
    }

    public class DevModeDraw {

        /* renamed from: a */
        public int[] f2614a;

        /* renamed from: b */
        public float[] f2615b;

        /* renamed from: c */
        public Paint f2616c;

        /* renamed from: d */
        public Paint f2617d;

        /* renamed from: e */
        public Paint f2618e;

        /* renamed from: f */
        public Paint f2619f;

        /* renamed from: g */
        public Paint f2620g;

        /* renamed from: h */
        public float[] f2621h;

        /* renamed from: i */
        public Rect f2622i = new Rect();

        /* renamed from: j */
        public int f2623j = 1;

        public DevModeDraw() {
            Paint paint = new Paint();
            this.f2616c = paint;
            paint.setAntiAlias(true);
            this.f2616c.setColor(-21965);
            this.f2616c.setStrokeWidth(2.0f);
            this.f2616c.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f2617d = paint2;
            paint2.setAntiAlias(true);
            this.f2617d.setColor(-2067046);
            this.f2617d.setStrokeWidth(2.0f);
            this.f2617d.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f2618e = paint3;
            paint3.setAntiAlias(true);
            this.f2618e.setColor(-13391360);
            this.f2618e.setStrokeWidth(2.0f);
            this.f2618e.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f2619f = paint4;
            paint4.setAntiAlias(true);
            this.f2619f.setColor(-13391360);
            this.f2619f.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f2621h = new float[8];
            Paint paint5 = new Paint();
            this.f2620g = paint5;
            paint5.setAntiAlias(true);
            this.f2618e.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
            this.f2615b = new float[100];
            this.f2614a = new int[50];
        }
    }

    public class Model {
    }

    public interface MotionTracker {
    }

    public static class MyTracker implements MotionTracker {

        /* renamed from: a */
        public static MyTracker f2625a = new MyTracker();
    }

    public class StateCache {

        /* renamed from: a */
        public float f2626a = Float.NaN;

        /* renamed from: b */
        public float f2627b = Float.NaN;

        /* renamed from: c */
        public int f2628c = -1;

        /* renamed from: d */
        public int f2629d = -1;

        public StateCache() {
        }

        /* renamed from: a */
        public void m1405a() {
            int i2 = this.f2628c;
            if (i2 != -1 || this.f2629d != -1) {
                if (i2 == -1) {
                    MotionLayout.this.m1395B(this.f2629d);
                } else {
                    int i3 = this.f2629d;
                    if (i3 == -1) {
                        MotionLayout.this.m1403y(i2, -1, -1);
                    } else {
                        MotionLayout.this.m1404z(i2, i3);
                    }
                }
                MotionLayout.this.setState(TransitionState.SETUP);
            }
            if (Float.isNaN(this.f2627b)) {
                if (Float.isNaN(this.f2626a)) {
                    return;
                }
                MotionLayout.this.setProgress(this.f2626a);
                return;
            }
            MotionLayout motionLayout = MotionLayout.this;
            float f2 = this.f2626a;
            float f3 = this.f2627b;
            if (motionLayout.isAttachedToWindow()) {
                motionLayout.setProgress(f2);
                motionLayout.setState(TransitionState.MOVING);
                motionLayout.f2605v = f3;
                if (f3 != 0.0f) {
                    motionLayout.m1398t(f3 <= 0.0f ? 0.0f : 1.0f);
                } else if (f2 != 0.0f && f2 != 1.0f) {
                    motionLayout.m1398t(f2 <= 0.5f ? 0.0f : 1.0f);
                }
            } else {
                if (motionLayout.f2598h0 == null) {
                    motionLayout.f2598h0 = motionLayout.new StateCache();
                }
                StateCache stateCache = motionLayout.f2598h0;
                stateCache.f2626a = f2;
                stateCache.f2627b = f3;
            }
            this.f2626a = Float.NaN;
            this.f2627b = Float.NaN;
            this.f2628c = -1;
            this.f2629d = -1;
        }
    }

    public interface TransitionListener {
        /* renamed from: a */
        void mo1373a(MotionLayout motionLayout, int i2, int i3, float f2);

        /* renamed from: b */
        void mo1393b(MotionLayout motionLayout, int i2, int i3);
    }

    public enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    /* renamed from: A */
    public void m1394A() {
        m1398t(1.0f);
        this.f2599i0 = null;
    }

    /* renamed from: B */
    public void m1395B(int i2) {
        if (isAttachedToWindow()) {
            m1396C(i2, -1, -1, -1);
            return;
        }
        if (this.f2598h0 == null) {
            this.f2598h0 = new StateCache();
        }
        this.f2598h0.f2629d = i2;
    }

    /* renamed from: C */
    public void m1396C(int i2, int i3, int i4, int i5) {
        int i6 = this.f2607x;
        if (i6 == i2) {
            return;
        }
        if (this.f2606w == i2) {
            m1398t(0.0f);
            if (i5 > 0) {
                this.f2570C = i5 / 1000.0f;
                return;
            }
            return;
        }
        if (this.f2608y == i2) {
            m1398t(1.0f);
            if (i5 > 0) {
                this.f2570C = i5 / 1000.0f;
                return;
            }
            return;
        }
        this.f2608y = i2;
        if (i6 != -1) {
            m1404z(i6, i2);
            m1398t(1.0f);
            this.f2572E = 0.0f;
            m1394A();
            if (i5 > 0) {
                this.f2570C = i5 / 1000.0f;
                return;
            }
            return;
        }
        this.f2574G = 1.0f;
        this.f2571D = 0.0f;
        this.f2572E = 0.0f;
        this.f2573F = getNanoTime();
        getNanoTime();
        this.f2575H = false;
        if (i5 == -1) {
            this.f2570C = this.f2603t.m1406a() / 1000.0f;
        }
        this.f2606w = -1;
        this.f2603t.m1409d(-1, this.f2608y);
        new SparseArray();
        if (i5 == 0) {
            this.f2570C = this.f2603t.m1406a() / 1000.0f;
        } else if (i5 > 0) {
            this.f2570C = i5 / 1000.0f;
        }
        getChildCount();
        throw null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        ArrayList<MotionHelper> arrayList = this.f2589V;
        if (arrayList != null) {
            Iterator<MotionHelper> it = arrayList.iterator();
            while (it.hasNext()) {
                Objects.requireNonNull(it.next());
            }
        }
        m1399u(false);
        MotionScene motionScene = this.f2603t;
        if (motionScene != null) {
            Objects.requireNonNull(motionScene);
        }
        super.dispatchDraw(canvas);
        if (this.f2603t == null) {
            return;
        }
        if ((this.f2578K & 1) == 1 && !isInEditMode()) {
            this.f2591a0++;
            long nanoTime = getNanoTime();
            long j2 = this.f2592b0;
            if (j2 != -1) {
                if (nanoTime - j2 > 200000000) {
                    this.f2593c0 = ((int) ((this.f2591a0 / (r5 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f2591a0 = 0;
                    this.f2592b0 = nanoTime;
                }
            } else {
                this.f2592b0 = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            StringBuilder m24u = C0000a.m24u(this.f2593c0 + " fps " + Debug.m1390d(this, this.f2606w) + " -> ");
            m24u.append(Debug.m1390d(this, this.f2608y));
            m24u.append(" (progress: ");
            m24u.append(((int) (getProgress() * 1000.0f)) / 10.0f);
            m24u.append(" ) state=");
            int i2 = this.f2607x;
            m24u.append(i2 == -1 ? "undefined" : Debug.m1390d(this, i2));
            String sb = m24u.toString();
            paint.setColor(-16777216);
            canvas.drawText(sb, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(sb, 10.0f, getHeight() - 30, paint);
        }
        if (this.f2578K > 1) {
            if (this.f2579L == null) {
                this.f2579L = new DevModeDraw();
            }
            DevModeDraw devModeDraw = this.f2579L;
            this.f2603t.m1406a();
            Objects.requireNonNull(devModeDraw);
        }
        ArrayList<MotionHelper> arrayList2 = this.f2589V;
        if (arrayList2 != null) {
            Iterator<MotionHelper> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Objects.requireNonNull(it2.next());
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    /* renamed from: g */
    public void mo675g(@NonNull View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (this.f2583P || i2 != 0 || i3 != 0) {
            iArr[0] = iArr[0] + i4;
            iArr[1] = iArr[1] + i5;
        }
        this.f2583P = false;
    }

    public int[] getConstraintSetIds() {
        MotionScene motionScene = this.f2603t;
        if (motionScene == null) {
            return null;
        }
        Objects.requireNonNull(motionScene);
        throw null;
    }

    public int getCurrentState() {
        return this.f2607x;
    }

    public ArrayList<MotionScene.Transition> getDefinedTransitions() {
        MotionScene motionScene = this.f2603t;
        if (motionScene == null) {
            return null;
        }
        Objects.requireNonNull(motionScene);
        return null;
    }

    public DesignTool getDesignTool() {
        if (this.f2580M == null) {
            this.f2580M = new DesignTool(this);
        }
        return this.f2580M;
    }

    public int getEndState() {
        return this.f2608y;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f2572E;
    }

    public MotionScene getScene() {
        return this.f2603t;
    }

    public int getStartState() {
        return this.f2606w;
    }

    public float getTargetPosition() {
        return this.f2574G;
    }

    public Bundle getTransitionState() {
        if (this.f2598h0 == null) {
            this.f2598h0 = new StateCache();
        }
        StateCache stateCache = this.f2598h0;
        MotionLayout motionLayout = MotionLayout.this;
        stateCache.f2629d = motionLayout.f2608y;
        stateCache.f2628c = motionLayout.f2606w;
        stateCache.f2627b = motionLayout.getVelocity();
        stateCache.f2626a = MotionLayout.this.getProgress();
        StateCache stateCache2 = this.f2598h0;
        Objects.requireNonNull(stateCache2);
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", stateCache2.f2626a);
        bundle.putFloat("motion.velocity", stateCache2.f2627b);
        bundle.putInt("motion.StartState", stateCache2.f2628c);
        bundle.putInt("motion.EndState", stateCache2.f2629d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        if (this.f2603t != null) {
            this.f2570C = r0.m1406a() / 1000.0f;
        }
        return (long) (this.f2570C * 1000.0f);
    }

    public float getVelocity() {
        return this.f2605v;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    /* renamed from: j */
    public void mo1397j(int i2) {
        this.f2775l = null;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    /* renamed from: l */
    public void mo680l(@NonNull View view, int i2, int i3, int i4, int i5, int i6) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    /* renamed from: m */
    public boolean mo681m(@NonNull View view, @NonNull View view2, int i2, int i3) {
        MotionScene.Transition transition;
        MotionScene motionScene = this.f2603t;
        if (motionScene == null || (transition = motionScene.f2650a) == null) {
            return false;
        }
        Objects.requireNonNull(transition);
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    /* renamed from: n */
    public void mo682n(@NonNull View view, @NonNull View view2, int i2, int i3) {
        this.f2584Q = getNanoTime();
        this.f2585R = 0.0f;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    /* renamed from: o */
    public void mo683o(@NonNull View view, int i2) {
        MotionScene motionScene = this.f2603t;
        if (motionScene == null || this.f2585R == 0.0f) {
            return;
        }
        MotionScene.Transition transition = motionScene.f2650a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        MotionScene.Transition transition;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        MotionScene motionScene = this.f2603t;
        if (motionScene != null && this.f2607x != -1) {
            Objects.requireNonNull(motionScene);
            throw null;
        }
        m1402x();
        StateCache stateCache = this.f2598h0;
        if (stateCache != null) {
            if (this.f2600j0) {
                post(new Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.4
                    @Override // java.lang.Runnable
                    public void run() {
                        MotionLayout.this.f2598h0.m1405a();
                    }
                });
                return;
            } else {
                stateCache.m1405a();
                return;
            }
        }
        MotionScene motionScene2 = this.f2603t;
        if (motionScene2 == null || (transition = motionScene2.f2650a) == null) {
            return;
        }
        Objects.requireNonNull(transition);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionScene motionScene = this.f2603t;
        if (motionScene != null && this.f2569B) {
            Objects.requireNonNull(motionScene);
            MotionScene.Transition transition = this.f2603t.f2650a;
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.f2597g0 = true;
        try {
            if (this.f2603t == null) {
                super.onLayout(z, i2, i3, i4, i5);
                return;
            }
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            if (this.f2581N != i6 || this.f2582O != i7) {
                throw null;
            }
            this.f2581N = i6;
            this.f2582O = i7;
        } finally {
            this.f2597g0 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        if (this.f2603t == null) {
            super.onMeasure(i2, i3);
            return;
        }
        boolean z = (this.f2609z == i2 && this.f2568A == i3) ? false : true;
        if (this.f2602l0) {
            this.f2602l0 = false;
            m1402x();
            if (this.f2577J != null) {
                throw null;
            }
            CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList = this.f2590W;
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                throw null;
            }
            z = true;
        }
        boolean z2 = this.f2772i ? true : z;
        this.f2609z = i2;
        this.f2568A = i3;
        MotionScene motionScene = this.f2603t;
        MotionScene.Transition transition = motionScene.f2650a;
        motionScene.m1407b();
        if (!z2) {
            throw null;
        }
        if (this.f2606w != -1) {
            super.onMeasure(i2, i3);
            Objects.requireNonNull(this.f2603t);
            throw null;
        }
        if (z2) {
            super.onMeasure(i2, i3);
        }
        getPaddingTop();
        getPaddingBottom();
        getPaddingLeft();
        getPaddingRight();
        Objects.requireNonNull(this.f2767d);
        Objects.requireNonNull(this.f2767d);
        float f2 = 0;
        int i4 = (int) ((this.f2596f0 * f2) + f2);
        requestLayout();
        int i5 = (int) ((this.f2596f0 * f2) + f2);
        requestLayout();
        setMeasuredDimension(i4, i5);
        float signum = Math.signum(this.f2574G - this.f2572E);
        float nanoTime = this.f2572E + ((((getNanoTime() - this.f2573F) * signum) * 1.0E-9f) / this.f2570C);
        if (this.f2575H) {
            nanoTime = this.f2574G;
        }
        if ((signum > 0.0f && nanoTime >= this.f2574G) || (signum <= 0.0f && nanoTime <= this.f2574G)) {
            nanoTime = this.f2574G;
        }
        if ((signum > 0.0f && nanoTime >= this.f2574G) || (signum <= 0.0f && nanoTime <= this.f2574G)) {
            nanoTime = this.f2574G;
        }
        this.f2596f0 = nanoTime;
        int childCount = getChildCount();
        getNanoTime();
        Interpolator interpolator = this.f2604u;
        if (interpolator != null) {
            interpolator.getInterpolation(nanoTime);
        }
        if (childCount <= 0) {
            return;
        }
        getChildAt(0);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(@NonNull View view, float f2, float f3, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(@NonNull View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        MotionScene motionScene = this.f2603t;
        if (motionScene != null) {
            motionScene.f2652c = m1436i();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f2603t == null || !this.f2569B) {
            return super.onTouchEvent(motionEvent);
        }
        throw null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f2590W == null) {
                this.f2590W = new CopyOnWriteArrayList<>();
            }
            this.f2590W.add(motionHelper);
            if (motionHelper.f2563j) {
                if (this.f2587T == null) {
                    this.f2587T = new ArrayList<>();
                }
                this.f2587T.add(motionHelper);
            }
            if (motionHelper.f2564k) {
                if (this.f2588U == null) {
                    this.f2588U = new ArrayList<>();
                }
                this.f2588U.add(motionHelper);
            }
            if (motionHelper instanceof MotionEffect) {
                if (this.f2589V == null) {
                    this.f2589V = new ArrayList<>();
                }
                this.f2589V.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.f2587T;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.f2588U;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    /* renamed from: p */
    public void mo684p(@NonNull View view, int i2, int i3, @NonNull int[] iArr, int i4) {
        MotionScene.Transition transition;
        MotionScene motionScene = this.f2603t;
        if (motionScene == null || (transition = motionScene.f2650a) == null || !(!transition.f2659f)) {
            return;
        }
        float f2 = this.f2571D;
        long nanoTime = getNanoTime();
        this.f2585R = (float) ((nanoTime - this.f2584Q) * 1.0E-9d);
        this.f2584Q = nanoTime;
        if (f2 != this.f2571D) {
            iArr[0] = i2;
            iArr[1] = i3;
        }
        m1399u(false);
        if (iArr[0] == 0 && iArr[1] == 0) {
            return;
        }
        this.f2583P = true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        MotionScene motionScene;
        MotionScene.Transition transition;
        if (this.f2607x == -1 && (motionScene = this.f2603t) != null && (transition = motionScene.f2650a) != null) {
            int i2 = transition.f2660g;
            if (i2 == 0) {
                return;
            }
            if (i2 == 2) {
                if (getChildCount() <= 0) {
                    return;
                }
                getChildAt(0);
                throw null;
            }
        }
        super.requestLayout();
    }

    public void setDebugMode(int i2) {
        this.f2578K = i2;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.f2600j0 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.f2569B = z;
    }

    public void setInterpolatedProgress(float f2) {
        if (this.f2603t != null) {
            setState(TransitionState.MOVING);
            Interpolator m1408c = this.f2603t.m1408c();
            if (m1408c != null) {
                setProgress(m1408c.getInterpolation(f2));
                return;
            }
        }
        setProgress(f2);
    }

    public void setOnHide(float f2) {
        ArrayList<MotionHelper> arrayList = this.f2588U;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f2588U.get(i2).setProgress(f2);
            }
        }
    }

    public void setOnShow(float f2) {
        ArrayList<MotionHelper> arrayList = this.f2587T;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f2587T.get(i2).setProgress(f2);
            }
        }
    }

    public void setProgress(float f2) {
        TransitionState transitionState = TransitionState.FINISHED;
        TransitionState transitionState2 = TransitionState.MOVING;
        if (f2 < 0.0f || f2 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f2598h0 == null) {
                this.f2598h0 = new StateCache();
            }
            this.f2598h0.f2626a = f2;
            return;
        }
        if (f2 <= 0.0f) {
            if (this.f2572E == 1.0f && this.f2607x == this.f2608y) {
                setState(transitionState2);
            }
            this.f2607x = this.f2606w;
            if (this.f2572E == 0.0f) {
                setState(transitionState);
            }
        } else if (f2 >= 1.0f) {
            if (this.f2572E == 0.0f && this.f2607x == this.f2606w) {
                setState(transitionState2);
            }
            this.f2607x = this.f2608y;
            if (this.f2572E == 1.0f) {
                setState(transitionState);
            }
        } else {
            this.f2607x = -1;
            setState(transitionState2);
        }
        if (this.f2603t == null) {
            return;
        }
        this.f2575H = true;
        this.f2574G = f2;
        this.f2571D = f2;
        this.f2573F = -1L;
        this.f2576I = true;
        invalidate();
    }

    public void setScene(MotionScene motionScene) {
        this.f2603t = motionScene;
        motionScene.f2652c = m1436i();
        throw null;
    }

    public void setStartState(int i2) {
        if (isAttachedToWindow()) {
            this.f2607x = i2;
            return;
        }
        if (this.f2598h0 == null) {
            this.f2598h0 = new StateCache();
        }
        StateCache stateCache = this.f2598h0;
        stateCache.f2628c = i2;
        stateCache.f2629d = i2;
    }

    public void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.FINISHED;
        if (transitionState == transitionState2 && this.f2607x == -1) {
            return;
        }
        TransitionState transitionState3 = this.f2601k0;
        this.f2601k0 = transitionState;
        TransitionState transitionState4 = TransitionState.MOVING;
        if (transitionState3 == transitionState4 && transitionState == transitionState4) {
            m1400v();
        }
        int ordinal = transitionState3.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 && transitionState == transitionState2) {
                m1401w();
                return;
            }
            return;
        }
        if (transitionState == transitionState4) {
            m1400v();
        }
        if (transitionState == transitionState2) {
            m1401w();
        }
    }

    public void setTransition(int i2) {
        MotionScene motionScene = this.f2603t;
        if (motionScene == null) {
            return;
        }
        Objects.requireNonNull(motionScene);
        throw null;
    }

    public void setTransitionDuration(int i2) {
        MotionScene motionScene = this.f2603t;
        if (motionScene == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        MotionScene.Transition transition = motionScene.f2650a;
        if (transition != null) {
            transition.f2658e = Math.max(i2, 8);
        } else {
            motionScene.f2651b = i2;
        }
    }

    public void setTransitionListener(TransitionListener transitionListener) {
        this.f2577J = transitionListener;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f2598h0 == null) {
            this.f2598h0 = new StateCache();
        }
        StateCache stateCache = this.f2598h0;
        Objects.requireNonNull(stateCache);
        stateCache.f2626a = bundle.getFloat("motion.progress");
        stateCache.f2627b = bundle.getFloat("motion.velocity");
        stateCache.f2628c = bundle.getInt("motion.StartState");
        stateCache.f2629d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.f2598h0.m1405a();
        }
    }

    /* renamed from: t */
    public void m1398t(float f2) {
        if (this.f2603t == null) {
            return;
        }
        float f3 = this.f2572E;
        float f4 = this.f2571D;
        if (f3 != f4 && this.f2575H) {
            this.f2572E = f4;
        }
        float f5 = this.f2572E;
        if (f5 == f2) {
            return;
        }
        this.f2574G = f2;
        this.f2570C = r0.m1406a() / 1000.0f;
        setProgress(this.f2574G);
        this.f2604u = this.f2603t.m1408c();
        this.f2575H = false;
        getNanoTime();
        this.f2576I = true;
        this.f2571D = f5;
        this.f2572E = f5;
        invalidate();
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return Debug.m1388b(context, this.f2606w) + "->" + Debug.m1388b(context, this.f2608y) + " (pos:" + this.f2572E + " Dpos/Dt:" + this.f2605v;
    }

    /* renamed from: u */
    public void m1399u(boolean z) {
        int i2;
        boolean z2;
        TransitionState transitionState = TransitionState.FINISHED;
        if (this.f2573F == -1) {
            this.f2573F = getNanoTime();
        }
        float f2 = this.f2572E;
        if (f2 > 0.0f && f2 < 1.0f) {
            this.f2607x = -1;
        }
        boolean z3 = false;
        if (this.f2586S || (this.f2576I && (z || this.f2574G != f2))) {
            float signum = Math.signum(this.f2574G - f2);
            long nanoTime = getNanoTime();
            float f3 = (((nanoTime - this.f2573F) * signum) * 1.0E-9f) / this.f2570C;
            float f4 = this.f2572E + f3;
            if (this.f2575H) {
                f4 = this.f2574G;
            }
            if ((signum > 0.0f && f4 >= this.f2574G) || (signum <= 0.0f && f4 <= this.f2574G)) {
                f4 = this.f2574G;
                this.f2576I = false;
            }
            this.f2572E = f4;
            this.f2571D = f4;
            this.f2573F = nanoTime;
            this.f2605v = f3;
            if (Math.abs(f3) > 1.0E-5f) {
                setState(TransitionState.MOVING);
            }
            if ((signum > 0.0f && f4 >= this.f2574G) || (signum <= 0.0f && f4 <= this.f2574G)) {
                f4 = this.f2574G;
                this.f2576I = false;
            }
            if (f4 >= 1.0f || f4 <= 0.0f) {
                this.f2576I = false;
                setState(transitionState);
            }
            int childCount = getChildCount();
            this.f2586S = false;
            getNanoTime();
            this.f2596f0 = f4;
            Interpolator interpolator = this.f2604u;
            if (interpolator != null) {
                interpolator.getInterpolation(f4);
            }
            Interpolator interpolator2 = this.f2604u;
            if (interpolator2 != null) {
                float interpolation = interpolator2.getInterpolation((signum / this.f2570C) + f4);
                this.f2605v = interpolation;
                this.f2605v = interpolation - this.f2604u.getInterpolation(f4);
            }
            if (childCount > 0) {
                getChildAt(0);
                throw null;
            }
            boolean z4 = (signum > 0.0f && f4 >= this.f2574G) || (signum <= 0.0f && f4 <= this.f2574G);
            if (!this.f2586S && !this.f2576I && z4) {
                setState(transitionState);
            }
            boolean z5 = (!z4) | this.f2586S;
            this.f2586S = z5;
            if (f4 <= 0.0f && (i2 = this.f2606w) != -1 && this.f2607x != i2) {
                this.f2607x = i2;
                Objects.requireNonNull(this.f2603t);
                throw null;
            }
            if (f4 >= 1.0d) {
                int i3 = this.f2607x;
                int i4 = this.f2608y;
                if (i3 != i4) {
                    this.f2607x = i4;
                    Objects.requireNonNull(this.f2603t);
                    throw null;
                }
            }
            if (z5 || this.f2576I) {
                invalidate();
            } else if ((signum > 0.0f && f4 == 1.0f) || (signum < 0.0f && f4 == 0.0f)) {
                setState(transitionState);
            }
            if (!this.f2586S && !this.f2576I && ((signum > 0.0f && f4 == 1.0f) || (signum < 0.0f && f4 == 0.0f))) {
                m1402x();
            }
        }
        float f5 = this.f2572E;
        if (f5 < 1.0f) {
            if (f5 <= 0.0f) {
                int i5 = this.f2607x;
                int i6 = this.f2606w;
                z2 = i5 != i6;
                this.f2607x = i6;
            }
            this.f2602l0 |= z3;
            if (z3 && !this.f2597g0) {
                requestLayout();
            }
            this.f2571D = this.f2572E;
        }
        int i7 = this.f2607x;
        int i8 = this.f2608y;
        z2 = i7 != i8;
        this.f2607x = i8;
        z3 = z2;
        this.f2602l0 |= z3;
        if (z3) {
            requestLayout();
        }
        this.f2571D = this.f2572E;
    }

    /* renamed from: v */
    public final void m1400v() {
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList;
        if ((this.f2577J == null && ((copyOnWriteArrayList = this.f2590W) == null || copyOnWriteArrayList.isEmpty())) || this.f2595e0 == this.f2571D) {
            return;
        }
        if (this.f2594d0 != -1) {
            TransitionListener transitionListener = this.f2577J;
            if (transitionListener != null) {
                transitionListener.mo1393b(this, this.f2606w, this.f2608y);
            }
            CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList2 = this.f2590W;
            if (copyOnWriteArrayList2 != null) {
                Iterator<TransitionListener> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().mo1393b(this, this.f2606w, this.f2608y);
                }
            }
        }
        this.f2594d0 = -1;
        float f2 = this.f2571D;
        this.f2595e0 = f2;
        TransitionListener transitionListener2 = this.f2577J;
        if (transitionListener2 != null) {
            transitionListener2.mo1373a(this, this.f2606w, this.f2608y, f2);
        }
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList3 = this.f2590W;
        if (copyOnWriteArrayList3 != null) {
            Iterator<TransitionListener> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().mo1373a(this, this.f2606w, this.f2608y, this.f2571D);
            }
        }
    }

    /* renamed from: w */
    public void m1401w() {
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList;
        if (!(this.f2577J == null && ((copyOnWriteArrayList = this.f2590W) == null || copyOnWriteArrayList.isEmpty())) && this.f2594d0 == -1) {
            this.f2594d0 = this.f2607x;
            throw null;
        }
        if (this.f2577J != null) {
            throw null;
        }
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList2 = this.f2590W;
        if (copyOnWriteArrayList2 != null && !copyOnWriteArrayList2.isEmpty()) {
            throw null;
        }
        Runnable runnable = this.f2599i0;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: x */
    public void m1402x() {
        if (this.f2603t != null) {
            throw null;
        }
    }

    /* renamed from: y */
    public void m1403y(int i2, int i3, int i4) {
        setState(TransitionState.SETUP);
        this.f2607x = i2;
        this.f2606w = -1;
        this.f2608y = -1;
        ConstraintLayoutStates constraintLayoutStates = this.f2775l;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.m1444b(i2, i3, i4);
            return;
        }
        MotionScene motionScene = this.f2603t;
        if (motionScene == null) {
            return;
        }
        Objects.requireNonNull(motionScene);
        throw null;
    }

    /* renamed from: z */
    public void m1404z(int i2, int i3) {
        if (!isAttachedToWindow()) {
            if (this.f2598h0 == null) {
                this.f2598h0 = new StateCache();
            }
            StateCache stateCache = this.f2598h0;
            stateCache.f2628c = i2;
            stateCache.f2629d = i3;
            return;
        }
        MotionScene motionScene = this.f2603t;
        if (motionScene == null) {
            return;
        }
        this.f2606w = i2;
        this.f2608y = i3;
        motionScene.m1409d(i2, i3);
        Objects.requireNonNull(this.f2603t);
        throw null;
    }

    public void setTransition(MotionScene.Transition transition) {
        this.f2603t.f2650a = transition;
        setState(TransitionState.SETUP);
        if (this.f2607x == this.f2603t.m1407b()) {
            this.f2572E = 1.0f;
            this.f2571D = 1.0f;
            this.f2574G = 1.0f;
        } else {
            this.f2572E = 0.0f;
            this.f2571D = 0.0f;
            this.f2574G = 0.0f;
        }
        this.f2573F = transition.m1410a(1) ? -1L : getNanoTime();
        MotionScene motionScene = this.f2603t;
        MotionScene.Transition transition2 = motionScene.f2650a;
        int i2 = transition2 == null ? -1 : transition2.f2655b;
        int m1407b = motionScene.m1407b();
        if (i2 == this.f2606w && m1407b == this.f2608y) {
            return;
        }
        this.f2606w = i2;
        this.f2608y = m1407b;
        this.f2603t.m1409d(i2, m1407b);
        Objects.requireNonNull(this.f2603t);
        throw null;
    }
}
