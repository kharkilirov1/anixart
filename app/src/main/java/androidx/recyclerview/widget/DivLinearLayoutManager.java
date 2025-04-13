package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.gallery.DivGalleryBinder;
import com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div2.Div;
import com.yandex.div2.DivGallery;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivLinearLayoutManager.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Landroidx/recyclerview/widget/DivLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lcom/yandex/div/core/view2/divs/gallery/DivGalleryItemHelper;", "DivRecyclerViewLayoutParams", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class DivLinearLayoutManager extends LinearLayoutManager implements DivGalleryItemHelper {

    /* renamed from: H */
    @NotNull
    public final Div2View f5269H;

    /* renamed from: I */
    @NotNull
    public final RecyclerView f5270I;

    /* renamed from: J */
    @NotNull
    public final DivGallery f5271J;

    /* renamed from: K */
    @NotNull
    public final HashSet<View> f5272K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivLinearLayoutManager(@NotNull Div2View divView, @NotNull RecyclerView recyclerView, @NotNull DivGallery divGallery, int i2) {
        super(i2, false);
        Intrinsics.m32179h(divView, "divView");
        recyclerView.getContext();
        this.f5269H = divView;
        this.f5270I = recyclerView;
        this.f5271J = divGallery;
        this.f5272K = new HashSet<>();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
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
        View m3555O1 = m3555O1(i2);
        if (m3555O1 == null) {
            return;
        }
        mo3569o(m3555O1, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: L0 */
    public void mo3550L0(@NotNull RecyclerView.Recycler recycler) {
        Intrinsics.m32179h(recycler, "recycler");
        DivGalleryItemHelper.CC.m17061e(this, recycler);
        super.mo3550L0(recycler);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    @NotNull
    /* renamed from: M */
    public RecyclerView.LayoutParams mo3551M() {
        return new DivRecyclerViewLayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @NotNull
    /* renamed from: N */
    public RecyclerView.LayoutParams mo3552N(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        return new DivRecyclerViewLayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @NotNull
    /* renamed from: O */
    public RecyclerView.LayoutParams mo3553O(@Nullable ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof DivRecyclerViewLayoutParams) {
            return new DivRecyclerViewLayoutParams((DivRecyclerViewLayoutParams) layoutParams);
        }
        if (layoutParams instanceof RecyclerView.LayoutParams) {
            return new DivRecyclerViewLayoutParams((RecyclerView.LayoutParams) layoutParams);
        }
        if (!(layoutParams instanceof DivLayoutParams) && !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return new DivRecyclerViewLayoutParams(layoutParams);
        }
        return new DivRecyclerViewLayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
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
    public View m3555O1(int i2) {
        return m3868P(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: P0 */
    public void mo3556P0(int i2) {
        super.mo3556P0(i2);
        int i3 = DivGalleryItemHelper.CC.f32623a;
        View m3555O1 = m3555O1(i2);
        if (m3555O1 == null) {
            return;
        }
        mo3569o(m3555O1, true);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    /* renamed from: a, reason: from getter */
    public DivGallery getF32627Q() {
        return this.f5271J;
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
        return m3697s1();
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    /* renamed from: f */
    public void mo3561f(@NotNull View view, int i2, int i3, int i4, int i5) {
        super.mo3570o0(view, i2, i3, i4, i5);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    /* renamed from: g */
    public void mo3562g(int i2) {
        int i3 = DivGalleryItemHelper.CC.f32623a;
        DivGalleryItemHelper.CC.m17063g(this, i2, 0);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    /* renamed from: getView, reason: from getter */
    public RecyclerView getF32626P() {
        return this.f5270I;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    /* renamed from: h, reason: from getter */
    public Div2View getF32625O() {
        return this.f5269H;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    /* renamed from: i */
    public int mo3564i(@NotNull View view) {
        return m3894i0(view);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    /* renamed from: j */
    public int mo3565j() {
        return m3695r1();
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    /* renamed from: k */
    public Set mo3566k() {
        return this.f5272K;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    /* renamed from: m */
    public List<Div> mo3567m() {
        RecyclerView.Adapter adapter = this.f5270I.getAdapter();
        DivGalleryBinder.GalleryAdapter galleryAdapter = adapter instanceof DivGalleryBinder.GalleryAdapter ? (DivGalleryBinder.GalleryAdapter) adapter : null;
        List<Div> list = galleryAdapter != null ? galleryAdapter.f32290c : null;
        return list == null ? this.f5271J.f35956r : list;
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
        return this.f5413s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: p0 */
    public void mo3572p0(@NotNull View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.DivLinearLayoutManager.DivRecyclerViewLayoutParams");
        DivRecyclerViewLayoutParams divRecyclerViewLayoutParams = (DivRecyclerViewLayoutParams) layoutParams;
        Rect m3784T = this.f5270I.m3784T(view);
        int m17062f = DivGalleryItemHelper.CC.m17062f(this.f5577q, this.f5575o, mo3892g0() + mo3891f0() + ((ViewGroup.MarginLayoutParams) divRecyclerViewLayoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) divRecyclerViewLayoutParams).rightMargin + i2 + m3784T.left + m3784T.right, ((ViewGroup.MarginLayoutParams) divRecyclerViewLayoutParams).width, divRecyclerViewLayoutParams.f5274f, mo3700v());
        int m17062f2 = DivGalleryItemHelper.CC.m17062f(this.f5578r, this.f5576p, mo3889e0() + mo3893h0() + ((ViewGroup.MarginLayoutParams) divRecyclerViewLayoutParams).topMargin + ((ViewGroup.MarginLayoutParams) divRecyclerViewLayoutParams).bottomMargin + i3 + m3784T.top + m3784T.bottom, ((ViewGroup.MarginLayoutParams) divRecyclerViewLayoutParams).height, divRecyclerViewLayoutParams.f5273e, mo3701w());
        if (m3884a1(view, m17062f, m17062f2, divRecyclerViewLayoutParams)) {
            view.measure(m17062f, m17062f2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: t0 */
    public void mo3573t0(@NotNull RecyclerView view) {
        Intrinsics.m32179h(view, "view");
        DivGalleryItemHelper.CC.m17058b(this, view);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: u0 */
    public void mo3574u0(@NotNull RecyclerView view, @NotNull RecyclerView.Recycler recycler) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(recycler, "recycler");
        DivGalleryItemHelper.CC.m17059c(this, view, recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: x */
    public boolean mo3575x(@Nullable RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof DivRecyclerViewLayoutParams;
    }

    /* compiled from: DivLinearLayoutManager.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/recyclerview/widget/DivLinearLayoutManager$DivRecyclerViewLayoutParams;", "Landroidx/recyclerview/widget/RecyclerView$LayoutParams;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class DivRecyclerViewLayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: e */
        public int f5273e;

        /* renamed from: f */
        public int f5274f;

        public DivRecyclerViewLayoutParams(@Nullable Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5273e = Integer.MAX_VALUE;
            this.f5274f = Integer.MAX_VALUE;
        }

        public DivRecyclerViewLayoutParams(int i2, int i3) {
            super(i2, i3);
            this.f5273e = Integer.MAX_VALUE;
            this.f5274f = Integer.MAX_VALUE;
        }

        public DivRecyclerViewLayoutParams(@Nullable ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5273e = Integer.MAX_VALUE;
            this.f5274f = Integer.MAX_VALUE;
        }

        public DivRecyclerViewLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5273e = Integer.MAX_VALUE;
            this.f5274f = Integer.MAX_VALUE;
        }

        public DivRecyclerViewLayoutParams(@Nullable RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5273e = Integer.MAX_VALUE;
            this.f5274f = Integer.MAX_VALUE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DivRecyclerViewLayoutParams(@NotNull DivRecyclerViewLayoutParams source) {
            super((RecyclerView.LayoutParams) source);
            Intrinsics.m32179h(source, "source");
            this.f5273e = Integer.MAX_VALUE;
            this.f5274f = Integer.MAX_VALUE;
            this.f5273e = source.f5273e;
            this.f5274f = source.f5274f;
        }
    }
}
