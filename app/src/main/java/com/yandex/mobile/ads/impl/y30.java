package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.C6153e;

/* loaded from: classes3.dex */
public final class y30 {

    /* renamed from: a */
    @NonNull
    private final l50 f56661a;

    /* renamed from: b */
    @NonNull
    private final x30 f56662b;

    /* renamed from: c */
    @Nullable
    private w30 f56663c;

    public y30(@NonNull l50 l50Var, @NonNull C6153e c6153e) {
        this.f56661a = l50Var;
        this.f56662b = new x30(c6153e);
    }

    @NonNull
    /* renamed from: a */
    public final w30 m29859a() {
        if (this.f56663c == null) {
            this.f56663c = this.f56662b.m29661a(this.f56661a.getAdBreaks());
        }
        return this.f56663c;
    }
}
