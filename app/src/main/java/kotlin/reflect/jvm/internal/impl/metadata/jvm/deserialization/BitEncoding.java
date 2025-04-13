package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class BitEncoding {
    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        "true".equals(str);
    }

    @NotNull
    /* renamed from: a */
    public static byte[] m33170a(@NotNull String[] strArr) {
        int i2;
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char charAt = strArr[0].charAt(0);
            if (charAt == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                strArr2[0] = strArr2[0].substring(1);
                int i3 = 0;
                for (String str : strArr2) {
                    i3 += str.length();
                }
                byte[] bArr = new byte[i3];
                int i4 = 0;
                for (String str2 : strArr2) {
                    int length = str2.length() - 1;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            i2 = i4 + 1;
                            bArr[i4] = (byte) str2.charAt(i5);
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                            i4 = i2;
                        }
                        i4 = i2;
                    }
                }
                return bArr;
            }
            if (charAt == 65535) {
                strArr = (String[]) strArr.clone();
                strArr[0] = strArr[0].substring(1);
            }
        }
        int i6 = 0;
        for (String str3 : strArr) {
            i6 += str3.length();
        }
        byte[] bArr2 = new byte[i6];
        int i7 = 0;
        for (String str4 : strArr) {
            int length2 = str4.length();
            int i8 = 0;
            while (i8 < length2) {
                bArr2[i7] = (byte) str4.charAt(i8);
                i8++;
                i7++;
            }
        }
        for (int i9 = 0; i9 < i6; i9++) {
            bArr2[i9] = (byte) ((bArr2[i9] + Byte.MAX_VALUE) & 127);
        }
        int i10 = (i6 * 7) / 8;
        byte[] bArr3 = new byte[i10];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = (bArr2[i11] & 255) >>> i12;
            i11++;
            int i15 = i12 + 1;
            bArr3[i13] = (byte) (i14 + ((bArr2[i11] & ((1 << i15) - 1)) << (7 - i12)));
            if (i12 == 6) {
                i11++;
                i12 = 0;
            } else {
                i12 = i15;
            }
        }
        return bArr3;
    }
}
