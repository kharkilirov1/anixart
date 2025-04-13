package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.ga */
/* loaded from: classes3.dex */
public final class C5114ga {
    /* renamed from: a */
    public static boolean m24831a(String str) {
        char c2;
        if ("rtsp" == str) {
            return true;
        }
        if (4 != str.length()) {
            return false;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            if ("rtsp".charAt(i2) != str.charAt(i2) && ((c2 = (char) ((r5 | ' ') - 97)) >= 26 || c2 != ((char) ((r6 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static String m24832b(String str) {
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
}
