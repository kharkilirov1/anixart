package io.grpc.okhttp.internal.framed;

import androidx.recyclerview.widget.RecyclerView;
import io.grpc.okhttp.internal.framed.Huffman;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.KotlinVersion;
import okio.Buffer;
import okio.Buffer$outputStream$1;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import p000a.C0000a;

/* loaded from: classes3.dex */
final class Hpack {

    /* renamed from: a */
    public static final ByteString f59432a = ByteString.m34572c(":");

    /* renamed from: b */
    public static final Header[] f59433b;

    /* renamed from: c */
    public static final Map<ByteString, Integer> f59434c;

    public static final class Reader {

        /* renamed from: b */
        public final BufferedSource f59436b;

        /* renamed from: c */
        public int f59437c;

        /* renamed from: d */
        public int f59438d;

        /* renamed from: a */
        public final List<Header> f59435a = new ArrayList();

        /* renamed from: e */
        public Header[] f59439e = new Header[8];

        /* renamed from: f */
        public int f59440f = 7;

        /* renamed from: g */
        public int f59441g = 0;

        /* renamed from: h */
        public int f59442h = 0;

        public Reader(int i2, Source source) {
            this.f59437c = i2;
            this.f59438d = i2;
            this.f59436b = Okio.m34602d(source);
        }

        /* renamed from: a */
        public final void m31299a() {
            Arrays.fill(this.f59439e, (Object) null);
            this.f59440f = this.f59439e.length - 1;
            this.f59441g = 0;
            this.f59442h = 0;
        }

        /* renamed from: b */
        public final int m31300b(int i2) {
            return this.f59440f + 1 + i2;
        }

        /* renamed from: c */
        public final int m31301c(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.f59439e.length;
                while (true) {
                    length--;
                    i3 = this.f59440f;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    Header[] headerArr = this.f59439e;
                    i2 -= headerArr[length].f59429c;
                    this.f59442h -= headerArr[length].f59429c;
                    this.f59441g--;
                    i4++;
                }
                Header[] headerArr2 = this.f59439e;
                System.arraycopy(headerArr2, i3 + 1, headerArr2, i3 + 1 + i4, this.f59441g);
                this.f59440f += i4;
            }
            return i4;
        }

        /* renamed from: d */
        public final ByteString m31302d(int i2) throws IOException {
            if (i2 >= 0 && i2 <= Hpack.f59433b.length + (-1)) {
                return Hpack.f59433b[i2].f59427a;
            }
            int m31300b = m31300b(i2 - Hpack.f59433b.length);
            if (m31300b >= 0) {
                Header[] headerArr = this.f59439e;
                if (m31300b < headerArr.length) {
                    return headerArr[m31300b].f59427a;
                }
            }
            StringBuilder m24u = C0000a.m24u("Header index too large ");
            m24u.append(i2 + 1);
            throw new IOException(m24u.toString());
        }

        /* renamed from: e */
        public final void m31303e(int i2, Header header) {
            this.f59435a.add(header);
            int i3 = header.f59429c;
            if (i2 != -1) {
                i3 -= this.f59439e[(this.f59440f + 1) + i2].f59429c;
            }
            int i4 = this.f59438d;
            if (i3 > i4) {
                m31299a();
                return;
            }
            int m31301c = m31301c((this.f59442h + i3) - i4);
            if (i2 == -1) {
                int i5 = this.f59441g + 1;
                Header[] headerArr = this.f59439e;
                if (i5 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.f59440f = this.f59439e.length - 1;
                    this.f59439e = headerArr2;
                }
                int i6 = this.f59440f;
                this.f59440f = i6 - 1;
                this.f59439e[i6] = header;
                this.f59441g++;
            } else {
                this.f59439e[this.f59440f + 1 + i2 + m31301c + i2] = header;
            }
            this.f59442h += i3;
        }

        /* renamed from: f */
        public ByteString m31304f() throws IOException {
            int readByte = this.f59436b.readByte() & 255;
            boolean z = (readByte & 128) == 128;
            int m31305g = m31305g(readByte, 127);
            if (!z) {
                return this.f59436b.mo34518G(m31305g);
            }
            Huffman huffman = Huffman.f59473d;
            byte[] mo34523P0 = this.f59436b.mo34523P0(m31305g);
            Objects.requireNonNull(huffman);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Huffman.Node node = huffman.f59474a;
            int i2 = 0;
            int i3 = 0;
            for (byte b : mo34523P0) {
                i2 = (i2 << 8) | (b & 255);
                i3 += 8;
                while (i3 >= 8) {
                    int i4 = i3 - 8;
                    node = node.f59475a[(i2 >>> i4) & KotlinVersion.MAX_COMPONENT_VALUE];
                    if (node.f59475a == null) {
                        byteArrayOutputStream.write(node.f59476b);
                        i3 -= node.f59477c;
                        node = huffman.f59474a;
                    } else {
                        i3 = i4;
                    }
                }
            }
            while (i3 > 0) {
                Huffman.Node node2 = node.f59475a[(i2 << (8 - i3)) & KotlinVersion.MAX_COMPONENT_VALUE];
                if (node2.f59475a != null || node2.f59477c > i3) {
                    break;
                }
                byteArrayOutputStream.write(node2.f59476b);
                i3 -= node2.f59477c;
                node = huffman.f59474a;
            }
            return ByteString.m34573i(byteArrayOutputStream.toByteArray());
        }

