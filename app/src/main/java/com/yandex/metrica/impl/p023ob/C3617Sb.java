package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.yandex.metrica.impl.ob.Sb */
/* loaded from: classes2.dex */
public class C3617Sb implements InterfaceC3642Tb, InterfaceC3667Ub {

    /* renamed from: a */
    private final Set<Integer> f43991a;

    /* renamed from: b */
    private AtomicLong f43992b;

    public C3617Sb(@NonNull C4308t8 c4308t8) {
        HashSet hashSet = new HashSet();
        this.f43991a = hashSet;
        hashSet.add(Integer.valueOf(EnumC4067k1.EVENT_TYPE_FIRST_ACTIVATION.m20218b()));
        hashSet.add(Integer.valueOf(EnumC4067k1.EVENT_TYPE_APP_UPDATE.m20218b()));
        hashSet.add(Integer.valueOf(EnumC4067k1.EVENT_TYPE_INIT.m20218b()));
        hashSet.add(Integer.valueOf(EnumC4067k1.EVENT_TYPE_IDENTITY.m20218b()));
        hashSet.add(Integer.valueOf(EnumC4067k1.EVENT_TYPE_SEND_REFERRER.m20218b()));
        c4308t8.m20802a(this);
        this.f43992b = new AtomicLong(c4308t8.m20796a(hashSet));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3642Tb
    /* renamed from: a */
    public boolean mo19082a() {
        return this.f43992b.get() > 0;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3667Ub
    /* renamed from: b */
    public void mo19083b(@NonNull List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (this.f43991a.contains(Integer.valueOf(it.next().intValue()))) {
                i2++;
            }
        }
        this.f43992b.addAndGet(-i2);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3667Ub
    /* renamed from: a */
    public void mo19081a(@NonNull List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (this.f43991a.contains(Integer.valueOf(it.next().intValue()))) {
                i2++;
            }
        }
        this.f43992b.addAndGet(i2);
    }
}
