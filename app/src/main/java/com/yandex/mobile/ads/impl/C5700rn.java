package com.yandex.mobile.ads.impl;

import java.net.InetSocketAddress;
import java.net.Socket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.rn */
/* loaded from: classes3.dex */
public final class C5700rn implements InterfaceC5824ty {
    @Override // com.yandex.mobile.ads.impl.InterfaceC5824ty
    /* renamed from: a */
    public final boolean mo27957a(@NotNull String checkHost) {
        Socket socket;
        Intrinsics.m32179h(checkHost, "checkHost");
        try {
            socket = new Socket();
            try {
                socket.connect(new InetSocketAddress(checkHost, 80), 5000);
                boolean isConnected = socket.isConnected();
                try {
                    socket.close();
                } catch (Throwable th) {
                    n60.m26808a(th, th.getMessage(), new Object[0]);
                }
                return isConnected;
            } catch (Throwable th2) {
                th = th2;
                try {
                    n60.m26808a(th, th.getMessage(), new Object[0]);
                    if (socket == null) {
                        return false;
                    }
                    try {
                        socket.close();
                        return false;
                    } catch (Throwable th3) {
                        n60.m26808a(th3, th3.getMessage(), new Object[0]);
                        return false;
                    }
                } catch (Throwable th4) {
                    if (socket != null) {
                        try {
                            socket.close();
                        } catch (Throwable th5) {
                            n60.m26808a(th5, th5.getMessage(), new Object[0]);
                        }
                    }
                    throw th4;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            socket = null;
        }
    }
}
