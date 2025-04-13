package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.GapWorker;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.LayoutManager implements ItemTouchHelper.ViewDropHandler, RecyclerView.SmoothScroller.ScrollVectorProvider {

    /* renamed from: A */
    public int f5406A;

    /* renamed from: B */
    public int f5407B;

    /* renamed from: C */
    public SavedState f5408C;

    /* renamed from: D */
    public final AnchorInfo f5409D;

    /* renamed from: E */
    public final LayoutChunkResult f5410E;

    /* renamed from: F */
    public int f5411F;

    /* renamed from: G */
    public int[] f5412G;

    /* renamed from: s */
    public int f5413s;

    /* renamed from: t */
    public LayoutState f5414t;

    /* renamed from: u */
    public OrientationHelper f5415u;

    /* renamed from: v */
    public boolean f5416v;

    /* renamed from: w */
    public boolean f5417w;

    /* renamed from: x */
    public boolean f5418x;

    /* renamed from: y */
    public boolean f5419y;

    /* renamed from: z */
    public boolean f5420z;

    public static class AnchorInfo {

        /* renamed from: a */
        public OrientationHelper f5421a;

        /* renamed from: b */
        public int f5422b;

        /* renamed from: c */
        public int f5423c;

        /* renamed from: d */
        public boolean f5424d;

        /* renamed from: e */
        public boolean f5425e;

        public AnchorInfo() {
            m3711d();
        }

        /* renamed from: a */
        public void m3708a() {
            this.f5423c = this.f5424d ? this.f5421a.mo3743i() : this.f5421a.mo3747m();
        }

        /* renamed from: b */
        public void m3709b(View view, int i2) {
            if (this.f5424d) {
                this.f5423c = this.f5421a.m3749o() + this.f5421a.mo3738d(view);
            } else {
                this.f5423c = this.f5421a.mo3741g(view);
            }
            this.f5422b = i2;
        }

        /* renamed from: c */
        public void m3710c(View view, int i2) {
            int m3749o = this.f5421a.m3749o();
            if (m3749o >= 0) {
                m3709b(view, i2);
                return;
            }
            this.f5422b = i2;
            if (!this.f5424d) {
                int mo3741g = this.f5421a.mo3741g(view);
                int mo3747m = mo3741g - this.f5421a.mo3747m();
                this.f5423c = mo3741g;
                if (mo3747m > 0) {
                    int mo3743i = (this.f5421a.mo3743i() - Math.min(0, (this.f5421a.mo3743i() - m3749o) - this.f5421a.mo3738d(view))) - (this.f5421a.mo3739e(view) + mo3741g);
                    if (mo3743i < 0) {
                        this.f5423c -= Math.min(mo3747m, -mo3743i);
                        return;
                    }
                    return;
                }
                return;
            }
            int mo3743i2 = (this.f5421a.mo3743i() - m3749o) - this.f5421a.mo3738d(view);
            this.f5423c = this.f5421a.mo3743i() - mo3743i2;
            if (mo3743i2 > 0) {
                int mo3739e = this.f5423c - this.f5421a.mo3739e(view);
                int mo3747m2 = this.f5421a.mo3747m();
                int min = mo3739e - (Math.min(this.f5421a.mo3741g(view) - mo3747m2, 0) + mo3747m2);
                if (min < 0) {
                    this.f5423c = Math.min(mo3743i2, -min) + this.f5423c;
                }
            }
        }

        /* renamed from: d */
        public void m3711d() {
            this.f5422b = -1;
            this.f5423c = Integer.MIN_VALUE;
            this.f5424d = false;
            this.f5425e = false;
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("AnchorInfo{mPosition=");
            m24u.append(this.f5422b);
            m24u.append(", mCoordinate=");
            m24u.append(this.f5423c);
            m24u.append(", mLayoutFromEnd=");
            m24u.append(this.f5424d);
            m24u.append(", mValid=");
            m24u.append(this.f5425e);
            m24u.append('}');
            return m24u.toString();
        }
    }

    public static class LayoutChunkResult {

        /* renamed from: a */
        public int f5426a;

        /* renamed from: b */
        public boolean f5427b;

        /* renamed from: c */
        public boolean f5428c;

        /* renamed from: d */
        public boolean f5429d;
    }

    public static class LayoutState {

        /* renamed from: b */
        public int f5431b;

        /* renamed from: c */
        public int f5432c;

        /* renamed from: d */
        public int f5433d;

        /* renamed from: e */
        public int f5434e;

        /* renamed from: f */
        public int f5435f;

        /* renamed from: g */
        public int f5436g;

        /* renamed from: j */
        public int f5439j;

        /* renamed from: l */
        public boolean f5441l;

        /* renamed from: a */
        public boolean f5430a = true;

        /* renamed from: h */
        public int f5437h = 0;

        /* renamed from: i */
        public int f5438i = 0;

        /* renamed from: k */
        public List<RecyclerView.ViewHolder> f5440k = null;

        /* renamed from: a */
        public void m3712a(View view) {
            int m3910a;
            int size = this.f5440k.size();
            View view2 = null;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = this.f5440k.get(i3).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.m3912c() && (m3910a = (layoutParams.m3910a() - this.f5433d) * this.f5434e) >= 0 && m3910a < i2) {
                    view2 = view3;
                    if (m3910a == 0) {
                        break;
                    } else {
                        i2 = m3910a;
                    }
                }
            }
            if (view2 == null) {
                this.f5433d = -1;
            } else {
                this.f5433d = ((RecyclerView.LayoutParams) view2.getLayoutParams()).m3910a();
            }
        }

        /* renamed from: b */
        public boolean m3713b(RecyclerView.State state) {
            int i2 = this.f5433d;
            return i2 >= 0 && i2 < state.m3942b();
        }

        /* renamed from: c */
        public View m3714c(RecyclerView.Recycler recycler) {
            List<RecyclerView.ViewHolder> list = this.f5440k;
            if (list == null) {
                View m3924e = recycler.m3924e(this.f5433d);
                this.f5433d += this.f5434e;
                return m3924e;
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = this.f5440k.get(i2).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.m3912c() && this.f5433d == layoutParams.m3910a()) {
                    m3712a(view);
                    return view;
                }
            }
            return null;
        }
    }

    @SuppressLint
    @RestrictTo
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.recyclerview.widget.LinearLayoutManager.SavedState.1
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
        public int f5442b;

        /* renamed from: c */
        public int f5443c;

        /* renamed from: d */
        public boolean f5444d;

        public SavedState() {
        }

        /* renamed from: c */
        public boolean m3715c() {
            return this.f5442b >= 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f5442b);
            parcel.writeInt(this.f5443c);
            parcel.writeInt(this.f5444d ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f5442b = parcel.readInt();
            this.f5443c = parcel.readInt();
            this.f5444d = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f5442b = savedState.f5442b;
            this.f5443c = savedState.f5443c;
            this.f5444d = savedState.f5444d;
        }
    }

    public LinearLayoutManager(Context context) {
        this(1, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: A */
    public void mo3663A(int i2, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        boolean z;
        int i3;
        SavedState savedState = this.f5408C;
        if (savedState == null || !savedState.m3715c()) {
            m3670G1();
            z = this.f5418x;
            i3 = this.f5406A;
            if (i3 == -1) {
                i3 = z ? i2 - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.f5408C;
            z = savedState2.f5444d;
            i3 = savedState2.f5442b;
        }
        int i4 = z ? -1 : 1;
        for (int i5 = 0; i5 < this.f5411F && i3 >= 0 && i3 < i2; i5++) {
            ((GapWorker.LayoutPrefetchRegistryImpl) layoutPrefetchRegistry).mo3590a(i3, 0);
            i3 += i4;
        }
    }

    /* renamed from: A1 */
    public boolean m3664A1() {
        return m3885b0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: B */
    public int mo3665B(RecyclerView.State state) {
        return m3685i1(state);
    }

    /* renamed from: B1 */
    public void mo3595B1(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutState layoutState, LayoutChunkResult layoutChunkResult) {
        int i2;
        int i3;
        int i4;
        int i5;
        int mo3740f;
        View m3714c = layoutState.m3714c(recycler);
        if (m3714c == null) {
            layoutChunkResult.f5427b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) m3714c.getLayoutParams();
        if (layoutState.f5440k == null) {
            if (this.f5418x == (layoutState.f5435f == -1)) {
                m3898r(m3714c, -1, false);
            } else {
                m3898r(m3714c, 0, false);
            }
        } else {
            if (this.f5418x == (layoutState.f5435f == -1)) {
                m3898r(m3714c, -1, true);
            } else {
                m3898r(m3714c, 0, true);
            }
        }
        mo3572p0(m3714c, 0, 0);
        layoutChunkResult.f5426a = this.f5415u.mo3739e(m3714c);
        if (this.f5413s == 1) {
            if (m3664A1()) {
                mo3740f = this.f5577q - mo3892g0();
                i5 = mo3740f - this.f5415u.mo3740f(m3714c);
            } else {
                i5 = mo3891f0();
                mo3740f = this.f5415u.mo3740f(m3714c) + i5;
            }
            if (layoutState.f5435f == -1) {
                int i6 = layoutState.f5431b;
                i4 = i6;
                i3 = mo3740f;
                i2 = i6 - layoutChunkResult.f5426a;
            } else {
                int i7 = layoutState.f5431b;
                i2 = i7;
                i3 = mo3740f;
                i4 = layoutChunkResult.f5426a + i7;
            }
        } else {
            int mo3893h0 = mo3893h0();
            int mo3740f2 = this.f5415u.mo3740f(m3714c) + mo3893h0;
            if (layoutState.f5435f == -1) {
                int i8 = layoutState.f5431b;
                i3 = i8;
                i2 = mo3893h0;
                i4 = mo3740f2;
                i5 = i8 - layoutChunkResult.f5426a;
            } else {
                int i9 = layoutState.f5431b;
                i2 = mo3893h0;
                i3 = layoutChunkResult.f5426a + i9;
                i4 = mo3740f2;
                i5 = i9;
            }
        }
        mo3570o0(m3714c, i5, i2, i3, i4);
        if (layoutParams.m3912c() || layoutParams.m3911b()) {
            layoutChunkResult.f5428c = true;
        }
        layoutChunkResult.f5429d = m3714c.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: C */
    public int mo3596C(RecyclerView.State state) {
        return m3686j1(state);
    }

    /* renamed from: C1 */
    public void mo3598C1(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: D */
    public int mo3599D(RecyclerView.State state) {
        return m3687k1(state);
    }

    /* renamed from: D1 */
    public final void m3666D1(RecyclerView.Recycler recycler, LayoutState layoutState) {
        if (!layoutState.f5430a || layoutState.f5441l) {
            return;
        }
        int i2 = layoutState.f5436g;
        int i3 = layoutState.f5438i;
        if (layoutState.f5435f == -1) {
            int m3869Q = m3869Q();
            if (i2 < 0) {
                return;
            }
            int mo3742h = (this.f5415u.mo3742h() - i2) + i3;
            if (this.f5418x) {
                for (int i4 = 0; i4 < m3869Q; i4++) {
                    View m3868P = m3868P(i4);
                    if (this.f5415u.mo3741g(m3868P) < mo3742h || this.f5415u.mo3751q(m3868P) < mo3742h) {
                        m3668E1(recycler, 0, i4);
                        return;
                    }
                }
                return;
            }
            int i5 = m3869Q - 1;
            for (int i6 = i5; i6 >= 0; i6--) {
                View m3868P2 = m3868P(i6);
                if (this.f5415u.mo3741g(m3868P2) < mo3742h || this.f5415u.mo3751q(m3868P2) < mo3742h) {
                    m3668E1(recycler, i5, i6);
                    return;
                }
            }
            return;
        }
        if (i2 < 0) {
            return;
        }
        int i7 = i2 - i3;
        int m3869Q2 = m3869Q();
        if (!this.f5418x) {
            for (int i8 = 0; i8 < m3869Q2; i8++) {
                View m3868P3 = m3868P(i8);
                if (this.f5415u.mo3738d(m3868P3) > i7 || this.f5415u.mo3750p(m3868P3) > i7) {
                    m3668E1(recycler, 0, i8);
                    return;
                }
            }
            return;
        }
        int i9 = m3869Q2 - 1;
        for (int i10 = i9; i10 >= 0; i10--) {
            View m3868P4 = m3868P(i10);
            if (this.f5415u.mo3738d(m3868P4) > i7 || this.f5415u.mo3750p(m3868P4) > i7) {
                m3668E1(recycler, i9, i10);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: E */
    public int mo3667E(RecyclerView.State state) {
        return m3685i1(state);
    }

    /* renamed from: E1 */
    public final void m3668E1(RecyclerView.Recycler recycler, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 <= i2) {
            while (i2 > i3) {
                m3867N0(i2, recycler);
                i2--;
            }
        } else {
            for (int i4 = i3 - 1; i4 >= i2; i4--) {
                m3867N0(i4, recycler);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: F */
    public int mo3602F(RecyclerView.State state) {
        return m3686j1(state);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020e  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: F0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo3603F0(androidx.recyclerview.widget.RecyclerView.Recycler r17, androidx.recyclerview.widget.RecyclerView.State r18) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo3603F0(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):void");
    }

    /* renamed from: F1 */
    public boolean m3669F1() {
        return this.f5415u.mo3745k() == 0 && this.f5415u.mo3742h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: G */
    public int mo3604G(RecyclerView.State state) {
        return m3687k1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: G0 */
    public void mo3548G0(RecyclerView.State state) {
        this.f5408C = null;
        this.f5406A = -1;
        this.f5407B = Integer.MIN_VALUE;
        this.f5409D.m3711d();
    }

    /* renamed from: G1 */
    public final void m3670G1() {
        if (this.f5413s == 1 || !m3664A1()) {
            this.f5418x = this.f5417w;
        } else {
            this.f5418x = !this.f5417w;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: H0 */
    public void mo3671H0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f5408C = savedState;
            if (this.f5406A != -1) {
                savedState.f5442b = -1;
            }
            m3871R0();
        }
    }

    /* renamed from: H1 */
    public int m3672H1(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (m3869Q() == 0 || i2 == 0) {
            return 0;
        }
        m3690m1();
        this.f5414t.f5430a = true;
        int i3 = i2 > 0 ? 1 : -1;
        int abs = Math.abs(i2);
        m3677L1(i3, abs, true, state);
        LayoutState layoutState = this.f5414t;
        int m3691n1 = m3691n1(recycler, layoutState, state, false) + layoutState.f5436g;
        if (m3691n1 < 0) {
            return 0;
        }
        if (abs > m3691n1) {
            i2 = i3 * m3691n1;
        }
        this.f5415u.mo3752r(-i2);
        this.f5414t.f5439j = i2;
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: I0 */
    public Parcelable mo3673I0() {
        SavedState savedState = this.f5408C;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (m3869Q() > 0) {
            m3690m1();
            boolean z = this.f5416v ^ this.f5418x;
            savedState2.f5444d = z;
            if (z) {
                View m3705y1 = m3705y1();
                savedState2.f5443c = this.f5415u.mo3743i() - this.f5415u.mo3738d(m3705y1);
                savedState2.f5442b = m3894i0(m3705y1);
            } else {
                View m3707z1 = m3707z1();
                savedState2.f5442b = m3894i0(m3707z1);
                savedState2.f5443c = this.f5415u.mo3741g(m3707z1) - this.f5415u.mo3747m();
            }
        } else {
            savedState2.f5442b = -1;
        }
        return savedState2;
    }

    /* renamed from: I1 */
    public void mo3674I1(int i2, int i3) {
        this.f5406A = i2;
        this.f5407B = i3;
        SavedState savedState = this.f5408C;
        if (savedState != null) {
            savedState.f5442b = -1;
        }
        m3871R0();
    }

    /* renamed from: J1 */
    public void m3675J1(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException(C0000a.m7d("invalid orientation:", i2));
        }
        mo3696s(null);
        if (i2 != this.f5413s || this.f5415u == null) {
            OrientationHelper m3736b = OrientationHelper.m3736b(this, i2);
            this.f5415u = m3736b;
            this.f5409D.f5421a = m3736b;
            this.f5413s = i2;
            m3871R0();
        }
    }

    /* renamed from: K1 */
    public void mo3605K1(boolean z) {
        mo3696s(null);
        if (this.f5419y == z) {
            return;
        }
        this.f5419y = z;
        m3871R0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: L */
    public View mo3676L(int i2) {
        int m3869Q = m3869Q();
        if (m3869Q == 0) {
            return null;
        }
        int m3894i0 = i2 - m3894i0(m3868P(0));
        if (m3894i0 >= 0 && m3894i0 < m3869Q) {
            View m3868P = m3868P(m3894i0);
            if (m3894i0(m3868P) == i2) {
                return m3868P;
            }
        }
        return super.mo3676L(i2);
    }

    /* renamed from: L1 */
    public final void m3677L1(int i2, int i3, boolean z, RecyclerView.State state) {
        int mo3747m;
        this.f5414t.f5441l = m3669F1();
        this.f5414t.f5435f = i2;
        int[] iArr = this.f5412G;
        iArr[0] = 0;
        iArr[1] = 0;
        mo3684g1(state, iArr);
        int max = Math.max(0, this.f5412G[0]);
        int max2 = Math.max(0, this.f5412G[1]);
        boolean z2 = i2 == 1;
        LayoutState layoutState = this.f5414t;
        int i4 = z2 ? max2 : max;
        layoutState.f5437h = i4;
        if (!z2) {
            max = max2;
        }
        layoutState.f5438i = max;
        if (z2) {
            layoutState.f5437h = this.f5415u.mo3744j() + i4;
            View m3705y1 = m3705y1();
            LayoutState layoutState2 = this.f5414t;
            layoutState2.f5434e = this.f5418x ? -1 : 1;
            int m3894i0 = m3894i0(m3705y1);
            LayoutState layoutState3 = this.f5414t;
            layoutState2.f5433d = m3894i0 + layoutState3.f5434e;
            layoutState3.f5431b = this.f5415u.mo3738d(m3705y1);
            mo3747m = this.f5415u.mo3738d(m3705y1) - this.f5415u.mo3743i();
        } else {
            View m3707z1 = m3707z1();
            LayoutState layoutState4 = this.f5414t;
            layoutState4.f5437h = this.f5415u.mo3747m() + layoutState4.f5437h;
            LayoutState layoutState5 = this.f5414t;
            layoutState5.f5434e = this.f5418x ? 1 : -1;
            int m3894i02 = m3894i0(m3707z1);
            LayoutState layoutState6 = this.f5414t;
            layoutState5.f5433d = m3894i02 + layoutState6.f5434e;
            layoutState6.f5431b = this.f5415u.mo3741g(m3707z1);
            mo3747m = (-this.f5415u.mo3741g(m3707z1)) + this.f5415u.mo3747m();
        }
        LayoutState layoutState7 = this.f5414t;
        layoutState7.f5432c = i3;
        if (z) {
            layoutState7.f5432c = i3 - mo3747m;
        }
        layoutState7.f5436g = mo3747m;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: M */
    public RecyclerView.LayoutParams mo3551M() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    /* renamed from: M1 */
    public final void m3678M1(int i2, int i3) {
        this.f5414t.f5432c = this.f5415u.mo3743i() - i3;
        LayoutState layoutState = this.f5414t;
        layoutState.f5434e = this.f5418x ? -1 : 1;
        layoutState.f5433d = i2;
        layoutState.f5435f = 1;
        layoutState.f5431b = i3;
        layoutState.f5436g = Integer.MIN_VALUE;
    }

    /* renamed from: N1 */
    public final void m3679N1(int i2, int i3) {
        this.f5414t.f5432c = i3 - this.f5415u.mo3747m();
        LayoutState layoutState = this.f5414t;
        layoutState.f5433d = i2;
        layoutState.f5434e = this.f5418x ? 1 : -1;
        layoutState.f5435f = -1;
        layoutState.f5431b = i3;
        layoutState.f5436g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: S0 */
    public int mo3611S0(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f5413s == 1) {
            return 0;
        }
        return m3672H1(i2, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: T0 */
    public void mo3680T0(int i2) {
        this.f5406A = i2;
        this.f5407B = Integer.MIN_VALUE;
        SavedState savedState = this.f5408C;
        if (savedState != null) {
            savedState.f5442b = -1;
        }
        m3871R0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: U0 */
    public int mo3614U0(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f5413s == 0) {
            return 0;
        }
        return m3672H1(i2, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: b1 */
    public boolean mo3681b1() {
        boolean z;
        if (this.f5576p != 1073741824 && this.f5575o != 1073741824) {
            int m3869Q = m3869Q();
            int i2 = 0;
            while (true) {
                if (i2 >= m3869Q) {
                    z = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = m3868P(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (z) {
                return true;
            }
        }
        return false;
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
        if (m3869Q() == 0) {
            return null;
        }
        int i3 = (i2 < m3894i0(m3868P(0))) != this.f5418x ? -1 : 1;
        return this.f5413s == 0 ? new PointF(i3, 0.0f) : new PointF(0.0f, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: f1 */
    public boolean mo3620f1() {
        return this.f5408C == null && this.f5416v == this.f5419y;
    }

    /* renamed from: g1 */
    public void mo3684g1(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
        int i2;
        int mo3748n = state.f5621a != -1 ? this.f5415u.mo3748n() : 0;
        if (this.f5414t.f5435f == -1) {
            i2 = 0;
        } else {
            i2 = mo3748n;
            mo3748n = 0;
        }
        iArr[0] = mo3748n;
        iArr[1] = i2;
    }

    /* renamed from: h1 */
    public void mo3621h1(RecyclerView.State state, LayoutState layoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i2 = layoutState.f5433d;
        if (i2 < 0 || i2 >= state.m3942b()) {
            return;
        }
        layoutPrefetchRegistry.mo3590a(i2, Math.max(0, layoutState.f5436g));
    }

    /* renamed from: i1 */
    public final int m3685i1(RecyclerView.State state) {
        if (m3869Q() == 0) {
            return 0;
        }
        m3690m1();
        return ScrollbarHelper.m3948a(state, this.f5415u, m3694q1(!this.f5420z, true), m3693p1(!this.f5420z, true), this, this.f5420z);
    }

    /* renamed from: j1 */
    public final int m3686j1(RecyclerView.State state) {
        if (m3869Q() == 0) {
            return 0;
        }
        m3690m1();
        return ScrollbarHelper.m3949b(state, this.f5415u, m3694q1(!this.f5420z, true), m3693p1(!this.f5420z, true), this, this.f5420z, this.f5418x);
    }

    /* renamed from: k1 */
    public final int m3687k1(RecyclerView.State state) {
        if (m3869Q() == 0) {
            return 0;
        }
        m3690m1();
        return ScrollbarHelper.m3950c(state, this.f5415u, m3694q1(!this.f5420z, true), m3693p1(!this.f5420z, true), this, this.f5420z);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.ViewDropHandler
    /* renamed from: l */
    public void mo3662l(@NonNull View view, @NonNull View view2, int i2, int i3) {
        RecyclerView recyclerView;
        if (this.f5408C == null && (recyclerView = this.f5563c) != null) {
            recyclerView.m3808n("Cannot drop a view during a scroll or layout calculation");
        }
        m3690m1();
        m3670G1();
        int m3894i0 = m3894i0(view);
        int m3894i02 = m3894i0(view2);
        char c2 = m3894i0 < m3894i02 ? (char) 1 : (char) 65535;
        if (this.f5418x) {
            if (c2 == 1) {
                mo3674I1(m3894i02, this.f5415u.mo3743i() - (this.f5415u.mo3739e(view) + this.f5415u.mo3741g(view2)));
                return;
            } else {
                mo3674I1(m3894i02, this.f5415u.mo3743i() - this.f5415u.mo3738d(view2));
                return;
            }
        }
        if (c2 == 65535) {
            mo3674I1(m3894i02, this.f5415u.mo3741g(view2));
        } else {
            mo3674I1(m3894i02, this.f5415u.mo3738d(view2) - this.f5415u.mo3739e(view));
        }
    }

    /* renamed from: l1 */
    public int m3688l1(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 17 ? i2 != 33 ? i2 != 66 ? (i2 == 130 && this.f5413s == 1) ? 1 : Integer.MIN_VALUE : this.f5413s == 0 ? 1 : Integer.MIN_VALUE : this.f5413s == 1 ? -1 : Integer.MIN_VALUE : this.f5413s == 0 ? -1 : Integer.MIN_VALUE : (this.f5413s != 1 && m3664A1()) ? -1 : 1 : (this.f5413s != 1 && m3664A1()) ? 1 : -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: m0 */
    public boolean mo3689m0() {
        return true;
    }

    /* renamed from: m1 */
    public void m3690m1() {
        if (this.f5414t == null) {
            this.f5414t = new LayoutState();
        }
    }

    /* renamed from: n1 */
    public int m3691n1(RecyclerView.Recycler recycler, LayoutState layoutState, RecyclerView.State state, boolean z) {
        int i2 = layoutState.f5432c;
        int i3 = layoutState.f5436g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                layoutState.f5436g = i3 + i2;
            }
            m3666D1(recycler, layoutState);
        }
        int i4 = layoutState.f5432c + layoutState.f5437h;
        LayoutChunkResult layoutChunkResult = this.f5410E;
        while (true) {
            if ((!layoutState.f5441l && i4 <= 0) || !layoutState.m3713b(state)) {
                break;
            }
            layoutChunkResult.f5426a = 0;
            layoutChunkResult.f5427b = false;
            layoutChunkResult.f5428c = false;
            layoutChunkResult.f5429d = false;
            mo3595B1(recycler, state, layoutState, layoutChunkResult);
            if (!layoutChunkResult.f5427b) {
                int i5 = layoutState.f5431b;
                int i6 = layoutChunkResult.f5426a;
                layoutState.f5431b = (layoutState.f5435f * i6) + i5;
                if (!layoutChunkResult.f5428c || layoutState.f5440k != null || !state.f5627g) {
                    layoutState.f5432c -= i6;
                    i4 -= i6;
                }
                int i7 = layoutState.f5436g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    layoutState.f5436g = i8;
                    int i9 = layoutState.f5432c;
                    if (i9 < 0) {
                        layoutState.f5436g = i8 + i9;
                    }
                    m3666D1(recycler, layoutState);
                }
                if (z && layoutChunkResult.f5429d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - layoutState.f5432c;
    }

    /* renamed from: o1 */
    public int m3692o1() {
        View m3699u1 = m3699u1(0, m3869Q(), true, false);
        if (m3699u1 == null) {
            return -1;
        }
        return m3894i0(m3699u1);
    }

    /* renamed from: p1 */
    public View m3693p1(boolean z, boolean z2) {
        return this.f5418x ? m3699u1(0, m3869Q(), z, z2) : m3699u1(m3869Q() - 1, -1, z, z2);
    }

    /* renamed from: q1 */
    public View m3694q1(boolean z, boolean z2) {
        return this.f5418x ? m3699u1(m3869Q() - 1, -1, z, z2) : m3699u1(0, m3869Q(), z, z2);
    }

    /* renamed from: r1 */
    public int m3695r1() {
        View m3699u1 = m3699u1(0, m3869Q(), false, true);
        if (m3699u1 == null) {
            return -1;
        }
        return m3894i0(m3699u1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: s */
    public void mo3696s(String str) {
        RecyclerView recyclerView;
        if (this.f5408C != null || (recyclerView = this.f5563c) == null) {
            return;
        }
        recyclerView.m3808n(str);
    }

    /* renamed from: s1 */
    public int m3697s1() {
        View m3699u1 = m3699u1(m3869Q() - 1, -1, false, true);
        if (m3699u1 == null) {
            return -1;
        }
        return m3894i0(m3699u1);
    }

    /* renamed from: t1 */
    public View m3698t1(int i2, int i3) {
        int i4;
        int i5;
        m3690m1();
        if ((i3 > i2 ? (char) 1 : i3 < i2 ? (char) 65535 : (char) 0) == 0) {
            return m3868P(i2);
        }
        if (this.f5415u.mo3741g(m3868P(i2)) < this.f5415u.mo3747m()) {
            i4 = 16644;
            i5 = 16388;
        } else {
            i4 = 4161;
            i5 = 4097;
        }
        return this.f5413s == 0 ? this.f5566f.m4013a(i2, i3, i4, i5) : this.f5567g.m4013a(i2, i3, i4, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: u0 */
    public void mo3574u0(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
    }

    /* renamed from: u1 */
    public View m3699u1(int i2, int i3, boolean z, boolean z2) {
        m3690m1();
        int i4 = z ? 24579 : 320;
        int i5 = z2 ? 320 : 0;
        return this.f5413s == 0 ? this.f5566f.m4013a(i2, i3, i4, i5) : this.f5567g.m4013a(i2, i3, i4, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: v */
    public boolean mo3700v() {
        return this.f5413s == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: v0 */
    public View mo3623v0(View view, int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int m3688l1;
        m3670G1();
        if (m3869Q() == 0 || (m3688l1 = m3688l1(i2)) == Integer.MIN_VALUE) {
            return null;
        }
        m3690m1();
        m3677L1(m3688l1, (int) (this.f5415u.mo3748n() * 0.33333334f), false, state);
        LayoutState layoutState = this.f5414t;
        layoutState.f5436g = Integer.MIN_VALUE;
        layoutState.f5430a = false;
        m3691n1(recycler, layoutState, state, true);
        View m3698t1 = m3688l1 == -1 ? this.f5418x ? m3698t1(m3869Q() - 1, -1) : m3698t1(0, m3869Q()) : this.f5418x ? m3698t1(0, m3869Q()) : m3698t1(m3869Q() - 1, -1);
        View m3707z1 = m3688l1 == -1 ? m3707z1() : m3705y1();
        if (!m3707z1.hasFocusable()) {
            return m3698t1;
        }
        if (m3698t1 == null) {
            return null;
        }
        return m3707z1;
    }

    /* renamed from: v1 */
    public View mo3624v1(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z, boolean z2) {
        int i2;
        int i3;
        m3690m1();
        int m3869Q = m3869Q();
        int i4 = -1;
        if (z2) {
            i2 = m3869Q() - 1;
            i3 = -1;
        } else {
            i4 = m3869Q;
            i2 = 0;
            i3 = 1;
        }
        int m3942b = state.m3942b();
        int mo3747m = this.f5415u.mo3747m();
        int mo3743i = this.f5415u.mo3743i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i4) {
            View m3868P = m3868P(i2);
            int m3894i0 = m3894i0(m3868P);
            int mo3741g = this.f5415u.mo3741g(m3868P);
            int mo3738d = this.f5415u.mo3738d(m3868P);
            if (m3894i0 >= 0 && m3894i0 < m3942b) {
                if (!((RecyclerView.LayoutParams) m3868P.getLayoutParams()).m3912c()) {
                    boolean z3 = mo3738d <= mo3747m && mo3741g < mo3747m;
                    boolean z4 = mo3741g >= mo3743i && mo3738d > mo3743i;
                    if (!z3 && !z4) {
                        return m3868P;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = m3868P;
                        }
                        view2 = m3868P;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = m3868P;
                        }
                        view2 = m3868P;
                    }
                } else if (view3 == null) {
                    view3 = m3868P;
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: w */
    public boolean mo3701w() {
        return this.f5413s == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: w0 */
    public void mo3702w0(AccessibilityEvent accessibilityEvent) {
        super.mo3702w0(accessibilityEvent);
        if (m3869Q() > 0) {
            accessibilityEvent.setFromIndex(m3695r1());
            accessibilityEvent.setToIndex(m3697s1());
        }
    }

    /* renamed from: w1 */
    public final int m3703w1(int i2, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int mo3743i;
        int mo3743i2 = this.f5415u.mo3743i() - i2;
        if (mo3743i2 <= 0) {
            return 0;
        }
        int i3 = -m3672H1(-mo3743i2, recycler, state);
        int i4 = i2 + i3;
        if (!z || (mo3743i = this.f5415u.mo3743i() - i4) <= 0) {
            return i3;
        }
        this.f5415u.mo3752r(mo3743i);
        return mo3743i + i3;
    }

    /* renamed from: x1 */
    public final int m3704x1(int i2, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int mo3747m;
        int mo3747m2 = i2 - this.f5415u.mo3747m();
        if (mo3747m2 <= 0) {
            return 0;
        }
        int i3 = -m3672H1(mo3747m2, recycler, state);
        int i4 = i2 + i3;
        if (!z || (mo3747m = i4 - this.f5415u.mo3747m()) <= 0) {
            return i3;
        }
        this.f5415u.mo3752r(-mo3747m);
        return i3 - mo3747m;
    }

    /* renamed from: y1 */
    public final View m3705y1() {
        return m3868P(this.f5418x ? 0 : m3869Q() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: z */
    public void mo3706z(int i2, int i3, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        if (this.f5413s != 0) {
            i2 = i3;
        }
        if (m3869Q() == 0 || i2 == 0) {
            return;
        }
        m3690m1();
        m3677L1(i2 > 0 ? 1 : -1, Math.abs(i2), true, state);
        mo3621h1(state, this.f5414t, layoutPrefetchRegistry);
    }

    /* renamed from: z1 */
    public final View m3707z1() {
        return m3868P(this.f5418x ? m3869Q() - 1 : 0);
    }

    public LinearLayoutManager(int i2, boolean z) {
        this.f5413s = 1;
        this.f5417w = false;
        this.f5418x = false;
        this.f5419y = false;
        this.f5420z = true;
        this.f5406A = -1;
        this.f5407B = Integer.MIN_VALUE;
        this.f5408C = null;
        this.f5409D = new AnchorInfo();
        this.f5410E = new LayoutChunkResult();
        this.f5411F = 2;
        this.f5412G = new int[2];
        m3675J1(i2);
        mo3696s(null);
        if (z == this.f5417w) {
            return;
        }
        this.f5417w = z;
        m3871R0();
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f5413s = 1;
        this.f5417w = false;
        this.f5418x = false;
        this.f5419y = false;
        this.f5420z = true;
        this.f5406A = -1;
        this.f5407B = Integer.MIN_VALUE;
        this.f5408C = null;
        this.f5409D = new AnchorInfo();
        this.f5410E = new LayoutChunkResult();
        this.f5411F = 2;
        this.f5412G = new int[2];
        RecyclerView.LayoutManager.Properties m3858j0 = RecyclerView.LayoutManager.m3858j0(context, attributeSet, i2, i3);
        m3675J1(m3858j0.f5581a);
        boolean z = m3858j0.f5583c;
        mo3696s(null);
        if (z != this.f5417w) {
            this.f5417w = z;
            m3871R0();
        }
        mo3605K1(m3858j0.f5584d);
    }
}
