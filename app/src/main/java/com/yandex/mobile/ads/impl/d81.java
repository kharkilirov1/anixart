package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC5742se;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
final class d81 extends AbstractC5742se {
    public d81(p61 p61Var, long j2, long j3, int i2, int i3) {
        super(new AbstractC5742se.b(), new C4961a(i2, p61Var, i3), j2, j2 + 1, 0L, j3, 188L, 940);
    }

    /* renamed from: com.yandex.mobile.ads.impl.d81$a */
    public static final class C4961a implements AbstractC5742se.f {

        /* renamed from: a */
        private final p61 f49601a;

        /* renamed from: b */
        private final ap0 f49602b = new ap0();

        /* renamed from: c */
        private final int f49603c;

        /* renamed from: d */
        private final int f49604d;

        public C4961a(int i2, p61 p61Var, int i3) {
            this.f49603c = i2;
            this.f49601a = p61Var;
            this.f49604d = i3;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5742se.f
        /* renamed from: a */
        public final AbstractC5742se.e mo22628a(C5598pn c5598pn, long j2) throws IOException {
            long position = c5598pn.getPosition();
            int min = (int) Math.min(this.f49604d, c5598pn.mo22717a() - position);
            this.f49602b.m22586c(min);
            c5598pn.mo26764b(this.f49602b.m22587c(), 0, min, false);
            ap0 ap0Var = this.f49602b;
            int m22590e = ap0Var.m22590e();
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (ap0Var.m22579a() >= 188) {
                byte[] m22587c = ap0Var.m22587c();
                int m22588d = ap0Var.m22588d();
                while (m22588d < m22590e && m22587c[m22588d] != 71) {
                    m22588d++;
                }
                int i2 = m22588d + 188;
                if (i2 > m22590e) {
                    break;
                }
                long m25084a = h81.m25084a(m22588d, this.f49603c, ap0Var);
                if (m25084a != -9223372036854775807L) {
                    long m27173b = this.f49601a.m27173b(m25084a);
                    if (m27173b > j2) {
                        return j5 == -9223372036854775807L ? AbstractC5742se.e.m28231a(m27173b, position) : AbstractC5742se.e.m28230a(position + j4);
                    }
                    if (100000 + m27173b > j2) {
                        return AbstractC5742se.e.m28230a(position + m22588d);
                    }
                    j5 = m27173b;
                    j4 = m22588d;
                }
                ap0Var.m22591e(i2);
                j3 = i2;
            }
            return j5 != -9223372036854775807L ? AbstractC5742se.e.m28233b(j5, position + j3) : AbstractC5742se.e.f54650d;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5742se.f
        /* renamed from: a */
        public final void mo22629a() {
            ap0 ap0Var = this.f49602b;
            byte[] bArr = s91.f54535f;
            Objects.requireNonNull(ap0Var);
            ap0Var.m22582a(bArr.length, bArr);
        }
    }
}
