package com.google.gson.internal.bind.util;

import java.util.TimeZone;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ISO8601Utils {

    /* renamed from: a */
    public static final TimeZone f23870a = TimeZone.getTimeZone("UTC");

    /* renamed from: a */
    public static boolean m12939a(String str, int i2, char c2) {
        return i2 < str.length() && str.charAt(i2) == c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1 A[Catch: IllegalArgumentException -> 0x01d0, NumberFormatException -> 0x01d2, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:18:0x0050, B:20:0x0060, B:21:0x0062, B:23:0x006e, B:24:0x0070, B:26:0x0076, B:30:0x0080, B:35:0x0090, B:37:0x0098, B:38:0x009c, B:40:0x00a2, B:44:0x00af, B:47:0x00b6, B:52:0x00db, B:54:0x00e1, B:56:0x00e8, B:57:0x0197, B:63:0x00f4, B:64:0x010f, B:65:0x0110, B:68:0x012c, B:70:0x0139, B:73:0x0142, B:75:0x0161, B:78:0x0170, B:79:0x0192, B:81:0x0195, B:82:0x011b, B:83:0x01c8, B:84:0x01cf, B:85:0x00c6, B:86:0x00c9, B:89:0x00b2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c8 A[Catch: IllegalArgumentException -> 0x01d0, NumberFormatException -> 0x01d2, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:18:0x0050, B:20:0x0060, B:21:0x0062, B:23:0x006e, B:24:0x0070, B:26:0x0076, B:30:0x0080, B:35:0x0090, B:37:0x0098, B:38:0x009c, B:40:0x00a2, B:44:0x00af, B:47:0x00b6, B:52:0x00db, B:54:0x00e1, B:56:0x00e8, B:57:0x0197, B:63:0x00f4, B:64:0x010f, B:65:0x0110, B:68:0x012c, B:70:0x0139, B:73:0x0142, B:75:0x0161, B:78:0x0170, B:79:0x0192, B:81:0x0195, B:82:0x011b, B:83:0x01c8, B:84:0x01cf, B:85:0x00c6, B:86:0x00c9, B:89:0x00b2), top: B:2:0x0004 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date m12940b(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.util.ISO8601Utils.m12940b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    /* renamed from: c */
    public static int m12941c(String str, int i2, int i3) throws NumberFormatException {
        int i4;
        int i5;
        if (i2 < 0 || i3 > str.length() || i2 > i3) {
            throw new NumberFormatException(str);
        }
        if (i2 < i3) {
            i5 = i2 + 1;
            int digit = Character.digit(str.charAt(i2), 10);
            if (digit < 0) {
                StringBuilder m24u = C0000a.m24u("Invalid number: ");
                m24u.append(str.substring(i2, i3));
                throw new NumberFormatException(m24u.toString());
            }
            i4 = -digit;
        } else {
            i4 = 0;
            i5 = i2;
        }
        while (i5 < i3) {
            int i6 = i5 + 1;
            int digit2 = Character.digit(str.charAt(i5), 10);
            if (digit2 < 0) {
                StringBuilder m24u2 = C0000a.m24u("Invalid number: ");
                m24u2.append(str.substring(i2, i3));
                throw new NumberFormatException(m24u2.toString());
            }
            i4 = (i4 * 10) - digit2;
            i5 = i6;
        }
        return -i4;
    }
}
