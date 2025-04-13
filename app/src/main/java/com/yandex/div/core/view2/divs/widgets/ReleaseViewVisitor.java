package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import androidx.collection.SparseArrayCompat;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.div.core.DivCustomViewAdapter;
import com.yandex.div.core.dagger.DivViewScope;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.util.SparseArrayIterable;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.internal.widget.tabs.TabsLayout;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivCustom;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleaseViewVisitor.kt */
@DivViewScope
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/widgets/ReleaseViewVisitor;", "Lcom/yandex/div/core/view2/divs/widgets/DivViewVisitor;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class ReleaseViewVisitor extends DivViewVisitor {

    /* renamed from: a */
    @NotNull
    public final Div2View f32862a;

    /* renamed from: b */
    @Nullable
    public final DivCustomViewAdapter f32863b;

    /* renamed from: c */
    @NotNull
    public final DivExtensionController f32864c;

    @Inject
    public ReleaseViewVisitor(@NotNull Div2View divView, @Nullable DivCustomViewAdapter divCustomViewAdapter, @NotNull DivExtensionController divExtensionController) {
        Intrinsics.m32179h(divView, "divView");
        Intrinsics.m32179h(divExtensionController, "divExtensionController");
        this.f32862a = divView;
        this.f32863b = divCustomViewAdapter;
        this.f32864c = divExtensionController;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: a */
    public void mo16833a(@NotNull View view) {
        Object tag = view.getTag(C2507R.id.div_custom_tag);
        DivCustom divCustom = tag instanceof DivCustom ? (DivCustom) tag : null;
        if (divCustom != null) {
            m17111r(view, divCustom);
            DivCustomViewAdapter divCustomViewAdapter = this.f32863b;
            if (divCustomViewAdapter == null) {
                return;
            }
            divCustomViewAdapter.release(view, divCustom);
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: b */
    public void mo16834b(@NotNull DivFrameLayout divFrameLayout) {
        m17111r(divFrameLayout, divFrameLayout.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: c */
    public void mo16835c(@NotNull DivGifImageView divGifImageView) {
        m17111r(divGifImageView, divGifImageView.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: d */
    public void mo16836d(@NotNull DivGridLayout divGridLayout) {
        m17111r(divGridLayout, divGridLayout.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: e */
    public void mo16837e(@NotNull DivImageView divImageView) {
        m17111r(divImageView, divImageView.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: f */
    public void mo16838f(@NotNull DivLineHeightTextView divLineHeightTextView) {
        m17111r(divLineHeightTextView, divLineHeightTextView.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: g */
    public void mo16839g(@NotNull DivLinearLayout divLinearLayout) {
        m17111r(divLinearLayout, divLinearLayout.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: h */
    public void mo16840h(@NotNull DivPagerIndicatorView divPagerIndicatorView) {
        m17111r(divPagerIndicatorView, divPagerIndicatorView.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: i */
    public void mo16841i(@NotNull DivPagerView divPagerView) {
        m17111r(divPagerView, divPagerView.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: j */
    public void mo16842j(@NotNull DivRecyclerView divRecyclerView) {
        m17111r(divRecyclerView, divRecyclerView.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: k */
    public void mo16843k(@NotNull DivSelectView divSelectView) {
        m17111r(divSelectView, divSelectView.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: l */
    public void mo16844l(@NotNull DivSeparatorView divSeparatorView) {
        m17111r(divSeparatorView, divSeparatorView.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: m */
    public void mo16845m(@NotNull DivSliderView divSliderView) {
        m17111r(divSliderView, divSliderView.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: n */
    public void mo16846n(@NotNull DivStateLayout divStateLayout) {
        m17111r(divStateLayout, divStateLayout.getDivState());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: o */
    public void mo16847o(@NotNull DivVideoView divVideoView) {
        m17111r(divVideoView, divVideoView.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: p */
    public void mo16848p(@NotNull DivWrapLayout divWrapLayout) {
        m17111r(divWrapLayout, divWrapLayout.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: q */
    public void mo16849q(@NotNull TabsLayout tabsLayout) {
        m17111r(tabsLayout, tabsLayout.getDiv());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public final void m17111r(View view, DivBase divBase) {
        if (divBase != null) {
            this.f32864c.m16694d(this.f32862a, view, divBase);
        }
        if (view instanceof Releasable) {
            ((Releasable) view).release();
        }
        Object tag = view.getTag(C2507R.id.div_releasable_list);
        SparseArrayCompat sparseArrayCompat = tag instanceof SparseArrayCompat ? (SparseArrayCompat) tag : null;
        SparseArrayIterable sparseArrayIterable = sparseArrayCompat != null ? new SparseArrayIterable(sparseArrayCompat) : null;
        if (sparseArrayIterable == null) {
            return;
        }
        Iterator it = sparseArrayIterable.iterator();
        while (it.hasNext()) {
            ((Releasable) it.next()).release();
        }
    }
}