        /* renamed from: g */
        public int m31305g(int i2, int i3) throws IOException {
            int i4 = i2 & i3;
            if (i4 < i3) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                int readByte = this.f59436b.readByte() & 255;
                if ((readByte & 128) == 0) {
                    return i3 + (readByte << i5);
                }
                i3 += (readByte & 127) << i5;
                i5 += 7;
            }
        }
    }

    public static final class Writer {

        /* renamed from: a */
        public final Buffer f59443a;

        /* renamed from: f */
        public int f59448f;

        /* renamed from: h */
        public int f59450h;

        /* renamed from: c */
        public int f59445c = Integer.MAX_VALUE;

        /* renamed from: e */
        public Header[] f59447e = new Header[8];

        /* renamed from: g */
        public int f59449g = 7;

        /* renamed from: d */
        public int f59446d = RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT;

        /* renamed from: b */
        public boolean f59444b = false;

        public Writer(Buffer buffer) {
            this.f59443a = buffer;
        }

        /* renamed from: a */
        public final void m31306a(Header header) {
            int i2;
            int i3 = header.f59429c;
            int i4 = this.f59446d;
            if (i3 > i4) {
                Arrays.fill(this.f59447e, (Object) null);
                this.f59449g = this.f59447e.length - 1;
                this.f59448f = 0;
                this.f59450h = 0;
                return;
            }
            int i5 = (this.f59450h + i3) - i4;
            if (i5 > 0) {
                int length = this.f59447e.length - 1;
                int i6 = 0;
                while (true) {
                    i2 = this.f59449g;
                    if (length < i2 || i5 <= 0) {
                        break;
                    }
                    Header[] headerArr = this.f59447e;
                    i5 -= headerArr[length].f59429c;
                    this.f59450h -= headerArr[length].f59429c;
                    this.f59448f--;
                    i6++;
                    length--;
                }
                Header[] headerArr2 = this.f59447e;
                int i7 = i2 + 1;
                System.arraycopy(headerArr2, i7, headerArr2, i7 + i6, this.f59448f);
                this.f59449g += i6;
            }
            int i8 = this.f59448f + 1;
            Header[] headerArr3 = this.f59447e;
            if (i8 > headerArr3.length) {
                Header[] headerArr4 = new Header[headerArr3.length * 2];
                System.arraycopy(headerArr3, 0, headerArr4, headerArr3.length, headerArr3.length);
                this.f59449g = this.f59447e.length - 1;
                this.f59447e = headerArr4;
            }
            int i9 = this.f59449g;
            this.f59449g = i9 - 1;
            this.f59447e[i9] = header;
            this.f59448f++;
            this.f59450h += i3;
        }

        /* renamed from: b */
        public void m31307b(ByteString byteString) throws IOException {
            if (this.f59444b) {
                Huffman huffman = Huffman.f59473d;
                byte[] mo34585o = byteString.mo34585o();
                Objects.requireNonNull(huffman);
                long j2 = 0;
                long j3 = 0;
                for (byte b : mo34585o) {
                    j3 += Huffman.f59472c[b & 255];
                }
                if (((int) ((j3 + 7) >> 3)) < byteString.mo34576d()) {
                    Buffer buffer = new Buffer();
                    Huffman huffman2 = Huffman.f59473d;
                    byte[] mo34585o2 = byteString.mo34585o();
                    Buffer$outputStream$1 buffer$outputStream$1 = new Buffer$outputStream$1(buffer);
                    Objects.requireNonNull(huffman2);
                    int i2 = 0;
                    for (byte b2 : mo34585o2) {
                        int i3 = b2 & 255;
                        int i4 = Huffman.f59471b[i3];
                        byte b3 = Huffman.f59472c[i3];
                        j2 = (j2 << b3) | i4;
                        i2 += b3;
                        while (i2 >= 8) {
                            i2 -= 8;
                            buffer$outputStream$1.write((int) (j2 >> i2));
                        }
                    }
                    if (i2 > 0) {
                        buffer$outputStream$1.write((int) ((KotlinVersion.MAX_COMPONENT_VALUE >>> i2) | (j2 << (8 - i2))));
                    }
                    ByteString mo34515B0 = buffer.mo34515B0();
                    m31308c(mo34515B0.mo34576d(), 127, 128);
                    this.f59443a.m34566v(mo34515B0);
                    return;
                }
            }
            m31308c(byteString.mo34576d(), 127, 0);
            this.f59443a.m34566v(byteString);
        }

        /* renamed from: c */
        public void m31308c(int i2, int i3, int i4) throws IOException {
            if (i2 < i3) {
                this.f59443a.m34524Q(i2 | i4);
                return;
            }
            this.f59443a.m34524Q(i4 | i3);
            int i5 = i2 - i3;
            while (i5 >= 128) {
                this.f59443a.m34524Q(128 | (i5 & 127));
                i5 >>>= 7;
            }
            this.f59443a.m34524Q(i5);
        }
    }

    static {
        Header header = new Header(Header.f59426h, "");
        int i2 = 0;
        ByteString byteString = Header.f59423e;
        ByteString byteString2 = Header.f59424f;
        ByteString byteString3 = Header.f59425g;
        ByteString byteString4 = Header.f59422d;
        Header[] headerArr = {header, new Header(byteString, "GET"), new Header(byteString, "POST"), new Header(byteString2, "/"), new Header(byteString2, "/index.html"), new Header(byteString3, "http"), new Header(byteString3, "https"), new Header(byteString4, "200"), new Header(byteString4, "204"), new Header(byteString4, "206"), new Header(byteString4, "304"), new Header(byteString4, "400"), new Header(byteString4, "404"), new Header(byteString4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        f59433b = headerArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        while (true) {
            Header[] headerArr2 = f59433b;
            if (i2 >= headerArr2.length) {
                f59434c = Collections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(headerArr2[i2].f59427a)) {
                    linkedHashMap.put(headerArr2[i2].f59427a, Integer.valueOf(i2));
                }
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static ByteString m31298a(ByteString byteString) throws IOException {
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
