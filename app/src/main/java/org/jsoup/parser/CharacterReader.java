package org.jsoup.parser;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.annotation.Nullable;
import org.jsoup.UncheckedIOException;
import org.jsoup.helper.Validate;

/* loaded from: classes3.dex */
public final class CharacterReader {

    /* renamed from: a */
    public char[] f69017a;

    /* renamed from: b */
    public Reader f69018b;

    /* renamed from: c */
    public int f69019c;

    /* renamed from: d */
    public int f69020d;

    /* renamed from: e */
    public int f69021e;

    /* renamed from: f */
    public int f69022f;

    /* renamed from: g */
    public int f69023g = -1;

    /* renamed from: h */
    public String[] f69024h = new String[RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN];

    /* renamed from: i */
    @Nullable
    public ArrayList<Integer> f69025i = null;

    /* renamed from: j */
    public int f69026j = 1;

    /* renamed from: k */
    public boolean f69027k;

    /* renamed from: l */
    @Nullable
    public String f69028l;

    /* renamed from: m */
    public int f69029m;

    public CharacterReader(Reader reader, int i2) {
        Validate.m34694g(reader);
        Validate.m34690c(reader.markSupported());
        this.f69018b = reader;
        this.f69017a = new char[Math.min(i2, 32768)];
        m34807b();
    }

    /* renamed from: c */
    public static String m34800c(char[] cArr, String[] strArr, int i2, int i3) {
        if (i3 > 12) {
            return new String(cArr, i2, i3);
        }
        boolean z = true;
        if (i3 < 1) {
            return "";
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 = (i4 * 31) + cArr[i2 + i5];
        }
        int i6 = i4 & 511;
        String str = strArr[i6];
        if (str != null) {
            if (i3 == str.length()) {
                int i7 = i2;
                int i8 = i3;
                int i9 = 0;
                while (true) {
                    int i10 = i8 - 1;
                    if (i8 == 0) {
                        break;
                    }
                    int i11 = i7 + 1;
                    int i12 = i9 + 1;
                    if (cArr[i7] != str.charAt(i9)) {
                        break;
                    }
                    i7 = i11;
                    i8 = i10;
                    i9 = i12;
                }
            }
            z = false;
            if (z) {
                return str;
            }
        }
        String str2 = new String(cArr, i2, i3);
        strArr[i6] = str2;
        return str2;
    }

    /* renamed from: A */
    public int m34801A(CharSequence charSequence) {
        m34807b();
        char charAt = charSequence.charAt(0);
        int i2 = this.f69021e;
        while (i2 < this.f69019c) {
            if (charAt != this.f69017a[i2]) {
                do {
                    i2++;
                    if (i2 >= this.f69019c) {
                        break;
                    }
                } while (charAt != this.f69017a[i2]);
            }
            int i3 = i2 + 1;
            int length = (charSequence.length() + i3) - 1;
            int i4 = this.f69019c;
            if (i2 < i4 && length <= i4) {
                int i5 = i3;
                for (int i6 = 1; i5 < length && charSequence.charAt(i6) == this.f69017a[i5]; i6++) {
                    i5++;
                }
                if (i5 == length) {
                    return i2 - this.f69021e;
                }
            }
            i2 = i3;
        }
        return -1;
    }

    /* renamed from: B */
    public int m34802B() {
        return this.f69022f + this.f69021e;
    }

    /* renamed from: C */
    public void m34803C() {
        int i2 = this.f69023g;
        if (i2 == -1) {
            throw new UncheckedIOException(new IOException("Mark invalid"));
        }
        this.f69021e = i2;
        this.f69023g = -1;
    }

    /* renamed from: D */
    public final void m34804D() {
        if (m34822r()) {
            if (this.f69025i.size() > 0) {
                int m34823s = m34823s(this.f69022f);
                if (m34823s == -1) {
                    m34823s = 0;
                }
                int intValue = this.f69025i.get(m34823s).intValue();
                this.f69026j += m34823s;
                this.f69025i.clear();
                this.f69025i.add(Integer.valueOf(intValue));
            }
            for (int i2 = this.f69021e; i2 < this.f69019c; i2++) {
                if (this.f69017a[i2] == '\n') {
                    this.f69025i.add(Integer.valueOf(this.f69022f + 1 + i2));
                }
            }
        }
    }

    /* renamed from: E */
    public void m34805E() {
        int i2 = this.f69021e;
        if (i2 < 1) {
            throw new UncheckedIOException(new IOException("WTF: No buffer left to unconsume."));
        }
        this.f69021e = i2 - 1;
    }

    /* renamed from: a */
    public void m34806a() {
        this.f69021e++;
    }

