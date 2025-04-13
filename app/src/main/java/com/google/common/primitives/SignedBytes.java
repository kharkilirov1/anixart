package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;

@GwtCompatible
/* loaded from: classes2.dex */
public final class SignedBytes {

    public enum LexicographicalComparator implements Comparator<byte[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            int min = Math.min(bArr3.length, bArr4.length);
            for (int i2 = 0; i2 < min; i2++) {
                int i3 = bArr3[i2] - bArr4[i2];
                if (i3 != 0) {
                    return i3;
                }
            }
            return bArr3.length - bArr4.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "SignedBytes.lexicographicalComparator()";
        }
    }
}
