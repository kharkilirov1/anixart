package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.content.Intent;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.yandex.metrica.impl.ob.a3 */
/* loaded from: classes2.dex */
class C3809a3 implements InterfaceC3653Tm<Context, Intent, Void> {

    /* renamed from: a */
    public final /* synthetic */ AbstractC3884d0 f44725a;

    /* renamed from: b */
    public final /* synthetic */ CountDownLatch f44726b;

    /* renamed from: c */
    public final /* synthetic */ C3835b3 f44727c;

    public C3809a3(C3835b3 c3835b3, AbstractC3884d0 abstractC3884d0, CountDownLatch countDownLatch) {
        this.f44727c = c3835b3;
        this.f44725a = abstractC3884d0;
        this.f44726b = countDownLatch;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3653Tm
    /* renamed from: a */
    public Void mo17948a(Context context, Intent intent) {
        List m19639c;
        C3887d3 c3887d3;
        AbstractC3884d0 abstractC3884d0 = this.f44725a;
        m19639c = this.f44727c.m19639c();
        abstractC3884d0.m19690a(m19639c);
        this.f44726b.countDown();
        c3887d3 = this.f44727c.f44802k;
        c3887d3.m19704b(this);
        return null;
    }
}
