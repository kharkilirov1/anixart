package com.yandex.div.core.view2.state;

import android.view.View;
import com.yandex.div.core.dagger.DivViewScope;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div2.Div;
import com.yandex.div2.DivData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivMultipleStateSwitcher.kt */
@DivViewScope
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/state/DivMultipleStateSwitcher;", "Lcom/yandex/div/core/view2/state/DivStateSwitcher;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivMultipleStateSwitcher implements DivStateSwitcher {

    /* renamed from: a */
    @NotNull
    public final Div2View f32945a;

    /* renamed from: b */
    @NotNull
    public final DivBinder f32946b;

    @Inject
    public DivMultipleStateSwitcher(@NotNull Div2View divView, @NotNull DivBinder divBinder) {
        Intrinsics.m32179h(divView, "divView");
        Intrinsics.m32179h(divBinder, "divBinder");
        this.f32945a = divView;
        this.f32946b = divBinder;
    }

    @Override // com.yandex.div.core.view2.state.DivStateSwitcher
    /* renamed from: a */
    public void mo17131a(@NotNull DivData.State state, @NotNull List<DivStatePath> list) {
        View rootView = this.f32945a.getChildAt(0);
        Div div = state.f35463a;
        List<DivStatePath> m16706a = DivPathUtils.f31323a.m16706a(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m16706a) {
            if (!((DivStatePath) obj).m16718c()) {
                arrayList.add(obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DivStatePath divStatePath = (DivStatePath) it.next();
            DivPathUtils divPathUtils = DivPathUtils.f31323a;
            Intrinsics.m32178g(rootView, "rootView");
            DivStateLayout m16710e = divPathUtils.m16710e(rootView, divStatePath);
            Div m16708c = divPathUtils.m16708c(div, divStatePath);
            Div.State state2 = m16708c instanceof Div.State ? (Div.State) m16708c : null;
            if (m16710e != null && state2 != null && !linkedHashSet.contains(m16710e)) {
                this.f32946b.m16852b(m16710e, state2, this.f32945a, divStatePath.m16719d());
                linkedHashSet.add(m16710e);
            }
        }
        if (linkedHashSet.isEmpty()) {
            DivBinder divBinder = this.f32946b;
            Intrinsics.m32178g(rootView, "rootView");
            divBinder.m16852b(rootView, div, this.f32945a, DivStatePath.f31330c.m16720a(state.f35464b));
        }
        this.f32946b.m16851a();
    }
}
