package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.wr0;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ny0 implements my0 {

    /* renamed from: a */
    @NotNull
    private final xz0 f53103a;

    public ny0(@NotNull xz0 sdkSettings) {
        Intrinsics.m32179h(sdkSettings, "sdkSettings");
        this.f53103a = sdkSettings;
    }

    @Override // com.yandex.mobile.ads.impl.my0
    @Nullable
    /* renamed from: a */
    public final SSLSocketFactory mo26779a(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        cz0 m29824a = this.f53103a.m29824a(context);
        mk1 m29764a = C6031xl.m29764a(context);
        if (m29824a != null && m29824a.m23574M()) {
            return w70.m29400a(m29764a);
        }
        if (!C5474n6.m26805a(21)) {
            return null;
        }
        int i2 = wr0.f56233b;
        return wr0.C5986a.m29533a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ny0() {
        /*
            r2 = this;
            com.yandex.mobile.ads.impl.xz0 r0 = com.yandex.mobile.ads.impl.xz0.m29823b()
            java.lang.String r1 = "getInstance()"
            kotlin.jvm.internal.Intrinsics.m32178g(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ny0.<init>():void");
    }
}
