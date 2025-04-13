package com.airbnb.lottie.parser.moshi;

import androidx.annotation.Nullable;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import java.io.EOFException;
import java.io.IOException;
import java.util.Objects;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import p000a.C0000a;

/* loaded from: classes.dex */
final class JsonUtf8Reader extends JsonReader {

    /* renamed from: m */
    public static final ByteString f7791m = ByteString.m34572c("'\\");

    /* renamed from: n */
    public static final ByteString f7792n = ByteString.m34572c("\"\\");

    /* renamed from: o */
    public static final ByteString f7793o = ByteString.m34572c("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: p */
    public static final ByteString f7794p = ByteString.m34572c("\n\r");

    /* renamed from: q */
    public static final ByteString f7795q = ByteString.m34572c("*/");

    /* renamed from: g */
    public final BufferedSource f7796g;

    /* renamed from: h */
    public final Buffer f7797h;

    /* renamed from: i */
    public int f7798i = 0;

    /* renamed from: j */
    public long f7799j;

    /* renamed from: k */
    public int f7800k;

    /* renamed from: l */
    @Nullable
    public String f7801l;

    public JsonUtf8Reader(BufferedSource bufferedSource) {
        Objects.requireNonNull(bufferedSource, "source == null");
        this.f7796g = bufferedSource;
        this.f7797h = bufferedSource.getF68789b();
        m4798o(6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d1, code lost:
    
        if (r1 == r2) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01d4, code lost:
    
        if (r1 == 4) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d7, code lost:
    
        if (r1 != 7) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d9, code lost:
    
        r17.f7800k = r5;
        r15 = 17;
        r17.f7798i = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a8, code lost:
    
        if (m4807C(r2) != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0131, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ab, code lost:
    
        if (r1 != 2) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ad, code lost:
    
        if (r6 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b3, code lost:
    
        if (r7 != Long.MIN_VALUE) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b5, code lost:
    
        if (r9 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01bb, code lost:
    
        if (r7 != 0) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01bd, code lost:
    
        if (r9 != false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01bf, code lost:
    
        if (r9 == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c2, code lost:
    
        r7 = -r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c3, code lost:
    
        r17.f7799j = r7;
        r17.f7797h.skip(r5);
        r15 = 16;
        r17.f7798i = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d0, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0211 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0212  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m4805A() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 711
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.JsonUtf8Reader.m4805A():int");
    }

    /* renamed from: B */
    public final int m4806B(String str, JsonReader.Options options) {
        int length = options.f7778a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(options.f7778a[i2])) {
                this.f7798i = 0;
                this.f7776d[this.f7774b - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: C */
    public final boolean m4807C(int i2) throws IOException {
        if (i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13 || i2 == 32) {
            return false;
        }
        if (i2 != 35) {
            if (i2 == 44) {
                return false;
            }
            if (i2 != 47 && i2 != 61) {
                if (i2 == 123 || i2 == 125 || i2 == 58) {
                    return false;
                }
                if (i2 != 59) {
                    switch (i2) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m4814w();
        throw null;
    }

    /* renamed from: N */
    public final int m4808N(boolean z) throws IOException {
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (!this.f7796g.request(i3)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            byte m34539e = this.f7797h.m34539e(i2);
            if (m34539e != 10 && m34539e != 32 && m34539e != 13 && m34539e != 9) {
                this.f7797h.skip(i3 - 1);
                if (m34539e == 47) {
                    if (!this.f7796g.request(2L)) {
                        return m34539e;
                    }
                    m4814w();
                    throw null;
                }
                if (m34539e != 35) {
                    return m34539e;
                }
                m4814w();
                throw null;
            }
            i2 = i3;
        }
    }

    /* renamed from: Q */
    public final String m4809Q(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long mo34540e0 = this.f7796g.mo34540e0(byteString);
            if (mo34540e0 == -1) {
                m4803v("Unterminated string");
                throw null;
            }
            if (this.f7797h.m34539e(mo34540e0) != 92) {
                if (sb == null) {
                    String m34555n = this.f7797h.m34555n(mo34540e0);
                    this.f7797h.readByte();
                    return m34555n;
                }
                sb.append(this.f7797h.m34555n(mo34540e0));
                this.f7797h.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.f7797h.m34555n(mo34540e0));
            this.f7797h.readByte();
            sb.append(m4811X());
        }
    }

    /* renamed from: R */
    public final String m4810R() throws IOException {
        long mo34540e0 = this.f7796g.mo34540e0(f7793o);
        return mo34540e0 != -1 ? this.f7797h.m34555n(mo34540e0) : this.f7797h.m34553m();
    }

    /* renamed from: X */
    public final char m4811X() throws IOException {
        int i2;
        int i3;
        if (!this.f7796g.request(1L)) {
            m4803v("Unterminated escape sequence");
            throw null;
        }
        byte readByte = this.f7797h.readByte();
        if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
            return (char) readByte;
        }
        if (readByte == 98) {
            return '\b';
        }
        if (readByte == 102) {
            return '\f';
        }
        if (readByte == 110) {
            return '\n';
        }
        if (readByte == 114) {
            return '\r';
        }
        if (readByte == 116) {
            return '\t';
        }
        if (readByte != 117) {
            StringBuilder m24u = C0000a.m24u("Invalid escape sequence: \\");
            m24u.append((char) readByte);
            m4803v(m24u.toString());
            throw null;
        }
        if (!this.f7796g.request(4L)) {
            StringBuilder m24u2 = C0000a.m24u("Unterminated escape sequence at path ");
            m24u2.append(m4801t());
            throw new EOFException(m24u2.toString());
        }
        char c2 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            byte m34539e = this.f7797h.m34539e(i4);
            char c3 = (char) (c2 << 4);
            if (m34539e < 48 || m34539e > 57) {
                if (m34539e >= 97 && m34539e <= 102) {
                    i2 = m34539e - 97;
                } else {
                    if (m34539e < 65 || m34539e > 70) {
                        StringBuilder m24u3 = C0000a.m24u("\\u");
                        m24u3.append(this.f7797h.m34555n(4L));
                        m4803v(m24u3.toString());
                        throw null;
                    }
                    i2 = m34539e + ByteSourceJsonBootstrapper.UTF8_BOM_3;
                }
                i3 = i2 + 10;
            } else {
                i3 = m34539e - 48;
            }
            c2 = (char) (i3 + c3);
        }
        this.f7797h.skip(4L);
        return c2;
    }

    /* renamed from: Z */
    public final void m4812Z(ByteString byteString) throws IOException {
        while (true) {
            long mo34540e0 = this.f7796g.mo34540e0(byteString);
            if (mo34540e0 == -1) {
                m4803v("Unterminated string");
                throw null;
            }
            if (this.f7797h.m34539e(mo34540e0) != 92) {
                this.f7797h.skip(mo34540e0 + 1);
                return;
            } else {
                this.f7797h.skip(mo34540e0 + 1);
                m4811X();
            }
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: a */
    public void mo4787a() throws IOException {
        int i2 = this.f7798i;
        if (i2 == 0) {
            i2 = m4805A();
        }
        if (i2 == 3) {
            m4798o(1);
            this.f7777e[this.f7774b - 1] = 0;
            this.f7798i = 0;
        } else {
            StringBuilder m24u = C0000a.m24u("Expected BEGIN_ARRAY but was ");
            m24u.append(mo4797n());
            m24u.append(" at path ");
            m24u.append(m4801t());
            throw new JsonDataException(m24u.toString());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: b */
    public void mo4788b() throws IOException {
        int i2 = this.f7798i;
        if (i2 == 0) {
            i2 = m4805A();
        }
        if (i2 == 1) {
            m4798o(3);
            this.f7798i = 0;
        } else {
            StringBuilder m24u = C0000a.m24u("Expected BEGIN_OBJECT but was ");
            m24u.append(mo4797n());
            m24u.append(" at path ");
            m24u.append(m4801t());
            throw new JsonDataException(m24u.toString());
        }
    }

    /* renamed from: b0 */
    public final void m4813b0() throws IOException {
        long mo34540e0 = this.f7796g.mo34540e0(f7793o);
        Buffer buffer = this.f7797h;
        if (mo34540e0 == -1) {
            mo34540e0 = buffer.f68742c;
        }
        buffer.skip(mo34540e0);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: c */
    public void mo4789c() throws IOException {
        int i2 = this.f7798i;
        if (i2 == 0) {
            i2 = m4805A();
        }
        if (i2 != 4) {
            StringBuilder m24u = C0000a.m24u("Expected END_ARRAY but was ");
            m24u.append(mo4797n());
            m24u.append(" at path ");
            m24u.append(m4801t());
            throw new JsonDataException(m24u.toString());
        }
        int i3 = this.f7774b - 1;
        this.f7774b = i3;
        int[] iArr = this.f7777e;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f7798i = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f7798i = 0;
        this.f7775c[0] = 8;
        this.f7774b = 1;
        Buffer buffer = this.f7797h;
        buffer.skip(buffer.f68742c);
        this.f7796g.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: e */
    public void mo4790e() throws IOException {
        int i2 = this.f7798i;
        if (i2 == 0) {
            i2 = m4805A();
        }
        if (i2 != 2) {
            StringBuilder m24u = C0000a.m24u("Expected END_OBJECT but was ");
            m24u.append(mo4797n());
            m24u.append(" at path ");
            m24u.append(m4801t());
            throw new JsonDataException(m24u.toString());
        }
        int i3 = this.f7774b - 1;
        this.f7774b = i3;
        this.f7776d[i3] = null;
        int[] iArr = this.f7777e;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f7798i = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: g */
    public boolean mo4791g() throws IOException {
        int i2 = this.f7798i;
        if (i2 == 0) {
            i2 = m4805A();
        }
        return (i2 == 2 || i2 == 4 || i2 == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: h */
    public boolean mo4792h() throws IOException {
        int i2 = this.f7798i;
        if (i2 == 0) {
            i2 = m4805A();
        }
        if (i2 == 5) {
            this.f7798i = 0;
            int[] iArr = this.f7777e;
            int i3 = this.f7774b - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        }
        if (i2 == 6) {
            this.f7798i = 0;
            int[] iArr2 = this.f7777e;
            int i4 = this.f7774b - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        }
        StringBuilder m24u = C0000a.m24u("Expected a boolean but was ");
        m24u.append(mo4797n());
        m24u.append(" at path ");
        m24u.append(m4801t());
        throw new JsonDataException(m24u.toString());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: i */
    public double mo4793i() throws IOException {
        int i2 = this.f7798i;
        if (i2 == 0) {
            i2 = m4805A();
        }
        if (i2 == 16) {
            this.f7798i = 0;
            int[] iArr = this.f7777e;
            int i3 = this.f7774b - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.f7799j;
        }
        if (i2 == 17) {
            this.f7801l = this.f7797h.m34555n(this.f7800k);
        } else if (i2 == 9) {
            this.f7801l = m4809Q(f7792n);
        } else if (i2 == 8) {
            this.f7801l = m4809Q(f7791m);
        } else if (i2 == 10) {
            this.f7801l = m4810R();
        } else if (i2 != 11) {
            StringBuilder m24u = C0000a.m24u("Expected a double but was ");
            m24u.append(mo4797n());
            m24u.append(" at path ");
            m24u.append(m4801t());
            throw new JsonDataException(m24u.toString());
        }
        this.f7798i = 11;
        try {
            double parseDouble = Double.parseDouble(this.f7801l);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + m4801t());
            }
            this.f7801l = null;
            this.f7798i = 0;
            int[] iArr2 = this.f7777e;
            int i4 = this.f7774b - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            StringBuilder m24u2 = C0000a.m24u("Expected a double but was ");
            m24u2.append(this.f7801l);
            m24u2.append(" at path ");
            m24u2.append(m4801t());
            throw new JsonDataException(m24u2.toString());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: j */
    public int mo4794j() throws IOException {
        int i2 = this.f7798i;
        if (i2 == 0) {
            i2 = m4805A();
        }
        if (i2 == 16) {
            long j2 = this.f7799j;
            int i3 = (int) j2;
            if (j2 == i3) {
                this.f7798i = 0;
                int[] iArr = this.f7777e;
                int i4 = this.f7774b - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            StringBuilder m24u = C0000a.m24u("Expected an int but was ");
            m24u.append(this.f7799j);
            m24u.append(" at path ");
            m24u.append(m4801t());
            throw new JsonDataException(m24u.toString());
        }
        if (i2 == 17) {
            this.f7801l = this.f7797h.m34555n(this.f7800k);
        } else if (i2 == 9 || i2 == 8) {
            String m4809Q = i2 == 9 ? m4809Q(f7792n) : m4809Q(f7791m);
            this.f7801l = m4809Q;
            try {
                int parseInt = Integer.parseInt(m4809Q);
                this.f7798i = 0;
                int[] iArr2 = this.f7777e;
                int i5 = this.f7774b - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i2 != 11) {
            StringBuilder m24u2 = C0000a.m24u("Expected an int but was ");
            m24u2.append(mo4797n());
            m24u2.append(" at path ");
            m24u2.append(m4801t());
            throw new JsonDataException(m24u2.toString());
        }
        this.f7798i = 11;
        try {
            double parseDouble = Double.parseDouble(this.f7801l);
            int i6 = (int) parseDouble;
            if (i6 != parseDouble) {
                StringBuilder m24u3 = C0000a.m24u("Expected an int but was ");
                m24u3.append(this.f7801l);
                m24u3.append(" at path ");
                m24u3.append(m4801t());
                throw new JsonDataException(m24u3.toString());
            }
            this.f7801l = null;
            this.f7798i = 0;
            int[] iArr3 = this.f7777e;
            int i7 = this.f7774b - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return i6;
        } catch (NumberFormatException unused2) {
            StringBuilder m24u4 = C0000a.m24u("Expected an int but was ");
            m24u4.append(this.f7801l);
            m24u4.append(" at path ");
            m24u4.append(m4801t());
            throw new JsonDataException(m24u4.toString());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: k */
    public String mo4795k() throws IOException {
        String str;
        int i2 = this.f7798i;
        if (i2 == 0) {
            i2 = m4805A();
        }
        if (i2 == 14) {
            str = m4810R();
        } else if (i2 == 13) {
            str = m4809Q(f7792n);
        } else if (i2 == 12) {
            str = m4809Q(f7791m);
        } else {
            if (i2 != 15) {
                StringBuilder m24u = C0000a.m24u("Expected a name but was ");
                m24u.append(mo4797n());
                m24u.append(" at path ");
                m24u.append(m4801t());
                throw new JsonDataException(m24u.toString());
            }
            str = this.f7801l;
        }
        this.f7798i = 0;
        this.f7776d[this.f7774b - 1] = str;
        return str;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: l */
    public String mo4796l() throws IOException {
        String m34555n;
        int i2 = this.f7798i;
        if (i2 == 0) {
            i2 = m4805A();
        }
        if (i2 == 10) {
            m34555n = m4810R();
        } else if (i2 == 9) {
            m34555n = m4809Q(f7792n);
        } else if (i2 == 8) {
            m34555n = m4809Q(f7791m);
        } else if (i2 == 11) {
            m34555n = this.f7801l;
            this.f7801l = null;
        } else if (i2 == 16) {
            m34555n = Long.toString(this.f7799j);
        } else {
            if (i2 != 17) {
                StringBuilder m24u = C0000a.m24u("Expected a string but was ");
                m24u.append(mo4797n());
                m24u.append(" at path ");
                m24u.append(m4801t());
                throw new JsonDataException(m24u.toString());
            }
            m34555n = this.f7797h.m34555n(this.f7800k);
        }
        this.f7798i = 0;
        int[] iArr = this.f7777e;
        int i3 = this.f7774b - 1;
        iArr[i3] = iArr[i3] + 1;
        return m34555n;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: n */
    public JsonReader.Token mo4797n() throws IOException {
        int i2 = this.f7798i;
        if (i2 == 0) {
            i2 = m4805A();
        }
        switch (i2) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: p */
    public int mo4799p(JsonReader.Options options) throws IOException {
        int i2 = this.f7798i;
        if (i2 == 0) {
            i2 = m4805A();
        }
        if (i2 < 12 || i2 > 15) {
            return -1;
        }
        if (i2 == 15) {
            return m4806B(this.f7801l, options);
        }
        int mo34554m1 = this.f7796g.mo34554m1(options.f7779b);
        if (mo34554m1 != -1) {
            this.f7798i = 0;
            this.f7776d[this.f7774b - 1] = options.f7778a[mo34554m1];
            return mo34554m1;
        }
        String str = this.f7776d[this.f7774b - 1];
        String mo4795k = mo4795k();
        int m4806B = m4806B(mo4795k, options);
        if (m4806B == -1) {
            this.f7798i = 15;
            this.f7801l = mo4795k;
            this.f7776d[this.f7774b - 1] = str;
        }
        return m4806B;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: q */
    public void mo4800q() throws IOException {
        int i2 = this.f7798i;
        if (i2 == 0) {
            i2 = m4805A();
        }
        if (i2 == 14) {
            m4813b0();
        } else if (i2 == 13) {
            m4812Z(f7792n);
        } else if (i2 == 12) {
            m4812Z(f7791m);
        } else if (i2 != 15) {
            StringBuilder m24u = C0000a.m24u("Expected a name but was ");
            m24u.append(mo4797n());
            m24u.append(" at path ");
            m24u.append(m4801t());
            throw new JsonDataException(m24u.toString());
        }
        this.f7798i = 0;
        this.f7776d[this.f7774b - 1] = "null";
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("JsonReader(");
        m24u.append(this.f7796g);
        m24u.append(")");
        return m24u.toString();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: u */
    public void mo4802u() throws IOException {
        int i2 = 0;
        do {
            int i3 = this.f7798i;
            if (i3 == 0) {
                i3 = m4805A();
            }
            if (i3 == 3) {
                m4798o(1);
            } else if (i3 == 1) {
                m4798o(3);
            } else {
                if (i3 == 4) {
                    i2--;
                    if (i2 < 0) {
                        StringBuilder m24u = C0000a.m24u("Expected a value but was ");
                        m24u.append(mo4797n());
                        m24u.append(" at path ");
                        m24u.append(m4801t());
                        throw new JsonDataException(m24u.toString());
                    }
                    this.f7774b--;
                } else if (i3 == 2) {
                    i2--;
                    if (i2 < 0) {
                        StringBuilder m24u2 = C0000a.m24u("Expected a value but was ");
                        m24u2.append(mo4797n());
                        m24u2.append(" at path ");
                        m24u2.append(m4801t());
                        throw new JsonDataException(m24u2.toString());
                    }
                    this.f7774b--;
                } else if (i3 == 14 || i3 == 10) {
                    m4813b0();
                } else if (i3 == 9 || i3 == 13) {
                    m4812Z(f7792n);
                } else if (i3 == 8 || i3 == 12) {
                    m4812Z(f7791m);
                } else if (i3 == 17) {
                    this.f7797h.skip(this.f7800k);
                } else if (i3 == 18) {
                    StringBuilder m24u3 = C0000a.m24u("Expected a value but was ");
                    m24u3.append(mo4797n());
                    m24u3.append(" at path ");
                    m24u3.append(m4801t());
                    throw new JsonDataException(m24u3.toString());
                }
                this.f7798i = 0;
            }
            i2++;
            this.f7798i = 0;
        } while (i2 != 0);
        int[] iArr = this.f7777e;
        int i4 = this.f7774b;
        int i5 = i4 - 1;
        iArr[i5] = iArr[i5] + 1;
        this.f7776d[i4 - 1] = "null";
    }

    /* renamed from: w */
    public final void m4814w() throws IOException {
        m4803v("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }
}
