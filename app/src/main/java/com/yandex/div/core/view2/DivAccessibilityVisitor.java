package com.yandex.div.core.view2;

import android.view.View;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.div.core.view2.divs.widgets.DivFrameLayout;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.divs.widgets.DivLinearLayout;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div.core.view2.divs.widgets.DivViewVisitor;
import com.yandex.div.core.view2.divs.widgets.DivWrapLayout;
import com.yandex.div.internal.widget.tabs.TabsLayout;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivCustom;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivAccessibilityVisitor.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/DivAccessibilityVisitor;", "Lcom/yandex/div/core/view2/divs/widgets/DivViewVisitor;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivAccessibilityVisitor extends DivViewVisitor {

    /* renamed from: a */
    @NotNull
    public final DivAccessibilityBinder f31603a;

    /* renamed from: b */
    @NotNull
    public final Div2View f31604b;

    /* renamed from: c */
    @NotNull
    public final ExpressionResolver f31605c;

    public DivAccessibilityVisitor(@NotNull DivAccessibilityBinder divAccessibilityBinder, @NotNull Div2View div2View, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(divAccessibilityBinder, "divAccessibilityBinder");
        Intrinsics.m32179h(resolver, "resolver");
        this.f31603a = divAccessibilityBinder;
        this.f31604b = div2View;
        this.f31605c = resolver;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: a */
    public void mo16833a(@NotNull View view) {
        Object tag = view.getTag(C2507R.id.div_custom_tag);
        DivCustom divCustom = tag instanceof DivCustom ? (DivCustom) tag : null;
        if (divCustom != null) {
            m16850r(view, divCustom);
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: b */
    public void mo16834b(@NotNull DivFrameLayout divFrameLayout) {
        m16850r(divFrameLayout, divFrameLayout.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: c */
    public void mo16835c(@NotNull DivGifImageView divGifImageView) {
        m16850r(divGifImageView, divGifImageView.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: d */
    public void mo16836d(@NotNull DivGridLayout divGridLayout) {
        m16850r(divGridLayout, divGridLayout.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: e */
    public void mo16837e(@NotNull DivImageView divImageView) {
        m16850r(divImageView, divImageView.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: f */
    public void mo16838f(@NotNull DivLineHeightTextView divLineHeightTextView) {
        m16850r(divLineHeightTextView, divLineHeightTextView.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: g */
    public void mo16839g(@NotNull DivLinearLayout divLinearLayout) {
        m16850r(divLinearLayout, divLinearLayout.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: h */
    public void mo16840h(@NotNull DivPagerIndicatorView divPagerIndicatorView) {
        m16850r(divPagerIndicatorView, divPagerIndicatorView.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: i */
    public void mo16841i(@NotNull DivPagerView divPagerView) {
        m16850r(divPagerView, divPagerView.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: j */
    public void mo16842j(@NotNull DivRecyclerView divRecyclerView) {
        m16850r(divRecyclerView, divRecyclerView.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: k */
    public void mo16843k(@NotNull DivSelectView divSelectView) {
        m16850r(divSelectView, divSelectView.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: l */
    public void mo16844l(@NotNull DivSeparatorView divSeparatorView) {
        m16850r(divSeparatorView, divSeparatorView.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: m */
    public void mo16845m(@NotNull DivSliderView divSliderView) {
        m16850r(divSliderView, divSliderView.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: n */
    public void mo16846n(@NotNull DivStateLayout divStateLayout) {
        m16850r(divStateLayout, divStateLayout.getDivState());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: o */
    public void mo16847o(@NotNull DivVideoView divVideoView) {
        m16850r(divVideoView, divVideoView.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: p */
    public void mo16848p(@NotNull DivWrapLayout divWrapLayout) {
        m16850r(divWrapLayout, divWrapLayout.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: q */
    public void mo16849q(@NotNull TabsLayout tabsLayout) {
        m16850r(tabsLayout, tabsLayout.getDiv());
    }

    /* renamed from: r */
    public final void m16850r(View view, DivBase divBase) {
        if (divBase == null) {
            return;
        }
        this.f31603a.m16830b(view, this.f31604b, divBase.getF36714a().f34489c.mo17535b(this.f31605c));
    }
}
