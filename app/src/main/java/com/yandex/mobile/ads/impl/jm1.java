package com.yandex.mobile.ads.impl;

import android.os.AsyncTask;

/* loaded from: classes3.dex */
public abstract class jm1 extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private InterfaceC5293a f51652a;

    /* renamed from: b */
    public final InterfaceC5294b f51653b;

    /* renamed from: com.yandex.mobile.ads.impl.jm1$a */
    public interface InterfaceC5293a {
    }

    /* renamed from: com.yandex.mobile.ads.impl.jm1$b */
    public interface InterfaceC5294b {
    }

    public jm1(InterfaceC5294b interfaceC5294b) {
        this.f51653b = interfaceC5294b;
    }

    /* renamed from: a */
    public final void m25912a(InterfaceC5293a interfaceC5293a) {
        this.f51652a = interfaceC5293a;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        InterfaceC5293a interfaceC5293a = this.f51652a;
        if (interfaceC5293a != null) {
            ((om1) interfaceC5293a).m27094a();
        }
    }
}
