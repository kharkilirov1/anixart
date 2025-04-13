package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.wl */
/* loaded from: classes2.dex */
public class C4399wl implements InterfaceC4035il {

    /* renamed from: a */
    @NonNull
    private final List<C3727Wl> f46901a = new ArrayList();

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4295sl
    /* renamed from: a */
    public void mo18926a(@NonNull C3727Wl c3727Wl) {
        this.f46901a.add(c3727Wl);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4035il
    @NonNull
    /* renamed from: a */
    public List<C3727Wl> mo18925a() {
        return this.f46901a;
    }
}
