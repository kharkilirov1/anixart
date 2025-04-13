package com.google.android.gms.internal.p041firebaseauthapi;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzyw extends zzyy {

    /* renamed from: c */
    public final byte[] f17122c;

    /* renamed from: d */
    public int f17123d;

    /* renamed from: e */
    public int f17124e;

    /* renamed from: g */
    public int f17126g;

    /* renamed from: h */
    public int f17127h = Integer.MAX_VALUE;

    /* renamed from: f */
    public int f17125f = 0;

    public /* synthetic */ zzyw(byte[] bArr, int i2) {
        this.f17122c = bArr;
        this.f17123d = i2;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyy
    /* renamed from: a */
    public final int mo9526a() {
        return this.f17125f;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyy
    /* renamed from: b */
    public final int mo9527b(int i2) throws zzaaf {
        if (i2 < 0) {
            throw zzaaf.m8582e();
        }
        int i3 = i2 + this.f17125f;
        if (i3 < 0) {
            throw zzaaf.m8583f();
        }
        int i4 = this.f17127h;
        if (i3 > i4) {
            throw zzaaf.m8584g();
        }
        this.f17127h = i3;
        m9544u();
        return i4;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyy
    /* renamed from: c */
    public final int mo9528c() throws IOException {
        if (mo9534i()) {
            this.f17126g = 0;
            return 0;
        }
        int m9539p = m9539p();
        this.f17126g = m9539p;
        if ((m9539p >>> 3) != 0) {
            return m9539p;
        }
        throw zzaaf.m8579b();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyy
    /* renamed from: d */
    public final zzyu mo9529d() throws IOException {
        int m9539p = m9539p();
        if (m9539p > 0) {
            int i2 = this.f17123d;
            int i3 = this.f17125f;
            if (m9539p <= i2 - i3) {
                zzyu m9523z = zzyu.m9523z(this.f17122c, i3, m9539p);
                this.f17125f += m9539p;
                return m9523z;
            }
        }
        if (m9539p == 0) {
            return zzyu.f17120c;
        }
        if (m9539p > 0) {
            int i4 = this.f17123d;
            int i5 = this.f17125f;
            if (m9539p <= i4 - i5) {
                int i6 = m9539p + i5;
                this.f17125f = i6;
                byte[] copyOfRange = Arrays.copyOfRange(this.f17122c, i5, i6);
                zzyu zzyuVar = zzyu.f17120c;
                return new zzyr(copyOfRange);
            }
        }
        if (m9539p <= 0) {
            throw zzaaf.m8582e();
        }
        throw zzaaf.m8584g();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyy
    /* renamed from: e */
    public final String mo9530e() throws IOException {
        int m9539p = m9539p();
        if (m9539p > 0) {
            int i2 = this.f17123d;
            int i3 = this.f17125f;
            if (m9539p <= i2 - i3) {
                String str = new String(this.f17122c, i3, m9539p, zzaad.f16259a);
                this.f17125f += m9539p;
                return str;
            }
        }
        if (m9539p == 0) {
            return "";
        }
        if (m9539p < 0) {
            throw zzaaf.m8582e();
        }
        throw zzaaf.m8584g();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyy
    /* renamed from: f */
    public final String mo9531f() throws IOException {
        int m9539p = m9539p();
        if (m9539p > 0) {
            int i2 = this.f17123d;
            int i3 = this.f17125f;
            if (m9539p <= i2 - i3) {
                String m8809d = zzacu.m8809d(this.f17122c, i3, m9539p);
                this.f17125f += m9539p;
                return m8809d;
            }
        }
        if (m9539p == 0) {
            return "";
        }
        if (m9539p <= 0) {
            throw zzaaf.m8582e();
        }
        throw zzaaf.m8584g();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyy
    /* renamed from: g */
    public final void mo9532g(int i2) throws zzaaf {
        if (this.f17126g != i2) {
            throw zzaaf.m8578a();
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyy
    /* renamed from: h */
    public final void mo9533h(int i2) {
        this.f17127h = i2;
        m9544u();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyy
    /* renamed from: i */
    public final boolean mo9534i() throws IOException {
        return this.f17125f == this.f17123d;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyy
    /* renamed from: j */
    public final boolean mo9535j() throws IOException {
        return m9541r() != 0;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyy
    /* renamed from: k */
    public final boolean mo9536k(int i2) throws IOException {
        int mo9528c;
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (this.f17123d - this.f17125f < 10) {
                while (i4 < 10) {
                    if (m9537n() < 0) {
                        i4++;
                    }
                }
                throw zzaaf.m8581d();
            }
            while (i4 < 10) {
                byte[] bArr = this.f17122c;
                int i5 = this.f17125f;
                this.f17125f = i5 + 1;
                if (bArr[i5] < 0) {
                    i4++;
                }
            }
            throw zzaaf.m8581d();
            return true;
        }
        if (i3 == 1) {
            m9543t(8);
            return true;
        }
        if (i3 == 2) {
            m9543t(m9539p());
            return true;
        }
        if (i3 == 3) {
            do {
                mo9528c = mo9528c();
                if (mo9528c == 0) {
                    break;
                }
            } while (mo9536k(mo9528c));
            mo9532g(((i2 >>> 3) << 3) | 4);
            return true;
        }
        if (i3 == 4) {
            return false;
        }
        if (i3 == 5) {
            m9543t(4);
            return true;
        }
        int i6 = zzaaf.f16261b;
        throw new zzaae();
    }

    /* renamed from: n */
    public final byte m9537n() throws IOException {
        int i2 = this.f17125f;
        if (i2 == this.f17123d) {
            throw zzaaf.m8584g();
        }
        byte[] bArr = this.f17122c;
        this.f17125f = i2 + 1;
        return bArr[i2];
    }

    /* renamed from: o */
    public final int m9538o() throws IOException {
        int i2 = this.f17125f;
        if (this.f17123d - i2 < 4) {
            throw zzaaf.m8584g();
        }
        byte[] bArr = this.f17122c;
        this.f17125f = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        if (r2[r3] >= 0) goto L33;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m9539p() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f17125f
            int r1 = r5.f17123d
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.f17122c
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.f17125f = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6c
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L69
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L69
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L69
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6c
        L69:
            r5.f17125f = r1
            return r0
        L6c:
            long r0 = r5.m9542s()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p041firebaseauthapi.zzyw.m9539p():int");
    }

    /* renamed from: q */
    public final long m9540q() throws IOException {
        int i2 = this.f17125f;
        if (this.f17123d - i2 < 8) {
            throw zzaaf.m8584g();
        }
        byte[] bArr = this.f17122c;
        this.f17125f = i2 + 8;
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    /* renamed from: r */
    public final long m9541r() throws IOException {
        long j2;
        long j3;
        long j4;
        long j5;
        int i2;
        int i3 = this.f17125f;
        int i4 = this.f17123d;
        if (i4 != i3) {
            byte[] bArr = this.f17122c;
            int i5 = i3 + 1;
            byte b = bArr[i3];
            if (b >= 0) {
                this.f17125f = i5;
                return b;
            }
            if (i4 - i5 >= 9) {
                int i6 = i5 + 1;
                int i7 = b ^ (bArr[i5] << 7);
                if (i7 >= 0) {
                    int i8 = i6 + 1;
                    int i9 = i7 ^ (bArr[i6] << 14);
                    if (i9 >= 0) {
                        j2 = i9 ^ 16256;
                    } else {
                        i6 = i8 + 1;
                        int i10 = i9 ^ (bArr[i8] << 21);
                        if (i10 < 0) {
                            i2 = i10 ^ (-2080896);
                        } else {
                            i8 = i6 + 1;
                            long j6 = (bArr[i6] << 28) ^ i10;
                            if (j6 < 0) {
                                int i11 = i8 + 1;
                                long j7 = j6 ^ (bArr[i8] << 35);
                                if (j7 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    i8 = i11 + 1;
                                    j6 = j7 ^ (bArr[i11] << 42);
                                    if (j6 >= 0) {
                                        j5 = 4363953127296L;
                                    } else {
                                        i11 = i8 + 1;
                                        j7 = j6 ^ (bArr[i8] << 49);
                                        if (j7 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            i8 = i11 + 1;
                                            j2 = (j7 ^ (bArr[i11] << 56)) ^ 71499008037633920L;
                                            if (j2 < 0) {
                                                i11 = i8 + 1;
                                                if (bArr[i8] >= 0) {
                                                    j3 = j2;
                                                    i6 = i11;
                                                    this.f17125f = i6;
                                                    return j3;
                                                }
                                            }
                                        }
                                    }
                                }
                                j3 = j4 ^ j7;
                                i6 = i11;
                                this.f17125f = i6;
                                return j3;
                            }
                            j5 = 266354560;
                            j2 = j6 ^ j5;
                        }
                    }
                    i6 = i8;
                    j3 = j2;
                    this.f17125f = i6;
                    return j3;
                }
                i2 = i7 ^ (-128);
                j3 = i2;
                this.f17125f = i6;
                return j3;
            }
        }
        return m9542s();
    }

    /* renamed from: s */
    public final long m9542s() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            j2 |= (r3 & Byte.MAX_VALUE) << i2;
            if ((m9537n() & 128) == 0) {
                return j2;
            }
        }
        throw zzaaf.m8581d();
    }

    /* renamed from: t */
    public final void m9543t(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.f17123d;
            int i4 = this.f17125f;
            if (i2 <= i3 - i4) {
                this.f17125f = i4 + i2;
                return;
            }
        }
        if (i2 >= 0) {
            throw zzaaf.m8584g();
        }
        throw zzaaf.m8582e();
    }

    /* renamed from: u */
    public final void m9544u() {
        int i2 = this.f17123d + this.f17124e;
        this.f17123d = i2;
        int i3 = this.f17127h;
        if (i2 <= i3) {
            this.f17124e = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f17124e = i4;
        this.f17123d = i2 - i4;
    }
}
