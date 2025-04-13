package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.KotlinVersion;

@VisibleForTesting
/* loaded from: classes.dex */
class FastScroller extends RecyclerView.ItemDecoration implements RecyclerView.OnItemTouchListener {

    /* renamed from: E */
    public static final int[] f5275E = {R.attr.state_pressed};

    /* renamed from: F */
    public static final int[] f5276F = new int[0];

    /* renamed from: A */
    public final ValueAnimator f5277A;

    /* renamed from: B */
    public int f5278B;

    /* renamed from: C */
    public final Runnable f5279C;

    /* renamed from: D */
    public final RecyclerView.OnScrollListener f5280D;

    /* renamed from: b */
    public final int f5281b;

    /* renamed from: c */
    public final int f5282c;

    /* renamed from: d */
    public final StateListDrawable f5283d;

    /* renamed from: e */
    public final Drawable f5284e;

    /* renamed from: f */
    public final int f5285f;

    /* renamed from: g */
    public final int f5286g;

    /* renamed from: h */
    public final StateListDrawable f5287h;

    /* renamed from: i */
    public final Drawable f5288i;

    /* renamed from: j */
    public final int f5289j;

    /* renamed from: k */
    public final int f5290k;

    /* renamed from: l */
    @VisibleForTesting
    public int f5291l;

    /* renamed from: m */
    @VisibleForTesting
    public int f5292m;

    /* renamed from: n */
    @VisibleForTesting
    public float f5293n;

    /* renamed from: o */
    @VisibleForTesting
    public int f5294o;

    /* renamed from: p */
    @VisibleForTesting
    public int f5295p;

    /* renamed from: q */
    @VisibleForTesting
    public float f5296q;

    /* renamed from: t */
    public RecyclerView f5299t;

    /* renamed from: r */
    public int f5297r = 0;

    /* renamed from: s */
    public int f5298s = 0;

    /* renamed from: u */
    public boolean f5300u = false;

    /* renamed from: v */
    public boolean f5301v = false;

    /* renamed from: w */
    public int f5302w = 0;

    /* renamed from: x */
    public int f5303x = 0;

    /* renamed from: y */
    public final int[] f5304y = new int[2];

    /* renamed from: z */
    public final int[] f5305z = new int[2];

    public class AnimatorListener extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f5308a = false;

