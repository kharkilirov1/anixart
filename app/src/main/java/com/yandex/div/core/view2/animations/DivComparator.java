package com.yandex.div.core.view2.animations;

import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivCustom;
import com.yandex.div2.DivData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivComparator.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/animations/DivComparator;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivComparator {

    /* renamed from: a */
    @NotNull
    public static final DivComparator f31728a = new DivComparator();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final boolean m16880a(List<? extends Div> list, List<? extends Div> list2, ExpressionResolver expressionResolver) {
        if (list.size() != list2.size()) {
            return false;
        }
        ArrayList arrayList = (ArrayList) CollectionsKt.m32039p0(list, list2);
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (!f31728a.m16881b((Div) pair.f63055b, (Div) pair.f63056c, expressionResolver)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m16881b(@Nullable Div div, @Nullable Div div2, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(resolver, "resolver");
        if (!Intrinsics.m32174c(div == null ? null : div.getClass(), div2 != null ? div2.getClass() : null)) {
            return false;
        }
        if (div == null || div2 == null || div == div2) {
            return true;
        }
        return m16882c(div.m17557a(), div2.m17557a(), resolver) && m16880a(m16883d(div), m16883d(div2), resolver);
    }

    /* renamed from: c */
    public final boolean m16882c(DivBase divBase, DivBase divBase2, ExpressionResolver expressionResolver) {
        if (divBase.getF36480s() != null && divBase2.getF36480s() != null && !Intrinsics.m32174c(divBase.getF36480s(), divBase2.getF36480s())) {
            return false;
        }
        if ((divBase instanceof DivCustom) && (divBase2 instanceof DivCustom) && !Intrinsics.m32174c(((DivCustom) divBase).f35294i, ((DivCustom) divBase2).f35294i)) {
            return false;
        }
        return ((divBase instanceof DivContainer) && (divBase2 instanceof DivContainer) && BaseDivViewExtensionsKt.m16918H((DivContainer) divBase, expressionResolver) != BaseDivViewExtensionsKt.m16918H((DivContainer) divBase2, expressionResolver)) ? false : true;
    }

    /* renamed from: d */
    public final List<Div> m16883d(Div div) {
        if (div instanceof Div.Container) {
            return ((Div.Container) div).f34421c.f34953t;
        }
        if (div instanceof Div.Grid) {
            return ((Div.Grid) div).f34425c.f36481t;
        }
        if (!(div instanceof Div.Image) && !(div instanceof Div.GifImage) && !(div instanceof Div.Text) && !(div instanceof Div.Separator) && !(div instanceof Div.Gallery) && !(div instanceof Div.Pager) && !(div instanceof Div.Tabs) && !(div instanceof Div.State) && !(div instanceof Div.Custom) && !(div instanceof Div.Input) && !(div instanceof Div.Select) && !(div instanceof Div.Indicator) && !(div instanceof Div.Slider) && !(div instanceof Div.Video)) {
            throw new NoWhenBranchMatchedException();
        }
        return EmptyList.f63144b;
    }

    /* renamed from: e */
    public final boolean m16884e(@Nullable DivData divData, @NotNull DivData divData2, long j2, @NotNull ExpressionResolver resolver) {
        Object obj;
        Object obj2;
        Intrinsics.m32179h(resolver, "resolver");
        if (divData == null) {
            return false;
        }
        Iterator<T> it = divData.f35453b.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((DivData.State) obj2).f35464b == j2) {
                break;
            }
        }
        DivData.State state = (DivData.State) obj2;
        if (state == null) {
            return false;
        }
        Iterator<T> it2 = divData2.f35453b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((DivData.State) next).f35464b == j2) {
                obj = next;
                break;
            }
        }
        DivData.State state2 = (DivData.State) obj;
        if (state2 == null) {
            return false;
        }
        return m16881b(state.f35463a, state2.f35463a, resolver);
    }
}
