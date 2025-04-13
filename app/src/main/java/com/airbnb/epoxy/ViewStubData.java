package com.airbnb.epoxy;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: ModelGroupHolder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/airbnb/epoxy/ViewStubData;", "", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
/* loaded from: classes.dex */
final class ViewStubData {

    /* renamed from: a */
    @NotNull
    public final ViewGroup f7041a;

    /* renamed from: b */
    @NotNull
    public final ViewStub f7042b;

    /* renamed from: c */
    public final int f7043c;

    public ViewStubData(@NotNull ViewGroup viewGroup, @NotNull ViewStub viewStub, int i2) {
        Intrinsics.m32179h(viewStub, "viewStub");
        this.f7041a = viewGroup;
        this.f7042b = viewStub;
        this.f7043c = i2;
    }

    /* renamed from: a */
    public final void m4626a() {
        View childAt = this.f7041a.getChildAt(this.f7043c);
        if (childAt != null) {
            this.f7041a.removeView(childAt);
        } else {
            StringBuilder m24u = C0000a.m24u("No view exists at position ");
            m24u.append(this.f7043c);
            throw new IllegalStateException(m24u.toString());
        }
    }
}
