package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC5742se;
import com.yandex.mobile.ads.impl.C4940cv;
import java.io.IOException;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.av */
/* loaded from: classes3.dex */
final class C4825av extends AbstractC5742se {

    /* renamed from: com.yandex.mobile.ads.impl.av$a */
    public static final class a implements AbstractC5742se.f {

        /* renamed from: a */
        private final C5147gv f48656a;

        /* renamed from: b */
        private final int f48657b;

        /* renamed from: c */
        private final C4940cv.a f48658c;

        public /* synthetic */ a(C5147gv c5147gv, int i2) {
            this(i2, c5147gv);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5742se.f
        /* renamed from: a */
        public final AbstractC5742se.e mo22628a(C5598pn c5598pn, long j2) throws IOException {
            long position = c5598pn.getPosition();
            long m22627a = m22627a(c5598pn);
            long mo22718e = c5598pn.mo22718e();
            c5598pn.m27349a(false, Math.max(6, this.f48656a.f50743c));
            long m22627a2 = m22627a(c5598pn);
            return (m22627a > j2 || m22627a2 <= j2) ? m22627a2 <= j2 ? AbstractC5742se.e.m28233b(m22627a2, c5598pn.mo22718e()) : AbstractC5742se.e.m28231a(m22627a, position) : AbstractC5742se.e.m28230a(mo22718e);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5742se.f
        /* renamed from: a */
        public /* synthetic */ void mo22629a() {
            wp1.m29521a(this);
        }

        private a(int i2, C5147gv c5147gv) {
            this.f48656a = c5147gv;
            this.f48657b = i2;
            this.f48658c = new C4940cv.a();
        }

        /* renamed from: a */
        private long m22627a(C5598pn c5598pn) throws IOException {
            boolean m23518a;
            while (c5598pn.mo22718e() < c5598pn.mo22717a() - 6) {
                C5147gv c5147gv = this.f48656a;
                int i2 = this.f48657b;
                C4940cv.a aVar = this.f48658c;
                long mo22718e = c5598pn.mo22718e();
                int i3 = 2;
                byte[] bArr = new byte[2];
                c5598pn.mo26764b(bArr, 0, 2, false);
                if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i2) {
                    c5598pn.mo26765c();
                    c5598pn.m27349a(false, (int) (mo22718e - c5598pn.getPosition()));
                    m23518a = false;
                } else {
                    ap0 ap0Var = new ap0(16);
                    System.arraycopy(bArr, 0, ap0Var.m22587c(), 0, 2);
                    byte[] m22587c = ap0Var.m22587c();
                    int i4 = 0;
                    for (int i5 = 14; i4 < i5; i5 = 14) {
                        int m27350b = c5598pn.m27350b(m22587c, i3 + i4, 14 - i4);
                        if (m27350b == -1) {
                            break;
                        }
                        i4 += m27350b;
                        i3 = 2;
                    }
                    ap0Var.m22589d(i4);
                    c5598pn.mo26765c();
                    c5598pn.m27349a(false, (int) (mo22718e - c5598pn.getPosition()));
                    m23518a = C4940cv.m23518a(ap0Var, c5147gv, i2, aVar);
                }
                if (m23518a) {
                    break;
                }
                c5598pn.m27349a(false, 1);
            }
            if (c5598pn.mo22718e() >= c5598pn.mo22717a() - 6) {
                c5598pn.m27349a(false, (int) (c5598pn.mo22717a() - c5598pn.mo22718e()));
                return this.f48656a.f50750j;
            }
            return this.f48658c.f49363a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4825av(C5147gv c5147gv, int i2, long j2, long j3) {
        super(new en1(c5147gv, 9), new a(c5147gv, i2), c5147gv.m24986b(), c5147gv.f50750j, j2, j3, c5147gv.m24981a(), Math.max(6, c5147gv.f50743c));
        Objects.requireNonNull(c5147gv);
    }
}
