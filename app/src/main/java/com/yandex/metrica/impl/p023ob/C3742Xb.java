package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.yandex.metrica.impl.ob.Xb */
/* loaded from: classes2.dex */
public class C3742Xb implements InterfaceC3642Tb, InterfaceC3667Ub {

    /* renamed from: a */
    @NonNull
    private final C4304t4 f44477a;

    /* renamed from: b */
    private AtomicLong f44478b;

    public C3742Xb(@NonNull C4308t8 c4308t8, @NonNull C4304t4 c4304t4) {
        this.f44477a = c4304t4;
        this.f44478b = new AtomicLong(c4308t8.m20808c());
        c4308t8.m20802a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3642Tb
    /* renamed from: a */
    public boolean mo19082a() {
        return this.f44478b.get() >= ((long) ((C4057jh) this.f44477a.m19910b()).m20104J());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3667Ub
    /* renamed from: b */
    public void mo19083b(@NonNull List<Integer> list) {
        this.f44478b.addAndGet(-list.size());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3667Ub
    /* renamed from: a */
    public void mo19081a(@NonNull List<Integer> list) {
        this.f44478b.addAndGet(list.size());
    }
}
