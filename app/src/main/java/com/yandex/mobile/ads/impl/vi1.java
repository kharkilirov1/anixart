package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class vi1 extends i11 {

    /* renamed from: m */
    private final ap0 f55820m = new ap0();

    /* renamed from: n */
    private final ri1 f55821n = new ri1();

    @Override // com.yandex.mobile.ads.impl.i11
    /* renamed from: a */
    public final w41 mo23247a(byte[] bArr, int i2, boolean z) throws y41 {
        ti1 m29009a;
        this.f55820m.m22582a(i2, bArr);
        ArrayList arrayList = new ArrayList();
        try {
            wi1.m29485a(this.f55820m);
            while (!TextUtils.isEmpty(this.f55820m.m22597j())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                ap0 ap0Var = this.f55820m;
                char c2 = 65535;
                int i3 = 0;
                while (c2 == 65535) {
                    i3 = ap0Var.m22588d();
                    String m22597j = ap0Var.m22597j();
                    c2 = m22597j == null ? (char) 0 : "STYLE".equals(m22597j) ? (char) 2 : m22597j.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                ap0Var.m22591e(i3);
                if (c2 == 0) {
                    return new xi1(arrayList2);
                }
                if (c2 == 1) {
                    while (!TextUtils.isEmpty(this.f55820m.m22597j())) {
                    }
                } else if (c2 == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new y41("A style block was found after the first cue.");
                    }
                    this.f55820m.m22597j();
                    arrayList.addAll(this.f55821n.m27931a(this.f55820m));
                } else if (c2 == 3 && (m29009a = ui1.m29009a(this.f55820m, arrayList)) != null) {
                    arrayList2.add(m29009a);
                }
            }
        } catch (ep0 e2) {
            throw new y41(e2);
        }
    }
}
