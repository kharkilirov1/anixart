package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class uh1<T> {

    /* renamed from: a */
    @NotNull
    private final sh1 f55504a;

    /* renamed from: b */
    @NotNull
    private final om0<T> f55505b;

    public uh1(@NotNull Context context, @NotNull C5101g2 adConfiguration, @NotNull wh1<T> volleyResponseBodyParser, @NotNull xw0<T> responseBodyParser, @NotNull sh1 volleyMapper, @NotNull om0<T> responseParser) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        Intrinsics.m32179h(volleyResponseBodyParser, "volleyResponseBodyParser");
        Intrinsics.m32179h(responseBodyParser, "responseBodyParser");
        Intrinsics.m32179h(volleyMapper, "volleyMapper");
        Intrinsics.m32179h(responseParser, "responseParser");
        this.f55504a = volleyMapper;
        this.f55505b = responseParser;
    }

    @NotNull
    /* renamed from: a */
    public final AdResponse<T> m29003a(@NotNull km0 networkResponse, @NotNull Map<String, String> headers, @NotNull EnumC5007e6 responseAdType) {
        Intrinsics.m32179h(networkResponse, "networkResponse");
        Intrinsics.m32179h(headers, "headers");
        Intrinsics.m32179h(responseAdType, "responseAdType");
        Objects.requireNonNull(this.f55504a);
        return this.f55505b.mo27092a(sh1.m28251a(networkResponse), headers, responseAdType);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ uh1(android.content.Context r8, com.yandex.mobile.ads.impl.C5101g2 r9, com.yandex.mobile.ads.impl.wh1 r10) {
        /*
            r7 = this;
            com.yandex.mobile.ads.impl.yw0 r4 = new com.yandex.mobile.ads.impl.yw0
            r4.<init>(r10)
            com.yandex.mobile.ads.impl.sh1 r5 = new com.yandex.mobile.ads.impl.sh1
            r5.<init>()
            com.yandex.mobile.ads.impl.qm0 r6 = com.yandex.mobile.ads.impl.im0.m25567a(r8, r9, r4)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.uh1.<init>(android.content.Context, com.yandex.mobile.ads.impl.g2, com.yandex.mobile.ads.impl.wh1):void");
    }
}
