package com.yandex.div.core.util;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.yandex.div.core.animation.EaseInInterpolator;
import com.yandex.div.core.animation.EaseInOutInterpolator;
import com.yandex.div.core.animation.EaseInterpolator;
import com.yandex.div.core.animation.EaseOutInterpolator;
import com.yandex.div.core.animation.SpringInterpolator;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivUtil.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivUtilKt {

    /* compiled from: DivUtil.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[DivAnimationInterpolator.values().length];
            DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.LINEAR;
            iArr[0] = 1;
            DivAnimationInterpolator divAnimationInterpolator2 = DivAnimationInterpolator.EASE;
            iArr[1] = 2;
            DivAnimationInterpolator divAnimationInterpolator3 = DivAnimationInterpolator.EASE_IN;
            iArr[2] = 3;
            DivAnimationInterpolator divAnimationInterpolator4 = DivAnimationInterpolator.EASE_OUT;
            iArr[3] = 4;
            DivAnimationInterpolator divAnimationInterpolator5 = DivAnimationInterpolator.EASE_IN_OUT;
            iArr[4] = 5;
            DivAnimationInterpolator divAnimationInterpolator6 = DivAnimationInterpolator.SPRING;
            iArr[5] = 6;
        }
    }

    /* renamed from: a */
    public static final boolean m16758a(@NotNull Div div) {
        Intrinsics.m32179h(div, "<this>");
        DivBase m17557a = div.m17557a();
        if (m17557a.getF39954S() != null || m17557a.getF39953R() != null || m17557a.getF39955T() != null) {
            return true;
        }
        if (div instanceof Div.Container) {
            List<Div> list = ((Div.Container) div).f34421c.f34953t;
            ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Boolean.valueOf(m16758a((Div) it.next())));
            }
            return arrayList.contains(Boolean.TRUE);
        }
        if (div instanceof Div.Grid) {
            List<Div> list2 = ((Div.Grid) div).f34425c.f36481t;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Boolean.valueOf(m16758a((Div) it2.next())));
            }
            return arrayList2.contains(Boolean.TRUE);
        }
        if ((div instanceof Div.Text) || (div instanceof Div.Image) || (div instanceof Div.GifImage) || (div instanceof Div.Separator) || (div instanceof Div.Indicator) || (div instanceof Div.State) || (div instanceof Div.Gallery) || (div instanceof Div.Pager) || (div instanceof Div.Tabs) || (div instanceof Div.Custom) || (div instanceof Div.Select) || (div instanceof Div.Slider) || (div instanceof Div.Video) || (div instanceof Div.Input)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* renamed from: b */
    public static final Interpolator m16759b(@NotNull DivAnimationInterpolator divAnimationInterpolator) {
        Intrinsics.m32179h(divAnimationInterpolator, "<this>");
        int ordinal = divAnimationInterpolator.ordinal();
        if (ordinal == 0) {
            return new LinearInterpolator();
        }
        if (ordinal == 1) {
            return new EaseInterpolator();
        }
        if (ordinal == 2) {
            return new EaseInInterpolator();
        }
        if (ordinal == 3) {
            return new EaseOutInterpolator();
        }
        if (ordinal == 4) {
            return new EaseInOutInterpolator();
        }
        if (ordinal == 5) {
            return new SpringInterpolator();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: c */
    public static final DivState.State m16760c(@NotNull DivState divState, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(resolver, "resolver");
        Expression<String> expression = divState.f39231h;
        DivState.State state = null;
        if (expression != null) {
            Iterator<T> it = divState.f39242s.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.m32174c(((DivState.State) next).f39260d, expression.mo17535b(resolver))) {
                    state = next;
                    break;
                }
            }
            state = state;
        }
        return state == null ? divState.f39242s.get(0) : state;
    }

    @NotNull
    /* renamed from: d */
    public static final String m16761d(@NotNull Div div) {
        Intrinsics.m32179h(div, "<this>");
        if (div instanceof Div.Text) {
            return "text";
        }
        if (div instanceof Div.Image) {
            return "image";
        }
        if (div instanceof Div.GifImage) {
            return "gif";
        }
        if (div instanceof Div.Separator) {
            return "separator";
        }
        if (div instanceof Div.Indicator) {
            return "indicator";
        }
        if (div instanceof Div.Slider) {
            return "slider";
        }
        if (div instanceof Div.Input) {
            return "input";
        }
        if (div instanceof Div.Video) {
            return "video";
        }
        if (div instanceof Div.Container) {
            return "container";
        }
        if (div instanceof Div.Grid) {
            return "grid";
        }
        if (div instanceof Div.State) {
            return "state";
        }
        if (div instanceof Div.Gallery) {
            return "gallery";
        }
        if (div instanceof Div.Pager) {
            return "pager";
        }
        if (div instanceof Div.Tabs) {
            return "tabs";
        }
        if (div instanceof Div.Custom) {
            return "custom";
        }
        if (div instanceof Div.Select) {
            return "select";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: e */
    public static final boolean m16762e(@NotNull Div div) {
        Intrinsics.m32179h(div, "<this>");
        if ((div instanceof Div.Text) || (div instanceof Div.Image) || (div instanceof Div.GifImage) || (div instanceof Div.Separator) || (div instanceof Div.Indicator) || (div instanceof Div.Slider) || (div instanceof Div.Input) || (div instanceof Div.Custom) || (div instanceof Div.Select) || (div instanceof Div.Video)) {
            return false;
        }
        if ((div instanceof Div.Container) || (div instanceof Div.Grid) || (div instanceof Div.Gallery) || (div instanceof Div.Pager) || (div instanceof Div.Tabs) || (div instanceof Div.State)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
