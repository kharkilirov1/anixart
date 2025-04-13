package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C5495nh;
import com.yandex.mobile.ads.impl.q61;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.NaturalOrderComparator;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.hk */
/* loaded from: classes3.dex */
public final class C5189hk {

    /* renamed from: e */
    @JvmField
    @NotNull
    public static final C5189hk f50946e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public static final C5189hk f50947f;

    /* renamed from: a */
    private final boolean f50948a;

    /* renamed from: b */
    private final boolean f50949b;

    /* renamed from: c */
    @Nullable
    private final String[] f50950c;

    /* renamed from: d */
    @Nullable
    private final String[] f50951d;

    static {
        C5495nh c5495nh = C5495nh.f53004r;
        C5495nh c5495nh2 = C5495nh.f53005s;
        C5495nh c5495nh3 = C5495nh.f53006t;
        C5495nh c5495nh4 = C5495nh.f52998l;
        C5495nh c5495nh5 = C5495nh.f53000n;
        C5495nh c5495nh6 = C5495nh.f52999m;
        C5495nh c5495nh7 = C5495nh.f53001o;
        C5495nh c5495nh8 = C5495nh.f53003q;
        C5495nh c5495nh9 = C5495nh.f53002p;
        C5495nh[] c5495nhArr = {c5495nh, c5495nh2, c5495nh3, c5495nh4, c5495nh5, c5495nh6, c5495nh7, c5495nh8, c5495nh9, C5495nh.f52996j, C5495nh.f52997k, C5495nh.f52994h, C5495nh.f52995i, C5495nh.f52992f, C5495nh.f52993g, C5495nh.f52991e};
        a m25225a = new a(true).m25225a((C5495nh[]) Arrays.copyOf(new C5495nh[]{c5495nh, c5495nh2, c5495nh3, c5495nh4, c5495nh5, c5495nh6, c5495nh7, c5495nh8, c5495nh9}, 9));
        q61 q61Var = q61.f53947b;
        q61 q61Var2 = q61.f53948c;
        m25225a.m25226a(q61Var, q61Var2).m25229b().m25228a();
        f50946e = new a(true).m25225a((C5495nh[]) Arrays.copyOf(c5495nhArr, 16)).m25226a(q61Var, q61Var2).m25229b().m25228a();
        new a(true).m25225a((C5495nh[]) Arrays.copyOf(c5495nhArr, 16)).m25226a(q61Var, q61Var2, q61.f53949d, q61.f53950e).m25229b().m25228a();
        f50947f = new a(false).m25228a();
    }

