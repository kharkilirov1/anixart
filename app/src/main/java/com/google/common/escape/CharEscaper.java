package com.google.common.escape;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import java.util.Objects;

@Beta
@GwtCompatible
/* loaded from: classes.dex */
public abstract class CharEscaper extends Escaper {
    @Override // com.google.common.escape.Escaper
    /* renamed from: a */
    public String mo11970a(String str) {
        Objects.requireNonNull(str);
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (mo11971b(str.charAt(i2)) != null) {
                return m11976c(str, i2);
            }
        }
        return str;
    }

    /* renamed from: b */
    public abstract char[] mo11971b(char c2);

    /* renamed from: c */
    public final String m11976c(String str, int i2) {
        int length = str.length();
        char[] cArr = Platform.f21669a.get();
        int length2 = cArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            char[] mo11971b = mo11971b(str.charAt(i2));
            if (mo11971b != null) {
                int length3 = mo11971b.length;
                int i5 = i2 - i3;
                int i6 = i4 + i5;
                int i7 = i6 + length3;
                if (length2 < i7) {
                    length2 = ((length - i2) * 2) + i7;
                    if (length2 < 0) {
                        throw new AssertionError("Cannot increase internal buffer any further");
                    }
                    char[] cArr2 = new char[length2];
                    if (i4 > 0) {
                        System.arraycopy(cArr, 0, cArr2, 0, i4);
                    }
                    cArr = cArr2;
                }
                if (i5 > 0) {
                    str.getChars(i3, i2, cArr, i4);
                    i4 = i6;
                }
                if (length3 > 0) {
                    System.arraycopy(mo11971b, 0, cArr, i4, length3);
                    i4 += length3;
                }
                i3 = i2 + 1;
            }
            i2++;
        }
        int i8 = length - i3;
        if (i8 > 0) {
            int i9 = i8 + i4;
            if (length2 < i9) {
                if (i9 < 0) {
                    throw new AssertionError("Cannot increase internal buffer any further");
                }
                char[] cArr3 = new char[i9];
                if (i4 > 0) {
                    System.arraycopy(cArr, 0, cArr3, 0, i4);
                }
                cArr = cArr3;
            }
            str.getChars(i3, length, cArr, i4);
            i4 = i9;
        }
        return new String(cArr, 0, i4);
    }
}
