package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
final class e81 {

    /* renamed from: d */
    private boolean f49838d;

    /* renamed from: e */
    private boolean f49839e;

    /* renamed from: f */
    private boolean f49840f;

    /* renamed from: a */
    private final int f49835a = 112800;

    /* renamed from: b */
    private final p61 f49836b = new p61(0);

    /* renamed from: g */
    private long f49841g = -9223372036854775807L;

    /* renamed from: h */
    private long f49842h = -9223372036854775807L;

    /* renamed from: i */
    private long f49843i = -9223372036854775807L;

    /* renamed from: c */
    private final ap0 f49837c = new ap0();

    /* renamed from: a */
    public final long m24041a() {
        return this.f49843i;
    }

    /* renamed from: b */
    public final p61 m24042b() {
        return this.f49836b;
    }

    /* renamed from: c */
    public final boolean m24043c() {
        return this.f49838d;
    }

    /* renamed from: a */
    public final int m24040a(C5598pn c5598pn, qr0 qr0Var, int i2) throws IOException {
        boolean z;
        if (i2 <= 0) {
            ap0 ap0Var = this.f49837c;
            byte[] bArr = s91.f54535f;
            Objects.requireNonNull(ap0Var);
            ap0Var.m22582a(bArr.length, bArr);
            this.f49838d = true;
            c5598pn.mo26765c();
            return 0;
        }
        long j2 = -9223372036854775807L;
        if (!this.f49840f) {
            long mo22717a = c5598pn.mo22717a();
            int min = (int) Math.min(this.f49835a, mo22717a);
            long j3 = mo22717a - min;
            if (c5598pn.getPosition() != j3) {
                qr0Var.f54129a = j3;
                return 1;
            }
            this.f49837c.m22586c(min);
            c5598pn.mo26765c();
            c5598pn.mo26764b(this.f49837c.m22587c(), 0, min, false);
            ap0 ap0Var2 = this.f49837c;
            int m22588d = ap0Var2.m22588d();
            int m22590e = ap0Var2.m22590e();
            int i3 = m22590e - 188;
            while (true) {
                if (i3 < m22588d) {
                    break;
                }
                byte[] m22587c = ap0Var2.m22587c();
                int i4 = -4;
                int i5 = 0;
                while (true) {
                    if (i4 > 4) {
                        z = false;
                        break;
                    }
                    int i6 = (i4 * 188) + i3;
                    if (i6 < m22588d || i6 >= m22590e || m22587c[i6] != 71) {
                        i5 = 0;
                    } else {
                        i5++;
                        if (i5 == 5) {
                            z = true;
                            break;
                        }
                    }
                    i4++;
                }
                if (z) {
                    long m25084a = h81.m25084a(i3, i2, ap0Var2);
                    if (m25084a != -9223372036854775807L) {
                        j2 = m25084a;
                        break;
                    }
                }
                i3--;
            }
            this.f49842h = j2;
            this.f49840f = true;
            return 0;
        }
        if (this.f49842h == -9223372036854775807L) {
            ap0 ap0Var3 = this.f49837c;
            byte[] bArr2 = s91.f54535f;
            Objects.requireNonNull(ap0Var3);
            ap0Var3.m22582a(bArr2.length, bArr2);
            this.f49838d = true;
            c5598pn.mo26765c();
            return 0;
        }
        if (!this.f49839e) {
            int min2 = (int) Math.min(this.f49835a, c5598pn.mo22717a());
            long j4 = 0;
            if (c5598pn.getPosition() != j4) {
                qr0Var.f54129a = j4;
                return 1;
            }
            this.f49837c.m22586c(min2);
            c5598pn.mo26765c();
            c5598pn.mo26764b(this.f49837c.m22587c(), 0, min2, false);
            ap0 ap0Var4 = this.f49837c;
            int m22588d2 = ap0Var4.m22588d();
            int m22590e2 = ap0Var4.m22590e();
            while (true) {
                if (m22588d2 >= m22590e2) {
                    break;
                }
                if (ap0Var4.m22587c()[m22588d2] == 71) {
                    long m25084a2 = h81.m25084a(m22588d2, i2, ap0Var4);
                    if (m25084a2 != -9223372036854775807L) {
                        j2 = m25084a2;
                        break;
                    }
                }
                m22588d2++;
            }
            this.f49841g = j2;
            this.f49839e = true;
            return 0;
        }
        long j5 = this.f49841g;
        if (j5 == -9223372036854775807L) {
            ap0 ap0Var5 = this.f49837c;
            byte[] bArr3 = s91.f54535f;
            Objects.requireNonNull(ap0Var5);
            ap0Var5.m22582a(bArr3.length, bArr3);
            this.f49838d = true;
            c5598pn.mo26765c();
            return 0;
        }
        long m27173b = this.f49836b.m27173b(this.f49842h) - this.f49836b.m27173b(j5);
        this.f49843i = m27173b;
        if (m27173b < 0) {
            StringBuilder m26356a = l60.m26356a("Invalid duration: ");
            m26356a.append(this.f49843i);
            m26356a.append(". Using TIME_UNSET instead.");
            d90.m23842d("TsDurationReader", m26356a.toString());
            this.f49843i = -9223372036854775807L;
        }
        ap0 ap0Var6 = this.f49837c;
        byte[] bArr4 = s91.f54535f;
        Objects.requireNonNull(ap0Var6);
        ap0Var6.m22582a(bArr4.length, bArr4);
        this.f49838d = true;
        c5598pn.mo26765c();
        return 0;
    }
}
