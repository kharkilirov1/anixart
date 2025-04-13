package com.yandex.div.internal.widget.tabs;

import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.font.DivTypefaceProvider;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TabTextStyleProvider.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/widget/tabs/TabTextStyleProvider;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public final class TabTextStyleProvider {

    /* renamed from: a */
    @NotNull
    public final DivTypefaceProvider f34271a;

    @Inject
    public TabTextStyleProvider(@NotNull DivTypefaceProvider typefaceProvider) {
        Intrinsics.m32179h(typefaceProvider, "typefaceProvider");
        this.f34271a = typefaceProvider;
    }
}
