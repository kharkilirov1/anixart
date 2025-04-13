package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.u10;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class t10 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ u10 f54922b;

    public t10(u10 u10Var) {
        this.f54922b = u10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u10.InterfaceC5836d interfaceC5836d;
        Bitmap bitmap;
        u10.InterfaceC5836d interfaceC5836d2;
        u10.InterfaceC5836d interfaceC5836d3;
        for (u10.C5833a c5833a : this.f54922b.f55329d.values()) {
            Iterator it = c5833a.f55335d.iterator();
            while (it.hasNext()) {
                u10.C5835c c5835c = (u10.C5835c) it.next();
                interfaceC5836d = c5835c.f55337b;
                if (interfaceC5836d != null) {
                    if (c5833a.m28825a() == null) {
                        bitmap = c5833a.f55333b;
                        c5835c.f55336a = bitmap;
                        interfaceC5836d2 = c5835c.f55337b;
                        interfaceC5836d2.mo25927a(c5835c, false);
                    } else {
                        interfaceC5836d3 = c5835c.f55337b;
                        interfaceC5836d3.mo22923a(c5833a.m28825a());
                    }
                }
            }
        }
        this.f54922b.f55329d.clear();
        this.f54922b.f55331f = null;
    }
}
