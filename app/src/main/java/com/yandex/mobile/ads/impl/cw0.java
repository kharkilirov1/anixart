package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class cw0 extends dw0 {

    /* renamed from: a */
    public final /* synthetic */ hc0 f49364a;

    /* renamed from: b */
    public final /* synthetic */ int f49365b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f49366c;

    /* renamed from: d */
    public final /* synthetic */ int f49367d;

    public cw0(hc0 hc0Var, byte[] bArr, int i2, int i3) {
        this.f49364a = hc0Var;
        this.f49365b = i2;
        this.f49366c = bArr;
        this.f49367d = i3;
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    /* renamed from: a */
    public final long mo23537a() {
        return this.f49365b;
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    @Nullable
    /* renamed from: b */
    public final hc0 mo23539b() {
        return this.f49364a;
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    /* renamed from: a */
    public final void mo23538a(@NotNull BufferedSink sink) {
        Intrinsics.m32179h(sink, "sink");
        sink.write(this.f49366c, this.f49367d, this.f49365b);
    }
}
