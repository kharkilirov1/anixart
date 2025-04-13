package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.rtm.wrapper.InterfaceC4621e;

/* renamed from: com.yandex.metrica.impl.ob.vh */
/* loaded from: classes2.dex */
public class C4369vh implements InterfaceC4021i7 {

    /* renamed from: a */
    @NonNull
    private final InterfaceC4621e f46783a;

    public C4369vh(@NonNull InterfaceC4621e interfaceC4621e) {
        this.f46783a = interfaceC4621e;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4021i7
    /* renamed from: a */
    public void mo19951a(@Nullable Throwable th, @NonNull C3917e7 c3917e7) {
        this.f46783a.reportException(th == null ? "" : th.getClass().getName(), th);
    }
}
