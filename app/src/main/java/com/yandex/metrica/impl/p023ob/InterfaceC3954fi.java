package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.net.ServerSocket;

/* renamed from: com.yandex.metrica.impl.ob.fi */
/* loaded from: classes2.dex */
public interface InterfaceC3954fi {

    /* renamed from: com.yandex.metrica.impl.ob.fi$a */
    public static class a extends Throwable {
        public a(@NonNull String str, @NonNull Throwable th) {
            super(str, th);
        }
    }

    @NonNull
    /* renamed from: a */
    ServerSocket mo18990a(int i2) throws IOException, a;
}
