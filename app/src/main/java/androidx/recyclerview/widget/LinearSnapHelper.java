package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class LinearSnapHelper extends SnapHelper {

    /* renamed from: d */
    @Nullable
    public OrientationHelper f5453d;

    /* renamed from: e */
    @Nullable
    public OrientationHelper f5454e;

    @Override // androidx.recyclerview.widget.SnapHelper
    /* renamed from: c */
    public int[] mo3726c(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        int[] iArr = new int[2];
        if (layoutManager.mo3700v()) {
            iArr[0] = m3729h(view, m3732k(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.mo3701w()) {
            iArr[1] = m3729h(view, m3733l(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    /* renamed from: e */
    public View mo3727e(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.mo3701w()) {
            return m3731j(layoutManager, m3733l(layoutManager));
        }
        if (layoutManager.mo3700v()) {
            return m3731j(layoutManager, m3732k(layoutManager));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.SnapHelper
    /* renamed from: f */
    public int mo3728f(RecyclerView.LayoutManager layoutManager, int i2, int i3) {
        int m3883a0;
        View mo3727e;
        int m3894i0;
        int i4;
        PointF mo3683e;
        int i5;
        int i6;
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (m3883a0 = layoutManager.m3883a0()) == 0 || (mo3727e = mo3727e(layoutManager)) == null || (m3894i0 = layoutManager.m3894i0(mo3727e)) == -1 || (mo3683e = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).mo3683e(m3883a0 - 1)) == null) {
            return -1;
        }
        if (layoutManager.mo3700v()) {
            i5 = m3730i(layoutManager, m3732k(layoutManager), i2, 0);
            if (mo3683e.x < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (layoutManager.mo3701w()) {
            i6 = m3730i(layoutManager, m3733l(layoutManager), 0, i3);
            if (mo3683e.y < 0.0f) {
                i6 = -i6;
            }
        } else {
            i6 = 0;
        }
        if (layoutManager.mo3701w()) {
            i5 = i6;
        }
        if (i5 == 0) {
            return -1;
        }
        int i7 = m3894i0 + i5;
        int i8 = i7 >= 0 ? i7 : 0;
        return i8 >= m3883a0 ? i4 : i8;
    }

    /* renamed from: h */
    public final int m3729h(@NonNull View view, OrientationHelper orientationHelper) {
        return ((orientationHelper.mo3739e(view) / 2) + orientationHelper.mo3741g(view)) - ((orientationHelper.mo3748n() / 2) + orientationHelper.mo3747m());
    }

    /* renamed from: i */
    public final int m3730i(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper, int i2, int i3) {
        int max;
        this.f5648b.fling(0, 0, i2, i3, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.f5648b.getFinalX(), this.f5648b.getFinalY()};
        int m3869Q = layoutManager.m3869Q();
        float f2 = 1.0f;
        if (m3869Q != 0) {
            View view = null;
            View view2 = null;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            for (int i6 = 0; i6 < m3869Q; i6++) {
                View m3868P = layoutManager.m3868P(i6);
                int m3894i0 = layoutManager.m3894i0(m3868P);
                if (m3894i0 != -1) {
                    if (m3894i0 < i4) {
                        view = m3868P;
                        i4 = m3894i0;
                    }
                    if (m3894i0 > i5) {
                        view2 = m3868P;
                        i5 = m3894i0;
                    }
                }
            }
            if (view != null && view2 != null && (max = Math.max(orientationHelper.mo3738d(view), orientationHelper.mo3738d(view2)) - Math.min(orientationHelper.mo3741g(view), orientationHelper.mo3741g(view2))) != 0) {
                f2 = (max * 1.0f) / ((i5 - i4) + 1);
            }
        }
        if (f2 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f2);
    }

    @Nullable
    /* renamed from: j */
    public final View m3731j(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
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
    /* renamed from: k */
    public final OrientationHelper m3732k(@NonNull RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f5454e;
        if (orientationHelper == null || orientationHelper.f5457a != layoutManager) {
            this.f5454e = new OrientationHelper.C05241(layoutManager);
        }
        return this.f5454e;
    }

    @NonNull
    /* renamed from: l */
    public final OrientationHelper m3733l(@NonNull RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f5453d;
        if (orientationHelper == null || orientationHelper.f5457a != layoutManager) {
            this.f5453d = new OrientationHelper.C05252(layoutManager);
        }
        return this.f5453d;
    }
}
