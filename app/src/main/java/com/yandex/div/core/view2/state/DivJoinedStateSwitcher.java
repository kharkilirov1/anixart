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
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivJoinedStateSwitcher.kt */
@DivViewScope
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/state/DivJoinedStateSwitcher;", "Lcom/yandex/div/core/view2/state/DivStateSwitcher;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivJoinedStateSwitcher implements DivStateSwitcher {

    /* renamed from: a */
    @NotNull
    public final Div2View f32941a;

    /* renamed from: b */
    @NotNull
    public final DivBinder f32942b;

    @Inject
    public DivJoinedStateSwitcher(@NotNull Div2View divView, @NotNull DivBinder divBinder) {
        Intrinsics.m32179h(divView, "divView");
        Intrinsics.m32179h(divBinder, "divBinder");
        this.f32941a = divView;
        this.f32942b = divBinder;
    }

    @Override // com.yandex.div.core.view2.state.DivStateSwitcher
    /* renamed from: a */
    public void mo17131a(@NotNull DivData.State state, @NotNull List<DivStatePath> list) {
        DivStatePath divStatePath;
        DivStatePath divStatePath2;
        View view = this.f32941a.getChildAt(0);
        Div div = state.f35463a;
        DivStatePath m16720a = DivStatePath.f31330c.m16720a(state.f35464b);
        int size = list.size();
        if (size == 0) {
            divStatePath = m16720a;
        } else if (size != 1) {
            Iterator<T> it = list.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                DivStatePath otherPath = (DivStatePath) it.next();
                DivStatePath somePath = (DivStatePath) next;
                Intrinsics.m32179h(somePath, "somePath");
                Intrinsics.m32179h(otherPath, "otherPath");
                if (somePath.f31331a != otherPath.f31331a) {
                    next = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    int i2 = 0;
                    for (Object obj : somePath.f31332b) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.m32023h0();
                            throw null;
                        }
                        Pair pair = (Pair) obj;
                        Pair pair2 = (Pair) CollectionsKt.m32048y(otherPath.f31332b, i2);
                        if (pair2 == null || !Intrinsics.m32174c(pair, pair2)) {
                            divStatePath2 = new DivStatePath(somePath.f31331a, arrayList);
                            break;
                        } else {
                            arrayList.add(pair);
                            i2 = i3;
                        }
                    }
                    divStatePath2 = new DivStatePath(somePath.f31331a, arrayList);
                    next = divStatePath2;
                }
                if (next == null) {
                    next = m16720a;
                }
            }
            divStatePath = (DivStatePath) next;
        } else {
            divStatePath = (DivStatePath) CollectionsKt.m32044u(list);
        }
        if (!divStatePath.m16718c()) {
            DivPathUtils divPathUtils = DivPathUtils.f31323a;
            Intrinsics.m32178g(view, "rootView");
            DivStateLayout m16710e = divPathUtils.m16710e(view, divStatePath);
            Div m16708c = divPathUtils.m16708c(div, divStatePath);
            Div.State state2 = m16708c instanceof Div.State ? (Div.State) m16708c : null;
            if (m16710e != null && state2 != null) {
                view = m16710e;
                m16720a = divStatePath;
                div = state2;
            }
        }
        DivBinder divBinder = this.f32942b;
        Intrinsics.m32178g(view, "view");
        divBinder.m16852b(view, div, this.f32941a, m16720a.m16719d());
        this.f32942b.m16851a();
    }
}
