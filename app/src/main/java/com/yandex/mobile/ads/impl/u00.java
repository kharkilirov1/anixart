package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class u00 {

    /* renamed from: a */
    private static final Pattern f55314a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b */
    private static final Pattern f55315b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    /* renamed from: c */
    public static final /* synthetic */ int f55316c = 0;

    /* renamed from: a */
    public static long m28812a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f55315b.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String group = matcher.group(1);
        Objects.requireNonNull(group);
        return Long.parseLong(group);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long m28813a(@androidx.annotation.Nullable java.lang.String r9, @androidx.annotation.Nullable java.lang.String r10) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r1 = "HttpUtil"
            java.lang.String r2 = "]"
            if (r0 != 0) goto L26
            long r3 = java.lang.Long.parseLong(r9)     // Catch: java.lang.NumberFormatException -> Lf
            goto L28
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Unexpected Content-Length ["
            r0.append(r3)
            r0.append(r9)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.yandex.mobile.ads.impl.d90.m23839b(r1, r0)
        L26:
            r3 = -1
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L9d
            java.util.regex.Pattern r0 = com.yandex.mobile.ads.impl.u00.f55314a
            java.util.regex.Matcher r0 = r0.matcher(r10)
            boolean r5 = r0.matches()
            if (r5 == 0) goto L9d
            r5 = 2
            java.lang.String r5 = r0.group(r5)     // Catch: java.lang.NumberFormatException -> L86
            java.util.Objects.requireNonNull(r5)     // Catch: java.lang.NumberFormatException -> L86
            long r5 = java.lang.Long.parseLong(r5)     // Catch: java.lang.NumberFormatException -> L86
            r7 = 1
            java.lang.String r0 = r0.group(r7)     // Catch: java.lang.NumberFormatException -> L86
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.NumberFormatException -> L86
            long r7 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L86
            long r5 = r5 - r7
            r7 = 1
            long r5 = r5 + r7
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L5e
            r3 = r5
            goto L9d
        L5e:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L9d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L86
            r0.<init>()     // Catch: java.lang.NumberFormatException -> L86
            java.lang.String r7 = "Inconsistent headers ["
            r0.append(r7)     // Catch: java.lang.NumberFormatException -> L86
            r0.append(r9)     // Catch: java.lang.NumberFormatException -> L86
            java.lang.String r9 = "] ["
            r0.append(r9)     // Catch: java.lang.NumberFormatException -> L86
            r0.append(r10)     // Catch: java.lang.NumberFormatException -> L86
            r0.append(r2)     // Catch: java.lang.NumberFormatException -> L86
            java.lang.String r9 = r0.toString()     // Catch: java.lang.NumberFormatException -> L86
            com.yandex.mobile.ads.impl.d90.m23842d(r1, r9)     // Catch: java.lang.NumberFormatException -> L86
            long r3 = java.lang.Math.max(r3, r5)     // Catch: java.lang.NumberFormatException -> L86
            goto L9d
        L86:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Unexpected Content-Range ["
            r9.append(r0)
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.yandex.mobile.ads.impl.d90.m23839b(r1, r9)
        L9d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.u00.m28813a(java.lang.String, java.lang.String):long");
    }
}
