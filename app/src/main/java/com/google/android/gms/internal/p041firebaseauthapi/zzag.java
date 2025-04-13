package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzag {
    /* renamed from: a */
    public static String m8815a(@CheckForNull String str, @CheckForNull Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i3 >= length) {
                break;
            }
            Object obj = objArr[i3];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e2) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e2);
                    StringBuilder m28y = C0000a.m28y("<", str2, " threw ");
                    m28y.append(e2.getClass().getName());
                    m28y.append(">");
                    sb = m28y.toString();
                }
            }
            objArr[i3] = sb;
            i3++;
        }
        StringBuilder sb2 = new StringBuilder((length * 16) + str.length());
        int i4 = 0;
        while (true) {
            length2 = objArr.length;
            if (i2 >= length2 || (indexOf = str.indexOf("%s", i4)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i4, indexOf);
            sb2.append(objArr[i2]);
            i4 = indexOf + 2;
            i2++;
        }
        sb2.append((CharSequence) str, i4, str.length());
        if (i2 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb2.append(", ");
                sb2.append(objArr[i5]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public static String m8816b(@CheckForNull String str) {
        int i2 = zzx.f16988a;
        return str == null ? "" : str;
    }

    /* renamed from: c */
    public static boolean m8817c(@CheckForNull String str) {
        int i2 = zzx.f16988a;
        return str == null || str.isEmpty();
    }
}
