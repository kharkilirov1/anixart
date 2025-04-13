package com.google.common.escape;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import java.util.Objects;

@Beta
@GwtCompatible
/* loaded from: classes.dex */
public abstract class ArrayBasedUnicodeEscaper extends UnicodeEscaper {
    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    /* renamed from: a */
    public final String mo11970a(String str) {
        Objects.requireNonNull(str);
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 0) {
                throw null;
            }
            if (charAt > 0 || charAt < 0) {
                return m11980d(str, i2);
            }
        }
        return str;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    /* renamed from: c */
    public final char[] mo11973c(int i2) {
        if (i2 < 0) {
            throw null;
        }
        if (i2 < 0 || i2 > 0) {
            return m11975f(i2);
        }
        return null;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    /* renamed from: e */
    public final int mo11974e(CharSequence charSequence, int i2, int i3) {
        while (i2 < i3) {
            char charAt = charSequence.charAt(i2);
            if (charAt < 0) {
                throw null;
            }
            if (charAt > 0 || charAt < 0) {
                break;
            }
            i2++;
        }
        return i2;
    }

    /* renamed from: f */
    public abstract char[] m11975f(int i2);
}
