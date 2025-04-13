package com.yandex.mobile.ads.impl;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.nh */
/* loaded from: classes3.dex */
public final class C5495nh {

    /* renamed from: b */
    @NotNull
    public static final b f52988b;

    /* renamed from: c */
    @NotNull
    private static final a f52989c = new a();

    /* renamed from: d */
    @NotNull
    private static final LinkedHashMap f52990d = new LinkedHashMap();

    /* renamed from: e */
    @JvmField
    @NotNull
    public static final C5495nh f52991e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public static final C5495nh f52992f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public static final C5495nh f52993g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public static final C5495nh f52994h;

    /* renamed from: i */
    @JvmField
    @NotNull
    public static final C5495nh f52995i;

    /* renamed from: j */
    @JvmField
    @NotNull
    public static final C5495nh f52996j;

    /* renamed from: k */
    @JvmField
    @NotNull
    public static final C5495nh f52997k;

    /* renamed from: l */
    @JvmField
    @NotNull
    public static final C5495nh f52998l;

    /* renamed from: m */
    @JvmField
    @NotNull
    public static final C5495nh f52999m;

    /* renamed from: n */
    @JvmField
    @NotNull
    public static final C5495nh f53000n;

    /* renamed from: o */
    @JvmField
    @NotNull
    public static final C5495nh f53001o;

    /* renamed from: p */
    @JvmField
    @NotNull
    public static final C5495nh f53002p;

    /* renamed from: q */
    @JvmField
    @NotNull
    public static final C5495nh f53003q;

    /* renamed from: r */
    @JvmField
    @NotNull
    public static final C5495nh f53004r;

    /* renamed from: s */
    @JvmField
    @NotNull
    public static final C5495nh f53005s;

    /* renamed from: t */
    @JvmField
    @NotNull
    public static final C5495nh f53006t;

    /* renamed from: a */
    @NotNull
    private final String f53007a;

