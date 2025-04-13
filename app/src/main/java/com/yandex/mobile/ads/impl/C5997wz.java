package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.wz */
/* loaded from: classes3.dex */
public final class C5997wz extends n51 {

    /* renamed from: e */
    public final /* synthetic */ C5947vz f56301e;

    /* renamed from: f */
    public final /* synthetic */ c00 f56302f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5997wz(String str, C5947vz c5947vz, c00 c00Var) {
        super(str, true);
        this.f56301e = c5947vz;
        this.f56302f = c00Var;
    }

    @Override // com.yandex.mobile.ads.impl.n51
    /* renamed from: e */
    public final long mo26804e() {
        try {
            this.f56301e.m29326e().mo26266a(this.f56302f);
            return -1L;
        } catch (IOException e2) {
            eq0 eq0Var = eq0.f50035a;
            StringBuilder m26356a = l60.m26356a("Http2Connection.Listener failure for ");
            m26356a.append(this.f56301e.m29322c());
            String sb = m26356a.toString();
            Objects.requireNonNull(eq0Var);
            eq0.m24229a(4, sb, e2);
            try {
                this.f56302f.m22963a(EnumC5708rr.f54402c, e2);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}
