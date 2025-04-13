package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ie */
/* loaded from: classes3.dex */
public final class C5225ie extends AbstractC5027eh {

    /* renamed from: a */
    @NotNull
    private final b81 f51281a;

    public C5225ie(@NotNull b81 trustRootIndex) {
        Intrinsics.m32179h(trustRootIndex, "trustRootIndex");
        this.f51281a = trustRootIndex;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[LOOP:1: B:27:0x0076->B:37:?, LOOP_END, SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.AbstractC5027eh
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List mo24154a(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull java.util.List r12) throws javax.net.ssl.SSLPeerUnverifiedException {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.m32179h(r12, r0)
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.Intrinsics.m32179h(r11, r0)
            java.util.ArrayDeque r11 = new java.util.ArrayDeque
            r11.<init>(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.Object r0 = r11.removeFirst()
            java.lang.String r1 = "queue.removeFirst()"
            kotlin.jvm.internal.Intrinsics.m32178g(r0, r1)
            r12.add(r0)
            r0 = 0
            r1 = 0
            r2 = 0
        L23:
            r3 = 9
            if (r1 >= r3) goto Lc4
            int r3 = r12.size()
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r3 = r12.get(r3)
            java.lang.String r5 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.Intrinsics.m32177f(r3, r5)
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            com.yandex.mobile.ads.impl.b81 r6 = r10.f51281a
            java.security.cert.X509Certificate r6 = r6.mo22741a(r3)
            if (r6 == 0) goto L6d
            int r2 = r12.size()
            if (r2 > r4) goto L4c
            boolean r2 = kotlin.jvm.internal.Intrinsics.m32174c(r3, r6)
            if (r2 != 0) goto L4f
        L4c:
            r12.add(r6)
        L4f:
            java.security.Principal r2 = r6.getIssuerDN()
            java.security.Principal r3 = r6.getSubjectDN()
            boolean r2 = kotlin.jvm.internal.Intrinsics.m32174c(r2, r3)
            if (r2 != 0) goto L5e
            goto L67
        L5e:
            java.security.PublicKey r2 = r6.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L67
            r6.verify(r2)     // Catch: java.security.GeneralSecurityException -> L67
            r2 = 1
            goto L68
        L67:
            r2 = 0
        L68:
            if (r2 == 0) goto L6b
            return r12
        L6b:
            r2 = 1
            goto La6
        L6d:
            java.util.Iterator r6 = r11.iterator()
            java.lang.String r7 = "queue.iterator()"
            kotlin.jvm.internal.Intrinsics.m32178g(r6, r7)
        L76:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Laa
            java.lang.Object r7 = r6.next()
            kotlin.jvm.internal.Intrinsics.m32177f(r7, r5)
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7
            java.security.Principal r8 = r3.getIssuerDN()
            java.security.Principal r9 = r7.getSubjectDN()
            boolean r8 = kotlin.jvm.internal.Intrinsics.m32174c(r8, r9)
            if (r8 != 0) goto L94
            goto L9d
        L94:
            java.security.PublicKey r8 = r7.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L9d
            r3.verify(r8)     // Catch: java.security.GeneralSecurityException -> L9d
            r8 = 1
            goto L9e
        L9d:
            r8 = 0
        L9e:
            if (r8 == 0) goto L76
            r6.remove()
            r12.add(r7)
        La6:
            int r1 = r1 + 1
            goto L23
        Laa:
            if (r2 == 0) goto Lad
            return r12
        Lad:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Failed to find a trusted cert that signed "
            r12.append(r0)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        Lc4:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Certificate chain too long: "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5225ie.mo24154a(java.lang.String, java.util.List):java.util.List");
    }

    public final boolean equals(@Nullable Object obj) {
        return obj == this || ((obj instanceof C5225ie) && Intrinsics.m32174c(((C5225ie) obj).f51281a, this.f51281a));
    }

    public final int hashCode() {
        return this.f51281a.hashCode();
    }
}
