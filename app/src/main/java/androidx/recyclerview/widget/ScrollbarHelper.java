package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class ScrollbarHelper {
    /* renamed from: a */
    public static int m3948a(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.m3869Q() == 0 || state.m3942b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(layoutManager.m3894i0(view) - layoutManager.m3894i0(view2)) + 1;
        }
        return Math.min(orientationHelper.mo3748n(), orientationHelper.mo3738d(view2) - orientationHelper.mo3741g(view));
    }

    /* renamed from: b */
    public static int m3949b(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z, boolean z2) {
        if (layoutManager.m3869Q() == 0 || state.m3942b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (state.m3942b() - Math.max(layoutManager.m3894i0(view), layoutManager.m3894i0(view2))) - 1) : Math.max(0, Math.min(layoutManager.m3894i0(view), layoutManager.m3894i0(view2)));
        if (z) {
            return Math.round((max * (Math.abs(orientationHelper.mo3738d(view2) - orientationHelper.mo3741g(view)) / (Math.abs(layoutManager.m3894i0(view) - layoutManager.m3894i0(view2)) + 1))) + (orientationHelper.mo3747m() - orientationHelper.mo3741g(view)));
        }
        return max;
    }

    /* renamed from: c */
    public static int m3950c(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.m3869Q() == 0 || state.m3942b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return state.m3942b();
        }
        return (int) (((orientationHelper.mo3738d(view2) - orientationHelper.mo3741g(view)) / (Math.abs(layoutManager.m3894i0(view) - layoutManager.m3894i0(view2)) + 1)) * state.m3942b());
    }
}
