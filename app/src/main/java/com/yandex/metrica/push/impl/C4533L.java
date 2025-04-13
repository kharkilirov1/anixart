package com.yandex.metrica.push.impl;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yandex.metrica.push.impl.L */
/* loaded from: classes2.dex */
public class C4533L extends AbstractC4539O {

    /* renamed from: a */
    @NonNull
    private final List<AbstractC4539O> f47300a = new CopyOnWriteArrayList();

    @Override // com.yandex.metrica.push.impl.AbstractC4539O
    @NonNull
    /* renamed from: a */
    public C4541P mo21440a(@NonNull C4596r c4596r) {
        Iterator<AbstractC4539O> it = this.f47300a.iterator();
        while (it.hasNext()) {
            try {
                C4541P mo21440a = it.next().mo21440a(c4596r);
                if (!mo21440a.m21469a()) {
                    return mo21440a;
                }
                c4596r = mo21440a.f47307b;
            } catch (C4537N e2) {
                return C4541P.m21468a(c4596r, e2.m21460a(), e2.m21461b());
            }
        }
        return C4541P.m21467a(c4596r);
    }

    /* renamed from: a */
    public void m21454a(@NonNull AbstractC4539O abstractC4539O) {
        this.f47300a.add(abstractC4539O);
    }
}