    public C5189hk(boolean z, boolean z2, @Nullable String[] strArr, @Nullable String[] strArr2) {
        this.f50948a = z;
        this.f50949b = z2;
        this.f50950c = strArr;
        this.f50951d = strArr2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C5189hk)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f50948a;
        C5189hk c5189hk = (C5189hk) obj;
        if (z != c5189hk.f50948a) {
            return false;
        }
        return !z || (Arrays.equals(this.f50950c, c5189hk.f50950c) && Arrays.equals(this.f50951d, c5189hk.f50951d) && this.f50949b == c5189hk.f50949b);
    }

    public final int hashCode() {
        if (!this.f50948a) {
            return 17;
        }
        String[] strArr = this.f50950c;
        int hashCode = ((strArr != null ? Arrays.hashCode(strArr) : 0) + 527) * 31;
        String[] strArr2 = this.f50951d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f50949b ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        List list;
        if (!this.f50948a) {
            return "ConnectionSpec()";
        }
        StringBuilder m26356a = l60.m26356a("ConnectionSpec(cipherSuites=");
        String[] strArr = this.f50950c;
        List list2 = null;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(C5495nh.f52988b.m26911a(str));
            }
            list = CollectionsKt.m32027j0(arrayList);
        } else {
            list = null;
        }
        m26356a.append(Objects.toString(list, "[all enabled]"));
        m26356a.append(", tlsVersions=");
        String[] strArr2 = this.f50951d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str2 : strArr2) {
                arrayList2.add(q61.C5622a.m27647a(str2));
            }
            list2 = CollectionsKt.m32027j0(arrayList2);
        }
        m26356a.append(Objects.toString(list2, "[all enabled]"));
        m26356a.append(", supportsTlsExtensions=");
        m26356a.append(this.f50949b);
        m26356a.append(')');
        return m26356a.toString();
    }

    /* renamed from: com.yandex.mobile.ads.impl.hk$a */
    public static final class a {

        /* renamed from: a */
        private boolean f50952a;

        /* renamed from: b */
        @Nullable
        private String[] f50953b;

        /* renamed from: c */
        @Nullable
        private String[] f50954c;

        /* renamed from: d */
        private boolean f50955d;

        public a(boolean z) {
            this.f50952a = z;
        }

        @NotNull
        /* renamed from: a */
        public final a m25225a(@NotNull C5495nh... cipherSuites) {
            Intrinsics.m32179h(cipherSuites, "cipherSuites");
            if (!this.f50952a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (C5495nh c5495nh : cipherSuites) {
                arrayList.add(c5495nh.m26909c());
            }
            Object[] array = arrayList.toArray(new String[0]);
            Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            return m25227a((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @NotNull
        /* renamed from: b */
        public final a m25230b(@NotNull String... tlsVersions) {
            Intrinsics.m32179h(tlsVersions, "tlsVersions");
            if (!this.f50952a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(tlsVersions.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            Object clone = tlsVersions.clone();
            Intrinsics.m32177f(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            this.f50954c = (String[]) clone;
            return this;
        }

        public a(@NotNull C5189hk connectionSpec) {
            Intrinsics.m32179h(connectionSpec, "connectionSpec");
            this.f50952a = connectionSpec.m25222a();
            this.f50953b = connectionSpec.f50950c;
            this.f50954c = connectionSpec.f50951d;
            this.f50955d = connectionSpec.m25224b();
        }

        @Deprecated
        @NotNull
        /* renamed from: b */
        public final a m25229b() {
            if (this.f50952a) {
                this.f50955d = true;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        @NotNull
        /* renamed from: a */
        public final a m25227a(@NotNull String... cipherSuites) {
            Intrinsics.m32179h(cipherSuites, "cipherSuites");
            if (!this.f50952a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(cipherSuites.length == 0)) {
                Object clone = cipherSuites.clone();
                Intrinsics.m32177f(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                this.f50953b = (String[]) clone;
                return this;
            }
            throw new IllegalArgumentException("At least one cipher suite is required".toString());
        }

        @NotNull
        /* renamed from: a */
        public final a m25226a(@NotNull q61... tlsVersions) {
            Intrinsics.m32179h(tlsVersions, "tlsVersions");
            if (this.f50952a) {
                ArrayList arrayList = new ArrayList(tlsVersions.length);
                for (q61 q61Var : tlsVersions) {
                    arrayList.add(q61Var.m27646a());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                String[] strArr = (String[]) array;
                return m25230b((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        @NotNull
        /* renamed from: a */
        public final C5189hk m25228a() {
            return new C5189hk(this.f50952a, this.f50955d, this.f50953b, this.f50954c);
        }
    }

    @JvmName
    /* renamed from: a */
    public final boolean m25222a() {
        return this.f50948a;
    }

    @JvmName
    /* renamed from: b */
    public final boolean m25224b() {
        return this.f50949b;
    }

    /* renamed from: a */
    public final void m25221a(@NotNull SSLSocket sslSocket, boolean z) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        List list;
        Comparator comparator;
        Intrinsics.m32179h(sslSocket, "sslSocket");
        if (this.f50950c != null) {
            String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
            Intrinsics.m32178g(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            String[] strArr = this.f50950c;
            C5495nh.b bVar = C5495nh.f52988b;
            cipherSuitesIntersection = t91.m28527b(enabledCipherSuites, strArr, C5495nh.b.m26910a());
        } else {
            cipherSuitesIntersection = sslSocket.getEnabledCipherSuites();
        }
        if (this.f50951d != null) {
            String[] enabledProtocols = sslSocket.getEnabledProtocols();
            Intrinsics.m32178g(enabledProtocols, "sslSocket.enabledProtocols");
            String[] strArr2 = this.f50951d;
            comparator = NaturalOrderComparator.f63209b;
            tlsVersionsIntersection = t91.m28527b(enabledProtocols, strArr2, (Comparator<? super String>) comparator);
        } else {
            tlsVersionsIntersection = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        Intrinsics.m32178g(supportedCipherSuites, "supportedCipherSuites");
        C5495nh.b bVar2 = C5495nh.f52988b;
        int m28494a = t91.m28494a(supportedCipherSuites, C5495nh.b.m26910a());
        if (z && m28494a != -1) {
            Intrinsics.m32178g(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[m28494a];
            Intrinsics.m32178g(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = t91.m28519a(str, cipherSuitesIntersection);
        }
        a aVar = new a(this);
        Intrinsics.m32178g(cipherSuitesIntersection, "cipherSuitesIntersection");
        a m25227a = aVar.m25227a((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.m32178g(tlsVersionsIntersection, "tlsVersionsIntersection");
        C5189hk m25228a = m25227a.m25230b((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).m25228a();
        String[] strArr3 = m25228a.f50951d;
        List list2 = null;
        if (strArr3 != null) {
            ArrayList arrayList = new ArrayList(strArr3.length);
            for (String str2 : strArr3) {
                arrayList.add(q61.C5622a.m27647a(str2));
            }
            list = CollectionsKt.m32027j0(arrayList);
        } else {
            list = null;
        }
        if (list != null) {
            sslSocket.setEnabledProtocols(m25228a.f50951d);
        }
        String[] strArr4 = m25228a.f50950c;
        if (strArr4 != null) {
            ArrayList arrayList2 = new ArrayList(strArr4.length);
            for (String str3 : strArr4) {
                arrayList2.add(C5495nh.f52988b.m26911a(str3));
            }
            list2 = CollectionsKt.m32027j0(arrayList2);
        }
        if (list2 != null) {
            sslSocket.setEnabledCipherSuites(m25228a.f50950c);
        }
    }

    /* renamed from: a */
    public final boolean m25223a(@NotNull SSLSocket socket) {
        Comparator comparator;
        Intrinsics.m32179h(socket, "socket");
        if (!this.f50948a) {
            return false;
        }
        String[] strArr = this.f50951d;
        if (strArr != null) {
            String[] enabledProtocols = socket.getEnabledProtocols();
            comparator = NaturalOrderComparator.f63209b;
            if (!t91.m28518a(strArr, enabledProtocols, (Comparator<? super String>) comparator)) {
                return false;
            }
        }
        String[] strArr2 = this.f50950c;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = socket.getEnabledCipherSuites();
        C5495nh.b bVar = C5495nh.f52988b;
        return t91.m28518a(strArr2, enabledCipherSuites, C5495nh.b.m26910a());
    }
}
