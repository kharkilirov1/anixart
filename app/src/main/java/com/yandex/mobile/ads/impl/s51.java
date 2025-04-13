package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.r51;
import java.util.logging.Level;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s51 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ r51 f54508b;

    public s51(r51 r51Var) {
        this.f54508b = r51Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n51 m27847b;
        while (true) {
            r51 r51Var = this.f54508b;
            synchronized (r51Var) {
                m27847b = r51Var.m27847b();
            }
            if (m27847b == null) {
                return;
            }
            q51 m26803d = m27847b.m26803d();
            Intrinsics.m32176e(m26803d);
            r51 r51Var2 = this.f54508b;
            long j2 = -1;
            r51 r51Var3 = r51.f54199h;
            boolean isLoggable = r51.C5672b.m27854a().isLoggable(Level.FINE);
            if (isLoggable) {
                j2 = m26803d.m27642h().m27849d().mo27851a();
                o51.m27004a(m27847b, m26803d, "starting");
            }
            try {
                r51.m27845a(r51Var2, m27847b);
                if (isLoggable) {
                    long mo27851a = m26803d.m27642h().m27849d().mo27851a() - j2;
                    StringBuilder m26356a = l60.m26356a("finished run in ");
                    m26356a.append(o51.m27003a(mo27851a));
                    o51.m27004a(m27847b, m26803d, m26356a.toString());
                }
            } finally {
            }
        }
    }
}
