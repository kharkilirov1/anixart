package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.impl.b00;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.yy */
/* loaded from: classes3.dex */
public final class C6096yy {

    /* renamed from: a */
    @NotNull
    private static final C5096fy[] f56960a;

    /* renamed from: b */
    @NotNull
    private static final Map<ByteString, Integer> f56961b;

    /* renamed from: c */
    public static final /* synthetic */ int f56962c = 0;

    /* renamed from: com.yandex.mobile.ads.impl.yy$a */
    public static final class a {

        /* renamed from: a */
        private final int f56963a;

        /* renamed from: b */
        private int f56964b;

        /* renamed from: c */
        @NotNull
        private final ArrayList f56965c;

        /* renamed from: d */
        @NotNull
        private final BufferedSource f56966d;

        /* renamed from: e */
        @JvmField
        @NotNull
        public C5096fy[] f56967e;

        /* renamed from: f */
        private int f56968f;

        /* renamed from: g */
        @JvmField
        public int f56969g;

        /* renamed from: h */
        @JvmField
        public int f56970h;

        public /* synthetic */ a(b00.C4834b c4834b) {
            this(c4834b, RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT);
        }

        /* renamed from: b */
        private final ByteString m29990b(int i2) throws IOException {
            if (i2 >= 0 && i2 <= C6096yy.m29987b().length - 1) {
                return C6096yy.m29987b()[i2].f50456a;
            }
            int length = this.f56968f + 1 + (i2 - C6096yy.m29987b().length);
            if (length >= 0) {
                C5096fy[] c5096fyArr = this.f56967e;
                if (length < c5096fyArr.length) {
                    C5096fy c5096fy = c5096fyArr[length];
                    Intrinsics.m32176e(c5096fy);
                    return c5096fy.f50456a;
                }
            }
            StringBuilder m26356a = l60.m26356a("Header index too large ");
            m26356a.append(i2 + 1);
            throw new IOException(m26356a.toString());
        }

        @NotNull
        /* renamed from: a */
        public final List<C5096fy> m29992a() {
            List<C5096fy> m32027j0 = CollectionsKt.m32027j0(this.f56965c);
            this.f56965c.clear();
            return m32027j0;
        }

        /* renamed from: c */
        public final void m29994c() throws IOException {
            while (!this.f56966d.mo34529V()) {
                int m28483a = t91.m28483a(this.f56966d.readByte());
                if (m28483a == 128) {
                    throw new IOException("index == 0");
                }
                boolean z = false;
                if ((m28483a & 128) == 128) {
                    int m29991a = m29991a(m28483a, 127) - 1;
                    if (m29991a >= 0 && m29991a <= C6096yy.m29987b().length - 1) {
                        z = true;
                    }
                    if (!z) {
                        int length = this.f56968f + 1 + (m29991a - C6096yy.m29987b().length);
                        if (length >= 0) {
                            C5096fy[] c5096fyArr = this.f56967e;
                            if (length < c5096fyArr.length) {
                                ArrayList arrayList = this.f56965c;
                                C5096fy c5096fy = c5096fyArr[length];
                                Intrinsics.m32176e(c5096fy);
                                arrayList.add(c5096fy);
                            }
                        }
                        StringBuilder m26356a = l60.m26356a("Header index too large ");
                        m26356a.append(m29991a + 1);
                        throw new IOException(m26356a.toString());
                    }
                    this.f56965c.add(C6096yy.m29987b()[m29991a]);
                } else if (m28483a == 64) {
                    int i2 = C6096yy.f56962c;
                    m29989a(new C5096fy(C6096yy.m29986a(m29993b()), m29993b()));
                } else if ((m28483a & 64) == 64) {
                    m29989a(new C5096fy(m29990b(m29991a(m28483a, 63) - 1), m29993b()));
                } else if ((m28483a & 32) == 32) {
                    int m29991a2 = m29991a(m28483a, 31);
                    this.f56964b = m29991a2;
                    if (m29991a2 < 0 || m29991a2 > this.f56963a) {
                        StringBuilder m26356a2 = l60.m26356a("Invalid dynamic table size update ");
                        m26356a2.append(this.f56964b);
                        throw new IOException(m26356a2.toString());
                    }
                    int i3 = this.f56970h;
                    if (m29991a2 < i3) {
                        if (m29991a2 == 0) {
                            ArraysKt.m31974x(this.f56967e, null, 0, 0, 6, null);
                            this.f56968f = this.f56967e.length - 1;
                            this.f56969g = 0;
                            this.f56970h = 0;
                        } else {
                            m29988a(i3 - m29991a2);
                        }
                    }
                } else if (m28483a == 16 || m28483a == 0) {
                    int i4 = C6096yy.f56962c;
                    this.f56965c.add(new C5096fy(C6096yy.m29986a(m29993b()), m29993b()));
                } else {
                    this.f56965c.add(new C5096fy(m29990b(m29991a(m28483a, 15) - 1), m29993b()));
                }
            }
        }

