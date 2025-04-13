package com.yandex.div.core.view2.divs.gallery;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.gallery.DivGalleryBinder;
import com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper;
import com.yandex.div2.Div;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivSize;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivGridLayoutManager.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/gallery/DivGridLayoutManager;", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "Lcom/yandex/div/core/view2/divs/gallery/DivGalleryItemHelper;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivGridLayoutManager extends StaggeredGridLayoutManager implements DivGalleryItemHelper {

    /* renamed from: O */
    @NotNull
    public final Div2View f32625O;

    /* renamed from: P */
    @NotNull
    public final RecyclerView f32626P;

    /* renamed from: Q */
    @NotNull
    public final DivGallery f32627Q;

    /* renamed from: R */
    @NotNull
    public final HashSet<View> f32628R;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DivGridLayoutManager(@org.jetbrains.annotations.NotNull com.yandex.div.core.view2.Div2View r10, @org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView r11, @org.jetbrains.annotations.NotNull com.yandex.div2.DivGallery r12, int r13) {
        /*
            r9 = this;
            java.lang.String r0 = "divView"
            kotlin.jvm.internal.Intrinsics.m32179h(r10, r0)
            com.yandex.div.json.expressions.Expression<java.lang.Long> r0 = r12.f35945g
            if (r0 != 0) goto La
            goto L16
        La:
            com.yandex.div.json.expressions.ExpressionResolver r1 = r10.getExpressionResolver()
            java.lang.Object r0 = r0.mo17535b(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 != 0) goto L18
        L16:
            r0 = 1
            goto L39
        L18:
            long r0 = r0.longValue()
            r2 = 31
            long r2 = r0 >> r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L38
            r6 = -1
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 != 0) goto L2d
            goto L38
        L2d:
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L35
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L39
        L35:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L39
        L38:
            int r0 = (int) r0
        L39:
            r9.<init>(r0, r13)
            r9.f32625O = r10
            r9.f32626P = r11
            r9.f32627Q = r12
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            r9.f32628R = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.gallery.DivGridLayoutManager.<init>(com.yandex.div.core.view2.Div2View, androidx.recyclerview.widget.RecyclerView, com.yandex.div2.DivGallery, int):void");
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: G0 */
    public void mo3548G0(@Nullable RecyclerView.State state) {
        DivGalleryItemHelper.CC.m17060d(this);
        super.mo3548G0(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: J */
    public void mo3549J(int i2) {
        super.mo3549J(i2);
        int i3 = DivGalleryItemHelper.CC.f32623a;
        View m17067O1 = m17067O1(i2);
        if (m17067O1 == null) {
            return;
        }
        mo3569o(m17067O1, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: L0 */
    public void mo3550L0(@NotNull RecyclerView.Recycler recycler) {
        Intrinsics.m32179h(recycler, "recycler");
        DivGalleryItemHelper.CC.m17061e(this, recycler);
        super.mo3550L0(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: O0 */
    public void mo3554O0(@NotNull View child) {
        Intrinsics.m32179h(child, "child");
        super.mo3554O0(child);
        int i2 = DivGalleryItemHelper.CC.f32623a;
        mo3569o(child, true);
    }

    @Nullable
    /* renamed from: O1 */
    public View m17067O1(int i2) {
        return m3868P(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: P0 */
    public void mo3556P0(int i2) {
        super.mo3556P0(i2);
        int i3 = DivGalleryItemHelper.CC.f32623a;
        View m17067O1 = m17067O1(i2);
        if (m17067O1 == null) {
            return;
        }
        mo3569o(m17067O1, true);
    }

    /* renamed from: P1 */
    public final int m17068P1() {
        Long mo17535b = this.f32627Q.f35955q.mo17535b(this.f32625O.getExpressionResolver());
        DisplayMetrics displayMetrics = this.f32626P.getResources().getDisplayMetrics();
        Intrinsics.m32178g(displayMetrics, "view.resources.displayMetrics");
        return BaseDivViewExtensionsKt.m16961u(mo17535b, displayMetrics);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: V */
    public int mo3874V(@NotNull View view) {
        boolean z = this.f32627Q.f35956r.get(m3894i0(view)).m17557a().getF36479r() instanceof DivSize.Fixed;
        int i2 = 0;
        boolean z2 = this.f5668s > 1;
        int mo3874V = super.mo3874V(view);
        if (z && z2) {
            i2 = m17068P1();
        }
        return mo3874V + i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: W */
    public int mo3876W(@NotNull View view) {
        boolean z = this.f32627Q.f35956r.get(m3894i0(view)).m17557a().getF36461I() instanceof DivSize.Fixed;
        int i2 = 0;
        boolean z2 = this.f5668s > 1;
        int mo3876W = super.mo3876W(view);
        if (z && z2) {
            i2 = m17068P1();
        }
        return mo3876W + i2;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    /* renamed from: a, reason: from getter */
    public DivGallery getF32627Q() {
        return this.f32627Q;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    /* renamed from: b */
    public void mo3558b(int i2, int i3) {
        DivGalleryItemHelper.CC.m17063g(this, i2, i3);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    /* renamed from: c */
    public /* synthetic */ void mo3559c(View view, int i2, int i3, int i4, int i5, boolean z) {
        DivGalleryItemHelper.CC.m17057a(this, view, i2, i3, i4, i5, z);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    /* renamed from: d */
    public int mo3560d() {
        int m3883a0 = m3883a0();
        int[] iArr = new int[m3883a0];
        m3978p1(iArr);
        if (m3883a0 == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[ArraysKt.m31928D(iArr)];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: e0 */
    public int mo3889e0() {
        return super.mo3889e0() - (m17068P1() / 2);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    /* renamed from: f */
    public void mo3561f(@NotNull View view, int i2, int i3, int i4, int i5) {
        super.mo3570o0(view, i2, i3, i4, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: f0 */
    public int mo3891f0() {
        return super.mo3891f0() - (m17068P1() / 2);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    /* renamed from: g */
    public void mo3562g(int i2) {
        int i3 = DivGalleryItemHelper.CC.f32623a;
        DivGalleryItemHelper.CC.m17063g(this, i2, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: g0 */
    public int mo3892g0() {
        return super.mo3892g0() - (m17068P1() / 2);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    /* renamed from: getView, reason: from getter */
    public RecyclerView getF32626P() {
        return this.f32626P;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    /* renamed from: h, reason: from getter */
    public Div2View getF32625O() {
        return this.f32625O;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: h0 */
    public int mo3893h0() {
        return super.mo3893h0() - (m17068P1() / 2);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    /* renamed from: i */
    public int mo3564i(@NotNull View view) {
        return m3894i0(view);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    /* renamed from: j */
    public int mo3565j() {
        int[] iArr = new int[m3883a0()];
        m3977o1(iArr);
        return ArraysKt.m31925A(iArr);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    /* renamed from: k */
    public Set mo3566k() {
        return this.f32628R;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    /* renamed from: m */
    public List<Div> mo3567m() {
        RecyclerView.Adapter adapter = this.f32626P.getAdapter();
        DivGalleryBinder.GalleryAdapter galleryAdapter = adapter instanceof DivGalleryBinder.GalleryAdapter ? (DivGalleryBinder.GalleryAdapter) adapter : null;
        List<Div> list = galleryAdapter != null ? galleryAdapter.f32290c : null;
        return list == null ? this.f32627Q.f35956r : list;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    /* renamed from: n */
    public int mo3568n() {
        return this.f5577q;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    /* renamed from: o */
    public /* synthetic */ void mo3569o(View view, boolean z) {
        DivGalleryItemHelper.CC.m17064h(this, view, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: o0 */
    public void mo3570o0(@NotNull View view, int i2, int i3, int i4, int i5) {
        mo3559c(view, i2, i3, i4, i5, (r14 & 32) != 0 ? false : false);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    /* renamed from: p */
    public int mo3571p() {
        return this.f5672w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: t0 */
    public void mo3573t0(@NotNull RecyclerView view) {
        Intrinsics.m32179h(view, "view");
        DivGalleryItemHelper.CC.m17058b(this, view);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: u0 */
    public void mo3574u0(@NotNull RecyclerView view, @NotNull RecyclerView.Recycler recycler) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(recycler, "recycler");
        super.mo3574u0(view, recycler);
        DivGalleryItemHelper.CC.m17059c(this, view, recycler);
    }
}