    /* renamed from: com.yandex.mobile.ads.impl.nh$a */
    public static final class a implements Comparator<String> {
        /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003f A[RETURN, SYNTHETIC] */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int compare(java.lang.String r5, java.lang.String r6) {
            /*
                r4 = this;
                java.lang.String r5 = (java.lang.String) r5
                java.lang.String r6 = (java.lang.String) r6
                java.lang.String r0 = "a"
                kotlin.jvm.internal.Intrinsics.m32179h(r5, r0)
                java.lang.String r0 = "b"
                kotlin.jvm.internal.Intrinsics.m32179h(r6, r0)
                int r0 = r5.length()
                int r1 = r6.length()
                int r0 = java.lang.Math.min(r0, r1)
                r1 = 4
            L1b:
                if (r1 >= r0) goto L31
                char r2 = r5.charAt(r1)
                char r3 = r6.charAt(r1)
                if (r2 == r3) goto L2e
                int r5 = kotlin.jvm.internal.Intrinsics.m32181j(r2, r3)
                if (r5 >= 0) goto L3f
                goto L3d
            L2e:
                int r1 = r1 + 1
                goto L1b
            L31:
                int r5 = r5.length()
                int r6 = r6.length()
                if (r5 == r6) goto L41
                if (r5 >= r6) goto L3f
            L3d:
                r5 = -1
                goto L42
            L3f:
                r5 = 1
                goto L42
            L41:
                r5 = 0
            L42:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5495nh.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nh$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(int i2) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public static a m26910a() {
            return C5495nh.f52989c;
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final synchronized C5495nh m26911a(@NotNull String javaName) {
            C5495nh c5495nh;
            String str;
            Intrinsics.m32179h(javaName, "javaName");
            c5495nh = (C5495nh) ((LinkedHashMap) C5495nh.f52990d).get(javaName);
            if (c5495nh == null) {
                Map map = C5495nh.f52990d;
                int i2 = 0;
                if (StringsKt.m33898X(javaName, "TLS_", false, 2, null)) {
                    StringBuilder m26356a = l60.m26356a("SSL_");
                    String substring = javaName.substring(4);
                    Intrinsics.m32178g(substring, "this as java.lang.String).substring(startIndex)");
                    m26356a.append(substring);
                    str = m26356a.toString();
                } else if (StringsKt.m33898X(javaName, "SSL_", false, 2, null)) {
                    StringBuilder m26356a2 = l60.m26356a("TLS_");
                    String substring2 = javaName.substring(4);
                    Intrinsics.m32178g(substring2, "this as java.lang.String).substring(startIndex)");
                    m26356a2.append(substring2);
                    str = m26356a2.toString();
                } else {
                    str = javaName;
                }
                c5495nh = (C5495nh) ((LinkedHashMap) map).get(str);
                if (c5495nh == null) {
                    c5495nh = new C5495nh(javaName, i2);
                }
                C5495nh.f52990d.put(javaName, c5495nh);
            }
            return c5495nh;
        }
    }

    static {
        int i2 = 0;
        f52988b = new b(i2);
        C5495nh m26673a = C5443mh.m26673a("SSL_RSA_WITH_DES_CBC_SHA", C5443mh.m26673a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", C5443mh.m26673a("SSL_RSA_WITH_RC4_128_SHA", C5443mh.m26673a("SSL_RSA_WITH_RC4_128_MD5", C5443mh.m26673a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", C5443mh.m26673a("SSL_RSA_WITH_NULL_SHA", C5443mh.m26673a("SSL_RSA_WITH_NULL_MD5", new C5495nh("SSL_RSA_WITH_NULL_MD5", i2), "SSL_RSA_WITH_NULL_SHA", 0), "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 0), "SSL_RSA_WITH_RC4_128_MD5", 0), "SSL_RSA_WITH_RC4_128_SHA", 0), "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 0), "SSL_RSA_WITH_DES_CBC_SHA", 0), "SSL_RSA_WITH_3DES_EDE_CBC_SHA", 0);
        f52990d.put("SSL_RSA_WITH_3DES_EDE_CBC_SHA", m26673a);
        f52991e = m26673a;
        C5495nh m26673a2 = C5443mh.m26673a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", C5443mh.m26673a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", C5443mh.m26673a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", C5443mh.m26673a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", C5443mh.m26673a("TLS_KRB5_WITH_RC4_128_MD5", C5443mh.m26673a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", C5443mh.m26673a("TLS_KRB5_WITH_DES_CBC_MD5", C5443mh.m26673a("TLS_KRB5_WITH_RC4_128_SHA", C5443mh.m26673a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", C5443mh.m26673a("TLS_KRB5_WITH_DES_CBC_SHA", C5443mh.m26673a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", C5443mh.m26673a("SSL_DH_anon_WITH_DES_CBC_SHA", C5443mh.m26673a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", C5443mh.m26673a("SSL_DH_anon_WITH_RC4_128_MD5", C5443mh.m26673a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", C5443mh.m26673a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", C5443mh.m26673a("SSL_DHE_RSA_WITH_DES_CBC_SHA", C5443mh.m26673a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", C5443mh.m26673a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", C5443mh.m26673a("SSL_DHE_DSS_WITH_DES_CBC_SHA", C5443mh.m26673a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", new C5495nh("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", i2), "SSL_DHE_DSS_WITH_DES_CBC_SHA", 0), "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 0), "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 0), "SSL_DHE_RSA_WITH_DES_CBC_SHA", 0), "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 0), "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 0), "SSL_DH_anon_WITH_RC4_128_MD5", 0), "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 0), "SSL_DH_anon_WITH_DES_CBC_SHA", 0), "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 0), "TLS_KRB5_WITH_DES_CBC_SHA", 0), "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 0), "TLS_KRB5_WITH_RC4_128_SHA", 0), "TLS_KRB5_WITH_DES_CBC_MD5", 0), "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 0), "TLS_KRB5_WITH_RC4_128_MD5", 0), "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 0), "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 0), "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 0), "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 0), "TLS_RSA_WITH_AES_128_CBC_SHA", 0);
        f52990d.put("TLS_RSA_WITH_AES_128_CBC_SHA", m26673a2);
        f52992f = m26673a2;
        C5495nh m26673a3 = C5443mh.m26673a("TLS_DH_anon_WITH_AES_128_CBC_SHA", C5443mh.m26673a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", C5443mh.m26673a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", new C5495nh("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", i2), "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 0), "TLS_DH_anon_WITH_AES_128_CBC_SHA", 0), "TLS_RSA_WITH_AES_256_CBC_SHA", 0);
        f52990d.put("TLS_RSA_WITH_AES_256_CBC_SHA", m26673a3);
        f52993g = m26673a3;
        C5495nh m26673a4 = C5443mh.m26673a("TLS_RSA_WITH_SEED_CBC_SHA", C5443mh.m26673a("TLS_PSK_WITH_AES_256_CBC_SHA", C5443mh.m26673a("TLS_PSK_WITH_AES_128_CBC_SHA", C5443mh.m26673a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", C5443mh.m26673a("TLS_PSK_WITH_RC4_128_SHA", C5443mh.m26673a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", C5443mh.m26673a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", C5443mh.m26673a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", C5443mh.m26673a("TLS_DH_anon_WITH_AES_256_CBC_SHA256", C5443mh.m26673a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", C5443mh.m26673a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", C5443mh.m26673a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", C5443mh.m26673a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", C5443mh.m26673a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", C5443mh.m26673a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", C5443mh.m26673a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", C5443mh.m26673a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", C5443mh.m26673a("TLS_RSA_WITH_AES_256_CBC_SHA256", C5443mh.m26673a("TLS_RSA_WITH_AES_128_CBC_SHA256", C5443mh.m26673a("TLS_RSA_WITH_NULL_SHA256", C5443mh.m26673a("TLS_DH_anon_WITH_AES_256_CBC_SHA", C5443mh.m26673a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", C5443mh.m26673a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", new C5495nh("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", i2), "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 0), "TLS_DH_anon_WITH_AES_256_CBC_SHA", 0), "TLS_RSA_WITH_NULL_SHA256", 0), "TLS_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_RSA_WITH_AES_256_CBC_SHA256", 0), "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 0), "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 0), "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 0), "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 0), "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 0), "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 0), "TLS_DH_anon_WITH_AES_128_CBC_SHA256", 0), "TLS_DH_anon_WITH_AES_256_CBC_SHA256", 0), "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 0), "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 0), "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 0), "TLS_PSK_WITH_RC4_128_SHA", 0), "TLS_PSK_WITH_3DES_EDE_CBC_SHA", 0), "TLS_PSK_WITH_AES_128_CBC_SHA", 0), "TLS_PSK_WITH_AES_256_CBC_SHA", 0), "TLS_RSA_WITH_SEED_CBC_SHA", 0), "TLS_RSA_WITH_AES_128_GCM_SHA256", 0);
        f52990d.put("TLS_RSA_WITH_AES_128_GCM_SHA256", m26673a4);
        f52994h = m26673a4;
        C5495nh c5495nh = new C5495nh("TLS_RSA_WITH_AES_256_GCM_SHA384", i2);
        f52990d.put("TLS_RSA_WITH_AES_256_GCM_SHA384", c5495nh);
        f52995i = c5495nh;
        C5495nh m26673a5 = C5443mh.m26673a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", C5443mh.m26673a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", C5443mh.m26673a("TLS_ECDHE_RSA_WITH_NULL_SHA", C5443mh.m26673a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", C5443mh.m26673a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", C5443mh.m26673a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", C5443mh.m26673a("TLS_ECDH_RSA_WITH_RC4_128_SHA", C5443mh.m26673a("TLS_ECDH_RSA_WITH_NULL_SHA", C5443mh.m26673a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", C5443mh.m26673a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", C5443mh.m26673a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", C5443mh.m26673a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", C5443mh.m26673a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", C5443mh.m26673a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", C5443mh.m26673a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", C5443mh.m26673a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", C5443mh.m26673a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", C5443mh.m26673a("TLS_ECDH_ECDSA_WITH_NULL_SHA", C5443mh.m26673a("TLS_FALLBACK_SCSV", C5443mh.m26673a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", C5443mh.m26673a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", C5443mh.m26673a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", C5443mh.m26673a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", C5443mh.m26673a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", C5443mh.m26673a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", C5443mh.m26673a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", new C5495nh("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", i2), "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 0), "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 0), "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 0), "TLS_DH_anon_WITH_AES_128_GCM_SHA256", 0), "TLS_DH_anon_WITH_AES_256_GCM_SHA384", 0), "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 0), "TLS_FALLBACK_SCSV", 0), "TLS_ECDH_ECDSA_WITH_NULL_SHA", 0), "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 0), "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 0), "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_NULL_SHA", 0), "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 0), "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 0), "TLS_ECDH_RSA_WITH_NULL_SHA", 0), "TLS_ECDH_RSA_WITH_RC4_128_SHA", 0), "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 0), "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_RSA_WITH_NULL_SHA", 0), "TLS_ECDHE_RSA_WITH_RC4_128_SHA", 0), "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 0);
        f52990d.put("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", m26673a5);
        f52996j = m26673a5;
        C5495nh c5495nh2 = new C5495nh("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", i2);
        f52990d.put("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", c5495nh2);
        f52997k = c5495nh2;
        C5495nh m26673a6 = C5443mh.m26673a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", C5443mh.m26673a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", C5443mh.m26673a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", C5443mh.m26673a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", C5443mh.m26673a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", C5443mh.m26673a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", C5443mh.m26673a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", C5443mh.m26673a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", C5443mh.m26673a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", C5443mh.m26673a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", C5443mh.m26673a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", C5443mh.m26673a("TLS_ECDH_anon_WITH_RC4_128_SHA", C5443mh.m26673a("TLS_ECDH_anon_WITH_NULL_SHA", new C5495nh("TLS_ECDH_anon_WITH_NULL_SHA", i2), "TLS_ECDH_anon_WITH_RC4_128_SHA", 0), "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 0), "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 0), "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 0), "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 0), "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 0), "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 0);
        f52990d.put("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", m26673a6);
        f52998l = m26673a6;
        C5495nh c5495nh3 = new C5495nh("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", i2);
        f52990d.put("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", c5495nh3);
        f52999m = c5495nh3;
        C5495nh m26673a7 = C5443mh.m26673a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", C5443mh.m26673a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", new C5495nh("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", i2), "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 0), "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 0);
        f52990d.put("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", m26673a7);
        f53000n = m26673a7;
        C5495nh c5495nh4 = new C5495nh("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", i2);
        f52990d.put("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", c5495nh4);
        f53001o = c5495nh4;
        C5495nh m26673a8 = C5443mh.m26673a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", C5443mh.m26673a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", C5443mh.m26673a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", C5443mh.m26673a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", new C5495nh("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", i2), "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 0), "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 0), "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 0);
        f52990d.put("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", m26673a8);
        f53002p = m26673a8;
        C5495nh c5495nh5 = new C5495nh("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", i2);
        f52990d.put("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", c5495nh5);
        f53003q = c5495nh5;
        C5495nh m26673a9 = C5443mh.m26673a("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", C5443mh.m26673a("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", new C5495nh("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", i2), "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 0), "TLS_AES_128_GCM_SHA256", 0);
        f52990d.put("TLS_AES_128_GCM_SHA256", m26673a9);
        f53004r = m26673a9;
        C5495nh c5495nh6 = new C5495nh("TLS_AES_256_GCM_SHA384", i2);
        f52990d.put("TLS_AES_256_GCM_SHA384", c5495nh6);
        f53005s = c5495nh6;
        C5495nh c5495nh7 = new C5495nh("TLS_CHACHA20_POLY1305_SHA256", i2);
        f52990d.put("TLS_CHACHA20_POLY1305_SHA256", c5495nh7);
        f53006t = c5495nh7;
        f52990d.put("TLS_AES_128_CCM_8_SHA256", C5443mh.m26673a("TLS_AES_128_CCM_SHA256", new C5495nh("TLS_AES_128_CCM_SHA256", i2), "TLS_AES_128_CCM_8_SHA256", 0));
    }

    private C5495nh(String str) {
        this.f53007a = str;
    }

    public /* synthetic */ C5495nh(String str, int i2) {
        this(str);
    }

    @JvmName
    @NotNull
    /* renamed from: c */
    public final String m26909c() {
        return this.f53007a;
    }

    @NotNull
    public final String toString() {
        return this.f53007a;
    }
}
