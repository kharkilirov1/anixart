package androidx.recyclerview.widget;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class SnapHelper extends RecyclerView.OnFlingListener {

    /* renamed from: a */
    public RecyclerView f5647a;

    /* renamed from: b */
    public Scroller f5648b;

    /* renamed from: c */
    public final RecyclerView.OnScrollListener f5649c = new RecyclerView.OnScrollListener() { // from class: androidx.recyclerview.widget.SnapHelper.1

        /* renamed from: a */
        public boolean f5650a = false;

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        /* renamed from: a */
        public void mo3914a(RecyclerView recyclerView, int i2) {
            if (i2 == 0 && this.f5650a) {
                this.f5650a = false;
                SnapHelper.this.m3953g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        /* renamed from: c */
        public void mo3586c(RecyclerView recyclerView, int i2, int i3) {
            if (i2 == 0 && i3 == 0) {
                return;
            }
            this.f5650a = true;
        }
    };

    @Override // androidx.recyclerview.widget.RecyclerView.OnFlingListener
    /* renamed from: a */
    public boolean mo3913a(int i2, int i3) {
        RecyclerView.SmoothScroller mo3753d;
        int mo3728f;
        boolean z;
        RecyclerView.LayoutManager layoutManager = this.f5647a.getLayoutManager();
        if (layoutManager == null || this.f5647a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f5647a.getMinFlingVelocity();
        if (Math.abs(i3) <= minFlingVelocity && Math.abs(i2) <= minFlingVelocity) {
            return false;
        }
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (mo3753d = mo3753d(layoutManager)) == null || (mo3728f = mo3728f(layoutManager, i2, i3)) == -1) {
            z = false;
        } else {
            mo3753d.f5606a = mo3728f;
            layoutManager.m3890e1(mo3753d);
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public void m3952b(@Nullable RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f5647a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.m3809n0(this.f5649c);
            this.f5647a.setOnFlingListener(null);
        }
        this.f5647a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f5647a.m3806m(this.f5649c);
            this.f5647a.setOnFlingListener(this);
            this.f5648b = new Scroller(this.f5647a.getContext(), new DecelerateInterpolator());
            m3953g();
        }
    }

    @Nullable
    /* renamed from: c */
    public abstract int[] mo3726c(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view);

    @Nullable
    /* renamed from: d */
    public RecyclerView.SmoothScroller mo3753d(@NonNull RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new LinearSmoothScroller(this.f5647a.getContext()) { // from class: androidx.recyclerview.widget.SnapHelper.2
                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                /* renamed from: f */
                public void mo3719f(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                    SnapHelper snapHelper = SnapHelper.this;
                    RecyclerView recyclerView = snapHelper.f5647a;
                    if (recyclerView == null) {
                        return;
                    }
                    int[] mo3726c = snapHelper.mo3726c(recyclerView.getLayoutManager(), view);
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
            };
        }
        return null;
    }

    @Nullable
    /* renamed from: e */
    public abstract View mo3727e(RecyclerView.LayoutManager layoutManager);

    /* renamed from: f */
    public abstract int mo3728f(RecyclerView.LayoutManager layoutManager, int i2, int i3);

    /* renamed from: g */
    public void m3953g() {
        RecyclerView.LayoutManager layoutManager;
        View mo3727e;
        RecyclerView recyclerView = this.f5647a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (mo3727e = mo3727e(layoutManager)) == null) {
            return;
        }
        int[] mo3726c = mo3726c(layoutManager, mo3727e);
        if (mo3726c[0] == 0 && mo3726c[1] == 0) {
            return;
        }
        this.f5647a.m3824v0(mo3726c[0], mo3726c[1], null, Integer.MIN_VALUE, false);
    }
}
