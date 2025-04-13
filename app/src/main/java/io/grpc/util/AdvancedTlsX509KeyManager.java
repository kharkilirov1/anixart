package io.grpc.util;

import io.grpc.ExperimentalApi;
import java.io.IOException;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedKeyManager;

@ExperimentalApi
/* loaded from: classes3.dex */
public final class AdvancedTlsX509KeyManager extends X509ExtendedKeyManager {

    /* renamed from: b */
    public static final Logger f59516b = Logger.getLogger(AdvancedTlsX509KeyManager.class.getName());

    /* renamed from: a */
    public volatile KeyInfo f59517a;

    /* renamed from: io.grpc.util.AdvancedTlsX509KeyManager$1 */
    class C64901 implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw null;
        }
    }

    public interface Closeable extends java.io.Closeable {
    }

    public static class KeyInfo {

        /* renamed from: a */
        public final PrivateKey f59518a;

        /* renamed from: b */
        public final X509Certificate[] f59519b;
    }

    public class LoadFilePathExecution implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                Logger logger = AdvancedTlsX509KeyManager.f59516b;
                Objects.requireNonNull(null);
                throw null;
            } catch (IOException | GeneralSecurityException e2) {
                AdvancedTlsX509KeyManager.f59516b.log(Level.SEVERE, "Failed refreshing private key and certificate chain from files. Using previous ones", e2);
            }
        }
    }

    public static class UpdateResult {
    }

    @Override // javax.net.ssl.X509KeyManager
    public String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
        return "default";
    }

    @Override // javax.net.ssl.X509ExtendedKeyManager
    public String chooseEngineClientAlias(String[] strArr, Principal[] principalArr, SSLEngine sSLEngine) {
        return "default";
    }

    @Override // javax.net.ssl.X509ExtendedKeyManager
    public String chooseEngineServerAlias(String str, Principal[] principalArr, SSLEngine sSLEngine) {
        return "default";
    }

    @Override // javax.net.ssl.X509KeyManager
    public String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
        return "default";
    }

    @Override // javax.net.ssl.X509KeyManager
    public X509Certificate[] getCertificateChain(String str) {
        if (str.equals("default")) {
            return (X509Certificate[]) Arrays.copyOf(this.f59517a.f59519b, this.f59517a.f59519b.length);
        }
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public String[] getClientAliases(String str, Principal[] principalArr) {
        return new String[]{"default"};
    }

    @Override // javax.net.ssl.X509KeyManager
    public PrivateKey getPrivateKey(String str) {
        if (str.equals("default")) {
            return this.f59517a.f59518a;
        }
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public String[] getServerAliases(String str, Principal[] principalArr) {
        return new String[]{"default"};
    }
}
