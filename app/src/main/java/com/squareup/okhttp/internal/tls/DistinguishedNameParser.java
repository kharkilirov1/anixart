package com.squareup.okhttp.internal.tls;

import com.yandex.mobile.ads.C4632R;
import javax.security.auth.x500.X500Principal;
import p000a.C0000a;

/* loaded from: classes2.dex */
final class DistinguishedNameParser {

    /* renamed from: a */
    public final String f25201a;

    /* renamed from: b */
    public final int f25202b;

    /* renamed from: c */
    public int f25203c;

    /* renamed from: d */
    public int f25204d;

    /* renamed from: e */
    public int f25205e;

    /* renamed from: f */
    public int f25206f;

    /* renamed from: g */
    public char[] f25207g;

    public DistinguishedNameParser(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f25201a = name;
        this.f25202b = name.length();
    }

    /* renamed from: a */
    public final int m14012a(int i2) {
        int i3;
        int i4;
        int i5 = i2 + 1;
        if (i5 >= this.f25202b) {
            StringBuilder m24u = C0000a.m24u("Malformed DN: ");
            m24u.append(this.f25201a);
            throw new IllegalStateException(m24u.toString());
        }
        char[] cArr = this.f25207g;
        char c2 = cArr[i2];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                StringBuilder m24u2 = C0000a.m24u("Malformed DN: ");
                m24u2.append(this.f25201a);
                throw new IllegalStateException(m24u2.toString());
            }
            i3 = c2 - '7';
        }
        char c3 = cArr[i5];
        if (c3 >= '0' && c3 <= '9') {
            i4 = c3 - '0';
        } else if (c3 >= 'a' && c3 <= 'f') {
            i4 = c3 - 'W';
        } else {
            if (c3 < 'A' || c3 > 'F') {
                StringBuilder m24u3 = C0000a.m24u("Malformed DN: ");
                m24u3.append(this.f25201a);
                throw new IllegalStateException(m24u3.toString());
            }
            i4 = c3 - '7';
        }
        return (i3 << 4) + i4;
    }

    /* renamed from: b */
    public final char m14013b() {
        int i2;
        int i3 = this.f25203c + 1;
        this.f25203c = i3;
        if (i3 == this.f25202b) {
            StringBuilder m24u = C0000a.m24u("Unexpected end of DN: ");
            m24u.append(this.f25201a);
            throw new IllegalStateException(m24u.toString());
        }
        char[] cArr = this.f25207g;
        char c2 = cArr[i3];
        if (c2 != ' ' && c2 != '%' && c2 != '\\' && c2 != '_' && c2 != '\"' && c2 != '#') {
            switch (c2) {
                case '*':
                case '+':
                case ',':
                    break;
                default:
                    switch (c2) {
                        case C4632R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                        case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                            break;
                        default:
                            int m14012a = m14012a(i3);
                            this.f25203c++;
                            if (m14012a >= 128) {
                                if (m14012a < 192 || m14012a > 247) {
                                    return '?';
                                }
                                if (m14012a <= 223) {
                                    m14012a &= 31;
                                    i2 = 1;
                                } else if (m14012a <= 239) {
                                    i2 = 2;
                                    m14012a &= 15;
                                } else {
                                    i2 = 3;
                                    m14012a &= 7;
                                }
                                for (int i4 = 0; i4 < i2; i4++) {
                                    int i5 = this.f25203c + 1;
                                    this.f25203c = i5;
                                    if (i5 == this.f25202b || this.f25207g[i5] != '\\') {
                                        return '?';
                                    }
                                    int i6 = i5 + 1;
                                    this.f25203c = i6;
                                    int m14012a2 = m14012a(i6);
                                    this.f25203c++;
                                    if ((m14012a2 & 192) != 128) {
                                        return '?';
                                    }
                                    m14012a = (m14012a << 6) + (m14012a2 & 63);
                                }
                            }
                            return (char) m14012a;
                    }
            }
        }
        return cArr[i3];
    }

    /* renamed from: c */
    public final String m14014c() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        while (true) {
            i2 = this.f25203c;
            i3 = this.f25202b;
            if (i2 >= i3 || this.f25207g[i2] != ' ') {
                break;
            }
            this.f25203c = i2 + 1;
        }
        if (i2 == i3) {
            return null;
        }
        this.f25204d = i2;
        this.f25203c = i2 + 1;
        while (true) {
            i4 = this.f25203c;
            i5 = this.f25202b;
            if (i4 >= i5) {
                break;
            }
            char[] cArr = this.f25207g;
            if (cArr[i4] == '=' || cArr[i4] == ' ') {
                break;
            }
            this.f25203c = i4 + 1;
        }
        if (i4 >= i5) {
            StringBuilder m24u = C0000a.m24u("Unexpected end of DN: ");
            m24u.append(this.f25201a);
            throw new IllegalStateException(m24u.toString());
        }
        this.f25205e = i4;
        if (this.f25207g[i4] == ' ') {
            while (true) {
                i6 = this.f25203c;
                i7 = this.f25202b;
                if (i6 >= i7) {
                    break;
                }
                char[] cArr2 = this.f25207g;
                if (cArr2[i6] == '=' || cArr2[i6] != ' ') {
                    break;
                }
                this.f25203c = i6 + 1;
            }
            if (this.f25207g[i6] != '=' || i6 == i7) {
                StringBuilder m24u2 = C0000a.m24u("Unexpected end of DN: ");
                m24u2.append(this.f25201a);
                throw new IllegalStateException(m24u2.toString());
            }
        }
        this.f25203c++;
        while (true) {
            int i8 = this.f25203c;
            if (i8 >= this.f25202b || this.f25207g[i8] != ' ') {
                break;
            }
            this.f25203c = i8 + 1;
        }
        int i9 = this.f25205e;
        int i10 = this.f25204d;
        if (i9 - i10 > 4) {
            char[] cArr3 = this.f25207g;
            if (cArr3[i10 + 3] == '.' && ((cArr3[i10] == 'O' || cArr3[i10] == 'o') && ((cArr3[i10 + 1] == 'I' || cArr3[i10 + 1] == 'i') && (cArr3[i10 + 2] == 'D' || cArr3[i10 + 2] == 'd')))) {
                this.f25204d = i10 + 4;
            }
        }
        char[] cArr4 = this.f25207g;
        int i11 = this.f25204d;
        return new String(cArr4, i11, i9 - i11);
    }
}
