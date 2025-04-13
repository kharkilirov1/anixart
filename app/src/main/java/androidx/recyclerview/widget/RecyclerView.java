package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.TraceCompat;
import androidx.core.util.Pools;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.NestedScrollingChild2;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.C0495R;
import androidx.recyclerview.widget.AdapterHelper;
import androidx.recyclerview.widget.ChildHelper;
import androidx.recyclerview.widget.GapWorker;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import androidx.recyclerview.widget.ViewBoundsCheck;
import androidx.recyclerview.widget.ViewInfoStore;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, NestedScrollingChild2, NestedScrollingChild3 {

    /* renamed from: C0 */
    public static final int[] f5463C0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: D0 */
    public static final boolean f5464D0;

    /* renamed from: E0 */
    public static final boolean f5465E0;

    /* renamed from: F0 */
    public static final boolean f5466F0;

    /* renamed from: G0 */
    public static final Class<?>[] f5467G0;

    /* renamed from: H0 */
    public static final Interpolator f5468H0;

    /* renamed from: A */
    public int f5469A;

    /* renamed from: A0 */
    public int f5470A0;

    /* renamed from: B */
    public boolean f5471B;

    /* renamed from: B0 */
    public final ViewInfoStore.ProcessCallback f5472B0;

    /* renamed from: C */
    public final AccessibilityManager f5473C;

    /* renamed from: D */
    public List<OnChildAttachStateChangeListener> f5474D;

    /* renamed from: E */
    public boolean f5475E;

    /* renamed from: F */
    public boolean f5476F;

    /* renamed from: G */
    public int f5477G;

    /* renamed from: H */
    public int f5478H;

    /* renamed from: I */
    @NonNull
    public EdgeEffectFactory f5479I;

    /* renamed from: J */
    public EdgeEffect f5480J;

    /* renamed from: K */
    public EdgeEffect f5481K;

    /* renamed from: L */
    public EdgeEffect f5482L;

    /* renamed from: M */
    public EdgeEffect f5483M;

    /* renamed from: N */
    public ItemAnimator f5484N;

    /* renamed from: O */
    public int f5485O;

    /* renamed from: P */
    public int f5486P;

    /* renamed from: Q */
    public VelocityTracker f5487Q;

    /* renamed from: R */
    public int f5488R;

    /* renamed from: S */
    public int f5489S;

    /* renamed from: T */
    public int f5490T;

    /* renamed from: U */
    public int f5491U;

    /* renamed from: V */
    public int f5492V;

    /* renamed from: W */
    public OnFlingListener f5493W;

    /* renamed from: a0 */
    public final int f5494a0;

    /* renamed from: b */
    public final RecyclerViewDataObserver f5495b;

    /* renamed from: b0 */
    public final int f5496b0;

    /* renamed from: c */
    public final Recycler f5497c;

    /* renamed from: c0 */
    public float f5498c0;

    /* renamed from: d */
    public SavedState f5499d;

    /* renamed from: d0 */
    public float f5500d0;

    /* renamed from: e */
    public AdapterHelper f5501e;

    /* renamed from: e0 */
    public boolean f5502e0;

    /* renamed from: f */
    public ChildHelper f5503f;

    /* renamed from: f0 */
    public final ViewFlinger f5504f0;

    /* renamed from: g */
    public final ViewInfoStore f5505g;

    /* renamed from: g0 */
    public GapWorker f5506g0;

    /* renamed from: h */
    public boolean f5507h;

    /* renamed from: h0 */
    public GapWorker.LayoutPrefetchRegistryImpl f5508h0;

    /* renamed from: i */
    public final Runnable f5509i;

    /* renamed from: i0 */
    public final State f5510i0;

    /* renamed from: j */
    public final Rect f5511j;

    /* renamed from: j0 */
    public OnScrollListener f5512j0;

    /* renamed from: k */
    public final Rect f5513k;

    /* renamed from: k0 */
    public List<OnScrollListener> f5514k0;

    /* renamed from: l */
    public final RectF f5515l;

    /* renamed from: l0 */
    public boolean f5516l0;

    /* renamed from: m */
    public Adapter f5517m;

    /* renamed from: m0 */
    public boolean f5518m0;

    /* renamed from: n */
    @VisibleForTesting
    public LayoutManager f5519n;

    /* renamed from: n0 */
    public ItemAnimator.ItemAnimatorListener f5520n0;

    /* renamed from: o */
    public RecyclerListener f5521o;

    /* renamed from: o0 */
    public boolean f5522o0;

    /* renamed from: p */
    public final List<RecyclerListener> f5523p;

    /* renamed from: p0 */
    public RecyclerViewAccessibilityDelegate f5524p0;

    /* renamed from: q */
    public final ArrayList<ItemDecoration> f5525q;

    /* renamed from: q0 */
    public ChildDrawingOrderCallback f5526q0;

    /* renamed from: r */
    public final ArrayList<OnItemTouchListener> f5527r;

    /* renamed from: r0 */
    public final int[] f5528r0;

    /* renamed from: s */
    public OnItemTouchListener f5529s;

    /* renamed from: s0 */
    public NestedScrollingChildHelper f5530s0;

    /* renamed from: t */
    public boolean f5531t;

    /* renamed from: t0 */
    public final int[] f5532t0;

    /* renamed from: u */
    public boolean f5533u;

    /* renamed from: u0 */
    public final int[] f5534u0;

    /* renamed from: v */
    @VisibleForTesting
    public boolean f5535v;

    /* renamed from: v0 */
    public final int[] f5536v0;

    /* renamed from: w */
    public int f5537w;

    /* renamed from: w0 */
    @VisibleForTesting
    public final List<ViewHolder> f5538w0;

    /* renamed from: x */
    public boolean f5539x;

    /* renamed from: x0 */
    public Runnable f5540x0;

    /* renamed from: y */
    public boolean f5541y;

    /* renamed from: y0 */
    public boolean f5542y0;

    /* renamed from: z */
    public boolean f5543z;

    /* renamed from: z0 */
    public int f5544z0;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$7 */
    public static /* synthetic */ class C05337 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5550a;

        static {
            int[] iArr = new int[Adapter.StateRestorationPolicy.values().length];
            f5550a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5550a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class AdapterDataObservable extends Observable<AdapterDataObserver> {
        /* renamed from: a */
        public boolean m3838a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* renamed from: b */
        public void m3839b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).mo3410a();
            }
        }

        /* renamed from: c */
        public void m3840c(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).mo3414e(i2, i3, 1);
            }
        }

        /* renamed from: d */
        public void m3841d(int i2, int i3, @Nullable Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).mo3412c(i2, i3, obj);
            }
        }

        /* renamed from: e */
        public void m3842e(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).mo3413d(i2, i3);
            }
        }

        /* renamed from: f */
        public void m3843f(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).mo3415f(i2, i3);
            }
        }

        /* renamed from: g */
        public void m3844g() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).mo3734g();
            }
        }
    }

    public static abstract class AdapterDataObserver {
        /* renamed from: a */
        public void mo3410a() {
        }

        /* renamed from: b */
        public void mo3411b(int i2, int i3) {
        }

        /* renamed from: c */
        public void mo3412c(int i2, int i3, @Nullable Object obj) {
            mo3411b(i2, i3);
        }

        /* renamed from: d */
        public void mo3413d(int i2, int i3) {
        }

        /* renamed from: e */
        public void mo3414e(int i2, int i3, int i4) {
        }

        /* renamed from: f */
        public void mo3415f(int i2, int i3) {
        }

        /* renamed from: g */
        public void mo3734g() {
        }
    }

    public interface ChildDrawingOrderCallback {
        /* renamed from: a */
        int mo3645a(int i2, int i3);
    }

    public static class EdgeEffectFactory {

        @Retention(RetentionPolicy.SOURCE)
        public @interface EdgeDirection {
        }

        @NonNull
        /* renamed from: a */
        public EdgeEffect m3845a(@NonNull RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class ItemAnimator {

        /* renamed from: a */
        public ItemAnimatorListener f5553a = null;

        /* renamed from: b */
        public ArrayList<ItemAnimatorFinishedListener> f5554b = new ArrayList<>();

        /* renamed from: c */
        public long f5555c = 120;

        /* renamed from: d */
        public long f5556d = 120;

        /* renamed from: e */
        public long f5557e = 250;

        /* renamed from: f */
        public long f5558f = 250;

        @Retention(RetentionPolicy.SOURCE)
        public @interface AdapterChanges {
        }

        public interface ItemAnimatorFinishedListener {
            /* renamed from: a */
            void mo3855a();
        }

        public interface ItemAnimatorListener {
            /* renamed from: a */
            void mo3856a(@NonNull ViewHolder viewHolder);
        }

        public static class ItemHolderInfo {

            /* renamed from: a */
            public int f5559a;

            /* renamed from: b */
            public int f5560b;
        }

        /* renamed from: e */
        public static int m3846e(ViewHolder viewHolder) {
            int i2 = viewHolder.mFlags & 14;
            if (viewHolder.isInvalid()) {
                return 4;
            }
            if ((i2 & 4) != 0) {
                return i2;
            }
            int oldPosition = viewHolder.getOldPosition();
            int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
            return (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) ? i2 : i2 | ViewHolder.FLAG_MOVED;
        }

        /* renamed from: a */
        public abstract boolean mo3847a(@NonNull ViewHolder viewHolder, @Nullable ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2);

        /* renamed from: b */
        public abstract boolean mo3848b(@NonNull ViewHolder viewHolder, @NonNull ViewHolder viewHolder2, @NonNull ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2);

        /* renamed from: c */
        public abstract boolean mo3849c(@NonNull ViewHolder viewHolder, @NonNull ItemHolderInfo itemHolderInfo, @Nullable ItemHolderInfo itemHolderInfo2);

        /* renamed from: d */
        public abstract boolean mo3850d(@NonNull ViewHolder viewHolder, @NonNull ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2);

        /* renamed from: f */
        public boolean mo3851f(@NonNull ViewHolder viewHolder) {
            return true;
        }

        /* renamed from: g */
        public boolean mo3523g(@NonNull ViewHolder viewHolder, @NonNull List<Object> list) {
            return mo3851f(viewHolder);
        }

        /* renamed from: h */
        public final void m3852h(@NonNull ViewHolder viewHolder) {
            ItemAnimatorListener itemAnimatorListener = this.f5553a;
            if (itemAnimatorListener != null) {
                itemAnimatorListener.mo3856a(viewHolder);
            }
        }

        /* renamed from: i */
        public final void m3853i() {
            int size = this.f5554b.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f5554b.get(i2).mo3855a();
            }
            this.f5554b.clear();
        }

        /* renamed from: j */
        public abstract void mo3524j(@NonNull ViewHolder viewHolder);

        /* renamed from: k */
        public abstract void mo3525k();

        /* renamed from: l */
        public abstract boolean mo3526l();

        @NonNull
        /* renamed from: m */
        public ItemHolderInfo m3854m(@NonNull ViewHolder viewHolder) {
            ItemHolderInfo itemHolderInfo = new ItemHolderInfo();
            View view = viewHolder.itemView;
            itemHolderInfo.f5559a = view.getLeft();
            itemHolderInfo.f5560b = view.getTop();
            view.getRight();
            view.getBottom();
            return itemHolderInfo;
        }

        /* renamed from: n */
        public abstract void mo3527n();
    }

    public class ItemAnimatorRestoreListener implements ItemAnimator.ItemAnimatorListener {
        public ItemAnimatorRestoreListener() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener
        /* renamed from: a */
        public void mo3856a(ViewHolder viewHolder) {
            boolean z = true;
            viewHolder.setIsRecyclable(true);
            if (viewHolder.mShadowedHolder != null && viewHolder.mShadowingHolder == null) {
                viewHolder.mShadowedHolder = null;
            }
            viewHolder.mShadowingHolder = null;
            if (viewHolder.shouldBeKeptAsChild()) {
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            View view = viewHolder.itemView;
            recyclerView.m3828x0();
            ChildHelper childHelper = recyclerView.f5503f;
            int mo3516e = childHelper.f5186a.mo3516e(view);
            if (mo3516e == -1) {
                childHelper.m3503j(view);
            } else if (childHelper.f5187b.m3507d(mo3516e)) {
                childHelper.f5187b.m3509f(mo3516e);
                childHelper.m3503j(view);
                childHelper.f5186a.mo3521j(mo3516e);
            } else {
                z = false;
            }
            if (z) {
                ViewHolder m3759R = RecyclerView.m3759R(view);
                recyclerView.f5497c.m3932m(m3759R);
                recyclerView.f5497c.m3928i(m3759R);
            }
            recyclerView.m3832z0(!z);
            if (z || !viewHolder.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(viewHolder.itemView, false);
        }
    }

    public static abstract class ItemDecoration {
        /* renamed from: f */
        public void mo3404f(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull State state) {
            ((LayoutParams) view.getLayoutParams()).m3910a();
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: g */
        public void mo3576g(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull State state) {
        }

        /* renamed from: h */
        public void mo3405h(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull State state) {
        }
    }

    public static abstract class LayoutManager {

        /* renamed from: b */
        public ChildHelper f5562b;

        /* renamed from: c */
        public RecyclerView f5563c;

        /* renamed from: d */
        public final ViewBoundsCheck.Callback f5564d;

        /* renamed from: e */
        public final ViewBoundsCheck.Callback f5565e;

        /* renamed from: f */
        public ViewBoundsCheck f5566f;

        /* renamed from: g */
        public ViewBoundsCheck f5567g;

        /* renamed from: h */
        @Nullable
        public SmoothScroller f5568h;

        /* renamed from: i */
        public boolean f5569i;

        /* renamed from: j */
        public boolean f5570j;

        /* renamed from: k */
        public boolean f5571k;

        /* renamed from: l */
        public boolean f5572l;

        /* renamed from: m */
        public int f5573m;

        /* renamed from: n */
        public boolean f5574n;

        /* renamed from: o */
        public int f5575o;

        /* renamed from: p */
        public int f5576p;

        /* renamed from: q */
        public int f5577q;

        /* renamed from: r */
        public int f5578r;

        public interface LayoutPrefetchRegistry {
            /* renamed from: a */
            void mo3590a(int i2, int i3);
        }

        public static class Properties {

            /* renamed from: a */
            public int f5581a;

            /* renamed from: b */
            public int f5582b;

            /* renamed from: c */
            public boolean f5583c;

            /* renamed from: d */
            public boolean f5584d;
        }

        public LayoutManager() {
            ViewBoundsCheck.Callback callback = new ViewBoundsCheck.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.LayoutManager.1
                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                /* renamed from: a */
                public View mo3905a(int i2) {
                    return LayoutManager.this.m3868P(i2);
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                /* renamed from: b */
                public int mo3906b(View view) {
                    return LayoutManager.this.m3873U(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).leftMargin;
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                /* renamed from: c */
                public int mo3907c() {
                    return LayoutManager.this.mo3891f0();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                /* renamed from: d */
                public int mo3908d() {
                    LayoutManager layoutManager = LayoutManager.this;
                    return layoutManager.f5577q - layoutManager.mo3892g0();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                /* renamed from: e */
                public int mo3909e(View view) {
                    return LayoutManager.this.m3878X(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).rightMargin;
                }
            };
            this.f5564d = callback;
            ViewBoundsCheck.Callback callback2 = new ViewBoundsCheck.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.LayoutManager.2
                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                /* renamed from: a */
                public View mo3905a(int i2) {
                    return LayoutManager.this.m3868P(i2);
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                /* renamed from: b */
                public int mo3906b(View view) {
                    return LayoutManager.this.m3879Y(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).topMargin;
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                /* renamed from: c */
                public int mo3907c() {
                    return LayoutManager.this.mo3893h0();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                /* renamed from: d */
                public int mo3908d() {
                    LayoutManager layoutManager = LayoutManager.this;
                    return layoutManager.f5578r - layoutManager.mo3889e0();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                /* renamed from: e */
                public int mo3909e(View view) {
                    return LayoutManager.this.m3872T(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
                }
            };
            this.f5565e = callback2;
            this.f5566f = new ViewBoundsCheck(callback);
            this.f5567g = new ViewBoundsCheck(callback2);
            this.f5569i = false;
            this.f5570j = false;
            this.f5571k = true;
            this.f5572l = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
        
            if (r5 == 1073741824) goto L14;
         */
        /* renamed from: R */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int m3857R(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L21
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L21
                goto L2f
            L1a:
                if (r7 < 0) goto L1f
            L1c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L31
            L1f:
                if (r7 != r1) goto L23
            L21:
                r7 = r4
                goto L31
            L23:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L2a
                goto L2c
            L2a:
                r5 = 0
                goto L21
            L2c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L21
            L2f:
                r5 = 0
                r7 = 0
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.m3857R(int, int, int, int, boolean):int");
        }

        /* renamed from: j0 */
        public static Properties m3858j0(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
            Properties properties = new Properties();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0495R.styleable.f5165a, i2, i3);
            properties.f5581a = obtainStyledAttributes.getInt(0, 1);
            properties.f5582b = obtainStyledAttributes.getInt(10, 1);
            properties.f5583c = obtainStyledAttributes.getBoolean(9, false);
            properties.f5584d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return properties;
        }

        /* renamed from: n0 */
        public static boolean m3859n0(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (i4 > 0 && i2 != i4) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i2;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i2;
            }
            return true;
        }

        /* renamed from: y */
        public static int m3860y(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
        }

        /* renamed from: A */
        public void mo3663A(int i2, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        /* renamed from: A0 */
        public void mo3593A0(@NonNull RecyclerView recyclerView, int i2, int i3) {
        }

        /* renamed from: B */
        public int mo3665B(@NonNull State state) {
            return 0;
        }

        /* renamed from: B0 */
        public void mo3594B0(@NonNull RecyclerView recyclerView) {
        }

        /* renamed from: C */
        public int mo3596C(@NonNull State state) {
            return 0;
        }

        /* renamed from: C0 */
        public void mo3597C0(@NonNull RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        /* renamed from: D */
        public int mo3599D(@NonNull State state) {
            return 0;
        }

        /* renamed from: D0 */
        public void mo3600D0(@NonNull RecyclerView recyclerView, int i2, int i3) {
        }

        /* renamed from: E */
        public int mo3667E(@NonNull State state) {
            return 0;
        }

        /* renamed from: E0 */
        public void mo3601E0(@NonNull RecyclerView recyclerView, int i2, int i3, @Nullable Object obj) {
        }

        /* renamed from: F */
        public int mo3602F(@NonNull State state) {
            return 0;
        }

        /* renamed from: F0 */
        public void mo3603F0(Recycler recycler, State state) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: G */
        public int mo3604G(@NonNull State state) {
            return 0;
        }

        /* renamed from: G0 */
        public void mo3548G0(State state) {
        }

        /* renamed from: H */
        public void m3861H(@NonNull Recycler recycler) {
            int m3869Q = m3869Q();
            while (true) {
                m3869Q--;
                if (m3869Q < 0) {
                    return;
                }
                View m3868P = m3868P(m3869Q);
                ViewHolder m3759R = RecyclerView.m3759R(m3868P);
                if (!m3759R.shouldIgnore()) {
                    if (!m3759R.isInvalid() || m3759R.isRemoved() || this.f5563c.f5517m.hasStableIds()) {
                        mo3549J(m3869Q);
                        recycler.m3929j(m3868P);
                        this.f5563c.f5505g.m4022f(m3759R);
                    } else {
                        mo3556P0(m3869Q);
                        recycler.m3928i(m3759R);
                    }
                }
            }
        }

        /* renamed from: H0 */
        public void mo3671H0(Parcelable parcelable) {
        }

        /* renamed from: I */
        public void m3862I(@NonNull View view) {
            int m3501h = this.f5562b.m3501h(view);
            if (m3501h >= 0) {
                ChildHelper childHelper = this.f5562b;
                int m3498e = childHelper.m3498e(m3501h);
                childHelper.f5187b.m3509f(m3498e);
                childHelper.f5186a.mo3518g(m3498e);
            }
        }

        @Nullable
        /* renamed from: I0 */
        public Parcelable mo3673I0() {
            return null;
        }

        /* renamed from: J */
        public void mo3549J(int i2) {
            m3868P(i2);
            ChildHelper childHelper = this.f5562b;
            int m3498e = childHelper.m3498e(i2);
            childHelper.f5187b.m3509f(m3498e);
            childHelper.f5186a.mo3518g(m3498e);
        }

        /* renamed from: J0 */
        public void mo3863J0(int i2) {
        }

        @Nullable
        /* renamed from: K */
        public View m3864K(@NonNull View view) {
            View m3775H;
            RecyclerView recyclerView = this.f5563c;
            if (recyclerView == null || (m3775H = recyclerView.m3775H(view)) == null || this.f5562b.f5188c.contains(m3775H)) {
                return null;
            }
            return m3775H;
        }

        /* renamed from: K0 */
        public boolean mo3865K0(@NonNull Recycler recycler, @NonNull State state, int i2, @Nullable Bundle bundle) {
            int mo3893h0;
            int mo3891f0;
            int i3;
            int i4;
            RecyclerView recyclerView = this.f5563c;
            if (recyclerView == null) {
                return false;
            }
            if (i2 == 4096) {
                mo3893h0 = recyclerView.canScrollVertically(1) ? (this.f5578r - mo3893h0()) - mo3889e0() : 0;
                if (this.f5563c.canScrollHorizontally(1)) {
                    mo3891f0 = (this.f5577q - mo3891f0()) - mo3892g0();
                    i3 = mo3893h0;
                    i4 = mo3891f0;
                }
                i3 = mo3893h0;
                i4 = 0;
            } else if (i2 != 8192) {
                i4 = 0;
                i3 = 0;
            } else {
                mo3893h0 = recyclerView.canScrollVertically(-1) ? -((this.f5578r - mo3893h0()) - mo3889e0()) : 0;
                if (this.f5563c.canScrollHorizontally(-1)) {
                    mo3891f0 = -((this.f5577q - mo3891f0()) - mo3892g0());
                    i3 = mo3893h0;
                    i4 = mo3891f0;
                }
                i3 = mo3893h0;
                i4 = 0;
            }
            if (i3 == 0 && i4 == 0) {
                return false;
            }
            this.f5563c.m3824v0(i4, i3, null, Integer.MIN_VALUE, true);
            return true;
        }

        @Nullable
        /* renamed from: L */
        public View mo3676L(int i2) {
            int m3869Q = m3869Q();
            for (int i3 = 0; i3 < m3869Q; i3++) {
                View m3868P = m3868P(i3);
                ViewHolder m3759R = RecyclerView.m3759R(m3868P);
                if (m3759R != null && m3759R.getLayoutPosition() == i2 && !m3759R.shouldIgnore() && (this.f5563c.f5510i0.f5627g || !m3759R.isRemoved())) {
                    return m3868P;
                }
            }
            return null;
        }

        /* renamed from: L0 */
        public void mo3550L0(@NonNull Recycler recycler) {
            for (int m3869Q = m3869Q() - 1; m3869Q >= 0; m3869Q--) {
                if (!RecyclerView.m3759R(m3868P(m3869Q)).shouldIgnore()) {
                    m3867N0(m3869Q, recycler);
                }
            }
        }

        /* renamed from: M */
        public abstract LayoutParams mo3551M();

        /* renamed from: M0 */
        public void m3866M0(Recycler recycler) {
            int size = recycler.f5595a.size();
            for (int i2 = size - 1; i2 >= 0; i2--) {
                View view = recycler.f5595a.get(i2).itemView;
                ViewHolder m3759R = RecyclerView.m3759R(view);
                if (!m3759R.shouldIgnore()) {
                    m3759R.setIsRecyclable(false);
                    if (m3759R.isTmpDetached()) {
                        this.f5563c.removeDetachedView(view, false);
                    }
                    ItemAnimator itemAnimator = this.f5563c.f5484N;
                    if (itemAnimator != null) {
                        itemAnimator.mo3524j(m3759R);
                    }
                    m3759R.setIsRecyclable(true);
                    ViewHolder m3759R2 = RecyclerView.m3759R(view);
                    m3759R2.mScrapContainer = null;
                    m3759R2.mInChangeScrap = false;
                    m3759R2.clearReturnedFromScrapFlag();
                    recycler.m3928i(m3759R2);
                }
            }
            recycler.f5595a.clear();
            ArrayList<ViewHolder> arrayList = recycler.f5596b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.f5563c.invalidate();
            }
        }

        /* renamed from: N */
        public LayoutParams mo3552N(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        /* renamed from: N0 */
        public void m3867N0(int i2, @NonNull Recycler recycler) {
            View m3868P = m3868P(i2);
            mo3556P0(i2);
            recycler.m3927h(m3868P);
        }

        /* renamed from: O */
        public LayoutParams mo3553O(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
        }

        /* renamed from: O0 */
        public void mo3554O0(View view) {
            ChildHelper childHelper = this.f5562b;
            int mo3516e = childHelper.f5186a.mo3516e(view);
            if (mo3516e < 0) {
                return;
            }
            if (childHelper.f5187b.m3509f(mo3516e)) {
                childHelper.m3503j(view);
            }
            childHelper.f5186a.mo3521j(mo3516e);
        }

        @Nullable
        /* renamed from: P */
        public View m3868P(int i2) {
            ChildHelper childHelper = this.f5562b;
            if (childHelper == null) {
                return null;
            }
            return childHelper.f5186a.mo3512a(childHelper.m3498e(i2));
        }

        /* renamed from: P0 */
        public void mo3556P0(int i2) {
            ChildHelper childHelper;
            int m3498e;
            View mo3512a;
            if (m3868P(i2) == null || (mo3512a = childHelper.f5186a.mo3512a((m3498e = (childHelper = this.f5562b).m3498e(i2)))) == null) {
                return;
            }
            if (childHelper.f5187b.m3509f(m3498e)) {
                childHelper.m3503j(mo3512a);
            }
            childHelper.f5186a.mo3521j(m3498e);
        }

        /* renamed from: Q */
        public int m3869Q() {
            ChildHelper childHelper = this.f5562b;
            if (childHelper != null) {
                return childHelper.m3497d();
            }
            return 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00b8, code lost:
        
            if (r1 == false) goto L34;
         */
        /* renamed from: Q0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean mo3870Q0(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r19, @androidx.annotation.NonNull android.view.View r20, @androidx.annotation.NonNull android.graphics.Rect r21, boolean r22, boolean r23) {
            /*
                r18 = this;
                r0 = r18
                r1 = r21
                r2 = 2
                int[] r2 = new int[r2]
                int r3 = r18.mo3891f0()
                int r4 = r18.mo3893h0()
                int r5 = r0.f5577q
                int r6 = r18.mo3892g0()
                int r5 = r5 - r6
                int r6 = r0.f5578r
                int r7 = r18.mo3889e0()
                int r6 = r6 - r7
                int r7 = r20.getLeft()
                int r8 = r1.left
                int r7 = r7 + r8
                int r8 = r20.getScrollX()
                int r7 = r7 - r8
                int r8 = r20.getTop()
                int r9 = r1.top
                int r8 = r8 + r9
                int r9 = r20.getScrollY()
                int r8 = r8 - r9
                int r9 = r21.width()
                int r9 = r9 + r7
                int r1 = r21.height()
                int r1 = r1 + r8
                int r7 = r7 - r3
                r3 = 0
                int r10 = java.lang.Math.min(r3, r7)
                int r8 = r8 - r4
                int r4 = java.lang.Math.min(r3, r8)
                int r9 = r9 - r5
                int r5 = java.lang.Math.max(r3, r9)
                int r1 = r1 - r6
                int r1 = java.lang.Math.max(r3, r1)
                int r6 = r18.m3885b0()
                r11 = 1
                if (r6 != r11) goto L63
                if (r5 == 0) goto L5e
                goto L6b
            L5e:
                int r5 = java.lang.Math.max(r10, r9)
                goto L6b
            L63:
                if (r10 == 0) goto L66
                goto L6a
            L66:
                int r10 = java.lang.Math.min(r7, r5)
            L6a:
                r5 = r10
            L6b:
                if (r4 == 0) goto L6e
                goto L72
            L6e:
                int r4 = java.lang.Math.min(r8, r1)
            L72:
                r2[r3] = r5
                r2[r11] = r4
                r13 = r2[r3]
                r14 = r2[r11]
                if (r23 == 0) goto Lba
                android.view.View r1 = r19.getFocusedChild()
                if (r1 != 0) goto L83
                goto Lb7
            L83:
                int r2 = r18.mo3891f0()
                int r4 = r18.mo3893h0()
                int r5 = r0.f5577q
                int r6 = r18.mo3892g0()
                int r5 = r5 - r6
                int r6 = r0.f5578r
                int r7 = r18.mo3889e0()
                int r6 = r6 - r7
                androidx.recyclerview.widget.RecyclerView r7 = r0.f5563c
                android.graphics.Rect r7 = r7.f5511j
                androidx.recyclerview.widget.RecyclerView.m3760S(r1, r7)
                int r1 = r7.left
                int r1 = r1 - r13
                if (r1 >= r5) goto Lb7
                int r1 = r7.right
                int r1 = r1 - r13
                if (r1 <= r2) goto Lb7
                int r1 = r7.top
                int r1 = r1 - r14
                if (r1 >= r6) goto Lb7
                int r1 = r7.bottom
                int r1 = r1 - r14
                if (r1 > r4) goto Lb5
                goto Lb7
            Lb5:
                r1 = 1
                goto Lb8
            Lb7:
                r1 = 0
            Lb8:
                if (r1 == 0) goto Lbf
            Lba:
                if (r13 != 0) goto Lc0
                if (r14 == 0) goto Lbf
                goto Lc0
            Lbf:
                return r3
            Lc0:
                if (r22 == 0) goto Lc8
                r1 = r19
                r1.scrollBy(r13, r14)
                goto Ld4
            Lc8:
                r1 = r19
                r17 = 0
                r16 = -2147483648(0xffffffff80000000, float:-0.0)
                r15 = 0
                r12 = r19
                r12.m3824v0(r13, r14, r15, r16, r17)
            Ld4:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.mo3870Q0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        /* renamed from: R0 */
        public void m3871R0() {
            RecyclerView recyclerView = this.f5563c;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: S */
        public int mo3610S(@NonNull Recycler recycler, @NonNull State state) {
            return -1;
        }

        /* renamed from: S0 */
        public int mo3611S0(int i2, Recycler recycler, State state) {
            return 0;
        }

        /* renamed from: T */
        public int m3872T(@NonNull View view) {
            return view.getBottom() + ((LayoutParams) view.getLayoutParams()).f5586b.bottom;
        }

        /* renamed from: T0 */
        public void mo3680T0(int i2) {
        }

        /* renamed from: U */
        public int m3873U(@NonNull View view) {
            return view.getLeft() - ((LayoutParams) view.getLayoutParams()).f5586b.left;
        }

        /* renamed from: U0 */
        public int mo3614U0(int i2, Recycler recycler, State state) {
            return 0;
        }

        /* renamed from: V */
        public int mo3874V(@NonNull View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f5586b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: V0 */
        public void m3875V0(RecyclerView recyclerView) {
            m3877W0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: W */
        public int mo3876W(@NonNull View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f5586b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: W0 */
        public void m3877W0(int i2, int i3) {
            this.f5577q = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            this.f5575o = mode;
            if (mode == 0 && !RecyclerView.f5464D0) {
                this.f5577q = 0;
            }
            this.f5578r = View.MeasureSpec.getSize(i3);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.f5576p = mode2;
            if (mode2 != 0 || RecyclerView.f5464D0) {
                return;
            }
            this.f5578r = 0;
        }

        /* renamed from: X */
        public int m3878X(@NonNull View view) {
            return view.getRight() + ((LayoutParams) view.getLayoutParams()).f5586b.right;
        }

        /* renamed from: X0 */
        public void mo3618X0(Rect rect, int i2, int i3) {
            int mo3892g0 = mo3892g0() + mo3891f0() + rect.width();
            int mo3889e0 = mo3889e0() + mo3893h0() + rect.height();
            this.f5563c.setMeasuredDimension(m3860y(i2, mo3892g0, m3888d0()), m3860y(i3, mo3889e0, m3886c0()));
        }

        /* renamed from: Y */
        public int m3879Y(@NonNull View view) {
            return view.getTop() - ((LayoutParams) view.getLayoutParams()).f5586b.top;
        }

        /* renamed from: Y0 */
        public void m3880Y0(int i2, int i3) {
            int m3869Q = m3869Q();
            if (m3869Q == 0) {
                this.f5563c.m3819t(i2, i3);
                return;
            }
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = 0; i8 < m3869Q; i8++) {
                View m3868P = m3868P(i8);
                Rect rect = this.f5563c.f5511j;
                RecyclerView.m3760S(m3868P, rect);
                int i9 = rect.left;
                if (i9 < i6) {
                    i6 = i9;
                }
                int i10 = rect.right;
                if (i10 > i4) {
                    i4 = i10;
                }
                int i11 = rect.top;
                if (i11 < i7) {
                    i7 = i11;
                }
                int i12 = rect.bottom;
                if (i12 > i5) {
                    i5 = i12;
                }
            }
            this.f5563c.f5511j.set(i6, i7, i4, i5);
            mo3618X0(this.f5563c.f5511j, i2, i3);
        }

        @Nullable
        /* renamed from: Z */
        public View m3881Z() {
            View focusedChild;
            RecyclerView recyclerView = this.f5563c;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f5562b.f5188c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: Z0 */
        public void m3882Z0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f5563c = null;
                this.f5562b = null;
                this.f5577q = 0;
                this.f5578r = 0;
            } else {
                this.f5563c = recyclerView;
                this.f5562b = recyclerView.f5503f;
                this.f5577q = recyclerView.getWidth();
                this.f5578r = recyclerView.getHeight();
            }
            this.f5575o = 1073741824;
            this.f5576p = 1073741824;
        }

        /* renamed from: a0 */
        public int m3883a0() {
            RecyclerView recyclerView = this.f5563c;
            Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        /* renamed from: a1 */
        public boolean m3884a1(View view, int i2, int i3, LayoutParams layoutParams) {
            return (!view.isLayoutRequested() && this.f5571k && m3859n0(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).width) && m3859n0(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        /* renamed from: b0 */
        public int m3885b0() {
            return ViewCompat.m2231w(this.f5563c);
        }

        /* renamed from: b1 */
        public boolean mo3681b1() {
            return false;
        }

        @Px
        /* renamed from: c0 */
        public int m3886c0() {
            return ViewCompat.m2233x(this.f5563c);
        }

        /* renamed from: c1 */
        public boolean m3887c1(View view, int i2, int i3, LayoutParams layoutParams) {
            return (this.f5571k && m3859n0(view.getMeasuredWidth(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).width) && m3859n0(view.getMeasuredHeight(), i3, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        @Px
        /* renamed from: d0 */
        public int m3888d0() {
            return ViewCompat.m2235y(this.f5563c);
        }

        /* renamed from: d1 */
        public void mo3682d1(RecyclerView recyclerView, State state, int i2) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        @Px
        /* renamed from: e0 */
        public int mo3889e0() {
            RecyclerView recyclerView = this.f5563c;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: e1 */
        public void m3890e1(SmoothScroller smoothScroller) {
            SmoothScroller smoothScroller2 = this.f5568h;
            if (smoothScroller2 != null && smoothScroller != smoothScroller2 && smoothScroller2.f5610e) {
                smoothScroller2.m3938g();
            }
            this.f5568h = smoothScroller;
            RecyclerView recyclerView = this.f5563c;
            recyclerView.f5504f0.m3946c();
            if (smoothScroller.f5613h) {
                StringBuilder m24u = C0000a.m24u("An instance of ");
                m24u.append(smoothScroller.getClass().getSimpleName());
                m24u.append(" was started more than once. Each instance of");
                m24u.append(smoothScroller.getClass().getSimpleName());
                m24u.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w("RecyclerView", m24u.toString());
            }
            smoothScroller.f5607b = recyclerView;
            smoothScroller.f5608c = this;
            int i2 = smoothScroller.f5606a;
            if (i2 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f5510i0.f5621a = i2;
            smoothScroller.f5610e = true;
            smoothScroller.f5609d = true;
            smoothScroller.f5611f = recyclerView.f5519n.mo3676L(i2);
            smoothScroller.mo3717d();
            smoothScroller.f5607b.f5504f0.m3944a();
            smoothScroller.f5613h = true;
        }

        @Px
        /* renamed from: f0 */
        public int mo3891f0() {
            RecyclerView recyclerView = this.f5563c;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: f1 */
        public boolean mo3620f1() {
            return false;
        }

        @Px
        /* renamed from: g0 */
        public int mo3892g0() {
            RecyclerView recyclerView = this.f5563c;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        @Px
        /* renamed from: h0 */
        public int mo3893h0() {
            RecyclerView recyclerView = this.f5563c;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: i0 */
        public int m3894i0(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).m3910a();
        }

        /* renamed from: k0 */
        public int mo3622k0(@NonNull Recycler recycler, @NonNull State state) {
            return -1;
        }

        /* renamed from: l0 */
        public void m3895l0(@NonNull View view, boolean z, @NonNull Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).f5586b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f5563c != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f5563c.f5515l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: m0 */
        public boolean mo3689m0() {
            return false;
        }

        /* renamed from: o0 */
        public void mo3570o0(@NonNull View view, int i2, int i3, int i4, int i5) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f5586b;
            view.layout(i2 + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i3 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i4 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i5 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        /* renamed from: p0 */
        public void mo3572p0(@NonNull View view, int i2, int i3) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect m3784T = this.f5563c.m3784T(view);
            int i4 = m3784T.left + m3784T.right + i2;
            int i5 = m3784T.top + m3784T.bottom + i3;
            int m3857R = m3857R(this.f5577q, this.f5575o, mo3892g0() + mo3891f0() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i4, ((ViewGroup.MarginLayoutParams) layoutParams).width, mo3700v());
            int m3857R2 = m3857R(this.f5578r, this.f5576p, mo3889e0() + mo3893h0() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) layoutParams).height, mo3701w());
            if (m3884a1(view, m3857R, m3857R2, layoutParams)) {
                view.measure(m3857R, m3857R2);
            }
        }

        /* renamed from: q */
        public void m3896q(View view) {
            m3898r(view, -1, false);
        }

        /* renamed from: q0 */
        public void mo3897q0(@Px int i2) {
            RecyclerView recyclerView = this.f5563c;
            if (recyclerView != null) {
                int m3497d = recyclerView.f5503f.m3497d();
                for (int i3 = 0; i3 < m3497d; i3++) {
                    recyclerView.f5503f.m3496c(i3).offsetLeftAndRight(i2);
                }
            }
        }

        /* renamed from: r */
        public final void m3898r(View view, int i2, boolean z) {
            ViewHolder m3759R = RecyclerView.m3759R(view);
            if (z || m3759R.isRemoved()) {
                this.f5563c.f5505g.m4017a(m3759R);
            } else {
                this.f5563c.f5505g.m4022f(m3759R);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (m3759R.wasReturnedFromScrap() || m3759R.isScrap()) {
                if (m3759R.isScrap()) {
                    m3759R.unScrap();
                } else {
                    m3759R.clearReturnedFromScrapFlag();
                }
                this.f5562b.m3495b(view, i2, view.getLayoutParams(), false);
            } else {
                if (view.getParent() == this.f5563c) {
                    int m3501h = this.f5562b.m3501h(view);
                    if (i2 == -1) {
                        i2 = this.f5562b.m3497d();
                    }
                    if (m3501h == -1) {
                        StringBuilder m24u = C0000a.m24u("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        m24u.append(this.f5563c.indexOfChild(view));
                        throw new IllegalStateException(C0000a.m6c(this.f5563c, m24u));
                    }
                    if (m3501h != i2) {
                        LayoutManager layoutManager = this.f5563c.f5519n;
                        View m3868P = layoutManager.m3868P(m3501h);
                        if (m3868P == null) {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + m3501h + layoutManager.f5563c.toString());
                        }
                        layoutManager.mo3549J(m3501h);
                        layoutManager.m3901t(m3868P, i2);
                    }
                } else {
                    this.f5562b.m3494a(view, i2, false);
                    layoutParams.f5587c = true;
                    SmoothScroller smoothScroller = this.f5568h;
                    if (smoothScroller != null && smoothScroller.f5610e) {
                        Objects.requireNonNull(smoothScroller.f5607b);
                        ViewHolder m3759R2 = RecyclerView.m3759R(view);
                        if ((m3759R2 != null ? m3759R2.getLayoutPosition() : -1) == smoothScroller.f5606a) {
                            smoothScroller.f5611f = view;
                        }
                    }
                }
            }
            if (layoutParams.f5588d) {
                m3759R.itemView.invalidate();
                layoutParams.f5588d = false;
            }
        }

        /* renamed from: r0 */
        public void mo3899r0(@Px int i2) {
            RecyclerView recyclerView = this.f5563c;
            if (recyclerView != null) {
                int m3497d = recyclerView.f5503f.m3497d();
                for (int i3 = 0; i3 < m3497d; i3++) {
                    recyclerView.f5503f.m3496c(i3).offsetTopAndBottom(i2);
                }
            }
        }

        /* renamed from: s */
        public void mo3696s(String str) {
            RecyclerView recyclerView = this.f5563c;
            if (recyclerView != null) {
                recyclerView.m3808n(str);
            }
        }

        /* renamed from: s0 */
        public void mo3900s0(@Nullable Adapter adapter, @Nullable Adapter adapter2) {
        }

        /* renamed from: t */
        public void m3901t(@NonNull View view, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            ViewHolder m3759R = RecyclerView.m3759R(view);
            if (m3759R.isRemoved()) {
                this.f5563c.f5505g.m4017a(m3759R);
            } else {
                this.f5563c.f5505g.m4022f(m3759R);
            }
            this.f5562b.m3495b(view, i2, layoutParams, m3759R.isRemoved());
        }

        @CallSuper
        /* renamed from: t0 */
        public void mo3573t0(RecyclerView recyclerView) {
        }

        /* renamed from: u */
        public void m3902u(@NonNull View view, @NonNull Rect rect) {
            RecyclerView recyclerView = this.f5563c;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.m3784T(view));
            }
        }

        @CallSuper
        /* renamed from: u0 */
        public void mo3574u0(RecyclerView recyclerView, Recycler recycler) {
        }

        /* renamed from: v */
        public boolean mo3700v() {
            return false;
        }

        @Nullable
        /* renamed from: v0 */
        public View mo3623v0(@NonNull View view, int i2, @NonNull Recycler recycler, @NonNull State state) {
            return null;
        }

        /* renamed from: w */
        public boolean mo3701w() {
            return false;
        }

        /* renamed from: w0 */
        public void mo3702w0(@NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f5563c;
            Recycler recycler = recyclerView.f5497c;
            State state = recyclerView.f5510i0;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f5563c.canScrollVertically(-1) && !this.f5563c.canScrollHorizontally(-1) && !this.f5563c.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            Adapter adapter = this.f5563c.f5517m;
            if (adapter != null) {
                accessibilityEvent.setItemCount(adapter.getItemCount());
            }
        }

        /* renamed from: x */
        public boolean mo3575x(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        /* renamed from: x0 */
        public void mo3903x0(@NonNull Recycler recycler, @NonNull State state, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (this.f5563c.canScrollVertically(-1) || this.f5563c.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.f3743a.addAction(ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST);
                accessibilityNodeInfoCompat.f3743a.setScrollable(true);
            }
            if (this.f5563c.canScrollVertically(1) || this.f5563c.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.f3743a.addAction(ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT);
                accessibilityNodeInfoCompat.f3743a.setScrollable(true);
            }
            accessibilityNodeInfoCompat.m2511q(AccessibilityNodeInfoCompat.CollectionInfoCompat.m2518a(mo3622k0(recycler, state), mo3610S(recycler, state), false, 0));
        }

        /* renamed from: y0 */
        public void m3904y0(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            ViewHolder m3759R = RecyclerView.m3759R(view);
            if (m3759R == null || m3759R.isRemoved() || this.f5562b.m3502i(m3759R.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.f5563c;
            mo3625z0(recyclerView.f5497c, recyclerView.f5510i0, view, accessibilityNodeInfoCompat);
        }

        /* renamed from: z */
        public void mo3706z(int i2, int i3, State state, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        /* renamed from: z0 */
        public void mo3625z0(@NonNull Recycler recycler, @NonNull State state, @NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }
    }

    public interface OnChildAttachStateChangeListener {
        /* renamed from: b */
        void mo3632b(@NonNull View view);

        /* renamed from: d */
        void mo3633d(@NonNull View view);
    }

    public static abstract class OnFlingListener {
        /* renamed from: a */
        public abstract boolean mo3913a(int i2, int i3);
    }

    public interface OnItemTouchListener {
        /* renamed from: a */
        void mo3577a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);

        /* renamed from: c */
        boolean mo3578c(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);

        /* renamed from: e */
        void mo3579e(boolean z);
    }

    public static abstract class OnScrollListener {
        /* renamed from: a */
        public void mo3914a(@NonNull RecyclerView recyclerView, int i2) {
        }

        /* renamed from: c */
        public void mo3586c(@NonNull RecyclerView recyclerView, int i2, int i3) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Orientation {
    }

    public static class RecycledViewPool {

        /* renamed from: a */
        public SparseArray<ScrapData> f5589a = new SparseArray<>();

        /* renamed from: b */
        public int f5590b = 0;

        public static class ScrapData {

            /* renamed from: a */
            public final ArrayList<ViewHolder> f5591a = new ArrayList<>();

            /* renamed from: b */
            public int f5592b = 5;

            /* renamed from: c */
            public long f5593c = 0;

            /* renamed from: d */
            public long f5594d = 0;
        }

        /* renamed from: a */
        public void mo3915a() {
            for (int i2 = 0; i2 < this.f5589a.size(); i2++) {
                this.f5589a.valueAt(i2).f5591a.clear();
            }
        }

        @Nullable
        /* renamed from: b */
        public ViewHolder mo3916b(int i2) {
            ScrapData scrapData = this.f5589a.get(i2);
            if (scrapData == null || scrapData.f5591a.isEmpty()) {
                return null;
            }
            ArrayList<ViewHolder> arrayList = scrapData.f5591a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* renamed from: c */
        public final ScrapData m3917c(int i2) {
            ScrapData scrapData = this.f5589a.get(i2);
            if (scrapData != null) {
                return scrapData;
            }
            ScrapData scrapData2 = new ScrapData();
            this.f5589a.put(i2, scrapData2);
            return scrapData2;
        }

        /* renamed from: d */
        public void mo3918d(ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            ArrayList<ViewHolder> arrayList = m3917c(itemViewType).f5591a;
            if (this.f5589a.get(itemViewType).f5592b <= arrayList.size()) {
                return;
            }
            viewHolder.resetInternal();
            arrayList.add(viewHolder);
        }

        /* renamed from: e */
        public long m3919e(long j2, long j3) {
            if (j2 == 0) {
                return j3;
            }
            return (j3 / 4) + ((j2 / 4) * 3);
        }
    }

    public final class Recycler {

        /* renamed from: a */
        public final ArrayList<ViewHolder> f5595a;

        /* renamed from: b */
        public ArrayList<ViewHolder> f5596b;

        /* renamed from: c */
        public final ArrayList<ViewHolder> f5597c;

        /* renamed from: d */
        public final List<ViewHolder> f5598d;

        /* renamed from: e */
        public int f5599e;

        /* renamed from: f */
        public int f5600f;

        /* renamed from: g */
        public RecycledViewPool f5601g;

        /* renamed from: h */
        public ViewCacheExtension f5602h;

        public Recycler() {
            ArrayList<ViewHolder> arrayList = new ArrayList<>();
            this.f5595a = arrayList;
            this.f5596b = null;
            this.f5597c = new ArrayList<>();
            this.f5598d = Collections.unmodifiableList(arrayList);
            this.f5599e = 2;
            this.f5600f = 2;
        }

        /* renamed from: a */
        public void m3920a(@NonNull ViewHolder viewHolder, boolean z) {
            RecyclerView.m3765p(viewHolder);
            View view = viewHolder.itemView;
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = RecyclerView.this.f5524p0;
            if (recyclerViewAccessibilityDelegate != null) {
                AccessibilityDelegateCompat mo3454j = recyclerViewAccessibilityDelegate.mo3454j();
                ViewCompat.m2196e0(view, mo3454j instanceof RecyclerViewAccessibilityDelegate.ItemDelegate ? ((RecyclerViewAccessibilityDelegate.ItemDelegate) mo3454j).f5645e.remove(view) : null);
            }
            if (z) {
                RecyclerListener recyclerListener = RecyclerView.this.f5521o;
                if (recyclerListener != null) {
                    recyclerListener.m3934a(viewHolder);
                }
                int size = RecyclerView.this.f5523p.size();
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView.this.f5523p.get(i2).m3934a(viewHolder);
                }
                Adapter adapter = RecyclerView.this.f5517m;
                if (adapter != null) {
                    adapter.onViewRecycled(viewHolder);
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f5510i0 != null) {
                    recyclerView.f5505g.m4023g(viewHolder);
                }
            }
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = null;
            m3923d().mo3918d(viewHolder);
        }

        /* renamed from: b */
        public void m3921b() {
            this.f5595a.clear();
            m3925f();
        }

        /* renamed from: c */
        public int m3922c(int i2) {
            if (i2 >= 0 && i2 < RecyclerView.this.f5510i0.m3942b()) {
                RecyclerView recyclerView = RecyclerView.this;
                return !recyclerView.f5510i0.f5627g ? i2 : recyclerView.f5501e.m3474h(i2, 0);
            }
            StringBuilder m25v = C0000a.m25v("invalid position ", i2, ". State item count is ");
            m25v.append(RecyclerView.this.f5510i0.m3942b());
            throw new IndexOutOfBoundsException(C0000a.m6c(RecyclerView.this, m25v));
        }

        /* renamed from: d */
        public RecycledViewPool m3923d() {
            if (this.f5601g == null) {
                this.f5601g = new RecycledViewPool();
            }
            return this.f5601g;
        }

        @NonNull
        /* renamed from: e */
        public View m3924e(int i2) {
            return m3931l(i2, false, Long.MAX_VALUE).itemView;
        }

        /* renamed from: f */
        public void m3925f() {
            for (int size = this.f5597c.size() - 1; size >= 0; size--) {
                m3926g(size);
            }
            this.f5597c.clear();
            if (RecyclerView.f5466F0) {
                GapWorker.LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = RecyclerView.this.f5508h0;
                int[] iArr = layoutPrefetchRegistryImpl.f5319c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                layoutPrefetchRegistryImpl.f5320d = 0;
            }
        }

        /* renamed from: g */
        public void m3926g(int i2) {
            m3920a(this.f5597c.get(i2), true);
            this.f5597c.remove(i2);
        }

        /* renamed from: h */
        public void m3927h(@NonNull View view) {
            ViewHolder m3759R = RecyclerView.m3759R(view);
            if (m3759R.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (m3759R.isScrap()) {
                m3759R.unScrap();
            } else if (m3759R.wasReturnedFromScrap()) {
                m3759R.clearReturnedFromScrapFlag();
            }
            m3928i(m3759R);
            if (RecyclerView.this.f5484N == null || m3759R.isRecyclable()) {
                return;
            }
            RecyclerView.this.f5484N.mo3524j(m3759R);
        }

        /* renamed from: i */
        public void m3928i(ViewHolder viewHolder) {
            boolean z;
            boolean z2;
            if (viewHolder.isScrap() || viewHolder.itemView.getParent() != null) {
                StringBuilder m24u = C0000a.m24u("Scrapped or attached views may not be recycled. isScrap:");
                m24u.append(viewHolder.isScrap());
                m24u.append(" isAttached:");
                m24u.append(viewHolder.itemView.getParent() != null);
                throw new IllegalArgumentException(C0000a.m6c(RecyclerView.this, m24u));
            }
            if (viewHolder.isTmpDetached()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb.append(viewHolder);
                throw new IllegalArgumentException(C0000a.m6c(RecyclerView.this, sb));
            }
            if (viewHolder.shouldIgnore()) {
                throw new IllegalArgumentException(C0000a.m6c(RecyclerView.this, C0000a.m24u("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
            boolean doesTransientStatePreventRecycling = viewHolder.doesTransientStatePreventRecycling();
            Adapter adapter = RecyclerView.this.f5517m;
            if ((adapter != null && doesTransientStatePreventRecycling && adapter.onFailedToRecycleView(viewHolder)) || viewHolder.isRecyclable()) {
                if (this.f5600f <= 0 || viewHolder.hasAnyOfTheFlags(526)) {
                    z = false;
                } else {
                    int size = this.f5597c.size();
                    if (size >= this.f5600f && size > 0) {
                        m3926g(0);
                        size--;
                    }
                    if (RecyclerView.f5466F0 && size > 0 && !RecyclerView.this.f5508h0.m3592c(viewHolder.mPosition)) {
                        do {
                            size--;
                            if (size < 0) {
                                break;
                            }
                        } while (RecyclerView.this.f5508h0.m3592c(this.f5597c.get(size).mPosition));
                        size++;
                    }
                    this.f5597c.add(size, viewHolder);
                    z = true;
                }
                if (!z) {
                    m3920a(viewHolder, true);
                    RecyclerView.this.f5505g.m4023g(viewHolder);
                    if (z && !r1 && doesTransientStatePreventRecycling) {
                        viewHolder.mBindingAdapter = null;
                        viewHolder.mOwnerRecyclerView = null;
                        return;
                    }
                    return;
                }
                z2 = z;
            } else {
                z2 = false;
            }
            z = z2;
            r1 = false;
            RecyclerView.this.f5505g.m4023g(viewHolder);
            if (z) {
            }
        }

        /* renamed from: j */
        public void m3929j(View view) {
            ViewHolder m3759R = RecyclerView.m3759R(view);
            if (!m3759R.hasAnyOfTheFlags(12) && m3759R.isUpdated()) {
                ItemAnimator itemAnimator = RecyclerView.this.f5484N;
                if (!(itemAnimator == null || itemAnimator.mo3523g(m3759R, m3759R.getUnmodifiedPayloads()))) {
                    if (this.f5596b == null) {
                        this.f5596b = new ArrayList<>();
                    }
                    m3759R.setScrapContainer(this, true);
                    this.f5596b.add(m3759R);
                    return;
                }
            }
            if (m3759R.isInvalid() && !m3759R.isRemoved() && !RecyclerView.this.f5517m.hasStableIds()) {
                throw new IllegalArgumentException(C0000a.m6c(RecyclerView.this, C0000a.m24u("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
            m3759R.setScrapContainer(this, false);
            this.f5595a.add(m3759R);
        }

        /* renamed from: k */
        public final boolean m3930k(@NonNull ViewHolder viewHolder, int i2, int i3, long j2) {
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = viewHolder.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z = false;
            if (j2 != Long.MAX_VALUE) {
                long j3 = this.f5601g.m3917c(itemViewType).f5594d;
                if (!(j3 == 0 || j3 + nanoTime < j2)) {
                    return false;
                }
            }
            RecyclerView.this.f5517m.bindViewHolder(viewHolder, i2);
            long nanoTime2 = RecyclerView.this.getNanoTime();
            RecycledViewPool recycledViewPool = this.f5601g;
            RecycledViewPool.ScrapData m3917c = recycledViewPool.m3917c(viewHolder.getItemViewType());
            m3917c.f5594d = recycledViewPool.m3919e(m3917c.f5594d, nanoTime2 - nanoTime);
            AccessibilityManager accessibilityManager = RecyclerView.this.f5473C;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                z = true;
            }
            if (z) {
                View view = viewHolder.itemView;
                if (ViewCompat.m2227u(view) == 0) {
                    ViewCompat.m2216o0(view, 1);
                }
                RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = RecyclerView.this.f5524p0;
                if (recyclerViewAccessibilityDelegate != null) {
                    AccessibilityDelegateCompat mo3454j = recyclerViewAccessibilityDelegate.mo3454j();
                    if (mo3454j instanceof RecyclerViewAccessibilityDelegate.ItemDelegate) {
                        RecyclerViewAccessibilityDelegate.ItemDelegate itemDelegate = (RecyclerViewAccessibilityDelegate.ItemDelegate) mo3454j;
                        Objects.requireNonNull(itemDelegate);
                        AccessibilityDelegateCompat m2205j = ViewCompat.m2205j(view);
                        if (m2205j != null && m2205j != itemDelegate) {
                            itemDelegate.f5645e.put(view, m2205j);
                        }
                    }
                    ViewCompat.m2196e0(view, mo3454j);
                }
            }
            if (RecyclerView.this.f5510i0.f5627g) {
                viewHolder.mPreLayoutPosition = i3;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:125:0x025b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:213:0x03f9  */
        /* JADX WARN: Removed duplicated region for block: B:219:0x0414  */
        /* JADX WARN: Removed duplicated region for block: B:222:0x0431  */
        /* JADX WARN: Removed duplicated region for block: B:228:0x046a  */
        /* JADX WARN: Removed duplicated region for block: B:231:0x0494 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:235:0x0478  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:241:0x0440  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01c5  */
        @androidx.annotation.Nullable
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.recyclerview.widget.RecyclerView.ViewHolder m3931l(int r18, boolean r19, long r20) {
            /*
                Method dump skipped, instructions count: 1212
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Recycler.m3931l(int, boolean, long):androidx.recyclerview.widget.RecyclerView$ViewHolder");
        }

        /* renamed from: m */
        public void m3932m(ViewHolder viewHolder) {
            if (viewHolder.mInChangeScrap) {
                this.f5596b.remove(viewHolder);
            } else {
                this.f5595a.remove(viewHolder);
            }
            viewHolder.mScrapContainer = null;
            viewHolder.mInChangeScrap = false;
            viewHolder.clearReturnedFromScrapFlag();
        }

        /* renamed from: n */
        public void m3933n() {
            LayoutManager layoutManager = RecyclerView.this.f5519n;
            this.f5600f = this.f5599e + (layoutManager != null ? layoutManager.f5573m : 0);
            for (int size = this.f5597c.size() - 1; size >= 0 && this.f5597c.size() > this.f5600f; size--) {
                m3926g(size);
            }
        }
    }

    public interface RecyclerListener {
        /* renamed from: a */
        void m3934a(@NonNull ViewHolder viewHolder);
    }

    public class RecyclerViewDataObserver extends AdapterDataObserver {
        public RecyclerViewDataObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: a */
        public void mo3410a() {
            RecyclerView.this.m3808n(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f5510i0.f5626f = true;
            recyclerView.m3799i0(true);
            if (RecyclerView.this.f5501e.m3475i()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: c */
        public void mo3412c(int i2, int i3, Object obj) {
            RecyclerView.this.m3808n(null);
            AdapterHelper adapterHelper = RecyclerView.this.f5501e;
            Objects.requireNonNull(adapterHelper);
            boolean z = false;
            if (i3 >= 1) {
                adapterHelper.f5167b.add(adapterHelper.mo3468b(4, i2, i3, obj));
                adapterHelper.f5172g |= 4;
                if (adapterHelper.f5167b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                m3935h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: d */
        public void mo3413d(int i2, int i3) {
            RecyclerView.this.m3808n(null);
            AdapterHelper adapterHelper = RecyclerView.this.f5501e;
            Objects.requireNonNull(adapterHelper);
            boolean z = false;
            if (i3 >= 1) {
                adapterHelper.f5167b.add(adapterHelper.mo3468b(1, i2, i3, null));
                adapterHelper.f5172g |= 1;
                if (adapterHelper.f5167b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                m3935h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: e */
        public void mo3414e(int i2, int i3, int i4) {
            RecyclerView.this.m3808n(null);
            AdapterHelper adapterHelper = RecyclerView.this.f5501e;
            Objects.requireNonNull(adapterHelper);
            boolean z = false;
            if (i2 != i3) {
                if (i4 != 1) {
                    throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
                }
                adapterHelper.f5167b.add(adapterHelper.mo3468b(8, i2, i3, null));
                adapterHelper.f5172g |= 8;
                if (adapterHelper.f5167b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                m3935h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: f */
        public void mo3415f(int i2, int i3) {
            RecyclerView.this.m3808n(null);
            AdapterHelper adapterHelper = RecyclerView.this.f5501e;
            Objects.requireNonNull(adapterHelper);
            boolean z = false;
            if (i3 >= 1) {
                adapterHelper.f5167b.add(adapterHelper.mo3468b(2, i2, i3, null));
                adapterHelper.f5172g |= 2;
                if (adapterHelper.f5167b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                m3935h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: g */
        public void mo3734g() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f5499d == null || (adapter = recyclerView.f5517m) == null || !adapter.canRestoreState()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        /* renamed from: h */
        public void m3935h() {
            if (RecyclerView.f5465E0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f5533u && recyclerView.f5531t) {
                    ViewCompat.m2184X(recyclerView, recyclerView.f5509i);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f5471B = true;
            recyclerView2.requestLayout();
        }
    }

    public static class SimpleOnItemTouchListener implements OnItemTouchListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        /* renamed from: a */
        public void mo3577a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        /* renamed from: c */
        public boolean mo3578c(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        /* renamed from: e */
        public void mo3579e(boolean z) {
        }
    }

    public static abstract class SmoothScroller {

        /* renamed from: b */
        public RecyclerView f5607b;

        /* renamed from: c */
        public LayoutManager f5608c;

        /* renamed from: d */
        public boolean f5609d;

        /* renamed from: e */
        public boolean f5610e;

        /* renamed from: f */
        public View f5611f;

        /* renamed from: h */
        public boolean f5613h;

        /* renamed from: a */
        public int f5606a = -1;

        /* renamed from: g */
        public final Action f5612g = new Action(0, 0);

        public static class Action {

            /* renamed from: a */
            public int f5614a;

            /* renamed from: b */
            public int f5615b;

            /* renamed from: d */
            public int f5617d = -1;

            /* renamed from: f */
            public boolean f5619f = false;

            /* renamed from: g */
            public int f5620g = 0;

            /* renamed from: c */
            public int f5616c = Integer.MIN_VALUE;

            /* renamed from: e */
            public Interpolator f5618e = null;

            public Action(@Px int i2, @Px int i3) {
                this.f5614a = i2;
                this.f5615b = i3;
            }

            /* renamed from: a */
            public void m3939a(RecyclerView recyclerView) {
                int i2 = this.f5617d;
                if (i2 >= 0) {
                    this.f5617d = -1;
                    recyclerView.m3789Y(i2);
                    this.f5619f = false;
                    return;
                }
                if (!this.f5619f) {
                    this.f5620g = 0;
                    return;
                }
                Interpolator interpolator = this.f5618e;
                if (interpolator != null && this.f5616c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                int i3 = this.f5616c;
                if (i3 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                recyclerView.f5504f0.m3945b(this.f5614a, this.f5615b, i3, interpolator);
                int i4 = this.f5620g + 1;
                this.f5620g = i4;
                if (i4 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f5619f = false;
            }

            /* renamed from: b */
            public void m3940b(@Px int i2, @Px int i3, int i4, @Nullable Interpolator interpolator) {
                this.f5614a = i2;
                this.f5615b = i3;
                this.f5616c = i4;
                this.f5618e = interpolator;
                this.f5619f = true;
            }
        }

        public interface ScrollVectorProvider {
            @Nullable
            /* renamed from: e */
            PointF mo3683e(int i2);
        }

        @Nullable
        /* renamed from: a */
        public PointF m3936a(int i2) {
            Object obj = this.f5608c;
            if (obj instanceof ScrollVectorProvider) {
                return ((ScrollVectorProvider) obj).mo3683e(i2);
            }
            StringBuilder m24u = C0000a.m24u("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            m24u.append(ScrollVectorProvider.class.getCanonicalName());
            Log.w("RecyclerView", m24u.toString());
            return null;
        }

        /* renamed from: b */
        public void m3937b(int i2, int i3) {
            PointF m3936a;
            RecyclerView recyclerView = this.f5607b;
            if (this.f5606a == -1 || recyclerView == null) {
                m3938g();
            }
            if (this.f5609d && this.f5611f == null && this.f5608c != null && (m3936a = m3936a(this.f5606a)) != null) {
                float f2 = m3936a.x;
                if (f2 != 0.0f || m3936a.y != 0.0f) {
                    recyclerView.m3816r0((int) Math.signum(f2), (int) Math.signum(m3936a.y), null);
                }
            }
            this.f5609d = false;
            View view = this.f5611f;
            if (view != null) {
                Objects.requireNonNull(this.f5607b);
                ViewHolder m3759R = RecyclerView.m3759R(view);
                if ((m3759R != null ? m3759R.getLayoutPosition() : -1) == this.f5606a) {
                    mo3719f(this.f5611f, recyclerView.f5510i0, this.f5612g);
                    this.f5612g.m3939a(recyclerView);
                    m3938g();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f5611f = null;
                }
            }
            if (this.f5610e) {
                mo3716c(i2, i3, recyclerView.f5510i0, this.f5612g);
                Action action = this.f5612g;
                boolean z = action.f5617d >= 0;
                action.m3939a(recyclerView);
                if (z && this.f5610e) {
                    this.f5609d = true;
                    recyclerView.f5504f0.m3944a();
                }
            }
        }

        /* renamed from: c */
        public abstract void mo3716c(@Px int i2, @Px int i3, @NonNull State state, @NonNull Action action);

        /* renamed from: d */
        public abstract void mo3717d();

        /* renamed from: e */
        public abstract void mo3718e();

        /* renamed from: f */
        public abstract void mo3719f(@NonNull View view, @NonNull State state, @NonNull Action action);

        /* renamed from: g */
        public final void m3938g() {
            if (this.f5610e) {
                this.f5610e = false;
                mo3718e();
                this.f5607b.f5510i0.f5621a = -1;
                this.f5611f = null;
                this.f5606a = -1;
                this.f5609d = false;
                LayoutManager layoutManager = this.f5608c;
                if (layoutManager.f5568h == this) {
                    layoutManager.f5568h = null;
                }
                this.f5608c = null;
                this.f5607b = null;
            }
        }
    }

    public static class State {

        /* renamed from: a */
        public int f5621a = -1;

        /* renamed from: b */
        public int f5622b = 0;

        /* renamed from: c */
        public int f5623c = 0;

        /* renamed from: d */
        public int f5624d = 1;

        /* renamed from: e */
        public int f5625e = 0;

        /* renamed from: f */
        public boolean f5626f = false;

        /* renamed from: g */
        public boolean f5627g = false;

        /* renamed from: h */
        public boolean f5628h = false;

        /* renamed from: i */
        public boolean f5629i = false;

        /* renamed from: j */
        public boolean f5630j = false;

        /* renamed from: k */
        public boolean f5631k = false;

        /* renamed from: l */
        public int f5632l;

        /* renamed from: m */
        public long f5633m;

        /* renamed from: n */
        public int f5634n;

        /* renamed from: a */
        public void m3941a(int i2) {
            if ((this.f5624d & i2) != 0) {
                return;
            }
            StringBuilder m24u = C0000a.m24u("Layout state should be one of ");
            m24u.append(Integer.toBinaryString(i2));
            m24u.append(" but it is ");
            m24u.append(Integer.toBinaryString(this.f5624d));
            throw new IllegalStateException(m24u.toString());
        }

        /* renamed from: b */
        public int m3942b() {
            return this.f5627g ? this.f5622b - this.f5623c : this.f5625e;
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("State{mTargetPosition=");
            m24u.append(this.f5621a);
            m24u.append(", mData=");
            m24u.append((Object) null);
            m24u.append(", mItemCount=");
            m24u.append(this.f5625e);
            m24u.append(", mIsMeasuring=");
            m24u.append(this.f5629i);
            m24u.append(", mPreviousLayoutItemCount=");
            m24u.append(this.f5622b);
            m24u.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            m24u.append(this.f5623c);
            m24u.append(", mStructureChanged=");
            m24u.append(this.f5626f);
            m24u.append(", mInPreLayout=");
            m24u.append(this.f5627g);
            m24u.append(", mRunSimpleAnimations=");
            m24u.append(this.f5630j);
            m24u.append(", mRunPredictiveAnimations=");
            m24u.append(this.f5631k);
            m24u.append('}');
            return m24u.toString();
        }
    }

    public static abstract class ViewCacheExtension {
        @Nullable
        /* renamed from: a */
        public abstract View m3943a(@NonNull Recycler recycler, int i2, int i3);
    }

    public class ViewFlinger implements Runnable {

        /* renamed from: b */
        public int f5635b;

        /* renamed from: c */
        public int f5636c;

        /* renamed from: d */
        public OverScroller f5637d;

        /* renamed from: e */
        public Interpolator f5638e;

        /* renamed from: f */
        public boolean f5639f;

        /* renamed from: g */
        public boolean f5640g;

        public ViewFlinger() {
            Interpolator interpolator = RecyclerView.f5468H0;
            this.f5638e = interpolator;
            this.f5639f = false;
            this.f5640g = false;
            this.f5637d = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        public void m3944a() {
            if (this.f5639f) {
                this.f5640g = true;
            } else {
                RecyclerView.this.removeCallbacks(this);
                ViewCompat.m2184X(RecyclerView.this, this);
            }
        }

        /* renamed from: b */
        public void m3945b(int i2, int i3, int i4, @Nullable Interpolator interpolator) {
            if (i4 == Integer.MIN_VALUE) {
                int abs = Math.abs(i2);
                int abs2 = Math.abs(i3);
                boolean z = abs > abs2;
                RecyclerView recyclerView = RecyclerView.this;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z) {
                    abs = abs2;
                }
                i4 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
            }
            int i5 = i4;
            if (interpolator == null) {
                interpolator = RecyclerView.f5468H0;
            }
            if (this.f5638e != interpolator) {
                this.f5638e = interpolator;
                this.f5637d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f5636c = 0;
            this.f5635b = 0;
            RecyclerView.this.setScrollState(2);
            this.f5637d.startScroll(0, 0, i2, i3, i5);
            if (Build.VERSION.SDK_INT < 23) {
                this.f5637d.computeScrollOffset();
            }
            m3944a();
        }

        /* renamed from: c */
        public void m3946c() {
            RecyclerView.this.removeCallbacks(this);
            this.f5637d.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f5519n == null) {
                m3946c();
                return;
            }
            this.f5640g = false;
            this.f5639f = true;
            recyclerView.m3817s();
            OverScroller overScroller = this.f5637d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f5635b;
                int i5 = currY - this.f5636c;
                this.f5635b = currX;
                this.f5636c = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f5536v0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.m3829y(i4, i5, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f5536v0;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.m3815r(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f5517m != null) {
                    int[] iArr3 = recyclerView3.f5536v0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.m3816r0(i4, i5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f5536v0;
                    i3 = iArr4[0];
                    i2 = iArr4[1];
                    i4 -= i3;
                    i5 -= i2;
                    SmoothScroller smoothScroller = recyclerView4.f5519n.f5568h;
                    if (smoothScroller != null && !smoothScroller.f5609d && smoothScroller.f5610e) {
                        int m3942b = recyclerView4.f5510i0.m3942b();
                        if (m3942b == 0) {
                            smoothScroller.m3938g();
                        } else if (smoothScroller.f5606a >= m3942b) {
                            smoothScroller.f5606a = m3942b - 1;
                            smoothScroller.m3937b(i3, i2);
                        } else {
                            smoothScroller.m3937b(i3, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i3 = 0;
                }
                if (!RecyclerView.this.f5525q.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f5536v0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.m3831z(i3, i2, i4, i5, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f5536v0;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (i3 != 0 || i2 != 0) {
                    recyclerView6.m3766A(i3, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
                RecyclerView recyclerView7 = RecyclerView.this;
                SmoothScroller smoothScroller2 = recyclerView7.f5519n.f5568h;
                if ((smoothScroller2 != null && smoothScroller2.f5609d) || !z) {
                    m3944a();
                    RecyclerView recyclerView8 = RecyclerView.this;
                    GapWorker gapWorker = recyclerView8.f5506g0;
                    if (gapWorker != null) {
                        gapWorker.m3587a(recyclerView8, i3, i2);
                    }
                } else {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i8 = i6 < 0 ? -currVelocity : i6 > 0 ? currVelocity : 0;
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView recyclerView9 = RecyclerView.this;
                        Objects.requireNonNull(recyclerView9);
                        if (i8 < 0) {
                            recyclerView9.m3770C();
                            if (recyclerView9.f5480J.isFinished()) {
                                recyclerView9.f5480J.onAbsorb(-i8);
                            }
                        } else if (i8 > 0) {
                            recyclerView9.m3771D();
                            if (recyclerView9.f5482L.isFinished()) {
                                recyclerView9.f5482L.onAbsorb(i8);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView9.m3772E();
                            if (recyclerView9.f5481K.isFinished()) {
                                recyclerView9.f5481K.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView9.m3768B();
                            if (recyclerView9.f5483M.isFinished()) {
                                recyclerView9.f5483M.onAbsorb(currVelocity);
                            }
                        }
                        if (i8 != 0 || currVelocity != 0) {
                            ViewCompat.m2183W(recyclerView9);
                        }
                    }
                    if (RecyclerView.f5466F0) {
                        GapWorker.LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = RecyclerView.this.f5508h0;
                        int[] iArr7 = layoutPrefetchRegistryImpl.f5319c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        layoutPrefetchRegistryImpl.f5320d = 0;
                    }
                }
            }
            SmoothScroller smoothScroller3 = RecyclerView.this.f5519n.f5568h;
            if (smoothScroller3 != null && smoothScroller3.f5609d) {
                smoothScroller3.m3937b(0, 0);
            }
            this.f5639f = false;
            if (this.f5640g) {
                RecyclerView.this.removeCallbacks(this);
                ViewCompat.m2184X(RecyclerView.this, this);
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.m3767A0(1);
            }
        }
    }

    public static abstract class ViewHolder {
        public static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        public static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        public static final int FLAG_BOUND = 1;
        public static final int FLAG_IGNORE = 128;
        public static final int FLAG_INVALID = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_NOT_RECYCLABLE = 16;
        public static final int FLAG_REMOVED = 8;
        public static final int FLAG_RETURNED_FROM_SCRAP = 32;
        public static final int FLAG_TMP_DETACHED = 256;
        public static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        public static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

        @NonNull
        public final View itemView;
        public Adapter<? extends ViewHolder> mBindingAdapter;
        public int mFlags;
        public WeakReference<RecyclerView> mNestedRecyclerView;
        public RecyclerView mOwnerRecyclerView;
        public int mPosition = -1;
        public int mOldPosition = -1;
        public long mItemId = -1;
        public int mItemViewType = -1;
        public int mPreLayoutPosition = -1;
        public ViewHolder mShadowedHolder = null;
        public ViewHolder mShadowingHolder = null;
        public List<Object> mPayloads = null;
        public List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        public Recycler mScrapContainer = null;
        public boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        @VisibleForTesting
        public int mPendingAccessibilityState = -1;

        public ViewHolder(@NonNull View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(FLAG_ADAPTER_FULLUPDATE);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i2) {
            this.mFlags = i2 | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && ViewCompat.m2172L(this.itemView);
        }

        public void flagRemovedAndOffsetPosition(int i2, int i3, boolean z) {
            addFlags(8);
            offsetPosition(i3, z);
            this.mPosition = i2;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.m3780N(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        @Nullable
        public final Adapter<? extends ViewHolder> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int m3780N;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (m3780N = this.mOwnerRecyclerView.m3780N(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, m3780N);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i2 = this.mPreLayoutPosition;
            return i2 == -1 ? this.mPosition : i2;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i2 = this.mPreLayoutPosition;
            return i2 == -1 ? this.mPosition : i2;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & FLAG_ADAPTER_FULLUPDATE) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i2) {
            return (i2 & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & FLAG_ADAPTER_POSITION_UNKNOWN) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !ViewCompat.m2172L(this.itemView);
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i2, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i2;
            }
            this.mPosition += i2;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).f5587c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i2 = this.mPendingAccessibilityState;
            if (i2 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i2;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = ViewCompat.m2227u(this.itemView);
            }
            recyclerView.m3822u0(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.m3822u0(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.m3765p(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i2, int i3) {
            this.mFlags = (i2 & i3) | (this.mFlags & (~i3));
        }

        public final void setIsRecyclable(boolean z) {
            int i2 = this.mIsRecyclableCount;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.mIsRecyclableCount = i3;
            if (i3 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i3 == 1) {
                this.mFlags |= 16;
            } else if (z && i3 == 0) {
                this.mFlags &= -17;
            }
        }

        public void setScrapContainer(Recycler recycler, boolean z) {
            this.mScrapContainer = recycler;
            this.mInChangeScrap = z;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder m27x = C0000a.m27x(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            m27x.append(Integer.toHexString(hashCode()));
            m27x.append(" position=");
            m27x.append(this.mPosition);
            m27x.append(" id=");
            m27x.append(this.mItemId);
            m27x.append(", oldPos=");
            m27x.append(this.mOldPosition);
            m27x.append(", pLpos:");
            m27x.append(this.mPreLayoutPosition);
            StringBuilder sb = new StringBuilder(m27x.toString());
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                StringBuilder m24u = C0000a.m24u(" not recyclable(");
                m24u.append(this.mIsRecyclableCount);
                m24u.append(")");
                sb.append(m24u.toString());
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.m3932m(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    static {
        f5464D0 = Build.VERSION.SDK_INT >= 23;
        f5465E0 = true;
        f5466F0 = true;
        Class<?> cls = Integer.TYPE;
        f5467G0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f5468H0 = new Interpolator() { // from class: androidx.recyclerview.widget.RecyclerView.3
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f2) {
                float f3 = f2 - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
            }
        };
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C2507R.attr.recyclerViewStyle);
    }

    @Nullable
    /* renamed from: K */
    public static RecyclerView m3758K(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView m3758K = m3758K(viewGroup.getChildAt(i2));
            if (m3758K != null) {
                return m3758K;
            }
        }
        return null;
    }

    /* renamed from: R */
    public static ViewHolder m3759R(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f5585a;
    }

    /* renamed from: S */
    public static void m3760S(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f5586b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    private NestedScrollingChildHelper getScrollingChildHelper() {
        if (this.f5530s0 == null) {
            this.f5530s0 = new NestedScrollingChildHelper(this);
        }
        return this.f5530s0;
    }

    /* renamed from: p */
    public static void m3765p(@NonNull ViewHolder viewHolder) {
        WeakReference<RecyclerView> weakReference = viewHolder.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == viewHolder.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            viewHolder.mNestedRecyclerView = null;
        }
    }

    /* renamed from: A */
    public void m3766A(int i2, int i3) {
        this.f5478H++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        OnScrollListener onScrollListener = this.f5512j0;
        if (onScrollListener != null) {
            onScrollListener.mo3586c(this, i2, i3);
        }
        List<OnScrollListener> list = this.f5514k0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f5514k0.get(size).mo3586c(this, i2, i3);
            }
        }
        this.f5478H--;
    }

    /* renamed from: A0 */
    public void m3767A0(int i2) {
        getScrollingChildHelper().m2145k(i2);
    }

    /* renamed from: B */
    public void m3768B() {
        if (this.f5483M != null) {
            return;
        }
        EdgeEffect m3845a = this.f5479I.m3845a(this);
        this.f5483M = m3845a;
        if (this.f5507h) {
            m3845a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            m3845a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: B0 */
    public void m3769B0() {
        SmoothScroller smoothScroller;
        setScrollState(0);
        this.f5504f0.m3946c();
        LayoutManager layoutManager = this.f5519n;
        if (layoutManager == null || (smoothScroller = layoutManager.f5568h) == null) {
            return;
        }
        smoothScroller.m3938g();
    }

    /* renamed from: C */
    public void m3770C() {
        if (this.f5480J != null) {
            return;
        }
        EdgeEffect m3845a = this.f5479I.m3845a(this);
        this.f5480J = m3845a;
        if (this.f5507h) {
            m3845a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            m3845a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: D */
    public void m3771D() {
        if (this.f5482L != null) {
            return;
        }
        EdgeEffect m3845a = this.f5479I.m3845a(this);
        this.f5482L = m3845a;
        if (this.f5507h) {
            m3845a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            m3845a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: E */
    public void m3772E() {
        if (this.f5481K != null) {
            return;
        }
        EdgeEffect m3845a = this.f5479I.m3845a(this);
        this.f5481K = m3845a;
        if (this.f5507h) {
            m3845a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            m3845a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: F */
    public String m3773F() {
        StringBuilder m24u = C0000a.m24u(" ");
        m24u.append(super.toString());
        m24u.append(", adapter:");
        m24u.append(this.f5517m);
        m24u.append(", layout:");
        m24u.append(this.f5519n);
        m24u.append(", context:");
        m24u.append(getContext());
        return m24u.toString();
    }

    /* renamed from: G */
    public final void m3774G(State state) {
        if (getScrollState() != 2) {
            Objects.requireNonNull(state);
            return;
        }
        OverScroller overScroller = this.f5504f0.f5637d;
        overScroller.getFinalX();
        overScroller.getCurrX();
        Objects.requireNonNull(state);
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    @androidx.annotation.Nullable
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View m3775H(@androidx.annotation.NonNull android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m3775H(android.view.View):android.view.View");
    }

    /* renamed from: I */
    public final boolean m3776I(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f5527r.size();
        for (int i2 = 0; i2 < size; i2++) {
            OnItemTouchListener onItemTouchListener = this.f5527r.get(i2);
            if (onItemTouchListener.mo3578c(this, motionEvent) && action != 3) {
                this.f5529s = onItemTouchListener;
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public final void m3777J(int[] iArr) {
        int m3497d = this.f5503f.m3497d();
        if (m3497d == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < m3497d; i4++) {
            ViewHolder m3759R = m3759R(this.f5503f.m3496c(i4));
            if (!m3759R.shouldIgnore()) {
                int layoutPosition = m3759R.getLayoutPosition();
                if (layoutPosition < i2) {
                    i2 = layoutPosition;
                }
                if (layoutPosition > i3) {
                    i3 = layoutPosition;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    @Nullable
    /* renamed from: L */
    public ViewHolder m3778L(int i2) {
        ViewHolder viewHolder = null;
        if (this.f5475E) {
            return null;
        }
        int m3500g = this.f5503f.m3500g();
        for (int i3 = 0; i3 < m3500g; i3++) {
            ViewHolder m3759R = m3759R(this.f5503f.m3499f(i3));
            if (m3759R != null && !m3759R.isRemoved() && m3780N(m3759R) == i2) {
                if (!this.f5503f.m3502i(m3759R.itemView)) {
                    return m3759R;
                }
                viewHolder = m3759R;
            }
        }
        return viewHolder;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    @androidx.annotation.Nullable
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.recyclerview.widget.RecyclerView.ViewHolder m3779M(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r5.f5503f
            int r0 = r0.m3500g()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.ChildHelper r3 = r5.f5503f
            android.view.View r3 = r3.m3499f(r2)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = m3759R(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.ChildHelper r1 = r5.f5503f
            android.view.View r4 = r3.itemView
            boolean r1 = r1.m3502i(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m3779M(int, boolean):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    /* renamed from: N */
    public int m3780N(ViewHolder viewHolder) {
        if (!viewHolder.hasAnyOfTheFlags(524) && viewHolder.isBound()) {
            AdapterHelper adapterHelper = this.f5501e;
            int i2 = viewHolder.mPosition;
            int size = adapterHelper.f5167b.size();
            for (int i3 = 0; i3 < size; i3++) {
                AdapterHelper.UpdateOp updateOp = adapterHelper.f5167b.get(i3);
                int i4 = updateOp.f5173a;
                if (i4 != 1) {
                    if (i4 == 2) {
                        int i5 = updateOp.f5174b;
                        if (i5 <= i2) {
                            int i6 = updateOp.f5176d;
                            if (i5 + i6 <= i2) {
                                i2 -= i6;
                            }
                        } else {
                            continue;
                        }
                    } else if (i4 == 8) {
                        int i7 = updateOp.f5174b;
                        if (i7 == i2) {
                            i2 = updateOp.f5176d;
                        } else {
                            if (i7 < i2) {
                                i2--;
                            }
                            if (updateOp.f5176d <= i2) {
                                i2++;
                            }
                        }
                    }
                } else if (updateOp.f5174b <= i2) {
                    i2 += updateOp.f5176d;
                }
            }
            return i2;
        }
        return -1;
    }

    /* renamed from: O */
    public long m3781O(ViewHolder viewHolder) {
        return this.f5517m.hasStableIds() ? viewHolder.getItemId() : viewHolder.mPosition;
    }

    /* renamed from: P */
    public int m3782P(@NonNull View view) {
        ViewHolder m3759R = m3759R(view);
        if (m3759R != null) {
            return m3759R.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    /* renamed from: Q */
    public ViewHolder m3783Q(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m3759R(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: T */
    public Rect m3784T(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f5587c) {
            return layoutParams.f5586b;
        }
        if (this.f5510i0.f5627g && (layoutParams.m3911b() || layoutParams.f5585a.isInvalid())) {
            return layoutParams.f5586b;
        }
        Rect rect = layoutParams.f5586b;
        rect.set(0, 0, 0, 0);
        int size = this.f5525q.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f5511j.set(0, 0, 0, 0);
            this.f5525q.get(i2).mo3404f(this.f5511j, view, this, this.f5510i0);
            int i3 = rect.left;
            Rect rect2 = this.f5511j;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.f5587c = false;
        return rect;
    }

    /* renamed from: U */
    public boolean m3785U() {
        return !this.f5535v || this.f5475E || this.f5501e.m3475i();
    }

    /* renamed from: V */
    public void m3786V() {
        this.f5483M = null;
        this.f5481K = null;
        this.f5482L = null;
        this.f5480J = null;
    }

    /* renamed from: W */
    public void m3787W() {
        if (this.f5525q.size() == 0) {
            return;
        }
        LayoutManager layoutManager = this.f5519n;
        if (layoutManager != null) {
            layoutManager.mo3696s("Cannot invalidate item decorations during a scroll or layout");
        }
        m3790Z();
        requestLayout();
    }

    /* renamed from: X */
    public boolean m3788X() {
        return this.f5477G > 0;
    }

    /* renamed from: Y */
    public void m3789Y(int i2) {
        if (this.f5519n == null) {
            return;
        }
        setScrollState(2);
        this.f5519n.mo3680T0(i2);
        awakenScrollBars();
    }

    /* renamed from: Z */
    public void m3790Z() {
        int m3500g = this.f5503f.m3500g();
        for (int i2 = 0; i2 < m3500g; i2++) {
            ((LayoutParams) this.f5503f.m3499f(i2).getLayoutParams()).f5587c = true;
        }
        Recycler recycler = this.f5497c;
        int size = recycler.f5597c.size();
        for (int i3 = 0; i3 < size; i3++) {
            LayoutParams layoutParams = (LayoutParams) recycler.f5597c.get(i3).itemView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.f5587c = true;
            }
        }
    }

    /* renamed from: a0 */
    public void m3791a0(int i2, int i3, boolean z) {
        int i4 = i2 + i3;
        int m3500g = this.f5503f.m3500g();
        for (int i5 = 0; i5 < m3500g; i5++) {
            ViewHolder m3759R = m3759R(this.f5503f.m3499f(i5));
            if (m3759R != null && !m3759R.shouldIgnore()) {
                int i6 = m3759R.mPosition;
                if (i6 >= i4) {
                    m3759R.offsetPosition(-i3, z);
                    this.f5510i0.f5626f = true;
                } else if (i6 >= i2) {
                    m3759R.flagRemovedAndOffsetPosition(i2 - 1, -i3, z);
                    this.f5510i0.f5626f = true;
                }
            }
        }
        Recycler recycler = this.f5497c;
        int size = recycler.f5597c.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            ViewHolder viewHolder = recycler.f5597c.get(size);
            if (viewHolder != null) {
                int i7 = viewHolder.mPosition;
                if (i7 >= i4) {
                    viewHolder.offsetPosition(-i3, z);
                } else if (i7 >= i2) {
                    viewHolder.addFlags(8);
                    recycler.m3926g(size);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        LayoutManager layoutManager = this.f5519n;
        if (layoutManager != null) {
            Objects.requireNonNull(layoutManager);
        }
        super.addFocusables(arrayList, i2, i3);
    }

    /* renamed from: b0 */
    public void mo3792b0(@NonNull View view) {
    }

    /* renamed from: c0 */
    public void mo3793c0(@NonNull View view) {
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.f5519n.mo3575x((LayoutParams) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        LayoutManager layoutManager = this.f5519n;
        if (layoutManager != null && layoutManager.mo3700v()) {
            return this.f5519n.mo3665B(this.f5510i0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        LayoutManager layoutManager = this.f5519n;
        if (layoutManager != null && layoutManager.mo3700v()) {
            return this.f5519n.mo3596C(this.f5510i0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        LayoutManager layoutManager = this.f5519n;
        if (layoutManager != null && layoutManager.mo3700v()) {
            return this.f5519n.mo3599D(this.f5510i0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        LayoutManager layoutManager = this.f5519n;
        if (layoutManager != null && layoutManager.mo3701w()) {
            return this.f5519n.mo3667E(this.f5510i0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        LayoutManager layoutManager = this.f5519n;
        if (layoutManager != null && layoutManager.mo3701w()) {
            return this.f5519n.mo3602F(this.f5510i0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        LayoutManager layoutManager = this.f5519n;
        if (layoutManager != null && layoutManager.mo3701w()) {
            return this.f5519n.mo3604G(this.f5510i0);
        }
        return 0;
    }

    /* renamed from: d0 */
    public void m3794d0() {
        this.f5477G++;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return getScrollingChildHelper().m2135a(f2, f3, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().m2136b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m2137c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().m2139e(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.f5525q.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.f5525q.get(i2).mo3405h(canvas, this, this.f5510i0);
        }
        EdgeEffect edgeEffect = this.f5480J;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f5507h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f5480J;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f5481K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f5507h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f5481K;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f5482L;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f5507h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f5482L;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f5483M;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f5507h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f5483M;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if ((z || this.f5484N == null || this.f5525q.size() <= 0 || !this.f5484N.mo3526l()) ? z : true) {
            ViewCompat.m2183W(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    /* renamed from: e0 */
    public void m3795e0(boolean z) {
        int i2;
        int i3 = this.f5477G - 1;
        this.f5477G = i3;
        if (i3 < 1) {
            this.f5477G = 0;
            if (z) {
                int i4 = this.f5469A;
                this.f5469A = 0;
                if (i4 != 0) {
                    AccessibilityManager accessibilityManager = this.f5473C;
                    if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(ViewHolder.FLAG_MOVED);
                        AccessibilityEventCompat.m2484b(obtain, i4);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                for (int size = this.f5538w0.size() - 1; size >= 0; size--) {
                    ViewHolder viewHolder = this.f5538w0.get(size);
                    if (viewHolder.itemView.getParent() == this && !viewHolder.shouldIgnore() && (i2 = viewHolder.mPendingAccessibilityState) != -1) {
                        ViewCompat.m2216o0(viewHolder.itemView, i2);
                        viewHolder.mPendingAccessibilityState = -1;
                    }
                }
                this.f5538w0.clear();
            }
        }
    }

    /* renamed from: f0 */
    public final void m3796f0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5486P) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f5486P = motionEvent.getPointerId(i2);
            int x = (int) (motionEvent.getX(i2) + 0.5f);
            this.f5490T = x;
            this.f5488R = x;
            int y = (int) (motionEvent.getY(i2) + 0.5f);
            this.f5491U = y;
            this.f5489S = y;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0199, code lost:
    
        if ((r6 * r1) >= 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0167, code lost:
    
        if (r3 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0181, code lost:
    
        if (r6 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0184, code lost:
    
        if (r3 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0187, code lost:
    
        if (r6 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0190, code lost:
    
        if ((r6 * r1) <= 0) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* renamed from: g0 */
    public void m3797g0() {
        if (this.f5522o0 || !this.f5531t) {
            return;
        }
        ViewCompat.m2184X(this, this.f5540x0);
        this.f5522o0 = true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutManager layoutManager = this.f5519n;
        if (layoutManager != null) {
            return layoutManager.mo3551M();
        }
        throw new IllegalStateException(C0000a.m6c(this, C0000a.m24u("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LayoutManager layoutManager = this.f5519n;
        if (layoutManager != null) {
            return layoutManager.mo3552N(getContext(), attributeSet);
        }
        throw new IllegalStateException(C0000a.m6c(this, C0000a.m24u("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Nullable
    public Adapter getAdapter() {
        return this.f5517m;
    }

    @Override // android.view.View
    public int getBaseline() {
        LayoutManager layoutManager = this.f5519n;
        if (layoutManager == null) {
            return super.getBaseline();
        }
        Objects.requireNonNull(layoutManager);
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        ChildDrawingOrderCallback childDrawingOrderCallback = this.f5526q0;
        return childDrawingOrderCallback == null ? super.getChildDrawingOrder(i2, i3) : childDrawingOrderCallback.mo3645a(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f5507h;
    }

    @Nullable
    public RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() {
        return this.f5524p0;
    }

    @NonNull
    public EdgeEffectFactory getEdgeEffectFactory() {
        return this.f5479I;
    }

    @Nullable
    public ItemAnimator getItemAnimator() {
        return this.f5484N;
    }

    public int getItemDecorationCount() {
        return this.f5525q.size();
    }

    @Nullable
    public LayoutManager getLayoutManager() {
        return this.f5519n;
    }

    public int getMaxFlingVelocity() {
        return this.f5496b0;
    }

    public int getMinFlingVelocity() {
        return this.f5494a0;
    }

    long getNanoTime() {
        if (f5466F0) {
            return System.nanoTime();
        }
        return 0L;
    }

    @Nullable
    public OnFlingListener getOnFlingListener() {
        return this.f5493W;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f5502e0;
    }

    @NonNull
    public RecycledViewPool getRecycledViewPool() {
        return this.f5497c.m3923d();
    }

    public int getScrollState() {
        return this.f5485O;
    }

    /* renamed from: h0 */
    public final void m3798h0() {
        boolean z;
        boolean z2 = false;
        if (this.f5475E) {
            AdapterHelper adapterHelper = this.f5501e;
            adapterHelper.m3478l(adapterHelper.f5167b);
            adapterHelper.m3478l(adapterHelper.f5168c);
            adapterHelper.f5172g = 0;
            if (this.f5476F) {
                this.f5519n.mo3594B0(this);
            }
        }
        if (this.f5484N != null && this.f5519n.mo3620f1()) {
            this.f5501e.m3477k();
        } else {
            this.f5501e.m3471e();
        }
        boolean z3 = this.f5516l0 || this.f5518m0;
        this.f5510i0.f5630j = this.f5535v && this.f5484N != null && ((z = this.f5475E) || z3 || this.f5519n.f5569i) && (!z || this.f5517m.hasStableIds());
        State state = this.f5510i0;
        if (state.f5630j && z3 && !this.f5475E) {
            if (this.f5484N != null && this.f5519n.mo3620f1()) {
                z2 = true;
            }
        }
        state.f5631k = z2;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m2142h(0);
    }

    /* renamed from: i0 */
    public void m3799i0(boolean z) {
        this.f5476F = z | this.f5476F;
        this.f5475E = true;
        int m3500g = this.f5503f.m3500g();
        for (int i2 = 0; i2 < m3500g; i2++) {
            ViewHolder m3759R = m3759R(this.f5503f.m3499f(i2));
            if (m3759R != null && !m3759R.shouldIgnore()) {
                m3759R.addFlags(6);
            }
        }
        m3790Z();
        Recycler recycler = this.f5497c;
        int size = recycler.f5597c.size();
        for (int i3 = 0; i3 < size; i3++) {
            ViewHolder viewHolder = recycler.f5597c.get(i3);
            if (viewHolder != null) {
                viewHolder.addFlags(6);
                viewHolder.addChangePayload(null);
            }
        }
        Adapter adapter = RecyclerView.this.f5517m;
        if (adapter == null || !adapter.hasStableIds()) {
            recycler.m3925f();
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f5531t;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f5541y;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f3630d;
    }

    /* renamed from: j */
    public final void m3800j(ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        boolean z = view.getParent() == this;
        this.f5497c.m3932m(m3783Q(view));
        if (viewHolder.isTmpDetached()) {
            this.f5503f.m3495b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.f5503f.m3494a(view, -1, true);
            return;
        }
        ChildHelper childHelper = this.f5503f;
        int mo3516e = childHelper.f5186a.mo3516e(view);
        if (mo3516e >= 0) {
            childHelper.f5187b.m3511h(mo3516e);
            childHelper.f5188c.add(view);
            childHelper.f5186a.mo3513b(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* renamed from: j0 */
    public void m3801j0(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo) {
        viewHolder.setFlags(0, ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST);
        if (this.f5510i0.f5628h && viewHolder.isUpdated() && !viewHolder.isRemoved() && !viewHolder.shouldIgnore()) {
            this.f5505g.f5715b.m1098m(m3781O(viewHolder), viewHolder);
        }
        this.f5505g.m4019c(viewHolder, itemHolderInfo);
    }

    /* renamed from: k */
    public void mo3802k(@NonNull ItemDecoration itemDecoration) {
        LayoutManager layoutManager = this.f5519n;
        if (layoutManager != null) {
            layoutManager.mo3696s("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f5525q.isEmpty()) {
            setWillNotDraw(false);
        }
        this.f5525q.add(itemDecoration);
        m3790Z();
        requestLayout();
    }

    /* renamed from: k0 */
    public void m3803k0() {
        ItemAnimator itemAnimator = this.f5484N;
        if (itemAnimator != null) {
            itemAnimator.mo3525k();
        }
        LayoutManager layoutManager = this.f5519n;
        if (layoutManager != null) {
            layoutManager.mo3550L0(this.f5497c);
            this.f5519n.m3866M0(this.f5497c);
        }
        this.f5497c.m3921b();
    }

    /* renamed from: l */
    public void m3804l(@NonNull OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        if (this.f5474D == null) {
            this.f5474D = new ArrayList();
        }
        this.f5474D.add(onChildAttachStateChangeListener);
    }

    /* renamed from: l0 */
    public void m3805l0(@NonNull ItemDecoration itemDecoration) {
        LayoutManager layoutManager = this.f5519n;
        if (layoutManager != null) {
            layoutManager.mo3696s("Cannot remove item decoration during a scroll  or layout");
        }
        this.f5525q.remove(itemDecoration);
        if (this.f5525q.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m3790Z();
        requestLayout();
    }

    /* renamed from: m */
    public void m3806m(@NonNull OnScrollListener onScrollListener) {
        if (this.f5514k0 == null) {
            this.f5514k0 = new ArrayList();
        }
        this.f5514k0.add(onScrollListener);
    }

    /* renamed from: m0 */
    public void m3807m0(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 < 0 || i2 >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
        }
        int itemDecorationCount2 = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount2) {
            m3805l0(this.f5525q.get(i2));
            return;
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount2);
    }

    /* renamed from: n */
    public void m3808n(String str) {
        if (m3788X()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(C0000a.m6c(this, C0000a.m24u("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f5478H > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(C0000a.m6c(this, C0000a.m24u(""))));
        }
    }

    /* renamed from: n0 */
    public void m3809n0(@NonNull OnScrollListener onScrollListener) {
        List<OnScrollListener> list = this.f5514k0;
        if (list != null) {
            list.remove(onScrollListener);
        }
    }

    /* renamed from: o */
    public final void m3810o() {
        m3812p0();
        setScrollState(0);
    }

    /* renamed from: o0 */
    public final void m3811o0(@NonNull View view, @Nullable View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f5511j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f5587c) {
                Rect rect = layoutParams2.f5586b;
                Rect rect2 = this.f5511j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f5511j);
            offsetRectIntoDescendantCoords(view, this.f5511j);
        }
        this.f5519n.mo3870Q0(this, view, this.f5511j, !this.f5535v, view2 == null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5477G = 0;
        this.f5531t = true;
        this.f5535v = this.f5535v && !isLayoutRequested();
        LayoutManager layoutManager = this.f5519n;
        if (layoutManager != null) {
            layoutManager.f5570j = true;
            layoutManager.mo3573t0(this);
        }
        this.f5522o0 = false;
        if (f5466F0) {
            ThreadLocal<GapWorker> threadLocal = GapWorker.f5311f;
            GapWorker gapWorker = threadLocal.get();
            this.f5506g0 = gapWorker;
            if (gapWorker == null) {
                this.f5506g0 = new GapWorker();
                Display m2219q = ViewCompat.m2219q(this);
                float f2 = 60.0f;
                if (!isInEditMode() && m2219q != null) {
                    float refreshRate = m2219q.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                GapWorker gapWorker2 = this.f5506g0;
                gapWorker2.f5315d = (long) (1.0E9f / f2);
                threadLocal.set(gapWorker2);
            }
            this.f5506g0.f5313b.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        GapWorker gapWorker;
        super.onDetachedFromWindow();
        ItemAnimator itemAnimator = this.f5484N;
        if (itemAnimator != null) {
            itemAnimator.mo3525k();
        }
        m3769B0();
        this.f5531t = false;
        LayoutManager layoutManager = this.f5519n;
        if (layoutManager != null) {
            Recycler recycler = this.f5497c;
            layoutManager.f5570j = false;
            layoutManager.mo3574u0(this, recycler);
        }
        this.f5538w0.clear();
        removeCallbacks(this.f5540x0);
        Objects.requireNonNull(this.f5505g);
        while (((Pools.SimplePool) ViewInfoStore.InfoRecord.f5716d).mo2027b() != null) {
        }
        if (!f5466F0 || (gapWorker = this.f5506g0) == null) {
            return;
        }
        gapWorker.f5313b.remove(this);
        this.f5506g0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f5525q.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f5525q.get(i2).mo3576g(canvas, this, this.f5510i0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f5541y) {
            return false;
        }
        this.f5529s = null;
        if (m3776I(motionEvent)) {
            m3810o();
            return true;
        }
        LayoutManager layoutManager = this.f5519n;
        if (layoutManager == null) {
            return false;
        }
        boolean mo3700v = layoutManager.mo3700v();
        boolean mo3701w = this.f5519n.mo3701w();
        if (this.f5487Q == null) {
            this.f5487Q = VelocityTracker.obtain();
        }
        this.f5487Q.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f5543z) {
                this.f5543z = false;
            }
            this.f5486P = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f5490T = x;
            this.f5488R = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f5491U = y;
            this.f5489S = y;
            if (this.f5485O == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                m3767A0(1);
            }
            int[] iArr = this.f5534u0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = mo3700v;
            if (mo3701w) {
                i2 = (mo3700v ? 1 : 0) | 2;
            }
            m3830y0(i2, 0);
        } else if (actionMasked == 1) {
            this.f5487Q.clear();
            m3767A0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f5486P);
            if (findPointerIndex < 0) {
                StringBuilder m24u = C0000a.m24u("Error processing scroll; pointer index for id ");
                m24u.append(this.f5486P);
                m24u.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", m24u.toString());
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f5485O != 1) {
                int i3 = x2 - this.f5488R;
                int i4 = y2 - this.f5489S;
                if (mo3700v == 0 || Math.abs(i3) <= this.f5492V) {
                    z = false;
                } else {
                    this.f5490T = x2;
                    z = true;
                }
                if (mo3701w && Math.abs(i4) > this.f5492V) {
                    this.f5491U = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m3810o();
        } else if (actionMasked == 5) {
            this.f5486P = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f5490T = x3;
            this.f5488R = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f5491U = y3;
            this.f5489S = y3;
        } else if (actionMasked == 6) {
            m3796f0(motionEvent);
        }
        return this.f5485O == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        TraceCompat.m1969a("RV OnLayout");
        m3823v();
        TraceCompat.m1970b();
        this.f5535v = true;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        LayoutManager layoutManager = this.f5519n;
        if (layoutManager == null) {
            m3819t(i2, i3);
            return;
        }
        boolean z = false;
        if (layoutManager.mo3689m0()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.f5519n.f5563c.m3819t(i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f5542y0 = z;
            if (z || this.f5517m == null) {
                return;
            }
            if (this.f5510i0.f5624d == 1) {
                m3825w();
            }
            this.f5519n.m3877W0(i2, i3);
            this.f5510i0.f5629i = true;
            m3827x();
            this.f5519n.m3880Y0(i2, i3);
            if (this.f5519n.mo3681b1()) {
                this.f5519n.m3877W0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f5510i0.f5629i = true;
                m3827x();
                this.f5519n.m3880Y0(i2, i3);
            }
            this.f5544z0 = getMeasuredWidth();
            this.f5470A0 = getMeasuredHeight();
            return;
        }
        if (this.f5533u) {
            this.f5519n.f5563c.m3819t(i2, i3);
            return;
        }
        if (this.f5471B) {
            m3828x0();
            m3794d0();
            m3798h0();
            m3795e0(true);
            State state = this.f5510i0;
            if (state.f5631k) {
                state.f5627g = true;
            } else {
                this.f5501e.m3471e();
                this.f5510i0.f5627g = false;
            }
            this.f5471B = false;
            m3832z0(false);
        } else if (this.f5510i0.f5631k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        Adapter adapter = this.f5517m;
        if (adapter != null) {
            this.f5510i0.f5625e = adapter.getItemCount();
        } else {
            this.f5510i0.f5625e = 0;
        }
        m3828x0();
        this.f5519n.f5563c.m3819t(i2, i3);
        m3832z0(false);
        this.f5510i0.f5627g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (m3788X()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f5499d = savedState;
        super.onRestoreInstanceState(savedState.f3875b);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f5499d;
        if (savedState2 != null) {
            savedState.f5605d = savedState2.f5605d;
        } else {
            LayoutManager layoutManager = this.f5519n;
            if (layoutManager != null) {
                savedState.f5605d = layoutManager.mo3673I0();
            } else {
                savedState.f5605d = null;
            }
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        m3786V();
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x026b, code lost:
    
        if (r0 != false) goto L144;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0110  */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p0 */
    public final void m3812p0() {
        VelocityTracker velocityTracker = this.f5487Q;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        m3767A0(0);
        EdgeEffect edgeEffect = this.f5480J;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f5480J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f5481K;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f5481K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5482L;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f5482L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5483M;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f5483M.isFinished();
        }
        if (z) {
            ViewCompat.m2183W(this);
        }
    }

    /* renamed from: q */
    public void m3813q() {
        int m3500g = this.f5503f.m3500g();
        for (int i2 = 0; i2 < m3500g; i2++) {
            ViewHolder m3759R = m3759R(this.f5503f.m3499f(i2));
            if (!m3759R.shouldIgnore()) {
                m3759R.clearOldPosition();
            }
        }
        Recycler recycler = this.f5497c;
        int size = recycler.f5597c.size();
        for (int i3 = 0; i3 < size; i3++) {
            recycler.f5597c.get(i3).clearOldPosition();
        }
        int size2 = recycler.f5595a.size();
        for (int i4 = 0; i4 < size2; i4++) {
            recycler.f5595a.get(i4).clearOldPosition();
        }
        ArrayList<ViewHolder> arrayList = recycler.f5596b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i5 = 0; i5 < size3; i5++) {
                recycler.f5596b.get(i5).clearOldPosition();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f7  */
    /* renamed from: q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m3814q0(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m3814q0(int, int, android.view.MotionEvent, int):boolean");
    }

    /* renamed from: r */
    public void m3815r(int i2, int i3) {
        boolean z;
        EdgeEffect edgeEffect = this.f5480J;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z = false;
        } else {
            this.f5480J.onRelease();
            z = this.f5480J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f5482L;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.f5482L.onRelease();
            z |= this.f5482L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5481K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.f5481K.onRelease();
            z |= this.f5481K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5483M;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.f5483M.onRelease();
            z |= this.f5483M.isFinished();
        }
        if (z) {
            ViewCompat.m2183W(this);
        }
    }

    /* renamed from: r0 */
    public void m3816r0(int i2, int i3, @Nullable int[] iArr) {
        ViewHolder viewHolder;
        m3828x0();
        m3794d0();
        TraceCompat.m1969a("RV Scroll");
        m3774G(this.f5510i0);
        int mo3611S0 = i2 != 0 ? this.f5519n.mo3611S0(i2, this.f5497c, this.f5510i0) : 0;
        int mo3614U0 = i3 != 0 ? this.f5519n.mo3614U0(i3, this.f5497c, this.f5510i0) : 0;
        TraceCompat.m1970b();
        int m3497d = this.f5503f.m3497d();
        for (int i4 = 0; i4 < m3497d; i4++) {
            View m3496c = this.f5503f.m3496c(i4);
            ViewHolder m3783Q = m3783Q(m3496c);
            if (m3783Q != null && (viewHolder = m3783Q.mShadowingHolder) != null) {
                View view = viewHolder.itemView;
                int left = m3496c.getLeft();
                int top = m3496c.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m3795e0(true);
        m3832z0(false);
        if (iArr != null) {
            iArr[0] = mo3611S0;
            iArr[1] = mo3614U0;
        }
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        ViewHolder m3759R = m3759R(view);
        if (m3759R != null) {
            if (m3759R.isTmpDetached()) {
                m3759R.clearTmpDetachFlag();
            } else if (!m3759R.shouldIgnore()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(m3759R);
                throw new IllegalArgumentException(C0000a.m6c(this, sb));
            }
        }
        view.clearAnimation();
        m3821u(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        SmoothScroller smoothScroller = this.f5519n.f5568h;
        boolean z = true;
        if (!(smoothScroller != null && smoothScroller.f5610e) && !m3788X()) {
            z = false;
        }
        if (!z && view2 != null) {
            m3811o0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f5519n.mo3870Q0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f5527r.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f5527r.get(i2).mo3579e(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f5537w != 0 || this.f5541y) {
            this.f5539x = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public void m3817s() {
        if (!this.f5535v || this.f5475E) {
            TraceCompat.m1969a("RV FullInvalidate");
            m3823v();
            TraceCompat.m1970b();
            return;
        }
        if (this.f5501e.m3475i()) {
            AdapterHelper adapterHelper = this.f5501e;
            int i2 = adapterHelper.f5172g;
            boolean z = false;
            if ((i2 & 4) != 0) {
                if (!((i2 & 11) != 0)) {
                    TraceCompat.m1969a("RV PartialInvalidate");
                    m3828x0();
                    m3794d0();
                    this.f5501e.m3477k();
                    if (!this.f5539x) {
                        int m3497d = this.f5503f.m3497d();
                        int i3 = 0;
                        while (true) {
                            if (i3 < m3497d) {
                                ViewHolder m3759R = m3759R(this.f5503f.m3496c(i3));
                                if (m3759R != null && !m3759R.shouldIgnore() && m3759R.isUpdated()) {
                                    z = true;
                                    break;
                                }
                                i3++;
                            } else {
                                break;
                            }
                        }
                        if (z) {
                            m3823v();
                        } else {
                            this.f5501e.m3470d();
                        }
                    }
                    m3832z0(true);
                    m3795e0(true);
                    TraceCompat.m1970b();
                    return;
                }
            }
            if (adapterHelper.m3475i()) {
                TraceCompat.m1969a("RV FullInvalidate");
                m3823v();
                TraceCompat.m1970b();
            }
        }
    }

    /* renamed from: s0 */
    public void m3818s0(int i2) {
        if (this.f5541y) {
            return;
        }
        m3769B0();
        LayoutManager layoutManager = this.f5519n;
        if (layoutManager == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            layoutManager.mo3680T0(i2);
            awakenScrollBars();
        }
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        LayoutManager layoutManager = this.f5519n;
        if (layoutManager == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f5541y) {
            return;
        }
        boolean mo3700v = layoutManager.mo3700v();
        boolean mo3701w = this.f5519n.mo3701w();
        if (mo3700v || mo3701w) {
            if (!mo3700v) {
                i2 = 0;
            }
            if (!mo3701w) {
                i3 = 0;
            }
            m3814q0(i2, i3, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (m3788X()) {
            int m2483a = accessibilityEvent != null ? AccessibilityEventCompat.m2483a(accessibilityEvent) : 0;
            this.f5469A |= m2483a != 0 ? m2483a : 0;
            r1 = 1;
        }
        if (r1 != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(@Nullable RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
        this.f5524p0 = recyclerViewAccessibilityDelegate;
        ViewCompat.m2196e0(this, recyclerViewAccessibilityDelegate);
    }

    public void setAdapter(@Nullable Adapter adapter) {
        setLayoutFrozen(false);
        m3820t0(adapter, false, true);
        m3799i0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@Nullable ChildDrawingOrderCallback childDrawingOrderCallback) {
        if (childDrawingOrderCallback == this.f5526q0) {
            return;
        }
        this.f5526q0 = childDrawingOrderCallback;
        setChildrenDrawingOrderEnabled(childDrawingOrderCallback != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f5507h) {
            m3786V();
        }
        this.f5507h = z;
        super.setClipToPadding(z);
        if (this.f5535v) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull EdgeEffectFactory edgeEffectFactory) {
        Objects.requireNonNull(edgeEffectFactory);
        this.f5479I = edgeEffectFactory;
        m3786V();
    }

    public void setHasFixedSize(boolean z) {
        this.f5533u = z;
    }

    public void setItemAnimator(@Nullable ItemAnimator itemAnimator) {
        ItemAnimator itemAnimator2 = this.f5484N;
        if (itemAnimator2 != null) {
            itemAnimator2.mo3525k();
            this.f5484N.f5553a = null;
        }
        this.f5484N = itemAnimator;
        if (itemAnimator != null) {
            itemAnimator.f5553a = this.f5520n0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        Recycler recycler = this.f5497c;
        recycler.f5599e = i2;
        recycler.m3933n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(@Nullable LayoutManager layoutManager) {
        if (layoutManager == this.f5519n) {
            return;
        }
        m3769B0();
        if (this.f5519n != null) {
            ItemAnimator itemAnimator = this.f5484N;
            if (itemAnimator != null) {
                itemAnimator.mo3525k();
            }
            this.f5519n.mo3550L0(this.f5497c);
            this.f5519n.m3866M0(this.f5497c);
            this.f5497c.m3921b();
            if (this.f5531t) {
                LayoutManager layoutManager2 = this.f5519n;
                Recycler recycler = this.f5497c;
                layoutManager2.f5570j = false;
                layoutManager2.mo3574u0(this, recycler);
            }
            this.f5519n.m3882Z0(null);
            this.f5519n = null;
        } else {
            this.f5497c.m3921b();
        }
        ChildHelper childHelper = this.f5503f;
        ChildHelper.Bucket bucket = childHelper.f5187b;
        bucket.f5189a = 0L;
        ChildHelper.Bucket bucket2 = bucket.f5190b;
        if (bucket2 != null) {
            bucket2.m3510g();
        }
        int size = childHelper.f5188c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            childHelper.f5186a.mo3519h(childHelper.f5188c.get(size));
            childHelper.f5188c.remove(size);
        }
        childHelper.f5186a.mo3515d();
        this.f5519n = layoutManager;
        if (layoutManager != null) {
            if (layoutManager.f5563c != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("LayoutManager ");
                sb.append(layoutManager);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(C0000a.m6c(layoutManager.f5563c, sb));
            }
            layoutManager.m3882Z0(this);
            if (this.f5531t) {
                LayoutManager layoutManager3 = this.f5519n;
                layoutManager3.f5570j = true;
                layoutManager3.mo3573t0(this);
            }
        }
        this.f5497c.m3933n();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().m2143i(z);
    }

    public void setOnFlingListener(@Nullable OnFlingListener onFlingListener) {
        this.f5493W = onFlingListener;
    }

    @Deprecated
    public void setOnScrollListener(@Nullable OnScrollListener onScrollListener) {
        this.f5512j0 = onScrollListener;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f5502e0 = z;
    }

    public void setRecycledViewPool(@Nullable RecycledViewPool recycledViewPool) {
        Recycler recycler = this.f5497c;
        if (recycler.f5601g != null) {
            r1.f5590b--;
        }
        recycler.f5601g = recycledViewPool;
        if (recycledViewPool == null || RecyclerView.this.getAdapter() == null) {
            return;
        }
        recycler.f5601g.f5590b++;
    }

    @Deprecated
    public void setRecyclerListener(@Nullable RecyclerListener recyclerListener) {
        this.f5521o = recyclerListener;
    }

    void setScrollState(int i2) {
        SmoothScroller smoothScroller;
        if (i2 == this.f5485O) {
            return;
        }
        this.f5485O = i2;
        if (i2 != 2) {
            this.f5504f0.m3946c();
            LayoutManager layoutManager = this.f5519n;
            if (layoutManager != null && (smoothScroller = layoutManager.f5568h) != null) {
                smoothScroller.m3938g();
            }
        }
        LayoutManager layoutManager2 = this.f5519n;
        if (layoutManager2 != null) {
            layoutManager2.mo3863J0(i2);
        }
        OnScrollListener onScrollListener = this.f5512j0;
        if (onScrollListener != null) {
            onScrollListener.mo3914a(this, i2);
        }
        List<OnScrollListener> list = this.f5514k0;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                this.f5514k0.get(size).mo3914a(this, i2);
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                this.f5492V = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        this.f5492V = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(@Nullable ViewCacheExtension viewCacheExtension) {
        this.f5497c.f5602h = viewCacheExtension;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().m2144j(i2, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().m2145k(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.f5541y) {
            m3808n("Do not suppressLayout in layout or scroll");
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f5541y = true;
                this.f5543z = true;
                m3769B0();
                return;
            }
            this.f5541y = false;
            if (this.f5539x && this.f5519n != null && this.f5517m != null) {
                requestLayout();
            }
            this.f5539x = false;
        }
    }

    /* renamed from: t */
    public void m3819t(int i2, int i3) {
        setMeasuredDimension(LayoutManager.m3860y(i2, getPaddingRight() + getPaddingLeft(), ViewCompat.m2235y(this)), LayoutManager.m3860y(i3, getPaddingBottom() + getPaddingTop(), ViewCompat.m2233x(this)));
    }

    /* renamed from: t0 */
    public final void m3820t0(@Nullable Adapter adapter, boolean z, boolean z2) {
        Adapter adapter2 = this.f5517m;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.f5495b);
            this.f5517m.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            m3803k0();
        }
        AdapterHelper adapterHelper = this.f5501e;
        adapterHelper.m3478l(adapterHelper.f5167b);
        adapterHelper.m3478l(adapterHelper.f5168c);
        adapterHelper.f5172g = 0;
        Adapter adapter3 = this.f5517m;
        this.f5517m = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.f5495b);
            adapter.onAttachedToRecyclerView(this);
        }
        LayoutManager layoutManager = this.f5519n;
        if (layoutManager != null) {
            layoutManager.mo3900s0(adapter3, this.f5517m);
        }
        Recycler recycler = this.f5497c;
        Adapter adapter4 = this.f5517m;
        recycler.m3921b();
        RecycledViewPool m3923d = recycler.m3923d();
        Objects.requireNonNull(m3923d);
        if (adapter3 != null) {
            m3923d.f5590b--;
        }
        if (!z && m3923d.f5590b == 0) {
            m3923d.mo3915a();
        }
        if (adapter4 != null) {
            m3923d.f5590b++;
        }
        this.f5510i0.f5626f = true;
    }

    /* renamed from: u */
    public void m3821u(View view) {
        ViewHolder m3759R = m3759R(view);
        mo3793c0(view);
        Adapter adapter = this.f5517m;
        if (adapter != null && m3759R != null) {
            adapter.onViewDetachedFromWindow(m3759R);
        }
        List<OnChildAttachStateChangeListener> list = this.f5474D;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f5474D.get(size).mo3632b(view);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: u0 */
    public boolean m3822u0(ViewHolder viewHolder, int i2) {
        if (!m3788X()) {
            ViewCompat.m2216o0(viewHolder.itemView, i2);
            return true;
        }
        viewHolder.mPendingAccessibilityState = i2;
        this.f5538w0.add(viewHolder);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x02e6, code lost:
    
        if (r17.f5503f.m3502i(getFocusedChild()) == false) goto L202;
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m3823v() {
        /*
            Method dump skipped, instructions count: 963
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m3823v():void");
    }

    /* renamed from: v0 */
    public void m3824v0(@Px int i2, @Px int i3, @Nullable Interpolator interpolator, int i4, boolean z) {
        LayoutManager layoutManager = this.f5519n;
        if (layoutManager == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f5541y) {
            return;
        }
        if (!layoutManager.mo3700v()) {
            i2 = 0;
        }
        if (!this.f5519n.mo3701w()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (!(i4 == Integer.MIN_VALUE || i4 > 0)) {
            scrollBy(i2, i3);
            return;
        }
        if (z) {
            int i5 = i2 != 0 ? 1 : 0;
            if (i3 != 0) {
                i5 |= 2;
            }
            m3830y0(i5, 1);
        }
        this.f5504f0.m3945b(i2, i3, i4, interpolator);
    }

    /* renamed from: w */
    public final void m3825w() {
        View m3775H;
        this.f5510i0.m3941a(1);
        m3774G(this.f5510i0);
        this.f5510i0.f5629i = false;
        m3828x0();
        ViewInfoStore viewInfoStore = this.f5505g;
        viewInfoStore.f5714a.clear();
        viewInfoStore.f5715b.m1090c();
        m3794d0();
        m3798h0();
        ViewHolder viewHolder = null;
        View focusedChild = (this.f5502e0 && hasFocus() && this.f5517m != null) ? getFocusedChild() : null;
        if (focusedChild != null && (m3775H = m3775H(focusedChild)) != null) {
            viewHolder = m3783Q(m3775H);
        }
        if (viewHolder == null) {
            State state = this.f5510i0;
            state.f5633m = -1L;
            state.f5632l = -1;
            state.f5634n = -1;
        } else {
            this.f5510i0.f5633m = this.f5517m.hasStableIds() ? viewHolder.getItemId() : -1L;
            this.f5510i0.f5632l = this.f5475E ? -1 : viewHolder.isRemoved() ? viewHolder.mOldPosition : viewHolder.getAbsoluteAdapterPosition();
            State state2 = this.f5510i0;
            View view = viewHolder.itemView;
            int id2 = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id2 = view.getId();
                }
            }
            state2.f5634n = id2;
        }
        State state3 = this.f5510i0;
        state3.f5628h = state3.f5630j && this.f5518m0;
        this.f5518m0 = false;
        this.f5516l0 = false;
        state3.f5627g = state3.f5631k;
        state3.f5625e = this.f5517m.getItemCount();
        m3777J(this.f5528r0);
        if (this.f5510i0.f5630j) {
            int m3497d = this.f5503f.m3497d();
            for (int i2 = 0; i2 < m3497d; i2++) {
                ViewHolder m3759R = m3759R(this.f5503f.m3496c(i2));
                if (!m3759R.shouldIgnore() && (!m3759R.isInvalid() || this.f5517m.hasStableIds())) {
                    ItemAnimator itemAnimator = this.f5484N;
                    ItemAnimator.m3846e(m3759R);
                    m3759R.getUnmodifiedPayloads();
                    this.f5505g.m4019c(m3759R, itemAnimator.m3854m(m3759R));
                    if (this.f5510i0.f5628h && m3759R.isUpdated() && !m3759R.isRemoved() && !m3759R.shouldIgnore() && !m3759R.isInvalid()) {
                        this.f5505g.f5715b.m1098m(m3781O(m3759R), m3759R);
                    }
                }
            }
        }
        if (this.f5510i0.f5631k) {
            int m3500g = this.f5503f.m3500g();
            for (int i3 = 0; i3 < m3500g; i3++) {
                ViewHolder m3759R2 = m3759R(this.f5503f.m3499f(i3));
                if (!m3759R2.shouldIgnore()) {
                    m3759R2.saveOldPosition();
                }
            }
            State state4 = this.f5510i0;
            boolean z = state4.f5626f;
            state4.f5626f = false;
            this.f5519n.mo3603F0(this.f5497c, state4);
            this.f5510i0.f5626f = z;
            for (int i4 = 0; i4 < this.f5503f.m3497d(); i4++) {
                ViewHolder m3759R3 = m3759R(this.f5503f.m3496c(i4));
                if (!m3759R3.shouldIgnore()) {
                    ViewInfoStore.InfoRecord infoRecord = this.f5505g.f5714a.get(m3759R3);
                    if (!((infoRecord == null || (infoRecord.f5717a & 4) == 0) ? false : true)) {
                        ItemAnimator.m3846e(m3759R3);
                        boolean hasAnyOfTheFlags = m3759R3.hasAnyOfTheFlags(ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST);
                        ItemAnimator itemAnimator2 = this.f5484N;
                        m3759R3.getUnmodifiedPayloads();
                        ItemAnimator.ItemHolderInfo m3854m = itemAnimator2.m3854m(m3759R3);
                        if (hasAnyOfTheFlags) {
                            m3801j0(m3759R3, m3854m);
                        } else {
                            ViewInfoStore viewInfoStore2 = this.f5505g;
                            ViewInfoStore.InfoRecord infoRecord2 = viewInfoStore2.f5714a.get(m3759R3);
                            if (infoRecord2 == null) {
                                infoRecord2 = ViewInfoStore.InfoRecord.m4024a();
                                viewInfoStore2.f5714a.put(m3759R3, infoRecord2);
                            }
                            infoRecord2.f5717a |= 2;
                            infoRecord2.f5718b = m3854m;
                        }
                    }
                }
            }
            m3813q();
        } else {
            m3813q();
        }
        m3795e0(true);
        m3832z0(false);
        this.f5510i0.f5624d = 2;
    }

    /* renamed from: w0 */
    public void m3826w0(int i2) {
        if (this.f5541y) {
            return;
        }
        LayoutManager layoutManager = this.f5519n;
        if (layoutManager == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            layoutManager.mo3682d1(this, this.f5510i0, i2);
        }
    }

    /* renamed from: x */
    public final void m3827x() {
        m3828x0();
        m3794d0();
        this.f5510i0.m3941a(6);
        this.f5501e.m3471e();
        this.f5510i0.f5625e = this.f5517m.getItemCount();
        this.f5510i0.f5623c = 0;
        if (this.f5499d != null && this.f5517m.canRestoreState()) {
            Parcelable parcelable = this.f5499d.f5605d;
            if (parcelable != null) {
                this.f5519n.mo3671H0(parcelable);
            }
            this.f5499d = null;
        }
        State state = this.f5510i0;
        state.f5627g = false;
        this.f5519n.mo3603F0(this.f5497c, state);
        State state2 = this.f5510i0;
        state2.f5626f = false;
        state2.f5630j = state2.f5630j && this.f5484N != null;
        state2.f5624d = 4;
        m3795e0(true);
        m3832z0(false);
    }

    /* renamed from: x0 */
    public void m3828x0() {
        int i2 = this.f5537w + 1;
        this.f5537w = i2;
        if (i2 != 1 || this.f5541y) {
            return;
        }
        this.f5539x = false;
    }

    /* renamed from: y */
    public boolean m3829y(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().m2137c(i2, i3, iArr, iArr2, i4);
    }

    /* renamed from: y0 */
    public boolean m3830y0(int i2, int i3) {
        return getScrollingChildHelper().m2144j(i2, i3);
    }

    /* renamed from: z */
    public final void m3831z(int i2, int i3, int i4, int i5, int[] iArr, int i6, @NonNull int[] iArr2) {
        getScrollingChildHelper().m2140f(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    /* renamed from: z0 */
    public void m3832z0(boolean z) {
        if (this.f5537w < 1) {
            this.f5537w = 1;
        }
        if (!z && !this.f5541y) {
            this.f5539x = false;
        }
        if (this.f5537w == 1) {
            if (z && this.f5539x && !this.f5541y && this.f5519n != null && this.f5517m != null) {
                m3823v();
            }
            if (!this.f5541y) {
                this.f5539x = false;
            }
        }
        this.f5537w--;
    }

    public static abstract class Adapter<VH extends ViewHolder> {
        private final AdapterDataObservable mObservable = new AdapterDataObservable();
        private boolean mHasStableIds = false;
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.ALLOW;

        public enum StateRestorationPolicy {
            ALLOW,
            /* JADX INFO: Fake field, exist only in values array */
            PREVENT_WHEN_EMPTY,
            /* JADX INFO: Fake field, exist only in values array */
            PREVENT
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(@NonNull VH vh, int i2) {
            boolean z = vh.mBindingAdapter == null;
            if (z) {
                vh.mPosition = i2;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i2);
                }
                vh.setFlags(1, 519);
                TraceCompat.m1969a("RV OnBindView");
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i2, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).f5587c = true;
                }
                TraceCompat.m1970b();
            }
        }

        public boolean canRestoreState() {
            int ordinal = this.mStateRestorationPolicy.ordinal();
            return ordinal != 1 ? ordinal != 2 : getItemCount() > 0;
        }

        @NonNull
        public final VH createViewHolder(@NonNull ViewGroup viewGroup, int i2) {
            try {
                TraceCompat.m1969a("RV CreateView");
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i2);
                if (onCreateViewHolder.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                onCreateViewHolder.mItemViewType = i2;
                return onCreateViewHolder;
            } finally {
                TraceCompat.m1970b();
            }
        }

        public int findRelativeAdapterPositionIn(@NonNull Adapter<? extends ViewHolder> adapter, @NonNull ViewHolder viewHolder, int i2) {
            if (adapter == this) {
                return i2;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i2) {
            return -1L;
        }

        public int getItemViewType(int i2) {
            return 0;
        }

        @NonNull
        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.m3838a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.m3839b();
        }

        public final void notifyItemChanged(int i2) {
            this.mObservable.m3841d(i2, 1, null);
        }

        public final void notifyItemInserted(int i2) {
            this.mObservable.m3842e(i2, 1);
        }

        public final void notifyItemMoved(int i2, int i3) {
            this.mObservable.m3840c(i2, i3);
        }

        public final void notifyItemRangeChanged(int i2, int i3) {
            this.mObservable.m3841d(i2, i3, null);
        }

        public final void notifyItemRangeInserted(int i2, int i3) {
            this.mObservable.m3842e(i2, i3);
        }

        public final void notifyItemRangeRemoved(int i2, int i3) {
            this.mObservable.m3843f(i2, i3);
        }

        public final void notifyItemRemoved(int i2) {
            this.mObservable.m3843f(i2, 1);
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(@NonNull VH vh, int i2);

        public void onBindViewHolder(@NonNull VH vh, int i2, @NonNull List<Object> list) {
            onBindViewHolder(vh, i2);
        }

        @NonNull
        public abstract VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2);

        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(@NonNull VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(@NonNull VH vh) {
        }

        public void onViewDetachedFromWindow(@NonNull VH vh) {
        }

        public void onViewRecycled(@NonNull VH vh) {
        }

        public void registerAdapterDataObserver(@NonNull AdapterDataObserver adapterDataObserver) {
            this.mObservable.registerObserver(adapterDataObserver);
        }

        public void setHasStableIds(boolean z) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z;
        }

        public void setStateRestorationPolicy(@NonNull StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.m3844g();
        }

        public void unregisterAdapterDataObserver(@NonNull AdapterDataObserver adapterDataObserver) {
            this.mObservable.unregisterObserver(adapterDataObserver);
        }

        public final void notifyItemChanged(int i2, @Nullable Object obj) {
            this.mObservable.m3841d(i2, 1, obj);
        }

        public final void notifyItemRangeChanged(int i2, int i3, @Nullable Object obj) {
            this.mObservable.m3841d(i2, i3, obj);
        }
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        char c2;
        Constructor constructor;
        Object[] objArr;
        this.f5495b = new RecyclerViewDataObserver();
        this.f5497c = new Recycler();
        this.f5505g = new ViewInfoStore();
        this.f5509i = new Runnable() { // from class: androidx.recyclerview.widget.RecyclerView.1
            @Override // java.lang.Runnable
            public void run() {
                RecyclerView recyclerView = RecyclerView.this;
                if (!recyclerView.f5535v || recyclerView.isLayoutRequested()) {
                    return;
                }
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f5531t) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f5541y) {
                    recyclerView2.f5539x = true;
                } else {
                    recyclerView2.m3817s();
                }
            }
        };
        this.f5511j = new Rect();
        this.f5513k = new Rect();
        this.f5515l = new RectF();
        this.f5523p = new ArrayList();
        this.f5525q = new ArrayList<>();
        this.f5527r = new ArrayList<>();
        this.f5537w = 0;
        this.f5475E = false;
        this.f5476F = false;
        this.f5477G = 0;
        this.f5478H = 0;
        this.f5479I = new EdgeEffectFactory();
        this.f5484N = new DefaultItemAnimator();
        this.f5485O = 0;
        this.f5486P = -1;
        this.f5498c0 = Float.MIN_VALUE;
        this.f5500d0 = Float.MIN_VALUE;
        this.f5502e0 = true;
        this.f5504f0 = new ViewFlinger();
        this.f5508h0 = f5466F0 ? new GapWorker.LayoutPrefetchRegistryImpl() : null;
        this.f5510i0 = new State();
        this.f5516l0 = false;
        this.f5518m0 = false;
        this.f5520n0 = new ItemAnimatorRestoreListener();
        this.f5522o0 = false;
        this.f5528r0 = new int[2];
        this.f5532t0 = new int[2];
        this.f5534u0 = new int[2];
        this.f5536v0 = new int[2];
        this.f5538w0 = new ArrayList();
        this.f5540x0 = new Runnable() { // from class: androidx.recyclerview.widget.RecyclerView.2
            @Override // java.lang.Runnable
            public void run() {
                ItemAnimator itemAnimator = RecyclerView.this.f5484N;
                if (itemAnimator != null) {
                    itemAnimator.mo3527n();
                }
                RecyclerView.this.f5522o0 = false;
            }
        };
        this.f5544z0 = 0;
        this.f5470A0 = 0;
        this.f5472B0 = new ViewInfoStore.ProcessCallback() { // from class: androidx.recyclerview.widget.RecyclerView.4
            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            /* renamed from: a */
            public void mo3833a(ViewHolder viewHolder) {
                RecyclerView recyclerView = RecyclerView.this;
                LayoutManager layoutManager = recyclerView.f5519n;
                View view = viewHolder.itemView;
                Recycler recycler = recyclerView.f5497c;
                layoutManager.mo3554O0(view);
                recycler.m3927h(view);
            }

            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            /* renamed from: b */
            public void mo3834b(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
                RecyclerView recyclerView = RecyclerView.this;
                Objects.requireNonNull(recyclerView);
                viewHolder.setIsRecyclable(false);
                if (recyclerView.f5484N.mo3847a(viewHolder, itemHolderInfo, itemHolderInfo2)) {
                    recyclerView.m3797g0();
                }
            }

            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            /* renamed from: c */
            public void mo3835c(ViewHolder viewHolder, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo, @Nullable ItemAnimator.ItemHolderInfo itemHolderInfo2) {
                RecyclerView.this.f5497c.m3932m(viewHolder);
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.m3800j(viewHolder);
                viewHolder.setIsRecyclable(false);
                if (recyclerView.f5484N.mo3849c(viewHolder, itemHolderInfo, itemHolderInfo2)) {
                    recyclerView.m3797g0();
                }
            }

            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            /* renamed from: d */
            public void mo3836d(ViewHolder viewHolder, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo2) {
                viewHolder.setIsRecyclable(false);
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f5475E) {
                    if (recyclerView.f5484N.mo3848b(viewHolder, viewHolder, itemHolderInfo, itemHolderInfo2)) {
                        RecyclerView.this.m3797g0();
                    }
                } else if (recyclerView.f5484N.mo3850d(viewHolder, itemHolderInfo, itemHolderInfo2)) {
                    RecyclerView.this.m3797g0();
                }
            }
        };
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f5492V = viewConfiguration.getScaledTouchSlop();
        this.f5498c0 = ViewConfigurationCompat.m2362b(viewConfiguration, context);
        this.f5500d0 = ViewConfigurationCompat.m2364d(viewConfiguration, context);
        this.f5494a0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5496b0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f5484N.f5553a = this.f5520n0;
        this.f5501e = new AdapterHelper(new AdapterHelper.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.6
            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            /* renamed from: a */
            public void mo3480a(int i3, int i4) {
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                int i11;
                RecyclerView recyclerView = RecyclerView.this;
                int m3500g = recyclerView.f5503f.m3500g();
                int i12 = -1;
                if (i3 < i4) {
                    i6 = i3;
                    i5 = i4;
                    i7 = -1;
                } else {
                    i5 = i3;
                    i6 = i4;
                    i7 = 1;
                }
                for (int i13 = 0; i13 < m3500g; i13++) {
                    ViewHolder m3759R = RecyclerView.m3759R(recyclerView.f5503f.m3499f(i13));
                    if (m3759R != null && (i11 = m3759R.mPosition) >= i6 && i11 <= i5) {
                        if (i11 == i3) {
                            m3759R.offsetPosition(i4 - i3, false);
                        } else {
                            m3759R.offsetPosition(i7, false);
                        }
                        recyclerView.f5510i0.f5626f = true;
                    }
                }
                Recycler recycler = recyclerView.f5497c;
                if (i3 < i4) {
                    i9 = i3;
                    i8 = i4;
                } else {
                    i8 = i3;
                    i9 = i4;
                    i12 = 1;
                }
                int size = recycler.f5597c.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ViewHolder viewHolder = recycler.f5597c.get(i14);
                    if (viewHolder != null && (i10 = viewHolder.mPosition) >= i9 && i10 <= i8) {
                        if (i10 == i3) {
                            viewHolder.offsetPosition(i4 - i3, false);
                        } else {
                            viewHolder.offsetPosition(i12, false);
                        }
                    }
                }
                recyclerView.requestLayout();
                RecyclerView.this.f5516l0 = true;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            /* renamed from: b */
            public void mo3481b(AdapterHelper.UpdateOp updateOp) {
                m3837i(updateOp);
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            /* renamed from: c */
            public void mo3482c(int i3, int i4, Object obj) {
                int i5;
                int i6;
                RecyclerView recyclerView = RecyclerView.this;
                int m3500g = recyclerView.f5503f.m3500g();
                int i7 = i4 + i3;
                for (int i8 = 0; i8 < m3500g; i8++) {
                    View m3499f = recyclerView.f5503f.m3499f(i8);
                    ViewHolder m3759R = RecyclerView.m3759R(m3499f);
                    if (m3759R != null && !m3759R.shouldIgnore() && (i6 = m3759R.mPosition) >= i3 && i6 < i7) {
                        m3759R.addFlags(2);
                        m3759R.addChangePayload(obj);
                        ((LayoutParams) m3499f.getLayoutParams()).f5587c = true;
                    }
                }
                Recycler recycler = recyclerView.f5497c;
                int size = recycler.f5597c.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        RecyclerView.this.f5518m0 = true;
                        return;
                    }
                    ViewHolder viewHolder = recycler.f5597c.get(size);
                    if (viewHolder != null && (i5 = viewHolder.mPosition) >= i3 && i5 < i7) {
                        viewHolder.addFlags(2);
                        recycler.m3926g(size);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            /* renamed from: d */
            public void mo3483d(AdapterHelper.UpdateOp updateOp) {
                m3837i(updateOp);
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            /* renamed from: e */
            public ViewHolder mo3484e(int i3) {
                ViewHolder m3779M = RecyclerView.this.m3779M(i3, true);
                if (m3779M == null || RecyclerView.this.f5503f.m3502i(m3779M.itemView)) {
                    return null;
                }
                return m3779M;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            /* renamed from: f */
            public void mo3485f(int i3, int i4) {
                RecyclerView.this.m3791a0(i3, i4, false);
                RecyclerView.this.f5516l0 = true;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            /* renamed from: g */
            public void mo3486g(int i3, int i4) {
                RecyclerView recyclerView = RecyclerView.this;
                int m3500g = recyclerView.f5503f.m3500g();
                for (int i5 = 0; i5 < m3500g; i5++) {
                    ViewHolder m3759R = RecyclerView.m3759R(recyclerView.f5503f.m3499f(i5));
                    if (m3759R != null && !m3759R.shouldIgnore() && m3759R.mPosition >= i3) {
                        m3759R.offsetPosition(i4, false);
                        recyclerView.f5510i0.f5626f = true;
                    }
                }
                Recycler recycler = recyclerView.f5497c;
                int size = recycler.f5597c.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ViewHolder viewHolder = recycler.f5597c.get(i6);
                    if (viewHolder != null && viewHolder.mPosition >= i3) {
                        viewHolder.offsetPosition(i4, false);
                    }
                }
                recyclerView.requestLayout();
                RecyclerView.this.f5516l0 = true;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            /* renamed from: h */
            public void mo3487h(int i3, int i4) {
                RecyclerView.this.m3791a0(i3, i4, true);
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f5516l0 = true;
                recyclerView.f5510i0.f5623c += i4;
            }

            /* renamed from: i */
            public void m3837i(AdapterHelper.UpdateOp updateOp) {
                int i3 = updateOp.f5173a;
                if (i3 == 1) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.f5519n.mo3593A0(recyclerView, updateOp.f5174b, updateOp.f5176d);
                    return;
                }
                if (i3 == 2) {
                    RecyclerView recyclerView2 = RecyclerView.this;
                    recyclerView2.f5519n.mo3600D0(recyclerView2, updateOp.f5174b, updateOp.f5176d);
                } else if (i3 == 4) {
                    RecyclerView recyclerView3 = RecyclerView.this;
                    recyclerView3.f5519n.mo3601E0(recyclerView3, updateOp.f5174b, updateOp.f5176d, updateOp.f5175c);
                } else {
                    if (i3 != 8) {
                        return;
                    }
                    RecyclerView recyclerView4 = RecyclerView.this;
                    recyclerView4.f5519n.mo3597C0(recyclerView4, updateOp.f5174b, updateOp.f5176d, 1);
                }
            }
        });
        this.f5503f = new ChildHelper(new ChildHelper.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.5
            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            /* renamed from: a */
            public View mo3512a(int i3) {
                return RecyclerView.this.getChildAt(i3);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            /* renamed from: b */
            public void mo3513b(View view) {
                ViewHolder m3759R = RecyclerView.m3759R(view);
                if (m3759R != null) {
                    m3759R.onEnteredHiddenState(RecyclerView.this);
                }
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            /* renamed from: c */
            public int mo3514c() {
                return RecyclerView.this.getChildCount();
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            /* renamed from: d */
            public void mo3515d() {
                int mo3514c = mo3514c();
                for (int i3 = 0; i3 < mo3514c; i3++) {
                    View mo3512a = mo3512a(i3);
                    RecyclerView.this.m3821u(mo3512a);
                    mo3512a.clearAnimation();
                }
                RecyclerView.this.removeAllViews();
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            /* renamed from: e */
            public int mo3516e(View view) {
                return RecyclerView.this.indexOfChild(view);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            /* renamed from: f */
            public ViewHolder mo3517f(View view) {
                return RecyclerView.m3759R(view);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            /* renamed from: g */
            public void mo3518g(int i3) {
                ViewHolder m3759R;
                View childAt = RecyclerView.this.getChildAt(i3);
                if (childAt != null && (m3759R = RecyclerView.m3759R(childAt)) != null) {
                    if (m3759R.isTmpDetached() && !m3759R.shouldIgnore()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("called detach on an already detached child ");
                        sb.append(m3759R);
                        throw new IllegalArgumentException(C0000a.m6c(RecyclerView.this, sb));
                    }
                    m3759R.addFlags(256);
                }
                RecyclerView.this.detachViewFromParent(i3);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            /* renamed from: h */
            public void mo3519h(View view) {
                ViewHolder m3759R = RecyclerView.m3759R(view);
                if (m3759R != null) {
                    m3759R.onLeftHiddenState(RecyclerView.this);
                }
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            /* renamed from: i */
            public void mo3520i(View view, int i3) {
                RecyclerView.this.addView(view, i3);
                RecyclerView recyclerView = RecyclerView.this;
                Objects.requireNonNull(recyclerView);
                ViewHolder m3759R = RecyclerView.m3759R(view);
                recyclerView.mo3792b0(view);
                Adapter adapter = recyclerView.f5517m;
                if (adapter != null && m3759R != null) {
                    adapter.onViewAttachedToWindow(m3759R);
                }
                List<OnChildAttachStateChangeListener> list = recyclerView.f5474D;
                if (list == null) {
                    return;
                }
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        return;
                    } else {
                        recyclerView.f5474D.get(size).mo3633d(view);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            /* renamed from: j */
            public void mo3521j(int i3) {
                View childAt = RecyclerView.this.getChildAt(i3);
                if (childAt != null) {
                    RecyclerView.this.m3821u(childAt);
                    childAt.clearAnimation();
                }
                RecyclerView.this.removeViewAt(i3);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            /* renamed from: k */
            public void mo3522k(View view, int i3, ViewGroup.LayoutParams layoutParams) {
                ViewHolder m3759R = RecyclerView.m3759R(view);
                if (m3759R != null) {
                    if (!m3759R.isTmpDetached() && !m3759R.shouldIgnore()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Called attach on a child which is not detached: ");
                        sb.append(m3759R);
                        throw new IllegalArgumentException(C0000a.m6c(RecyclerView.this, sb));
                    }
                    m3759R.clearTmpDetachFlag();
                }
                RecyclerView.this.attachViewToParent(view, i3, layoutParams);
            }
        });
        if (ViewCompat.m2229v(this) == 0) {
            ViewCompat.m2218p0(this, 8);
        }
        if (ViewCompat.m2227u(this) == 0) {
            ViewCompat.m2216o0(this, 1);
        }
        this.f5473C = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(this));
        int[] iArr = C0495R.styleable.f5165a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        ViewCompat.m2194d0(this, context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(PrimitiveArrayBuilder.MAX_CHUNK_SIZE);
        }
        this.f5507h = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(C0000a.m6c(this, C0000a.m24u("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            c2 = 2;
            new FastScroller(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C2507R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(C2507R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(C2507R.dimen.fastscroll_margin));
        } else {
            c2 = 2;
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    Class<? extends U> asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(LayoutManager.class);
                    try {
                        constructor = asSubclass.getConstructor(f5467G0);
                        Object[] objArr2 = new Object[4];
                        objArr2[0] = context;
                        objArr2[1] = attributeSet;
                        objArr2[c2] = Integer.valueOf(i2);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e2) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e3) {
                            e3.initCause(e2);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e3);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((LayoutManager) constructor.newInstance(objArr));
                } catch (ClassCastException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e4);
                } catch (ClassNotFoundException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e6);
                } catch (InstantiationException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                } catch (InvocationTargetException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e8);
                }
            }
        }
        int[] iArr2 = f5463C0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        ViewCompat.m2194d0(this, context, iArr2, attributeSet, obtainStyledAttributes2, i2, 0);
        boolean z = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
    }

    @RestrictTo
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.recyclerview.widget.RecyclerView.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };

        /* renamed from: d */
        public Parcelable f5605d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5605d = parcel.readParcelable(classLoader == null ? LayoutManager.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f3875b, i2);
            parcel.writeParcelable(this.f5605d, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public ViewHolder f5585a;

        /* renamed from: b */
        public final Rect f5586b;

        /* renamed from: c */
        public boolean f5587c;

        /* renamed from: d */
        public boolean f5588d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5586b = new Rect();
            this.f5587c = true;
            this.f5588d = false;
        }

        /* renamed from: a */
        public int m3910a() {
            return this.f5585a.getLayoutPosition();
        }

        /* renamed from: b */
        public boolean m3911b() {
            return this.f5585a.isUpdated();
        }

        /* renamed from: c */
        public boolean m3912c() {
            return this.f5585a.isRemoved();
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.f5586b = new Rect();
            this.f5587c = true;
            this.f5588d = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5586b = new Rect();
            this.f5587c = true;
            this.f5588d = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5586b = new Rect();
            this.f5587c = true;
            this.f5588d = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.f5586b = new Rect();
            this.f5587c = true;
            this.f5588d = false;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutManager layoutManager = this.f5519n;
        if (layoutManager != null) {
            return layoutManager.mo3553O(layoutParams);
        }
        throw new IllegalStateException(C0000a.m6c(this, C0000a.m24u("RecyclerView has no LayoutManager")));
    }
}
