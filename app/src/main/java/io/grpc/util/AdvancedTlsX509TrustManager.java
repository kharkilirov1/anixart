package io.grpc.util;

import io.grpc.ExperimentalApi;
import java.io.IOException;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509ExtendedTrustManager;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@ExperimentalApi
@IgnoreJRERequirement
/* loaded from: classes3.dex */
public final class AdvancedTlsX509TrustManager extends X509ExtendedTrustManager {

    /* renamed from: b */
    public static final Logger f59520b = Logger.getLogger(AdvancedTlsX509TrustManager.class.getName());

    /* renamed from: a */
    public volatile X509ExtendedTrustManager f59521a;

    /* renamed from: io.grpc.util.AdvancedTlsX509TrustManager$1 */
    class C64911 implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw null;
        }
    }

    public static final class Builder {
    }

    public interface Closeable extends java.io.Closeable {
    }

    public class LoadFilePathExecution implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                Logger logger = AdvancedTlsX509TrustManager.f59520b;
                Objects.requireNonNull(null);
                throw null;
            } catch (IOException | GeneralSecurityException e2) {
                AdvancedTlsX509TrustManager.f59520b.log(Level.SEVERE, "Failed refreshing trust CAs from file. Using previous CAs", e2);
            }
        }
    }

    public interface SslSocketAndEnginePeerVerifier {
    }

    public enum Verification {
        /* JADX INFO: Fake field, exist only in values array */
        CERTIFICATE_AND_HOST_NAME_VERIFICATION,
        /* JADX INFO: Fake field, exist only in values array */
        CERTIFICATE_ONLY_VERIFICATION,
        /* JADX INFO: Fake field, exist only in values array */
        INSECURELY_SKIP_ALL_VERIFICATION
    }

    /* renamed from: a */
    public final void m31323a(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine, Socket socket, boolean z) throws CertificateException {
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            throw new IllegalArgumentException("Want certificate verification but got null or empty certificates");
        }
        if (sSLEngine == null && socket == null) {
            throw new CertificateException("Not enough information to validate peer. SSLEngine or Socket required.");
        }
        X509ExtendedTrustManager x509ExtendedTrustManager = this.f59521a;
        if (x509ExtendedTrustManager == null) {
            throw new CertificateException("No trust roots configured");
        }
        if (!z) {
            x509ExtendedTrustManager.checkClientTrusted(x509CertificateArr, str, sSLEngine);
            return;
        }
        if (sSLEngine != null) {
            SSLParameters sSLParameters = sSLEngine.getSSLParameters();
            sSLParameters.setEndpointIdentificationAlgorithm("");
            sSLEngine.setSSLParameters(sSLParameters);
            x509ExtendedTrustManager.checkServerTrusted(x509CertificateArr, str, sSLEngine);
            return;
        }
        if (!(socket instanceof SSLSocket)) {
            throw new CertificateException("socket is not a type of SSLSocket");
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        SSLParameters sSLParameters2 = sSLSocket.getSSLParameters();
        sSLParameters2.setEndpointIdentificationAlgorithm("");
        sSLSocket.setSSLParameters(sSLParameters2);
        x509ExtendedTrustManager.checkServerTrusted(x509CertificateArr, str, sSLSocket);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        throw new CertificateException("Not enough information to validate peer. SSLEngine or Socket required.");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        m31323a(x509CertificateArr, str, sSLEngine, null, true);
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return this.f59521a == null ? new X509Certificate[0] : this.f59521a.getAcceptedIssuers();
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        m31323a(x509CertificateArr, str, null, socket, false);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        throw new CertificateException("Not enough information to validate peer. SSLEngine or Socket required.");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        m31323a(x509CertificateArr, str, sSLEngine, null, false);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        m31323a(x509CertificateArr, str, null, socket, true);
    }
}
