package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Build;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qi1 implements pi1 {

    /* renamed from: a */
    @NotNull
    private final Lazy f54064a = LazyKt.m31881b(C5641a.f54065a);

    /* renamed from: com.yandex.mobile.ads.impl.qi1$a */
    public static final class C5641a extends Lambda implements Function0<CertificateFactory> {

        /* renamed from: a */
        public static final C5641a f54065a = new C5641a();

        public C5641a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CertificateFactory invoke() {
            return CertificateFactory.getInstance("X.509");
        }
    }

    @Override // com.yandex.mobile.ads.impl.pi1
    /* renamed from: a */
    public final boolean mo27334a(@NotNull Context context, @NotNull SslError sslError) {
        X509Certificate m25998a;
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(sslError, "sslError");
        cz0 m29824a = xz0.m29823b().m29824a(context);
        if (m29824a == null || !m29824a.m23574M()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m25998a = sslError.getCertificate().getX509Certificate();
        } else {
            SslCertificate certificate = sslError.getCertificate();
            Intrinsics.m32178g(certificate, "sslError.certificate");
            Object value = this.f54064a.getValue();
            Intrinsics.m32178g(value, "<get-certificateFactory>(...)");
            m25998a = jy0.m25998a(certificate, (CertificateFactory) value);
        }
        if (m25998a == null) {
            return false;
        }
        try {
            w70.m29401b(C6031xl.m29764a(context)).checkServerTrusted(new X509Certificate[]{m25998a}, "RSA");
            return true;
        } catch (Exception e2) {
            n60.m26808a(e2, e2.getMessage(), new Object[0]);
            return false;
        }
    }
}
