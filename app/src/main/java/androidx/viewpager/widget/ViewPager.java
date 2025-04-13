package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinVersion;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* renamed from: f0 */
    public static final int[] f6520f0 = {R.attr.layout_gravity};

    /* renamed from: g0 */
    public static final Comparator<ItemInfo> f6521g0 = new Comparator<ItemInfo>() { // from class: androidx.viewpager.widget.ViewPager.1
        @Override // java.util.Comparator
        public int compare(ItemInfo itemInfo, ItemInfo itemInfo2) {
            return itemInfo.f6581b - itemInfo2.f6581b;
        }
    };

    /* renamed from: h0 */
    public static final Interpolator f6522h0 = new Interpolator() { // from class: androidx.viewpager.widget.ViewPager.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };

    /* renamed from: i0 */
    public static final ViewPositionComparator f6523i0 = new ViewPositionComparator();

    /* renamed from: A */
    public int f6524A;

    /* renamed from: B */
    public int f6525B;

    /* renamed from: C */
    public int f6526C;

    /* renamed from: D */
    public float f6527D;

    /* renamed from: E */
    public float f6528E;

    /* renamed from: F */
    public float f6529F;

    /* renamed from: G */
    public float f6530G;

    /* renamed from: H */
    public int f6531H;

    /* renamed from: I */
    public VelocityTracker f6532I;

    /* renamed from: J */
    public int f6533J;

    /* renamed from: K */
    public int f6534K;

    /* renamed from: L */
    public int f6535L;

    /* renamed from: M */
    public int f6536M;

    /* renamed from: N */
    public EdgeEffect f6537N;

    /* renamed from: O */
    public EdgeEffect f6538O;

    /* renamed from: P */
    public boolean f6539P;

    /* renamed from: Q */
    public boolean f6540Q;

    /* renamed from: R */
    public int f6541R;

    /* renamed from: S */
    public List<OnPageChangeListener> f6542S;

    /* renamed from: T */
    public OnPageChangeListener f6543T;

    /* renamed from: U */
    public OnPageChangeListener f6544U;

    /* renamed from: V */
    public List<OnAdapterChangeListener> f6545V;

    /* renamed from: W */
    public PageTransformer f6546W;

    /* renamed from: a0 */
    public int f6547a0;

    /* renamed from: b */
    public int f6548b;

    /* renamed from: b0 */
    public int f6549b0;

    /* renamed from: c */
    public final ArrayList<ItemInfo> f6550c;

    /* renamed from: c0 */
    public ArrayList<View> f6551c0;

    /* renamed from: d */
    public final ItemInfo f6552d;

    /* renamed from: d0 */
    public final Runnable f6553d0;

    /* renamed from: e */
    public final Rect f6554e;

    /* renamed from: e0 */
    public int f6555e0;

    /* renamed from: f */
    public PagerAdapter f6556f;

    /* renamed from: g */
    public int f6557g;

    /* renamed from: h */
    public int f6558h;

    /* renamed from: i */
    public Parcelable f6559i;

    /* renamed from: j */
    public ClassLoader f6560j;

    /* renamed from: k */
    public Scroller f6561k;

    /* renamed from: l */
    public boolean f6562l;

    /* renamed from: m */
    public PagerObserver f6563m;

    /* renamed from: n */
    public int f6564n;

    /* renamed from: o */
    public Drawable f6565o;

    /* renamed from: p */
    public int f6566p;

    /* renamed from: q */
    public int f6567q;

    /* renamed from: r */
    public float f6568r;

    /* renamed from: s */
    public float f6569s;

    /* renamed from: t */
    public int f6570t;

    /* renamed from: u */
    public boolean f6571u;

    /* renamed from: v */
    public boolean f6572v;

    /* renamed from: w */
    public boolean f6573w;

    /* renamed from: x */
    public int f6574x;

    /* renamed from: y */
    public boolean f6575y;

    /* renamed from: z */
    public boolean f6576z;

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DecorView {
    }

    public static class ItemInfo {

        /* renamed from: a */
        public Object f6580a;

        /* renamed from: b */
        public int f6581b;

        /* renamed from: c */
        public boolean f6582c;

        /* renamed from: d */
        public float f6583d;

        /* renamed from: e */
        public float f6584e;
    }

    public class MyAccessibilityDelegate extends AccessibilityDelegateCompat {
        public MyAccessibilityDelegate() {
            super(AccessibilityDelegateCompat.f3569c);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: c */
        public void mo2043c(View view, AccessibilityEvent accessibilityEvent) {
            PagerAdapter pagerAdapter;
            this.f3570a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            PagerAdapter pagerAdapter2 = ViewPager.this.f6556f;
            accessibilityEvent.setScrollable(pagerAdapter2 != null && pagerAdapter2.mo4336c() > 1);
            if (accessibilityEvent.getEventType() != 4096 || (pagerAdapter = ViewPager.this.f6556f) == null) {
                return;
            }
            accessibilityEvent.setItemCount(pagerAdapter.mo4336c());
            accessibilityEvent.setFromIndex(ViewPager.this.f6557g);
            accessibilityEvent.setToIndex(ViewPager.this.f6557g);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: d */
        public void mo2044d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f3570a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f3743a);
            accessibilityNodeInfoCompat.f3743a.setClassName(ViewPager.class.getName());
            PagerAdapter pagerAdapter = ViewPager.this.f6556f;
            accessibilityNodeInfoCompat.f3743a.setScrollable(pagerAdapter != null && pagerAdapter.mo4336c() > 1);
            if (ViewPager.this.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.f3743a.addAction(RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.f3743a.addAction(RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: g */
        public boolean mo2047g(View view, int i2, Bundle bundle) {
            if (super.mo2047g(view, i2, bundle)) {
                return true;
            }
            if (i2 == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f6557g + 1);
                return true;
            }
            if (i2 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.f6557g - 1);
            return true;
        }
    }

    public interface OnAdapterChangeListener {
        /* renamed from: a */
        void mo4342a(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2);
    }

    public interface OnPageChangeListener {
        /* renamed from: b */
        void mo4343b(int i2);

        /* renamed from: c */
        void mo4344c(int i2, float f2, @Px int i3);

        /* renamed from: d */
        void mo4345d(int i2);
    }

    public interface PageTransformer {
        /* renamed from: a */
        void mo4373a(@NonNull View view, float f2);
    }

    public class PagerObserver extends DataSetObserver {
        public PagerObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.m4352f();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.m4352f();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.viewpager.widget.ViewPager.SavedState.1
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
        public int f6593d;

        /* renamed from: e */
        public Parcelable f6594e;

        /* renamed from: f */
        public ClassLoader f6595f;

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("FragmentPager.SavedState{");
            m24u.append(Integer.toHexString(System.identityHashCode(this)));
            m24u.append(" position=");
            return C0000a.m18o(m24u, this.f6593d, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f3875b, i2);
            parcel.writeInt(this.f6593d);
            parcel.writeParcelable(this.f6594e, i2);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f6593d = parcel.readInt();
            this.f6594e = parcel.readParcelable(classLoader);
            this.f6595f = classLoader;
        }
    }

    public static class SimpleOnPageChangeListener implements OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        /* renamed from: b */
        public void mo4343b(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        /* renamed from: c */
        public void mo4344c(int i2, float f2, int i3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        /* renamed from: d */
        public void mo4345d(int i2) {
        }
    }

    public static class ViewPositionComparator implements Comparator<View> {
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z = layoutParams.f6585a;
            return z != layoutParams2.f6585a ? z ? 1 : -1 : layoutParams.f6589e - layoutParams2.f6589e;
        }
    }

    public ViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6550c = new ArrayList<>();
        this.f6552d = new ItemInfo();
        this.f6554e = new Rect();
        this.f6558h = -1;
        this.f6559i = null;
        this.f6560j = null;
        this.f6568r = -3.4028235E38f;
        this.f6569s = Float.MAX_VALUE;
        this.f6574x = 1;
        this.f6531H = -1;
        this.f6539P = true;
        this.f6553d0 = new Runnable() { // from class: androidx.viewpager.widget.ViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager viewPager = ViewPager.this;
                viewPager.m4365s(viewPager.f6557g);
            }
        };
        this.f6555e0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(PrimitiveArrayBuilder.MAX_CHUNK_SIZE);
        setFocusable(true);
        Context context2 = getContext();
        this.f6561k = new Scroller(context2, f6522h0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f2 = context2.getResources().getDisplayMetrics().density;
        this.f6526C = viewConfiguration.getScaledPagingTouchSlop();
        this.f6533J = (int) (400.0f * f2);
        this.f6534K = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f6537N = new EdgeEffect(context2);
        this.f6538O = new EdgeEffect(context2);
        this.f6535L = (int) (25.0f * f2);
        this.f6536M = (int) (2.0f * f2);
        this.f6524A = (int) (f2 * 16.0f);
        ViewCompat.m2196e0(this, new MyAccessibilityDelegate());
        if (ViewCompat.m2227u(this) == 0) {
            ViewCompat.m2216o0(this, 1);
        }
        ViewCompat.m2224s0(this, new OnApplyWindowInsetsListener() { // from class: androidx.viewpager.widget.ViewPager.4

            /* renamed from: a */
            public final Rect f6578a = new Rect();

            @Override // androidx.core.view.OnApplyWindowInsetsListener
            /* renamed from: a */
            public WindowInsetsCompat mo433a(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat m2180T = ViewCompat.m2180T(view, windowInsetsCompat);
                if (m2180T.m2430l()) {
                    return m2180T;
                }
                Rect rect = this.f6578a;
                rect.left = m2180T.m2426g();
                rect.top = m2180T.m2428i();
                rect.right = m2180T.m2427h();
                rect.bottom = m2180T.m2425f();
                int childCount = ViewPager.this.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    WindowInsetsCompat m2197f = ViewCompat.m2197f(ViewPager.this.getChildAt(i2), m2180T);
                    rect.left = Math.min(m2197f.m2426g(), rect.left);
                    rect.top = Math.min(m2197f.m2428i(), rect.top);
                    rect.right = Math.min(m2197f.m2427h(), rect.right);
                    rect.bottom = Math.min(m2197f.m2425f(), rect.bottom);
                }
                return m2180T.m2431m(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f6572v != z) {
            this.f6572v = z;
        }
    }

    /* renamed from: A */
    public final void m4346A() {
        if (this.f6549b0 != 0) {
            ArrayList<View> arrayList = this.f6551c0;
            if (arrayList == null) {
                this.f6551c0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.f6551c0.add(getChildAt(i2));
            }
            Collections.sort(this.f6551c0, f6523i0);
        }
    }

    /* renamed from: a */
    public ItemInfo m4347a(int i2, int i3) {
        ItemInfo itemInfo = new ItemInfo();
        itemInfo.f6581b = i2;
        itemInfo.f6580a = this.f6556f.mo3075f(this, i2);
        Objects.requireNonNull(this.f6556f);
        itemInfo.f6583d = 1.0f;
        if (i3 < 0 || i3 >= this.f6550c.size()) {
            this.f6550c.add(itemInfo);
        } else {
            this.f6550c.add(i3, itemInfo);
        }
        return itemInfo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        ItemInfo m4355i;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (m4355i = m4355i(childAt)) != null && m4355i.f6581b == this.f6557g) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        ItemInfo m4355i;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (m4355i = m4355i(childAt)) != null && m4355i.f6581b == this.f6557g) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean z = layoutParams2.f6585a | (view.getClass().getAnnotation(DecorView.class) != null);
        layoutParams2.f6585a = z;
        if (!this.f6571u) {
            super.addView(view, i2, layoutParams);
        } else {
            if (z) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.f6588d = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    /* renamed from: b */
    public void m4348b(@NonNull OnPageChangeListener onPageChangeListener) {
        if (this.f6542S == null) {
            this.f6542S = new ArrayList();
        }
        this.f6542S.add(onPageChangeListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m4349c(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto La
            goto L63
        La:
            if (r0 == 0) goto L64
            android.view.ViewParent r4 = r0.getParent()
        L10:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1d
            if (r4 != r6) goto L18
            r4 = 1
            goto L1e
        L18:
            android.view.ViewParent r4 = r4.getParent()
            goto L10
        L1d:
            r4 = 0
        L1e:
            if (r4 != 0) goto L64
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L34:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L4d
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L34
        L4d:
            java.lang.String r0 = "arrowScroll tried to find focus based on non-child current focused view "
            java.lang.StringBuilder r0 = p000a.C0000a.m24u(r0)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
        L63:
            r0 = r3
        L64:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto Lb5
            if (r3 == r0) goto Lb5
            if (r7 != r5) goto L95
            android.graphics.Rect r1 = r6.f6554e
            android.graphics.Rect r1 = r6.m4354h(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f6554e
            android.graphics.Rect r2 = r6.m4354h(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L8f
            if (r1 < r2) goto L8f
            boolean r0 = r6.m4360n()
            goto L93
        L8f:
            boolean r0 = r3.requestFocus()
        L93:
            r2 = r0
            goto Lc8
        L95:
            if (r7 != r4) goto Lc8
            android.graphics.Rect r1 = r6.f6554e
            android.graphics.Rect r1 = r6.m4354h(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f6554e
            android.graphics.Rect r2 = r6.m4354h(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto Lb0
            if (r1 > r2) goto Lb0
            boolean r0 = r6.m4361o()
            goto L93
        Lb0:
            boolean r0 = r3.requestFocus()
            goto L93
        Lb5:
            if (r7 == r5) goto Lc4
            if (r7 != r1) goto Lba
            goto Lc4
        Lba:
            if (r7 == r4) goto Lbf
            r0 = 2
            if (r7 != r0) goto Lc8
        Lbf:
            boolean r2 = r6.m4361o()
            goto Lc8
        Lc4:
            boolean r2 = r6.m4360n()
        Lc8:
            if (r2 == 0) goto Ld1
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Ld1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m4349c(int):boolean");
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.f6556f == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f6568r)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.f6569s));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f6562l = true;
        if (this.f6561k.isFinished() || !this.f6561k.computeScrollOffset()) {
            m4351e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f6561k.getCurrX();
        int currY = this.f6561k.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m4362p(currX)) {
                this.f6561k.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ViewCompat.m2183W(this);
    }

    /* renamed from: d */
    public boolean m4350d(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && m4350d(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L5d
            int r0 = r6.getAction()
            if (r0 != 0) goto L5a
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L5a
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.m4349c(r4)
            goto L5b
        L2b:
            boolean r6 = r6.hasModifiers(r2)
            if (r6 == 0) goto L5a
            boolean r6 = r5.m4349c(r2)
            goto L5b
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.m4361o()
            goto L5b
        L41:
            r6 = 66
            boolean r6 = r5.m4349c(r6)
            goto L5b
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L53
            boolean r6 = r5.m4360n()
            goto L5b
        L53:
            r6 = 17
            boolean r6 = r5.m4349c(r6)
            goto L5b
        L5a:
            r6 = 0
        L5b:
            if (r6 == 0) goto L5e
        L5d:
            r1 = 1
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ItemInfo m4355i;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (m4355i = m4355i(childAt)) != null && m4355i.f6581b == this.f6557g && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.f6556f) != null && pagerAdapter.mo4336c() > 1)) {
            if (!this.f6537N.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f6568r * width);
                this.f6537N.setSize(height, width);
                z = false | this.f6537N.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f6538O.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f6569s + 1.0f)) * width2);
                this.f6538O.setSize(height2, width2);
                z |= this.f6538O.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f6537N.finish();
            this.f6538O.finish();
        }
        if (z) {
            ViewCompat.m2183W(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f6565o;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* renamed from: e */
    public final void m4351e(boolean z) {
        boolean z2 = this.f6555e0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f6561k.isFinished()) {
                this.f6561k.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f6561k.getCurrX();
                int currY = this.f6561k.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m4362p(currX);
                    }
                }
            }
        }
        this.f6573w = false;
        for (int i2 = 0; i2 < this.f6550c.size(); i2++) {
            ItemInfo itemInfo = this.f6550c.get(i2);
            if (itemInfo.f6582c) {
                itemInfo.f6582c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                ViewCompat.m2184X(this, this.f6553d0);
            } else {
                this.f6553d0.run();
            }
        }
    }

    /* renamed from: f */
    public void m4352f() {
        int mo4336c = this.f6556f.mo4336c();
        this.f6548b = mo4336c;
        boolean z = this.f6550c.size() < (this.f6574x * 2) + 1 && this.f6550c.size() < mo4336c;
        int i2 = this.f6557g;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < this.f6550c.size()) {
            ItemInfo itemInfo = this.f6550c.get(i3);
            int mo4337d = this.f6556f.mo4337d(itemInfo.f6580a);
            if (mo4337d != -1) {
                if (mo4337d == -2) {
                    this.f6550c.remove(i3);
                    i3--;
                    if (!z2) {
                        this.f6556f.mo3080k(this);
                        z2 = true;
                    }
                    this.f6556f.mo3073a(this, itemInfo.f6581b, itemInfo.f6580a);
                    int i4 = this.f6557g;
                    if (i4 == itemInfo.f6581b) {
                        i2 = Math.max(0, Math.min(i4, mo4336c - 1));
                    }
                } else {
                    int i5 = itemInfo.f6581b;
                    if (i5 != mo4337d) {
                        if (i5 == this.f6557g) {
                            i2 = mo4337d;
                        }
                        itemInfo.f6581b = mo4337d;
                    }
                }
                z = true;
            }
            i3++;
        }
        if (z2) {
            this.f6556f.mo3074b(this);
        }
        Collections.sort(this.f6550c, f6521g0);
        if (z) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i6).getLayoutParams();
                if (!layoutParams.f6585a) {
                    layoutParams.f6587c = 0.0f;
                }
            }
            m4371y(i2, false, true, 0);
            requestLayout();
        }
    }

    /* renamed from: g */
    public final void m4353g(int i2) {
        OnPageChangeListener onPageChangeListener = this.f6543T;
        if (onPageChangeListener != null) {
            onPageChangeListener.mo4343b(i2);
        }
        List<OnPageChangeListener> list = this.f6542S;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                OnPageChangeListener onPageChangeListener2 = this.f6542S.get(i3);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.mo4343b(i2);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.f6544U;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.mo4343b(i2);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Nullable
    public PagerAdapter getAdapter() {
        return this.f6556f;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        if (this.f6549b0 == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((LayoutParams) this.f6551c0.get(i3).getLayoutParams()).f6590f;
    }

    public int getCurrentItem() {
        return this.f6557g;
    }

    public int getOffscreenPageLimit() {
        return this.f6574x;
    }

    public int getPageMargin() {
        return this.f6564n;
    }

    /* renamed from: h */
    public final Rect m4354h(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: i */
    public ItemInfo m4355i(View view) {
        for (int i2 = 0; i2 < this.f6550c.size(); i2++) {
            ItemInfo itemInfo = this.f6550c.get(i2);
            if (this.f6556f.mo3076g(view, itemInfo.f6580a)) {
                return itemInfo;
            }
        }
        return null;
    }

    /* renamed from: j */
    public final ItemInfo m4356j() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f3 = clientWidth > 0 ? this.f6564n / clientWidth : 0.0f;
        ItemInfo itemInfo = null;
        float f4 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z = true;
        while (i4 < this.f6550c.size()) {
            ItemInfo itemInfo2 = this.f6550c.get(i4);
            if (!z && itemInfo2.f6581b != (i2 = i3 + 1)) {
                itemInfo2 = this.f6552d;
                itemInfo2.f6584e = f2 + f4 + f3;
                itemInfo2.f6581b = i2;
                Objects.requireNonNull(this.f6556f);
                itemInfo2.f6583d = 1.0f;
                i4--;
            }
            f2 = itemInfo2.f6584e;
            float f5 = itemInfo2.f6583d + f2 + f3;
            if (!z && scrollX < f2) {
                return itemInfo;
            }
            if (scrollX < f5 || i4 == this.f6550c.size() - 1) {
                return itemInfo2;
            }
            i3 = itemInfo2.f6581b;
            f4 = itemInfo2.f6583d;
            i4++;
            itemInfo = itemInfo2;
            z = false;
        }
        return itemInfo;
    }

    /* renamed from: k */
    public ItemInfo m4357k(int i2) {
        for (int i3 = 0; i3 < this.f6550c.size(); i3++) {
            ItemInfo itemInfo = this.f6550c.get(i3);
            if (itemInfo.f6581b == i2) {
                return itemInfo;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    @androidx.annotation.CallSuper
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m4358l(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f6541R
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.f6585a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f6586b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r12.f6543T
            if (r0 == 0) goto L72
            r0.mo4344c(r13, r14, r15)
        L72:
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r0 = r12.f6542S
            if (r0 == 0) goto L8d
            int r0 = r0.size()
            r3 = 0
        L7b:
            if (r3 >= r0) goto L8d
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r4 = r12.f6542S
            java.lang.Object r4 = r4.get(r3)
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r4 = (androidx.viewpager.widget.ViewPager.OnPageChangeListener) r4
            if (r4 == 0) goto L8a
            r4.mo4344c(r13, r14, r15)
        L8a:
            int r3 = r3 + 1
            goto L7b
        L8d:
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r12.f6544U
            if (r0 == 0) goto L94
            r0.mo4344c(r13, r14, r15)
        L94:
            androidx.viewpager.widget.ViewPager$PageTransformer r13 = r12.f6546W
            if (r13 == 0) goto Lc5
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        La0:
            if (r1 >= r14) goto Lc5
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = (androidx.viewpager.widget.ViewPager.LayoutParams) r0
            boolean r0 = r0.f6585a
            if (r0 == 0) goto Lb1
            goto Lc2
        Lb1:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$PageTransformer r3 = r12.f6546W
            r3.mo4373a(r15, r0)
        Lc2:
            int r1 = r1 + 1
            goto La0
        Lc5:
            r12.f6540Q = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m4358l(int, float, int):void");
    }

    /* renamed from: m */
    public final void m4359m(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f6531H) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f6527D = motionEvent.getX(i2);
            this.f6531H = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f6532I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: n */
    public boolean m4360n() {
        int i2 = this.f6557g;
        if (i2 <= 0) {
            return false;
        }
        m4370x(i2 - 1, true);
        return true;
    }

    /* renamed from: o */
    public boolean m4361o() {
        PagerAdapter pagerAdapter = this.f6556f;
        if (pagerAdapter == null || this.f6557g >= pagerAdapter.mo4336c() - 1) {
            return false;
        }
        m4370x(this.f6557g + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6539P = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f6553d0);
        Scroller scroller = this.f6561k;
        if (scroller != null && !scroller.isFinished()) {
            this.f6561k.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i2;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.f6564n <= 0 || this.f6565o == null || this.f6550c.size() <= 0 || this.f6556f == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f4 = this.f6564n / width;
        int i3 = 0;
        ItemInfo itemInfo = this.f6550c.get(0);
        float f5 = itemInfo.f6584e;
        int size = this.f6550c.size();
        int i4 = itemInfo.f6581b;
        int i5 = this.f6550c.get(size - 1).f6581b;
        while (i4 < i5) {
            while (true) {
                i2 = itemInfo.f6581b;
                if (i4 <= i2 || i3 >= size) {
                    break;
                }
                i3++;
                itemInfo = this.f6550c.get(i3);
            }
            if (i4 == i2) {
                float f6 = itemInfo.f6584e;
                float f7 = itemInfo.f6583d;
                f2 = (f6 + f7) * width;
                f5 = f6 + f7 + f4;
            } else {
                Objects.requireNonNull(this.f6556f);
                f2 = (f5 + 1.0f) * width;
                f5 = 1.0f + f4 + f5;
            }
            if (this.f6564n + f2 > scrollX) {
                f3 = f4;
                this.f6565o.setBounds(Math.round(f2), this.f6566p, Math.round(this.f6564n + f2), this.f6567q);
                this.f6565o.draw(canvas);
            } else {
                f3 = f4;
            }
            if (f2 > scrollX + r2) {
                return;
            }
            i4++;
            f4 = f3;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action == 3 || action == 1) {
            m4368v();
            return false;
        }
        if (action != 0) {
            if (this.f6575y) {
                return true;
            }
            if (this.f6576z) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f6529F = x;
            this.f6527D = x;
            float y = motionEvent.getY();
            this.f6530G = y;
            this.f6528E = y;
            this.f6531H = motionEvent.getPointerId(0);
            this.f6576z = false;
            this.f6562l = true;
            this.f6561k.computeScrollOffset();
            if (this.f6555e0 != 2 || Math.abs(this.f6561k.getFinalX() - this.f6561k.getCurrX()) <= this.f6536M) {
                m4351e(false);
                this.f6575y = false;
            } else {
                this.f6561k.abortAnimation();
                this.f6573w = false;
                m4365s(this.f6557g);
                this.f6575y = true;
                m4367u(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.f6531H;
            if (i2 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i2);
                float x2 = motionEvent.getX(findPointerIndex);
                float f2 = x2 - this.f6527D;
                float abs = Math.abs(f2);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f6530G);
                if (f2 != 0.0f) {
                    float f3 = this.f6527D;
                    if (!((f3 < ((float) this.f6525B) && f2 > 0.0f) || (f3 > ((float) (getWidth() - this.f6525B)) && f2 < 0.0f)) && m4350d(this, false, (int) f2, (int) x2, (int) y2)) {
                        this.f6527D = x2;
                        this.f6528E = y2;
                        this.f6576z = true;
                        return false;
                    }
                }
                int i3 = this.f6526C;
                if (abs > i3 && abs * 0.5f > abs2) {
                    this.f6575y = true;
                    m4367u(true);
                    setScrollState(1);
                    float f4 = this.f6529F;
                    float f5 = this.f6526C;
                    this.f6527D = f2 > 0.0f ? f4 + f5 : f4 - f5;
                    this.f6528E = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > i3) {
                    this.f6576z = true;
                }
                if (this.f6575y && m4363q(x2)) {
                    ViewCompat.m2183W(this);
                }
            }
        } else if (action == 6) {
            m4359m(motionEvent);
        }
        if (this.f6532I == null) {
            this.f6532I = VelocityTracker.obtain();
        }
        this.f6532I.addMovement(motionEvent);
        return this.f6575y;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        ItemInfo m4355i;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
        }
        while (i3 != i5) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (m4355i = m4355i(childAt)) != null && m4355i.f6581b == this.f6557g && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3875b);
        PagerAdapter pagerAdapter = this.f6556f;
        if (pagerAdapter != null) {
            pagerAdapter.mo3077h(savedState.f6594e, savedState.f6595f);
            m4371y(savedState.f6593d, false, true, 0);
        } else {
            this.f6558h = savedState.f6593d;
            this.f6559i = savedState.f6594e;
            this.f6560j = savedState.f6595f;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6593d = this.f6557g;
        PagerAdapter pagerAdapter = this.f6556f;
        if (pagerAdapter != null) {
            savedState.f6594e = pagerAdapter.mo3078i();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.f6564n;
            m4366t(i2, i4, i6, i6);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter = this.f6556f) == null || pagerAdapter.mo4336c() == 0) {
            return false;
        }
        if (this.f6532I == null) {
            this.f6532I = VelocityTracker.obtain();
        }
        this.f6532I.addMovement(motionEvent);
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action == 0) {
            this.f6561k.abortAnimation();
            this.f6573w = false;
            m4365s(this.f6557g);
            float x = motionEvent.getX();
            this.f6529F = x;
            this.f6527D = x;
            float y = motionEvent.getY();
            this.f6530G = y;
            this.f6528E = y;
            this.f6531H = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f6575y) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f6531H);
                    if (findPointerIndex == -1) {
                        z = m4368v();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.f6527D);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.f6528E);
                        if (abs > this.f6526C && abs > abs2) {
                            this.f6575y = true;
                            m4367u(true);
                            float f2 = this.f6529F;
                            this.f6527D = x2 - f2 > 0.0f ? f2 + this.f6526C : f2 - this.f6526C;
                            this.f6528E = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f6575y) {
                    z = false | m4363q(motionEvent.getX(motionEvent.findPointerIndex(this.f6531H)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f6527D = motionEvent.getX(actionIndex);
                    this.f6531H = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    m4359m(motionEvent);
                    this.f6527D = motionEvent.getX(motionEvent.findPointerIndex(this.f6531H));
                }
            } else if (this.f6575y) {
                m4369w(this.f6557g, true, 0, false);
                z = m4368v();
            }
        } else if (this.f6575y) {
            VelocityTracker velocityTracker = this.f6532I;
            velocityTracker.computeCurrentVelocity(1000, this.f6534K);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f6531H);
            this.f6573w = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            ItemInfo m4356j = m4356j();
            float f3 = clientWidth;
            int i2 = m4356j.f6581b;
            float f4 = ((scrollX / f3) - m4356j.f6584e) / (m4356j.f6583d + (this.f6564n / f3));
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f6531H)) - this.f6529F)) <= this.f6535L || Math.abs(xVelocity) <= this.f6533J) {
                i2 += (int) (f4 + (i2 >= this.f6557g ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                i2++;
            }
            if (this.f6550c.size() > 0) {
                i2 = Math.max(this.f6550c.get(0).f6581b, Math.min(i2, this.f6550c.get(r1.size() - 1).f6581b));
            }
            m4371y(i2, true, true, xVelocity);
            z = m4368v();
        }
        if (z) {
            ViewCompat.m2183W(this);
        }
        return true;
    }

    /* renamed from: p */
    public final boolean m4362p(int i2) {
        if (this.f6550c.size() == 0) {
            if (this.f6539P) {
                return false;
            }
            this.f6540Q = false;
            m4358l(0, 0.0f, 0);
            if (this.f6540Q) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        ItemInfo m4356j = m4356j();
        int clientWidth = getClientWidth();
        int i3 = this.f6564n;
        int i4 = clientWidth + i3;
        float f2 = clientWidth;
        int i5 = m4356j.f6581b;
        float f3 = ((i2 / f2) - m4356j.f6584e) / (m4356j.f6583d + (i3 / f2));
        this.f6540Q = false;
        m4358l(i5, f3, (int) (i4 * f3));
        if (this.f6540Q) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* renamed from: q */
    public final boolean m4363q(float f2) {
        boolean z;
        boolean z2;
        float f3 = this.f6527D - f2;
        this.f6527D = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.f6568r * clientWidth;
        float f5 = this.f6569s * clientWidth;
        boolean z3 = false;
        ItemInfo itemInfo = this.f6550c.get(0);
        ArrayList<ItemInfo> arrayList = this.f6550c;
        ItemInfo itemInfo2 = arrayList.get(arrayList.size() - 1);
        if (itemInfo.f6581b != 0) {
            f4 = itemInfo.f6584e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (itemInfo2.f6581b != this.f6556f.mo4336c() - 1) {
            f5 = itemInfo2.f6584e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f4) {
            if (z) {
                this.f6537N.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z2) {
                this.f6538O.onPull(Math.abs(scrollX - f5) / clientWidth);
                z3 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.f6527D = (scrollX - i2) + this.f6527D;
        scrollTo(i2, getScrollY());
        m4362p(i2);
        return z3;
    }

    /* renamed from: r */
    public void m4364r() {
        m4365s(this.f6557g);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f6571u) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r5 == r6) goto L28;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m4365s(int r15) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m4365s(int):void");
    }

    public void setAdapter(@Nullable PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.f6556f;
        if (pagerAdapter2 != null) {
            synchronized (pagerAdapter2) {
                pagerAdapter2.f6505b = null;
            }
            this.f6556f.mo3080k(this);
            for (int i2 = 0; i2 < this.f6550c.size(); i2++) {
                ItemInfo itemInfo = this.f6550c.get(i2);
                this.f6556f.mo3073a(this, itemInfo.f6581b, itemInfo.f6580a);
            }
            this.f6556f.mo3074b(this);
            this.f6550c.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((LayoutParams) getChildAt(i3).getLayoutParams()).f6585a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.f6557g = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter3 = this.f6556f;
        this.f6556f = pagerAdapter;
        this.f6548b = 0;
        if (pagerAdapter != null) {
            if (this.f6563m == null) {
                this.f6563m = new PagerObserver();
            }
            PagerAdapter pagerAdapter4 = this.f6556f;
            PagerObserver pagerObserver = this.f6563m;
            synchronized (pagerAdapter4) {
                pagerAdapter4.f6505b = pagerObserver;
            }
            this.f6573w = false;
            boolean z = this.f6539P;
            this.f6539P = true;
            this.f6548b = this.f6556f.mo4336c();
            if (this.f6558h >= 0) {
                this.f6556f.mo3077h(this.f6559i, this.f6560j);
                m4371y(this.f6558h, false, true, 0);
                this.f6558h = -1;
                this.f6559i = null;
                this.f6560j = null;
            } else if (z) {
                requestLayout();
            } else {
                m4365s(this.f6557g);
            }
        }
        List<OnAdapterChangeListener> list = this.f6545V;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f6545V.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f6545V.get(i4).mo4342a(this, pagerAdapter3, pagerAdapter);
        }
    }

    public void setCurrentItem(int i2) {
        this.f6573w = false;
        m4371y(i2, !this.f6539P, false, 0);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
            i2 = 1;
        }
        if (i2 != this.f6574x) {
            this.f6574x = i2;
            m4365s(this.f6557g);
        }
    }

    @Deprecated
    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.f6543T = onPageChangeListener;
    }

    public void setPageMargin(int i2) {
        int i3 = this.f6564n;
        this.f6564n = i2;
        int width = getWidth();
        m4366t(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable) {
        this.f6565o = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i2) {
        if (this.f6555e0 == i2) {
            return;
        }
        this.f6555e0 = i2;
        if (this.f6546W != null) {
            boolean z = i2 != 0;
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                getChildAt(i3).setLayerType(z ? this.f6547a0 : 0, null);
            }
        }
        OnPageChangeListener onPageChangeListener = this.f6543T;
        if (onPageChangeListener != null) {
            onPageChangeListener.mo4345d(i2);
        }
        List<OnPageChangeListener> list = this.f6542S;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                OnPageChangeListener onPageChangeListener2 = this.f6542S.get(i4);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.mo4345d(i2);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.f6544U;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.mo4345d(i2);
        }
    }

    /* renamed from: t */
    public final void m4366t(int i2, int i3, int i4, int i5) {
        if (i3 > 0 && !this.f6550c.isEmpty()) {
            if (!this.f6561k.isFinished()) {
                this.f6561k.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)), getScrollY());
                return;
            }
        }
        ItemInfo m4357k = m4357k(this.f6557g);
        int min = (int) ((m4357k != null ? Math.min(m4357k.f6584e, this.f6569s) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            m4351e(false);
            scrollTo(min, getScrollY());
        }
    }

    /* renamed from: u */
    public final void m4367u(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: v */
    public final boolean m4368v() {
        this.f6531H = -1;
        this.f6575y = false;
        this.f6576z = false;
        VelocityTracker velocityTracker = this.f6532I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6532I = null;
        }
        this.f6537N.onRelease();
        this.f6538O.onRelease();
        return this.f6537N.isFinished() || this.f6538O.isFinished();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6565o;
    }

    /* renamed from: w */
    public final void m4369w(int i2, boolean z, int i3, boolean z2) {
        int scrollX;
        int abs;
        ItemInfo m4357k = m4357k(i2);
        int max = m4357k != null ? (int) (Math.max(this.f6568r, Math.min(m4357k.f6584e, this.f6569s)) * getClientWidth()) : 0;
        if (!z) {
            if (z2) {
                m4353g(i2);
            }
            m4351e(false);
            scrollTo(max, 0);
            m4362p(max);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.f6561k;
            if ((scroller == null || scroller.isFinished()) ? false : true) {
                scrollX = this.f6562l ? this.f6561k.getCurrX() : this.f6561k.getStartX();
                this.f6561k.abortAnimation();
                setScrollingCacheEnabled(false);
            } else {
                scrollX = getScrollX();
            }
            int i4 = scrollX;
            int scrollY = getScrollY();
            int i5 = max - i4;
            int i6 = 0 - scrollY;
            if (i5 == 0 && i6 == 0) {
                m4351e(false);
                m4364r();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i7 = clientWidth / 2;
                float f2 = clientWidth;
                float f3 = i7;
                float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i5) * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f3) + f3;
                int abs2 = Math.abs(i3);
                if (abs2 > 0) {
                    abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                } else {
                    Objects.requireNonNull(this.f6556f);
                    abs = (int) (((Math.abs(i5) / ((f2 * 1.0f) + this.f6564n)) + 1.0f) * 100.0f);
                }
                int min = Math.min(abs, 600);
                this.f6562l = false;
                this.f6561k.startScroll(i4, scrollY, i5, i6, min);
                ViewCompat.m2183W(this);
            }
        }
        if (z2) {
            m4353g(i2);
        }
    }

    /* renamed from: x */
    public void m4370x(int i2, boolean z) {
        this.f6573w = false;
        m4371y(i2, z, false, 0);
    }

    /* renamed from: y */
    public void m4371y(int i2, boolean z, boolean z2, int i3) {
        PagerAdapter pagerAdapter = this.f6556f;
        if (pagerAdapter == null || pagerAdapter.mo4336c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.f6557g == i2 && this.f6550c.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.f6556f.mo4336c()) {
            i2 = this.f6556f.mo4336c() - 1;
        }
        int i4 = this.f6574x;
        int i5 = this.f6557g;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            for (int i6 = 0; i6 < this.f6550c.size(); i6++) {
                this.f6550c.get(i6).f6582c = true;
            }
        }
        boolean z3 = this.f6557g != i2;
        if (!this.f6539P) {
            m4365s(i2);
            m4369w(i2, z, i3, z3);
        } else {
            this.f6557g = i2;
            if (z3) {
                m4353g(i2);
            }
            requestLayout();
        }
    }

    /* renamed from: z */
    public void m4372z(boolean z, @Nullable PageTransformer pageTransformer) {
        boolean z2 = true != (this.f6546W != null);
        this.f6546W = pageTransformer;
        setChildrenDrawingOrderEnabled(true);
        this.f6549b0 = z ? 2 : 1;
        this.f6547a0 = 2;
        if (z2) {
            m4365s(this.f6557g);
        }
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f6585a;

        /* renamed from: b */
        public int f6586b;

        /* renamed from: c */
        public float f6587c;

        /* renamed from: d */
        public boolean f6588d;

        /* renamed from: e */
        public int f6589e;

        /* renamed from: f */
        public int f6590f;

        public LayoutParams() {
            super(-1, -1);
            this.f6587c = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6587c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f6520f0);
            this.f6586b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(@DrawableRes int i2) {
        setPageMarginDrawable(ContextCompat.m1671d(getContext(), i2));
    }
}