        @JvmOverloads
        public a(@NotNull b00.C4834b source, int i2) {
            Intrinsics.m32179h(source, "source");
            this.f56963a = RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT;
            this.f56964b = i2;
            this.f56965c = new ArrayList();
            this.f56966d = Okio.m34602d(source);
            this.f56967e = new C5096fy[8];
            this.f56968f = 7;
        }

        /* renamed from: a */
        private final int m29988a(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.f56967e.length;
                while (true) {
                    length--;
                    i3 = this.f56968f;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    C5096fy c5096fy = this.f56967e[length];
                    Intrinsics.m32176e(c5096fy);
                    int i5 = c5096fy.f50458c;
                    i2 -= i5;
                    this.f56970h -= i5;
                    this.f56969g--;
                    i4++;
                }
                C5096fy[] c5096fyArr = this.f56967e;
                int i6 = i3 + 1;
                System.arraycopy(c5096fyArr, i6, c5096fyArr, i6 + i4, this.f56969g);
                this.f56968f += i4;
            }
            return i4;
        }

        @NotNull
        /* renamed from: b */
        public final ByteString m29993b() throws IOException {
            int m28483a = t91.m28483a(this.f56966d.readByte());
            boolean z = (m28483a & 128) == 128;
            long m29991a = m29991a(m28483a, 127);
            if (z) {
                Buffer buffer = new Buffer();
                int i2 = v00.f55715d;
                v00.m29153a(this.f56966d, m29991a, buffer);
                return buffer.mo34515B0();
            }
            return this.f56966d.mo34518G(m29991a);
        }

        /* renamed from: a */
        private final void m29989a(C5096fy c5096fy) {
            this.f56965c.add(c5096fy);
            int i2 = c5096fy.f50458c;
            int i3 = this.f56964b;
            if (i2 > i3) {
                ArraysKt.m31974x(this.f56967e, null, 0, 0, 6, null);
                this.f56968f = this.f56967e.length - 1;
                this.f56969g = 0;
                this.f56970h = 0;
                return;
            }
            m29988a((this.f56970h + i2) - i3);
            int i4 = this.f56969g + 1;
            C5096fy[] c5096fyArr = this.f56967e;
            if (i4 > c5096fyArr.length) {
                C5096fy[] c5096fyArr2 = new C5096fy[c5096fyArr.length * 2];
                System.arraycopy(c5096fyArr, 0, c5096fyArr2, c5096fyArr.length, c5096fyArr.length);
                this.f56968f = this.f56967e.length - 1;
                this.f56967e = c5096fyArr2;
            }
            int i5 = this.f56968f;
            this.f56968f = i5 - 1;
            this.f56967e[i5] = c5096fy;
            this.f56969g++;
            this.f56970h += i2;
        }

