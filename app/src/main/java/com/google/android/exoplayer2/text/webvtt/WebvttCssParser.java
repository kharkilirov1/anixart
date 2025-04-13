package com.google.android.exoplayer2.text.webvtt;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class WebvttCssParser {

    /* renamed from: c */
    public static final Pattern f13800c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d */
    public static final Pattern f13801d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a */
    public final ParsableByteArray f13802a = new ParsableByteArray();

    /* renamed from: b */
    public final StringBuilder f13803b = new StringBuilder();

    /* renamed from: a */
    public static String m7269a(ParsableByteArray parsableByteArray, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i2 = parsableByteArray.f14699b;
        int i3 = parsableByteArray.f14700c;
        while (i2 < i3 && !z) {
            char c2 = (char) parsableByteArray.f14698a[i2];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i2++;
                sb.append(c2);
            }
        }
        parsableByteArray.m7636G(i2 - parsableByteArray.f14699b);
        return sb.toString();
    }

    @Nullable
    /* renamed from: b */
    public static String m7270b(ParsableByteArray parsableByteArray, StringBuilder sb) {
        m7271c(parsableByteArray);
        if (parsableByteArray.m7637a() == 0) {
            return null;
        }
        String m7269a = m7269a(parsableByteArray, sb);
        if (!"".equals(m7269a)) {
            return m7269a;
        }
        char m7657u = (char) parsableByteArray.m7657u();
        StringBuilder sb2 = new StringBuilder(1);
        sb2.append(m7657u);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0068 A[LOOP:1: B:3:0x0002->B:41:0x0068, LOOP_END] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m7271c(com.google.android.exoplayer2.util.ParsableByteArray r8) {
        /*
            r0 = 1
        L1:
            r1 = 1
        L2:
            int r2 = r8.m7637a()
            if (r2 <= 0) goto L6a
            if (r1 == 0) goto L6a
            int r1 = r8.f14699b
            byte[] r2 = r8.f14698a
            r1 = r2[r1]
            char r1 = (char) r1
            r2 = 9
            r3 = 0
            if (r1 == r2) goto L28
            r2 = 10
            if (r1 == r2) goto L28
            r2 = 12
            if (r1 == r2) goto L28
            r2 = 13
            if (r1 == r2) goto L28
            r2 = 32
            if (r1 == r2) goto L28
            r1 = 0
            goto L2c
        L28:
            r8.m7636G(r0)
            r1 = 1
        L2c:
            if (r1 != 0) goto L1
            int r1 = r8.f14699b
            int r2 = r8.f14700c
            byte[] r4 = r8.f14698a
            int r5 = r1 + 2
            if (r5 > r2) goto L64
            int r5 = r1 + 1
            r1 = r4[r1]
            r6 = 47
            if (r1 != r6) goto L64
            int r1 = r5 + 1
            r5 = r4[r5]
            r7 = 42
            if (r5 != r7) goto L64
        L48:
            int r5 = r1 + 1
            if (r5 >= r2) goto L5c
            r1 = r4[r1]
            char r1 = (char) r1
            if (r1 != r7) goto L5a
            r1 = r4[r5]
            char r1 = (char) r1
            if (r1 != r6) goto L5a
            int r2 = r5 + 1
            r1 = r2
            goto L48
        L5a:
            r1 = r5
            goto L48
        L5c:
            int r1 = r8.f14699b
            int r2 = r2 - r1
            r8.m7636G(r2)
            r1 = 1
            goto L65
        L64:
            r1 = 0
        L65:
            if (r1 == 0) goto L68
            goto L1
        L68:
            r1 = 0
            goto L2
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.webvtt.WebvttCssParser.m7271c(com.google.android.exoplayer2.util.ParsableByteArray):void");
    }
}
