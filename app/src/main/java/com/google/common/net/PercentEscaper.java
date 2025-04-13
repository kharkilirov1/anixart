package com.google.common.net;

import androidx.room.util.C0576a;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.escape.UnicodeEscaper;
import java.util.Objects;

@Beta
@GwtCompatible
/* loaded from: classes2.dex */
public final class PercentEscaper extends UnicodeEscaper {

    /* renamed from: c */
    public static final char[] f21901c = {'+'};

    /* renamed from: d */
    public static final char[] f21902d = "0123456789ABCDEF".toCharArray();

    /* renamed from: a */
    public final boolean f21903a;

    /* renamed from: b */
    public final boolean[] f21904b;

    public PercentEscaper(String str, boolean z) {
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        String concat = str.concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        if (z && concat.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        this.f21903a = z;
        char[] charArray = concat.toCharArray();
        int i2 = -1;
        for (char c2 : charArray) {
            i2 = Math.max((int) c2, i2);
        }
        boolean[] zArr = new boolean[i2 + 1];
        for (char c3 : charArray) {
            zArr[c3] = true;
        }
        this.f21904b = zArr;
    }

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    /* renamed from: a */
    public String mo11970a(String str) {
        Objects.requireNonNull(str);
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            boolean[] zArr = this.f21904b;
            if (charAt >= zArr.length || !zArr[charAt]) {
                return m11980d(str, i2);
            }
        }
        return str;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    /* renamed from: c */
    public char[] mo11973c(int i2) {
        boolean[] zArr = this.f21904b;
        if (i2 < zArr.length && zArr[i2]) {
            return null;
        }
        if (i2 == 32 && this.f21903a) {
            return f21901c;
        }
        if (i2 <= 127) {
            char[] cArr = f21902d;
            return new char[]{'%', cArr[i2 >>> 4], cArr[i2 & 15]};
        }
        if (i2 <= 2047) {
            char[] cArr2 = f21902d;
            char[] cArr3 = {'%', cArr2[(r14 >>> 4) | 12], cArr2[r14 & 15], '%', cArr2[(r14 & 3) | 8], cArr2[i2 & 15]};
            int i3 = i2 >>> 4;
            int i4 = i3 >>> 2;
            return cArr3;
        }
        if (i2 <= 65535) {
            char[] cArr4 = f21902d;
            char[] cArr5 = {'%', 'E', cArr4[r14 >>> 2], '%', cArr4[(r14 & 3) | 8], cArr4[r14 & 15], '%', cArr4[(r14 & 3) | 8], cArr4[i2 & 15]};
            int i5 = i2 >>> 4;
            int i6 = i5 >>> 2;
            int i7 = i6 >>> 4;
            return cArr5;
        }
        if (i2 > 1114111) {
            throw new IllegalArgumentException(C0576a.m4111j(43, "Invalid unicode character value ", i2));
        }
        char[] cArr6 = f21902d;
        char[] cArr7 = {'%', 'F', cArr6[(r14 >>> 2) & 7], '%', cArr6[(r14 & 3) | 8], cArr6[r14 & 15], '%', cArr6[(r14 & 3) | 8], cArr6[r14 & 15], '%', cArr6[(r14 & 3) | 8], cArr6[i2 & 15]};
        int i8 = i2 >>> 4;
        int i9 = i8 >>> 2;
        int i10 = i9 >>> 4;
        int i11 = i10 >>> 2;
        int i12 = i11 >>> 4;
        return cArr7;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    /* renamed from: e */
    public int mo11974e(CharSequence charSequence, int i2, int i3) {
        while (i2 < i3) {
            char charAt = charSequence.charAt(i2);
            boolean[] zArr = this.f21904b;
            if (charAt >= zArr.length || !zArr[charAt]) {
                break;
            }
            i2++;
        }
        return i2;
    }
}
