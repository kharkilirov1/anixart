package com.google.common.collect;

import androidx.room.util.C0576a;
import com.google.common.annotations.GwtIncompatible;
import java.util.Arrays;

@GwtIncompatible
/* loaded from: classes.dex */
final class CompactHashing {
    /* renamed from: a */
    public static Object m11469a(int i2) {
        if (i2 < 2 || i2 > 1073741824 || Integer.highestOneBit(i2) != i2) {
            throw new IllegalArgumentException(C0576a.m4111j(52, "must be power of 2 between 2^1 and 2^30: ", i2));
        }
        return i2 <= 256 ? new byte[i2] : i2 <= 65536 ? new short[i2] : new int[i2];
    }

    /* renamed from: b */
    public static int m11470b(int i2, int i3, int i4) {
        return (i2 & (~i4)) | (i3 & i4);
    }

    /* renamed from: c */
    public static int m11471c(int i2) {
        return (i2 + 1) * (i2 < 32 ? 4 : 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r5 != (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        m11475g(r12, r1, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r13[r5] = m11470b(r13[r5], r9, r11);
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m11472d(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r9, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object[] r15) {
        /*
            int r0 = com.google.common.collect.Hashing.m11607c(r9)
            r1 = r0 & r11
            int r2 = m11474f(r12, r1)
            r3 = -1
            if (r2 != 0) goto Le
            return r3
        Le:
            int r4 = ~r11
            r0 = r0 & r4
            r5 = -1
        L11:
            int r2 = r2 + (-1)
            r6 = r13[r2]
            r7 = r6 & r4
            if (r7 != r0) goto L3c
            r7 = r14[r2]
            boolean r7 = com.google.common.base.Objects.m11173a(r9, r7)
            if (r7 == 0) goto L3c
            if (r15 == 0) goto L2b
            r7 = r15[r2]
            boolean r7 = com.google.common.base.Objects.m11173a(r10, r7)
            if (r7 == 0) goto L3c
        L2b:
            r9 = r6 & r11
            if (r5 != r3) goto L33
            m11475g(r12, r1, r9)
            goto L3b
        L33:
            r10 = r13[r5]
            int r9 = m11470b(r10, r9, r11)
            r13[r5] = r9
        L3b:
            return r2
        L3c:
            r5 = r6 & r11
            if (r5 != 0) goto L41
            return r3
        L41:
            r8 = r5
            r5 = r2
            r2 = r8
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.CompactHashing.m11472d(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    /* renamed from: e */
    public static void m11473e(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    /* renamed from: f */
    public static int m11474f(Object obj, int i2) {
        return obj instanceof byte[] ? ((byte[]) obj)[i2] & 255 : obj instanceof short[] ? ((short[]) obj)[i2] & 65535 : ((int[]) obj)[i2];
    }

    /* renamed from: g */
    public static void m11475g(Object obj, int i2, int i3) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }
}
