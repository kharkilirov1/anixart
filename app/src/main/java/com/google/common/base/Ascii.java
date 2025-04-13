package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
/* loaded from: classes.dex */
public final class Ascii {
    /* renamed from: a */
    public static boolean m11121a(CharSequence charSequence, CharSequence charSequence2) {
        char c2;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i2) != charSequence2.charAt(i2) && ((c2 = (char) ((r4 | ' ') - 97)) >= 26 || c2 != ((char) ((r5 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m11122b(char c2) {
        return c2 >= 'a' && c2 <= 'z';
    }

    /* renamed from: c */
    public static String m11123c(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (c2 >= 'A' && c2 <= 'Z') {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    /* renamed from: d */
    public static String m11124d(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (m11122b(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (m11122b(c2)) {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    /* renamed from: e */
    public static String m11125e(CharSequence charSequence, int i2, String str) {
        java.util.Objects.requireNonNull(charSequence);
        int length = i2 - str.length();
        Preconditions.m11182f(length >= 0, "maxLength (%s) must be >= length of the truncation indicator (%s)", i2, str.length());
        int length2 = charSequence.length();
        String str2 = charSequence;
        if (length2 <= i2) {
            String charSequence2 = charSequence.toString();
            int length3 = charSequence2.length();
            str2 = charSequence2;
            if (length3 <= i2) {
                return charSequence2;
            }
        }
        StringBuilder sb = new StringBuilder(i2);
        sb.append((CharSequence) str2, 0, length);
        sb.append(str);
        return sb.toString();
    }
}
