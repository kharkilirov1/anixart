package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class PagerSnapHelper extends SnapHelper {

    /* renamed from: d */
    @Nullable
    public OrientationHelper f5460d;

    /* renamed from: e */
    @Nullable
    public OrientationHelper f5461e;

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    /* renamed from: c */
    public int[] mo3726c(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        int[] iArr = new int[2];
        if (layoutManager.mo3700v()) {
            iArr[0] = m3754h(view, m3756j(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.mo3701w()) {
            iArr[1] = m3754h(view, m3757k(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    /* renamed from: d */
    public RecyclerView.SmoothScroller mo3753d(@NonNull RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new LinearSmoothScroller(this.f5647a.getContext()) { // from class: androidx.recyclerview.widget.PagerSnapHelper.1
                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                /* renamed from: f */
                public void mo3719f(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                    PagerSnapHelper pagerSnapHelper = PagerSnapHelper.this;
                    int[] mo3726c = pagerSnapHelper.mo3726c(pagerSnapHelper.f5647a.getLayoutManager(), view);
                    int i2 = mo3726c[0];
                    int i3 = mo3726c[1];
                    int m3722j = m3722j(Math.max(Math.abs(i2), Math.abs(i3)));
                    if (m3722j > 0) {
                        action.m3940b(i2, i3, m3722j, this.f5446j);
                    }
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                /* renamed from: i */
                public float mo3721i(DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                /* renamed from: k */
                public int mo3723k(int i2) {
                    return Math.min(100, super.mo3723k(i2));
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    /* renamed from: e */
    public View mo3727e(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.mo3701w()) {
            return m3755i(layoutManager, m3757k(layoutManager));
        }
        if (layoutManager.mo3700v()) {
            return m3755i(layoutManager, m3756j(layoutManager));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.SnapHelper
    /* renamed from: f */
    public int mo3728f(RecyclerView.LayoutManager layoutManager, int i2, int i3) {
        PointF mo3683e;
        int m3883a0 = layoutManager.m3883a0();
        if (m3883a0 == 0) {
            return -1;
        }
        View view = null;
        OrientationHelper m3757k = layoutManager.mo3701w() ? m3757k(layoutManager) : layoutManager.mo3700v() ? m3756j(layoutManager) : null;
        if (m3757k == null) {
            return -1;
        }
        int m3869Q = layoutManager.m3869Q();
        boolean z = false;
        View view2 = null;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        for (int i6 = 0; i6 < m3869Q; i6++) {
            View m3868P = layoutManager.m3868P(i6);
            if (m3868P != null) {
                int m3754h = m3754h(m3868P, m3757k);
                if (m3754h <= 0 && m3754h > i4) {
                    view2 = m3868P;
                    i4 = m3754h;
                }
                if (m3754h >= 0 && m3754h < i5) {
                    view = m3868P;
                    i5 = m3754h;
                }
            }
        }
        boolean z2 = !layoutManager.mo3700v() ? i3 <= 0 : i2 <= 0;
        if (z2 && view != null) {
            return layoutManager.m3894i0(view);
        }
        if (!z2 && view2 != null) {
            return layoutManager.m3894i0(view2);
        }
        if (z2) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int m3894i0 = layoutManager.m3894i0(view);
        int m3883a02 = layoutManager.m3883a0();
        if ((layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) && (mo3683e = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).mo3683e(m3883a02 - 1)) != null && (mo3683e.x < 0.0f || mo3683e.y < 0.0f)) {
            z = true;
        }
        int i7 = m3894i0 + (z == z2 ? -1 : 1);
        if (i7 < 0 || i7 >= m3883a0) {
            return -1;
        }
        return i7;
    }

    /* renamed from: h */
    public final int m3754h(@NonNull View view, OrientationHelper orientationHelper) {
        return ((orientationHelper.mo3739e(view) / 2) + orientationHelper.mo3741g(view)) - ((orientationHelper.mo3748n() / 2) + orientationHelper.mo3747m());
    }

    @Nullable
    /* renamed from: i */
    public final View m3755i(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int m3869Q = layoutManager.m3869Q();
        View view = null;
        if (m3869Q == 0) {
            return null;
        }
        int mo3748n = (orientationHelper.mo3748n() / 2) + orientationHelper.mo3747m();
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < m3869Q; i3++) {
            View m3868P = layoutManager.m3868P(i3);
            int abs = Math.abs(((orientationHelper.mo3739e(m3868P) / 2) + orientationHelper.mo3741g(m3868P)) - mo3748n);
            if (abs < i2) {
                view = m3868P;
                i2 = abs;
            }
        }
        return view;
    }

    @NonNull
    /* renamed from: j */
    public final OrientationHelper m3756j(@NonNull RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f5461e;
        if (orientationHelper == null || orientationHelper.f5457a != layoutManager) {
            this.f5461e = new OrientationHelper.C05241(layoutManager);
        }
        return this.f5461e;
    }

    @NonNull
    /* renamed from: k */
    public final OrientationHelper m3757k(@NonNull RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f5460d;
        if (orientationHelper == null || orientationHelper.f5457a != layoutManager) {
            this.f5460d = new OrientationHelper.C05252(layoutManager);
        }
        return this.f5460d;
    }
}
