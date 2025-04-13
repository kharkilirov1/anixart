package com.yandex.mobile.ads.impl;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
public final class s41 {
    /* renamed from: a */
    public static String m28070a(@CheckForNull String str, @CheckForNull Object... objArr) {
        int indexOf;
        String str2;
        int i2 = 0;
        for (int i3 = 0; i3 < objArr.length; i3++) {
            Object obj = objArr[i3];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e2) {
                    String str3 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str3, (Throwable) e2);
                    str2 = "<" + str3 + " threw " + e2.getClass().getName() + ">";
                }
            }
            objArr[i3] = str2;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i4 = 0;
        while (i2 < objArr.length && (indexOf = str.indexOf("%s", i4)) != -1) {
            sb.append((CharSequence) str, i4, indexOf);
            sb.append(objArr[i2]);
            i4 = indexOf + 2;
            i2++;
        }
        sb.append((CharSequence) str, i4, str.length());
        if (i2 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb.append(", ");
                sb.append(objArr[i5]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
