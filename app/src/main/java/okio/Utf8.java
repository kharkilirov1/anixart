package okio;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import p000a.C0000a;

/* compiled from: Utf8.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"okio"}, m31885k = 2, m31886mv = {1, 4, 0})
@JvmName
/* loaded from: classes3.dex */
public final class Utf8 {
    /* renamed from: a */
    public static long m34622a(String str, int i2, int i3, int i4) {
        int i5;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(C0000a.m7d("beginIndex < 0: ", i2).toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(C0000a.m9f("endIndex < beginIndex: ", i3, " < ", i2).toString());
        }
        if (!(i3 <= str.length())) {
            StringBuilder m25v = C0000a.m25v("endIndex > string.length: ", i3, " > ");
            m25v.append(str.length());
            throw new IllegalArgumentException(m25v.toString().toString());
        }
        long j2 = 0;
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                j2++;
            } else {
                if (charAt < 2048) {
                    i5 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i5 = 3;
                } else {
                    int i6 = i2 + 1;
                    char charAt2 = i6 < i3 ? str.charAt(i6) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j2++;
                        i2 = i6;
                    } else {
                        j2 += 4;
                        i2 += 2;
                    }
                }
                j2 += i5;
            }
            i2++;
        }
        return j2;
    }
}
