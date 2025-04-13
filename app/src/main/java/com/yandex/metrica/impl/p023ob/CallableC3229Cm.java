package com.yandex.metrica.impl.p023ob;

import java.util.concurrent.Callable;

/* renamed from: com.yandex.metrica.impl.ob.Cm */
/* loaded from: classes2.dex */
class CallableC3229Cm implements Callable<String> {

    /* renamed from: a */
    public final /* synthetic */ C3254Dm f42680a;

    public CallableC3229Cm(C3254Dm c3254Dm) {
        this.f42680a = c3254Dm;
    }

    @Override // java.util.concurrent.Callable
    public String call() throws Exception {
        String m17982a;
        m17982a = this.f42680a.m17982a();
        return m17982a;
    }
}
