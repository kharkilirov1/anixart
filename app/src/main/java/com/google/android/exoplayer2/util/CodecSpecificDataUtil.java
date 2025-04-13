package com.google.android.exoplayer2.util;

/* loaded from: classes.dex */
public final class CodecSpecificDataUtil {

    /* renamed from: a */
    public static final byte[] f14616a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final String[] f14617b = {"", "A", "B", "C"};

    /* renamed from: a */
    public static String m7531a(int i2, int i3, int i4) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    /* renamed from: b */
    public static String m7532b(int i2, boolean z, int i3, int i4, int[] iArr, int i5) {
        Object[] objArr = new Object[5];
        objArr[0] = f14617b[i2];
        objArr[1] = Integer.valueOf(i3);
        objArr[2] = Integer.valueOf(i4);
        objArr[3] = Character.valueOf(z ? 'H' : 'L');
        objArr[4] = Integer.valueOf(i5);
        StringBuilder sb = new StringBuilder(Util.m7747p("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i6 = 0; i6 < length; i6++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i6])));
        }
        return sb.toString();
    }
}
