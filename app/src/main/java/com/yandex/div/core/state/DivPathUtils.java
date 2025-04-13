package com.yandex.div.core.state;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$children$1;
import com.google.android.exoplayer2.metadata.mp4.C1062a;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div2.Div;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivPathUtils.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/state/DivPathUtils;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivPathUtils {

    /* renamed from: a */
    @NotNull
    public static final DivPathUtils f31323a = new DivPathUtils();

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: a */
    public final List<DivStatePath> m16706a(@NotNull List<DivStatePath> list) {
        List list2;
        if (list.isEmpty()) {
            return list;
        }
        List<DivStatePath> m32017d0 = CollectionsKt.m32017d0(list, C1062a.f12099k);
        Object m32044u = CollectionsKt.m32044u(m32017d0);
        int m32032m = CollectionsKt.m32032m(m32017d0, 9);
        if (m32032m == 0) {
            list2 = CollectionsKt.m31993F(m32044u);
        } else {
            ArrayList arrayList = new ArrayList(m32032m + 1);
            arrayList.add(m32044u);
            Object obj = m32044u;
            for (DivStatePath other : m32017d0) {
                DivStatePath divStatePath = (DivStatePath) obj;
                Objects.requireNonNull(divStatePath);
                Intrinsics.m32179h(other, "other");
                boolean z = false;
                if (divStatePath.f31331a == other.f31331a && divStatePath.f31332b.size() < other.f31332b.size()) {
                    Iterator<T> it = divStatePath.f31332b.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        }
                        Object next = it.next();
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.m32023h0();
                            throw null;
                        }
                        Pair pair = (Pair) next;
                        Pair<String, String> pair2 = other.f31332b.get(i2);
                        if (!Intrinsics.m32174c((String) pair.f63055b, pair2.f63055b) || !Intrinsics.m32174c((String) pair.f63056c, pair2.f63056c)) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                if (!z) {
                    divStatePath = other;
                }
                arrayList.add(divStatePath);
                obj = divStatePath;
            }
            list2 = arrayList;
        }
        return CollectionsKt.m32036o(list2);
    }

    /* renamed from: b */
    public final Div m16707b(Div div, String str) {
        if (div instanceof Div.State) {
            Div.State state = (Div.State) div;
            if (Intrinsics.m32174c(m16711f(state.f34433c, null), str)) {
                return div;
            }
            List<DivState.State> list = state.f34433c.f39242s;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Div div2 = ((DivState.State) it.next()).f39259c;
                if (div2 != null) {
                    arrayList.add(div2);
                }
            }
            return m16709d(arrayList, str);
        }
        if (div instanceof Div.Tabs) {
            List<DivTabs.Item> list2 = ((Div.Tabs) div).f34434c.f39522o;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((DivTabs.Item) it2.next()).f39540a);
            }
            return m16709d(arrayList2, str);
        }
        if (div instanceof Div.Container) {
            return m16709d(((Div.Container) div).f34421c.f34953t, str);
        }
        if (div instanceof Div.Grid) {
            return m16709d(((Div.Grid) div).f34425c.f36481t, str);
        }
        if (div instanceof Div.Gallery) {
            return m16709d(((Div.Gallery) div).f34423c.f35956r, str);
        }
        if (div instanceof Div.Pager) {
            return m16709d(((Div.Pager) div).f34429c.f37799o, str);
        }
        if ((div instanceof Div.Custom) || (div instanceof Div.Text) || (div instanceof Div.Image) || (div instanceof Div.Slider) || (div instanceof Div.Input) || (div instanceof Div.GifImage) || (div instanceof Div.Indicator) || (div instanceof Div.Separator) || (div instanceof Div.Select) || (div instanceof Div.Video)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: c */
    public final Div m16708c(@NotNull Div div, @NotNull DivStatePath path) {
        Intrinsics.m32179h(div, "<this>");
        Intrinsics.m32179h(path, "path");
        List<Pair<String, String>> list = path.f31332b;
        if (list.isEmpty()) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            div = f31323a.m16707b(div, (String) ((Pair) it.next()).f63055b);
            if (div == null) {
                return null;
            }
        }
        return div;
    }

    /* renamed from: d */
    public final Div m16709d(Iterable<? extends Div> iterable, String str) {
        Iterator<? extends Div> it = iterable.iterator();
        while (it.hasNext()) {
            Div m16707b = f31323a.m16707b(it.next(), str);
            if (m16707b != null) {
                return m16707b;
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: e */
    public final DivStateLayout m16710e(@NotNull View view, @NotNull DivStatePath path) {
        Intrinsics.m32179h(view, "<this>");
        Intrinsics.m32179h(path, "path");
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof DivStateLayout) {
            DivStateLayout divStateLayout = (DivStateLayout) view;
            DivStatePath path2 = divStateLayout.getPath();
            if (Intrinsics.m32174c(path2 == null ? null : path2.m16717b(), path.m16717b())) {
                return divStateLayout;
            }
        }
        Iterator<View> it = ((ViewGroupKt$children$1) ViewGroupKt.m2377b((ViewGroup) view)).iterator();
        while (it.hasNext()) {
            DivStateLayout m16710e = m16710e(it.next(), path);
            if (m16710e != null) {
                return m16710e;
            }
        }
        return null;
    }

    @NotNull
    /* renamed from: f */
    public final String m16711f(@NotNull DivState divState, @Nullable Function0<Unit> function0) {
        Intrinsics.m32179h(divState, "<this>");
        String str = divState.f39233j;
        if (str != null) {
            return str;
        }
        String str2 = divState.f39237n;
        if (str2 != null) {
            return str2;
        }
        if (function0 != null) {
            function0.invoke();
        }
        return "";
    }
}
