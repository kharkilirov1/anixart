package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.C0666R;
import androidx.viewpager2.adapter.StatefulAdapter;
import androidx.viewpager2.widget.ScrollEventAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: b */
    public final Rect f6640b;

    /* renamed from: c */
    public final Rect f6641c;

    /* renamed from: d */
    public CompositeOnPageChangeCallback f6642d;

    /* renamed from: e */
    public int f6643e;

    /* renamed from: f */
    public boolean f6644f;

    /* renamed from: g */
    public RecyclerView.AdapterDataObserver f6645g;

    /* renamed from: h */
    public LinearLayoutManager f6646h;

    /* renamed from: i */
    public int f6647i;

    /* renamed from: j */
    public Parcelable f6648j;

    /* renamed from: k */
    public RecyclerView f6649k;

    /* renamed from: l */
    public PagerSnapHelper f6650l;

    /* renamed from: m */
    public ScrollEventAdapter f6651m;

    /* renamed from: n */
    public CompositeOnPageChangeCallback f6652n;

    /* renamed from: o */
    public FakeDrag f6653o;

    /* renamed from: p */
    public PageTransformerAdapter f6654p;

    /* renamed from: q */
    public RecyclerView.ItemAnimator f6655q;

    /* renamed from: r */
    public boolean f6656r;

    /* renamed from: s */
    public boolean f6657s;

    /* renamed from: t */
    public int f6658t;

    /* renamed from: u */
    public AccessibilityProvider f6659u;

    public abstract class AccessibilityProvider {
        public AccessibilityProvider(ViewPager2 viewPager2, C06761 c06761) {
        }

        /* renamed from: a */
        public boolean mo4395a(int i2) {
            return false;
        }

        /* renamed from: b */
        public boolean mo4396b(int i2, Bundle bundle) {
            return false;
        }

        /* renamed from: c */
        public void mo4397c(@Nullable RecyclerView.Adapter<?> adapter) {
        }

        /* renamed from: d */
        public void mo4398d(@Nullable RecyclerView.Adapter<?> adapter) {
        }

        /* renamed from: e */
        public String mo4399e() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: f */
        public void mo4400f(@NonNull CompositeOnPageChangeCallback compositeOnPageChangeCallback, @NonNull RecyclerView recyclerView) {
        }

        /* renamed from: g */
        public void mo4401g(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* renamed from: h */
        public void mo4402h(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        /* renamed from: i */
        public boolean mo4403i(int i2) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: j */
        public boolean mo4404j(int i2, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: k */
        public void mo4405k() {
        }

        /* renamed from: l */
        public CharSequence mo4406l() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: m */
        public void mo4407m(@NonNull AccessibilityEvent accessibilityEvent) {
        }

        /* renamed from: n */
        public void mo4408n() {
        }

        /* renamed from: o */
        public void mo4409o() {
        }

        /* renamed from: p */
        public void mo4410p() {
        }

        /* renamed from: q */
        public void mo4411q() {
        }
    }

    public class BasicAccessibilityProvider extends AccessibilityProvider {

        /* renamed from: a */
        public final /* synthetic */ ViewPager2 f6663a;

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        /* renamed from: a */
        public boolean mo4395a(int i2) {
            return (i2 == 8192 || i2 == 4096) && !this.f6663a.f6657s;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        /* renamed from: h */
        public void mo4402h(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (this.f6663a.f6657s) {
                return;
            }
            accessibilityNodeInfoCompat.m2509o(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3750i);
            accessibilityNodeInfoCompat.m2509o(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3749h);
            accessibilityNodeInfoCompat.f3743a.setScrollable(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        /* renamed from: i */
        public boolean mo4403i(int i2) {
            if (mo4395a(i2)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        /* renamed from: l */
        public CharSequence mo4406l() {
            return "androidx.viewpager.widget.ViewPager";
        }
    }

    public static abstract class DataSetChangeObserver extends RecyclerView.AdapterDataObserver {
        public DataSetChangeObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: b */
        public final void mo3411b(int i2, int i3) {
            mo3410a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: c */
        public final void mo3412c(int i2, int i3, @Nullable Object obj) {
            mo3410a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: d */
        public final void mo3413d(int i2, int i3) {
            mo3410a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: e */
        public final void mo3414e(int i2, int i3, int i4) {
            mo3410a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: f */
        public final void mo3415f(int i2, int i3) {
            mo3410a();
        }

        public DataSetChangeObserver(C06761 c06761) {
        }
    }

    public class LinearLayoutManagerImpl extends LinearLayoutManager {
        public LinearLayoutManagerImpl(Context context) {
            super(1, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        /* renamed from: K0 */
        public boolean mo3865K0(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, int i2, @Nullable Bundle bundle) {
            return ViewPager2.this.f6659u.mo4395a(i2) ? ViewPager2.this.f6659u.mo4403i(i2) : super.mo3865K0(recycler, state, i2, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        /* renamed from: Q0 */
        public boolean mo3870Q0(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* renamed from: g1 */
        public void mo3684g1(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.mo3684g1(state, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        /* renamed from: x0 */
        public void mo3903x0(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.mo3903x0(recycler, state, accessibilityNodeInfoCompat);
            ViewPager2.this.f6659u.mo4402h(accessibilityNodeInfoCompat);
        }
    }

    @IntRange
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface OffscreenPageLimit {
    }

    public static abstract class OnPageChangeCallback {
        public void onPageScrollStateChanged(int i2) {
        }

        public void onPageScrolled(int i2, float f2, @Px int i3) {
        }

        public void onPageSelected(int i2) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Orientation {
    }

    public class PageAwareAccessibilityProvider extends AccessibilityProvider {

        /* renamed from: a */
        public final AccessibilityViewCommand f6665a;

        /* renamed from: b */
        public final AccessibilityViewCommand f6666b;

        /* renamed from: c */
        public RecyclerView.AdapterDataObserver f6667c;

        public PageAwareAccessibilityProvider() {
            super(ViewPager2.this, null);
            this.f6665a = new AccessibilityViewCommand() { // from class: androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.1
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                /* renamed from: d */
                public boolean mo2531d(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                    PageAwareAccessibilityProvider.this.m4412r(((ViewPager2) view).getCurrentItem() + 1);
                    return true;
                }
            };
            this.f6666b = new AccessibilityViewCommand() { // from class: androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.2
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                /* renamed from: d */
                public boolean mo2531d(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                    PageAwareAccessibilityProvider.this.m4412r(((ViewPager2) view).getCurrentItem() - 1);
                    return true;
                }
            };
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        /* renamed from: b */
        public boolean mo4396b(int i2, Bundle bundle) {
            return i2 == 8192 || i2 == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        /* renamed from: c */
        public void mo4397c(@Nullable RecyclerView.Adapter<?> adapter) {
            m4413s();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(this.f6667c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        /* renamed from: d */
        public void mo4398d(@Nullable RecyclerView.Adapter<?> adapter) {
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(this.f6667c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        /* renamed from: e */
        public String mo4399e() {
            return "androidx.viewpager.widget.ViewPager";
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        /* renamed from: f */
        public void mo4400f(@NonNull CompositeOnPageChangeCallback compositeOnPageChangeCallback, @NonNull RecyclerView recyclerView) {
            ViewCompat.m2216o0(recyclerView, 2);
            this.f6667c = new DataSetChangeObserver() { // from class: androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.3
                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                /* renamed from: a */
                public void mo3410a() {
                    PageAwareAccessibilityProvider.this.m4413s();
                }
            };
            if (ViewCompat.m2227u(ViewPager2.this) == 0) {
                ViewCompat.m2216o0(ViewPager2.this, 1);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo4401g(android.view.accessibility.AccessibilityNodeInfo r6) {
            /*
                r5 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = androidx.viewpager2.widget.ViewPager2.this
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L2a
                androidx.viewpager2.widget.ViewPager2 r0 = androidx.viewpager2.widget.ViewPager2.this
                int r0 = r0.getOrientation()
                if (r0 != r1) goto L1d
                androidx.viewpager2.widget.ViewPager2 r0 = androidx.viewpager2.widget.ViewPager2.this
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
                int r0 = r0.getItemCount()
                goto L2b
            L1d:
                androidx.viewpager2.widget.ViewPager2 r0 = androidx.viewpager2.widget.ViewPager2.this
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
                int r0 = r0.getItemCount()
                r3 = r0
                r0 = 0
                goto L2c
            L2a:
                r0 = 0
            L2b:
                r3 = 0
            L2c:
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat
                r4.<init>(r6)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.m2518a(r0, r3, r2, r2)
                r4.m2511q(r0)
                androidx.viewpager2.widget.ViewPager2 r0 = androidx.viewpager2.widget.ViewPager2.this
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
                if (r0 != 0) goto L41
                goto L66
            L41:
                int r0 = r0.getItemCount()
                if (r0 == 0) goto L66
                androidx.viewpager2.widget.ViewPager2 r2 = androidx.viewpager2.widget.ViewPager2.this
                boolean r3 = r2.f6657s
                if (r3 != 0) goto L4e
                goto L66
            L4e:
                int r2 = r2.f6643e
                if (r2 <= 0) goto L57
                r2 = 8192(0x2000, float:1.148E-41)
                r6.addAction(r2)
            L57:
                androidx.viewpager2.widget.ViewPager2 r2 = androidx.viewpager2.widget.ViewPager2.this
                int r2 = r2.f6643e
                int r0 = r0 - r1
                if (r2 >= r0) goto L63
                r0 = 4096(0x1000, float:5.74E-42)
                r6.addAction(r0)
            L63:
                r6.setScrollable(r1)
            L66:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.mo4401g(android.view.accessibility.AccessibilityNodeInfo):void");
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        /* renamed from: j */
        public boolean mo4404j(int i2, Bundle bundle) {
            if (!(i2 == 8192 || i2 == 4096)) {
                throw new IllegalStateException();
            }
            m4412r(i2 == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        /* renamed from: k */
        public void mo4405k() {
            m4413s();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        /* renamed from: m */
        public void mo4407m(@NonNull AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        /* renamed from: n */
        public void mo4408n() {
            m4413s();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        /* renamed from: o */
        public void mo4409o() {
            m4413s();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        /* renamed from: p */
        public void mo4410p() {
            m4413s();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        /* renamed from: q */
        public void mo4411q() {
            m4413s();
        }

        /* renamed from: r */
        public void m4412r(int i2) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f6657s) {
                viewPager2.m4392f(i2, true);
            }
        }

        /* renamed from: s */
        public void m4413s() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i2 = R.id.accessibilityActionPageLeft;
            ViewCompat.m2186Z(viewPager2, R.id.accessibilityActionPageLeft);
            ViewCompat.m2188a0(R.id.accessibilityActionPageRight, viewPager2);
            ViewCompat.m2177Q(viewPager2, 0);
            ViewCompat.m2188a0(R.id.accessibilityActionPageUp, viewPager2);
            ViewCompat.m2177Q(viewPager2, 0);
            ViewCompat.m2188a0(R.id.accessibilityActionPageDown, viewPager2);
            ViewCompat.m2177Q(viewPager2, 0);
            if (ViewPager2.this.getAdapter() == null || (itemCount = ViewPager2.this.getAdapter().getItemCount()) == 0) {
                return;
            }
            ViewPager2 viewPager22 = ViewPager2.this;
            if (viewPager22.f6657s) {
                if (viewPager22.getOrientation() != 0) {
                    if (ViewPager2.this.f6643e < itemCount - 1) {
                        ViewCompat.m2190b0(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageDown, null), null, this.f6665a);
                    }
                    if (ViewPager2.this.f6643e > 0) {
                        ViewCompat.m2190b0(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageUp, null), null, this.f6666b);
                        return;
                    }
                    return;
                }
                boolean m4388b = ViewPager2.this.m4388b();
                int i3 = m4388b ? R.id.accessibilityActionPageLeft : R.id.accessibilityActionPageRight;
                if (m4388b) {
                    i2 = R.id.accessibilityActionPageRight;
                }
                if (ViewPager2.this.f6643e < itemCount - 1) {
                    ViewCompat.m2190b0(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i3, null), null, this.f6665a);
                }
                if (ViewPager2.this.f6643e > 0) {
                    ViewCompat.m2190b0(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i2, null), null, this.f6666b);
                }
            }
        }
    }

    public interface PageTransformer {
        /* renamed from: a */
        void mo4381a(@NonNull View view, float f2);
    }

    public class PagerSnapHelperImpl extends PagerSnapHelper {
        public PagerSnapHelperImpl() {
        }

        @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
        @Nullable
        /* renamed from: e */
        public View mo3727e(RecyclerView.LayoutManager layoutManager) {
            if (ViewPager2.this.f6653o.f6621a.f6636m) {
                return null;
            }
            return super.mo3727e(layoutManager);
        }
    }

    public class RecyclerViewImpl extends RecyclerView {
        public RecyclerViewImpl(@NonNull Context context) {
            super(context, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        @RequiresApi
        public CharSequence getAccessibilityClassName() {
            AccessibilityProvider accessibilityProvider = ViewPager2.this.f6659u;
            Objects.requireNonNull(accessibilityProvider);
            return accessibilityProvider instanceof BasicAccessibilityProvider ? ViewPager2.this.f6659u.mo4406l() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f6643e);
            accessibilityEvent.setToIndex(ViewPager2.this.f6643e);
            ViewPager2.this.f6659u.mo4407m(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f6657s && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f6657s && super.onTouchEvent(motionEvent);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ScrollState {
    }

    public static class SmoothScrollToPosition implements Runnable {

        /* renamed from: b */
        public final int f6677b;

        /* renamed from: c */
        public final RecyclerView f6678c;

        public SmoothScrollToPosition(int i2, RecyclerView recyclerView) {
            this.f6677b = i2;
            this.f6678c = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6678c.m3826w0(this.f6677b);
        }
    }

    public ViewPager2(@NonNull Context context) {
        super(context);
        this.f6640b = new Rect();
        this.f6641c = new Rect();
        this.f6642d = new CompositeOnPageChangeCallback(3);
        this.f6644f = false;
        this.f6645g = new DataSetChangeObserver() { // from class: androidx.viewpager2.widget.ViewPager2.1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            /* renamed from: a */
            public void mo3410a() {
                ViewPager2 viewPager2 = ViewPager2.this;
                viewPager2.f6644f = true;
                viewPager2.f6651m.f6635l = true;
            }
        };
        this.f6647i = -1;
        this.f6655q = null;
        this.f6656r = false;
        this.f6657s = true;
        this.f6658t = -1;
        m4387a(context, null);
    }

    /* renamed from: a */
    public final void m4387a(Context context, AttributeSet attributeSet) {
        this.f6659u = new PageAwareAccessibilityProvider();
        RecyclerViewImpl recyclerViewImpl = new RecyclerViewImpl(context);
        this.f6649k = recyclerViewImpl;
        recyclerViewImpl.setId(ViewCompat.m2203i());
        this.f6649k.setDescendantFocusability(131072);
        LinearLayoutManagerImpl linearLayoutManagerImpl = new LinearLayoutManagerImpl(context);
        this.f6646h = linearLayoutManagerImpl;
        this.f6649k.setLayoutManager(linearLayoutManagerImpl);
        this.f6649k.setScrollingTouchSlop(1);
        int[] iArr = C0666R.styleable.f6596a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, null, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.f6649k.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f6649k.m3804l(new RecyclerView.OnChildAttachStateChangeListener(this) { // from class: androidx.viewpager2.widget.ViewPager2.4
                @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
                /* renamed from: b */
                public void mo3632b(@NonNull View view) {
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
                /* renamed from: d */
                public void mo3633d(@NonNull View view) {
                    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                    if (((ViewGroup.MarginLayoutParams) layoutParams).width != -1 || ((ViewGroup.MarginLayoutParams) layoutParams).height != -1) {
                        throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                    }
                }
            });
            ScrollEventAdapter scrollEventAdapter = new ScrollEventAdapter(this);
            this.f6651m = scrollEventAdapter;
            this.f6653o = new FakeDrag(this, scrollEventAdapter, this.f6649k);
            PagerSnapHelperImpl pagerSnapHelperImpl = new PagerSnapHelperImpl();
            this.f6650l = pagerSnapHelperImpl;
            pagerSnapHelperImpl.m3952b(this.f6649k);
            this.f6649k.m3806m(this.f6651m);
            CompositeOnPageChangeCallback compositeOnPageChangeCallback = new CompositeOnPageChangeCallback(3);
            this.f6652n = compositeOnPageChangeCallback;
            this.f6651m.f6624a = compositeOnPageChangeCallback;
            OnPageChangeCallback onPageChangeCallback = new OnPageChangeCallback() { // from class: androidx.viewpager2.widget.ViewPager2.2
                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageScrollStateChanged(int i2) {
                    if (i2 == 0) {
                        ViewPager2.this.m4394h();
                    }
                }

                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageSelected(int i2) {
                    ViewPager2 viewPager2 = ViewPager2.this;
                    if (viewPager2.f6643e != i2) {
                        viewPager2.f6643e = i2;
                        viewPager2.f6659u.mo4409o();
                    }
                }
            };
            OnPageChangeCallback onPageChangeCallback2 = new OnPageChangeCallback() { // from class: androidx.viewpager2.widget.ViewPager2.3
                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageSelected(int i2) {
                    ViewPager2.this.clearFocus();
                    if (ViewPager2.this.hasFocus()) {
                        ViewPager2.this.f6649k.requestFocus(2);
                    }
                }
            };
            this.f6652n.f6619a.add(onPageChangeCallback);
            this.f6652n.f6619a.add(onPageChangeCallback2);
            this.f6659u.mo4400f(this.f6652n, this.f6649k);
            CompositeOnPageChangeCallback compositeOnPageChangeCallback2 = this.f6652n;
            compositeOnPageChangeCallback2.f6619a.add(this.f6642d);
            PageTransformerAdapter pageTransformerAdapter = new PageTransformerAdapter(this.f6646h);
            this.f6654p = pageTransformerAdapter;
            this.f6652n.f6619a.add(pageTransformerAdapter);
            RecyclerView recyclerView = this.f6649k;
            attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: b */
    public boolean m4388b() {
        return this.f6646h.m3885b0() == 1;
    }

    /* renamed from: c */
    public void m4389c(@NonNull OnPageChangeCallback onPageChangeCallback) {
        this.f6642d.f6619a.add(onPageChangeCallback);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        return this.f6649k.canScrollHorizontally(i2);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i2) {
        return this.f6649k.canScrollVertically(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final void m4390d() {
        RecyclerView.Adapter adapter;
        if (this.f6647i == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f6648j;
        if (parcelable != null) {
            if (adapter instanceof StatefulAdapter) {
                ((StatefulAdapter) adapter).mo4375c(parcelable);
            }
            this.f6648j = null;
        }
        int max = Math.max(0, Math.min(this.f6647i, adapter.getItemCount() - 1));
        this.f6643e = max;
        this.f6647i = -1;
        this.f6649k.m3818s0(max);
        this.f6659u.mo4405k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i2 = ((SavedState) parcelable).f6674b;
            sparseArray.put(this.f6649k.getId(), sparseArray.get(i2));
            sparseArray.remove(i2);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m4390d();
    }

    /* renamed from: e */
    public void m4391e(int i2, boolean z) {
        if (this.f6653o.f6621a.f6636m) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        m4392f(i2, z);
    }

    /* renamed from: f */
    public void m4392f(int i2, boolean z) {
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.f6647i != -1) {
                this.f6647i = Math.max(i2, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i2, 0), adapter.getItemCount() - 1);
        int i3 = this.f6643e;
        if (min == i3) {
            if (this.f6651m.f6629f == 0) {
                return;
            }
        }
        if (min == i3 && z) {
            return;
        }
        double d = i3;
        this.f6643e = min;
        this.f6659u.mo4409o();
        ScrollEventAdapter scrollEventAdapter = this.f6651m;
        if (!(scrollEventAdapter.f6629f == 0)) {
            scrollEventAdapter.m4385h();
            ScrollEventAdapter.ScrollEventValues scrollEventValues = scrollEventAdapter.f6630g;
            d = scrollEventValues.f6637a + scrollEventValues.f6638b;
        }
        ScrollEventAdapter scrollEventAdapter2 = this.f6651m;
        scrollEventAdapter2.f6628e = z ? 2 : 3;
        scrollEventAdapter2.f6636m = false;
        boolean z2 = scrollEventAdapter2.f6632i != min;
        scrollEventAdapter2.f6632i = min;
        scrollEventAdapter2.m4383f(2);
        if (z2) {
            scrollEventAdapter2.m4382e(min);
        }
        if (!z) {
            this.f6649k.m3818s0(min);
            return;
        }
        double d2 = min;
        if (Math.abs(d2 - d) <= 3.0d) {
            this.f6649k.m3826w0(min);
            return;
        }
        this.f6649k.m3818s0(d2 > d ? min - 3 : min + 3);
        RecyclerView recyclerView = this.f6649k;
        recyclerView.post(new SmoothScrollToPosition(min, recyclerView));
    }

    /* renamed from: g */
    public void m4393g(@NonNull OnPageChangeCallback onPageChangeCallback) {
        this.f6642d.f6619a.remove(onPageChangeCallback);
    }

    @Override // android.view.ViewGroup, android.view.View
    @RequiresApi
    public CharSequence getAccessibilityClassName() {
        AccessibilityProvider accessibilityProvider = this.f6659u;
        Objects.requireNonNull(accessibilityProvider);
        return accessibilityProvider instanceof PageAwareAccessibilityProvider ? this.f6659u.mo4399e() : super.getAccessibilityClassName();
    }

    @Nullable
    public RecyclerView.Adapter getAdapter() {
        return this.f6649k.getAdapter();
    }

    public int getCurrentItem() {
        return this.f6643e;
    }

    public int getItemDecorationCount() {
        return this.f6649k.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f6658t;
    }

    public int getOrientation() {
        return this.f6646h.f5413s;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f6649k;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f6651m.f6629f;
    }

    /* renamed from: h */
    public void m4394h() {
        PagerSnapHelper pagerSnapHelper = this.f6650l;
        if (pagerSnapHelper == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View mo3727e = pagerSnapHelper.mo3727e(this.f6646h);
        if (mo3727e == null) {
            return;
        }
        int m3894i0 = this.f6646h.m3894i0(mo3727e);
        if (m3894i0 != this.f6643e && getScrollState() == 0) {
            this.f6652n.onPageSelected(m3894i0);
        }
        this.f6644f = false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f6659u.mo4401g(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int measuredWidth = this.f6649k.getMeasuredWidth();
        int measuredHeight = this.f6649k.getMeasuredHeight();
        this.f6640b.left = getPaddingLeft();
        this.f6640b.right = (i4 - i2) - getPaddingRight();
        this.f6640b.top = getPaddingTop();
        this.f6640b.bottom = (i5 - i3) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f6640b, this.f6641c);
        RecyclerView recyclerView = this.f6649k;
        Rect rect = this.f6641c;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f6644f) {
            m4394h();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        measureChild(this.f6649k, i2, i3);
        int measuredWidth = this.f6649k.getMeasuredWidth();
        int measuredHeight = this.f6649k.getMeasuredHeight();
        int measuredState = this.f6649k.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, measuredState), ViewGroup.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f6647i = savedState.f6675c;
        this.f6648j = savedState.f6676d;
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6674b = this.f6649k.getId();
        int i2 = this.f6647i;
        if (i2 == -1) {
            i2 = this.f6643e;
        }
        savedState.f6675c = i2;
        Parcelable parcelable = this.f6648j;
        if (parcelable != null) {
            savedState.f6676d = parcelable;
        } else {
            Object adapter = this.f6649k.getAdapter();
            if (adapter instanceof StatefulAdapter) {
                savedState.f6676d = ((StatefulAdapter) adapter).mo4374a();
            }
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    @RequiresApi
    public boolean performAccessibilityAction(int i2, Bundle bundle) {
        return this.f6659u.mo4396b(i2, bundle) ? this.f6659u.mo4404j(i2, bundle) : super.performAccessibilityAction(i2, bundle);
    }

    public void setAdapter(@Nullable RecyclerView.Adapter adapter) {
        RecyclerView.Adapter<?> adapter2 = this.f6649k.getAdapter();
        this.f6659u.mo4398d(adapter2);
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.f6645g);
        }
        this.f6649k.setAdapter(adapter);
        this.f6643e = 0;
        m4390d();
        this.f6659u.mo4397c(adapter);
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.f6645g);
        }
    }

    public void setCurrentItem(int i2) {
        m4391e(i2, true);
    }

    @Override // android.view.View
    @RequiresApi
    public void setLayoutDirection(int i2) {
        super.setLayoutDirection(i2);
        this.f6659u.mo4408n();
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1 && i2 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f6658t = i2;
        this.f6649k.requestLayout();
    }

    public void setOrientation(int i2) {
        this.f6646h.m3675J1(i2);
        this.f6659u.mo4410p();
    }

    public void setPageTransformer(@Nullable PageTransformer pageTransformer) {
        if (pageTransformer != null) {
            if (!this.f6656r) {
                this.f6655q = this.f6649k.getItemAnimator();
                this.f6656r = true;
            }
            this.f6649k.setItemAnimator(null);
        } else if (this.f6656r) {
            this.f6649k.setItemAnimator(this.f6655q);
            this.f6655q = null;
            this.f6656r = false;
        }
        PageTransformerAdapter pageTransformerAdapter = this.f6654p;
        if (pageTransformer == pageTransformerAdapter.f6623b) {
            return;
        }
        pageTransformerAdapter.f6623b = pageTransformer;
        if (pageTransformer == null) {
            return;
        }
        ScrollEventAdapter scrollEventAdapter = this.f6651m;
        scrollEventAdapter.m4385h();
        ScrollEventAdapter.ScrollEventValues scrollEventValues = scrollEventAdapter.f6630g;
        double d = scrollEventValues.f6637a + scrollEventValues.f6638b;
        int i2 = (int) d;
        float f2 = (float) (d - i2);
        this.f6654p.onPageScrolled(i2, f2, Math.round(getPageSize() * f2));
    }

    public void setUserInputEnabled(boolean z) {
        this.f6657s = z;
        this.f6659u.mo4411q();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.viewpager2.widget.ViewPager2.SavedState.1
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return Build.VERSION.SDK_INT >= 24 ? new SavedState(parcel, null) : new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new SavedState(parcel, classLoader) : new SavedState(parcel);
            }
        };

        /* renamed from: b */
        public int f6674b;

        /* renamed from: c */
        public int f6675c;

        /* renamed from: d */
        public Parcelable f6676d;

        @RequiresApi
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6674b = parcel.readInt();
            this.f6675c = parcel.readInt();
            this.f6676d = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f6674b);
            parcel.writeInt(this.f6675c);
            parcel.writeParcelable(this.f6676d, i2);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f6674b = parcel.readInt();
            this.f6675c = parcel.readInt();
            this.f6676d = parcel.readParcelable(null);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
