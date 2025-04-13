package com.yandex.mobile.ads.impl;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* renamed from: com.yandex.mobile.ads.impl.uz */
/* loaded from: classes3.dex */
public final class C5893uz {

    /* renamed from: a */
    @NotNull
    public static final C5893uz f55704a = new C5893uz();

    /* renamed from: b */
    @JvmField
    @NotNull
    public static final ByteString f55705b = ByteString.f68753f.m34592d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: c */
    @NotNull
    private static final String[] f55706c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: d */
    @NotNull
    private static final String[] f55707d = new String[64];

    /* renamed from: e */
    @NotNull
    private static final String[] f55708e;

    static {
        String[] strArr = new String[256];
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            Intrinsics.m32178g(binaryString, "toBinaryString(it)");
            strArr[i2] = StringsKt.m33890P(t91.m28503a("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f55708e = strArr;
        String[] strArr2 = f55707d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 < 1; i3++) {
            int i4 = iArr[i3];
            String[] strArr3 = f55707d;
            strArr3[i4 | 8] = C0000a.m20q(new StringBuilder(), strArr3[i4], "|PADDED");
        }
        String[] strArr4 = f55707d;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                String[] strArr5 = f55707d;
                int i9 = i8 | i6;
                strArr5[i9] = strArr5[i8] + '|' + strArr5[i6];
                StringBuilder sb = new StringBuilder();
                sb.append(strArr5[i8]);
                sb.append('|');
                strArr5[i9 | 8] = C0000a.m20q(sb, strArr5[i6], "|PADDED");
            }
        }
        int length = f55707d.length;
        for (int i10 = 0; i10 < length; i10++) {
            String[] strArr6 = f55707d;
            if (strArr6[i10] == null) {
                strArr6[i10] = f55708e[i10];
            }
        }
    }

    private C5893uz() {
    }

    @NotNull
    /* renamed from: a */
    public static String m29149a(boolean z, int i2, int i3, int i4, int i5) {
        String str;
        String str2;
        String m29148a = m29148a(i4);
        if (i5 == 0) {
            str = "";
        } else {
            if (i4 != 2 && i4 != 3) {
                if (i4 == 4 || i4 == 6) {
                    str = i5 == 1 ? "ACK" : f55708e[i5];
                } else if (i4 != 7 && i4 != 8) {
                    String[] strArr = f55707d;
                    if (i5 < strArr.length) {
                        str2 = strArr[i5];
                        Intrinsics.m32176e(str2);
                    } else {
                        str2 = f55708e[i5];
                    }
                    String str3 = str2;
                    str = (i4 != 5 || (i5 & 4) == 0) ? (i4 != 0 || (i5 & 32) == 0) ? str3 : StringsKt.m33891Q(str3, "PRIORITY", "COMPRESSED", false, 4, null) : StringsKt.m33891Q(str3, "HEADERS", "PUSH_PROMISE", false, 4, null);
                }
            }
            str = f55708e[i5];
        }
        return t91.m28503a("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i2), Integer.valueOf(i3), m29148a, str);
    }

    @NotNull
    /* renamed from: a */
    public static String m29148a(int i2) {
        String[] strArr = f55706c;
        return i2 < strArr.length ? strArr[i2] : t91.m28503a("0x%02x", Integer.valueOf(i2));
    }
}
