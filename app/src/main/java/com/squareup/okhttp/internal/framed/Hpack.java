package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.internal.framed.Huffman;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.KotlinVersion;
import okio.BufferedSource;
import okio.ByteString;
import p000a.C0000a;

/* loaded from: classes2.dex */
final class Hpack {

    /* renamed from: a */
    public static final Header[] f25083a;

    /* renamed from: b */
    public static final Map<ByteString, Integer> f25084b;

    public static final class Reader {

        /* renamed from: a */
        public final List<Header> f25085a;

        /* renamed from: b */
        public final BufferedSource f25086b;

        /* renamed from: c */
        public int f25087c;

        /* renamed from: d */
        public int f25088d;

        /* renamed from: e */
        public Header[] f25089e;

        /* renamed from: f */
        public int f25090f;

        /* renamed from: g */
        public int f25091g;

        /* renamed from: h */
        public int f25092h;

        /* renamed from: a */
        public final void m13979a() {
            this.f25085a.clear();
            Arrays.fill(this.f25089e, (Object) null);
            this.f25090f = this.f25089e.length - 1;
            this.f25091g = 0;
            this.f25092h = 0;
        }

        /* renamed from: b */
        public final int m13980b(int i2) {
            return this.f25090f + 1 + i2;
        }

        /* renamed from: c */
        public final int m13981c(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.f25089e.length;
                while (true) {
                    length--;
                    i3 = this.f25090f;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    Header[] headerArr = this.f25089e;
                    i2 -= headerArr[length].f25077c;
                    this.f25092h -= headerArr[length].f25077c;
                    this.f25091g--;
                    i4++;
                }
                Header[] headerArr2 = this.f25089e;
                System.arraycopy(headerArr2, i3 + 1, headerArr2, i3 + 1 + i4, this.f25091g);
                this.f25090f += i4;
            }
            return i4;
        }

        /* renamed from: d */
        public final ByteString m13982d(int i2) {
            return i2 >= 0 && i2 <= Hpack.f25083a.length - 1 ? Hpack.f25083a[i2].f25075a : this.f25089e[m13980b(i2 - Hpack.f25083a.length)].f25075a;
        }

        /* renamed from: e */
        public final void m13983e(int i2, Header header) {
            this.f25085a.add(header);
            int i3 = header.f25077c;
            if (i2 != -1) {
                i3 -= this.f25089e[(this.f25090f + 1) + i2].f25077c;
            }
            int i4 = this.f25088d;
            if (i3 > i4) {
                m13979a();
                return;
            }
            int m13981c = m13981c((this.f25092h + i3) - i4);
            if (i2 == -1) {
                int i5 = this.f25091g + 1;
                Header[] headerArr = this.f25089e;
                if (i5 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.f25090f = this.f25089e.length - 1;
                    this.f25089e = headerArr2;
                }
                int i6 = this.f25090f;
                this.f25090f = i6 - 1;
                this.f25089e[i6] = header;
                this.f25091g++;
            } else {
                this.f25089e[this.f25090f + 1 + i2 + m13981c + i2] = header;
            }
            this.f25092h += i3;
        }

        /* renamed from: f */
        public ByteString m13984f() throws IOException {
            int readByte = this.f25086b.readByte() & 255;
            boolean z = (readByte & 128) == 128;
            int m13985g = m13985g(readByte, 127);
            if (!z) {
                return this.f25086b.mo34518G(m13985g);
            }
            Huffman huffman = Huffman.f25113d;
            byte[] mo34523P0 = this.f25086b.mo34523P0(m13985g);
            Objects.requireNonNull(huffman);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Huffman.Node node = huffman.f25114a;
            int i2 = 0;
            int i3 = 0;
            for (byte b : mo34523P0) {
                i2 = (i2 << 8) | (b & 255);
                i3 += 8;
                while (i3 >= 8) {
                    int i4 = i3 - 8;
                    node = node.f25115a[(i2 >>> i4) & KotlinVersion.MAX_COMPONENT_VALUE];
                    if (node.f25115a == null) {
                        byteArrayOutputStream.write(node.f25116b);
                        i3 -= node.f25117c;
                        node = huffman.f25114a;
                    } else {
                        i3 = i4;
                    }
                }
            }
            while (i3 > 0) {
                Huffman.Node node2 = node.f25115a[(i2 << (8 - i3)) & KotlinVersion.MAX_COMPONENT_VALUE];
                if (node2.f25115a != null || node2.f25117c > i3) {
                    break;
                }
                byteArrayOutputStream.write(node2.f25116b);
                i3 -= node2.f25117c;
                node = huffman.f25114a;
            }
            return ByteString.m34573i(byteArrayOutputStream.toByteArray());
        }

        /* renamed from: g */
        public int m13985g(int i2, int i3) throws IOException {
            int i4 = i2 & i3;
            if (i4 < i3) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                int readByte = this.f25086b.readByte() & 255;
                if ((readByte & 128) == 0) {
                    return i3 + (readByte << i5);
                }
                i3 += (readByte & 127) << i5;
                i5 += 7;
            }
        }
    }

    public static final class Writer {
    }

    static {
        Header header = new Header(Header.f25072h, "");
        int i2 = 0;
        ByteString byteString = Header.f25069e;
        ByteString byteString2 = Header.f25070f;
        ByteString byteString3 = Header.f25071g;
        ByteString byteString4 = Header.f25068d;
        Header[] headerArr = {header, new Header(byteString, "GET"), new Header(byteString, "POST"), new Header(byteString2, "/"), new Header(byteString2, "/index.html"), new Header(byteString3, "http"), new Header(byteString3, "https"), new Header(byteString4, "200"), new Header(byteString4, "204"), new Header(byteString4, "206"), new Header(byteString4, "304"), new Header(byteString4, "400"), new Header(byteString4, "404"), new Header(byteString4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        f25083a = headerArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        while (true) {
            Header[] headerArr2 = f25083a;
            if (i2 >= headerArr2.length) {
                f25084b = Collections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(headerArr2[i2].f25075a)) {
                    linkedHashMap.put(headerArr2[i2].f25075a, Integer.valueOf(i2));
                }
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static ByteString m13978a(ByteString byteString) throws IOException {
        int mo34576d = byteString.mo34576d();
        for (int i2 = 0; i2 < mo34576d; i2++) {
            byte mo34579h = byteString.mo34579h(i2);
            if (mo34579h >= 65 && mo34579h <= 90) {
                StringBuilder m24u = C0000a.m24u("PROTOCOL_ERROR response malformed: mixed case name: ");
                m24u.append(byteString.m34586p());
                throw new IOException(m24u.toString());
            }
        }
        return byteString;
    }
}
