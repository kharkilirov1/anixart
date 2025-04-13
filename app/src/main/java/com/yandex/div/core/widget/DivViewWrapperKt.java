package com.yandex.div.core.widget;

import android.view.ViewGroup;
import com.yandex.div.internal.widget.DivLayoutParams;
import kotlin.Metadata;

/* compiled from: DivViewWrapper.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivViewWrapperKt {
    /* renamed from: a */
    public static final ViewGroup.LayoutParams m17137a(ViewGroup.LayoutParams layoutParams, ViewGroup.LayoutParams layoutParams2) {
        if (layoutParams2 != null) {
            layoutParams.width = layoutParams2.width;
            layoutParams.height = layoutParams2.height;
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams.leftMargin = marginLayoutParams2.leftMargin;
                marginLayoutParams.topMargin = marginLayoutParams2.topMargin;
                marginLayoutParams.rightMargin = marginLayoutParams2.rightMargin;
                marginLayoutParams.bottomMargin = marginLayoutParams2.bottomMargin;
                if (marginLayoutParams2.isMarginRelative()) {
                    marginLayoutParams.setMarginStart(marginLayoutParams2.getMarginStart());
                    marginLayoutParams.setMarginEnd(marginLayoutParams2.getMarginEnd());
                }
            }
            if ((layoutParams instanceof DivLayoutParams) && (layoutParams2 instanceof DivLayoutParams)) {
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                DivLayoutParams divLayoutParams2 = (DivLayoutParams) layoutParams2;
                divLayoutParams.f33963h = divLayoutParams2.f33963h;
                divLayoutParams.f33962g = divLayoutParams2.f33962g;
            }
        }
        return layoutParams;
    }
}
