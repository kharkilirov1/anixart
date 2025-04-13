package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tw0;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.mobile.ads.impl.de */
/* loaded from: classes3.dex */
public abstract class AbstractC4967de<T> extends zv0<T> {

    /* renamed from: q */
    private static final int f49636q = (int) TimeUnit.SECONDS.toMillis(10);

    /* renamed from: p */
    private final a<T> f49637p;

    /* renamed from: com.yandex.mobile.ads.impl.de$a */
    public interface a<T> extends tw0.InterfaceC5822b<T>, tw0.InterfaceC5821a {
    }

    public AbstractC4967de(int i2, String str, a<T> aVar) {
        super(i2, str, aVar);
        m30331r();
        m30310a(new C4982do(1.0f, f49636q, 0));
        this.f49637p = aVar;
    }

    @Override // com.yandex.mobile.ads.impl.zv0
    /* renamed from: a */
    public final void mo23873a(T t) {
        a<T> aVar = this.f49637p;
        if (aVar != null) {
            aVar.mo22924a((a<T>) t);
        }
    }
}
