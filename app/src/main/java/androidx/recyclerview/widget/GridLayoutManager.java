package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p000a.C0000a;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: H */
    public boolean f5326H;

    /* renamed from: I */
    public int f5327I;

    /* renamed from: J */
    public int[] f5328J;

    /* renamed from: K */
    public View[] f5329K;

    /* renamed from: L */
    public final SparseIntArray f5330L;

    /* renamed from: M */
    public final SparseIntArray f5331M;

    /* renamed from: N */
    public SpanSizeLookup f5332N;

    /* renamed from: O */
    public final Rect f5333O;

    public static final class DefaultSpanSizeLookup extends SpanSizeLookup {
        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        /* renamed from: d */
        public int mo3626d(int i2, int i3) {
            return i2 % i3;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        /* renamed from: e */
        public int mo3627e(int i2) {
            return 1;
        }
    }

    public static abstract class SpanSizeLookup {

        /* renamed from: a */
        public final SparseIntArray f5336a = new SparseIntArray();

        /* renamed from: b */
        public final SparseIntArray f5337b = new SparseIntArray();

        /* renamed from: c */
        public boolean f5338c = false;

        /* renamed from: a */
        public static int m3628a(SparseIntArray sparseIntArray, int i2) {
            int size = sparseIntArray.size() - 1;
            int i3 = 0;
            while (i3 <= size) {
                int i4 = (i3 + size) >>> 1;
                if (sparseIntArray.keyAt(i4) < i2) {
                    i3 = i4 + 1;
                } else {
                    size = i4 - 1;
                }
            }
            int i5 = i3 - 1;
            if (i5 < 0 || i5 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i5);
        }

        /* renamed from: b */
        public int m3629b(int i2, int i3) {
            if (!this.f5338c) {
                return mo3626d(i2, i3);
            }
            int i4 = this.f5336a.get(i2, -1);
            if (i4 != -1) {
                return i4;
            }
            int mo3626d = mo3626d(i2, i3);
            this.f5336a.put(i2, mo3626d);
            return mo3626d;
        }

        /* renamed from: c */
        public int m3630c(int i2, int i3) {
            int mo3627e = mo3627e(i2);
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                int mo3627e2 = mo3627e(i6);
                i4 += mo3627e2;
                if (i4 == i3) {
                    i5++;
                    i4 = 0;
                } else if (i4 > i3) {
                    i5++;
                    i4 = mo3627e2;
                }
            }
            return i4 + mo3627e > i3 ? i5 + 1 : i5;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:10:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:10:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:10:0x0030). Please report as a decompilation issue!!! */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int mo3626d(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.mo3627e(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.f5338c
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.f5336a
                int r2 = m3628a(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.f5336a
                int r3 = r3.get(r2)
                int r4 = r5.mo3627e(r2)
                int r4 = r4 + r3
                goto L30
            L20:
                r2 = 0
                r4 = 0
            L22:
                if (r2 >= r6) goto L33
                int r3 = r5.mo3627e(r2)
                int r4 = r4 + r3
                if (r4 != r7) goto L2d
                r4 = 0
                goto L30
            L2d:
                if (r4 <= r7) goto L30
                r4 = r3
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r4
                if (r0 > r7) goto L37
                return r4
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup.mo3626d(int, int):int");
        }

        /* renamed from: e */
        public abstract int mo3627e(int i2);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f5326H = false;
        this.f5327I = -1;
        this.f5330L = new SparseIntArray();
        this.f5331M = new SparseIntArray();
        this.f5332N = new DefaultSpanSizeLookup();
        this.f5333O = new Rect();
        m3617W1(RecyclerView.LayoutManager.m3858j0(context, attributeSet, i2, i3).f5582b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: A0 */
    public void mo3593A0(RecyclerView recyclerView, int i2, int i3) {
        this.f5332N.f5336a.clear();
        this.f5332N.f5337b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: B0 */
    public void mo3594B0(RecyclerView recyclerView) {
        this.f5332N.f5336a.clear();
        this.f5332N.f5337b.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        r21.f5427b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: B1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo3595B1(androidx.recyclerview.widget.RecyclerView.Recycler r18, androidx.recyclerview.widget.RecyclerView.State r19, androidx.recyclerview.widget.LinearLayoutManager.LayoutState r20, androidx.recyclerview.widget.LinearLayoutManager.LayoutChunkResult r21) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo3595B1(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, androidx.recyclerview.widget.LinearLayoutManager$LayoutState, androidx.recyclerview.widget.LinearLayoutManager$LayoutChunkResult):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: C */
    public int mo3596C(RecyclerView.State state) {
        return m3686j1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: C0 */
    public void mo3597C0(RecyclerView recyclerView, int i2, int i3, int i4) {
        this.f5332N.f5336a.clear();
        this.f5332N.f5337b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: C1 */
    public void mo3598C1(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorInfo, int i2) {
        m3619X1();
        if (state.m3942b() > 0 && !state.f5627g) {
            boolean z = i2 == 1;
            int m3612S1 = m3612S1(recycler, state, anchorInfo.f5422b);
            if (z) {
                while (m3612S1 > 0) {
                    int i3 = anchorInfo.f5422b;
                    if (i3 <= 0) {
                        break;
                    }
                    int i4 = i3 - 1;
                    anchorInfo.f5422b = i4;
                    m3612S1 = m3612S1(recycler, state, i4);
                }
            } else {
                int m3942b = state.m3942b() - 1;
                int i5 = anchorInfo.f5422b;
                while (i5 < m3942b) {
                    int i6 = i5 + 1;
                    int m3612S12 = m3612S1(recycler, state, i6);
                    if (m3612S12 <= m3612S1) {
                        break;
                    }
                    i5 = i6;
                    m3612S1 = m3612S12;
                }
                anchorInfo.f5422b = i5;
            }
        }
        m3607P1();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: D */
    public int mo3599D(RecyclerView.State state) {
        return m3687k1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: D0 */
    public void mo3600D0(RecyclerView recyclerView, int i2, int i3) {
        this.f5332N.f5336a.clear();
        this.f5332N.f5337b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: E0 */
    public void mo3601E0(RecyclerView recyclerView, int i2, int i3, Object obj) {
        this.f5332N.f5336a.clear();
        this.f5332N.f5337b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: F */
    public int mo3602F(RecyclerView.State state) {
        return m3686j1(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: F0 */
    public void mo3603F0(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.f5627g) {
            int m3869Q = m3869Q();
            for (int i2 = 0; i2 < m3869Q; i2++) {
                LayoutParams layoutParams = (LayoutParams) m3868P(i2).getLayoutParams();
                int m3910a = layoutParams.m3910a();
                this.f5330L.put(m3910a, layoutParams.f5335f);
                this.f5331M.put(m3910a, layoutParams.f5334e);
            }
        }
        super.mo3603F0(recycler, state);
        this.f5330L.clear();
        this.f5331M.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: G */
    public int mo3604G(RecyclerView.State state) {
        return m3687k1(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: G0 */
    public void mo3548G0(RecyclerView.State state) {
        super.mo3548G0(state);
        this.f5326H = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: K1 */
    public void mo3605K1(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        mo3696s(null);
        if (this.f5419y) {
            this.f5419y = false;
            m3871R0();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: M */
    public RecyclerView.LayoutParams mo3551M() {
        return this.f5413s == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: N */
    public RecyclerView.LayoutParams mo3552N(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: O */
    public RecyclerView.LayoutParams mo3553O(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    /* renamed from: O1 */
    public final void m3606O1(int i2) {
        int i3;
        int[] iArr = this.f5328J;
        int i4 = this.f5327I;
        if (iArr == null || iArr.length != i4 + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i4 + 1];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i2 / i4;
        int i7 = i2 % i4;
        int i8 = 0;
        for (int i9 = 1; i9 <= i4; i9++) {
            i5 += i7;
            if (i5 <= 0 || i4 - i5 >= i7) {
                i3 = i6;
            } else {
                i3 = i6 + 1;
                i5 -= i4;
            }
            i8 += i3;
            iArr[i9] = i8;
        }
        this.f5328J = iArr;
    }

    /* renamed from: P1 */
    public final void m3607P1() {
        View[] viewArr = this.f5329K;
        if (viewArr == null || viewArr.length != this.f5327I) {
            this.f5329K = new View[this.f5327I];
        }
    }

    /* renamed from: Q1 */
    public int m3608Q1(int i2, int i3) {
        if (this.f5413s != 1 || !m3664A1()) {
            int[] iArr = this.f5328J;
            return iArr[i3 + i2] - iArr[i2];
        }
        int[] iArr2 = this.f5328J;
        int i4 = this.f5327I;
        return iArr2[i4 - i2] - iArr2[(i4 - i2) - i3];
    }

    /* renamed from: R1 */
    public final int m3609R1(RecyclerView.Recycler recycler, RecyclerView.State state, int i2) {
        if (!state.f5627g) {
            return this.f5332N.m3630c(i2, this.f5327I);
        }
        int m3922c = recycler.m3922c(i2);
        if (m3922c != -1) {
            return this.f5332N.m3630c(m3922c, this.f5327I);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: S */
    public int mo3610S(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f5413s == 1) {
            return this.f5327I;
        }
        if (state.m3942b() < 1) {
            return 0;
        }
        return m3609R1(recycler, state, state.m3942b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: S0 */
    public int mo3611S0(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        m3619X1();
        m3607P1();
        return super.mo3611S0(i2, recycler, state);
    }

    /* renamed from: S1 */
    public final int m3612S1(RecyclerView.Recycler recycler, RecyclerView.State state, int i2) {
        if (!state.f5627g) {
            return this.f5332N.m3629b(i2, this.f5327I);
        }
        int i3 = this.f5331M.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int m3922c = recycler.m3922c(i2);
        if (m3922c != -1) {
            return this.f5332N.m3629b(m3922c, this.f5327I);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 0;
    }

    /* renamed from: T1 */
    public final int m3613T1(RecyclerView.Recycler recycler, RecyclerView.State state, int i2) {
        if (!state.f5627g) {
            return this.f5332N.mo3627e(i2);
        }
        int i3 = this.f5330L.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int m3922c = recycler.m3922c(i2);
        if (m3922c != -1) {
            return this.f5332N.mo3627e(m3922c);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: U0 */
    public int mo3614U0(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        m3619X1();
        m3607P1();
        if (this.f5413s == 0) {
            return 0;
        }
        return m3672H1(i2, recycler, state);
    }

    /* renamed from: U1 */
    public final void m3615U1(View view, int i2, boolean z) {
        int i3;
        int i4;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f5586b;
        int i5 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i6 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int m3608Q1 = m3608Q1(layoutParams.f5334e, layoutParams.f5335f);
        if (this.f5413s == 1) {
            i4 = RecyclerView.LayoutManager.m3857R(m3608Q1, i2, i6, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            i3 = RecyclerView.LayoutManager.m3857R(this.f5415u.mo3748n(), this.f5576p, i5, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int m3857R = RecyclerView.LayoutManager.m3857R(m3608Q1, i2, i5, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int m3857R2 = RecyclerView.LayoutManager.m3857R(this.f5415u.mo3748n(), this.f5575o, i6, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            i3 = m3857R;
            i4 = m3857R2;
        }
        m3616V1(view, i4, i3, z);
    }

    /* renamed from: V1 */
    public final void m3616V1(View view, int i2, int i3, boolean z) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z ? m3887c1(view, i2, i3, layoutParams) : m3884a1(view, i2, i3, layoutParams)) {
            view.measure(i2, i3);
        }
    }

    /* renamed from: W1 */
    public void m3617W1(int i2) {
        if (i2 == this.f5327I) {
            return;
        }
        this.f5326H = true;
        if (i2 < 1) {
            throw new IllegalArgumentException(C0000a.m7d("Span count should be at least 1. Provided ", i2));
        }
        this.f5327I = i2;
        this.f5332N.f5336a.clear();
        m3871R0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: X0 */
    public void mo3618X0(Rect rect, int i2, int i3) {
        int m3860y;
        int m3860y2;
        if (this.f5328J == null) {
            super.mo3618X0(rect, i2, i3);
        }
        int mo3892g0 = mo3892g0() + mo3891f0();
        int mo3889e0 = mo3889e0() + mo3893h0();
        if (this.f5413s == 1) {
            m3860y2 = RecyclerView.LayoutManager.m3860y(i3, rect.height() + mo3889e0, m3886c0());
            int[] iArr = this.f5328J;
            m3860y = RecyclerView.LayoutManager.m3860y(i2, iArr[iArr.length - 1] + mo3892g0, m3888d0());
        } else {
            m3860y = RecyclerView.LayoutManager.m3860y(i2, rect.width() + mo3892g0, m3888d0());
            int[] iArr2 = this.f5328J;
            m3860y2 = RecyclerView.LayoutManager.m3860y(i3, iArr2[iArr2.length - 1] + mo3889e0, m3886c0());
        }
        this.f5563c.setMeasuredDimension(m3860y, m3860y2);
    }

    /* renamed from: X1 */
    public final void m3619X1() {
        int mo3889e0;
        int mo3893h0;
        if (this.f5413s == 1) {
            mo3889e0 = this.f5577q - mo3892g0();
            mo3893h0 = mo3891f0();
        } else {
            mo3889e0 = this.f5578r - mo3889e0();
            mo3893h0 = mo3893h0();
        }
        m3606O1(mo3889e0 - mo3893h0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: f1 */
    public boolean mo3620f1() {
        return this.f5408C == null && !this.f5326H;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: h1 */
    public void mo3621h1(RecyclerView.State state, LinearLayoutManager.LayoutState layoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i2 = this.f5327I;
        for (int i3 = 0; i3 < this.f5327I && layoutState.m3713b(state) && i2 > 0; i3++) {
            int i4 = layoutState.f5433d;
            layoutPrefetchRegistry.mo3590a(i4, Math.max(0, layoutState.f5436g));
            i2 -= this.f5332N.mo3627e(i4);
            layoutState.f5433d += layoutState.f5434e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: k0 */
    public int mo3622k0(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f5413s == 0) {
            return this.f5327I;
        }
        if (state.m3942b() < 1) {
            return 0;
        }
        return m3609R1(recycler, state, state.m3942b() - 1) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00cc, code lost:
    
        if (r13 == (r2 > r15)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00fe, code lost:
    
        if (r13 == (r2 > r8)) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010a  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View mo3623v0(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.Recycler r25, androidx.recyclerview.widget.RecyclerView.State r26) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo3623v0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: v1 */
    public View mo3624v1(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z, boolean z2) {
        int i2;
        int m3869Q = m3869Q();
        int i3 = -1;
        int i4 = 1;
        if (z2) {
            i2 = m3869Q() - 1;
            i4 = -1;
        } else {
            i3 = m3869Q;
            i2 = 0;
        }
        int m3942b = state.m3942b();
        m3690m1();
        int mo3747m = this.f5415u.mo3747m();
        int mo3743i = this.f5415u.mo3743i();
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View m3868P = m3868P(i2);
            int m3894i0 = m3894i0(m3868P);
            if (m3894i0 >= 0 && m3894i0 < m3942b && m3612S1(recycler, state, m3894i0) == 0) {
                if (((RecyclerView.LayoutParams) m3868P.getLayoutParams()).m3912c()) {
                    if (view2 == null) {
                        view2 = m3868P;
                    }
                } else {
                    if (this.f5415u.mo3741g(m3868P) < mo3743i && this.f5415u.mo3738d(m3868P) >= mo3747m) {
                        return m3868P;
                    }
                    if (view == null) {
                        view = m3868P;
                    }
                }
            }
            i2 += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: x */
    public boolean mo3575x(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: z0 */
    public void mo3625z0(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            m3904y0(view, accessibilityNodeInfoCompat);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int m3609R1 = m3609R1(recycler, state, layoutParams2.m3910a());
        if (this.f5413s == 0) {
            accessibilityNodeInfoCompat.m2512r(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.m2519a(layoutParams2.f5334e, layoutParams2.f5335f, m3609R1, 1, false, false));
        } else {
            accessibilityNodeInfoCompat.m2512r(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.m2519a(m3609R1, 1, layoutParams2.f5334e, layoutParams2.f5335f, false, false));
        }
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: e */
        public int f5334e;

        /* renamed from: f */
        public int f5335f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5334e = -1;
            this.f5335f = 0;
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.f5334e = -1;
            this.f5335f = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5334e = -1;
            this.f5335f = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5334e = -1;
            this.f5335f = 0;
        }
    }

    public GridLayoutManager(Context context, int i2, int i3, boolean z) {
        super(i3, z);
        this.f5326H = false;
        this.f5327I = -1;
        this.f5330L = new SparseIntArray();
        this.f5331M = new SparseIntArray();
        this.f5332N = new DefaultSpanSizeLookup();
        this.f5333O = new Rect();
        m3617W1(i2);
    }

    public GridLayoutManager(Context context, int i2) {
        super(1, false);
        this.f5326H = false;
        this.f5327I = -1;
        this.f5330L = new SparseIntArray();
        this.f5331M = new SparseIntArray();
        this.f5332N = new DefaultSpanSizeLookup();
        this.f5333O = new Rect();
        m3617W1(i2);
    }
}
