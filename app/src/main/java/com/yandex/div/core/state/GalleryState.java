package com.yandex.div.core.state;

import com.yandex.div.core.state.DivViewState;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: GalleryState.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/state/GalleryState;", "Lcom/yandex/div/core/state/DivViewState$BlockState;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final /* data */ class GalleryState implements DivViewState.BlockState {

    /* renamed from: a */
    public final int f31337a;

    /* renamed from: b */
    public final int f31338b;

    public GalleryState(int i2, int i3) {
        this.f31337a = i2;
        this.f31338b = i3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryState)) {
            return false;
        }
        GalleryState galleryState = (GalleryState) obj;
        return this.f31337a == galleryState.f31337a && this.f31338b == galleryState.f31338b;
    }

    public int hashCode() {
        return (this.f31337a * 31) + this.f31338b;
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("GalleryState(visibleItemIndex=");
        m24u.append(this.f31337a);
        m24u.append(", scrollOffset=");
        return C0000a.m17n(m24u, this.f31338b, ')');
    }
}
