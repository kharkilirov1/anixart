package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;

@Beta
@GwtCompatible
/* loaded from: classes2.dex */
public final class UnsignedInts {

    public enum LexicographicalComparator implements Comparator<int[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            int[] iArr3 = iArr;
            int[] iArr4 = iArr2;
            int min = Math.min(iArr3.length, iArr4.length);
            for (int i2 = 0; i2 < min; i2++) {
                if (iArr3[i2] != iArr4[i2]) {
                    return Ints.m12081c(iArr3[i2] ^ Integer.MIN_VALUE, iArr4[i2] ^ Integer.MIN_VALUE);
                }
            }
            return iArr3.length - iArr4.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedInts.lexicographicalComparator()";
        }
    }
}
