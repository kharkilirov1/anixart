package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.Locale;

/* renamed from: com.yandex.mobile.ads.impl.fj */
/* loaded from: classes3.dex */
public final class C5081fj {

    /* renamed from: a */
    private static final byte[] f50277a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final String[] f50278b = {"", "A", "B", "C"};

    /* renamed from: a */
    public static boolean m24608a(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    /* renamed from: a */
    public static String m24607a(int i2, boolean z, int i3, int i4, int[] iArr, int i5) {
        Object[] objArr = new Object[5];
        objArr[0] = f50278b[i2];
        objArr[1] = Integer.valueOf(i3);
        objArr[2] = Integer.valueOf(i4);
        objArr[3] = Character.valueOf(z ? 'H' : 'L');
        objArr[4] = Integer.valueOf(i5);
        int i6 = s91.f54530a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i7 = 0; i7 < length; i7++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i7])));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static byte[] m24609a(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3 + 4];
        System.arraycopy(f50277a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i2, bArr2, 4, i3);
        return bArr2;
    }
}