    /* renamed from: b */
    public final void m34807b() {
        int i2;
        int i3;
        boolean z;
        if (this.f69027k || (i2 = this.f69021e) < this.f69020d) {
            return;
        }
        int i4 = this.f69023g;
        if (i4 != -1) {
            i3 = i2 - i4;
            i2 = i4;
        } else {
            i3 = 0;
        }
        try {
            long j2 = i2;
            long skip = this.f69018b.skip(j2);
            this.f69018b.mark(32768);
            int i5 = 0;
            while (true) {
                z = true;
                if (i5 > 1024) {
                    break;
                }
                Reader reader = this.f69018b;
                char[] cArr = this.f69017a;
                int read = reader.read(cArr, i5, cArr.length - i5);
                if (read == -1) {
                    this.f69027k = true;
                }
                if (read <= 0) {
                    break;
                } else {
                    i5 += read;
                }
            }
            this.f69018b.reset();
            if (i5 > 0) {
                if (skip != j2) {
                    z = false;
                }
                Validate.m34690c(z);
                this.f69019c = i5;
                this.f69022f += i2;
                this.f69021e = i3;
                if (this.f69023g != -1) {
                    this.f69023g = 0;
                }
                this.f69020d = Math.min(i5, 24576);
            }
            m34804D();
            this.f69028l = null;
        } catch (IOException e2) {
            throw new UncheckedIOException(e2);
        }
    }

