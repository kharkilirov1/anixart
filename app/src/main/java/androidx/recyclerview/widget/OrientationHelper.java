package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class OrientationHelper {

    /* renamed from: a */
    public final RecyclerView.LayoutManager f5457a;

    /* renamed from: b */
    public int f5458b = Integer.MIN_VALUE;

    /* renamed from: c */
    public final Rect f5459c = new Rect();

    /* renamed from: androidx.recyclerview.widget.OrientationHelper$1 */
    public class C05241 extends OrientationHelper {
        public C05241(RecyclerView.LayoutManager layoutManager) {
            super(layoutManager, null);
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: d */
        public int mo3738d(View view) {
            return this.f5457a.m3878X(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: e */
        public int mo3739e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f5457a.mo3876W(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: f */
        public int mo3740f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f5457a.mo3874V(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: g */
        public int mo3741g(View view) {
            return this.f5457a.m3873U(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: h */
        public int mo3742h() {
            return this.f5457a.f5577q;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: i */
        public int mo3743i() {
            RecyclerView.LayoutManager layoutManager = this.f5457a;
            return layoutManager.f5577q - layoutManager.mo3892g0();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: j */
        public int mo3744j() {
            return this.f5457a.mo3892g0();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: k */
        public int mo3745k() {
            return this.f5457a.f5575o;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: l */
        public int mo3746l() {
            return this.f5457a.f5576p;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: m */
        public int mo3747m() {
            return this.f5457a.mo3891f0();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: n */
        public int mo3748n() {
            RecyclerView.LayoutManager layoutManager = this.f5457a;
            return (layoutManager.f5577q - layoutManager.mo3891f0()) - this.f5457a.mo3892g0();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: p */
        public int mo3750p(View view) {
            this.f5457a.m3895l0(view, true, this.f5459c);
            return this.f5459c.right;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: q */
        public int mo3751q(View view) {
            this.f5457a.m3895l0(view, true, this.f5459c);
            return this.f5459c.left;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: r */
        public void mo3752r(int i2) {
            this.f5457a.mo3897q0(i2);
        }
    }

    /* renamed from: androidx.recyclerview.widget.OrientationHelper$2 */
    public class C05252 extends OrientationHelper {
        public C05252(RecyclerView.LayoutManager layoutManager) {
            super(layoutManager, null);
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: d */
        public int mo3738d(View view) {
            return this.f5457a.m3872T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: e */
        public int mo3739e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f5457a.mo3874V(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: f */
        public int mo3740f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f5457a.mo3876W(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: g */
        public int mo3741g(View view) {
            return this.f5457a.m3879Y(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: h */
        public int mo3742h() {
            return this.f5457a.f5578r;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: i */
        public int mo3743i() {
            RecyclerView.LayoutManager layoutManager = this.f5457a;
            return layoutManager.f5578r - layoutManager.mo3889e0();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: j */
        public int mo3744j() {
            return this.f5457a.mo3889e0();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: k */
        public int mo3745k() {
            return this.f5457a.f5576p;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: l */
        public int mo3746l() {
            return this.f5457a.f5575o;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: m */
        public int mo3747m() {
            return this.f5457a.mo3893h0();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: n */
        public int mo3748n() {
            RecyclerView.LayoutManager layoutManager = this.f5457a;
            return (layoutManager.f5578r - layoutManager.mo3893h0()) - this.f5457a.mo3889e0();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: p */
        public int mo3750p(View view) {
            this.f5457a.m3895l0(view, true, this.f5459c);
            return this.f5459c.bottom;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: q */
        public int mo3751q(View view) {
            this.f5457a.m3895l0(view, true, this.f5459c);
            return this.f5459c.top;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* renamed from: r */
        public void mo3752r(int i2) {
            this.f5457a.mo3899r0(i2);
        }
    }

    public OrientationHelper(RecyclerView.LayoutManager layoutManager, C05241 c05241) {
        this.f5457a = layoutManager;
    }

    /* renamed from: a */
    public static OrientationHelper m3735a(RecyclerView.LayoutManager layoutManager) {
        return new C05241(layoutManager);
    }

    /* renamed from: b */
    public static OrientationHelper m3736b(RecyclerView.LayoutManager layoutManager, int i2) {
        if (i2 == 0) {
            return new C05241(layoutManager);
        }
        if (i2 == 1) {
            return new C05252(layoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: c */
    public static OrientationHelper m3737c(RecyclerView.LayoutManager layoutManager) {
        return new C05252(layoutManager);
    }

    /* renamed from: d */
    public abstract int mo3738d(View view);

    /* renamed from: e */
    public abstract int mo3739e(View view);

    /* renamed from: f */
    public abstract int mo3740f(View view);

    /* renamed from: g */
    public abstract int mo3741g(View view);

    /* renamed from: h */
    public abstract int mo3742h();

    /* renamed from: i */
    public abstract int mo3743i();

    /* renamed from: j */
    public abstract int mo3744j();

    /* renamed from: k */
    public abstract int mo3745k();

    /* renamed from: l */
    public abstract int mo3746l();

    /* renamed from: m */
    public abstract int mo3747m();

    /* renamed from: n */
    public abstract int mo3748n();

    /* renamed from: o */
    public int m3749o() {
        if (Integer.MIN_VALUE == this.f5458b) {
            return 0;
        }
        return mo3748n() - this.f5458b;
    }

    /* renamed from: p */
    public abstract int mo3750p(View view);

    /* renamed from: q */
    public abstract int mo3751q(View view);

    /* renamed from: r */
    public abstract void mo3752r(int i2);
}
