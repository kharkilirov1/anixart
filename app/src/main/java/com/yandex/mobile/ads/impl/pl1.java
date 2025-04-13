package com.yandex.mobile.ads.impl;

import android.util.Log;
import java.io.IOException;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class pl1 {

    /* renamed from: a */
    @NotNull
    private final InterfaceC6081yl f53581a;

    /* renamed from: b */
    @NotNull
    private final Lazy f53582b;

    /* renamed from: c */
    @Nullable
    private KeyStore f53583c;

    /* renamed from: d */
    @Nullable
    private X509TrustManager f53584d;

    /* renamed from: e */
    @NotNull
    private final Object f53585e;

    /* renamed from: com.yandex.mobile.ads.impl.pl1$a */
    public static final class C5596a extends Lambda implements Function0<X509TrustManager> {

        /* renamed from: a */
        public static final C5596a f53586a = new C5596a();

        public C5596a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final X509TrustManager invoke() {
            X509TrustManager m23075a = c81.m23075a((KeyStore) null);
            if (m23075a != null) {
                return m23075a;
            }
            throw new IllegalArgumentException("Failed to create default TrustManager");
        }
    }

    public pl1(@NotNull InterfaceC6081yl customCertificatesProvider) {
        Intrinsics.m32179h(customCertificatesProvider, "customCertificatesProvider");
        this.f53581a = customCertificatesProvider;
        this.f53582b = LazyKt.m31881b(C5596a.f53586a);
        this.f53585e = new Object();
    }

    /* renamed from: b */
    private final void m27339b() {
        if (!Thread.holdsLock(this.f53585e)) {
            throw new IllegalStateException("Operation should be performed under lock");
        }
    }

    /* renamed from: d */
    private final X509TrustManager m27340d() {
        return (X509TrustManager) this.f53582b.getValue();
    }

    /* renamed from: a */
    public final void m27341a(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str) throws CertificateException {
        m27340d().checkClientTrusted(x509CertificateArr, str);
    }

    @NotNull
    /* renamed from: c */
    public final X509Certificate[] m27347c() {
        X509Certificate[] acceptedIssuers = m27340d().getAcceptedIssuers();
        Intrinsics.m32178g(acceptedIssuers, "defaultTrustManager.acceptedIssuers");
        return acceptedIssuers;
    }

    /* renamed from: a */
    public final void m27342a(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable Socket socket) throws CertificateException {
        if (c81.m23076a()) {
            C5068f9.m24368a(m27340d(), x509CertificateArr, str, socket);
        } else {
            m27340d().checkClientTrusted(x509CertificateArr, str);
        }
    }

    /* renamed from: b */
    public final void m27344b(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str) throws CertificateException {
        Unit unit;
        try {
            m27340d().checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e2) {
            synchronized (this.f53585e) {
                m27338a();
                m27339b();
                X509TrustManager x509TrustManager = this.f53584d;
                if (x509TrustManager != null) {
                    x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                    unit = Unit.f63088a;
                } else {
                    unit = null;
                }
                if (unit != null) {
                    return;
                }
                Log.w("YandexTrustManager", "Custom TrustManager is null");
                throw e2;
            }
        }
    }

    /* renamed from: a */
    public final void m27343a(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable SSLEngine sSLEngine) throws CertificateException {
        if (c81.m23076a()) {
            C5068f9.m24369a(m27340d(), x509CertificateArr, str, sSLEngine);
        } else {
            m27340d().checkClientTrusted(x509CertificateArr, str);
        }
    }

    /* renamed from: a */
    private final void m27338a() {
        KeyStore keyStore;
        m27339b();
        m27339b();
        if (this.f53583c == null) {
            int i2 = c81.f49181b;
            KeyStore keyStore2 = null;
            try {
                keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                try {
                    keyStore.load(null);
                } catch (IOException unused) {
                }
            } catch (GeneralSecurityException unused2) {
                keyStore = null;
            }
            if (keyStore == null) {
                Log.w("YandexTrustManager", "Custom KeyStore is null, failed to add certs");
            } else {
                byte[][] mo26689a = this.f53581a.mo26689a();
                ArrayList arrayList = new ArrayList();
                for (byte[] bArr : mo26689a) {
                    X509Certificate m23074a = c81.m23074a(bArr);
                    if (m23074a != null) {
                        arrayList.add(m23074a);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        keyStore.setCertificateEntry("custom_cert_" + keyStore.size(), (X509Certificate) it.next());
                    } catch (KeyStoreException e2) {
                        Log.w("YandexTrustManager", "Failed to store certificate", e2);
                    }
                }
                keyStore2 = keyStore;
            }
            this.f53583c = keyStore2;
        }
        m27339b();
        if (this.f53584d == null) {
            m27339b();
            if (this.f53583c != null) {
                m27339b();
                this.f53584d = c81.m23075a(this.f53583c);
            }
        }
    }

    /* renamed from: b */
    public final void m27345b(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable Socket socket) throws CertificateException {
        Unit unit;
        try {
            X509TrustManager m27340d = m27340d();
            if (c81.m23076a()) {
                C5068f9.m24370b(m27340d, x509CertificateArr, str, socket);
            } else {
                m27340d.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e2) {
            synchronized (this.f53585e) {
                m27338a();
                m27339b();
                X509TrustManager x509TrustManager = this.f53584d;
                if (x509TrustManager != null) {
                    if (c81.m23076a()) {
                        C5068f9.m24370b(x509TrustManager, x509CertificateArr, str, socket);
                    } else {
                        x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                    }
                    unit = Unit.f63088a;
                } else {
                    unit = null;
                }
                if (unit != null) {
                    return;
                }
                Log.w("YandexTrustManager", "Custom TrustManager is null");
                throw e2;
            }
        }
    }

    /* renamed from: b */
    public final void m27346b(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable SSLEngine sSLEngine) throws CertificateException {
        Unit unit;
        try {
            X509TrustManager m27340d = m27340d();
            if (c81.m23076a()) {
                C5068f9.m24371b(m27340d, x509CertificateArr, str, sSLEngine);
            } else {
                m27340d.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e2) {
            synchronized (this.f53585e) {
                m27338a();
                m27339b();
                X509TrustManager x509TrustManager = this.f53584d;
                if (x509TrustManager != null) {
                    if (c81.m23076a()) {
                        C5068f9.m24371b(x509TrustManager, x509CertificateArr, str, sSLEngine);
                    } else {
                        x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                    }
                    unit = Unit.f63088a;
                } else {
                    unit = null;
                }
                if (unit != null) {
                    return;
                }
                Log.w("YandexTrustManager", "Custom TrustManager is null");
                throw e2;
            }
        }
    }
}
