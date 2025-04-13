package com.yandex.metrica.push.impl;

import java.util.concurrent.Callable;

/* renamed from: com.yandex.metrica.push.impl.G0 */
/* loaded from: classes2.dex */
class CallableC4524G0 implements Callable<String> {

    /* renamed from: a */
    public final /* synthetic */ C4526H0 f47291a;

    public CallableC4524G0(C4526H0 c4526h0) {
        this.f47291a = c4526h0;
    }

    @Override // java.util.concurrent.Callable
    public String call() throws Exception {
        String m21436a;
        m21436a = this.f47291a.m21436a();
        return m21436a;
    }
}
