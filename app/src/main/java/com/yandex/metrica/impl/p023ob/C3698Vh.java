package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.InterfaceC3954fi;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.security.KeyStore;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;

/* renamed from: com.yandex.metrica.impl.ob.Vh */
/* loaded from: classes2.dex */
class C3698Vh implements InterfaceC3954fi {

    /* renamed from: a */
    @NonNull
    private final File f44313a;

    public C3698Vh(@NonNull File file) {
        this.f44313a = file;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3954fi
    @NonNull
    /* renamed from: a */
    public ServerSocket mo18990a(int i2) throws IOException, InterfaceC3954fi.a {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            KeyStore keyStore = KeyStore.getInstance("PKCS12");
            keyStore.load(new FileInputStream(this.f44313a), "`0l}%01ny{jl~;|&".toCharArray());
            keyManagerFactory.init(keyStore, "`0l}%01ny{jl~;|&".toCharArray());
            sSLContext.init(keyManagerFactory.getKeyManagers(), null, null);
            return sSLContext.getServerSocketFactory().createServerSocket(i2);
        } catch (Exception e2) {
            throw new InterfaceC3954fi.a("https_open_error", e2);
        }
    }
}
