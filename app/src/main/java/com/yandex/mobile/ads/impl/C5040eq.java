package com.yandex.mobile.ads.impl;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.eq */
/* loaded from: classes3.dex */
final class C5040eq implements InterfaceC5088fq {
    @Override // com.yandex.mobile.ads.impl.InterfaceC5088fq
    @NotNull
    /* renamed from: a */
    public final List<InetAddress> mo24227a(@NotNull String hostname) {
        Intrinsics.m32179h(hostname, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(hostname);
            Intrinsics.m32178g(allByName, "getAllByName(hostname)");
            return ArraysKt.m31952b0(allByName);
        } catch (NullPointerException e2) {
            UnknownHostException unknownHostException = new UnknownHostException(um1.m29049a("Broken system behaviour for dns lookup of ", hostname));
            unknownHostException.initCause(e2);
            throw unknownHostException;
        }
    }
}
