package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.mp4.SlowMotionData;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
final class i01 {

    /* renamed from: d */
    private static final o31 f51177d = o31.m26991a(':');

    /* renamed from: e */
    private static final o31 f51178e = o31.m26991a('*');

    /* renamed from: a */
    private final ArrayList f51179a = new ArrayList();

    /* renamed from: b */
    private int f51180b = 0;

    /* renamed from: c */
    private int f51181c;

    /* renamed from: com.yandex.mobile.ads.impl.i01$a */
    public static final class C5208a {

        /* renamed from: a */
        public final long f51182a;

        /* renamed from: b */
        public final int f51183b;

        public C5208a(int i2, long j2) {
            this.f51182a = j2;
            this.f51183b = i2;
        }
    }

    /* renamed from: a */
    public final void m25422a() {
        this.f51179a.clear();
        this.f51180b = 0;
    }

    /* renamed from: a */
    public final void m25423a(InterfaceC5458mt interfaceC5458mt, qr0 qr0Var, ArrayList arrayList) throws IOException {
        int i2;
        char c2;
        int i3 = this.f51180b;
        if (i3 == 0) {
            long mo22717a = interfaceC5458mt.mo22717a();
            qr0Var.f54129a = (mo22717a == -1 || mo22717a < 8) ? 0L : mo22717a - 8;
            this.f51180b = 1;
            return;
        }
        if (i3 == 1) {
            ap0 ap0Var = new ap0(8);
            interfaceC5458mt.readFully(ap0Var.m22587c(), 0, 8);
            this.f51181c = ap0Var.m22598k() + 8;
            if (ap0Var.m22595h() != 1397048916) {
                qr0Var.f54129a = 0L;
                return;
            } else {
                qr0Var.f54129a = interfaceC5458mt.getPosition() - (this.f51181c - 12);
                this.f51180b = 2;
                return;
            }
        }
        char c3 = 2820;
        short s = 2819;
        short s2 = 2817;
        if (i3 == 2) {
            long mo22717a2 = interfaceC5458mt.mo22717a();
            int i4 = (this.f51181c - 12) - 8;
            ap0 ap0Var2 = new ap0(i4);
            interfaceC5458mt.readFully(ap0Var2.m22587c(), 0, i4);
            int i5 = 0;
            while (i5 < i4 / 12) {
                ap0Var2.m22593f(2);
                short m22600m = ap0Var2.m22600m();
                if (m22600m != 2192 && m22600m != 2816 && m22600m != s2 && m22600m != s) {
                    if (m22600m != 2820) {
                        ap0Var2.m22593f(8);
                        i2 = i4;
                        i5++;
                        i4 = i2;
                        s = 2819;
                        s2 = 2817;
                    }
                }
                i2 = i4;
                this.f51179a.add(new C5208a(ap0Var2.m22598k(), (mo22717a2 - this.f51181c) - ap0Var2.m22598k()));
                i5++;
                i4 = i2;
                s = 2819;
                s2 = 2817;
            }
            if (this.f51179a.isEmpty()) {
                qr0Var.f54129a = 0L;
                return;
            } else {
                this.f51180b = 3;
                qr0Var.f54129a = ((C5208a) this.f51179a.get(0)).f51182a;
                return;
            }
        }
        if (i3 == 3) {
            long position = interfaceC5458mt.getPosition();
            int mo22717a3 = (int) ((interfaceC5458mt.mo22717a() - interfaceC5458mt.getPosition()) - this.f51181c);
            ap0 ap0Var3 = new ap0(mo22717a3);
            interfaceC5458mt.readFully(ap0Var3.m22587c(), 0, mo22717a3);
            int i6 = 0;
            while (i6 < this.f51179a.size()) {
                C5208a c5208a = (C5208a) this.f51179a.get(i6);
                ap0Var3.m22591e((int) (c5208a.f51182a - position));
                ap0Var3.m22593f(4);
                int m22598k = ap0Var3.m22598k();
                Charset charset = C5285jh.f51608c;
                String m22580a = ap0Var3.m22580a(m22598k, charset);
                Objects.requireNonNull(m22580a);
                switch (m22580a) {
                    case "SlowMotion_Data":
                        c2 = 2192;
                        break;
                    case "Super_SlowMotion_Edit_Data":
                        c2 = 2819;
                        break;
                    case "Super_SlowMotion_Data":
                        c2 = 2816;
                        break;
                    case "Super_SlowMotion_Deflickering_On":
                        c2 = 2820;
                        break;
                    case "Super_SlowMotion_BGM":
                        c2 = 2817;
                        break;
                    default:
                        throw ep0.m24225a("Invalid SEF name", (Exception) null);
                }
                int i7 = c5208a.f51183b - (m22598k + 8);
                if (c2 == 2192) {
                    ArrayList arrayList2 = new ArrayList();
                    List<String> m26994a = f51178e.m26994a(ap0Var3.m22580a(i7, charset));
                    for (int i8 = 0; i8 < m26994a.size(); i8++) {
                        List<String> m26994a2 = f51177d.m26994a(m26994a.get(i8));
                        if (m26994a2.size() == 3) {
                            try {
                                arrayList2.add(new SlowMotionData.Segment(1 << (Integer.parseInt(m26994a2.get(2)) - 1), Long.parseLong(m26994a2.get(0)), Long.parseLong(m26994a2.get(1))));
                            } catch (NumberFormatException e2) {
                                throw ep0.m24225a((String) null, (Exception) e2);
                            }
                        } else {
                            throw ep0.m24225a((String) null, (Exception) null);
                        }
                    }
                    arrayList.add(new SlowMotionData(arrayList2));
                } else if (c2 != 2816 && c2 != 2817 && c2 != 2819 && c2 != c3) {
                    throw new IllegalStateException();
                }
                i6++;
                c3 = 2820;
            }
            qr0Var.f54129a = 0L;
            return;
        }
        throw new IllegalStateException();
    }
}
