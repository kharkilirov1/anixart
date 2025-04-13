package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class Hashing {
    /* renamed from: a */
    public static int m11605a(int i2, double d) {
        int max = Math.max(i2, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d * highestOneBit))) {
            return highestOneBit;
        }
        int i3 = highestOneBit << 1;
        if (i3 > 0) {
            return i3;
        }
        return 1073741824;
    }

    /* renamed from: b */
    public static int m11606b(int i2) {
        return (int) (Integer.rotateLeft((int) (i2 * (-862048943)), 15) * 461845907);
    }

    /* renamed from: c */
    public static int m11607c(@NullableDecl Object obj) {
        return m11606b(obj == null ? 0 : obj.hashCode());
    }
}
