package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

/* loaded from: classes3.dex */
public class TokenQueue {

    /* renamed from: a */
    public String f69171a;

    /* renamed from: b */
    public int f69172b = 0;

    public TokenQueue(String str) {
        Validate.m34694g(str);
        this.f69171a = str;
    }

    /* renamed from: m */
    public static String m34919m(String str) {
        StringBuilder m34700b = StringUtil.m34700b();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = 0;
        char c2 = 0;
        while (i2 < length) {
            char c3 = charArray[i2];
            if (c3 != '\\') {
                m34700b.append(c3);
            } else if (c2 == '\\') {
                m34700b.append(c3);
            }
            i2++;
            c2 = c3;
        }
        return StringUtil.m34705g(m34700b);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[LOOP:0: B:2:0x0008->B:24:0x0071, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055 A[EDGE_INSN: B:25:0x0055->B:26:0x0055 BREAK  A[LOOP:0: B:2:0x0008->B:24:0x0071], SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m34920a(char r11, char r12) {
        /*
            r10 = this;
            r0 = -1
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = -1
            r5 = -1
            r6 = 0
            r7 = 0
        L8:
            boolean r8 = r10.m34926g()
            if (r8 == 0) goto Lf
            goto L55
        Lf:
            char r8 = r10.m34921b()
            r9 = 92
            if (r1 == r9) goto L41
            r9 = 39
            if (r8 != r9) goto L22
            if (r8 == r11) goto L22
            if (r2 != 0) goto L22
            r3 = r3 ^ 1
            goto L2c
        L22:
            r9 = 34
            if (r8 != r9) goto L2c
            if (r8 == r11) goto L2c
            if (r3 != 0) goto L2c
            r2 = r2 ^ 1
        L2c:
            if (r3 != 0) goto L53
            if (r2 != 0) goto L53
            if (r7 == 0) goto L33
            goto L53
        L33:
            if (r8 != r11) goto L3c
            int r6 = r6 + 1
            if (r4 != r0) goto L4c
            int r4 = r10.f69172b
            goto L4c
        L3c:
            if (r8 != r12) goto L4c
            int r6 = r6 + (-1)
            goto L4c
        L41:
            r9 = 81
            if (r8 != r9) goto L47
            r7 = 1
            goto L4c
        L47:
            r9 = 69
            if (r8 != r9) goto L4c
            r7 = 0
        L4c:
            if (r6 <= 0) goto L53
            if (r1 == 0) goto L53
            int r1 = r10.f69172b
            r5 = r1
        L53:
            if (r6 > 0) goto L71
        L55:
            if (r5 < 0) goto L5e
            java.lang.String r11 = r10.f69171a
            java.lang.String r11 = r11.substring(r4, r5)
            goto L60
        L5e:
            java.lang.String r11 = ""
        L60:
            if (r6 > 0) goto L63
            return r11
        L63:
            java.lang.String r12 = "Did not find balanced marker at '"
            java.lang.String r0 = "'"
            java.lang.String r11 = p000a.C0000a.m16m(r12, r11, r0)
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>(r11)
            throw r12
        L71:
            r1 = r8
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.TokenQueue.m34920a(char, char):java.lang.String");
    }

    /* renamed from: b */
    public char m34921b() {
        String str = this.f69171a;
        int i2 = this.f69172b;
        this.f69172b = i2 + 1;
        return str.charAt(i2);
    }

    /* renamed from: c */
    public void m34922c(String str) {
        if (!m34928i(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        int length2 = this.f69171a.length();
        int i2 = this.f69172b;
        if (length > length2 - i2) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.f69172b = i2 + length;
    }

    /* renamed from: d */
    public String m34923d() {
        int i2 = this.f69172b;
        while (!m34926g()) {
            if (!m34930k()) {
                char[] cArr = {'-', '_'};
                boolean z = false;
                if (!m34926g()) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 2) {
                            break;
                        }
                        if (this.f69171a.charAt(this.f69172b) == cArr[i3]) {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                }
                if (!z) {
                    break;
                }
            }
            this.f69172b++;
        }
        return this.f69171a.substring(i2, this.f69172b);
    }

    /* renamed from: e */
    public String m34924e(String str) {
        int indexOf = this.f69171a.indexOf(str, this.f69172b);
        if (indexOf == -1) {
            return m34931l();
        }
        String substring = this.f69171a.substring(this.f69172b, indexOf);
        this.f69172b = substring.length() + this.f69172b;
        return substring;
    }

    /* renamed from: f */
    public boolean m34925f() {
        boolean z = false;
        while (true) {
            if (!(!m34926g() && StringUtil.m34703e(this.f69171a.charAt(this.f69172b)))) {
                return z;
            }
            this.f69172b++;
            z = true;
        }
    }

    /* renamed from: g */
    public boolean m34926g() {
        return this.f69171a.length() - this.f69172b == 0;
    }

    /* renamed from: h */
    public boolean m34927h(String str) {
        if (!m34928i(str)) {
            return false;
        }
        this.f69172b = str.length() + this.f69172b;
        return true;
    }

    /* renamed from: i */
    public boolean m34928i(String str) {
        return this.f69171a.regionMatches(true, this.f69172b, str, 0, str.length());
    }

    /* renamed from: j */
    public boolean m34929j(String... strArr) {
        for (String str : strArr) {
            if (m34928i(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public boolean m34930k() {
        return !m34926g() && Character.isLetterOrDigit(this.f69171a.charAt(this.f69172b));
    }

    /* renamed from: l */
    public String m34931l() {
        String substring = this.f69171a.substring(this.f69172b);
        this.f69172b = this.f69171a.length();
        return substring;
    }

    public String toString() {
        return this.f69171a.substring(this.f69172b);
    }
}
