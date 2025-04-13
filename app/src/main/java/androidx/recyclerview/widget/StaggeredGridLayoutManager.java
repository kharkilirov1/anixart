package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.GapWorker;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {

    /* renamed from: A */
    public boolean f5654A;

    /* renamed from: B */
    public BitSet f5655B;

    /* renamed from: C */
    public int f5656C;

    /* renamed from: D */
    public int f5657D;

    /* renamed from: E */
    public LazySpanLookup f5658E;

    /* renamed from: F */
    public int f5659F;

    /* renamed from: G */
    public boolean f5660G;

    /* renamed from: H */
    public boolean f5661H;

    /* renamed from: I */
    public SavedState f5662I;

    /* renamed from: J */
    public final Rect f5663J;

    /* renamed from: K */
    public final AnchorInfo f5664K;

    /* renamed from: L */
    public boolean f5665L;

    /* renamed from: M */
    public int[] f5666M;

    /* renamed from: N */
    public final Runnable f5667N;

    /* renamed from: s */
    public int f5668s;

    /* renamed from: t */
    public Span[] f5669t;

    /* renamed from: u */
    @NonNull
    public OrientationHelper f5670u;

    /* renamed from: v */
    @NonNull
    public OrientationHelper f5671v;

    /* renamed from: w */
    public int f5672w;

    /* renamed from: x */
    public int f5673x;

    /* renamed from: y */
    @NonNull
    public final LayoutState f5674y;

    /* renamed from: z */
    public boolean f5675z;

    public class AnchorInfo {

        /* renamed from: a */
        public int f5677a;

        /* renamed from: b */
        public int f5678b;

        /* renamed from: c */
        public boolean f5679c;

        /* renamed from: d */
        public boolean f5680d;

        /* renamed from: e */
        public boolean f5681e;

        /* renamed from: f */
        public int[] f5682f;

        public AnchorInfo() {
            m3990b();
        }

        /* renamed from: a */
        public void m3989a() {
            this.f5678b = this.f5679c ? StaggeredGridLayoutManager.this.f5670u.mo3743i() : StaggeredGridLayoutManager.this.f5670u.mo3747m();
        }

        /* renamed from: b */
        public void m3990b() {
            this.f5677a = -1;
            this.f5678b = Integer.MIN_VALUE;
            this.f5679c = false;
            this.f5680d = false;
            this.f5681e = false;
            int[] iArr = this.f5682f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: e */
        public Span f5684e;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint
    @RestrictTo
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* renamed from: b */
        public int f5691b;

        /* renamed from: c */
        public int f5692c;

        /* renamed from: d */
        public int f5693d;

        /* renamed from: e */
        public int[] f5694e;

        /* renamed from: f */
        public int f5695f;

        /* renamed from: g */
        public int[] f5696g;

        /* renamed from: h */
        public List<LazySpanLookup.FullSpanItem> f5697h;

        /* renamed from: i */
        public boolean f5698i;

        /* renamed from: j */
        public boolean f5699j;

        /* renamed from: k */
        public boolean f5700k;

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f5691b);
            parcel.writeInt(this.f5692c);
            parcel.writeInt(this.f5693d);
            if (this.f5693d > 0) {
                parcel.writeIntArray(this.f5694e);
            }
            parcel.writeInt(this.f5695f);
            if (this.f5695f > 0) {
                parcel.writeIntArray(this.f5696g);
            }
            parcel.writeInt(this.f5698i ? 1 : 0);
            parcel.writeInt(this.f5699j ? 1 : 0);
            parcel.writeInt(this.f5700k ? 1 : 0);
            parcel.writeList(this.f5697h);
        }

        public SavedState(Parcel parcel) {
            this.f5691b = parcel.readInt();
            this.f5692c = parcel.readInt();
            int readInt = parcel.readInt();
            this.f5693d = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f5694e = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f5695f = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f5696g = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f5698i = parcel.readInt() == 1;
            this.f5699j = parcel.readInt() == 1;
            this.f5700k = parcel.readInt() == 1;
            this.f5697h = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f5693d = savedState.f5693d;
            this.f5691b = savedState.f5691b;
            this.f5692c = savedState.f5692c;
            this.f5694e = savedState.f5694e;
            this.f5695f = savedState.f5695f;
            this.f5696g = savedState.f5696g;
            this.f5698i = savedState.f5698i;
            this.f5699j = savedState.f5699j;
            this.f5700k = savedState.f5700k;
            this.f5697h = savedState.f5697h;
        }
    }

    public class Span {

        /* renamed from: a */
        public ArrayList<View> f5701a = new ArrayList<>();

        /* renamed from: b */
        public int f5702b = Integer.MIN_VALUE;

        /* renamed from: c */
        public int f5703c = Integer.MIN_VALUE;

        /* renamed from: d */
        public int f5704d = 0;

        /* renamed from: e */
        public final int f5705e;

        public Span(int i2) {
            this.f5705e = i2;
        }

        /* renamed from: a */
        public void m3997a(View view) {
            LayoutParams m4008l = m4008l(view);
            m4008l.f5684e = this;
            this.f5701a.add(view);
            this.f5703c = Integer.MIN_VALUE;
            if (this.f5701a.size() == 1) {
                this.f5702b = Integer.MIN_VALUE;
            }
            if (m4008l.m3912c() || m4008l.m3911b()) {
                this.f5704d = StaggeredGridLayoutManager.this.f5670u.mo3739e(view) + this.f5704d;
            }
        }

        /* renamed from: b */
        public void m3998b() {
            View view = this.f5701a.get(r0.size() - 1);
            LayoutParams m4008l = m4008l(view);
            this.f5703c = StaggeredGridLayoutManager.this.f5670u.mo3738d(view);
            Objects.requireNonNull(m4008l);
        }

        /* renamed from: c */
        public void m3999c() {
            View view = this.f5701a.get(0);
            LayoutParams m4008l = m4008l(view);
            this.f5702b = StaggeredGridLayoutManager.this.f5670u.mo3741g(view);
            Objects.requireNonNull(m4008l);
        }

        /* renamed from: d */
        public void m4000d() {
            this.f5701a.clear();
            this.f5702b = Integer.MIN_VALUE;
            this.f5703c = Integer.MIN_VALUE;
            this.f5704d = 0;
        }

        /* renamed from: e */
        public int m4001e() {
            return StaggeredGridLayoutManager.this.f5675z ? m4004h(this.f5701a.size() - 1, -1, true) : m4004h(0, this.f5701a.size(), true);
        }

        /* renamed from: f */
        public int m4002f() {
            return StaggeredGridLayoutManager.this.f5675z ? m4004h(0, this.f5701a.size(), true) : m4004h(this.f5701a.size() - 1, -1, true);
        }

        /* renamed from: g */
        public int m4003g(int i2, int i3, boolean z, boolean z2, boolean z3) {
            int mo3747m = StaggeredGridLayoutManager.this.f5670u.mo3747m();
            int mo3743i = StaggeredGridLayoutManager.this.f5670u.mo3743i();
            int i4 = i3 > i2 ? 1 : -1;
            while (i2 != i3) {
                View view = this.f5701a.get(i2);
                int mo3741g = StaggeredGridLayoutManager.this.f5670u.mo3741g(view);
                int mo3738d = StaggeredGridLayoutManager.this.f5670u.mo3738d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? mo3741g >= mo3743i : mo3741g > mo3743i;
                if (!z3 ? mo3738d > mo3747m : mo3738d >= mo3747m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (mo3741g >= mo3747m && mo3738d <= mo3743i) {
                            return StaggeredGridLayoutManager.this.m3894i0(view);
                        }
                    } else {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.m3894i0(view);
                        }
                        if (mo3741g < mo3747m || mo3738d > mo3743i) {
                            return StaggeredGridLayoutManager.this.m3894i0(view);
                        }
                    }
                }
                i2 += i4;
            }
            return -1;
        }

        /* renamed from: h */
        public int m4004h(int i2, int i3, boolean z) {
            return m4003g(i2, i3, false, false, z);
        }

        /* renamed from: i */
        public int m4005i(int i2, int i3, boolean z) {
            return m4003g(i2, i3, z, true, false);
        }

        /* renamed from: j */
        public int m4006j(int i2) {
            int i3 = this.f5703c;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.f5701a.size() == 0) {
                return i2;
            }
            m3998b();
            return this.f5703c;
        }

        /* renamed from: k */
        public View m4007k(int i2, int i3) {
            View view = null;
            if (i3 != -1) {
                int size = this.f5701a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f5701a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f5675z && staggeredGridLayoutManager.m3894i0(view2) >= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f5675z && staggeredGridLayoutManager2.m3894i0(view2) <= i2) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f5701a.size();
                int i4 = 0;
                while (i4 < size2) {
                    View view3 = this.f5701a.get(i4);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f5675z && staggeredGridLayoutManager3.m3894i0(view3) <= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f5675z && staggeredGridLayoutManager4.m3894i0(view3) >= i2) || !view3.hasFocusable()) {
                        break;
                    }
                    i4++;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: l */
        public LayoutParams m4008l(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* renamed from: m */
        public int m4009m(int i2) {
            int i3 = this.f5702b;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.f5701a.size() == 0) {
                return i2;
            }
            m3999c();
            return this.f5702b;
        }

        /* renamed from: n */
        public void m4010n() {
            int size = this.f5701a.size();
            View remove = this.f5701a.remove(size - 1);
            LayoutParams m4008l = m4008l(remove);
            m4008l.f5684e = null;
            if (m4008l.m3912c() || m4008l.m3911b()) {
                this.f5704d -= StaggeredGridLayoutManager.this.f5670u.mo3739e(remove);
            }
            if (size == 1) {
                this.f5702b = Integer.MIN_VALUE;
            }
            this.f5703c = Integer.MIN_VALUE;
        }

        /* renamed from: o */
        public void m4011o() {
            View remove = this.f5701a.remove(0);
            LayoutParams m4008l = m4008l(remove);
            m4008l.f5684e = null;
            if (this.f5701a.size() == 0) {
                this.f5703c = Integer.MIN_VALUE;
            }
            if (m4008l.m3912c() || m4008l.m3911b()) {
                this.f5704d -= StaggeredGridLayoutManager.this.f5670u.mo3739e(remove);
            }
            this.f5702b = Integer.MIN_VALUE;
        }

        /* renamed from: p */
        public void m4012p(View view) {
            LayoutParams m4008l = m4008l(view);
            m4008l.f5684e = this;
            this.f5701a.add(0, view);
            this.f5702b = Integer.MIN_VALUE;
            if (this.f5701a.size() == 1) {
                this.f5703c = Integer.MIN_VALUE;
            }
            if (m4008l.m3912c() || m4008l.m3911b()) {
                this.f5704d = StaggeredGridLayoutManager.this.f5670u.mo3739e(view) + this.f5704d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f5668s = -1;
        this.f5675z = false;
        this.f5654A = false;
        this.f5656C = -1;
        this.f5657D = Integer.MIN_VALUE;
        this.f5658E = new LazySpanLookup();
        this.f5659F = 2;
        this.f5663J = new Rect();
        this.f5664K = new AnchorInfo();
        this.f5665L = true;
        this.f5667N = new Runnable() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.1
            @Override // java.lang.Runnable
            public void run() {
                StaggeredGridLayoutManager.this.m3970h1();
            }
        };
        RecyclerView.LayoutManager.Properties m3858j0 = RecyclerView.LayoutManager.m3858j0(context, attributeSet, i2, i3);
        int i4 = m3858j0.f5581a;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo3696s(null);
        if (i4 != this.f5672w) {
            this.f5672w = i4;
            OrientationHelper orientationHelper = this.f5670u;
            this.f5670u = this.f5671v;
            this.f5671v = orientationHelper;
            m3871R0();
        }
        m3964J1(m3858j0.f5582b);
        boolean z = m3858j0.f5583c;
        mo3696s(null);
        SavedState savedState = this.f5662I;
        if (savedState != null && savedState.f5698i != z) {
            savedState.f5698i = z;
        }
        this.f5675z = z;
        m3871R0();
        this.f5674y = new LayoutState();
        this.f5670u = OrientationHelper.m3736b(this, this.f5672w);
        this.f5671v = OrientationHelper.m3736b(this, 1 - this.f5672w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: A0 */
    public void mo3593A0(RecyclerView recyclerView, int i2, int i3) {
        m3985w1(i2, i3, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:256:0x0411, code lost:
    
        if (m3970h1() != false) goto L249;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b9  */
    /* renamed from: A1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3955A1(androidx.recyclerview.widget.RecyclerView.Recycler r12, androidx.recyclerview.widget.RecyclerView.State r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1075
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3955A1(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: B */
    public int mo3665B(RecyclerView.State state) {
        return m3971i1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: B0 */
    public void mo3594B0(RecyclerView recyclerView) {
        this.f5658E.m3991a();
        m3871R0();
    }

    /* renamed from: B1 */
    public final boolean m3956B1(int i2) {
        if (this.f5672w == 0) {
            return (i2 == -1) != this.f5654A;
        }
        return ((i2 == -1) == this.f5654A) == m3987y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: C */
    public int mo3596C(RecyclerView.State state) {
        return m3972j1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: C0 */
    public void mo3597C0(RecyclerView recyclerView, int i2, int i3, int i4) {
        m3985w1(i2, i3, 8);
    }

    /* renamed from: C1 */
    public void m3957C1(int i2, RecyclerView.State state) {
        int m3981s1;
        int i3;
        if (i2 > 0) {
            m3981s1 = m3982t1();
            i3 = 1;
        } else {
            m3981s1 = m3981s1();
            i3 = -1;
        }
        this.f5674y.f5397a = true;
        m3966L1(m3981s1, state);
        m3963I1(i3);
        LayoutState layoutState = this.f5674y;
        layoutState.f5399c = m3981s1 + layoutState.f5400d;
        layoutState.f5398b = Math.abs(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: D */
    public int mo3599D(RecyclerView.State state) {
        return m3973k1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: D0 */
    public void mo3600D0(RecyclerView recyclerView, int i2, int i3) {
        m3985w1(i2, i3, 2);
    }

    /* renamed from: D1 */
    public final void m3958D1(RecyclerView.Recycler recycler, LayoutState layoutState) {
        if (!layoutState.f5397a || layoutState.f5405i) {
            return;
        }
        if (layoutState.f5398b == 0) {
            if (layoutState.f5401e == -1) {
                m3959E1(recycler, layoutState.f5403g);
                return;
            } else {
                m3960F1(recycler, layoutState.f5402f);
                return;
            }
        }
        int i2 = 1;
        if (layoutState.f5401e == -1) {
            int i3 = layoutState.f5402f;
            int m4009m = this.f5669t[0].m4009m(i3);
            while (i2 < this.f5668s) {
                int m4009m2 = this.f5669t[i2].m4009m(i3);
                if (m4009m2 > m4009m) {
                    m4009m = m4009m2;
                }
                i2++;
            }
            int i4 = i3 - m4009m;
            m3959E1(recycler, i4 < 0 ? layoutState.f5403g : layoutState.f5403g - Math.min(i4, layoutState.f5398b));
            return;
        }
        int i5 = layoutState.f5403g;
        int m4006j = this.f5669t[0].m4006j(i5);
        while (i2 < this.f5668s) {
            int m4006j2 = this.f5669t[i2].m4006j(i5);
            if (m4006j2 < m4006j) {
                m4006j = m4006j2;
            }
            i2++;
        }
        int i6 = m4006j - layoutState.f5403g;
        m3960F1(recycler, i6 < 0 ? layoutState.f5402f : Math.min(i6, layoutState.f5398b) + layoutState.f5402f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: E */
    public int mo3667E(RecyclerView.State state) {
        return m3971i1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: E0 */
    public void mo3601E0(RecyclerView recyclerView, int i2, int i3, Object obj) {
        m3985w1(i2, i3, 4);
    }

    /* renamed from: E1 */
    public final void m3959E1(RecyclerView.Recycler recycler, int i2) {
        for (int m3869Q = m3869Q() - 1; m3869Q >= 0; m3869Q--) {
            View m3868P = m3868P(m3869Q);
            if (this.f5670u.mo3741g(m3868P) < i2 || this.f5670u.mo3751q(m3868P) < i2) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) m3868P.getLayoutParams();
            Objects.requireNonNull(layoutParams);
            if (layoutParams.f5684e.f5701a.size() == 1) {
                return;
            }
            layoutParams.f5684e.m4010n();
            mo3554O0(m3868P);
            recycler.m3927h(m3868P);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: F */
    public int mo3602F(RecyclerView.State state) {
        return m3972j1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: F0 */
    public void mo3603F0(RecyclerView.Recycler recycler, RecyclerView.State state) {
        m3955A1(recycler, state, true);
    }

    /* renamed from: F1 */
    public final void m3960F1(RecyclerView.Recycler recycler, int i2) {
        while (m3869Q() > 0) {
            View m3868P = m3868P(0);
            if (this.f5670u.mo3738d(m3868P) > i2 || this.f5670u.mo3750p(m3868P) > i2) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) m3868P.getLayoutParams();
            Objects.requireNonNull(layoutParams);
            if (layoutParams.f5684e.f5701a.size() == 1) {
                return;
            }
            layoutParams.f5684e.m4011o();
            mo3554O0(m3868P);
            recycler.m3927h(m3868P);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: G */
    public int mo3604G(RecyclerView.State state) {
        return m3973k1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: G0 */
    public void mo3548G0(RecyclerView.State state) {
        this.f5656C = -1;
        this.f5657D = Integer.MIN_VALUE;
        this.f5662I = null;
        this.f5664K.m3990b();
    }

    /* renamed from: G1 */
    public final void m3961G1() {
        if (this.f5672w == 1 || !m3987y1()) {
            this.f5654A = this.f5675z;
        } else {
            this.f5654A = !this.f5675z;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: H0 */
    public void mo3671H0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f5662I = savedState;
            if (this.f5656C != -1) {
                savedState.f5694e = null;
                savedState.f5693d = 0;
                savedState.f5691b = -1;
                savedState.f5692c = -1;
                savedState.f5694e = null;
                savedState.f5693d = 0;
                savedState.f5695f = 0;
                savedState.f5696g = null;
                savedState.f5697h = null;
            }
            m3871R0();
        }
    }

    /* renamed from: H1 */
    public int m3962H1(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (m3869Q() == 0 || i2 == 0) {
            return 0;
        }
        m3957C1(i2, state);
        int m3974l1 = m3974l1(recycler, this.f5674y, state);
        if (this.f5674y.f5398b >= m3974l1) {
            i2 = i2 < 0 ? -m3974l1 : m3974l1;
        }
        this.f5670u.mo3752r(-i2);
        this.f5660G = this.f5654A;
        LayoutState layoutState = this.f5674y;
        layoutState.f5398b = 0;
        m3958D1(recycler, layoutState);
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: I0 */
    public Parcelable mo3673I0() {
        int m4009m;
        int mo3747m;
        int[] iArr;
        SavedState savedState = this.f5662I;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.f5698i = this.f5675z;
        savedState2.f5699j = this.f5660G;
        savedState2.f5700k = this.f5661H;
        LazySpanLookup lazySpanLookup = this.f5658E;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f5685a) == null) {
            savedState2.f5695f = 0;
        } else {
            savedState2.f5696g = iArr;
            savedState2.f5695f = iArr.length;
            savedState2.f5697h = lazySpanLookup.f5686b;
        }
        if (m3869Q() > 0) {
            savedState2.f5691b = this.f5660G ? m3982t1() : m3981s1();
            View m3975m1 = this.f5654A ? m3975m1(true) : m3976n1(true);
            savedState2.f5692c = m3975m1 != null ? m3894i0(m3975m1) : -1;
            int i2 = this.f5668s;
            savedState2.f5693d = i2;
            savedState2.f5694e = new int[i2];
            for (int i3 = 0; i3 < this.f5668s; i3++) {
                if (this.f5660G) {
                    m4009m = this.f5669t[i3].m4006j(Integer.MIN_VALUE);
                    if (m4009m != Integer.MIN_VALUE) {
                        mo3747m = this.f5670u.mo3743i();
                        m4009m -= mo3747m;
                        savedState2.f5694e[i3] = m4009m;
                    } else {
                        savedState2.f5694e[i3] = m4009m;
                    }
                } else {
                    m4009m = this.f5669t[i3].m4009m(Integer.MIN_VALUE);
                    if (m4009m != Integer.MIN_VALUE) {
                        mo3747m = this.f5670u.mo3747m();
                        m4009m -= mo3747m;
                        savedState2.f5694e[i3] = m4009m;
                    } else {
                        savedState2.f5694e[i3] = m4009m;
                    }
                }
            }
        } else {
            savedState2.f5691b = -1;
            savedState2.f5692c = -1;
            savedState2.f5693d = 0;
        }
        return savedState2;
    }

    /* renamed from: I1 */
    public final void m3963I1(int i2) {
        LayoutState layoutState = this.f5674y;
        layoutState.f5401e = i2;
        layoutState.f5400d = this.f5654A != (i2 == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: J0 */
    public void mo3863J0(int i2) {
        if (i2 == 0) {
            m3970h1();
        }
    }

    /* renamed from: J1 */
    public void m3964J1(int i2) {
        mo3696s(null);
        if (i2 != this.f5668s) {
            this.f5658E.m3991a();
            m3871R0();
            this.f5668s = i2;
            this.f5655B = new BitSet(this.f5668s);
            this.f5669t = new Span[this.f5668s];
            for (int i3 = 0; i3 < this.f5668s; i3++) {
                this.f5669t[i3] = new Span(i3);
            }
            m3871R0();
        }
    }

    /* renamed from: K1 */
    public final void m3965K1(int i2, int i3) {
        for (int i4 = 0; i4 < this.f5668s; i4++) {
            if (!this.f5669t[i4].f5701a.isEmpty()) {
                m3967M1(this.f5669t[i4], i2, i3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* renamed from: L1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3966L1(int r5, androidx.recyclerview.widget.RecyclerView.State r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.LayoutState r0 = r4.f5674y
            r1 = 0
            r0.f5398b = r1
            r0.f5399c = r5
            androidx.recyclerview.widget.RecyclerView$SmoothScroller r0 = r4.f5568h
            r2 = 1
            if (r0 == 0) goto L12
            boolean r0 = r0.f5610e
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L33
            int r6 = r6.f5621a
            r0 = -1
            if (r6 == r0) goto L33
            boolean r0 = r4.f5654A
            if (r6 >= r5) goto L20
            r5 = 1
            goto L21
        L20:
            r5 = 0
        L21:
            if (r0 != r5) goto L2a
            androidx.recyclerview.widget.OrientationHelper r5 = r4.f5670u
            int r5 = r5.mo3748n()
            goto L34
        L2a:
            androidx.recyclerview.widget.OrientationHelper r5 = r4.f5670u
            int r5 = r5.mo3748n()
            r6 = r5
            r5 = 0
            goto L35
        L33:
            r5 = 0
        L34:
            r6 = 0
        L35:
            androidx.recyclerview.widget.RecyclerView r0 = r4.f5563c
            if (r0 == 0) goto L3f
            boolean r0 = r0.f5507h
            if (r0 == 0) goto L3f
            r0 = 1
            goto L40
        L3f:
            r0 = 0
        L40:
            if (r0 == 0) goto L59
            androidx.recyclerview.widget.LayoutState r0 = r4.f5674y
            androidx.recyclerview.widget.OrientationHelper r3 = r4.f5670u
            int r3 = r3.mo3747m()
            int r3 = r3 - r6
            r0.f5402f = r3
            androidx.recyclerview.widget.LayoutState r6 = r4.f5674y
            androidx.recyclerview.widget.OrientationHelper r0 = r4.f5670u
            int r0 = r0.mo3743i()
            int r0 = r0 + r5
            r6.f5403g = r0
            goto L69
        L59:
            androidx.recyclerview.widget.LayoutState r0 = r4.f5674y
            androidx.recyclerview.widget.OrientationHelper r3 = r4.f5670u
            int r3 = r3.mo3742h()
            int r3 = r3 + r5
            r0.f5403g = r3
            androidx.recyclerview.widget.LayoutState r5 = r4.f5674y
            int r6 = -r6
            r5.f5402f = r6
        L69:
            androidx.recyclerview.widget.LayoutState r5 = r4.f5674y
            r5.f5404h = r1
            r5.f5397a = r2
            androidx.recyclerview.widget.OrientationHelper r6 = r4.f5670u
            int r6 = r6.mo3745k()
            if (r6 != 0) goto L80
            androidx.recyclerview.widget.OrientationHelper r6 = r4.f5670u
            int r6 = r6.mo3742h()
            if (r6 != 0) goto L80
            r1 = 1
        L80:
            r5.f5405i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3966L1(int, androidx.recyclerview.widget.RecyclerView$State):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: M */
    public RecyclerView.LayoutParams mo3551M() {
        return this.f5672w == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    /* renamed from: M1 */
    public final void m3967M1(Span span, int i2, int i3) {
        int i4 = span.f5704d;
        if (i2 == -1) {
            int i5 = span.f5702b;
            if (i5 == Integer.MIN_VALUE) {
                span.m3999c();
                i5 = span.f5702b;
            }
            if (i5 + i4 <= i3) {
                this.f5655B.set(span.f5705e, false);
                return;
            }
            return;
        }
        int i6 = span.f5703c;
        if (i6 == Integer.MIN_VALUE) {
            span.m3998b();
            i6 = span.f5703c;
        }
        if (i6 - i4 >= i3) {
            this.f5655B.set(span.f5705e, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: N */
    public RecyclerView.LayoutParams mo3552N(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: N1 */
    public final int m3968N1(int i2, int i3, int i4) {
        if (i3 == 0 && i4 == 0) {
            return i2;
        }
        int mode = View.MeasureSpec.getMode(i2);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i4), mode) : i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: O */
    public RecyclerView.LayoutParams mo3553O(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: S0 */
    public int mo3611S0(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return m3962H1(i2, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: T0 */
    public void mo3680T0(int i2) {
        SavedState savedState = this.f5662I;
        if (savedState != null && savedState.f5691b != i2) {
            savedState.f5694e = null;
            savedState.f5693d = 0;
            savedState.f5691b = -1;
            savedState.f5692c = -1;
        }
        this.f5656C = i2;
        this.f5657D = Integer.MIN_VALUE;
        m3871R0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: U0 */
    public int mo3614U0(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return m3962H1(i2, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: X0 */
    public void mo3618X0(Rect rect, int i2, int i3) {
        int m3860y;
        int m3860y2;
        int mo3892g0 = mo3892g0() + mo3891f0();
        int mo3889e0 = mo3889e0() + mo3893h0();
        if (this.f5672w == 1) {
            m3860y2 = RecyclerView.LayoutManager.m3860y(i3, rect.height() + mo3889e0, m3886c0());
            m3860y = RecyclerView.LayoutManager.m3860y(i2, (this.f5673x * this.f5668s) + mo3892g0, m3888d0());
        } else {
            m3860y = RecyclerView.LayoutManager.m3860y(i2, rect.width() + mo3892g0, m3888d0());
            m3860y2 = RecyclerView.LayoutManager.m3860y(i3, (this.f5673x * this.f5668s) + mo3889e0, m3886c0());
        }
        this.f5563c.setMeasuredDimension(m3860y, m3860y2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: d1 */
    public void mo3682d1(RecyclerView recyclerView, RecyclerView.State state, int i2) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.f5606a = i2;
        m3890e1(linearSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    /* renamed from: e */
    public PointF mo3683e(int i2) {
        int m3969g1 = m3969g1(i2);
        PointF pointF = new PointF();
        if (m3969g1 == 0) {
            return null;
        }
        if (this.f5672w == 0) {
            pointF.x = m3969g1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m3969g1;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: f1 */
    public boolean mo3620f1() {
        return this.f5662I == null;
    }

    /* renamed from: g1 */
    public final int m3969g1(int i2) {
        if (m3869Q() == 0) {
            return this.f5654A ? 1 : -1;
        }
        return (i2 < m3981s1()) != this.f5654A ? -1 : 1;
    }

    /* renamed from: h1 */
    public boolean m3970h1() {
        int m3981s1;
        if (m3869Q() != 0 && this.f5659F != 0 && this.f5570j) {
            if (this.f5654A) {
                m3981s1 = m3982t1();
                m3981s1();
            } else {
                m3981s1 = m3981s1();
                m3982t1();
            }
            if (m3981s1 == 0 && m3986x1() != null) {
                this.f5658E.m3991a();
                this.f5569i = true;
                m3871R0();
                return true;
            }
        }
        return false;
    }

    /* renamed from: i1 */
    public final int m3971i1(RecyclerView.State state) {
        if (m3869Q() == 0) {
            return 0;
        }
        return ScrollbarHelper.m3948a(state, this.f5670u, m3976n1(!this.f5665L), m3975m1(!this.f5665L), this, this.f5665L);
    }

    /* renamed from: j1 */
    public final int m3972j1(RecyclerView.State state) {
        if (m3869Q() == 0) {
            return 0;
        }
        return ScrollbarHelper.m3949b(state, this.f5670u, m3976n1(!this.f5665L), m3975m1(!this.f5665L), this, this.f5665L, this.f5654A);
    }

    /* renamed from: k1 */
    public final int m3973k1(RecyclerView.State state) {
        if (m3869Q() == 0) {
            return 0;
        }
        return ScrollbarHelper.m3950c(state, this.f5670u, m3976n1(!this.f5665L), m3975m1(!this.f5665L), this, this.f5665L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* renamed from: l1 */
    public final int m3974l1(RecyclerView.Recycler recycler, LayoutState layoutState, RecyclerView.State state) {
        int i2;
        Span span;
        ?? r2;
        int i3;
        int mo3739e;
        int mo3747m;
        int mo3739e2;
        int i4;
        int i5;
        int i6;
        this.f5655B.set(0, this.f5668s, true);
        if (this.f5674y.f5405i) {
            i2 = layoutState.f5401e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i2 = layoutState.f5401e == 1 ? layoutState.f5403g + layoutState.f5398b : layoutState.f5402f - layoutState.f5398b;
        }
        m3965K1(layoutState.f5401e, i2);
        int mo3743i = this.f5654A ? this.f5670u.mo3743i() : this.f5670u.mo3747m();
        boolean z = false;
        while (true) {
            int i7 = layoutState.f5399c;
            if (!(i7 >= 0 && i7 < state.m3942b()) || (!this.f5674y.f5405i && this.f5655B.isEmpty())) {
                break;
            }
            View m3924e = recycler.m3924e(layoutState.f5399c);
            layoutState.f5399c += layoutState.f5400d;
            LayoutParams layoutParams = (LayoutParams) m3924e.getLayoutParams();
            int m3910a = layoutParams.m3910a();
            int[] iArr = this.f5658E.f5685a;
            int i8 = (iArr == null || m3910a >= iArr.length) ? -1 : iArr[m3910a];
            if (i8 == -1) {
                if (m3956B1(layoutState.f5401e)) {
                    i5 = this.f5668s - 1;
                    i4 = -1;
                    i6 = -1;
                } else {
                    i4 = this.f5668s;
                    i5 = 0;
                    i6 = 1;
                }
                Span span2 = null;
                if (layoutState.f5401e == 1) {
                    int mo3747m2 = this.f5670u.mo3747m();
                    int i9 = Integer.MAX_VALUE;
                    while (i5 != i4) {
                        Span span3 = this.f5669t[i5];
                        int m4006j = span3.m4006j(mo3747m2);
                        if (m4006j < i9) {
                            span2 = span3;
                            i9 = m4006j;
                        }
                        i5 += i6;
                    }
                } else {
                    int mo3743i2 = this.f5670u.mo3743i();
                    int i10 = Integer.MIN_VALUE;
                    while (i5 != i4) {
                        Span span4 = this.f5669t[i5];
                        int m4009m = span4.m4009m(mo3743i2);
                        if (m4009m > i10) {
                            span2 = span4;
                            i10 = m4009m;
                        }
                        i5 += i6;
                    }
                }
                span = span2;
                LazySpanLookup lazySpanLookup = this.f5658E;
                lazySpanLookup.m3992b(m3910a);
                lazySpanLookup.f5685a[m3910a] = span.f5705e;
            } else {
                span = this.f5669t[i8];
            }
            Span span5 = span;
            layoutParams.f5684e = span5;
            if (layoutState.f5401e == 1) {
                r2 = 0;
                m3898r(m3924e, -1, false);
            } else {
                r2 = 0;
                m3898r(m3924e, 0, false);
            }
            if (this.f5672w == 1) {
                m3988z1(m3924e, RecyclerView.LayoutManager.m3857R(this.f5673x, this.f5575o, r2, ((ViewGroup.MarginLayoutParams) layoutParams).width, r2), RecyclerView.LayoutManager.m3857R(this.f5578r, this.f5576p, mo3889e0() + mo3893h0(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), r2);
            } else {
                m3988z1(m3924e, RecyclerView.LayoutManager.m3857R(this.f5577q, this.f5575o, mo3892g0() + mo3891f0(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), RecyclerView.LayoutManager.m3857R(this.f5673x, this.f5576p, 0, ((ViewGroup.MarginLayoutParams) layoutParams).height, false), false);
            }
            if (layoutState.f5401e == 1) {
                int m4006j2 = span5.m4006j(mo3743i);
                mo3739e = m4006j2;
                i3 = this.f5670u.mo3739e(m3924e) + m4006j2;
            } else {
                int m4009m2 = span5.m4009m(mo3743i);
                i3 = m4009m2;
                mo3739e = m4009m2 - this.f5670u.mo3739e(m3924e);
            }
            if (layoutState.f5401e == 1) {
                layoutParams.f5684e.m3997a(m3924e);
            } else {
                layoutParams.f5684e.m4012p(m3924e);
            }
            if (m3987y1() && this.f5672w == 1) {
                mo3739e2 = this.f5671v.mo3743i() - (((this.f5668s - 1) - span5.f5705e) * this.f5673x);
                mo3747m = mo3739e2 - this.f5671v.mo3739e(m3924e);
            } else {
                mo3747m = this.f5671v.mo3747m() + (span5.f5705e * this.f5673x);
                mo3739e2 = this.f5671v.mo3739e(m3924e) + mo3747m;
            }
            int i11 = mo3739e2;
            int i12 = mo3747m;
            if (this.f5672w == 1) {
                mo3570o0(m3924e, i12, mo3739e, i11, i3);
            } else {
                mo3570o0(m3924e, mo3739e, i12, i3, i11);
            }
            m3967M1(span5, this.f5674y.f5401e, i2);
            m3958D1(recycler, this.f5674y);
            if (this.f5674y.f5404h && m3924e.hasFocusable()) {
                this.f5655B.set(span5.f5705e, false);
            }
            z = true;
        }
        if (!z) {
            m3958D1(recycler, this.f5674y);
        }
        int mo3747m3 = this.f5674y.f5401e == -1 ? this.f5670u.mo3747m() - m3984v1(this.f5670u.mo3747m()) : m3983u1(this.f5670u.mo3743i()) - this.f5670u.mo3743i();
        if (mo3747m3 > 0) {
            return Math.min(layoutState.f5398b, mo3747m3);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: m0 */
    public boolean mo3689m0() {
        return this.f5659F != 0;
    }

    /* renamed from: m1 */
    public View m3975m1(boolean z) {
        int mo3747m = this.f5670u.mo3747m();
        int mo3743i = this.f5670u.mo3743i();
        View view = null;
        for (int m3869Q = m3869Q() - 1; m3869Q >= 0; m3869Q--) {
            View m3868P = m3868P(m3869Q);
            int mo3741g = this.f5670u.mo3741g(m3868P);
            int mo3738d = this.f5670u.mo3738d(m3868P);
            if (mo3738d > mo3747m && mo3741g < mo3743i) {
                if (mo3738d <= mo3743i || !z) {
                    return m3868P;
                }
                if (view == null) {
                    view = m3868P;
                }
            }
        }
        return view;
    }

    /* renamed from: n1 */
    public View m3976n1(boolean z) {
        int mo3747m = this.f5670u.mo3747m();
        int mo3743i = this.f5670u.mo3743i();
        int m3869Q = m3869Q();
        View view = null;
        for (int i2 = 0; i2 < m3869Q; i2++) {
            View m3868P = m3868P(i2);
            int mo3741g = this.f5670u.mo3741g(m3868P);
            if (this.f5670u.mo3738d(m3868P) > mo3747m && mo3741g < mo3743i) {
                if (mo3741g >= mo3747m || !z) {
                    return m3868P;
                }
                if (view == null) {
                    view = m3868P;
                }
            }
        }
        return view;
    }

    /* renamed from: o1 */
    public int[] m3977o1(int[] iArr) {
        if (iArr.length < this.f5668s) {
            StringBuilder m24u = C0000a.m24u("Provided int[]'s size must be more than or equal to span count. Expected:");
            m24u.append(this.f5668s);
            m24u.append(", array size:");
            m24u.append(iArr.length);
            throw new IllegalArgumentException(m24u.toString());
        }
        for (int i2 = 0; i2 < this.f5668s; i2++) {
            Span span = this.f5669t[i2];
            iArr[i2] = StaggeredGridLayoutManager.this.f5675z ? span.m4005i(span.f5701a.size() - 1, -1, false) : span.m4005i(0, span.f5701a.size(), false);
        }
        return iArr;
    }

    /* renamed from: p1 */
    public int[] m3978p1(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f5668s];
        } else if (iArr.length < this.f5668s) {
            StringBuilder m24u = C0000a.m24u("Provided int[]'s size must be more than or equal to span count. Expected:");
            m24u.append(this.f5668s);
            m24u.append(", array size:");
            m24u.append(iArr.length);
            throw new IllegalArgumentException(m24u.toString());
        }
        for (int i2 = 0; i2 < this.f5668s; i2++) {
            Span span = this.f5669t[i2];
            iArr[i2] = StaggeredGridLayoutManager.this.f5675z ? span.m4005i(0, span.f5701a.size(), false) : span.m4005i(span.f5701a.size() - 1, -1, false);
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: q0 */
    public void mo3897q0(int i2) {
        super.mo3897q0(i2);
        for (int i3 = 0; i3 < this.f5668s; i3++) {
            Span span = this.f5669t[i3];
            int i4 = span.f5702b;
            if (i4 != Integer.MIN_VALUE) {
                span.f5702b = i4 + i2;
            }
            int i5 = span.f5703c;
            if (i5 != Integer.MIN_VALUE) {
                span.f5703c = i5 + i2;
            }
        }
    }

    /* renamed from: q1 */
    public final void m3979q1(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int mo3743i;
        int m3983u1 = m3983u1(Integer.MIN_VALUE);
        if (m3983u1 != Integer.MIN_VALUE && (mo3743i = this.f5670u.mo3743i() - m3983u1) > 0) {
            int i2 = mo3743i - (-m3962H1(-mo3743i, recycler, state));
            if (!z || i2 <= 0) {
                return;
            }
            this.f5670u.mo3752r(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: r0 */
    public void mo3899r0(int i2) {
        super.mo3899r0(i2);
        for (int i3 = 0; i3 < this.f5668s; i3++) {
            Span span = this.f5669t[i3];
            int i4 = span.f5702b;
            if (i4 != Integer.MIN_VALUE) {
                span.f5702b = i4 + i2;
            }
            int i5 = span.f5703c;
            if (i5 != Integer.MIN_VALUE) {
                span.f5703c = i5 + i2;
            }
        }
    }

    /* renamed from: r1 */
    public final void m3980r1(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int mo3747m;
        int m3984v1 = m3984v1(Integer.MAX_VALUE);
        if (m3984v1 != Integer.MAX_VALUE && (mo3747m = m3984v1 - this.f5670u.mo3747m()) > 0) {
            int m3962H1 = mo3747m - m3962H1(mo3747m, recycler, state);
            if (!z || m3962H1 <= 0) {
                return;
            }
            this.f5670u.mo3752r(-m3962H1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: s */
    public void mo3696s(String str) {
        RecyclerView recyclerView;
        if (this.f5662I != null || (recyclerView = this.f5563c) == null) {
            return;
        }
        recyclerView.m3808n(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: s0 */
    public void mo3900s0(@Nullable RecyclerView.Adapter adapter, @Nullable RecyclerView.Adapter adapter2) {
        this.f5658E.m3991a();
        for (int i2 = 0; i2 < this.f5668s; i2++) {
            this.f5669t[i2].m4000d();
        }
    }

    /* renamed from: s1 */
    public int m3981s1() {
        if (m3869Q() == 0) {
            return 0;
        }
        return m3894i0(m3868P(0));
    }

    /* renamed from: t1 */
    public int m3982t1() {
        int m3869Q = m3869Q();
        if (m3869Q == 0) {
            return 0;
        }
        return m3894i0(m3868P(m3869Q - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: u0 */
    public void mo3574u0(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        Runnable runnable = this.f5667N;
        RecyclerView recyclerView2 = this.f5563c;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i2 = 0; i2 < this.f5668s; i2++) {
            this.f5669t[i2].m4000d();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: u1 */
    public final int m3983u1(int i2) {
        int m4006j = this.f5669t[0].m4006j(i2);
        for (int i3 = 1; i3 < this.f5668s; i3++) {
            int m4006j2 = this.f5669t[i3].m4006j(i2);
            if (m4006j2 > m4006j) {
                m4006j = m4006j2;
            }
        }
        return m4006j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: v */
    public boolean mo3700v() {
        return this.f5672w == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0038, code lost:
    
        if (r8.f5672w == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x003d, code lost:
    
        if (r8.f5672w == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x004c, code lost:
    
        if (m3987y1() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0058, code lost:
    
        if (m3987y1() == false) goto L46;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @androidx.annotation.Nullable
    /* renamed from: v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View mo3623v0(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.Recycler r11, androidx.recyclerview.widget.RecyclerView.State r12) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo3623v0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):android.view.View");
    }

    /* renamed from: v1 */
    public final int m3984v1(int i2) {
        int m4009m = this.f5669t[0].m4009m(i2);
        for (int i3 = 1; i3 < this.f5668s; i3++) {
            int m4009m2 = this.f5669t[i3].m4009m(i2);
            if (m4009m2 < m4009m) {
                m4009m = m4009m2;
            }
        }
        return m4009m;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: w */
    public boolean mo3701w() {
        return this.f5672w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: w0 */
    public void mo3702w0(AccessibilityEvent accessibilityEvent) {
        super.mo3702w0(accessibilityEvent);
        if (m3869Q() > 0) {
            View m3976n1 = m3976n1(false);
            View m3975m1 = m3975m1(false);
            if (m3976n1 == null || m3975m1 == null) {
                return;
            }
            int m3894i0 = m3894i0(m3976n1);
            int m3894i02 = m3894i0(m3975m1);
            if (m3894i0 < m3894i02) {
                accessibilityEvent.setFromIndex(m3894i0);
                accessibilityEvent.setToIndex(m3894i02);
            } else {
                accessibilityEvent.setFromIndex(m3894i02);
                accessibilityEvent.setToIndex(m3894i0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* renamed from: w1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3985w1(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f5654A
            if (r0 == 0) goto L9
            int r0 = r6.m3982t1()
            goto Ld
        L9:
            int r0 = r6.m3981s1()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f5658E
            r4.m3994d(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f5658E
            r9.m3996f(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f5658E
            r7.m3995e(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f5658E
            r9.m3996f(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f5658E
            r9.m3995e(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.f5654A
            if (r7 == 0) goto L4d
            int r7 = r6.m3981s1()
            goto L51
        L4d:
            int r7 = r6.m3982t1()
        L51:
            if (r3 > r7) goto L56
            r6.m3871R0()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3985w1(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: x */
    public boolean mo3575x(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bc, code lost:
    
        if (r10 == r11) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d2, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d0, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ce, code lost:
    
        if (r10 == r11) goto L51;
     */
    /* renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View m3986x1() {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3986x1():android.view.View");
    }

    /* renamed from: y1 */
    public boolean m3987y1() {
        return m3885b0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @RestrictTo
    /* renamed from: z */
    public void mo3706z(int i2, int i3, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int m4006j;
        int i4;
        if (this.f5672w != 0) {
            i2 = i3;
        }
        if (m3869Q() == 0 || i2 == 0) {
            return;
        }
        m3957C1(i2, state);
        int[] iArr = this.f5666M;
        if (iArr == null || iArr.length < this.f5668s) {
            this.f5666M = new int[this.f5668s];
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f5668s; i6++) {
            LayoutState layoutState = this.f5674y;
            if (layoutState.f5400d == -1) {
                m4006j = layoutState.f5402f;
                i4 = this.f5669t[i6].m4009m(m4006j);
            } else {
                m4006j = this.f5669t[i6].m4006j(layoutState.f5403g);
                i4 = this.f5674y.f5403g;
            }
            int i7 = m4006j - i4;
            if (i7 >= 0) {
                this.f5666M[i5] = i7;
                i5++;
            }
        }
        Arrays.sort(this.f5666M, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = this.f5674y.f5399c;
            if (!(i9 >= 0 && i9 < state.m3942b())) {
                return;
            }
            ((GapWorker.LayoutPrefetchRegistryImpl) layoutPrefetchRegistry).mo3590a(this.f5674y.f5399c, this.f5666M[i8]);
            LayoutState layoutState2 = this.f5674y;
            layoutState2.f5399c += layoutState2.f5400d;
        }
    }

    /* renamed from: z1 */
    public final void m3988z1(View view, int i2, int i3, boolean z) {
        m3902u(view, this.f5663J);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        Rect rect = this.f5663J;
        int m3968N1 = m3968N1(i2, i4 + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        Rect rect2 = this.f5663J;
        int m3968N12 = m3968N1(i3, i5 + rect2.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect2.bottom);
        if (z ? m3887c1(view, m3968N1, m3968N12, layoutParams) : m3884a1(view, m3968N1, m3968N12, layoutParams)) {
            view.measure(m3968N1, m3968N12);
        }
    }

    public static class LazySpanLookup {

        /* renamed from: a */
        public int[] f5685a;

        /* renamed from: b */
        public List<FullSpanItem> f5686b;

        /* renamed from: a */
        public void m3991a() {
            int[] iArr = this.f5685a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f5686b = null;
        }

        /* renamed from: b */
        public void m3992b(int i2) {
            int[] iArr = this.f5685a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i2, 10) + 1];
                this.f5685a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i2 >= iArr.length) {
                int length = iArr.length;
                while (length <= i2) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f5685a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f5685a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: c */
        public FullSpanItem m3993c(int i2) {
            List<FullSpanItem> list = this.f5686b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f5686b.get(size);
                if (fullSpanItem.f5687b == i2) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int m3994d(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.f5685a
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                int r0 = r0.length
                if (r5 < r0) goto La
                return r1
            La:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.f5686b
                if (r0 != 0) goto L10
            Le:
                r0 = -1
                goto L46
            L10:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r4.m3993c(r5)
                if (r0 == 0) goto L1b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r2 = r4.f5686b
                r2.remove(r0)
            L1b:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.f5686b
                int r0 = r0.size()
                r2 = 0
            L22:
                if (r2 >= r0) goto L34
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r4.f5686b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r3
                int r3 = r3.f5687b
                if (r3 < r5) goto L31
                goto L35
            L31:
                int r2 = r2 + 1
                goto L22
            L34:
                r2 = -1
            L35:
                if (r2 == r1) goto Le
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.f5686b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r4.f5686b
                r3.remove(r2)
                int r0 = r0.f5687b
            L46:
                if (r0 != r1) goto L52
                int[] r0 = r4.f5685a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.f5685a
                int r5 = r5.length
                return r5
            L52:
                int r0 = r0 + 1
                int[] r2 = r4.f5685a
                int r2 = r2.length
                int r0 = java.lang.Math.min(r0, r2)
                int[] r2 = r4.f5685a
                java.util.Arrays.fill(r2, r5, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.m3994d(int):int");
        }

        /* renamed from: e */
        public void m3995e(int i2, int i3) {
            int[] iArr = this.f5685a;
            if (iArr == null || i2 >= iArr.length) {
                return;
            }
            int i4 = i2 + i3;
            m3992b(i4);
            int[] iArr2 = this.f5685a;
            System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
            Arrays.fill(this.f5685a, i2, i4, -1);
            List<FullSpanItem> list = this.f5686b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f5686b.get(size);
                int i5 = fullSpanItem.f5687b;
                if (i5 >= i2) {
                    fullSpanItem.f5687b = i5 + i3;
                }
            }
        }

        /* renamed from: f */
        public void m3996f(int i2, int i3) {
            int[] iArr = this.f5685a;
            if (iArr == null || i2 >= iArr.length) {
                return;
            }
            int i4 = i2 + i3;
            m3992b(i4);
            int[] iArr2 = this.f5685a;
            System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
            int[] iArr3 = this.f5685a;
            Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
            List<FullSpanItem> list = this.f5686b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f5686b.get(size);
                int i5 = fullSpanItem.f5687b;
                if (i5 >= i2) {
                    if (i5 < i4) {
                        this.f5686b.remove(size);
                    } else {
                        fullSpanItem.f5687b = i5 - i3;
                    }
                }
            }
        }

        @SuppressLint
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new Parcelable.Creator<FullSpanItem>() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.1
                @Override // android.os.Parcelable.Creator
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public FullSpanItem[] newArray(int i2) {
                    return new FullSpanItem[i2];
                }
            };

            /* renamed from: b */
            public int f5687b;

            /* renamed from: c */
            public int f5688c;

            /* renamed from: d */
            public int[] f5689d;

            /* renamed from: e */
            public boolean f5690e;

            public FullSpanItem(Parcel parcel) {
                this.f5687b = parcel.readInt();
                this.f5688c = parcel.readInt();
                this.f5690e = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f5689d = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder m24u = C0000a.m24u("FullSpanItem{mPosition=");
                m24u.append(this.f5687b);
                m24u.append(", mGapDir=");
                m24u.append(this.f5688c);
                m24u.append(", mHasUnwantedGapAfter=");
                m24u.append(this.f5690e);
                m24u.append(", mGapPerSpan=");
                m24u.append(Arrays.toString(this.f5689d));
                m24u.append('}');
                return m24u.toString();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.f5687b);
                parcel.writeInt(this.f5688c);
                parcel.writeInt(this.f5690e ? 1 : 0);
                int[] iArr = this.f5689d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f5689d);
                }
            }

            public FullSpanItem() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i2, int i3) {
        this.f5668s = -1;
        this.f5675z = false;
        this.f5654A = false;
        this.f5656C = -1;
        this.f5657D = Integer.MIN_VALUE;
        this.f5658E = new LazySpanLookup();
        this.f5659F = 2;
        this.f5663J = new Rect();
        this.f5664K = new AnchorInfo();
        this.f5665L = true;
        this.f5667N = new Runnable() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.1
            @Override // java.lang.Runnable
            public void run() {
                StaggeredGridLayoutManager.this.m3970h1();
            }
        };
        this.f5672w = i3;
        m3964J1(i2);
        this.f5674y = new LayoutState();
        this.f5670u = OrientationHelper.m3736b(this, this.f5672w);
        this.f5671v = OrientationHelper.m3736b(this, 1 - this.f5672w);
    }
}
