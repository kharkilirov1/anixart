package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.eq0;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.eh */
/* loaded from: classes3.dex */
public abstract class AbstractC5027eh {

    /* renamed from: com.yandex.mobile.ads.impl.eh$a */
    public static final class a {
        @NotNull
        /* renamed from: a */
        public static AbstractC5027eh m24155a(@NotNull X509TrustManager trustManager) {
            Intrinsics.m32179h(trustManager, "trustManager");
            int i2 = eq0.f50037c;
            return eq0.C5041a.m24241b().mo24233a(trustManager);
        }
    }

    @NotNull
    /* renamed from: a */
    public abstract List mo24154a(@NotNull String str, @NotNull List list) throws SSLPeerUnverifiedException;
}
