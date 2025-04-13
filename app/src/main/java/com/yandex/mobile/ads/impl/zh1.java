package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.bi1;
import com.yandex.mobile.ads.impl.h41;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import kotlin.KotlinVersion;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes3.dex */
final class zh1 extends h41 {

    /* renamed from: n */
    @Nullable
    private C6124a f57188n;

    /* renamed from: o */
    private int f57189o;

    /* renamed from: p */
    private boolean f57190p;

    /* renamed from: q */
    @Nullable
    private bi1.C4870c f57191q;

    /* renamed from: r */
    @Nullable
    private bi1.C4868a f57192r;

    /* renamed from: com.yandex.mobile.ads.impl.zh1$a */
    public static final class C6124a {

        /* renamed from: a */
        public final bi1.C4870c f57193a;

        /* renamed from: b */
        public final bi1.C4868a f57194b;

        /* renamed from: c */
        public final byte[] f57195c;

        /* renamed from: d */
        public final bi1.C4869b[] f57196d;

        /* renamed from: e */
        public final int f57197e;

        public C6124a(bi1.C4870c c4870c, bi1.C4868a c4868a, byte[] bArr, bi1.C4869b[] c4869bArr, int i2) {
            this.f57193a = c4870c;
            this.f57194b = c4868a;
            this.f57195c = bArr;
            this.f57196d = c4869bArr;
            this.f57197e = i2;
        }
    }

    @Override // com.yandex.mobile.ads.impl.h41
    /* renamed from: a */
    public final void mo24269a(boolean z) {
        super.mo24269a(z);
        if (z) {
            this.f57188n = null;
            this.f57191q = null;
            this.f57192r = null;
        }
        this.f57189o = 0;
        this.f57190p = false;
    }

    @Override // com.yandex.mobile.ads.impl.h41
    /* renamed from: c */
    public final void mo25057c(long j2) {
        super.mo25057c(j2);
        this.f57190p = j2 != 0;
        bi1.C4870c c4870c = this.f57191q;
        this.f57189o = c4870c != null ? c4870c.f48891e : 0;
    }

    @Override // com.yandex.mobile.ads.impl.h41
    /* renamed from: a */
    public final long mo24268a(ap0 ap0Var) {
        int i2;
        if ((ap0Var.m22587c()[0] & 1) == 1) {
            return -1L;
        }
        byte b = ap0Var.m22587c()[0];
        C6124a c6124a = (C6124a) C5220ia.m25474b(this.f57188n);
        if (!c6124a.f57196d[(b >> 1) & (KotlinVersion.MAX_COMPONENT_VALUE >>> (8 - c6124a.f57197e))].f48886a) {
            i2 = c6124a.f57193a.f48891e;
        } else {
            i2 = c6124a.f57193a.f48892f;
        }
        long j2 = this.f57190p ? (this.f57189o + i2) / 4 : 0;
        if (ap0Var.m22584b() < ap0Var.m22590e() + 4) {
            byte[] copyOf = Arrays.copyOf(ap0Var.m22587c(), ap0Var.m22590e() + 4);
            ap0Var.m22582a(copyOf.length, copyOf);
        } else {
            ap0Var.m22589d(ap0Var.m22590e() + 4);
        }
        byte[] m22587c = ap0Var.m22587c();
        m22587c[ap0Var.m22590e() - 4] = (byte) (j2 & 255);
        m22587c[ap0Var.m22590e() - 3] = (byte) ((j2 >>> 8) & 255);
        m22587c[ap0Var.m22590e() - 2] = (byte) ((j2 >>> 16) & 255);
        m22587c[ap0Var.m22590e() - 1] = (byte) ((j2 >>> 24) & 255);
        this.f57190p = true;
        this.f57189o = i2;
        return j2;
    }

