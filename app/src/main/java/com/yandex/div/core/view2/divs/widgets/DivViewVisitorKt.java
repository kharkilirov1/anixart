package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$children$1;
import com.yandex.div.internal.widget.tabs.TabsLayout;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivViewVisitor.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivViewVisitorKt {
    /* renamed from: a */
    public static final void m17105a(@NotNull DivViewVisitor divViewVisitor, @NotNull View view) {
        Intrinsics.m32179h(divViewVisitor, "<this>");
        Intrinsics.m32179h(view, "view");
        if (view instanceof DivWrapLayout) {
            divViewVisitor.mo16848p((DivWrapLayout) view);
            Iterator<View> it = ((ViewGroupKt$children$1) ViewGroupKt.m2377b((ViewGroup) view)).iterator();
            while (it.hasNext()) {
                m17105a(divViewVisitor, it.next());
            }
            return;
        }
        if (view instanceof DivFrameLayout) {
            divViewVisitor.mo16834b((DivFrameLayout) view);
            Iterator<View> it2 = ((ViewGroupKt$children$1) ViewGroupKt.m2377b((ViewGroup) view)).iterator();
            while (it2.hasNext()) {
                m17105a(divViewVisitor, it2.next());
            }
            return;
        }
        if (view instanceof DivGridLayout) {
            divViewVisitor.mo16836d((DivGridLayout) view);
            Iterator<View> it3 = ((ViewGroupKt$children$1) ViewGroupKt.m2377b((ViewGroup) view)).iterator();
            while (it3.hasNext()) {
                m17105a(divViewVisitor, it3.next());
            }
            return;
        }
        if (view instanceof DivLinearLayout) {
            divViewVisitor.mo16839g((DivLinearLayout) view);
            Iterator<View> it4 = ((ViewGroupKt$children$1) ViewGroupKt.m2377b((ViewGroup) view)).iterator();
            while (it4.hasNext()) {
                m17105a(divViewVisitor, it4.next());
            }
            return;
        }
        if (view instanceof DivPagerView) {
            divViewVisitor.mo16841i((DivPagerView) view);
            Iterator<View> it5 = ((ViewGroupKt$children$1) ViewGroupKt.m2377b((ViewGroup) view)).iterator();
            while (it5.hasNext()) {
                m17105a(divViewVisitor, it5.next());
            }
            return;
        }
        if (view instanceof DivRecyclerView) {
            divViewVisitor.mo16842j((DivRecyclerView) view);
            Iterator<View> it6 = ((ViewGroupKt$children$1) ViewGroupKt.m2377b((ViewGroup) view)).iterator();
            while (it6.hasNext()) {
                m17105a(divViewVisitor, it6.next());
            }
            return;
        }
        if (view instanceof DivStateLayout) {
            divViewVisitor.mo16846n((DivStateLayout) view);
            Iterator<View> it7 = ((ViewGroupKt$children$1) ViewGroupKt.m2377b((ViewGroup) view)).iterator();
            while (it7.hasNext()) {
                m17105a(divViewVisitor, it7.next());
            }
            return;
        }
        if (view instanceof TabsLayout) {
            divViewVisitor.mo16849q((TabsLayout) view);
            Iterator<View> it8 = ((ViewGroupKt$children$1) ViewGroupKt.m2377b((ViewGroup) view)).iterator();
            while (it8.hasNext()) {
                m17105a(divViewVisitor, it8.next());
            }
            return;
        }
        if (view instanceof DivSeparatorView) {
            divViewVisitor.mo16844l((DivSeparatorView) view);
            return;
        }
        if (view instanceof DivGifImageView) {
            divViewVisitor.mo16835c((DivGifImageView) view);
            return;
        }
        if (view instanceof DivImageView) {
            divViewVisitor.mo16837e((DivImageView) view);
            return;
        }
        if (view instanceof DivLineHeightTextView) {
            divViewVisitor.mo16838f((DivLineHeightTextView) view);
            return;
        }
        if (view instanceof DivPagerIndicatorView) {
            divViewVisitor.mo16840h((DivPagerIndicatorView) view);
            return;
        }
        if (view instanceof DivSliderView) {
            divViewVisitor.mo16845m((DivSliderView) view);
            return;
        }
        if (view instanceof DivSelectView) {
            divViewVisitor.mo16843k((DivSelectView) view);
            return;
        }
        if (view instanceof DivVideoView) {
            divViewVisitor.mo16847o((DivVideoView) view);
            return;
        }
        divViewVisitor.mo16833a(view);
        if (view instanceof ViewGroup) {
            Iterator<View> it9 = ((ViewGroupKt$children$1) ViewGroupKt.m2377b((ViewGroup) view)).iterator();
            while (it9.hasNext()) {
                m17105a(divViewVisitor, it9.next());
            }
        }
    }
}
