package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
final class lt0 {

    /* renamed from: c */
    private boolean f52524c;

    /* renamed from: d */
    private boolean f52525d;

    /* renamed from: e */
    private boolean f52526e;

    /* renamed from: a */
    private final p61 f52522a = new p61(0);

    /* renamed from: f */
    private long f52527f = -9223372036854775807L;

    /* renamed from: g */
    private long f52528g = -9223372036854775807L;

    /* renamed from: h */
    private long f52529h = -9223372036854775807L;

    /* renamed from: b */
    private final ap0 f52523b = new ap0();

    /* renamed from: a */
    public final int m26528a(C5598pn c5598pn, qr0 qr0Var) throws IOException {
        long j2 = -9223372036854775807L;
        if (!this.f52526e) {
            long mo22717a = c5598pn.mo22717a();
            int min = (int) Math.min(20000L, mo22717a);
            long j3 = mo22717a - min;
            if (c5598pn.getPosition() != j3) {
                qr0Var.f54129a = j3;
                return 1;
            }
            this.f52523b.m22586c(min);
            c5598pn.mo26765c();
            c5598pn.mo26764b(this.f52523b.m22587c(), 0, min, false);
            ap0 ap0Var = this.f52523b;
            int m22588d = ap0Var.m22588d();
            int m22590e = ap0Var.m22590e() - 4;
            while (true) {
                if (m22590e < m22588d) {
                    break;
                }
                byte[] m22587c = ap0Var.m22587c();
                if (((m22587c[m22590e + 3] & 255) | ((m22587c[m22590e] & 255) << 24) | ((m22587c[m22590e + 1] & 255) << 16) | ((m22587c[m22590e + 2] & 255) << 8)) == 442) {
                    ap0Var.m22591e(m22590e + 4);
                    long m26527a = m26527a(ap0Var);
                    if (m26527a != -9223372036854775807L) {
                        j2 = m26527a;
                        break;
                    }
                }
                m22590e--;
            }
            this.f52528g = j2;
            this.f52526e = true;
            return 0;
        }
        if (this.f52528g == -9223372036854775807L) {
            ap0 ap0Var2 = this.f52523b;
            byte[] bArr = s91.f54535f;
            Objects.requireNonNull(ap0Var2);
            ap0Var2.m22582a(bArr.length, bArr);
            this.f52524c = true;
            c5598pn.mo26765c();
            return 0;
        }
        if (this.f52525d) {
            long j4 = this.f52527f;
            if (j4 == -9223372036854775807L) {
                ap0 ap0Var3 = this.f52523b;
                byte[] bArr2 = s91.f54535f;
                Objects.requireNonNull(ap0Var3);
                ap0Var3.m22582a(bArr2.length, bArr2);
                this.f52524c = true;
                c5598pn.mo26765c();
                return 0;
            }
            long m27173b = this.f52522a.m27173b(this.f52528g) - this.f52522a.m27173b(j4);
            this.f52529h = m27173b;
            if (m27173b < 0) {
                StringBuilder m26356a = l60.m26356a("Invalid duration: ");
                m26356a.append(this.f52529h);
                m26356a.append(". Using TIME_UNSET instead.");
                d90.m23842d("PsDurationReader", m26356a.toString());
                this.f52529h = -9223372036854775807L;
            }
            ap0 ap0Var4 = this.f52523b;
            byte[] bArr3 = s91.f54535f;
            Objects.requireNonNull(ap0Var4);
            ap0Var4.m22582a(bArr3.length, bArr3);
            this.f52524c = true;
            c5598pn.mo26765c();
            return 0;
        }
        int min2 = (int) Math.min(20000L, c5598pn.mo22717a());
        long j5 = 0;
        if (c5598pn.getPosition() != j5) {
            qr0Var.f54129a = j5;
            return 1;
        }
        this.f52523b.m22586c(min2);
        c5598pn.mo26765c();
        c5598pn.mo26764b(this.f52523b.m22587c(), 0, min2, false);
        ap0 ap0Var5 = this.f52523b;
        int m22588d2 = ap0Var5.m22588d();
        int m22590e2 = ap0Var5.m22590e();
        while (true) {
            if (m22588d2 >= m22590e2 - 3) {
                break;
            }
            byte[] m22587c2 = ap0Var5.m22587c();
            int i2 = m22588d2 + 1;
            if (((m22587c2[m22588d2 + 3] & 255) | ((m22587c2[m22588d2] & 255) << 24) | ((m22587c2[i2] & 255) << 16) | ((m22587c2[m22588d2 + 2] & 255) << 8)) == 442) {
                ap0Var5.m22591e(m22588d2 + 4);
                long m26527a2 = m26527a(ap0Var5);
                if (m26527a2 != -9223372036854775807L) {
                    j2 = m26527a2;
                    break;
                }
            }
            m22588d2 = i2;
        }
        this.f52527f = j2;
        this.f52525d = true;
        return 0;
    }

    /* renamed from: b */
    public final p61 m26530b() {
        return this.f52522a;
    }

    /* renamed from: c */
    public final boolean m26531c() {
        return this.f52524c;
    }

    /* renamed from: a */
    public final long m26529a() {
        return this.f52529h;
    }

    /* renamed from: a */
    public static long m26527a(ap0 ap0Var) {
        int m22588d = ap0Var.m22588d();
        if (ap0Var.m22579a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        boolean z = false;
        ap0Var.m22583a(bArr, 0, 9);
        ap0Var.m22591e(m22588d);
        byte b = bArr[0];
        if ((b & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            z = true;
        }
        if (!z) {
            return -9223372036854775807L;
        }
        long j2 = b;
        long j3 = ((j2 & 3) << 28) | (((56 & j2) >> 3) << 30) | ((bArr[1] & 255) << 20);
        long j4 = bArr[2];
        return j3 | (((j4 & 248) >> 3) << 15) | ((j4 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }
}
