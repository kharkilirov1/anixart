package com.yandex.mobile.ads.impl;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.tw0;
import java.io.UnsupportedEncodingException;

/* loaded from: classes3.dex */
public final class n41 extends zv0<String> {

    /* renamed from: p */
    private final Object f52844p;

    /* renamed from: q */
    @Nullable
    @GuardedBy
    private tw0.InterfaceC5822b<String> f52845q;

    public n41(String str, tw0.InterfaceC5822b interfaceC5822b, @Nullable tw0.InterfaceC5821a interfaceC5821a) {
        super(0, str, interfaceC5821a);
        this.f52844p = new Object();
        this.f52845q = interfaceC5822b;
    }

    @Override // com.yandex.mobile.ads.impl.zv0
    /* renamed from: a */
    public final void mo23873a(String str) {
        tw0.InterfaceC5822b<String> interfaceC5822b;
        String str2 = str;
        synchronized (this.f52844p) {
            interfaceC5822b = this.f52845q;
        }
        if (interfaceC5822b != null) {
            interfaceC5822b.mo22924a(str2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.zv0
    /* renamed from: a */
    public final void mo26796a() {
        super.mo26796a();
        synchronized (this.f52844p) {
            this.f52845q = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.zv0
    /* renamed from: a */
    public final tw0<String> mo22616a(km0 km0Var) {
        String str;
        try {
            str = new String(km0Var.f52033b, k00.m26003a(km0Var.f52034c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(km0Var.f52033b);
        }
        return tw0.m28764a(str, k00.m26002a(km0Var));
    }
}
