package com.yandex.div.core.downloader;

import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivGrid;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivPatchApply.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/downloader/DivPatchApply;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivPatchApply {

    /* renamed from: a */
    @NotNull
    public final DivPatchMap f31157a;

    public DivPatchApply(@NotNull DivPatchMap divPatchMap) {
        this.f31157a = divPatchMap;
        new LinkedHashSet();
    }

    /* renamed from: a */
    public final List<Div> m16663a(Div div, ExpressionResolver expressionResolver) {
        Div div2;
        DivBase m17557a;
        if (div.m17557a().getF36480s() != null) {
            Objects.requireNonNull(this.f31157a);
            throw null;
        }
        if (div instanceof Div.Container) {
            DivContainer divContainer = ((Div.Container) div).f34421c;
            div2 = new Div.Container(new DivContainer(divContainer.f34934a, divContainer.f34935b, divContainer.f34936c, divContainer.f34937d, divContainer.f34938e, divContainer.f34939f, divContainer.f34940g, divContainer.f34941h, divContainer.f34942i, divContainer.f34943j, divContainer.f34944k, divContainer.f34945l, divContainer.f34946m, divContainer.f34947n, divContainer.f34948o, divContainer.f34949p, divContainer.f34950q, divContainer.f34951r, divContainer.f34952s, m16664b(divContainer.f34953t, expressionResolver), divContainer.f34954u, divContainer.f34955v, divContainer.f34956w, divContainer.f34957x, divContainer.f34958y, divContainer.f34959z, divContainer.f34921A, divContainer.f34922B, divContainer.f34923C, divContainer.f34924D, divContainer.f34925E, divContainer.f34926F, divContainer.f34927G, divContainer.f34928H, divContainer.f34929I, divContainer.f34930J, divContainer.f34931K, divContainer.f34932L, divContainer.f34933M));
        } else if (div instanceof Div.Grid) {
            DivGrid divGrid = ((Div.Grid) div).f34425c;
            div2 = new Div.Grid(new DivGrid(divGrid.f36462a, divGrid.f36463b, divGrid.f36464c, divGrid.f36465d, divGrid.f36466e, divGrid.f36467f, divGrid.f36468g, divGrid.f36469h, divGrid.f36470i, divGrid.f36471j, divGrid.f36472k, divGrid.f36473l, divGrid.f36474m, divGrid.f36475n, divGrid.f36476o, divGrid.f36477p, divGrid.f36478q, divGrid.f36479r, divGrid.f36480s, m16664b(divGrid.f36481t, expressionResolver), divGrid.f36482u, divGrid.f36483v, divGrid.f36484w, divGrid.f36485x, divGrid.f36486y, divGrid.f36487z, divGrid.f36453A, divGrid.f36454B, divGrid.f36455C, divGrid.f36456D, divGrid.f36457E, divGrid.f36458F, divGrid.f36459G, divGrid.f36460H, divGrid.f36461I));
        } else if (div instanceof Div.Gallery) {
            DivGallery divGallery = ((Div.Gallery) div).f34423c;
            div2 = new Div.Gallery(new DivGallery(divGallery.f35939a, divGallery.f35940b, divGallery.f35941c, divGallery.f35942d, divGallery.f35943e, divGallery.f35944f, divGallery.f35945g, divGallery.f35946h, divGallery.f35947i, divGallery.f35948j, divGallery.f35949k, divGallery.f35950l, divGallery.f35951m, divGallery.f35952n, divGallery.f35953o, divGallery.f35954p, divGallery.f35955q, m16664b(divGallery.f35956r, expressionResolver), divGallery.f35957s, divGallery.f35958t, divGallery.f35959u, divGallery.f35960v, divGallery.f35961w, divGallery.f35962x, divGallery.f35963y, divGallery.f35964z, divGallery.f35930A, divGallery.f35931B, divGallery.f35932C, divGallery.f35933D, divGallery.f35934E, divGallery.f35935F, divGallery.f35936G, divGallery.f35937H, divGallery.f35938I));
        } else if (div instanceof Div.Pager) {
            DivPager divPager = ((Div.Pager) div).f34429c;
            div2 = new Div.Pager(new DivPager(divPager.f37785a, divPager.f37786b, divPager.f37787c, divPager.f37788d, divPager.f37789e, divPager.f37790f, divPager.f37791g, divPager.f37792h, divPager.f37793i, divPager.f37794j, divPager.f37795k, divPager.f37796l, divPager.f37797m, divPager.f37798n, m16664b(divPager.f37799o, expressionResolver), divPager.f37800p, divPager.f37801q, divPager.f37802r, divPager.f37803s, divPager.f37804t, divPager.f37805u, divPager.f37806v, divPager.f37807w, divPager.f37808x, divPager.f37809y, divPager.f37810z, divPager.f37779A, divPager.f37780B, divPager.f37781C, divPager.f37782D, divPager.f37783E, divPager.f37784F));
        } else if (div instanceof Div.State) {
            DivState divState = ((Div.State) div).f34433c;
            List<DivState.State> list = divState.f39242s;
            ArrayList arrayList = new ArrayList();
            for (DivState.State state : list) {
                Div div3 = state.f39259c;
                if (((div3 == null || (m17557a = div3.m17557a()) == null) ? null : m17557a.getF36480s()) != null) {
                    Objects.requireNonNull(this.f31157a);
                    throw null;
                }
                arrayList.add(m16665c(state, expressionResolver));
            }
            div2 = new Div.State(new DivState(divState.f39224a, divState.f39225b, divState.f39226c, divState.f39227d, divState.f39228e, divState.f39229f, divState.f39230g, divState.f39231h, divState.f39232i, divState.f39233j, divState.f39234k, divState.f39235l, divState.f39236m, divState.f39237n, divState.f39238o, divState.f39239p, divState.f39240q, divState.f39241r, arrayList, divState.f39243t, divState.f39244u, divState.f39245v, divState.f39246w, divState.f39247x, divState.f39248y, divState.f39249z, divState.f39220A, divState.f39221B, divState.f39222C, divState.f39223D));
        } else if (div instanceof Div.Tabs) {
            DivTabs divTabs = ((Div.Tabs) div).f34434c;
            ArrayList arrayList2 = new ArrayList();
            for (DivTabs.Item item : divTabs.f39522o) {
                List<Div> m16663a = m16663a(item.f39540a, expressionResolver);
                if (m16663a.size() == 1) {
                    arrayList2.add(new DivTabs.Item(m16663a.get(0), item.f39541b, item.f39542c));
                } else {
                    arrayList2.add(item);
                }
            }
            div2 = new Div.Tabs(new DivTabs(divTabs.f39508a, divTabs.f39509b, divTabs.f39510c, divTabs.f39511d, divTabs.f39512e, divTabs.f39513f, divTabs.f39514g, divTabs.f39515h, divTabs.f39516i, divTabs.f39517j, divTabs.f39518k, divTabs.f39519l, divTabs.f39520m, divTabs.f39521n, arrayList2, divTabs.f39523p, divTabs.f39524q, divTabs.f39525r, divTabs.f39526s, divTabs.f39527t, divTabs.f39528u, divTabs.f39529v, divTabs.f39530w, divTabs.f39531x, divTabs.f39532y, divTabs.f39533z, divTabs.f39498A, divTabs.f39499B, divTabs.f39500C, divTabs.f39501D, divTabs.f39502E, divTabs.f39503F, divTabs.f39504G, divTabs.f39505H, divTabs.f39506I, divTabs.f39507J));
        } else {
            div2 = div;
        }
        return CollectionsKt.m31993F(div2);
    }

    /* renamed from: b */
    public final List<Div> m16664b(List<? extends Div> list, ExpressionResolver expressionResolver) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(m16663a((Div) it.next(), expressionResolver));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final DivState.State m16665c(DivState.State state, ExpressionResolver expressionResolver) {
        Div div = state.f39259c;
        List<Div> m16663a = div == null ? null : m16663a(div, expressionResolver);
        return m16663a != null && m16663a.size() == 1 ? new DivState.State(state.f39257a, state.f39258b, m16663a.get(0), state.f39260d, state.f39261e) : state;
    }
}
