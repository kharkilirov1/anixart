package com.yandex.mobile.ads.impl;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.mobile.ads.impl.fh */
/* loaded from: classes3.dex */
public final class C5079fh {

    /* renamed from: c */
    @JvmField
    @NotNull
    public static final C5079fh f50264c = new a().m24600a();

    /* renamed from: a */
    @NotNull
    private final Set<c> f50265a;

    /* renamed from: b */
    @Nullable
    private final AbstractC5027eh f50266b;

    /* renamed from: com.yandex.mobile.ads.impl.fh$a */
    public static final class a {

        /* renamed from: a */
        @NotNull
        private final ArrayList f50267a = new ArrayList();

        @NotNull
        /* renamed from: a */
        public final C5079fh m24600a() {
            return new C5079fh(CollectionsKt.m32035n0(this.f50267a));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fh$b */
    public static final class b {
        @JvmStatic
        @NotNull
        /* renamed from: a */
        public static String m24601a(@NotNull X509Certificate certificate) {
            Intrinsics.m32179h(certificate, "certificate");
            StringBuilder m26356a = l60.m26356a("sha256/");
            m26356a.append(m24603c(certificate).mo34574a());
            return m26356a.toString();
        }

        @JvmStatic
        @NotNull
        /* renamed from: b */
        public static ByteString m24602b(@NotNull X509Certificate x509Certificate) {
            Intrinsics.m32179h(x509Certificate, "<this>");
            ByteString.Companion companion = ByteString.f68753f;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.m32178g(encoded, "publicKey.encoded");
            return ByteString.Companion.m34588e(companion, encoded, 0, 0, 3).m34582l();
        }

        @JvmStatic
        @NotNull
        /* renamed from: c */
        public static ByteString m24603c(@NotNull X509Certificate x509Certificate) {
            Intrinsics.m32179h(x509Certificate, "<this>");
            ByteString.Companion companion = ByteString.f68753f;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.m32178g(encoded, "publicKey.encoded");
            return ByteString.Companion.m34588e(companion, encoded, 0, 0, 3).mo34575b("SHA-256");
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fh$c */
    public static final class c {
        /* renamed from: a */
        public static boolean m24604a(@NotNull String hostname) {
            Intrinsics.m32179h(hostname, "hostname");
            if (StringsKt.m33898X(null, "**.", false, 2, null)) {
                throw null;
            }
            if (StringsKt.m33898X(null, "*.", false, 2, null)) {
                throw null;
            }
            return Intrinsics.m32174c(hostname, null);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            Objects.requireNonNull((c) obj);
            return Intrinsics.m32174c(null, null) && Intrinsics.m32174c(null, null) && Intrinsics.m32174c(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @NotNull
        public final String toString() {
            throw null;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fh$d */
    public static final class d extends Lambda implements Function0<List<? extends X509Certificate>> {

        /* renamed from: b */
        public final /* synthetic */ List<Certificate> f50269b;

        /* renamed from: c */
        public final /* synthetic */ String f50270c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends Certificate> list, String str) {
            super(0);
            this.f50269b = list;
            this.f50270c = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
        
            if (r0 == null) goto L6;
         */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List<? extends java.security.cert.X509Certificate> invoke() {
            /*
                r4 = this;
                com.yandex.mobile.ads.impl.fh r0 = com.yandex.mobile.ads.impl.C5079fh.this
                com.yandex.mobile.ads.impl.eh r0 = r0.m24596a()
                if (r0 == 0) goto L12
                java.util.List<java.security.cert.Certificate> r1 = r4.f50269b
                java.lang.String r2 = r4.f50270c
                java.util.List r0 = r0.mo24154a(r2, r1)
                if (r0 != 0) goto L14
            L12:
                java.util.List<java.security.cert.Certificate> r0 = r4.f50269b
            L14:
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = kotlin.collections.CollectionsKt.m32032m(r0, r2)
                r1.<init>(r2)
                java.util.Iterator r0 = r0.iterator()
            L23:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L3a
                java.lang.Object r2 = r0.next()
                java.security.cert.Certificate r2 = (java.security.cert.Certificate) r2
                java.lang.String r3 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
                kotlin.jvm.internal.Intrinsics.m32177f(r2, r3)
                java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
                r1.add(r2)
                goto L23
            L3a:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5079fh.d.invoke():java.lang.Object");
        }
    }

    public C5079fh(@NotNull Set<c> pins, @Nullable AbstractC5027eh abstractC5027eh) {
        Intrinsics.m32179h(pins, "pins");
        this.f50265a = pins;
        this.f50266b = abstractC5027eh;
    }

    /* renamed from: a */
    public final void m24599a(@NotNull String hostname, @NotNull Function0<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) {
        Intrinsics.m32179h(hostname, "hostname");
        Intrinsics.m32179h(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        Set<c> set = this.f50265a;
        List<c> list = EmptyList.f63144b;
        for (Object obj : set) {
            Objects.requireNonNull((c) obj);
            if (c.m24604a(hostname)) {
                if (list.isEmpty()) {
                    list = new ArrayList();
                }
                TypeIntrinsics.m32213b(list).add(obj);
            }
        }
        if (list.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> invoke = cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : invoke) {
            Iterator it = list.iterator();
            ByteString byteString = null;
            ByteString byteString2 = null;
            while (it.hasNext()) {
                Objects.requireNonNull((c) it.next());
                if (Intrinsics.m32174c(null, "sha256")) {
                    if (byteString == null) {
                        byteString = b.m24603c(x509Certificate);
                    }
                    if (Intrinsics.m32174c(null, byteString)) {
                        return;
                    }
                } else {
                    if (!Intrinsics.m32174c(null, "sha1")) {
                        throw new AssertionError(um1.m29049a("unsupported hashAlgorithm: ", null));
                    }
                    if (byteString2 == null) {
                        byteString2 = b.m24602b(x509Certificate);
                    }
                    if (Intrinsics.m32174c(null, byteString2)) {
                        return;
                    }
                }
            }
        }
        StringBuilder m27x = C0000a.m27x("Certificate pinning failure!", "\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : invoke) {
            m27x.append("\n    ");
            m27x.append(b.m24601a(x509Certificate2));
            m27x.append(": ");
            m27x.append(x509Certificate2.getSubjectDN().getName());
        }
        m27x.append("\n  Pinned certificates for ");
        m27x.append(hostname);
        m27x.append(":");
        for (c cVar : list) {
            m27x.append("\n    ");
            m27x.append(cVar);
        }
        String sb = m27x.toString();
        Intrinsics.m32178g(sb, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(sb);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C5079fh) {
            C5079fh c5079fh = (C5079fh) obj;
            if (Intrinsics.m32174c(c5079fh.f50265a, this.f50265a) && Intrinsics.m32174c(c5079fh.f50266b, this.f50266b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f50265a.hashCode() + 1517) * 41;
        AbstractC5027eh abstractC5027eh = this.f50266b;
        return hashCode + (abstractC5027eh != null ? abstractC5027eh.hashCode() : 0);
    }

    public /* synthetic */ C5079fh(Set set) {
        this(set, null);
    }

    @Nullable
    /* renamed from: a */
    public final AbstractC5027eh m24596a() {
        return this.f50266b;
    }

    /* renamed from: a */
    public final void m24598a(@NotNull String hostname, @NotNull List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        Intrinsics.m32179h(hostname, "hostname");
        Intrinsics.m32179h(peerCertificates, "peerCertificates");
        m24599a(hostname, new d(peerCertificates, hostname));
    }

    @NotNull
    /* renamed from: a */
    public final C5079fh m24597a(@NotNull AbstractC5027eh certificateChainCleaner) {
        Intrinsics.m32179h(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.m32174c(this.f50266b, certificateChainCleaner) ? this : new C5079fh(this.f50265a, certificateChainCleaner);
    }
}
