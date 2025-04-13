package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC5742se;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
final class kt0 extends AbstractC5742se {

    /* renamed from: com.yandex.mobile.ads.impl.kt0$a */
    public static final class C5358a implements AbstractC5742se.f {

        /* renamed from: a */
        private final p61 f52145a;

        /* renamed from: b */
        private final ap0 f52146b;

        public /* synthetic */ C5358a(p61 p61Var, int i2) {
            this(p61Var);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5742se.f
        /* renamed from: a */
        public final AbstractC5742se.e mo22628a(C5598pn c5598pn, long j2) throws IOException {
            long position = c5598pn.getPosition();
            int min = (int) Math.min(20000L, c5598pn.mo22717a() - position);
            this.f52146b.m22586c(min);
            c5598pn.mo26764b(this.f52146b.m22587c(), 0, min, false);
            ap0 ap0Var = this.f52146b;
            int i2 = -1;
            long j3 = -9223372036854775807L;
            int i3 = -1;
            while (ap0Var.m22579a() >= 4) {
                if (kt0.m26255a(ap0Var.m22588d(), ap0Var.m22587c()) != 442) {
                    ap0Var.m22593f(1);
                } else {
                    ap0Var.m22593f(4);
                    long m26527a = lt0.m26527a(ap0Var);
                    if (m26527a != -9223372036854775807L) {
                        long m27173b = this.f52145a.m27173b(m26527a);
                        if (m27173b > j2) {
                            return j3 == -9223372036854775807L ? AbstractC5742se.e.m28231a(m27173b, position) : AbstractC5742se.e.m28230a(position + i3);
                        }
                        if (100000 + m27173b > j2) {
                            return AbstractC5742se.e.m28230a(position + ap0Var.m22588d());
                        }
                        i3 = ap0Var.m22588d();
                        j3 = m27173b;
                    }
                    int m22590e = ap0Var.m22590e();
                    if (ap0Var.m22579a() >= 10) {
                        ap0Var.m22593f(9);
                        int m22607t = ap0Var.m22607t() & 7;
                        if (ap0Var.m22579a() >= m22607t) {
                            ap0Var.m22593f(m22607t);
                            if (ap0Var.m22579a() >= 4) {
                                if (kt0.m26255a(ap0Var.m22588d(), ap0Var.m22587c()) == 443) {
                                    ap0Var.m22593f(4);
                                    int m22613z = ap0Var.m22613z();
                                    if (ap0Var.m22579a() < m22613z) {
                                        ap0Var.m22591e(m22590e);
                                    } else {
                                        ap0Var.m22593f(m22613z);
                                    }
                                }
                                while (true) {
                                    if (ap0Var.m22579a() < 4) {
                                        break;
                                    }
                                    int m26255a = kt0.m26255a(ap0Var.m22588d(), ap0Var.m22587c());
                                    if (m26255a == 442 || m26255a == 441 || (m26255a >>> 8) != 1) {
                                        break;
                                    }
                                    ap0Var.m22593f(4);
                                    if (ap0Var.m22579a() < 2) {
                                        ap0Var.m22591e(m22590e);
                                        break;
                                    }
                                    ap0Var.m22591e(Math.min(ap0Var.m22590e(), ap0Var.m22588d() + ap0Var.m22613z()));
                                }
                            } else {
                                ap0Var.m22591e(m22590e);
                            }
                        } else {
                            ap0Var.m22591e(m22590e);
                        }
                    } else {
                        ap0Var.m22591e(m22590e);
                    }
                    i2 = ap0Var.m22588d();
                }
            }
            return j3 != -9223372036854775807L ? AbstractC5742se.e.m28233b(j3, position + i2) : AbstractC5742se.e.f54650d;
        }

        private C5358a(p61 p61Var) {
            this.f52145a = p61Var;
            this.f52146b = new ap0();
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5742se.f
        /* renamed from: a */
        public final void mo22629a() {
            ap0 ap0Var = this.f52146b;
            byte[] bArr = s91.f54535f;
            Objects.requireNonNull(ap0Var);
            ap0Var.m22582a(bArr.length, bArr);
        }
    }

    public kt0(p61 p61Var, long j2, long j3) {
        super(new AbstractC5742se.b(), new C5358a(p61Var, 0), j2, j2 + 1, 0L, j3, 188L, 1000);
    }

    /* renamed from: a */
    public static int m26255a(int i2, byte[] bArr) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }
}
