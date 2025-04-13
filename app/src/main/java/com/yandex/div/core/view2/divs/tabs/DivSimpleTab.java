package com.yandex.div.core.view2.divs.tabs;

import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTabs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTabsAdapter.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/tabs/DivSimpleTab;", "Lcom/yandex/div/internal/widget/tabs/BaseDivTabbedCardUi$Input$SimpleTab;", "Lcom/yandex/div2/DivTabs$Item;", "Lcom/yandex/div2/DivAction;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivSimpleTab implements BaseDivTabbedCardUi.Input.SimpleTab<DivTabs.Item, DivAction> {

    /* renamed from: a */
    @NotNull
    public final DivTabs.Item f32629a;

    /* renamed from: b */
    @NotNull
    public final DisplayMetrics f32630b;

    /* renamed from: c */
    @NotNull
    public final ExpressionResolver f32631c;

    public DivSimpleTab(@NotNull DivTabs.Item item, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(item, "item");
        Intrinsics.m32179h(resolver, "resolver");
        this.f32629a = item;
        this.f32630b = displayMetrics;
        this.f32631c = resolver;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    /* renamed from: a */
    public Object mo17069a() {
        return this.f32629a.f39542c;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    @Nullable
    /* renamed from: b */
    public Integer mo17070b() {
        int m16931U;
        DivSize f36228s = this.f32629a.f39540a.m17557a().getF36228s();
        if (!(f36228s instanceof DivSize.Fixed)) {
            return null;
        }
        m16931U = BaseDivViewExtensionsKt.m16931U(f36228s, this.f32630b, this.f32631c, null);
        return Integer.valueOf(m16931U);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    @NotNull
    public String getTitle() {
        return this.f32629a.f39541b.mo17535b(this.f32631c);
    }
}
