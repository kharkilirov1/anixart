package com.google.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class JsonWriter implements Closeable, Flushable {

    /* renamed from: k */
    public static final String[] f23914k = new String[128];

    /* renamed from: l */
    public static final String[] f23915l;

    /* renamed from: b */
    public final Writer f23916b;

    /* renamed from: c */
    public int[] f23917c = new int[32];

    /* renamed from: d */
    public int f23918d = 0;

    /* renamed from: e */
    public String f23919e;

    /* renamed from: f */
    public String f23920f;

    /* renamed from: g */
    public boolean f23921g;

    /* renamed from: h */
    public boolean f23922h;

    /* renamed from: i */
    public String f23923i;

    /* renamed from: j */
    public boolean f23924j;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f23914k[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = f23914k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f23915l = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public JsonWriter(Writer writer) {
        m12961m(6);
        this.f23920f = ":";
        this.f23924j = true;
        Objects.requireNonNull(writer, "out == null");
        this.f23916b = writer;
    }

    /* renamed from: A */
    public final void m12956A() throws IOException {
        if (this.f23923i != null) {
            int m12960l = m12960l();
            if (m12960l == 5) {
                this.f23916b.write(44);
            } else if (m12960l != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m12959j();
            m12962n(4);
            m12963o(this.f23923i);
            this.f23923i = null;
        }
    }

    /* renamed from: a */
    public final void m12957a() throws IOException {
        int m12960l = m12960l();
        if (m12960l == 1) {
            m12962n(2);
            m12959j();
            return;
        }
        if (m12960l == 2) {
            this.f23916b.append(',');
            m12959j();
        } else {
            if (m12960l == 4) {
                this.f23916b.append((CharSequence) this.f23920f);
                m12962n(5);
                return;
            }
            if (m12960l != 6) {
                if (m12960l != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f23921g) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m12962n(7);
        }
    }

    /* renamed from: b */
    public JsonWriter mo12918b() throws IOException {
        m12956A();
        m12957a();
        m12961m(1);
        this.f23916b.write(91);
        return this;
    }

    /* renamed from: c */
    public JsonWriter mo12919c() throws IOException {
        m12956A();
        m12957a();
        m12961m(3);
        this.f23916b.write(123);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f23916b.close();
        int i2 = this.f23918d;
        if (i2 > 1 || (i2 == 1 && this.f23917c[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f23918d = 0;
    }

    /* renamed from: e */
    public final JsonWriter m12958e(int i2, int i3, char c2) throws IOException {
        int m12960l = m12960l();
        if (m12960l != i3 && m12960l != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f23923i != null) {
            StringBuilder m24u = C0000a.m24u("Dangling name: ");
            m24u.append(this.f23923i);
            throw new IllegalStateException(m24u.toString());
        }
        this.f23918d--;
        if (m12960l == i3) {
            m12959j();
        }
        this.f23916b.write(c2);
        return this;
    }

    public void flush() throws IOException {
        if (this.f23918d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f23916b.flush();
    }

    /* renamed from: g */
    public JsonWriter mo12920g() throws IOException {
        m12958e(1, 2, ']');
        return this;
    }

    /* renamed from: h */
    public JsonWriter mo12921h() throws IOException {
        m12958e(3, 5, '}');
        return this;
    }

    /* renamed from: i */
    public JsonWriter mo12922i(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f23923i != null) {
            throw new IllegalStateException();
        }
        if (this.f23918d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f23923i = str;
        return this;
    }

    /* renamed from: j */
    public final void m12959j() throws IOException {
        if (this.f23919e == null) {
            return;
        }
        this.f23916b.write(10);
        int i2 = this.f23918d;
        for (int i3 = 1; i3 < i2; i3++) {
            this.f23916b.write(this.f23919e);
        }
    }

    /* renamed from: k */
    public JsonWriter mo12923k() throws IOException {
        if (this.f23923i != null) {
            if (!this.f23924j) {
                this.f23923i = null;
                return this;
            }
            m12956A();
        }
        m12957a();
        this.f23916b.write("null");
        return this;
    }

    /* renamed from: l */
    public final int m12960l() {
        int i2 = this.f23918d;
        if (i2 != 0) {
            return this.f23917c[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: m */
    public final void m12961m(int i2) {
        int i3 = this.f23918d;
        int[] iArr = this.f23917c;
        if (i3 == iArr.length) {
            this.f23917c = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.f23917c;
        int i4 = this.f23918d;
        this.f23918d = i4 + 1;
        iArr2[i4] = i2;
    }

    /* renamed from: n */
    public final void m12962n(int i2) {
        this.f23917c[this.f23918d - 1] = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12963o(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f23922h
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.google.gson.stream.JsonWriter.f23915l
            goto L9
        L7:
            java.lang.String[] r0 = com.google.gson.stream.JsonWriter.f23914k
        L9:
            java.io.Writer r1 = r8.f23916b
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f23916b
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f23916b
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f23916b
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f23916b
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonWriter.m12963o(java.lang.String):void");
    }

    /* renamed from: p */
    public JsonWriter mo12924p(long j2) throws IOException {
        m12956A();
        m12957a();
        this.f23916b.write(Long.toString(j2));
        return this;
    }

    /* renamed from: q */
    public JsonWriter mo12925q(Boolean bool) throws IOException {
        if (bool == null) {
            return mo12923k();
        }
        m12956A();
        m12957a();
        this.f23916b.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* renamed from: u */
    public JsonWriter mo12926u(Number number) throws IOException {
        if (number == null) {
            return mo12923k();
        }
        m12956A();
        String obj = number.toString();
        if (this.f23921g || !(obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            m12957a();
            this.f23916b.append((CharSequence) obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    /* renamed from: v */
    public JsonWriter mo12927v(String str) throws IOException {
        if (str == null) {
            return mo12923k();
        }
        m12956A();
        m12957a();
        m12963o(str);
        return this;
    }

    /* renamed from: w */
    public JsonWriter mo12928w(boolean z) throws IOException {
        m12956A();
        m12957a();
        this.f23916b.write(z ? "true" : "false");
        return this;
    }
}
