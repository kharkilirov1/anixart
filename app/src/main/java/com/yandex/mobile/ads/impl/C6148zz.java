package com.yandex.mobile.ads.impl;

import java.io.IOException;
import okio.Buffer;

/* renamed from: com.yandex.mobile.ads.impl.zz */
/* loaded from: classes3.dex */
public final class C6148zz extends n51 {

    /* renamed from: e */
    public final /* synthetic */ C5947vz f57401e;

    /* renamed from: f */
    public final /* synthetic */ int f57402f;

    /* renamed from: g */
    public final /* synthetic */ Buffer f57403g;

    /* renamed from: h */
    public final /* synthetic */ int f57404h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6148zz(String str, C5947vz c5947vz, int i2, Buffer buffer, int i3, boolean z) {
        super(str, true);
        this.f57401e = c5947vz;
        this.f57402f = i2;
        this.f57403g = buffer;
        this.f57404h = i3;
    }

    @Override // com.yandex.mobile.ads.impl.n51
    /* renamed from: e */
    public final long mo26804e() {
        try {
            qt0 qt0Var = this.f57401e.f55916l;
            pt0 pt0Var = (pt0) qt0Var;
            pt0Var.m27374a(this.f57404h, this.f57403g);
            this.f57401e.m29332k().m23739a(this.f57402f, EnumC5708rr.f54406g);
            synchronized (this.f57401e) {
                this.f57401e.f55904B.remove(Integer.valueOf(this.f57402f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
