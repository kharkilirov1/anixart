package com.yandex.mobile.ads.impl;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes3.dex */
public final class hn0 implements InterfaceC5412lt {

    /* renamed from: a */
    private InterfaceC5509nt f51012a;

    /* renamed from: b */
    private h41 f51013b;

    /* renamed from: c */
    private boolean f51014c;

    static {
        dn1 dn1Var = dn1.f49686A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ InterfaceC5412lt[] m25265a() {
        return new InterfaceC5412lt[]{new hn0()};
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final boolean mo22432a(InterfaceC5458mt interfaceC5458mt) throws IOException {
        try {
            return m25264a((C5598pn) interfaceC5458mt);
        } catch (ep0 unused) {
            return false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22431a(InterfaceC5509nt interfaceC5509nt) {
        this.f51012a = interfaceC5509nt;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22430a(long j2, long j3) {
        h41 h41Var = this.f51013b;
        if (h41Var != null) {
            h41Var.m25054a(j2, j3);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final int mo22424a(InterfaceC5458mt interfaceC5458mt, qr0 qr0Var) throws IOException {
        C5220ia.m25474b(this.f51012a);
        if (this.f51013b == null) {
            C5598pn c5598pn = (C5598pn) interfaceC5458mt;
            if (m25264a(c5598pn)) {
                c5598pn.mo26765c();
            } else {
                throw ep0.m24225a("Failed to determine bitstream type", (Exception) null);
            }
        }
        if (!this.f51014c) {
            y61 mo23022a = this.f51012a.mo23022a(0, 1);
            this.f51012a.mo23023a();
            this.f51013b.m25055a(this.f51012a, mo23022a);
            this.f51014c = true;
        }
        return this.f51013b.m25052a((C5598pn) interfaceC5458mt, qr0Var);
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    /* renamed from: a */
    private boolean m25264a(C5598pn c5598pn) throws IOException {
        boolean z;
        jn0 jn0Var = new jn0();
        if (jn0Var.m25914a(c5598pn, true) && (jn0Var.f51662a & 2) == 2) {
            int min = Math.min(jn0Var.f51666e, 8);
            ap0 ap0Var = new ap0(min);
            c5598pn.mo26764b(ap0Var.m22587c(), 0, min, false);
            ap0Var.m22591e(0);
            if (ap0Var.m22579a() >= 5 && ap0Var.m22607t() == 127 && ap0Var.m22609v() == 1179402563) {
                this.f51013b = new C5046ev();
            } else {
                ap0Var.m22591e(0);
                try {
                    z = bi1.m22839a(1, ap0Var, true);
                } catch (ep0 unused) {
                    z = false;
                }
                if (z) {
                    this.f51013b = new zh1();
                } else {
                    ap0Var.m22591e(0);
                    if (no0.m26933b(ap0Var)) {
                        this.f51013b = new no0();
                    }
                }
            }
            return true;
        }
        return false;
    }
}
