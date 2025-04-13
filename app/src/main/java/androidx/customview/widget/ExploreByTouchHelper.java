package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import androidx.customview.widget.FocusStrategy;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class ExploreByTouchHelper extends AccessibilityDelegateCompat {

    /* renamed from: n */
    public static final Rect f3876n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    public static final FocusStrategy.BoundsAdapter<AccessibilityNodeInfoCompat> f3877o = new C02821();

    /* renamed from: p */
    public static final FocusStrategy.CollectionAdapter<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat> f3878p = new C02832();

    /* renamed from: d */
    public final Rect f3879d;

    /* renamed from: e */
    public final Rect f3880e;

    /* renamed from: f */
    public final Rect f3881f;

    /* renamed from: g */
    public final int[] f3882g;

    /* renamed from: h */
    public final AccessibilityManager f3883h;

    /* renamed from: i */
    public final View f3884i;

    /* renamed from: j */
    public MyNodeProvider f3885j;

    /* renamed from: k */
    public int f3886k;

    /* renamed from: l */
    public int f3887l;

    /* renamed from: m */
    public int f3888m;

    /* renamed from: androidx.customview.widget.ExploreByTouchHelper$1 */
    public class C02821 implements FocusStrategy.BoundsAdapter<AccessibilityNodeInfoCompat> {
        @Override // androidx.customview.widget.FocusStrategy.BoundsAdapter
        /* renamed from: a */
        public void mo2702a(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, Rect rect) {
            accessibilityNodeInfoCompat.f3743a.getBoundsInParent(rect);
        }
    }

    /* renamed from: androidx.customview.widget.ExploreByTouchHelper$2 */
    public class C02832 implements FocusStrategy.CollectionAdapter<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat> {
        @Override // androidx.customview.widget.FocusStrategy.CollectionAdapter
        /* renamed from: a */
        public AccessibilityNodeInfoCompat mo2703a(SparseArrayCompat<AccessibilityNodeInfoCompat> sparseArrayCompat, int i2) {
            SparseArrayCompat<AccessibilityNodeInfoCompat> sparseArrayCompat2 = sparseArrayCompat;
            Objects.requireNonNull(sparseArrayCompat2);
            return (AccessibilityNodeInfoCompat) sparseArrayCompat2.f1853c[i2];
        }

        /* renamed from: b */
        public int m2704b(Object obj) {
            return ((SparseArrayCompat) obj).m1133g();
        }
    }

    public class MyNodeProvider extends AccessibilityNodeProviderCompat {
        public MyNodeProvider() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        /* renamed from: a */
        public AccessibilityNodeInfoCompat mo2520a(int i2) {
            return new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain(ExploreByTouchHelper.this.m2695r(i2).f3743a));
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        /* renamed from: b */
        public AccessibilityNodeInfoCompat mo2521b(int i2) {
            int i3 = i2 == 2 ? ExploreByTouchHelper.this.f3886k : ExploreByTouchHelper.this.f3887l;
            if (i3 == Integer.MIN_VALUE) {
                return null;
            }
            return new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain(ExploreByTouchHelper.this.m2695r(i3).f3743a));
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        /* renamed from: c */
        public boolean mo2522c(int i2, int i3, Bundle bundle) {
            int i4;
            ExploreByTouchHelper exploreByTouchHelper = ExploreByTouchHelper.this;
            if (i2 == -1) {
                return ViewCompat.m2181U(exploreByTouchHelper.f3884i, i3, bundle);
            }
            boolean z = true;
            if (i3 == 1) {
                return exploreByTouchHelper.m2700w(i2);
            }
            if (i3 == 2) {
                return exploreByTouchHelper.m2688k(i2);
            }
            if (i3 != 64) {
                return i3 != 128 ? exploreByTouchHelper.mo2696s(i2, i3, bundle) : exploreByTouchHelper.m2687j(i2);
            }
            if (exploreByTouchHelper.f3883h.isEnabled() && exploreByTouchHelper.f3883h.isTouchExplorationEnabled() && (i4 = exploreByTouchHelper.f3886k) != i2) {
                if (i4 != Integer.MIN_VALUE) {
                    exploreByTouchHelper.m2687j(i4);
                }
                exploreByTouchHelper.f3886k = i2;
                exploreByTouchHelper.f3884i.invalidate();
                exploreByTouchHelper.m2701x(i2, 32768);
            } else {
                z = false;
            }
            return z;
        }
    }

    public ExploreByTouchHelper(@NonNull View view) {
        super(AccessibilityDelegateCompat.f3569c);
        this.f3879d = new Rect();
        this.f3880e = new Rect();
        this.f3881f = new Rect();
        this.f3882g = new int[2];
        this.f3886k = Integer.MIN_VALUE;
        this.f3887l = Integer.MIN_VALUE;
        this.f3888m = Integer.MIN_VALUE;
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f3884i = view;
        this.f3883h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (ViewCompat.m2227u(view) == 0) {
            ViewCompat.m2216o0(view, 1);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    /* renamed from: b */
    public AccessibilityNodeProviderCompat mo2042b(View view) {
        if (this.f3885j == null) {
            this.f3885j = new MyNodeProvider();
        }
        return this.f3885j;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    /* renamed from: c */
    public void mo2043c(View view, AccessibilityEvent accessibilityEvent) {
        this.f3570a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    /* renamed from: d */
    public void mo2044d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.f3570a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f3743a);
        mo2697t(accessibilityNodeInfoCompat);
    }

    /* renamed from: j */
    public final boolean m2687j(int i2) {
        if (this.f3886k != i2) {
            return false;
        }
        this.f3886k = Integer.MIN_VALUE;
        this.f3884i.invalidate();
        m2701x(i2, TextBuffer.MAX_SEGMENT_LEN);
        return true;
    }

    /* renamed from: k */
    public final boolean m2688k(int i2) {
        if (this.f3887l != i2) {
            return false;
        }
        this.f3887l = Integer.MIN_VALUE;
        mo2699v(i2, false);
        m2701x(i2, 8);
        return true;
    }

    /* renamed from: l */
    public final AccessibilityEvent m2689l(int i2, int i3) {
        if (i2 == -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
            this.f3884i.onInitializeAccessibilityEvent(obtain);
            return obtain;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i3);
        AccessibilityNodeInfoCompat m2695r = m2695r(i2);
        obtain2.getText().add(m2695r.m2504j());
        obtain2.setContentDescription(m2695r.m2501g());
        obtain2.setScrollable(m2695r.f3743a.isScrollable());
        obtain2.setPassword(m2695r.f3743a.isPassword());
        obtain2.setEnabled(m2695r.m2505k());
        obtain2.setChecked(m2695r.f3743a.isChecked());
        if (obtain2.getText().isEmpty() && obtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain2.setClassName(m2695r.m2500e());
        AccessibilityRecordCompat.m2525c(obtain2, this.f3884i, i2);
        obtain2.setPackageName(this.f3884i.getContext().getPackageName());
        return obtain2;
    }

    @NonNull
    /* renamed from: m */
    public final AccessibilityNodeInfoCompat m2690m(int i2) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = f3876n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        accessibilityNodeInfoCompat.m2514t(this.f3884i);
        mo2698u(i2, accessibilityNodeInfoCompat);
        if (accessibilityNodeInfoCompat.m2504j() == null && accessibilityNodeInfoCompat.m2501g() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        obtain.getBoundsInParent(this.f3880e);
        if (this.f3880e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int m2499d = accessibilityNodeInfoCompat.m2499d();
        if ((m2499d & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((m2499d & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(this.f3884i.getContext().getPackageName());
        View view = this.f3884i;
        accessibilityNodeInfoCompat.f3745c = i2;
        obtain.setSource(view, i2);
        boolean z = false;
        if (this.f3886k == i2) {
            obtain.setAccessibilityFocused(true);
            obtain.addAction(128);
        } else {
            obtain.setAccessibilityFocused(false);
            obtain.addAction(64);
        }
        boolean z2 = this.f3887l == i2;
        if (z2) {
            obtain.addAction(2);
        } else if (accessibilityNodeInfoCompat.m2506l()) {
            obtain.addAction(1);
        }
        obtain.setFocused(z2);
        this.f3884i.getLocationOnScreen(this.f3882g);
        obtain.getBoundsInScreen(this.f3879d);
        if (this.f3879d.equals(rect)) {
            obtain.getBoundsInParent(this.f3879d);
            if (accessibilityNodeInfoCompat.f3744b != -1) {
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain());
                for (int i3 = accessibilityNodeInfoCompat.f3744b; i3 != -1; i3 = accessibilityNodeInfoCompat2.f3744b) {
                    View view2 = this.f3884i;
                    accessibilityNodeInfoCompat2.f3744b = -1;
                    accessibilityNodeInfoCompat2.f3743a.setParent(view2, -1);
                    accessibilityNodeInfoCompat2.f3743a.setBoundsInParent(f3876n);
                    mo2698u(i3, accessibilityNodeInfoCompat2);
                    accessibilityNodeInfoCompat2.f3743a.getBoundsInParent(this.f3880e);
                    Rect rect2 = this.f3879d;
                    Rect rect3 = this.f3880e;
                    rect2.offset(rect3.left, rect3.top);
                }
                accessibilityNodeInfoCompat2.f3743a.recycle();
            }
            this.f3879d.offset(this.f3882g[0] - this.f3884i.getScrollX(), this.f3882g[1] - this.f3884i.getScrollY());
        }
        if (this.f3884i.getLocalVisibleRect(this.f3881f)) {
            this.f3881f.offset(this.f3882g[0] - this.f3884i.getScrollX(), this.f3882g[1] - this.f3884i.getScrollY());
            if (this.f3879d.intersect(this.f3881f)) {
                accessibilityNodeInfoCompat.f3743a.setBoundsInScreen(this.f3879d);
                Rect rect4 = this.f3879d;
                if (rect4 != null && !rect4.isEmpty() && this.f3884i.getWindowVisibility() == 0) {
                    Object parent = this.f3884i.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view3 = (View) parent;
                            if (view3.getAlpha() <= 0.0f || view3.getVisibility() != 0) {
                                break;
                            }
                            parent = view3.getParent();
                        } else if (parent != null) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    accessibilityNodeInfoCompat.f3743a.setVisibleToUser(true);
                }
            }
        }
        return accessibilityNodeInfoCompat;
    }

    /* renamed from: n */
    public final boolean m2691n(@NonNull MotionEvent motionEvent) {
        int i2;
        if (this.f3883h.isEnabled() && this.f3883h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || (i2 = this.f3888m) == Integer.MIN_VALUE) {
                    return false;
                }
                if (i2 != Integer.MIN_VALUE) {
                    this.f3888m = Integer.MIN_VALUE;
                    m2701x(Integer.MIN_VALUE, 128);
                    m2701x(i2, 256);
                }
                return true;
            }
            int mo2692o = mo2692o(motionEvent.getX(), motionEvent.getY());
            int i3 = this.f3888m;
            if (i3 != mo2692o) {
                this.f3888m = mo2692o;
                m2701x(mo2692o, 128);
                m2701x(i3, 256);
            }
            if (mo2692o != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public abstract int mo2692o(float f2, float f3);

    /* renamed from: p */
    public abstract void mo2693p(List<Integer> list);

    /* JADX WARN: Code restructure failed: missing block: B:42:0x013e, code lost:
    
        if (r13 < ((r18 * r18) + ((r17 * 13) * r17))) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014a A[SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2694q(int r21, @androidx.annotation.Nullable android.graphics.Rect r22) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.ExploreByTouchHelper.m2694q(int, android.graphics.Rect):boolean");
    }

    @NonNull
    /* renamed from: r */
    public AccessibilityNodeInfoCompat m2695r(int i2) {
        if (i2 != -1) {
            return m2690m(i2);
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.f3884i);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(obtain);
        View view = this.f3884i;
        WeakHashMap<View, ViewPropertyAnimatorCompat> weakHashMap = ViewCompat.f3638a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        mo2693p(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            accessibilityNodeInfoCompat.f3743a.addChild(this.f3884i, ((Integer) arrayList.get(i3)).intValue());
        }
        return accessibilityNodeInfoCompat;
    }

    /* renamed from: s */
    public abstract boolean mo2696s(int i2, int i3, @Nullable Bundle bundle);

    /* renamed from: t */
    public void mo2697t(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    /* renamed from: u */
    public abstract void mo2698u(int i2, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);

    /* renamed from: v */
    public void mo2699v(int i2, boolean z) {
    }

    /* renamed from: w */
    public final boolean m2700w(int i2) {
        int i3;
        if ((!this.f3884i.isFocused() && !this.f3884i.requestFocus()) || (i3 = this.f3887l) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            m2688k(i3);
        }
        if (i2 == Integer.MIN_VALUE) {
            return false;
        }
        this.f3887l = i2;
        mo2699v(i2, true);
        m2701x(i2, 8);
        return true;
    }

    /* renamed from: x */
    public final boolean m2701x(int i2, int i3) {
        ViewParent parent;
        if (i2 == Integer.MIN_VALUE || !this.f3883h.isEnabled() || (parent = this.f3884i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f3884i, m2689l(i2, i3));
    }
}
