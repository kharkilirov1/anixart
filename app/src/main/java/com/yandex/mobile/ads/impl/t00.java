package com.yandex.mobile.ads.impl;

import com.fasterxml.jackson.core.JsonPointer;
import com.yandex.mobile.ads.C4632R;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class t00 {

    /* renamed from: j */
    @NotNull
    private static final char[] f54897j;

    /* renamed from: a */
    @NotNull
    private final String f54898a;

    /* renamed from: b */
    @NotNull
    private final String f54899b;

    /* renamed from: c */
    @NotNull
    private final String f54900c;

    /* renamed from: d */
    @NotNull
    private final String f54901d;

    /* renamed from: e */
    private final int f54902e;

    /* renamed from: f */
    @Nullable
    private final List<String> f54903f;

    /* renamed from: g */
    @Nullable
    private final String f54904g;

    /* renamed from: h */
    @NotNull
    private final String f54905h;

    /* renamed from: i */
    private final boolean f54906i;

    /* renamed from: com.yandex.mobile.ads.impl.t00$a */
    public static final class C5776a {

        /* renamed from: a */
        @Nullable
        private String f54907a;

        /* renamed from: d */
        @Nullable
        private String f54910d;

        /* renamed from: f */
        @NotNull
        private final ArrayList f54912f;

        /* renamed from: g */
        @Nullable
        private ArrayList f54913g;

        /* renamed from: h */
        @Nullable
        private String f54914h;

        /* renamed from: b */
        @NotNull
        private String f54908b = "";

        /* renamed from: c */
        @NotNull
        private String f54909c = "";

        /* renamed from: e */
        private int f54911e = -1;

        /* renamed from: com.yandex.mobile.ads.impl.t00$a$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(int i2) {
                this();
            }

            /* renamed from: a */
            public static final int m28416a(String str, int i2, int i3) {
                int parseInt;
                try {
                    parseInt = Integer.parseInt(C5777b.m28421a(str, i2, i3, "", false, false, false, false, 248));
                } catch (NumberFormatException unused) {
                }
                if (1 <= parseInt && parseInt < 65536) {
                    return parseInt;
                }
                return -1;
            }

            /* renamed from: b */
            public static final int m28417b(String str, int i2, int i3) {
                while (i2 < i3) {
                    char charAt = str.charAt(i2);
                    if (charAt == '[') {
                        do {
                            i2++;
                            if (i2 < i3) {
                            }
                        } while (str.charAt(i2) != ']');
                    } else if (charAt == ':') {
                        return i2;
                    }
                    i2++;
                }
                return i3;
            }

            /* renamed from: c */
            public static final int m28418c(String str, int i2, int i3) {
                if (i3 - i2 >= 2) {
                    char charAt = str.charAt(i2);
                    if ((Intrinsics.m32181j(charAt, 97) >= 0 && Intrinsics.m32181j(charAt, C4632R.styleable.AppCompatTheme_windowFixedWidthMajor) <= 0) || (Intrinsics.m32181j(charAt, 65) >= 0 && Intrinsics.m32181j(charAt, 90) <= 0)) {
                        while (true) {
                            boolean z = true;
                            i2++;
                            if (i2 >= i3) {
                                break;
                            }
                            char charAt2 = str.charAt(i2);
                            if (!((((('a' <= charAt2 && charAt2 < '{') || ('A' <= charAt2 && charAt2 < '[')) || ('0' <= charAt2 && charAt2 < ':')) || charAt2 == '+') || charAt2 == '-') && charAt2 != '.') {
                                z = false;
                            }
                            if (!z) {
                                if (charAt2 == ':') {
                                    return i2;
                                }
                            }
                        }
                    }
                }
                return -1;
            }

            /* renamed from: d */
            public static final int m28419d(String str, int i2, int i3) {
                int i4 = 0;
                while (i2 < i3) {
                    char charAt = str.charAt(i2);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i4++;
                    i2++;
                }
                return i4;
            }
        }

        static {
            new a(0);
        }

        public C5776a() {
            ArrayList arrayList = new ArrayList();
            this.f54912f = arrayList;
            arrayList.add("");
        }

        @NotNull
        /* renamed from: a */
        public final C5776a m28400a(int i2) {
            if (!(1 <= i2 && i2 < 65536)) {
                throw new IllegalArgumentException(k60.m26036a("unexpected port: ", i2).toString());
            }
            this.f54911e = i2;
            return this;
        }

        /* renamed from: b */
        public final void m28406b(int i2) {
            this.f54911e = i2;
        }

        @NotNull
        /* renamed from: c */
        public final C5776a m28408c(@NotNull String scheme) {
            Intrinsics.m32179h(scheme, "scheme");
            if (StringsKt.m33927y(scheme, "http", true)) {
                this.f54907a = "http";
            } else {
                if (!StringsKt.m33927y(scheme, "https", true)) {
                    throw new IllegalArgumentException(um1.m29049a("unexpected scheme: ", scheme));
                }
                this.f54907a = "https";
            }
            return this;
        }

        /* renamed from: d */
        public final void m28410d(@Nullable String str) {
            this.f54914h = str;
        }

        /* renamed from: e */
        public final void m28412e(@NotNull String str) {
            Intrinsics.m32179h(str, "<set-?>");
            this.f54909c = str;
        }

        /* renamed from: f */
        public final void m28413f(@NotNull String str) {
            Intrinsics.m32179h(str, "<set-?>");
            this.f54908b = str;
        }

        /* renamed from: g */
        public final void m28414g(@Nullable String str) {
            this.f54910d = str;
        }

        /* renamed from: h */
        public final void m28415h(@Nullable String str) {
            this.f54907a = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            if ((r6.f54909c.length() > 0) != false) goto L17;
         */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f54907a
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.f54908b
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L23
                r1 = 1
                goto L24
            L23:
                r1 = 0
            L24:
                r4 = 58
                if (r1 != 0) goto L35
                java.lang.String r1 = r6.f54909c
                int r1 = r1.length()
                if (r1 <= 0) goto L32
                r1 = 1
                goto L33
            L32:
                r1 = 0
            L33:
                if (r1 == 0) goto L53
            L35:
                java.lang.String r1 = r6.f54908b
                r0.append(r1)
                java.lang.String r1 = r6.f54909c
                int r1 = r1.length()
                if (r1 <= 0) goto L43
                goto L44
            L43:
                r2 = 0
            L44:
                if (r2 == 0) goto L4e
                r0.append(r4)
                java.lang.String r1 = r6.f54909c
                r0.append(r1)
            L4e:
                r1 = 64
                r0.append(r1)
            L53:
                java.lang.String r1 = r6.f54910d
                if (r1 == 0) goto L74
                r2 = 2
                r5 = 0
                boolean r1 = kotlin.text.StringsKt.m33921s(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L6f
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f54910d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L74
            L6f:
                java.lang.String r1 = r6.f54910d
                r0.append(r1)
            L74:
                int r1 = r6.f54911e
                r2 = -1
                if (r1 != r2) goto L7d
                java.lang.String r3 = r6.f54907a
                if (r3 == 0) goto L99
            L7d:
                if (r1 == r2) goto L80
                goto L89
            L80:
                java.lang.String r1 = r6.f54907a
                kotlin.jvm.internal.Intrinsics.m32176e(r1)
                int r1 = com.yandex.mobile.ads.impl.t00.C5777b.m28420a(r1)
            L89:
                java.lang.String r2 = r6.f54907a
                if (r2 == 0) goto L93
                int r2 = com.yandex.mobile.ads.impl.t00.C5777b.m28420a(r2)
                if (r1 == r2) goto L99
            L93:
                r0.append(r4)
                r0.append(r1)
            L99:
                java.util.ArrayList r1 = r6.f54912f
                com.yandex.mobile.ads.impl.t00.C5777b.m28423a(r1, r0)
                java.util.ArrayList r1 = r6.f54913g
                if (r1 == 0) goto Laf
                r1 = 63
                r0.append(r1)
                java.util.ArrayList r1 = r6.f54913g
                kotlin.jvm.internal.Intrinsics.m32176e(r1)
                com.yandex.mobile.ads.impl.t00.C5777b.m28424a(r1, r0)
            Laf:
                java.lang.String r1 = r6.f54914h
                if (r1 == 0) goto Lbd
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f54914h
                r0.append(r1)
            Lbd:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.Intrinsics.m32178g(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.t00.C5776a.toString():java.lang.String");
        }

        @NotNull
        /* renamed from: b */
        public final ArrayList m28405b() {
            return this.f54912f;
        }

        @NotNull
        /* renamed from: d */
        public final C5776a m28409d() {
            String str = this.f54910d;
            this.f54910d = str != null ? new Regex("[\"<>^`{|}]").m33873e(str, "") : null;
            int size = this.f54912f.size();
            for (int i2 = 0; i2 < size; i2++) {
                ArrayList arrayList = this.f54912f;
                arrayList.set(i2, C5777b.m28421a((String) arrayList.get(i2), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, 227));
            }
            ArrayList arrayList2 = this.f54913g;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    String str2 = (String) arrayList2.get(i3);
                    arrayList2.set(i3, str2 != null ? C5777b.m28421a(str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, 195) : null);
                }
            }
            String str3 = this.f54914h;
            this.f54914h = str3 != null ? C5777b.m28421a(str3, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, 163) : null;
            return this;
        }

        @NotNull
        /* renamed from: e */
        public final C5776a m28411e() {
            this.f54908b = C5777b.m28421a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final C5776a m28404b(@NotNull String host) {
            Intrinsics.m32179h(host, "host");
            String m29818a = C6046xy.m29818a(C5777b.m28422a(host, 0, 0, false, 7));
            if (m29818a != null) {
                this.f54910d = m29818a;
                return this;
            }
            throw new IllegalArgumentException(um1.m29049a("unexpected host: ", host));
        }

        @NotNull
        /* renamed from: a */
        public final void m28403a(@Nullable String str) {
            String m28421a;
            this.f54913g = (str == null || (m28421a = C5777b.m28421a(str, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, 211)) == null) ? null : C5777b.m28427d(m28421a);
        }

        @NotNull
        /* renamed from: c */
        public final C5776a m28407c() {
            this.f54909c = C5777b.m28421a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final t00 m28402a() {
            ArrayList arrayList;
            String str = this.f54907a;
            if (str != null) {
                String m28422a = C5777b.m28422a(this.f54908b, 0, 0, false, 7);
                String m28422a2 = C5777b.m28422a(this.f54909c, 0, 0, false, 7);
                String str2 = this.f54910d;
                if (str2 != null) {
                    int i2 = this.f54911e;
                    if (i2 == -1) {
                        String str3 = this.f54907a;
                        Intrinsics.m32176e(str3);
                        i2 = C5777b.m28420a(str3);
                    }
                    int i3 = i2;
                    ArrayList arrayList2 = this.f54912f;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.m32032m(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(C5777b.m28422a((String) it.next(), 0, 0, false, 7));
                    }
                    ArrayList<String> arrayList4 = this.f54913g;
                    if (arrayList4 != null) {
                        arrayList = new ArrayList(CollectionsKt.m32032m(arrayList4, 10));
                        for (String str4 : arrayList4) {
                            arrayList.add(str4 != null ? C5777b.m28422a(str4, 0, 0, true, 3) : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str5 = this.f54914h;
                    return new t00(str, m28422a, m28422a2, str2, i3, arrayList3, arrayList, str5 != null ? C5777b.m28422a(str5, 0, 0, false, 7) : null, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x025e  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0290  */
        @org.jetbrains.annotations.NotNull
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.yandex.mobile.ads.impl.t00.C5776a m28401a(@org.jetbrains.annotations.Nullable com.yandex.mobile.ads.impl.t00 r20, @org.jetbrains.annotations.NotNull java.lang.String r21) {
            /*
                Method dump skipped, instructions count: 824
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.t00.C5776a.m28401a(com.yandex.mobile.ads.impl.t00, java.lang.String):com.yandex.mobile.ads.impl.t00$a");
        }
    }

    static {
        new C5777b(0);
        f54897j = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public t00(@NotNull String scheme, @NotNull String username, @NotNull String password, @NotNull String host, int i2, @NotNull ArrayList pathSegments, @Nullable ArrayList arrayList, @Nullable String str, @NotNull String url) {
        Intrinsics.m32179h(scheme, "scheme");
        Intrinsics.m32179h(username, "username");
        Intrinsics.m32179h(password, "password");
        Intrinsics.m32179h(host, "host");
        Intrinsics.m32179h(pathSegments, "pathSegments");
        Intrinsics.m32179h(url, "url");
        this.f54898a = scheme;
        this.f54899b = username;
        this.f54900c = password;
        this.f54901d = host;
        this.f54902e = i2;
        this.f54903f = arrayList;
        this.f54904g = str;
        this.f54905h = url;
        this.f54906i = Intrinsics.m32174c(scheme, "https");
    }

    @JvmStatic
    @JvmName
    @Nullable
    /* renamed from: a */
    public static final t00 m28384a(@NotNull String str) {
        return C5777b.m28426c(str);
    }

    @Nullable
    /* renamed from: b */
    public final t00 m28386b(@NotNull String link) {
        C5776a c5776a;
        Intrinsics.m32179h(link, "link");
        try {
            c5776a = new C5776a().m28401a(this, link);
        } catch (IllegalArgumentException unused) {
            c5776a = null;
        }
        if (c5776a != null) {
            return c5776a.m28402a();
        }
        return null;
    }

    @JvmName
    @NotNull
    /* renamed from: c */
    public final String m28388c() {
        int m33877C = StringsKt.m33877C(this.f54905h, JsonPointer.SEPARATOR, this.f54898a.length() + 3, false, 4, null);
        String str = this.f54905h;
        String substring = this.f54905h.substring(m33877C, t91.m28486a(m33877C, str.length(), str, "?#"));
        Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @JvmName
    @NotNull
    /* renamed from: d */
    public final ArrayList m28389d() {
        int m33877C = StringsKt.m33877C(this.f54905h, JsonPointer.SEPARATOR, this.f54898a.length() + 3, false, 4, null);
        String str = this.f54905h;
        int m28486a = t91.m28486a(m33877C, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (m33877C < m28486a) {
            int i2 = m33877C + 1;
            int m28489a = t91.m28489a(this.f54905h, JsonPointer.SEPARATOR, i2, m28486a);
            String substring = this.f54905h.substring(i2, m28489a);
            Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            m33877C = m28489a;
        }
        return arrayList;
    }

    @JvmName
    @Nullable
    /* renamed from: e */
    public final String m28390e() {
        if (this.f54903f == null) {
            return null;
        }
        int m33877C = StringsKt.m33877C(this.f54905h, '?', 0, false, 6, null) + 1;
        String str = this.f54905h;
        String substring = this.f54905h.substring(m33877C, t91.m28489a(str, '#', m33877C, str.length()));
        Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof t00) && Intrinsics.m32174c(((t00) obj).f54905h, this.f54905h);
    }

    @JvmName
    @NotNull
    /* renamed from: f */
    public final String m28391f() {
        if (this.f54899b.length() == 0) {
            return "";
        }
        int length = this.f54898a.length() + 3;
        String str = this.f54905h;
        String substring = this.f54905h.substring(length, t91.m28486a(length, str.length(), str, ":@"));
        Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @JvmName
    @NotNull
    /* renamed from: g */
    public final String m28392g() {
        return this.f54901d;
    }

    /* renamed from: h */
    public final boolean m28393h() {
        return this.f54906i;
    }

    public final int hashCode() {
        return this.f54905h.hashCode();
    }

    @JvmName
    /* renamed from: i */
    public final int m28394i() {
        return this.f54902e;
    }

    @JvmName
    @Nullable
    /* renamed from: j */
    public final String m28395j() {
        if (this.f54903f == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        C5777b.m28424a(this.f54903f, sb);
        return sb.toString();
    }

    @NotNull
    /* renamed from: k */
    public final String m28396k() {
        C5776a c5776a;
        try {
            c5776a = new C5776a().m28401a(this, "/...");
        } catch (IllegalArgumentException unused) {
            c5776a = null;
        }
        Intrinsics.m32176e(c5776a);
        return c5776a.m28411e().m28407c().m28402a().f54905h;
    }

    @JvmName
    @NotNull
    /* renamed from: l */
    public final String m28397l() {
        return this.f54898a;
    }

    @JvmName
    @NotNull
    /* renamed from: m */
    public final URI m28398m() {
        String substring;
        C5776a c5776a = new C5776a();
        c5776a.m28415h(this.f54898a);
        c5776a.m28413f(m28391f());
        c5776a.m28412e(m28387b());
        c5776a.m28414g(this.f54901d);
        c5776a.m28406b(this.f54902e != C5777b.m28420a(this.f54898a) ? this.f54902e : -1);
        c5776a.m28405b().clear();
        c5776a.m28405b().addAll(m28389d());
        c5776a.m28403a(m28390e());
        if (this.f54904g == null) {
            substring = null;
        } else {
            substring = this.f54905h.substring(StringsKt.m33877C(this.f54905h, '#', 0, false, 6, null) + 1);
            Intrinsics.m32178g(substring, "this as java.lang.String).substring(startIndex)");
        }
        c5776a.m28410d(substring);
        String c5776a2 = c5776a.m28409d().toString();
        try {
            return new URI(c5776a2);
        } catch (URISyntaxException e2) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").m33873e(c5776a2, ""));
                Intrinsics.m32178g(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    @JvmName
    @NotNull
    /* renamed from: n */
    public final URL m28399n() {
        try {
            return new URL(this.f54905h);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    @NotNull
    public final String toString() {
        return this.f54905h;
    }

    /* renamed from: com.yandex.mobile.ads.impl.t00$b */
    public static final class C5777b {
        private C5777b() {
        }

        public /* synthetic */ C5777b(int i2) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public static int m28420a(@NotNull String scheme) {
            Intrinsics.m32179h(scheme, "scheme");
            if (Intrinsics.m32174c(scheme, "http")) {
                return 80;
            }
            return Intrinsics.m32174c(scheme, "https") ? 443 : -1;
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: b */
        public static t00 m28425b(@NotNull String str) {
            Intrinsics.m32179h(str, "<this>");
            return new C5776a().m28401a(null, str).m28402a();
        }

        @JvmStatic
        @JvmName
        @Nullable
        /* renamed from: c */
        public static t00 m28426c(@NotNull String str) {
            Intrinsics.m32179h(str, "<this>");
            try {
                return m28425b(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @NotNull
        /* renamed from: d */
        public static ArrayList m28427d(@NotNull String str) {
            Intrinsics.m32179h(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 <= str.length()) {
                int m33877C = StringsKt.m33877C(str, '&', i2, false, 4, null);
                if (m33877C == -1) {
                    m33877C = str.length();
                }
                int i3 = m33877C;
                int m33877C2 = StringsKt.m33877C(str, '=', i2, false, 4, null);
                if (m33877C2 == -1 || m33877C2 > i3) {
                    String substring = str.substring(i2, i3);
                    Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add(null);
                } else {
                    String substring2 = str.substring(i2, m33877C2);
                    Intrinsics.m32178g(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(m33877C2 + 1, i3);
                    Intrinsics.m32178g(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i2 = i3 + 1;
            }
            return arrayList;
        }

        /* renamed from: a */
        public static void m28423a(@NotNull ArrayList arrayList, @NotNull StringBuilder out) {
            Intrinsics.m32179h(arrayList, "<this>");
            Intrinsics.m32179h(out, "out");
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                out.append(JsonPointer.SEPARATOR);
                out.append((String) arrayList.get(i2));
            }
        }

        /* renamed from: a */
        public static void m28424a(@NotNull List list, @NotNull StringBuilder out) {
            Intrinsics.m32179h(list, "<this>");
            Intrinsics.m32179h(out, "out");
            IntProgression m32242i = RangesKt.m32242i(RangesKt.m32243j(0, list.size()), 2);
            int i2 = m32242i.f63380b;
            int i3 = m32242i.f63381c;
            int i4 = m32242i.f63382d;
            if ((i4 <= 0 || i2 > i3) && (i4 >= 0 || i3 > i2)) {
                return;
            }
            while (true) {
                String str = (String) list.get(i2);
                String str2 = (String) list.get(i2 + 1);
                if (i2 > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (i2 == i3) {
                    return;
                } else {
                    i2 += i4;
                }
            }
        }

        /* renamed from: a */
        public static String m28422a(String str, int i2, int i3, boolean z, int i4) {
            int i5;
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = str.length();
            }
            if ((i4 & 4) != 0) {
                z = false;
            }
            Intrinsics.m32179h(str, "<this>");
            int i6 = i2;
            while (i6 < i3) {
                char charAt = str.charAt(i6);
                if (charAt == '%' || (charAt == '+' && z)) {
                    Buffer buffer = new Buffer();
                    buffer.m34522O0(str, i2, i6);
                    while (i6 < i3) {
                        int codePointAt = str.codePointAt(i6);
                        if (codePointAt == 37 && (i5 = i6 + 2) < i3) {
                            int m28484a = t91.m28484a(str.charAt(i6 + 1));
                            int m28484a2 = t91.m28484a(str.charAt(i5));
                            if (m28484a != -1 && m28484a2 != -1) {
                                buffer.m34524Q((m28484a << 4) + m28484a2);
                                i6 = Character.charCount(codePointAt) + i5;
                            }
                            buffer.m34526R0(codePointAt);
                            i6 += Character.charCount(codePointAt);
                        } else {
                            if (codePointAt == 43 && z) {
                                buffer.m34524Q(32);
                                i6++;
                            }
                            buffer.m34526R0(codePointAt);
                            i6 += Character.charCount(codePointAt);
                        }
                    }
                    return buffer.m34553m();
                }
                i6++;
            }
            String substring = str.substring(i2, i3);
            Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x0113, code lost:
        
            if (r11 != false) goto L100;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.String m28421a(java.lang.String r19, int r20, int r21, java.lang.String r22, boolean r23, boolean r24, boolean r25, boolean r26, int r27) {
            /*
                Method dump skipped, instructions count: 360
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.t00.C5777b.m28421a(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, int):java.lang.String");
        }
    }

    @JvmName
    @NotNull
    /* renamed from: b */
    public final String m28387b() {
        if (this.f54900c.length() == 0) {
            return "";
        }
        String substring = this.f54905h.substring(StringsKt.m33877C(this.f54905h, ':', this.f54898a.length() + 3, false, 4, null) + 1, StringsKt.m33877C(this.f54905h, '@', 0, false, 6, null));
        Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
