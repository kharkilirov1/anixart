package com.google.common.base;

import androidx.room.util.C0576a;
import com.google.common.annotations.GwtCompatible;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class Strings {
    @NullableDecl
    /* renamed from: a */
    public static String m11217a(@NullableDecl String str) {
        PatternCompiler patternCompiler = Platform.f20534a;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: b */
    public static String m11218b(@NullableDecl String str, @NullableDecl Object... objArr) {
        int indexOf;
        String sb;
        String valueOf = String.valueOf(str);
        int i2 = 0;
        for (int i3 = 0; i3 < objArr.length; i3++) {
            Object obj = objArr[i3];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e2) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(C0576a.m4106e(hexString, name.length() + 1));
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String sb3 = sb2.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf2 = String.valueOf(sb3);
                    logger.log(level, valueOf2.length() != 0 ? "Exception during lenientFormat for ".concat(valueOf2) : new String("Exception during lenientFormat for "), (Throwable) e2);
                    String name2 = e2.getClass().getName();
                    StringBuilder m4122u = C0576a.m4122u(name2.length() + C0576a.m4106e(sb3, 9), "<", sb3, " threw ", name2);
                    m4122u.append(">");
                    sb = m4122u.toString();
                }
            }
            objArr[i3] = sb;
        }
        StringBuilder sb4 = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i4 = 0;
        while (i2 < objArr.length && (indexOf = valueOf.indexOf("%s", i4)) != -1) {
            sb4.append((CharSequence) valueOf, i4, indexOf);
            sb4.append(objArr[i2]);
            i4 = indexOf + 2;
            i2++;
        }
        sb4.append((CharSequence) valueOf, i4, valueOf.length());
        if (i2 < objArr.length) {
            sb4.append(" [");
            sb4.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb4.append(", ");
                sb4.append(objArr[i5]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }
}
