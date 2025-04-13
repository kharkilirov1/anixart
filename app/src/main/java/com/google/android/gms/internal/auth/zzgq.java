package com.google.android.gms.internal.auth;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzgq {

    /* renamed from: e */
    public static final zzgq f16170e = new zzgq(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f16171a;

    /* renamed from: b */
    public int[] f16172b;

    /* renamed from: c */
    public Object[] f16173c;

    /* renamed from: d */
    public boolean f16174d;

    public zzgq() {
        this(0, new int[8], new Object[8], true);
    }

    public zzgq(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f16171a = i2;
        this.f16172b = iArr;
        this.f16173c = objArr;
        this.f16174d = z;
    }

    /* renamed from: a */
    public static zzgq m8490a() {
        return new zzgq(0, new int[8], new Object[8], true);
    }

    /* renamed from: b */
    public final void m8491b(int i2, Object obj) {
        if (!this.f16174d) {
            throw new UnsupportedOperationException();
        }
        int i3 = this.f16171a;
        int[] iArr = this.f16172b;
        if (i3 == iArr.length) {
            int i4 = i3 + (i3 < 4 ? 8 : i3 >> 1);
            this.f16172b = Arrays.copyOf(iArr, i4);
            this.f16173c = Arrays.copyOf(this.f16173c, i4);
        }
        int[] iArr2 = this.f16172b;
        int i5 = this.f16171a;
        iArr2[i5] = i2;
        this.f16173c[i5] = obj;
        this.f16171a = i5 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzgq)) {
            return false;
        }
        zzgq zzgqVar = (zzgq) obj;
        int i2 = this.f16171a;
        if (i2 == zzgqVar.f16171a) {
            int[] iArr = this.f16172b;
            int[] iArr2 = zzgqVar.f16172b;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.f16173c;
                    Object[] objArr2 = zzgqVar.f16173c;
                    int i4 = this.f16171a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (objArr[i5].equals(objArr2[i5])) {
                        }
                    }
                    return true;
                }
                if (iArr[i3] != iArr2[i3]) {
                    break;
                }
                i3++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f16171a;
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.f16172b;
        int i4 = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i3 + i5) * 31;
        Object[] objArr = this.f16173c;
        int i8 = this.f16171a;
        for (int i9 = 0; i9 < i8; i9++) {
            i4 = (i4 * 31) + objArr[i9].hashCode();
        }
        return i7 + i4;
    }
}