        /* renamed from: a */
        public final int m29991a(int i2, int i3) throws IOException {
            int i4 = i2 & i3;
            if (i4 < i3) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                int m28483a = t91.m28483a(this.f56966d.readByte());
                if ((m28483a & 128) == 0) {
                    return i3 + (m28483a << i5);
                }
                i3 += (m28483a & 127) << i5;
                i5 += 7;
            }
        }
    }

    static {
        C5096fy c5096fy = new C5096fy(C5096fy.f50455i, "");
        ByteString byteString = C5096fy.f50452f;
        ByteString byteString2 = C5096fy.f50453g;
        ByteString byteString3 = C5096fy.f50454h;
        ByteString byteString4 = C5096fy.f50451e;
        f56960a = new C5096fy[]{c5096fy, new C5096fy(byteString, "GET"), new C5096fy(byteString, "POST"), new C5096fy(byteString2, "/"), new C5096fy(byteString2, "/index.html"), new C5096fy(byteString3, "http"), new C5096fy(byteString3, "https"), new C5096fy(byteString4, "200"), new C5096fy(byteString4, "204"), new C5096fy(byteString4, "206"), new C5096fy(byteString4, "304"), new C5096fy(byteString4, "400"), new C5096fy(byteString4, "404"), new C5096fy(byteString4, "500"), new C5096fy("accept-charset", ""), new C5096fy("accept-encoding", "gzip, deflate"), new C5096fy("accept-language", ""), new C5096fy("accept-ranges", ""), new C5096fy("accept", ""), new C5096fy("access-control-allow-origin", ""), new C5096fy("age", ""), new C5096fy("allow", ""), new C5096fy("authorization", ""), new C5096fy("cache-control", ""), new C5096fy("content-disposition", ""), new C5096fy("content-encoding", ""), new C5096fy("content-language", ""), new C5096fy("content-length", ""), new C5096fy("content-location", ""), new C5096fy("content-range", ""), new C5096fy("content-type", ""), new C5096fy("cookie", ""), new C5096fy("date", ""), new C5096fy("etag", ""), new C5096fy("expect", ""), new C5096fy("expires", ""), new C5096fy("from", ""), new C5096fy("host", ""), new C5096fy("if-match", ""), new C5096fy("if-modified-since", ""), new C5096fy("if-none-match", ""), new C5096fy("if-range", ""), new C5096fy("if-unmodified-since", ""), new C5096fy("last-modified", ""), new C5096fy("link", ""), new C5096fy("location", ""), new C5096fy("max-forwards", ""), new C5096fy("proxy-authenticate", ""), new C5096fy("proxy-authorization", ""), new C5096fy("range", ""), new C5096fy("referer", ""), new C5096fy("refresh", ""), new C5096fy("retry-after", ""), new C5096fy("server", ""), new C5096fy("set-cookie", ""), new C5096fy("strict-transport-security", ""), new C5096fy("transfer-encoding", ""), new C5096fy("user-agent", ""), new C5096fy("vary", ""), new C5096fy("via", ""), new C5096fy("www-authenticate", "")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i2 = 0; i2 < 61; i2++) {
            C5096fy[] c5096fyArr = f56960a;
            if (!linkedHashMap.containsKey(c5096fyArr[i2].f50456a)) {
                linkedHashMap.put(c5096fyArr[i2].f50456a, Integer.valueOf(i2));
            }
        }
        Map<ByteString, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.m32178g(unmodifiableMap, "unmodifiableMap(result)");
        f56961b = unmodifiableMap;
    }

    @NotNull
    /* renamed from: a */
    public static Map m29985a() {
        return f56961b;
    }

    @NotNull
    /* renamed from: b */
    public static C5096fy[] m29987b() {
        return f56960a;
    }

    @NotNull
    /* renamed from: a */
    public static ByteString m29986a(@NotNull ByteString name) throws IOException {
        Intrinsics.m32179h(name, "name");
        int mo34576d = name.mo34576d();
        for (int i2 = 0; i2 < mo34576d; i2++) {
            byte mo34579h = name.mo34579h(i2);
            if (65 <= mo34579h && mo34579h <= 90) {
                StringBuilder m26356a = l60.m26356a("PROTOCOL_ERROR response malformed: mixed case name: ");
                m26356a.append(name.m34586p());
                throw new IOException(m26356a.toString());
            }
        }
        return name;
    }

    /* renamed from: com.yandex.mobile.ads.impl.yy$b */
    public static final class b {

        /* renamed from: a */
        private final boolean f56971a;

        /* renamed from: b */
        @NotNull
        private final Buffer f56972b;

        /* renamed from: c */
        private int f56973c;

        /* renamed from: d */
        private boolean f56974d;

        /* renamed from: e */
        @JvmField
        public int f56975e;

        /* renamed from: f */
        @JvmField
        @NotNull
        public C5096fy[] f56976f;

        /* renamed from: g */
        private int f56977g;

        /* renamed from: h */
        @JvmField
        public int f56978h;

        /* renamed from: i */
        @JvmField
        public int f56979i;

        @JvmOverloads
        public b(int i2, boolean z, @NotNull Buffer out) {
            Intrinsics.m32179h(out, "out");
            this.f56971a = z;
            this.f56972b = out;
            this.f56973c = Integer.MAX_VALUE;
            this.f56975e = i2;
            this.f56976f = new C5096fy[8];
            this.f56977g = 7;
        }

        /* renamed from: a */
        private final void m29995a(int i2) {
            int i3;
            if (i2 > 0) {
                int length = this.f56976f.length - 1;
                int i4 = 0;
                while (true) {
                    i3 = this.f56977g;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    C5096fy c5096fy = this.f56976f[length];
                    Intrinsics.m32176e(c5096fy);
                    i2 -= c5096fy.f50458c;
                    int i5 = this.f56979i;
                    C5096fy c5096fy2 = this.f56976f[length];
                    Intrinsics.m32176e(c5096fy2);
                    this.f56979i = i5 - c5096fy2.f50458c;
                    this.f56978h--;
                    i4++;
                    length--;
                }
                C5096fy[] c5096fyArr = this.f56976f;
                int i6 = i3 + 1;
                System.arraycopy(c5096fyArr, i6, c5096fyArr, i6 + i4, this.f56978h);
                C5096fy[] c5096fyArr2 = this.f56976f;
                int i7 = this.f56977g + 1;
                Arrays.fill(c5096fyArr2, i7, i7 + i4, (Object) null);
                this.f56977g += i4;
            }
        }

        /* renamed from: b */
        public final void m30000b(int i2) {
            int min = Math.min(i2, 16384);
            int i3 = this.f56975e;
            if (i3 == min) {
                return;
            }
            if (min < i3) {
                this.f56973c = Math.min(this.f56973c, min);
            }
            this.f56974d = true;
            this.f56975e = min;
            int i4 = this.f56979i;
            if (min < i4) {
                if (min != 0) {
                    m29995a(i4 - min);
                    return;
                }
                ArraysKt.m31974x(this.f56976f, null, 0, 0, 6, null);
                this.f56977g = this.f56976f.length - 1;
                this.f56978h = 0;
                this.f56979i = 0;
            }
        }

        public /* synthetic */ b(Buffer buffer) {
            this(RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT, true, buffer);
        }

        /* renamed from: a */
        private final void m29996a(C5096fy c5096fy) {
            int i2 = c5096fy.f50458c;
            int i3 = this.f56975e;
            if (i2 > i3) {
                ArraysKt.m31974x(this.f56976f, null, 0, 0, 6, null);
                this.f56977g = this.f56976f.length - 1;
                this.f56978h = 0;
                this.f56979i = 0;
                return;
            }
            m29995a((this.f56979i + i2) - i3);
            int i4 = this.f56978h + 1;
            C5096fy[] c5096fyArr = this.f56976f;
            if (i4 > c5096fyArr.length) {
                C5096fy[] c5096fyArr2 = new C5096fy[c5096fyArr.length * 2];
                System.arraycopy(c5096fyArr, 0, c5096fyArr2, c5096fyArr.length, c5096fyArr.length);
                this.f56977g = this.f56976f.length - 1;
                this.f56976f = c5096fyArr2;
            }
            int i5 = this.f56977g;
            this.f56977g = i5 - 1;
            this.f56976f[i5] = c5096fy;
            this.f56978h++;
            this.f56979i += i2;
        }

        /* renamed from: a */
        public final void m29998a(@NotNull ArrayList headerBlock) throws IOException {
            int i2;
            int i3;
            Intrinsics.m32179h(headerBlock, "headerBlock");
            if (this.f56974d) {
                int i4 = this.f56973c;
                if (i4 < this.f56975e) {
                    m29997a(i4, 31, 32);
                }
                this.f56974d = false;
                this.f56973c = Integer.MAX_VALUE;
                m29997a(this.f56975e, 31, 32);
            }
            int size = headerBlock.size();
            for (int i5 = 0; i5 < size; i5++) {
                C5096fy c5096fy = (C5096fy) headerBlock.get(i5);
                ByteString mo34584n = c5096fy.f50456a.mo34584n();
                ByteString byteString = c5096fy.f50457b;
                Integer num = (Integer) C6096yy.m29985a().get(mo34584n);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (2 <= i2 && i2 < 8) {
                        if (Intrinsics.m32174c(C6096yy.m29987b()[i2 - 1].f50457b, byteString)) {
                            i3 = i2;
                        } else if (Intrinsics.m32174c(C6096yy.m29987b()[i2].f50457b, byteString)) {
                            i3 = i2;
                            i2++;
                        }
                    }
                    i3 = i2;
                    i2 = -1;
                } else {
                    i2 = -1;
                    i3 = -1;
                }
                if (i2 == -1) {
                    int i6 = this.f56977g + 1;
                    int length = this.f56976f.length;
                    while (true) {
                        if (i6 >= length) {
                            break;
                        }
                        C5096fy c5096fy2 = this.f56976f[i6];
                        Intrinsics.m32176e(c5096fy2);
                        if (Intrinsics.m32174c(c5096fy2.f50456a, mo34584n)) {
                            C5096fy c5096fy3 = this.f56976f[i6];
                            Intrinsics.m32176e(c5096fy3);
                            if (Intrinsics.m32174c(c5096fy3.f50457b, byteString)) {
                                i2 = C6096yy.m29987b().length + (i6 - this.f56977g);
                                break;
                            } else if (i3 == -1) {
                                i3 = (i6 - this.f56977g) + C6096yy.m29987b().length;
                            }
                        }
                        i6++;
                    }
                }
                if (i2 != -1) {
                    m29997a(i2, 127, 128);
                } else if (i3 == -1) {
                    this.f56972b.m34524Q(64);
                    m29999a(mo34584n);
                    m29999a(byteString);
                    m29996a(c5096fy);
                } else if (mo34584n.m34583m(C5096fy.f50450d) && !Intrinsics.m32174c(C5096fy.f50455i, mo34584n)) {
                    m29997a(i3, 15, 0);
                    m29999a(byteString);
                } else {
                    m29997a(i3, 63, 64);
                    m29999a(byteString);
                    m29996a(c5096fy);
                }
            }
        }

        /* renamed from: a */
        public final void m29997a(int i2, int i3, int i4) {
            if (i2 < i3) {
                this.f56972b.m34524Q(i2 | i4);
                return;
            }
            this.f56972b.m34524Q(i4 | i3);
            int i5 = i2 - i3;
            while (i5 >= 128) {
                this.f56972b.m34524Q(128 | (i5 & 127));
                i5 >>>= 7;
            }
            this.f56972b.m34524Q(i5);
        }

        /* renamed from: a */
        public final void m29999a(@NotNull ByteString data) throws IOException {
            Intrinsics.m32179h(data, "data");
            if (this.f56971a && v00.m29151a(data) < data.mo34576d()) {
                Buffer buffer = new Buffer();
                v00.m29154a(data, buffer);
                ByteString mo34515B0 = buffer.mo34515B0();
                m29997a(mo34515B0.mo34576d(), 127, 128);
                this.f56972b.m34566v(mo34515B0);
                return;
            }
            m29997a(data.mo34576d(), 127, 0);
            this.f56972b.m34566v(data);
        }
    }
}
