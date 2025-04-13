package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.impl.C5606pv;

/* loaded from: classes3.dex */
final class d80 implements InterfaceC5392lc {

    /* renamed from: a */
    public final AbstractC4698p<InterfaceC5392lc> f49599a;

    /* renamed from: b */
    private final int f49600b;

    private d80(int i2, AbstractC4698p<InterfaceC5392lc> abstractC4698p) {
        this.f49600b = i2;
        this.f49599a = abstractC4698p;
    }

    /* renamed from: a */
    public static d80 m23833a(int i2, ap0 ap0Var) {
        String str;
        AbstractC4698p.a aVar = new AbstractC4698p.a();
        int m22590e = ap0Var.m22590e();
        int i3 = -2;
        while (ap0Var.m22579a() > 8) {
            int m22598k = ap0Var.m22598k();
            int m22588d = ap0Var.m22588d() + ap0Var.m22598k();
            ap0Var.m22589d(m22588d);
            InterfaceC5392lc interfaceC5392lc = null;
            if (m22598k == 1414744396) {
                interfaceC5392lc = m23833a(ap0Var.m22598k(), ap0Var);
            } else if (m22598k != 1718776947) {
                if (m22598k == 1751742049) {
                    interfaceC5392lc = C5482nc.m26841a(ap0Var);
                } else if (m22598k == 1752331379) {
                    interfaceC5392lc = C5533oc.m27067a(ap0Var);
                } else if (m22598k == 1852994675) {
                    interfaceC5392lc = g41.m24803a(ap0Var);
                }
            } else if (i3 == 2) {
                ap0Var.m22593f(4);
                int m22598k2 = ap0Var.m22598k();
                int m22598k3 = ap0Var.m22598k();
                ap0Var.m22593f(4);
                int m22598k4 = ap0Var.m22598k();
                switch (m22598k4) {
                    case 808802372:
                    case 877677894:
                    case 1145656883:
                    case 1145656920:
                    case 1482049860:
                    case 1684633208:
                    case 2021026148:
                        str = "video/mp4v-es";
                        break;
                    case 826496577:
                    case 828601953:
                    case 875967048:
                        str = "video/avc";
                        break;
                    case 842289229:
                        str = "video/mp42";
                        break;
                    case 859066445:
                        str = "video/mp43";
                        break;
                    case 1196444237:
                    case 1735420525:
                        str = "video/mjpeg";
                        break;
                    default:
                        str = null;
                        break;
                }
                if (str == null) {
                    c80.m23073a("Ignoring track with unsupported compression ", m22598k4, "StreamFormatChunk");
                } else {
                    C5606pv.a aVar2 = new C5606pv.a();
                    aVar2.m27572q(m22598k2).m27562g(m22598k3).m27561f(str);
                    interfaceC5392lc = new f41(aVar2.m27550a());
                }
            } else if (i3 == 1) {
                int m22602o = ap0Var.m22602o();
                String str2 = m22602o != 1 ? m22602o != 85 ? m22602o != 255 ? m22602o != 8192 ? m22602o != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                if (str2 == null) {
                    c80.m23073a("Ignoring track with unsupported format tag ", m22602o, "StreamFormatChunk");
                } else {
                    int m22602o2 = ap0Var.m22602o();
                    int m22598k5 = ap0Var.m22598k();
                    ap0Var.m22593f(6);
                    int m28116b = s91.m28116b(ap0Var.m22613z());
                    int m22602o3 = ap0Var.m22602o();
                    byte[] bArr = new byte[m22602o3];
                    ap0Var.m22583a(bArr, 0, m22602o3);
                    C5606pv.a aVar3 = new C5606pv.a();
                    aVar3.m27561f(str2).m27554c(m22602o2).m27569n(m22598k5);
                    if ("audio/raw".equals(str2) && m28116b != 0) {
                        aVar3.m27565j(m28116b);
                    }
                    if ("audio/mp4a-latm".equals(str2) && m22602o3 > 0) {
                        aVar3.m27548a(AbstractC4698p.m22048a(bArr));
                    }
                    interfaceC5392lc = new f41(aVar3.m27550a());
                }
            } else {
                StringBuilder m26356a = l60.m26356a("Ignoring strf box for unsupported track type: ");
                m26356a.append(s91.m28129d(i3));
                d90.m23842d("StreamFormatChunk", m26356a.toString());
            }
            if (interfaceC5392lc != null) {
                if (interfaceC5392lc.getType() == 1752331379) {
                    C5533oc c5533oc = (C5533oc) interfaceC5392lc;
                    int i4 = c5533oc.f53239a;
                    if (i4 == 1935960438) {
                        i3 = 2;
                    } else if (i4 == 1935963489) {
                        i3 = 1;
                    } else if (i4 != 1937012852) {
                        StringBuilder m26356a2 = l60.m26356a("Found unsupported streamType fourCC: ");
                        m26356a2.append(Integer.toHexString(c5533oc.f53239a));
                        d90.m23842d("AviStreamHeaderChunk", m26356a2.toString());
                        i3 = -1;
                    } else {
                        i3 = 3;
                    }
                }
                aVar.m22060b(interfaceC5392lc);
            }
            ap0Var.m22591e(m22588d);
            ap0Var.m22589d(m22590e);
        }
        return new d80(i2, aVar.m22058a());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5392lc
    public final int getType() {
        return this.f49600b;
    }
}
