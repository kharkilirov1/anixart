package com.airbnb.lottie.parser.moshi;

import androidx.emoji2.text.flatbuffer.C0321a;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.BufferedSource;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class JsonReader implements Closeable {

    /* renamed from: f */
    public static final String[] f7773f = new String[128];

    /* renamed from: b */
    public int f7774b;

    /* renamed from: c */
    public int[] f7775c = new int[32];

    /* renamed from: d */
    public String[] f7776d = new String[32];

    /* renamed from: e */
    public int[] f7777e = new int[32];

    public static final class Options {

        /* renamed from: a */
        public final String[] f7778a;

        /* renamed from: b */
        public final okio.Options f7779b;

        public Options(String[] strArr, okio.Options options) {
            this.f7778a = strArr;
            this.f7779b = options;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[Catch: IOException -> 0x006b, TryCatch #0 {IOException -> 0x006b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:13:0x0042, B:15:0x003a, B:16:0x003d, B:27:0x0047, B:29:0x004a, B:32:0x0059), top: B:1:0x0000 }] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.airbnb.lottie.parser.moshi.JsonReader.Options m4804a(java.lang.String... r12) {
            /*
                int r0 = r12.length     // Catch: java.io.IOException -> L6b
                okio.ByteString[] r0 = new okio.ByteString[r0]     // Catch: java.io.IOException -> L6b
                okio.Buffer r1 = new okio.Buffer     // Catch: java.io.IOException -> L6b
                r1.<init>()     // Catch: java.io.IOException -> L6b
                r2 = 0
                r3 = 0
            La:
                int r4 = r12.length     // Catch: java.io.IOException -> L6b
                if (r3 >= r4) goto L59
                r4 = r12[r3]     // Catch: java.io.IOException -> L6b
                java.lang.String[] r5 = com.airbnb.lottie.parser.moshi.JsonReader.f7773f     // Catch: java.io.IOException -> L6b
                r6 = 34
                r1.m34524Q(r6)     // Catch: java.io.IOException -> L6b
                int r7 = r4.length()     // Catch: java.io.IOException -> L6b
                r8 = 0
                r9 = 0
            L1c:
                if (r8 >= r7) goto L45
                char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L6b
                r11 = 128(0x80, float:1.8E-43)
                if (r10 >= r11) goto L2b
                r10 = r5[r10]     // Catch: java.io.IOException -> L6b
                if (r10 != 0) goto L38
                goto L42
            L2b:
                r11 = 8232(0x2028, float:1.1535E-41)
                if (r10 != r11) goto L32
                java.lang.String r10 = "\\u2028"
                goto L38
            L32:
                r11 = 8233(0x2029, float:1.1537E-41)
                if (r10 != r11) goto L42
                java.lang.String r10 = "\\u2029"
            L38:
                if (r9 >= r8) goto L3d
                r1.m34522O0(r4, r9, r8)     // Catch: java.io.IOException -> L6b
            L3d:
                r1.m34516D0(r10)     // Catch: java.io.IOException -> L6b
                int r9 = r8 + 1
            L42:
                int r8 = r8 + 1
                goto L1c
            L45:
                if (r9 >= r7) goto L4a
                r1.m34522O0(r4, r9, r7)     // Catch: java.io.IOException -> L6b
            L4a:
                r1.m34524Q(r6)     // Catch: java.io.IOException -> L6b
                r1.readByte()     // Catch: java.io.IOException -> L6b
                okio.ByteString r4 = r1.mo34515B0()     // Catch: java.io.IOException -> L6b
                r0[r3] = r4     // Catch: java.io.IOException -> L6b
                int r3 = r3 + 1
                goto La
            L59:
                com.airbnb.lottie.parser.moshi.JsonReader$Options r1 = new com.airbnb.lottie.parser.moshi.JsonReader$Options     // Catch: java.io.IOException -> L6b
                java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L6b
                java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L6b
                okio.Options$Companion r2 = okio.Options.f68774e     // Catch: java.io.IOException -> L6b
                okio.Options r0 = r2.m34611c(r0)     // Catch: java.io.IOException -> L6b
                r1.<init>(r12, r0)     // Catch: java.io.IOException -> L6b
                return r1
            L6b:
                r12 = move-exception
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>(r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.JsonReader.Options.m4804a(java.lang.String[]):com.airbnb.lottie.parser.moshi.JsonReader$Options");
        }
    }

    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f7773f[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = f7773f;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* renamed from: m */
    public static JsonReader m4786m(BufferedSource bufferedSource) {
        return new JsonUtf8Reader(bufferedSource);
    }

    /* renamed from: a */
    public abstract void mo4787a() throws IOException;

    /* renamed from: b */
    public abstract void mo4788b() throws IOException;

    /* renamed from: c */
    public abstract void mo4789c() throws IOException;

    /* renamed from: e */
    public abstract void mo4790e() throws IOException;

    /* renamed from: g */
    public abstract boolean mo4791g() throws IOException;

    /* renamed from: h */
    public abstract boolean mo4792h() throws IOException;

    /* renamed from: i */
    public abstract double mo4793i() throws IOException;

    /* renamed from: j */
    public abstract int mo4794j() throws IOException;

    /* renamed from: k */
    public abstract String mo4795k() throws IOException;

    /* renamed from: l */
    public abstract String mo4796l() throws IOException;

    /* renamed from: n */
    public abstract Token mo4797n() throws IOException;

    /* renamed from: o */
    public final void m4798o(int i2) {
        int i3 = this.f7774b;
        int[] iArr = this.f7775c;
        if (i3 == iArr.length) {
            if (i3 == 256) {
                StringBuilder m24u = C0000a.m24u("Nesting too deep at ");
                m24u.append(m4801t());
                throw new JsonDataException(m24u.toString());
            }
            this.f7775c = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f7776d;
            this.f7776d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f7777e;
            this.f7777e = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f7775c;
        int i4 = this.f7774b;
        this.f7774b = i4 + 1;
        iArr3[i4] = i2;
    }

    /* renamed from: p */
    public abstract int mo4799p(Options options) throws IOException;

    /* renamed from: q */
    public abstract void mo4800q() throws IOException;

    /* renamed from: t */
    public final String m4801t() {
        int i2 = this.f7774b;
        int[] iArr = this.f7775c;
        String[] strArr = this.f7776d;
        int[] iArr2 = this.f7777e;
        StringBuilder m2872a = C0321a.m2872a('$');
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = iArr[i3];
            if (i4 == 1 || i4 == 2) {
                m2872a.append('[');
                m2872a.append(iArr2[i3]);
                m2872a.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                m2872a.append('.');
                if (strArr[i3] != null) {
                    m2872a.append(strArr[i3]);
                }
            }
        }
        return m2872a.toString();
    }

    /* renamed from: u */
    public abstract void mo4802u() throws IOException;

    /* renamed from: v */
    public final JsonEncodingException m4803v(String str) throws JsonEncodingException {
        StringBuilder m27x = C0000a.m27x(str, " at path ");
        m27x.append(m4801t());
        throw new JsonEncodingException(m27x.toString());
    }
}
