package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.O2 */
/* loaded from: classes2.dex */
public final class C3509O2 {

    /* renamed from: a */
    public static final /* synthetic */ int f43529a = 0;

    static {
        Pattern.compile("[^0-9a-zA-Z,`’\\.\\+\\-'\\s\"]");
        Pattern.compile("\\s+");
    }

    /* renamed from: a */
    public static String m18655a(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    /* renamed from: b */
    public static String m18657b(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: c */
    public static byte[] m18658c(@Nullable String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8");
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }

    @NonNull
    /* renamed from: d */
    public static byte[] m18659d(@Nullable String str) {
        return str == null ? new byte[0] : str.getBytes();
    }

    /* renamed from: a */
    public static String m18654a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        char charAt = str.charAt(0);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        return Character.toUpperCase(charAt) + str.substring(1);
    }

    /* renamed from: a */
    public static String m18656a(@NonNull byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append("0123456789abcdef".charAt((b & 240) >> 4));
            sb.append("0123456789abcdef".charAt(b & 15));
        }
        return sb.toString();
    }
}
