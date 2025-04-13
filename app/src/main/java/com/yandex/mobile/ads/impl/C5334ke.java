package com.yandex.mobile.ads.impl;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ke */
/* loaded from: classes3.dex */
public final class C5334ke implements b81 {

    /* renamed from: a */
    @NotNull
    private final LinkedHashMap f51956a;

    public C5334ke(@NotNull X509Certificate... caCerts) {
        Intrinsics.m32179h(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : caCerts) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Intrinsics.m32178g(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f51956a = linkedHashMap;
    }

    @Override // com.yandex.mobile.ads.impl.b81
    @Nullable
    /* renamed from: a */
    public final X509Certificate mo22741a(@NotNull X509Certificate cert) {
        boolean z;
        Intrinsics.m32179h(cert, "cert");
        Set set = (Set) this.f51956a.get(cert.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                cert.verify(((X509Certificate) next).getPublicKey());
                z = true;
            } catch (Exception unused) {
                z = false;
            }
            if (z) {
                obj = next;
                break;
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(@Nullable Object obj) {
        return obj == this || ((obj instanceof C5334ke) && Intrinsics.m32174c(((C5334ke) obj).f51956a, this.f51956a));
    }

    public final int hashCode() {
        return this.f51956a.hashCode();
    }
}
