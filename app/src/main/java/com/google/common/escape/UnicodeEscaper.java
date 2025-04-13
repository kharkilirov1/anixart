package com.google.common.escape;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import java.util.Objects;

@Beta
@GwtCompatible
/* loaded from: classes.dex */
public abstract class UnicodeEscaper extends Escaper {
    /* renamed from: b */
    public static int m11979b(CharSequence charSequence, int i2, int i3) {
        Objects.requireNonNull(charSequence);
        if (i2 >= i3) {
            throw new IndexOutOfBoundsException("Index exceeds specified range");
        }
        int i4 = i2 + 1;
        char charAt = charSequence.charAt(i2);
        if (charAt < 55296 || charAt > 57343) {
            return charAt;
        }
        if (charAt > 56319) {
            String valueOf = String.valueOf(charSequence);
            StringBuilder sb = new StringBuilder(valueOf.length() + 88);
            sb.append("Unexpected low surrogate character '");
            sb.append(charAt);
            sb.append("' with value ");
            sb.append((int) charAt);
            sb.append(" at index ");
            sb.append(i4 - 1);
            sb.append(" in '");
            sb.append(valueOf);
            sb.append("'");
            throw new IllegalArgumentException(sb.toString());
        }
        if (i4 == i3) {
            return -charAt;
        }
        char charAt2 = charSequence.charAt(i4);
        if (Character.isLowSurrogate(charAt2)) {
            return Character.toCodePoint(charAt, charAt2);
        }
        String valueOf2 = String.valueOf(charSequence);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 89);
        sb2.append("Expected low surrogate but got char '");
        sb2.append(charAt2);
        sb2.append("' with value ");
        sb2.append((int) charAt2);
        sb2.append(" at index ");
        sb2.append(i4);
        sb2.append(" in '");
        sb2.append(valueOf2);
        sb2.append("'");
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // com.google.common.escape.Escaper
    /* renamed from: a */
    public String mo11970a(String str) {
        Objects.requireNonNull(str);
        int length = str.length();
        int mo11974e = mo11974e(str, 0, length);
        return mo11974e == length ? str : m11980d(str, mo11974e);
    }

    /* renamed from: c */
    public abstract char[] mo11973c(int i2);

    /* renamed from: d */
    public final String m11980d(String str, int i2) {
        int length = str.length();
        char[] cArr = Platform.f21669a.get();
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int m11979b = m11979b(str, i2, length);
            if (m11979b < 0) {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
            char[] mo11973c = mo11973c(m11979b);
            int i5 = (Character.isSupplementaryCodePoint(m11979b) ? 2 : 1) + i2;
            if (mo11973c != null) {
                int i6 = i2 - i3;
                int i7 = i4 + i6;
                int length2 = mo11973c.length + i7;
                if (cArr.length < length2) {
                    int i8 = (length - i2) + length2 + 32;
                    if (i8 < 0) {
                        throw new AssertionError("Cannot increase internal buffer any further");
                    }
                    char[] cArr2 = new char[i8];
                    if (i4 > 0) {
                        System.arraycopy(cArr, 0, cArr2, 0, i4);
                    }
                    cArr = cArr2;
                }
                if (i6 > 0) {
                    str.getChars(i3, i2, cArr, i4);
                    i4 = i7;
                }
                if (mo11973c.length > 0) {
                    System.arraycopy(mo11973c, 0, cArr, i4, mo11973c.length);
                    i4 += mo11973c.length;
                }
                i3 = i5;
            }
            i2 = mo11974e(str, i5, length);
        }
        int i9 = length - i3;
        if (i9 > 0) {
            int i10 = i9 + i4;
            if (cArr.length < i10) {
                if (i10 < 0) {
                    throw new AssertionError("Cannot increase internal buffer any further");
                }
                char[] cArr3 = new char[i10];
                if (i4 > 0) {
                    System.arraycopy(cArr, 0, cArr3, 0, i4);
                }
                cArr = cArr3;
            }
            str.getChars(i3, length, cArr, i4);
            i4 = i10;
        }
        return new String(cArr, 0, i4);
    }

    /* renamed from: e */
    public int mo11974e(CharSequence charSequence, int i2, int i3) {
        while (i2 < i3) {
            int m11979b = m11979b(charSequence, i2, i3);
            if (m11979b < 0 || mo11973c(m11979b) != null) {
                break;
            }
            i2 += Character.isSupplementaryCodePoint(m11979b) ? 2 : 1;
        }
        return i2;
    }
}
