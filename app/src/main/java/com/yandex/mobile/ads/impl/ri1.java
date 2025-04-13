package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class ri1 {

    /* renamed from: c */
    private static final Pattern f54322c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d */
    private static final Pattern f54323d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a */
    private final ap0 f54324a = new ap0();

    /* renamed from: b */
    private final StringBuilder f54325b = new StringBuilder();

    /* JADX WARN: Removed duplicated region for block: B:41:0x0074 A[LOOP:1: B:3:0x0003->B:41:0x0074, LOOP_END] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m27930b(com.yandex.mobile.ads.impl.ap0 r8) {
        /*
            r0 = 0
            r1 = 1
        L2:
            r2 = 1
        L3:
            int r3 = r8.m22579a()
            if (r3 <= 0) goto L76
            if (r2 == 0) goto L76
            int r2 = r8.m22588d()
            byte[] r3 = r8.m22587c()
            r2 = r3[r2]
            char r2 = (char) r2
            r3 = 9
            if (r2 == r3) goto L2c
            r3 = 10
            if (r2 == r3) goto L2c
            r3 = 12
            if (r2 == r3) goto L2c
            r3 = 13
            if (r2 == r3) goto L2c
            r3 = 32
            if (r2 == r3) goto L2c
            r2 = 0
            goto L30
        L2c:
            r8.m22593f(r1)
            r2 = 1
        L30:
            if (r2 != 0) goto L2
            int r2 = r8.m22588d()
            int r3 = r8.m22590e()
            byte[] r4 = r8.m22587c()
            int r5 = r2 + 2
            if (r5 > r3) goto L70
            int r5 = r2 + 1
            r2 = r4[r2]
            r6 = 47
            if (r2 != r6) goto L70
            int r2 = r5 + 1
            r5 = r4[r5]
            r7 = 42
            if (r5 != r7) goto L70
        L52:
            int r5 = r2 + 1
            if (r5 >= r3) goto L66
            r2 = r4[r2]
            char r2 = (char) r2
            if (r2 != r7) goto L64
            r2 = r4[r5]
            char r2 = (char) r2
            if (r2 != r6) goto L64
            int r3 = r5 + 1
            r2 = r3
            goto L52
        L64:
            r2 = r5
            goto L52
        L66:
            int r2 = r8.m22588d()
            int r3 = r3 - r2
            r8.m22593f(r3)
            r2 = 1
            goto L71
        L70:
            r2 = 0
        L71:
            if (r2 == 0) goto L74
            goto L2
        L74:
            r2 = 0
            goto L3
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ri1.m27930b(com.yandex.mobile.ads.impl.ap0):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x00ab, code lost:
    
        if (")".equals(m27929b(r3, r4)) == false) goto L32;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList m27931a(com.yandex.mobile.ads.impl.ap0 r18) {
        /*
            Method dump skipped, instructions count: 808
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ri1.m27931a(com.yandex.mobile.ads.impl.ap0):java.util.ArrayList");
    }

    @Nullable
    /* renamed from: b */
    public static String m27929b(ap0 ap0Var, StringBuilder sb) {
        m27930b(ap0Var);
        if (ap0Var.m22579a() == 0) {
            return null;
        }
        String m27928a = m27928a(ap0Var, sb);
        if (!"".equals(m27928a)) {
            return m27928a;
        }
        StringBuilder m26356a = l60.m26356a("");
        m26356a.append((char) ap0Var.m22607t());
        return m26356a.toString();
    }

    /* renamed from: a */
    private static String m27928a(ap0 ap0Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int m22588d = ap0Var.m22588d();
        int m22590e = ap0Var.m22590e();
        while (m22588d < m22590e && !z) {
            char c2 = (char) ap0Var.m22587c()[m22588d];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                m22588d++;
                sb.append(c2);
            }
        }
        ap0Var.m22593f(m22588d - ap0Var.m22588d());
        return sb.toString();
    }
}
