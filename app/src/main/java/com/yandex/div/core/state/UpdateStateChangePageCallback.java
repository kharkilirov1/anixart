package com.yandex.div.core.state;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: UpdateStateChangePageCallback.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/state/UpdateStateChangePageCallback;", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class UpdateStateChangePageCallback extends ViewPager2.OnPageChangeCallback {

    /* renamed from: a */
    @NotNull
    public final String f31342a;

    /* renamed from: b */
    @NotNull
    public final DivViewState f31343b;

    public UpdateStateChangePageCallback(@NotNull String mBlockId, @NotNull DivViewState divViewState) {
        Intrinsics.m32179h(mBlockId, "mBlockId");
        this.f31342a = mBlockId;
        this.f31343b = divViewState;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int i2) {
        super.onPageSelected(i2);
        DivViewState divViewState = this.f31343b;
        divViewState.f31336b.put(this.f31342a, new PagerState(i2));
    }
}