    @Override // com.yandex.mobile.ads.impl.h41
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: a */
    public final boolean mo24270a(ap0 ap0Var, long j2, h41.C5163a c5163a) throws IOException {
        C6124a c6124a;
        yh1 yh1Var;
        yh1 yh1Var2;
        yh1 yh1Var3;
        if (this.f57188n != null) {
            Objects.requireNonNull(c5163a.f50845a);
            return false;
        }
        bi1.C4870c c4870c = this.f57191q;
        if (c4870c == null) {
            this.f57191q = bi1.m22838a(ap0Var);
        } else {
            bi1.C4868a c4868a = this.f57192r;
            if (c4868a == null) {
                this.f57192r = bi1.m22837a(ap0Var, true, true);
            } else {
                byte[] bArr = new byte[ap0Var.m22590e()];
                System.arraycopy(ap0Var.m22587c(), 0, bArr, 0, ap0Var.m22590e());
                int i2 = c4870c.f48887a;
                int i3 = 5;
                bi1.m22839a(5, ap0Var, false);
                int m22607t = ap0Var.m22607t() + 1;
                yh1 yh1Var4 = new yh1(ap0Var.m22587c());
                yh1Var4.m29942b(ap0Var.m22588d() * 8);
                int i4 = 0;
                while (i4 < m22607t) {
                    if (yh1Var4.m29941a(24) == 5653314) {
                        int m29941a = yh1Var4.m29941a(16);
                        int m29941a2 = yh1Var4.m29941a(24);
                        long[] jArr = new long[m29941a2];
                        long j3 = 0;
                        if (!yh1Var4.m29943b()) {
                            boolean m29943b = yh1Var4.m29943b();
                            int i5 = 0;
                            while (i5 < m29941a2) {
                                if (m29943b) {
                                    if (yh1Var4.m29943b()) {
                                        yh1Var3 = yh1Var4;
                                        jArr[i5] = yh1Var4.m29941a(i3) + 1;
                                    } else {
                                        yh1Var3 = yh1Var4;
                                        jArr[i5] = 0;
                                    }
                                    yh1Var2 = yh1Var3;
                                } else {
                                    yh1Var2 = yh1Var4;
                                    jArr[i5] = yh1Var2.m29941a(5) + 1;
                                }
                                i5++;
                                yh1Var4 = yh1Var2;
                                i3 = 5;
                            }
                            yh1Var = yh1Var4;
                        } else {
                            yh1Var = yh1Var4;
                            int m29941a3 = yh1Var.m29941a(5) + 1;
                            int i6 = 0;
                            while (i6 < m29941a2) {
                                int i7 = 0;
                                for (int i8 = m29941a2 - i6; i8 > 0; i8 >>>= 1) {
                                    i7++;
                                }
                                int m29941a4 = yh1Var.m29941a(i7);
                                int i9 = 0;
                                while (i9 < m29941a4 && i6 < m29941a2) {
                                    jArr[i6] = m29941a3;
                                    i6++;
                                    i9++;
                                    c4868a = c4868a;
                                    bArr = bArr;
                                }
                                m29941a3++;
                                c4868a = c4868a;
                                bArr = bArr;
                            }
                        }
                        bi1.C4868a c4868a2 = c4868a;
                        byte[] bArr2 = bArr;
                        int m29941a5 = yh1Var.m29941a(4);
                        if (m29941a5 > 2) {
                            throw ep0.m24225a("lookup type greater than 2 not decodable: " + m29941a5, (Exception) null);
                        }
                        if (m29941a5 == 1 || m29941a5 == 2) {
                            yh1Var.m29942b(32);
                            yh1Var.m29942b(32);
                            int m29941a6 = yh1Var.m29941a(4) + 1;
                            yh1Var.m29942b(1);
                            if (m29941a5 != 1) {
                                j3 = m29941a2 * m29941a;
                            } else if (m29941a != 0) {
                                j3 = (long) Math.floor(Math.pow(m29941a2, 1.0d / m29941a));
                            }
                            yh1Var.m29942b((int) (m29941a6 * j3));
                        }
                        i4++;
                        yh1Var4 = yh1Var;
                        c4868a = c4868a2;
                        bArr = bArr2;
                        i3 = 5;
                    } else {
                        StringBuilder m26356a = l60.m26356a("expected code book to start with [0x56, 0x43, 0x42] at ");
                        m26356a.append(yh1Var4.m29940a());
                        throw ep0.m24225a(m26356a.toString(), (Exception) null);
                    }
                }
                bi1.C4868a c4868a3 = c4868a;
                byte[] bArr3 = bArr;
                yh1 yh1Var5 = yh1Var4;
                int i10 = 6;
                int m29941a7 = yh1Var5.m29941a(6) + 1;
                for (int i11 = 0; i11 < m29941a7; i11++) {
                    if (yh1Var5.m29941a(16) != 0) {
                        throw ep0.m24225a("placeholder of time domain transforms not zeroed out", (Exception) null);
                    }
                }
                int i12 = 1;
                int m29941a8 = yh1Var5.m29941a(6) + 1;
                int i13 = 0;
                while (true) {
                    int i14 = 3;
                    if (i13 < m29941a8) {
                        int m29941a9 = yh1Var5.m29941a(16);
                        if (m29941a9 == 0) {
                            int i15 = 8;
                            yh1Var5.m29942b(8);
                            yh1Var5.m29942b(16);
                            yh1Var5.m29942b(16);
                            yh1Var5.m29942b(6);
                            yh1Var5.m29942b(8);
                            int m29941a10 = yh1Var5.m29941a(4) + 1;
                            int i16 = 0;
                            while (i16 < m29941a10) {
                                yh1Var5.m29942b(i15);
                                i16++;
                                i15 = 8;
                            }
                        } else {
                            if (m29941a9 != i12) {
                                throw ep0.m24225a("floor type greater than 1 not decodable: " + m29941a9, (Exception) null);
                            }
                            int m29941a11 = yh1Var5.m29941a(5);
                            int i17 = -1;
                            int[] iArr = new int[m29941a11];
                            for (int i18 = 0; i18 < m29941a11; i18++) {
                                int m29941a12 = yh1Var5.m29941a(4);
                                iArr[i18] = m29941a12;
                                if (m29941a12 > i17) {
                                    i17 = m29941a12;
                                }
                            }
                            int i19 = i17 + 1;
                            int[] iArr2 = new int[i19];
                            int i20 = 0;
                            while (i20 < i19) {
                                iArr2[i20] = yh1Var5.m29941a(i14) + 1;
                                int m29941a13 = yh1Var5.m29941a(2);
                                int i21 = 8;
                                if (m29941a13 > 0) {
                                    yh1Var5.m29942b(8);
                                }
                                int i22 = 0;
                                for (int i23 = 1; i22 < (i23 << m29941a13); i23 = 1) {
                                    yh1Var5.m29942b(i21);
                                    i22++;
                                    i21 = 8;
                                }
                                i20++;
                                i14 = 3;
                            }
                            yh1Var5.m29942b(2);
                            int m29941a14 = yh1Var5.m29941a(4);
                            int i24 = 0;
                            int i25 = 0;
                            for (int i26 = 0; i26 < m29941a11; i26++) {
                                i24 += iArr2[iArr[i26]];
                                while (i25 < i24) {
                                    yh1Var5.m29942b(m29941a14);
                                    i25++;
                                }
                            }
                        }
                        i13++;
                        i10 = 6;
                        i12 = 1;
                    } else {
                        int i27 = 1;
                        int m29941a15 = yh1Var5.m29941a(i10) + 1;
                        int i28 = 0;
                        while (i28 < m29941a15) {
                            if (yh1Var5.m29941a(16) <= 2) {
                                yh1Var5.m29942b(24);
                                yh1Var5.m29942b(24);
                                yh1Var5.m29942b(24);
                                int m29941a16 = yh1Var5.m29941a(i10) + i27;
                                int i29 = 8;
                                yh1Var5.m29942b(8);
                                int[] iArr3 = new int[m29941a16];
                                for (int i30 = 0; i30 < m29941a16; i30++) {
                                    iArr3[i30] = ((yh1Var5.m29943b() ? yh1Var5.m29941a(5) : 0) * 8) + yh1Var5.m29941a(3);
                                }
                                int i31 = 0;
                                while (i31 < m29941a16) {
                                    int i32 = 0;
                                    while (i32 < i29) {
                                        if ((iArr3[i31] & (1 << i32)) != 0) {
                                            yh1Var5.m29942b(i29);
                                        }
                                        i32++;
                                        i29 = 8;
                                    }
                                    i31++;
                                    i29 = 8;
                                }
                                i28++;
                                i10 = 6;
                                i27 = 1;
                            } else {
                                throw ep0.m24225a("residueType greater than 2 is not decodable", (Exception) null);
                            }
                        }
                        int m29941a17 = yh1Var5.m29941a(i10) + 1;
                        for (int i33 = 0; i33 < m29941a17; i33++) {
                            int m29941a18 = yh1Var5.m29941a(16);
                            if (m29941a18 != 0) {
                                d90.m23839b("VorbisUtil", "mapping type other than 0 not supported: " + m29941a18);
                            } else {
                                int m29941a19 = yh1Var5.m29943b() ? yh1Var5.m29941a(4) + 1 : 1;
                                if (yh1Var5.m29943b()) {
                                    int m29941a20 = yh1Var5.m29941a(8) + 1;
                                    for (int i34 = 0; i34 < m29941a20; i34++) {
                                        int i35 = i2 - 1;
                                        int i36 = 0;
                                        for (int i37 = i35; i37 > 0; i37 >>>= 1) {
                                            i36++;
                                        }
                                        yh1Var5.m29942b(i36);
                                        int i38 = 0;
                                        while (i35 > 0) {
                                            i38++;
                                            i35 >>>= 1;
                                        }
                                        yh1Var5.m29942b(i38);
                                    }
                                }
                                if (yh1Var5.m29941a(2) != 0) {
                                    throw ep0.m24225a("to reserved bits must be zero after mapping coupling steps", (Exception) null);
                                }
                                if (m29941a19 > 1) {
                                    for (int i39 = 0; i39 < i2; i39++) {
                                        yh1Var5.m29942b(4);
                                    }
                                }
                                for (int i40 = 0; i40 < m29941a19; i40++) {
                                    yh1Var5.m29942b(8);
                                    yh1Var5.m29942b(8);
                                    yh1Var5.m29942b(8);
                                }
                            }
                        }
                        int m29941a21 = yh1Var5.m29941a(6) + 1;
                        bi1.C4869b[] c4869bArr = new bi1.C4869b[m29941a21];
                        for (int i41 = 0; i41 < m29941a21; i41++) {
                            boolean m29943b2 = yh1Var5.m29943b();
                            yh1Var5.m29941a(16);
                            yh1Var5.m29941a(16);
                            yh1Var5.m29941a(8);
                            c4869bArr[i41] = new bi1.C4869b(m29943b2);
                        }
                        if (yh1Var5.m29943b()) {
                            int i42 = 0;
                            for (int i43 = m29941a21 - 1; i43 > 0; i43 >>>= 1) {
                                i42++;
                            }
                            c6124a = new C6124a(c4870c, c4868a3, bArr3, c4869bArr, i42);
                        } else {
                            throw ep0.m24225a("framing bit after modes not set as expected", (Exception) null);
                        }
                    }
                }
            }
        }
        c6124a = null;
        this.f57188n = c6124a;
        if (c6124a == null) {
            return true;
        }
        bi1.C4870c c4870c2 = c6124a.f57193a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c4870c2.f48893g);
        arrayList.add(c6124a.f57195c);
        c5163a.f50845a = new C5606pv.a().m27561f("audio/vorbis").m27552b(c4870c2.f48890d).m27566k(c4870c2.f48889c).m27554c(c4870c2.f48887a).m27569n(c4870c2.f48888b).m27548a(arrayList).m27545a(bi1.m22836a(AbstractC4698p.m22053b(c6124a.f57194b.f48885a))).m27550a();
        return true;
    }
}
