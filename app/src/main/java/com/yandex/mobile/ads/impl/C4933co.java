package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import com.yandex.mobile.ads.exo.metadata.C4739a;
import com.yandex.mobile.ads.impl.C5085fn;
import java.util.ArrayList;

/* renamed from: com.yandex.mobile.ads.impl.co */
/* loaded from: classes3.dex */
public final class C4933co implements fv0 {

    /* renamed from: a */
    private final Context f49327a;

    /* renamed from: b */
    private final C6083yn f49328b = new C6083yn();

    /* renamed from: c */
    private ab0 f49329c = ab0.f48475a;

    public C4933co(Context context) {
        this.f49327a = context;
    }

    @Override // com.yandex.mobile.ads.impl.fv0
    /* renamed from: a */
    public final cv0[] mo23497a(Handler handler, hf1 hf1Var, InterfaceC5790tb interfaceC5790tb, y51 y51Var, zd0 zd0Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new eb0(this.f49327a, this.f49328b, this.f49329c, handler, hf1Var));
        C5085fn m24684a = new C5085fn.e().m24683a(C5574pb.m27205a(this.f49327a)).m24686c().m24685b().m24687d().m24684a();
        arrayList.add(new ta0(this.f49327a, this.f49328b, this.f49329c, handler, interfaceC5790tb, m24684a));
        arrayList.add(new z51(y51Var, handler.getLooper()));
        arrayList.add(new C4739a(zd0Var, handler.getLooper()));
        arrayList.add(new C6076yg());
        return (cv0[]) arrayList.toArray(new cv0[0]);
    }
}
