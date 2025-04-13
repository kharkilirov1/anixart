package com.google.gson.stream;

import androidx.emoji2.text.flatbuffer.C0321a;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.JsonFactory;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class JsonReader implements Closeable {

    /* renamed from: b */
    public final Reader f23888b;

    /* renamed from: c */
    public boolean f23889c = false;

    /* renamed from: d */
    public final char[] f23890d = new char[RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE];

    /* renamed from: e */
    public int f23891e = 0;

    /* renamed from: f */
    public int f23892f = 0;

    /* renamed from: g */
    public int f23893g = 0;

    /* renamed from: h */
    public int f23894h = 0;

    /* renamed from: i */
    public int f23895i = 0;

    /* renamed from: j */
    public long f23896j;

    /* renamed from: k */
    public int f23897k;

    /* renamed from: l */
    public String f23898l;

    /* renamed from: m */
    public int[] f23899m;

    /* renamed from: n */
    public int f23900n;

    /* renamed from: o */
    public String[] f23901o;

    /* renamed from: p */
    public int[] f23902p;

    static {
        JsonReaderInternalAccess.f23704a = new JsonReaderInternalAccess() { // from class: com.google.gson.stream.JsonReader.1
            @Override // com.google.gson.internal.JsonReaderInternalAccess
            /* renamed from: a */
            public void mo12869a(JsonReader jsonReader) throws IOException {
                if (jsonReader instanceof JsonTreeReader) {
                    JsonTreeReader jsonTreeReader = (JsonTreeReader) jsonReader;
                    jsonTreeReader.m12902d0(JsonToken.NAME);
                    Map.Entry entry = (Map.Entry) ((Iterator) jsonTreeReader.m12908n0()).next();
                    jsonTreeReader.m12913s0(entry.getValue());
                    jsonTreeReader.m12913s0(new JsonPrimitive((String) entry.getKey()));
                    return;
                }
                int i2 = jsonReader.f23895i;
                if (i2 == 0) {
                    i2 = jsonReader.m12950e();
                }
                if (i2 == 13) {
                    jsonReader.f23895i = 9;
                    return;
                }
                if (i2 == 12) {
                    jsonReader.f23895i = 8;
                } else {
                    if (i2 == 14) {
                        jsonReader.f23895i = 10;
                        return;
                    }
                    StringBuilder m24u = C0000a.m24u("Expected a name but was ");
                    m24u.append(jsonReader.mo12898C());
                    m24u.append(jsonReader.m12953l());
                    throw new IllegalStateException(m24u.toString());
                }
            }
        };
    }

    public JsonReader(Reader reader) {
        int[] iArr = new int[32];
        this.f23899m = iArr;
        this.f23900n = 0;
        this.f23900n = 0 + 1;
        iArr[0] = 6;
        this.f23901o = new String[32];
        this.f23902p = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f23888b = reader;
    }

    /* renamed from: A */
    public String mo12897A() throws IOException {
        String str;
        int i2 = this.f23895i;
        if (i2 == 0) {
            i2 = m12950e();
        }
        if (i2 == 10) {
            str = m12943B();
        } else if (i2 == 8) {
            str = m12955w('\'');
        } else if (i2 == 9) {
            str = m12955w(JsonFactory.DEFAULT_QUOTE_CHAR);
        } else if (i2 == 11) {
            str = this.f23898l;
            this.f23898l = null;
        } else if (i2 == 15) {
            str = Long.toString(this.f23896j);
        } else {
            if (i2 != 16) {
                StringBuilder m24u = C0000a.m24u("Expected a string but was ");
                m24u.append(mo12898C());
                m24u.append(m12953l());
                throw new IllegalStateException(m24u.toString());
            }
            str = new String(this.f23890d, this.f23891e, this.f23897k);
            this.f23891e += this.f23897k;
        }
        this.f23895i = 0;
        int[] iArr = this.f23902p;
        int i3 = this.f23900n - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        m12949c();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m12943B() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.f23891e
            int r4 = r3 + r2
            int r5 = r6.f23892f
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f23890d
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.m12949c()
            goto L5c
        L4e:
            char[] r3 = r6.f23890d
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.m12951i(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f23890d
            int r4 = r6.f23891e
            r1.append(r3, r4, r2)
            int r3 = r6.f23891e
            int r3 = r3 + r2
            r6.f23891e = r3
            r2 = 1
            boolean r2 = r6.m12951i(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f23890d
            int r3 = r6.f23891e
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f23890d
            int r3 = r6.f23891e
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f23891e
            int r2 = r2 + r0
            r6.f23891e = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.m12943B():java.lang.String");
    }

    /* renamed from: C */
    public JsonToken mo12898C() throws IOException {
        int i2 = this.f23895i;
        if (i2 == 0) {
            i2 = m12950e();
        }
        switch (i2) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: N */
    public final void m12944N(int i2) {
        int i3 = this.f23900n;
        int[] iArr = this.f23899m;
        if (i3 == iArr.length) {
            int i4 = i3 * 2;
            this.f23899m = Arrays.copyOf(iArr, i4);
            this.f23902p = Arrays.copyOf(this.f23902p, i4);
            this.f23901o = (String[]) Arrays.copyOf(this.f23901o, i4);
        }
        int[] iArr2 = this.f23899m;
        int i5 = this.f23900n;
        this.f23900n = i5 + 1;
        iArr2[i5] = i2;
    }

    /* renamed from: Q */
    public final char m12945Q() throws IOException {
        int i2;
        int i3;
        if (this.f23891e == this.f23892f && !m12951i(1)) {
            m12948b0("Unterminated escape sequence");
            throw null;
        }
        char[] cArr = this.f23890d;
        int i4 = this.f23891e;
        int i5 = i4 + 1;
        this.f23891e = i5;
        char c2 = cArr[i4];
        if (c2 == '\n') {
            this.f23893g++;
            this.f23894h = i5;
        } else if (c2 != '\"' && c2 != '\'' && c2 != '/' && c2 != '\\') {
            if (c2 == 'b') {
                return '\b';
            }
            if (c2 == 'f') {
                return '\f';
            }
            if (c2 == 'n') {
                return '\n';
            }
            if (c2 == 'r') {
                return '\r';
            }
            if (c2 == 't') {
                return '\t';
            }
            if (c2 != 'u') {
                m12948b0("Invalid escape sequence");
                throw null;
            }
            if (i5 + 4 > this.f23892f && !m12951i(4)) {
                m12948b0("Unterminated escape sequence");
                throw null;
            }
            char c3 = 0;
            int i6 = this.f23891e;
            int i7 = i6 + 4;
            while (i6 < i7) {
                char c4 = this.f23890d[i6];
                char c5 = (char) (c3 << 4);
                if (c4 < '0' || c4 > '9') {
                    if (c4 >= 'a' && c4 <= 'f') {
                        i2 = c4 - 'a';
                    } else {
                        if (c4 < 'A' || c4 > 'F') {
                            StringBuilder m24u = C0000a.m24u("\\u");
                            m24u.append(new String(this.f23890d, this.f23891e, 4));
                            throw new NumberFormatException(m24u.toString());
                        }
                        i2 = c4 - 'A';
                    }
                    i3 = i2 + 10;
                } else {
                    i3 = c4 - '0';
                }
                c3 = (char) (i3 + c5);
                i6++;
            }
            this.f23891e += 4;
            return c3;
        }
        return c2;
    }

    /* renamed from: R */
    public final void m12946R(char c2) throws IOException {
        char[] cArr = this.f23890d;
        do {
            int i2 = this.f23891e;
            int i3 = this.f23892f;
            while (i2 < i3) {
                int i4 = i2 + 1;
                char c3 = cArr[i2];
                if (c3 == c2) {
                    this.f23891e = i4;
                    return;
                }
                if (c3 == '\\') {
                    this.f23891e = i4;
                    m12945Q();
                    i2 = this.f23891e;
                    i3 = this.f23892f;
                } else {
                    if (c3 == '\n') {
                        this.f23893g++;
                        this.f23894h = i4;
                    }
                    i2 = i4;
                }
            }
            this.f23891e = i2;
        } while (m12951i(1));
        m12948b0("Unterminated string");
        throw null;
    }

    /* renamed from: X */
    public final void m12947X() throws IOException {
        char c2;
        do {
            if (this.f23891e >= this.f23892f && !m12951i(1)) {
                return;
            }
            char[] cArr = this.f23890d;
            int i2 = this.f23891e;
            int i3 = i2 + 1;
            this.f23891e = i3;
            c2 = cArr[i2];
            if (c2 == '\n') {
                this.f23893g++;
                this.f23894h = i3;
                return;
            }
        } while (c2 != '\r');
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x009b. Please report as an issue. */
    /* renamed from: Z */
    public void mo12899Z() throws IOException {
        int i2 = 0;
        do {
            int i3 = this.f23895i;
            if (i3 == 0) {
                i3 = m12950e();
            }
            if (i3 == 3) {
                m12944N(1);
            } else if (i3 == 1) {
                m12944N(3);
            } else {
                if (i3 == 4) {
                    this.f23900n--;
                } else if (i3 == 2) {
                    this.f23900n--;
                } else {
                    if (i3 == 14 || i3 == 10) {
                        do {
                            int i4 = 0;
                            while (true) {
                                int i5 = this.f23891e + i4;
                                if (i5 < this.f23892f) {
                                    char c2 = this.f23890d[i5];
                                    if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                                        if (c2 != '#') {
                                            if (c2 != ',') {
                                                if (c2 != '/' && c2 != '=') {
                                                    if (c2 != '{' && c2 != '}' && c2 != ':') {
                                                        if (c2 != ';') {
                                                            switch (c2) {
                                                                case '[':
                                                                case ']':
                                                                    break;
                                                                case '\\':
                                                                    break;
                                                                default:
                                                                    i4++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    this.f23891e = i5;
                                }
                            }
                            m12949c();
                            this.f23891e += i4;
                        } while (m12951i(1));
                    } else if (i3 == 8 || i3 == 12) {
                        m12946R('\'');
                    } else if (i3 == 9 || i3 == 13) {
                        m12946R(JsonFactory.DEFAULT_QUOTE_CHAR);
                    } else if (i3 == 16) {
                        this.f23891e += this.f23897k;
                    }
                    this.f23895i = 0;
                }
                i2--;
                this.f23895i = 0;
            }
            i2++;
            this.f23895i = 0;
        } while (i2 != 0);
        int[] iArr = this.f23902p;
        int i6 = this.f23900n;
        int i7 = i6 - 1;
        iArr[i7] = iArr[i7] + 1;
        this.f23901o[i6 - 1] = "null";
    }

    /* renamed from: a */
    public void mo12900a() throws IOException {
        int i2 = this.f23895i;
        if (i2 == 0) {
            i2 = m12950e();
        }
        if (i2 == 3) {
            m12944N(1);
            this.f23902p[this.f23900n - 1] = 0;
            this.f23895i = 0;
        } else {
            StringBuilder m24u = C0000a.m24u("Expected BEGIN_ARRAY but was ");
            m24u.append(mo12898C());
            m24u.append(m12953l());
            throw new IllegalStateException(m24u.toString());
        }
    }

    /* renamed from: b */
    public void mo12901b() throws IOException {
        int i2 = this.f23895i;
        if (i2 == 0) {
            i2 = m12950e();
        }
        if (i2 == 1) {
            m12944N(3);
            this.f23895i = 0;
        } else {
            StringBuilder m24u = C0000a.m24u("Expected BEGIN_OBJECT but was ");
            m24u.append(mo12898C());
            m24u.append(m12953l());
            throw new IllegalStateException(m24u.toString());
        }
    }

    /* renamed from: b0 */
    public final IOException m12948b0(String str) throws IOException {
        StringBuilder m24u = C0000a.m24u(str);
        m24u.append(m12953l());
        throw new MalformedJsonException(m24u.toString());
    }

    /* renamed from: c */
    public final void m12949c() throws IOException {
        if (this.f23889c) {
            return;
        }
        m12948b0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f23895i = 0;
        this.f23899m[0] = 8;
        this.f23900n = 1;
        this.f23888b.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0213, code lost:
    
        if (m12952k(r1) != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a2, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0216, code lost:
    
        if (r10 != 2) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0218, code lost:
    
        if (r11 == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x021e, code lost:
    
        if (r4 != Long.MIN_VALUE) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0220, code lost:
    
        if (r16 == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0224, code lost:
    
        if (r4 != 0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0226, code lost:
    
        if (r16 != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0228, code lost:
    
        if (r16 == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x022b, code lost:
    
        r4 = -r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x022c, code lost:
    
        r19.f23896j = r4;
        r19.f23891e += r9;
        r13 = 15;
        r19.f23895i = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0238, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0239, code lost:
    
        if (r10 == r1) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x023b, code lost:
    
        if (r10 == 4) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x023e, code lost:
    
        if (r10 != 7) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0240, code lost:
    
        r19.f23897k = r9;
        r13 = 16;
        r19.f23895i = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0181 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x026e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e8  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m12950e() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.m12950e():int");
    }

    /* renamed from: g */
    public void mo12903g() throws IOException {
        int i2 = this.f23895i;
        if (i2 == 0) {
            i2 = m12950e();
        }
        if (i2 != 4) {
            StringBuilder m24u = C0000a.m24u("Expected END_ARRAY but was ");
            m24u.append(mo12898C());
            m24u.append(m12953l());
            throw new IllegalStateException(m24u.toString());
        }
        int i3 = this.f23900n - 1;
        this.f23900n = i3;
        int[] iArr = this.f23902p;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f23895i = 0;
    }

    /* renamed from: h */
    public void mo12904h() throws IOException {
        int i2 = this.f23895i;
        if (i2 == 0) {
            i2 = m12950e();
        }
        if (i2 != 2) {
            StringBuilder m24u = C0000a.m24u("Expected END_OBJECT but was ");
            m24u.append(mo12898C());
            m24u.append(m12953l());
            throw new IllegalStateException(m24u.toString());
        }
        int i3 = this.f23900n - 1;
        this.f23900n = i3;
        this.f23901o[i3] = null;
        int[] iArr = this.f23902p;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f23895i = 0;
    }

    /* renamed from: i */
    public final boolean m12951i(int i2) throws IOException {
        int i3;
        int i4;
        char[] cArr = this.f23890d;
        int i5 = this.f23894h;
        int i6 = this.f23891e;
        this.f23894h = i5 - i6;
        int i7 = this.f23892f;
        if (i7 != i6) {
            int i8 = i7 - i6;
            this.f23892f = i8;
            System.arraycopy(cArr, i6, cArr, 0, i8);
        } else {
            this.f23892f = 0;
        }
        this.f23891e = 0;
        do {
            Reader reader = this.f23888b;
            int i9 = this.f23892f;
            int read = reader.read(cArr, i9, cArr.length - i9);
            if (read == -1) {
                return false;
            }
            i3 = this.f23892f + read;
            this.f23892f = i3;
            if (this.f23893g == 0 && (i4 = this.f23894h) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.f23891e++;
                this.f23894h = i4 + 1;
                i2++;
            }
        } while (i3 < i2);
        return true;
    }

    /* renamed from: j */
    public boolean mo12905j() throws IOException {
        int i2 = this.f23895i;
        if (i2 == 0) {
            i2 = m12950e();
        }
        return (i2 == 2 || i2 == 4) ? false : true;
    }

    /* renamed from: k */
    public final boolean m12952k(char c2) throws IOException {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m12949c();
        return false;
    }

    /* renamed from: l */
    public String m12953l() {
        StringBuilder m26w = C0000a.m26w(" at line ", this.f23893g + 1, " column ", (this.f23891e - this.f23894h) + 1, " path ");
        m26w.append(mo12914t());
        return m26w.toString();
    }

    /* renamed from: m */
    public boolean mo12906m() throws IOException {
        int i2 = this.f23895i;
        if (i2 == 0) {
            i2 = m12950e();
        }
        if (i2 == 5) {
            this.f23895i = 0;
            int[] iArr = this.f23902p;
            int i3 = this.f23900n - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        }
        if (i2 != 6) {
            StringBuilder m24u = C0000a.m24u("Expected a boolean but was ");
            m24u.append(mo12898C());
            m24u.append(m12953l());
            throw new IllegalStateException(m24u.toString());
        }
        this.f23895i = 0;
        int[] iArr2 = this.f23902p;
        int i4 = this.f23900n - 1;
        iArr2[i4] = iArr2[i4] + 1;
        return false;
    }

    /* renamed from: n */
    public double mo12907n() throws IOException {
        int i2 = this.f23895i;
        if (i2 == 0) {
            i2 = m12950e();
        }
        if (i2 == 15) {
            this.f23895i = 0;
            int[] iArr = this.f23902p;
            int i3 = this.f23900n - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.f23896j;
        }
        if (i2 == 16) {
            this.f23898l = new String(this.f23890d, this.f23891e, this.f23897k);
            this.f23891e += this.f23897k;
        } else if (i2 == 8 || i2 == 9) {
            this.f23898l = m12955w(i2 == 8 ? '\'' : JsonFactory.DEFAULT_QUOTE_CHAR);
        } else if (i2 == 10) {
            this.f23898l = m12943B();
        } else if (i2 != 11) {
            StringBuilder m24u = C0000a.m24u("Expected a double but was ");
            m24u.append(mo12898C());
            m24u.append(m12953l());
            throw new IllegalStateException(m24u.toString());
        }
        this.f23895i = 11;
        double parseDouble = Double.parseDouble(this.f23898l);
        if (!this.f23889c && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + m12953l());
        }
        this.f23898l = null;
        this.f23895i = 0;
        int[] iArr2 = this.f23902p;
        int i4 = this.f23900n - 1;
        iArr2[i4] = iArr2[i4] + 1;
        return parseDouble;
    }

    /* renamed from: o */
    public int mo12909o() throws IOException {
        int i2 = this.f23895i;
        if (i2 == 0) {
            i2 = m12950e();
        }
        if (i2 == 15) {
            long j2 = this.f23896j;
            int i3 = (int) j2;
            if (j2 != i3) {
                StringBuilder m24u = C0000a.m24u("Expected an int but was ");
                m24u.append(this.f23896j);
                m24u.append(m12953l());
                throw new NumberFormatException(m24u.toString());
            }
            this.f23895i = 0;
            int[] iArr = this.f23902p;
            int i4 = this.f23900n - 1;
            iArr[i4] = iArr[i4] + 1;
            return i3;
        }
        if (i2 == 16) {
            this.f23898l = new String(this.f23890d, this.f23891e, this.f23897k);
            this.f23891e += this.f23897k;
        } else {
            if (i2 != 8 && i2 != 9 && i2 != 10) {
                StringBuilder m24u2 = C0000a.m24u("Expected an int but was ");
                m24u2.append(mo12898C());
                m24u2.append(m12953l());
                throw new IllegalStateException(m24u2.toString());
            }
            if (i2 == 10) {
                this.f23898l = m12943B();
            } else {
                this.f23898l = m12955w(i2 == 8 ? '\'' : JsonFactory.DEFAULT_QUOTE_CHAR);
            }
            try {
                int parseInt = Integer.parseInt(this.f23898l);
                this.f23895i = 0;
                int[] iArr2 = this.f23902p;
                int i5 = this.f23900n - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f23895i = 11;
        double parseDouble = Double.parseDouble(this.f23898l);
        int i6 = (int) parseDouble;
        if (i6 != parseDouble) {
            StringBuilder m24u3 = C0000a.m24u("Expected an int but was ");
            m24u3.append(this.f23898l);
            m24u3.append(m12953l());
            throw new NumberFormatException(m24u3.toString());
        }
        this.f23898l = null;
        this.f23895i = 0;
        int[] iArr3 = this.f23902p;
        int i7 = this.f23900n - 1;
        iArr3[i7] = iArr3[i7] + 1;
        return i6;
    }

    /* renamed from: p */
    public long mo12911p() throws IOException {
        int i2 = this.f23895i;
        if (i2 == 0) {
            i2 = m12950e();
        }
        if (i2 == 15) {
            this.f23895i = 0;
            int[] iArr = this.f23902p;
            int i3 = this.f23900n - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.f23896j;
        }
        if (i2 == 16) {
            this.f23898l = new String(this.f23890d, this.f23891e, this.f23897k);
            this.f23891e += this.f23897k;
        } else {
            if (i2 != 8 && i2 != 9 && i2 != 10) {
                StringBuilder m24u = C0000a.m24u("Expected a long but was ");
                m24u.append(mo12898C());
                m24u.append(m12953l());
                throw new IllegalStateException(m24u.toString());
            }
            if (i2 == 10) {
                this.f23898l = m12943B();
            } else {
                this.f23898l = m12955w(i2 == 8 ? '\'' : JsonFactory.DEFAULT_QUOTE_CHAR);
            }
            try {
                long parseLong = Long.parseLong(this.f23898l);
                this.f23895i = 0;
                int[] iArr2 = this.f23902p;
                int i4 = this.f23900n - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f23895i = 11;
        double parseDouble = Double.parseDouble(this.f23898l);
        long j2 = (long) parseDouble;
        if (j2 != parseDouble) {
            StringBuilder m24u2 = C0000a.m24u("Expected a long but was ");
            m24u2.append(this.f23898l);
            m24u2.append(m12953l());
            throw new NumberFormatException(m24u2.toString());
        }
        this.f23898l = null;
        this.f23895i = 0;
        int[] iArr3 = this.f23902p;
        int i5 = this.f23900n - 1;
        iArr3[i5] = iArr3[i5] + 1;
        return j2;
    }

    /* renamed from: q */
    public String mo12912q() throws IOException {
        String m12955w;
        int i2 = this.f23895i;
        if (i2 == 0) {
            i2 = m12950e();
        }
        if (i2 == 14) {
            m12955w = m12943B();
        } else if (i2 == 12) {
            m12955w = m12955w('\'');
        } else {
            if (i2 != 13) {
                StringBuilder m24u = C0000a.m24u("Expected a name but was ");
                m24u.append(mo12898C());
                m24u.append(m12953l());
                throw new IllegalStateException(m24u.toString());
            }
            m12955w = m12955w(JsonFactory.DEFAULT_QUOTE_CHAR);
        }
        this.f23895i = 0;
        this.f23901o[this.f23900n - 1] = m12955w;
        return m12955w;
    }

    /* renamed from: t */
    public String mo12914t() {
        StringBuilder m2872a = C0321a.m2872a('$');
        int i2 = this.f23900n;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.f23899m[i3];
            if (i4 == 1 || i4 == 2) {
                m2872a.append('[');
                m2872a.append(this.f23902p[i3]);
                m2872a.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                m2872a.append('.');
                String[] strArr = this.f23901o;
                if (strArr[i3] != null) {
                    m2872a.append(strArr[i3]);
                }
            }
        }
        return m2872a.toString();
    }

    public String toString() {
        return getClass().getSimpleName() + m12953l();
    }

    /* renamed from: u */
    public final int m12954u(boolean z) throws IOException {
        char[] cArr = this.f23890d;
        int i2 = this.f23891e;
        int i3 = this.f23892f;
        while (true) {
            boolean z2 = true;
            if (i2 == i3) {
                this.f23891e = i2;
                if (!m12951i(1)) {
                    if (!z) {
                        return -1;
                    }
                    StringBuilder m24u = C0000a.m24u("End of input");
                    m24u.append(m12953l());
                    throw new EOFException(m24u.toString());
                }
                i2 = this.f23891e;
                i3 = this.f23892f;
            }
            int i4 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 == '\n') {
                this.f23893g++;
                this.f23894h = i4;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.f23891e = i4;
                    if (i4 == i3) {
                        this.f23891e = i4 - 1;
                        boolean m12951i = m12951i(2);
                        this.f23891e++;
                        if (!m12951i) {
                            return c2;
                        }
                    }
                    m12949c();
                    int i5 = this.f23891e;
                    char c3 = cArr[i5];
                    if (c3 == '*') {
                        this.f23891e = i5 + 1;
                        while (true) {
                            if (this.f23891e + 2 > this.f23892f && !m12951i(2)) {
                                z2 = false;
                                break;
                            }
                            char[] cArr2 = this.f23890d;
                            int i6 = this.f23891e;
                            if (cArr2[i6] != '\n') {
                                for (int i7 = 0; i7 < 2; i7++) {
                                    if (this.f23890d[this.f23891e + i7] != "*/".charAt(i7)) {
                                        break;
                                    }
                                }
                                break;
                            }
                            this.f23893g++;
                            this.f23894h = i6 + 1;
                            this.f23891e++;
                        }
                        if (!z2) {
                            m12948b0("Unterminated comment");
                            throw null;
                        }
                        i2 = this.f23891e + 2;
                        i3 = this.f23892f;
                    } else {
                        if (c3 != '/') {
                            return c2;
                        }
                        this.f23891e = i5 + 1;
                        m12947X();
                        i2 = this.f23891e;
                        i3 = this.f23892f;
                    }
                } else {
                    if (c2 != '#') {
                        this.f23891e = i4;
                        return c2;
                    }
                    this.f23891e = i4;
                    m12949c();
                    m12947X();
                    i2 = this.f23891e;
                    i3 = this.f23892f;
                }
            }
            i2 = i4;
        }
    }

    /* renamed from: v */
    public void mo12915v() throws IOException {
        int i2 = this.f23895i;
        if (i2 == 0) {
            i2 = m12950e();
        }
        if (i2 != 7) {
            StringBuilder m24u = C0000a.m24u("Expected null but was ");
            m24u.append(mo12898C());
            m24u.append(m12953l());
            throw new IllegalStateException(m24u.toString());
        }
        this.f23895i = 0;
        int[] iArr = this.f23902p;
        int i3 = this.f23900n - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        if (r2 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005f, code lost:
    
        r2 = new java.lang.StringBuilder(java.lang.Math.max((r3 - r4) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
    
        r2.append(r0, r4, r3 - r4);
        r10.f23891e = r3;
     */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m12955w(char r11) throws java.io.IOException {
        /*
            r10 = this;
            char[] r0 = r10.f23890d
            r1 = 0
            r2 = r1
        L4:
            int r3 = r10.f23891e
            int r4 = r10.f23892f
        L8:
            r5 = r4
            r4 = r3
        La:
            r6 = 16
            r7 = 1
            if (r3 >= r5) goto L5d
            int r8 = r3 + 1
            char r3 = r0[r3]
            if (r3 != r11) goto L29
            r10.f23891e = r8
            int r8 = r8 - r4
            int r8 = r8 - r7
            if (r2 != 0) goto L21
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r4, r8)
            return r11
        L21:
            r2.append(r0, r4, r8)
            java.lang.String r11 = r2.toString()
            return r11
        L29:
            r9 = 92
            if (r3 != r9) goto L50
            r10.f23891e = r8
            int r8 = r8 - r4
            int r8 = r8 - r7
            if (r2 != 0) goto L41
            int r2 = r8 + 1
            int r2 = r2 * 2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r3.<init>(r2)
            r2 = r3
        L41:
            r2.append(r0, r4, r8)
            char r3 = r10.m12945Q()
            r2.append(r3)
            int r3 = r10.f23891e
            int r4 = r10.f23892f
            goto L8
        L50:
            r6 = 10
            if (r3 != r6) goto L5b
            int r3 = r10.f23893g
            int r3 = r3 + r7
            r10.f23893g = r3
            r10.f23894h = r8
        L5b:
            r3 = r8
            goto La
        L5d:
            if (r2 != 0) goto L6d
            int r2 = r3 - r4
            int r2 = r2 * 2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r5.<init>(r2)
            r2 = r5
        L6d:
            int r5 = r3 - r4
            r2.append(r0, r4, r5)
            r10.f23891e = r3
            boolean r3 = r10.m12951i(r7)
            if (r3 == 0) goto L7b
            goto L4
        L7b:
            java.lang.String r11 = "Unterminated string"
            r10.m12948b0(r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.m12955w(char):java.lang.String");
    }
}
