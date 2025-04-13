package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.AbstractC4967de;
import com.yandex.mobile.ads.impl.gz0;

/* loaded from: classes3.dex */
public final class mz0 implements AbstractC4967de.a<cz0> {

    /* renamed from: a */
    @NonNull
    private final Context f52827a;

    /* renamed from: b */
    @NonNull
    private final hz0 f52828b;

    /* renamed from: c */
    @NonNull
    private final gz0.InterfaceC5154a f52829c;

    public mz0(@NonNull Context context, @NonNull hz0 hz0Var, @NonNull gz0.InterfaceC5154a interfaceC5154a) {
        this.f52827a = context.getApplicationContext();
        this.f52828b = hz0Var;
        this.f52829c = interfaceC5154a;
    }

    @Override // com.yandex.mobile.ads.impl.tw0.InterfaceC5822b
    /* renamed from: a */
    public final void mo22924a(@NonNull Object obj) {
        this.f52828b.m25402a(this.f52827a, (cz0) obj);
        this.f52829c.mo25013a();
    }

    @Override // com.yandex.mobile.ads.impl.tw0.InterfaceC5821a
    /* renamed from: a */
    public final void mo22923a(qh1 qh1Var) {
        this.f52829c.mo25014a(qh1Var);
    }
}
