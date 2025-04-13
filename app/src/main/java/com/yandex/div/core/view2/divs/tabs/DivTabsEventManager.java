package com.yandex.div.core.view2.divs.tabs;

import androidx.viewpager.widget.ViewPager;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.internal.widget.tabs.TabsLayout;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivTabs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivTabsEventManager.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/tabs/DivTabsEventManager;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "Lcom/yandex/div/internal/widget/tabs/BaseDivTabbedCardUi$ActiveTabClickListener;", "Lcom/yandex/div2/DivAction;", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivTabsEventManager implements ViewPager.OnPageChangeListener, BaseDivTabbedCardUi.ActiveTabClickListener<DivAction> {

    /* renamed from: a */
    @NotNull
    public final Div2View f32701a;

    /* renamed from: b */
    @NotNull
    public final DivActionBinder f32702b;

    /* renamed from: c */
    @NotNull
    public final Div2Logger f32703c;

    /* renamed from: d */
    @NotNull
    public final DivVisibilityActionTracker f32704d;

    /* renamed from: e */
    @NotNull
    public final TabsLayout f32705e;

    /* renamed from: f */
    @NotNull
    public DivTabs f32706f;

    /* renamed from: g */
    public int f32707g;

    /* compiled from: DivTabsEventManager.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/tabs/DivTabsEventManager$Companion;", "", "", "NO_POSITION", "I", "", "TAG", "Ljava/lang/String;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    public DivTabsEventManager(@NotNull Div2View div2View, @NotNull DivActionBinder actionBinder, @NotNull Div2Logger div2Logger, @NotNull DivVisibilityActionTracker visibilityActionTracker, @NotNull TabsLayout tabLayout, @NotNull DivTabs div) {
        Intrinsics.m32179h(div2View, "div2View");
        Intrinsics.m32179h(actionBinder, "actionBinder");
        Intrinsics.m32179h(div2Logger, "div2Logger");
        Intrinsics.m32179h(visibilityActionTracker, "visibilityActionTracker");
        Intrinsics.m32179h(tabLayout, "tabLayout");
        Intrinsics.m32179h(div, "div");
        this.f32701a = div2View;
        this.f32702b = actionBinder;
        this.f32703c = div2Logger;
        this.f32704d = visibilityActionTracker;
        this.f32705e = tabLayout;
        this.f32706f = div;
        this.f32707g = -1;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.ActiveTabClickListener
    /* renamed from: a */
    public void mo17081a(DivAction divAction, int i2) {
        DivAction action = divAction;
        Intrinsics.m32179h(action, "action");
        if (action.f34553c != null) {
            KLog kLog = KLog.f33717a;
        }
        this.f32703c.mo16569d(this.f32701a, i2, action);
        this.f32702b.m16970a(this.f32701a, action, null);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    /* renamed from: b */
    public void mo4343b(int i2) {
        this.f32703c.mo16568c(this.f32701a, i2);
        m17083f(i2);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    /* renamed from: c */
    public void mo4344c(int i2, float f2, int i3) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    /* renamed from: d */
    public void mo4345d(int i2) {
    }

    /* renamed from: e */
    public final ViewPager m17082e() {
        return this.f32705e.getViewPager();
    }

    /* renamed from: f */
    public final void m17083f(int i2) {
        int i3 = this.f32707g;
        if (i2 == i3) {
            return;
        }
        if (i3 != -1) {
            this.f32704d.m16876d(this.f32701a, null, r4, (r5 & 8) != 0 ? BaseDivViewExtensionsKt.m16911A(this.f32706f.f39522o.get(i3).f39540a.m17557a()) : null);
            this.f32701a.m16809G(m17082e());
        }
        DivTabs.Item item = this.f32706f.f39522o.get(i2);
        this.f32704d.m16876d(this.f32701a, m17082e(), r4, (r5 & 8) != 0 ? BaseDivViewExtensionsKt.m16911A(item.f39540a.m17557a()) : null);
        this.f32701a.m16814o(m17082e(), item.f39540a);
        this.f32707g = i2;
    }
}
