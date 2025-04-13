package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yandex.metrica.impl.ob.d4 */
/* loaded from: classes2.dex */
public class C3888d4 {

    /* renamed from: a */
    private final List<InterfaceC3261E4> f44906a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public void m19706a(@NonNull InterfaceC3261E4 interfaceC3261E4) {
        this.f44906a.add(interfaceC3261E4);
    }

    /* renamed from: b */
    public void m19707b(@NonNull InterfaceC3261E4 interfaceC3261E4) {
        this.f44906a.remove(interfaceC3261E4);
    }

    /* renamed from: a */
    public List<InterfaceC3261E4> m19705a() {
        return this.f44906a;
    }
}
