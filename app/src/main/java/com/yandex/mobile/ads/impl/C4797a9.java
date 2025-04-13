package com.yandex.mobile.ads.impl;

import androidx.room.util.C0576a;
import com.yandex.mobile.ads.impl.C4847b9;
import com.yandex.mobile.ads.impl.C5453mo;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.a9 */
/* loaded from: classes3.dex */
public final class C4797a9 implements C5453mo.a {

    /* renamed from: a */
    public final /* synthetic */ String f48333a = "com.google.android.gms.org.conscrypt";

    @Override // com.yandex.mobile.ads.impl.C5453mo.a
    /* renamed from: a */
    public final boolean mo22406a(@NotNull SSLSocket sslSocket) {
        Intrinsics.m32179h(sslSocket, "sslSocket");
        return StringsKt.m33898X(sslSocket.getClass().getName(), C0576a.m4118q(new StringBuilder(), this.f48333a, '.'), false, 2, null);
    }

    @Override // com.yandex.mobile.ads.impl.C5453mo.a
    @NotNull
    /* renamed from: b */
    public final C4847b9 mo22407b(@NotNull SSLSocket sslSocket) {
        Intrinsics.m32179h(sslSocket, "sslSocket");
        int i2 = C4847b9.f48798g;
        return C4847b9.a.m22748a(sslSocket.getClass());
    }
}
