package com.yandex.mobile.ads.impl;

import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.mobile.ads.impl.xy */
/* loaded from: classes3.dex */
public final class C6046xy {
    @Nullable
    /* renamed from: a */
    public static final String m29818a(@NotNull String str) {
        Intrinsics.m32179h(str, "<this>");
        int i2 = 0;
        int i3 = -1;
        if (!StringsKt.m33922t(str, ":", false, 2, null)) {
            try {
                String ascii = IDN.toASCII(str);
                Intrinsics.m32178g(ascii, "toASCII(host)");
                Locale US = Locale.US;
                Intrinsics.m32178g(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                Intrinsics.m32178g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i4 = 0; i4 < length; i4++) {
                    char charAt = lowerCase.charAt(i4);
                    if (Intrinsics.m32181j(charAt, 31) > 0 && Intrinsics.m32181j(charAt, 127) < 0 && StringsKt.m33877C(" #%/:?@[\\]", charAt, 0, false, 6, null) == -1) {
                    }
                    i2 = 1;
                    break;
                }
                if (i2 != 0) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress m29819a = (StringsKt.m33898X(str, "[", false, 2, null) && StringsKt.m33926x(str, "]", false, 2, null)) ? m29819a(1, str.length() - 1, str) : m29819a(0, str.length(), str);
        if (m29819a == null) {
            return null;
        }
        byte[] address = m29819a.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return m29819a.getHostAddress();
            }
            throw new AssertionError(C0000a.m15l("Invalid IPv6 address: '", str, '\''));
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < address.length) {
            int i7 = i5;
            while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                i7 += 2;
            }
            int i8 = i7 - i5;
            if (i8 > i6 && i8 >= 4) {
                i3 = i5;
                i6 = i8;
            }
            i5 = i7 + 2;
        }
        Buffer buffer = new Buffer();
        while (i2 < address.length) {
            if (i2 == i3) {
                buffer.m34524Q(58);
                i2 += i6;
                if (i2 == 16) {
                    buffer.m34524Q(58);
                }
            } else {
                if (i2 > 0) {
                    buffer.m34524Q(58);
                }
                buffer.mo34514A0((t91.m28483a(address[i2]) << 8) | t91.m28483a(address[i2 + 1]));
                i2 += 2;
            }
        }
        return buffer.m34553m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f1, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c6  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.net.InetAddress m29819a(int r20, int r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C6046xy.m29819a(int, int, java.lang.String):java.net.InetAddress");
    }
}
