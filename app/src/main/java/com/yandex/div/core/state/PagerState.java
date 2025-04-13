package com.yandex.div.core.state;

import com.yandex.div.core.state.DivViewState;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: PagerState.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/state/PagerState;", "Lcom/yandex/div/core/state/DivViewState$BlockState;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final /* data */ class PagerState implements DivViewState.BlockState {

    /* renamed from: a */
    public final int f31339a;

    public PagerState(int i2) {
        this.f31339a = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PagerState) && this.f31339a == ((PagerState) obj).f31339a;
    }

    /* renamed from: hashCode, reason: from getter */
    public int getF31339a() {
        return this.f31339a;
    }

    @NotNull
    public String toString() {
        return C0000a.m17n(C0000a.m24u("PagerState(currentPageIndex="), this.f31339a, ')');
    }
}
