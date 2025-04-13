package com.google.android.gms.internal.p041firebaseauthapi;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzacg {

    /* renamed from: f */
    public static final zzacg f16345f = new zzacg(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f16346a;

    /* renamed from: b */
    public int[] f16347b;

    /* renamed from: c */
    public Object[] f16348c;

    /* renamed from: d */
    public int f16349d;

    /* renamed from: e */
    public boolean f16350e;

    public zzacg() {
        this(0, new int[8], new Object[8], true);
    }

    public zzacg(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f16349d = -1;
        this.f16346a = i2;
        this.f16347b = iArr;
        this.f16348c = objArr;
        this.f16350e = z;
    }

    /* renamed from: b */
    public static zzacg m8760b() {
        return new zzacg(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int m8761a() {
        int m9612e;
        int m9613f;
        int m9612e2;
        int i2 = this.f16349d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f16346a; i4++) {
            int i5 = this.f16347b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 == 1) {
                    ((Long) this.f16348c[i4]).longValue();
                    m9612e2 = zzzf.m9612e(i6 << 3) + 8;
                } else if (i7 == 2) {
                    zzyu zzyuVar = (zzyu) this.f16348c[i4];
                    int m9612e3 = zzzf.m9612e(i6 << 3);
                    int mo9513d = zzyuVar.mo9513d();
                    i3 = zzzf.m9612e(mo9513d) + mo9513d + m9612e3 + i3;
                } else if (i7 == 3) {
                    int m9611d = zzzf.m9611d(i6);
                    m9612e = m9611d + m9611d;
                    m9613f = ((zzacg) this.f16348c[i4]).m8761a();
                } else {
                    if (i7 != 5) {
                        int i8 = zzaaf.f16261b;
                        throw new IllegalStateException(new zzaae());
                    }
                    ((Integer) this.f16348c[i4]).intValue();
                    m9612e2 = zzzf.m9612e(i6 << 3) + 4;
                }
                i3 = m9612e2 + i3;
            } else {
                long longValue = ((Long) this.f16348c[i4]).longValue();
                m9612e = zzzf.m9612e(i6 << 3);
                m9613f = zzzf.m9613f(longValue);
            }
            i3 = m9613f + m9612e + i3;
        }
        this.f16349d = i3;
        return i3;
    }

    /* renamed from: c */
    public final void m8762c(int i2, Object obj) {
        if (!this.f16350e) {
            throw new UnsupportedOperationException();
        }
        int i3 = this.f16346a;
        int[] iArr = this.f16347b;
        if (i3 == iArr.length) {
            int i4 = i3 + (i3 < 4 ? 8 : i3 >> 1);
            this.f16347b = Arrays.copyOf(iArr, i4);
            this.f16348c = Arrays.copyOf(this.f16348c, i4);
        }
        int[] iArr2 = this.f16347b;
        int i5 = this.f16346a;
        iArr2[i5] = i2;
        this.f16348c[i5] = obj;
        this.f16346a = i5 + 1;
    }

    /* renamed from: d */
    public final void m8763d(zzzg zzzgVar) throws IOException {
        if (this.f16346a != 0) {
            for (int i2 = 0; i2 < this.f16346a; i2++) {
                int i3 = this.f16347b[i2];
                Object obj = this.f16348c[i2];
                int i4 = i3 >>> 3;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    zzzgVar.f17145a.mo9604v(i4, ((Long) obj).longValue());
                } else if (i5 == 1) {
                    zzzgVar.f17145a.mo9595m(i4, ((Long) obj).longValue());
                } else if (i5 == 2) {
                    zzzgVar.f17145a.mo9592j(i4, (zzyu) obj);
                } else if (i5 == 3) {
                    zzzgVar.f17145a.mo9601s(i4, 3);
                    ((zzacg) obj).m8763d(zzzgVar);
                    zzzgVar.f17145a.mo9601s(i4, 4);
                } else {
                    if (i5 != 5) {
                        int i6 = zzaaf.f16261b;
                        throw new RuntimeException(new zzaae());
                    }
                    zzzgVar.f17145a.mo9593k(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzacg)) {
            return false;
        }
        zzacg zzacgVar = (zzacg) obj;
        int i2 = this.f16346a;
        if (i2 == zzacgVar.f16346a) {
            int[] iArr = this.f16347b;
            int[] iArr2 = zzacgVar.f16347b;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.f16348c;
                    Object[] objArr2 = zzacgVar.f16348c;
                    int i4 = this.f16346a;
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
        int i2 = this.f16346a;
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.f16347b;
        int i4 = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i3 + i5) * 31;
        Object[] objArr = this.f16348c;
        int i8 = this.f16346a;
        for (int i9 = 0; i9 < i8; i9++) {
            i4 = (i4 * 31) + objArr[i9].hashCode();
        }
        return i7 + i4;
    }
}