    /* renamed from: d */
    public void m34808d() {
        Reader reader = this.f69018b;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.f69018b = null;
            this.f69017a = null;
            this.f69024h = null;
            throw th;
        }
        this.f69018b = null;
        this.f69017a = null;
        this.f69024h = null;
    }

    /* renamed from: e */
    public int m34809e(int i2) {
        int m34823s;
        if (m34822r() && (m34823s = m34823s(i2)) != -1) {
            return (i2 - this.f69025i.get(m34823s).intValue()) + 1;
        }
        return i2 + 1;
    }

    /* renamed from: f */
    public char m34810f() {
        m34807b();
        char c2 = m34821q() ? (char) 65535 : this.f69017a[this.f69021e];
        this.f69021e++;
        return c2;
    }

    /* renamed from: g */
    public String m34811g(boolean z) {
        int i2 = this.f69021e;
        int i3 = this.f69019c;
        char[] cArr = this.f69017a;
        int i4 = i2;
        while (i4 < i3) {
            char c2 = cArr[i4];
            if (c2 == 0) {
                break;
            }
            if (c2 != '\"') {
                if (c2 == '&') {
                    break;
                }
                if (c2 != '\'') {
                    continue;
                    i4++;
                } else if (z) {
                    break;
                }
            }
            if (!z) {
                break;
            }
            i4++;
        }
        this.f69021e = i4;
        return i4 > i2 ? m34800c(this.f69017a, this.f69024h, i2, i4 - i2) : "";
    }

    /* renamed from: h */
    public String m34812h() {
        int i2 = this.f69021e;
        int i3 = this.f69019c;
        char[] cArr = this.f69017a;
        int i4 = i2;
        while (i4 < i3) {
            char c2 = cArr[i4];
            if (c2 == 0 || c2 == '&' || c2 == '<') {
                break;
            }
            i4++;
        }
        this.f69021e = i4;
        return i4 > i2 ? m34800c(this.f69017a, this.f69024h, i2, i4 - i2) : "";
    }

    /* renamed from: i */
    public String m34813i() {
        char c2;
        m34807b();
        int i2 = this.f69021e;
        while (true) {
            int i3 = this.f69021e;
            if (i3 >= this.f69019c || (((c2 = this.f69017a[i3]) < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !Character.isLetter(c2)))) {
                break;
            }
            this.f69021e++;
        }
        return m34800c(this.f69017a, this.f69024h, i2, this.f69021e - i2);
    }

    /* renamed from: j */
    public String m34814j(char c2) {
        int i2;
        m34807b();
        int i3 = this.f69021e;
        while (true) {
            if (i3 >= this.f69019c) {
                i2 = -1;
                break;
            }
            if (c2 == this.f69017a[i3]) {
                i2 = i3 - this.f69021e;
                break;
            }
            i3++;
        }
        if (i2 == -1) {
            return m34817m();
        }
        String m34800c = m34800c(this.f69017a, this.f69024h, this.f69021e, i2);
        this.f69021e += i2;
        return m34800c;
    }

    /* renamed from: k */
    public String m34815k(char... cArr) {
        m34807b();
        int i2 = this.f69021e;
        int i3 = this.f69019c;
        char[] cArr2 = this.f69017a;
        int i4 = i2;
        loop0: while (i4 < i3) {
            for (char c2 : cArr) {
                if (cArr2[i4] == c2) {
                    break loop0;
                }
            }
            i4++;
        }
        this.f69021e = i4;
        return i4 > i2 ? m34800c(this.f69017a, this.f69024h, i2, i4 - i2) : "";
    }

    /* renamed from: l */
    public String m34816l(char... cArr) {
        m34807b();
        int i2 = this.f69021e;
        int i3 = this.f69019c;
        char[] cArr2 = this.f69017a;
        int i4 = i2;
        while (i4 < i3 && Arrays.binarySearch(cArr, cArr2[i4]) < 0) {
            i4++;
        }
        this.f69021e = i4;
        return i4 > i2 ? m34800c(this.f69017a, this.f69024h, i2, i4 - i2) : "";
    }

    /* renamed from: m */
    public String m34817m() {
        m34807b();
        char[] cArr = this.f69017a;
        String[] strArr = this.f69024h;
        int i2 = this.f69021e;
        String m34800c = m34800c(cArr, strArr, i2, this.f69019c - i2);
        this.f69021e = this.f69019c;
        return m34800c;
    }

    /* renamed from: n */
    public char m34818n() {
        m34807b();
        if (m34821q()) {
            return (char) 65535;
        }
        return this.f69017a[this.f69021e];
    }

    /* renamed from: o */
    public String m34819o() {
        return m34824t(m34802B()) + ":" + m34809e(m34802B());
    }

    /* renamed from: p */
    public boolean m34820p() {
        m34807b();
        return this.f69021e >= this.f69019c;
    }

    /* renamed from: q */
    public final boolean m34821q() {
        return this.f69021e >= this.f69019c;
    }

    /* renamed from: r */
    public boolean m34822r() {
        return this.f69025i != null;
    }

    /* renamed from: s */
    public final int m34823s(int i2) {
        if (!m34822r()) {
            return 0;
        }
        int binarySearch = Collections.binarySearch(this.f69025i, Integer.valueOf(i2));
        return binarySearch < -1 ? Math.abs(binarySearch) - 2 : binarySearch;
    }

    /* renamed from: t */
    public int m34824t(int i2) {
        if (!m34822r()) {
            return 1;
        }
        int m34823s = m34823s(i2);
        return m34823s == -1 ? this.f69026j : m34823s + this.f69026j + 1;
    }

    public String toString() {
        int i2 = this.f69019c;
        int i3 = this.f69021e;
        return i2 - i3 < 0 ? "" : new String(this.f69017a, i3, i2 - i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[RETURN] */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m34825u(java.lang.String r8) {
        /*
            r7 = this;
            r7.m34807b()
            r7.m34807b()
            int r0 = r8.length()
            int r1 = r7.f69019c
            int r2 = r7.f69021e
            int r1 = r1 - r2
            r2 = 0
            r3 = 1
            if (r0 <= r1) goto L14
            goto L24
        L14:
            r1 = 0
        L15:
            if (r1 >= r0) goto L29
            char r4 = r8.charAt(r1)
            char[] r5 = r7.f69017a
            int r6 = r7.f69021e
            int r6 = r6 + r1
            char r5 = r5[r6]
            if (r4 == r5) goto L26
        L24:
            r0 = 0
            goto L2a
        L26:
            int r1 = r1 + 1
            goto L15
        L29:
            r0 = 1
        L2a:
            if (r0 == 0) goto L36
            int r0 = r7.f69021e
            int r8 = r8.length()
            int r8 = r8 + r0
            r7.f69021e = r8
            return r3
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.CharacterReader.m34825u(java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b A[RETURN] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m34826v(java.lang.String r8) {
        /*
            r7 = this;
            r7.m34807b()
            int r0 = r8.length()
            int r1 = r7.f69019c
            int r2 = r7.f69021e
            int r1 = r1 - r2
            r2 = 0
            r3 = 1
            if (r0 <= r1) goto L11
            goto L29
        L11:
            r1 = 0
        L12:
            if (r1 >= r0) goto L2e
            char r4 = r8.charAt(r1)
            char r4 = java.lang.Character.toUpperCase(r4)
            char[] r5 = r7.f69017a
            int r6 = r7.f69021e
            int r6 = r6 + r1
            char r5 = r5[r6]
            char r5 = java.lang.Character.toUpperCase(r5)
            if (r4 == r5) goto L2b
        L29:
            r0 = 0
            goto L2f
        L2b:
            int r1 = r1 + 1
            goto L12
        L2e:
            r0 = 1
        L2f:
            if (r0 == 0) goto L3b
            int r0 = r7.f69021e
            int r8 = r8.length()
            int r8 = r8 + r0
            r7.f69021e = r8
            return r3
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.CharacterReader.m34826v(java.lang.String):boolean");
    }

    /* renamed from: w */
    public boolean m34827w(char c2) {
        return !m34820p() && this.f69017a[this.f69021e] == c2;
    }

    /* renamed from: x */
    public boolean m34828x(char... cArr) {
        if (m34820p()) {
            return false;
        }
        m34807b();
        char c2 = this.f69017a[this.f69021e];
        for (char c3 : cArr) {
            if (c3 == c2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public boolean m34829y() {
        if (m34820p()) {
            return false;
        }
        char c2 = this.f69017a[this.f69021e];
        return (c2 >= 'A' && c2 <= 'Z') || (c2 >= 'a' && c2 <= 'z');
    }

    /* renamed from: z */
    public boolean m34830z() {
        if (m34820p()) {
            return false;
        }
        char c2 = this.f69017a[this.f69021e];
        return (c2 >= 'A' && c2 <= 'Z') || (c2 >= 'a' && c2 <= 'z') || Character.isLetter(c2);
    }
}
