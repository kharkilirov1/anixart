package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.q61;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.dy */
/* loaded from: classes3.dex */
public final class C4993dy {

    /* renamed from: a */
    @NotNull
    private final q61 f49760a;

    /* renamed from: b */
    @NotNull
    private final C5495nh f49761b;

    /* renamed from: c */
    @NotNull
    private final List<Certificate> f49762c;

    /* renamed from: d */
    @NotNull
    private final Lazy f49763d;

    /* renamed from: com.yandex.mobile.ads.impl.dy$a */
    public static final class a {

        /* renamed from: com.yandex.mobile.ads.impl.dy$a$a, reason: collision with other inner class name */
        public static final class C7015a extends Lambda implements Function0<List<? extends Certificate>> {

            /* renamed from: a */
            public final /* synthetic */ List<Certificate> f49764a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C7015a(List<? extends Certificate> list) {
                super(0);
                this.f49764a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Certificate> invoke() {
                return this.f49764a;
            }
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public static C4993dy m23959a(@NotNull SSLSession sSLSession) throws IOException {
            List list;
            Intrinsics.m32179h(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            if (Intrinsics.m32174c(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : Intrinsics.m32174c(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(um1.m29049a("cipherSuite == ", cipherSuite));
            }
            C5495nh m26911a = C5495nh.f52988b.m26911a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (Intrinsics.m32174c("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            q61 m27647a = q61.C5622a.m27647a(protocol);
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                list = peerCertificates != null ? t91.m28505a(Arrays.copyOf(peerCertificates, peerCertificates.length)) : EmptyList.f63144b;
            } catch (SSLPeerUnverifiedException unused) {
                list = EmptyList.f63144b;
            }
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            return new C4993dy(m27647a, m26911a, localCertificates != null ? t91.m28505a(Arrays.copyOf(localCertificates, localCertificates.length)) : EmptyList.f63144b, new C7015a(list));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dy$b */
    public static final class b extends Lambda implements Function0<List<? extends Certificate>> {

        /* renamed from: a */
        public final /* synthetic */ Function0<List<Certificate>> f49765a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function0<? extends List<? extends Certificate>> function0) {
            super(0);
            this.f49765a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Certificate> invoke() {
            try {
                return this.f49765a.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return EmptyList.f63144b;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4993dy(@NotNull q61 tlsVersion, @NotNull C5495nh cipherSuite, @NotNull List<? extends Certificate> localCertificates, @NotNull Function0<? extends List<? extends Certificate>> peerCertificatesFn) {
        Intrinsics.m32179h(tlsVersion, "tlsVersion");
        Intrinsics.m32179h(cipherSuite, "cipherSuite");
        Intrinsics.m32179h(localCertificates, "localCertificates");
        Intrinsics.m32179h(peerCertificatesFn, "peerCertificatesFn");
        this.f49760a = tlsVersion;
        this.f49761b = cipherSuite;
        this.f49762c = localCertificates;
        this.f49763d = LazyKt.m31881b(new b(peerCertificatesFn));
    }

    @JvmName
    @NotNull
    /* renamed from: a */
    public final C5495nh m23955a() {
        return this.f49761b;
    }

    @JvmName
    @NotNull
    /* renamed from: b */
    public final List<Certificate> m23956b() {
        return this.f49762c;
    }

    @JvmName
    @NotNull
    /* renamed from: c */
    public final List<Certificate> m23957c() {
        return (List) this.f49763d.getValue();
    }

    @JvmName
    @NotNull
    /* renamed from: d */
    public final q61 m23958d() {
        return this.f49760a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C4993dy) {
            C4993dy c4993dy = (C4993dy) obj;
            if (c4993dy.f49760a == this.f49760a && Intrinsics.m32174c(c4993dy.f49761b, this.f49761b) && Intrinsics.m32174c(c4993dy.m23957c(), m23957c()) && Intrinsics.m32174c(c4993dy.f49762c, this.f49762c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f49762c.hashCode() + ((m23957c().hashCode() + ((this.f49761b.hashCode() + ((this.f49760a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        String type;
        String type2;
        List<Certificate> m23957c = m23957c();
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(m23957c, 10));
        for (Certificate certificate : m23957c) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                Intrinsics.m32178g(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder m26356a = l60.m26356a("Handshake{tlsVersion=");
        m26356a.append(this.f49760a);
        m26356a.append(" cipherSuite=");
        m26356a.append(this.f49761b);
        m26356a.append(" peerCertificates=");
        m26356a.append(obj);
        m26356a.append(" localCertificates=");
        List<Certificate> list = this.f49762c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                Intrinsics.m32178g(type, "type");
            }
            arrayList2.add(type);
        }
        m26356a.append(arrayList2);
        m26356a.append('}');
        return m26356a.toString();
    }
}
