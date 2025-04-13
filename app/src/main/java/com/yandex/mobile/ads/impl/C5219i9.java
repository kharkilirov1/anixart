package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: com.yandex.mobile.ads.impl.i9 */
/* loaded from: classes3.dex */
public final class C5219i9 extends g11 {
    @Override // com.yandex.mobile.ads.impl.g11
    @Nullable
    /* renamed from: a */
    public final Metadata mo22267a(yd0 yd0Var, ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        zo0 zo0Var = new zo0(byteBuffer.limit(), byteBuffer.array());
        zo0Var.m30257d(12);
        int m30256d = (zo0Var.m30256d() + zo0Var.m30252b(12)) - 4;
        zo0Var.m30257d(44);
        zo0Var.m30259e(zo0Var.m30252b(12));
        zo0Var.m30257d(16);
        ArrayList arrayList = new ArrayList();
        while (zo0Var.m30256d() < m30256d) {
            zo0Var.m30257d(48);
            int m30252b = zo0Var.m30252b(8);
            zo0Var.m30257d(4);
            int m30256d2 = zo0Var.m30256d() + zo0Var.m30252b(12);
            String str = null;
            String str2 = null;
            while (zo0Var.m30256d() < m30256d2) {
                int m30252b2 = zo0Var.m30252b(8);
                int m30252b3 = zo0Var.m30252b(8);
                int m30256d3 = zo0Var.m30256d() + m30252b3;
                if (m30252b2 == 2) {
                    int m30252b4 = zo0Var.m30252b(16);
                    zo0Var.m30257d(8);
                    if (m30252b4 == 3) {
                        while (zo0Var.m30256d() < m30256d3) {
                            str = zo0Var.m30247a(zo0Var.m30252b(8), C5285jh.f51606a);
                            int m30252b5 = zo0Var.m30252b(8);
                            for (int i2 = 0; i2 < m30252b5; i2++) {
                                zo0Var.m30259e(zo0Var.m30252b(8));
                            }
                        }
                    }
                } else if (m30252b2 == 21) {
                    str2 = zo0Var.m30247a(m30252b3, C5285jh.f51606a);
                }
                zo0Var.m30255c(m30256d3 * 8);
            }
            zo0Var.m30255c(m30256d2 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new AppInfoTable(m30252b, um1.m29049a(str, str2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }
}
