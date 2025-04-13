package com.squareup.okhttp;

import com.fasterxml.jackson.core.JsonPointer;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okio.Buffer;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class HttpUrl {

    /* renamed from: j */
    public static final char[] f24851j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final String f24852a;

    /* renamed from: b */
    public final String f24853b;

    /* renamed from: c */
    public final String f24854c;

    /* renamed from: d */
    public final String f24855d;

    /* renamed from: e */
    public final int f24856e;

    /* renamed from: f */
    public final List<String> f24857f;

    /* renamed from: g */
    public final List<String> f24858g;

    /* renamed from: h */
    public final String f24859h;

    /* renamed from: i */
    public final String f24860i;

    /* renamed from: com.squareup.okhttp.HttpUrl$1 */
    public static /* synthetic */ class C24661 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24861a;

        static {
            int[] iArr = new int[Builder.ParseResult.values().length];
            f24861a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24861a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24861a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24861a[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24861a[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class Builder {

        /* renamed from: a */
        public String f24862a;

        /* renamed from: d */
        public String f24865d;

        /* renamed from: f */
        public final List<String> f24867f;

        /* renamed from: g */
        public List<String> f24868g;

        /* renamed from: h */
        public String f24869h;

        /* renamed from: b */
        public String f24863b = "";

        /* renamed from: c */
        public String f24864c = "";

        /* renamed from: e */
        public int f24866e = -1;

        public enum ParseResult {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.f24867f = arrayList;
            arrayList.add("");
        }

        /* JADX WARN: Code restructure failed: missing block: B:83:0x00f1, code lost:
        
            if (r9 == 16) goto L79;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x00f3, code lost:
        
            if (r10 != (-1)) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x00f8, code lost:
        
            r1 = r9 - r10;
            java.lang.System.arraycopy(r7, r10, r7, 16 - r1, r1);
            r0 = 0;
            java.util.Arrays.fill(r7, r10, (16 - r9) + r10, (byte) 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x0108, code lost:
        
            r1 = java.net.InetAddress.getByAddress(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x017c, code lost:
        
            throw new java.lang.AssertionError();
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x0107, code lost:
        
            r0 = 0;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00c2  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.String m13914b(java.lang.String r16, int r17, int r18) {
            /*
                Method dump skipped, instructions count: 439
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.HttpUrl.Builder.m13914b(java.lang.String, int, int):java.lang.String");
        }

        /* renamed from: a */
        public HttpUrl m13915a() {
            if (this.f24862a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f24865d != null) {
                return new HttpUrl(this, null);
            }
            throw new IllegalStateException("host == null");
        }

        /* renamed from: c */
        public Builder m13916c(String str) {
            this.f24868g = str != null ? HttpUrl.m13906o(HttpUrl.m13899b(str, okhttp3.HttpUrl.QUERY_ENCODE_SET, true, true, true)) : null;
            return this;
        }

        /* renamed from: d */
        public Builder m13917d(String str) {
            if (str == null) {
                throw new IllegalArgumentException("host == null");
            }
            String m13914b = m13914b(str, 0, str.length());
            if (m13914b == null) {
                throw new IllegalArgumentException(C0000a.m14k("unexpected host: ", str));
            }
            this.f24865d = m13914b;
            return this;
        }

        /* renamed from: e */
        public Builder m13918e(int i2) {
            if (i2 <= 0 || i2 > 65535) {
                throw new IllegalArgumentException(C0000a.m7d("unexpected port: ", i2));
            }
            this.f24866e = i2;
            return this;
        }

        /* renamed from: f */
        public Builder m13919f() {
            int size = this.f24867f.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f24867f.set(i2, HttpUrl.m13899b(this.f24867f.get(i2), okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, false, true));
            }
            List<String> list = this.f24868g;
            if (list != null) {
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    String str = this.f24868g.get(i3);
                    if (str != null) {
                        this.f24868g.set(i3, HttpUrl.m13899b(str, okhttp3.HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true));
                    }
                }
            }
            String str2 = this.f24869h;
            if (str2 != null) {
                this.f24869h = HttpUrl.m13899b(str2, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET_URI, true, false, false);
            }
            return this;
        }

        /* renamed from: g */
        public Builder m13920g(String str) {
            if (str.equalsIgnoreCase("http")) {
                this.f24862a = "http";
            } else {
                if (!str.equalsIgnoreCase("https")) {
                    throw new IllegalArgumentException(C0000a.m14k("unexpected scheme: ", str));
                }
                this.f24862a = "https";
            }
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f24862a);
            sb.append("://");
            if (!this.f24863b.isEmpty() || !this.f24864c.isEmpty()) {
                sb.append(this.f24863b);
                if (!this.f24864c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f24864c);
                }
                sb.append('@');
            }
            if (this.f24865d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f24865d);
                sb.append(']');
            } else {
                sb.append(this.f24865d);
            }
            int i2 = this.f24866e;
            if (i2 == -1) {
                i2 = HttpUrl.m13901d(this.f24862a);
            }
            if (i2 != HttpUrl.m13901d(this.f24862a)) {
                sb.append(':');
                sb.append(i2);
            }
            List<String> list = this.f24867f;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                sb.append(JsonPointer.SEPARATOR);
                sb.append(list.get(i3));
            }
            if (this.f24868g != null) {
                sb.append('?');
                HttpUrl.m13903j(sb, this.f24868g);
            }
            if (this.f24869h != null) {
                sb.append('#');
                sb.append(this.f24869h);
            }
            return sb.toString();
        }
    }

    public HttpUrl(Builder builder, C24661 c24661) {
        this.f24852a = builder.f24862a;
        this.f24853b = m13905m(builder.f24863b, false);
        this.f24854c = m13905m(builder.f24864c, false);
        this.f24855d = builder.f24865d;
        int i2 = builder.f24866e;
        this.f24856e = i2 == -1 ? m13901d(builder.f24862a) : i2;
        this.f24857f = m13912n(builder.f24867f, false);
        List<String> list = builder.f24868g;
        this.f24858g = list != null ? m13912n(list, true) : null;
        String str = builder.f24869h;
        this.f24859h = str != null ? m13904l(str, 0, str.length(), false) : null;
        this.f24860i = builder.toString();
    }

    /* renamed from: a */
    public static String m13898a(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3) {
        int i4 = i2;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z3) || str2.indexOf(codePointAt) != -1 || ((codePointAt == 37 && !z) || (codePointAt == 43 && z2)))) {
                Buffer buffer = new Buffer();
                buffer.m34522O0(str, i2, i4);
                Buffer buffer2 = null;
                while (i4 < i3) {
                    int codePointAt2 = str.codePointAt(i4);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z2) {
                            buffer.m34516D0(z ? "+" : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z3) || str2.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && !z))) {
                            if (buffer2 == null) {
                                buffer2 = new Buffer();
                            }
                            buffer2.m34526R0(codePointAt2);
                            while (!buffer2.mo34529V()) {
                                int readByte = buffer2.readByte() & 255;
                                buffer.m34524Q(37);
                                char[] cArr = f24851j;
                                buffer.m34524Q(cArr[(readByte >> 4) & 15]);
                                buffer.m34524Q(cArr[readByte & 15]);
                            }
                        } else {
                            buffer.m34526R0(codePointAt2);
                        }
                    }
                    i4 += Character.charCount(codePointAt2);
                }
                return buffer.m34553m();
            }
            i4 += Character.charCount(codePointAt);
        }
        return str.substring(i2, i3);
    }

    /* renamed from: b */
    public static String m13899b(String str, String str2, boolean z, boolean z2, boolean z3) {
        return m13898a(str, 0, str.length(), str2, z, z2, z3);
    }

    /* renamed from: c */
    public static int m13900c(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (c2 < 'a' || c2 > 'f') {
            c3 = 'A';
            if (c2 < 'A' || c2 > 'F') {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    /* renamed from: d */
    public static int m13901d(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: e */
    public static int m13902e(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    /* renamed from: j */
    public static void m13903j(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = list.get(i2);
            String str2 = list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* renamed from: l */
    public static String m13904l(String str, int i2, int i3, boolean z) {
        int i4;
        int i5 = i2;
        while (i5 < i3) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z)) {
                Buffer buffer = new Buffer();
                buffer.m34522O0(str, i2, i5);
                while (i5 < i3) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt != 37 || (i4 = i5 + 2) >= i3) {
                        if (codePointAt == 43 && z) {
                            buffer.m34524Q(32);
                        }
                        buffer.m34526R0(codePointAt);
                    } else {
                        int m13900c = m13900c(str.charAt(i5 + 1));
                        int m13900c2 = m13900c(str.charAt(i4));
                        if (m13900c != -1 && m13900c2 != -1) {
                            buffer.m34524Q((m13900c << 4) + m13900c2);
                            i5 = i4;
                        }
                        buffer.m34526R0(codePointAt);
                    }
                    i5 += Character.charCount(codePointAt);
                }
                return buffer.m34553m();
            }
            i5++;
        }
        return str.substring(i2, i3);
    }

    /* renamed from: m */
    public static String m13905m(String str, boolean z) {
        return m13904l(str, 0, str.length(), z);
    }

    /* renamed from: o */
    public static List<String> m13906o(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i2, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && ((HttpUrl) obj).f24860i.equals(this.f24860i);
    }

    /* renamed from: f */
    public String m13907f() {
        if (this.f24854c.isEmpty()) {
            return "";
        }
        return this.f24860i.substring(this.f24860i.indexOf(58, this.f24852a.length() + 3) + 1, this.f24860i.indexOf(64));
    }

    /* renamed from: g */
    public List<String> m13908g() {
        int indexOf = this.f24860i.indexOf(47, this.f24852a.length() + 3);
        String str = this.f24860i;
        int m13902e = m13902e(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < m13902e) {
            int i2 = indexOf + 1;
            int m13902e2 = m13902e(this.f24860i, i2, m13902e, "/");
            arrayList.add(this.f24860i.substring(i2, m13902e2));
            indexOf = m13902e2;
        }
        return arrayList;
    }

    /* renamed from: h */
    public String m13909h() {
        if (this.f24858g == null) {
            return null;
        }
        int indexOf = this.f24860i.indexOf(63) + 1;
        String str = this.f24860i;
        return this.f24860i.substring(indexOf, m13902e(str, indexOf + 1, str.length(), "#"));
    }

    public int hashCode() {
        return this.f24860i.hashCode();
    }

    /* renamed from: i */
    public String m13910i() {
        if (this.f24853b.isEmpty()) {
            return "";
        }
        int length = this.f24852a.length() + 3;
        String str = this.f24860i;
        return this.f24860i.substring(length, m13902e(str, length, str.length(), ":@"));
    }

    /* renamed from: k */
    public Builder m13911k() {
        Builder builder = new Builder();
        builder.f24862a = this.f24852a;
        builder.f24863b = m13910i();
        builder.f24864c = m13907f();
        builder.f24865d = this.f24855d;
        builder.f24866e = this.f24856e != m13901d(this.f24852a) ? this.f24856e : -1;
        builder.f24867f.clear();
        builder.f24867f.addAll(m13908g());
        builder.m13916c(m13909h());
        builder.f24869h = this.f24859h == null ? null : this.f24860i.substring(this.f24860i.indexOf(35) + 1);
        return builder;
    }

    /* renamed from: n */
    public final List<String> m13912n(List<String> list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            arrayList.add(next != null ? m13904l(next, 0, next.length(), z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: p */
    public URI m13913p() {
        try {
            Builder m13911k = m13911k();
            m13911k.m13919f();
            return new URI(m13911k.toString());
        } catch (URISyntaxException unused) {
            StringBuilder m24u = C0000a.m24u("not valid as a java.net.URI: ");
            m24u.append(this.f24860i);
            throw new IllegalStateException(m24u.toString());
        }
    }

    public String toString() {
        return this.f24860i;
    }
}
