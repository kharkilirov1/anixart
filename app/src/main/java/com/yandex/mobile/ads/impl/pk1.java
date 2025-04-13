package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC4978dm;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class pk1 implements InterfaceC4978dm.a {

    /* renamed from: a */
    @NotNull
    private final String f53572a;

    /* renamed from: b */
    private final int f53573b;

    /* renamed from: c */
    private final int f53574c;

    /* renamed from: d */
    private final boolean f53575d;

    /* renamed from: e */
    @Nullable
    private final SSLSocketFactory f53576e;

    /* renamed from: f */
    private final boolean f53577f;

    public pk1(@NotNull String userAgent, @Nullable SSLSocketFactory sSLSocketFactory, boolean z) {
        Intrinsics.m32179h(userAgent, "userAgent");
        this.f53572a = userAgent;
        this.f53573b = 8000;
        this.f53574c = 8000;
        this.f53575d = false;
        this.f53576e = sSLSocketFactory;
        this.f53577f = z;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm.a
    @NotNull
    /* renamed from: a */
    public final InterfaceC4978dm mo22497a() {
        if (!this.f53577f) {
            return new nk1(this.f53572a, this.f53573b, this.f53574c, this.f53575d, new i00(), this.f53576e);
        }
        int i2 = nn0.f53052c;
        return new qn0(nn0.m26932a(this.f53573b, this.f53574c, this.f53576e), this.f53572a, new i00());
    }
}
