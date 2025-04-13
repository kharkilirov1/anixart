package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.swiftsoft.anixartd.C2507R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TabItemLayout.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/widget/tabs/TabItemLayout;", "Landroid/widget/LinearLayout;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class TabItemLayout extends LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabItemLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, null);
        Intrinsics.m32179h(context, "context");
        setId(C2507R.id.div_tabbed_tab_title_item);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setOrientation(1);
        setGravity(0);
    }
}
