package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.g81;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.io */
/* loaded from: classes3.dex */
public final class C5241io implements g81.InterfaceC5111c {

    /* renamed from: a */
    private final int f51353a;

    /* renamed from: b */
    private final List<C5606pv> f51354b;

    public C5241io() {
        this(AbstractC4698p.m22055i());
    }

    @Override // com.yandex.mobile.ads.impl.g81.InterfaceC5111c
    /* renamed from: a */
    public final SparseArray<g81> mo24819a() {
        return new SparseArray<>();
    }

    public C5241io(List list) {
        this.f51353a = 0;
        this.f51354b = list;
    }

    @Override // com.yandex.mobile.ads.impl.g81.InterfaceC5111c
    @Nullable
    /* renamed from: a */
    public final g81 mo24820a(int i2, g81.C5110b c5110b) {
        if (i2 != 2) {
            if (i2 == 3 || i2 == 4) {
                return new tp0(new ef0(c5110b.f50528a));
            }
            if (i2 == 21) {
                return new tp0(new f10());
            }
            if (i2 == 27) {
                if (m25584a(4)) {
                    return null;
                }
                return new tp0(new C6146zx(new j01(m25583a(c5110b)), m25584a(1), m25584a(8)));
            }
            if (i2 == 36) {
                return new tp0(new C4829ay(new j01(m25583a(c5110b))));
            }
            if (i2 == 89) {
                return new tp0(new C6088yq(c5110b.f50529b));
            }
            if (i2 != 138) {
                if (i2 == 172) {
                    return new tp0(new C5311k(c5110b.f50528a));
                }
                if (i2 == 257) {
                    return new d01(new kp0("application/vnd.dvb.ait"));
                }
                if (i2 == 134) {
                    if (m25584a(16)) {
                        return null;
                    }
                    return new d01(new kp0("application/x-scte35"));
                }
                if (i2 != 135) {
                    switch (i2) {
                        case 15:
                            if (!m25584a(2)) {
                                break;
                            }
                            break;
                        case 16:
                            break;
                        case 17:
                            if (!m25584a(2)) {
                                break;
                            }
                            break;
                        default:
                            switch (i2) {
                                case 130:
                                    if (!m25584a(64)) {
                                    }
                                    break;
                            }
                    }
                    return null;
                }
                return new tp0(new C5155h(c5110b.f50528a));
            }
            return new tp0(new C5601pq(c5110b.f50528a));
        }
        return new tp0(new C6045xx(new r91(m25583a(c5110b))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* renamed from: a */
    private List<C5606pv> m25583a(g81.C5110b c5110b) {
        String str;
        int i2;
        if (m25584a(32)) {
            return this.f51354b;
        }
        ap0 ap0Var = new ap0(c5110b.f50530c);
        ArrayList arrayList = this.f51354b;
        while (ap0Var.m22579a() > 0) {
            int m22607t = ap0Var.m22607t();
            int m22588d = ap0Var.m22588d() + ap0Var.m22607t();
            if (m22607t == 134) {
                arrayList = new ArrayList();
                int m22607t2 = ap0Var.m22607t() & 31;
                for (int i3 = 0; i3 < m22607t2; i3++) {
                    String m22580a = ap0Var.m22580a(3, C5285jh.f51608c);
                    int m22607t3 = ap0Var.m22607t();
                    boolean z = (m22607t3 & 128) != 0;
                    if (z) {
                        i2 = m22607t3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i2 = 1;
                    }
                    byte m22607t4 = (byte) ap0Var.m22607t();
                    ap0Var.m22593f(1);
                    List<byte[]> list = null;
                    if (z) {
                        list = Collections.singletonList((m22607t4 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    }
                    arrayList.add(new C5606pv.a().m27561f(str).m27559e(m22580a).m27542a(i2).m27548a(list).m27550a());
                }
            }
            ap0Var.m22591e(m22588d);
            arrayList = arrayList;
        }
        return arrayList;
    }

    /* renamed from: a */
    private boolean m25584a(int i2) {
        return (i2 & this.f51353a) != 0;
    }
}