        public AnimatorListener() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5308a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f5308a) {
                this.f5308a = false;
                return;
            }
            if (((Float) FastScroller.this.f5277A.getAnimatedValue()).floatValue() == 0.0f) {
                FastScroller fastScroller = FastScroller.this;
                fastScroller.f5278B = 0;
                fastScroller.m3584m(0);
            } else {
                FastScroller fastScroller2 = FastScroller.this;
                fastScroller2.f5278B = 2;
                fastScroller2.f5299t.invalidate();
            }
        }
    }

    public class AnimatorUpdater implements ValueAnimator.AnimatorUpdateListener {
        public AnimatorUpdater() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            FastScroller.this.f5283d.setAlpha(floatValue);
            FastScroller.this.f5284e.setAlpha(floatValue);
            FastScroller.this.f5299t.invalidate();
        }
    }

    public FastScroller(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5277A = ofFloat;
        this.f5278B = 0;
        this.f5279C = new Runnable() { // from class: androidx.recyclerview.widget.FastScroller.1
            @Override // java.lang.Runnable
            public void run() {
                FastScroller fastScroller = FastScroller.this;
                int i5 = fastScroller.f5278B;
                if (i5 == 1) {
                    fastScroller.f5277A.cancel();
                } else if (i5 != 2) {
                    return;
                }
                fastScroller.f5278B = 3;
                ValueAnimator valueAnimator = fastScroller.f5277A;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                fastScroller.f5277A.setDuration(500);
                fastScroller.f5277A.start();
            }
        };
        RecyclerView.OnScrollListener onScrollListener = new RecyclerView.OnScrollListener() { // from class: androidx.recyclerview.widget.FastScroller.2
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            /* renamed from: c */
            public void mo3586c(RecyclerView recyclerView2, int i5, int i6) {
                FastScroller fastScroller = FastScroller.this;
                int computeHorizontalScrollOffset = recyclerView2.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = recyclerView2.computeVerticalScrollOffset();
                int computeVerticalScrollRange = fastScroller.f5299t.computeVerticalScrollRange();
                int i7 = fastScroller.f5298s;
                fastScroller.f5300u = computeVerticalScrollRange - i7 > 0 && i7 >= fastScroller.f5281b;
                int computeHorizontalScrollRange = fastScroller.f5299t.computeHorizontalScrollRange();
                int i8 = fastScroller.f5297r;
                boolean z = computeHorizontalScrollRange - i8 > 0 && i8 >= fastScroller.f5281b;
                fastScroller.f5301v = z;
                boolean z2 = fastScroller.f5300u;
                if (!z2 && !z) {
                    if (fastScroller.f5302w != 0) {
                        fastScroller.m3584m(0);
                        return;
                    }
                    return;
                }
                if (z2) {
                    float f2 = i7;
                    fastScroller.f5292m = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
                    fastScroller.f5291l = Math.min(i7, (i7 * i7) / computeVerticalScrollRange);
                }
                if (fastScroller.f5301v) {
                    float f3 = computeHorizontalScrollOffset;
                    float f4 = i8;
                    fastScroller.f5295p = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
                    fastScroller.f5294o = Math.min(i8, (i8 * i8) / computeHorizontalScrollRange);
                }
                int i9 = fastScroller.f5302w;
                if (i9 == 0 || i9 == 1) {
                    fastScroller.m3584m(1);
                }
            }
        };
        this.f5280D = onScrollListener;
        this.f5283d = stateListDrawable;
        this.f5284e = drawable;
        this.f5287h = stateListDrawable2;
        this.f5288i = drawable2;
        this.f5285f = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f5286g = Math.max(i2, drawable.getIntrinsicWidth());
        this.f5289j = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f5290k = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f5281b = i3;
        this.f5282c = i4;
        stateListDrawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        drawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        ofFloat.addListener(new AnimatorListener());
        ofFloat.addUpdateListener(new AnimatorUpdater());
        RecyclerView recyclerView2 = this.f5299t;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.m3805l0(this);
            RecyclerView recyclerView3 = this.f5299t;
            recyclerView3.f5527r.remove(this);
            if (recyclerView3.f5529s == this) {
                recyclerView3.f5529s = null;
            }
            List<RecyclerView.OnScrollListener> list = this.f5299t.f5514k0;
            if (list != null) {
                list.remove(onScrollListener);
            }
            m3580i();
        }
        this.f5299t = recyclerView;
        recyclerView.mo3802k(this);
        this.f5299t.f5527r.add(this);
        this.f5299t.m3806m(onScrollListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    /* renamed from: a */
    public void mo3577a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        if (this.f5302w == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean m3582k = m3582k(motionEvent.getX(), motionEvent.getY());
            boolean m3581j = m3581j(motionEvent.getX(), motionEvent.getY());
            if (m3582k || m3581j) {
                if (m3581j) {
                    this.f5303x = 1;
                    this.f5296q = (int) motionEvent.getX();
                } else if (m3582k) {
                    this.f5303x = 2;
                    this.f5293n = (int) motionEvent.getY();
                }
                m3584m(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f5302w == 2) {
            this.f5293n = 0.0f;
            this.f5296q = 0.0f;
            m3584m(1);
            this.f5303x = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f5302w == 2) {
            m3585n();
            if (this.f5303x == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f5305z;
                int i2 = this.f5282c;
                iArr[0] = i2;
                iArr[1] = this.f5297r - i2;
                float max = Math.max(iArr[0], Math.min(iArr[1], x));
                if (Math.abs(this.f5295p - max) >= 2.0f) {
                    int m3583l = m3583l(this.f5296q, max, iArr, this.f5299t.computeHorizontalScrollRange(), this.f5299t.computeHorizontalScrollOffset(), this.f5297r);
                    if (m3583l != 0) {
                        this.f5299t.scrollBy(m3583l, 0);
                    }
                    this.f5296q = max;
                }
            }
            if (this.f5303x == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f5304y;
                int i3 = this.f5282c;
                iArr2[0] = i3;
                iArr2[1] = this.f5298s - i3;
                float max2 = Math.max(iArr2[0], Math.min(iArr2[1], y));
                if (Math.abs(this.f5292m - max2) < 2.0f) {
                    return;
                }
                int m3583l2 = m3583l(this.f5293n, max2, iArr2, this.f5299t.computeVerticalScrollRange(), this.f5299t.computeVerticalScrollOffset(), this.f5298s);
                if (m3583l2 != 0) {
                    this.f5299t.scrollBy(0, m3583l2);
                }
                this.f5293n = max2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    /* renamed from: c */
    public boolean mo3578c(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        int i2 = this.f5302w;
        if (i2 == 1) {
            boolean m3582k = m3582k(motionEvent.getX(), motionEvent.getY());
            boolean m3581j = m3581j(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (m3582k || m3581j)) {
                if (m3581j) {
                    this.f5303x = 1;
                    this.f5296q = (int) motionEvent.getX();
                } else if (m3582k) {
                    this.f5303x = 2;
                    this.f5293n = (int) motionEvent.getY();
                }
                m3584m(2);
                return true;
            }
        } else if (i2 == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    /* renamed from: e */
    public void mo3579e(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /* renamed from: h */
    public void mo3405h(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.f5297r != this.f5299t.getWidth() || this.f5298s != this.f5299t.getHeight()) {
            this.f5297r = this.f5299t.getWidth();
            this.f5298s = this.f5299t.getHeight();
            m3584m(0);
            return;
        }
        if (this.f5278B != 0) {
            if (this.f5300u) {
                int i2 = this.f5297r;
                int i3 = this.f5285f;
                int i4 = i2 - i3;
                int i5 = this.f5292m;
                int i6 = this.f5291l;
                int i7 = i5 - (i6 / 2);
                this.f5283d.setBounds(0, 0, i3, i6);
                this.f5284e.setBounds(0, 0, this.f5286g, this.f5298s);
                if (ViewCompat.m2231w(this.f5299t) == 1) {
                    this.f5284e.draw(canvas);
                    canvas.translate(this.f5285f, i7);
                    canvas.scale(-1.0f, 1.0f);
                    this.f5283d.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-this.f5285f, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    this.f5284e.draw(canvas);
                    canvas.translate(0.0f, i7);
                    this.f5283d.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.f5301v) {
                int i8 = this.f5298s;
                int i9 = this.f5289j;
                int i10 = this.f5295p;
                int i11 = this.f5294o;
                this.f5287h.setBounds(0, 0, i11, i9);
                this.f5288i.setBounds(0, 0, this.f5297r, this.f5290k);
                canvas.translate(0.0f, i8 - i9);
                this.f5288i.draw(canvas);
                canvas.translate(i10 - (i11 / 2), 0.0f);
                this.f5287h.draw(canvas);
                canvas.translate(-r2, -r7);
            }
        }
    }

    /* renamed from: i */
    public final void m3580i() {
        this.f5299t.removeCallbacks(this.f5279C);
    }

    @VisibleForTesting
    /* renamed from: j */
    public boolean m3581j(float f2, float f3) {
        if (f3 >= this.f5298s - this.f5289j) {
            int i2 = this.f5295p;
            int i3 = this.f5294o;
            if (f2 >= i2 - (i3 / 2) && f2 <= (i3 / 2) + i2) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    /* renamed from: k */
    public boolean m3582k(float f2, float f3) {
        if (ViewCompat.m2231w(this.f5299t) == 1) {
            if (f2 > this.f5285f) {
                return false;
            }
        } else if (f2 < this.f5297r - this.f5285f) {
            return false;
        }
        int i2 = this.f5292m;
        int i3 = this.f5291l / 2;
        return f3 >= ((float) (i2 - i3)) && f3 <= ((float) (i3 + i2));
    }

    /* renamed from: l */
    public final int m3583l(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / i5) * i6);
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    /* renamed from: m */
    public void m3584m(int i2) {
        if (i2 == 2 && this.f5302w != 2) {
            this.f5283d.setState(f5275E);
            m3580i();
        }
        if (i2 == 0) {
            this.f5299t.invalidate();
        } else {
            m3585n();
        }
        if (this.f5302w == 2 && i2 != 2) {
            this.f5283d.setState(f5276F);
            m3580i();
            this.f5299t.postDelayed(this.f5279C, 1200);
        } else if (i2 == 1) {
            m3580i();
            this.f5299t.postDelayed(this.f5279C, 1500);
        }
        this.f5302w = i2;
    }

    /* renamed from: n */
    public void m3585n() {
        int i2 = this.f5278B;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                this.f5277A.cancel();
            }
        }
        this.f5278B = 1;
        ValueAnimator valueAnimator = this.f5277A;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f5277A.setDuration(500L);
        this.f5277A.setStartDelay(0L);
        this.f5277A.start();
    }
}
