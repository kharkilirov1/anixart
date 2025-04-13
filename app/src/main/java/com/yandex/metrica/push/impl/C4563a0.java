package com.yandex.metrica.push.impl;

import androidx.annotation.NonNull;
import com.yandex.metrica.push.InterfaceC4508d;
import com.yandex.metrica.push.InterfaceC4509e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yandex.metrica.push.impl.a0 */
/* loaded from: classes2.dex */
public class C4563a0 implements InterfaceC4508d {

    /* renamed from: a */
    @NonNull
    private final List<InterfaceC4508d> f47342a = new CopyOnWriteArrayList();

    /* renamed from: b */
    @NonNull
    private final List<InterfaceC4509e> f47343b = new ArrayList();

    @Override // com.yandex.metrica.push.InterfaceC4508d
    @NonNull
    /* renamed from: a */
    public InterfaceC4508d.a mo21412a(@NonNull C4596r c4596r) {
        Iterator<InterfaceC4508d> it = this.f47342a.iterator();
        while (it.hasNext()) {
            InterfaceC4508d.a mo21412a = it.next().mo21412a(c4596r);
            if (mo21412a.f47282a == InterfaceC4508d.b.f47286b) {
                Iterator<InterfaceC4509e> it2 = this.f47343b.iterator();
                while (it2.hasNext()) {
                    it2.next().m21415a(c4596r, mo21412a);
                }
                return mo21412a;
            }
        }
        InterfaceC4508d.a m21413a = InterfaceC4508d.a.m21413a();
        Iterator<InterfaceC4509e> it3 = this.f47343b.iterator();
        while (it3.hasNext()) {
            it3.next().m21415a(c4596r, m21413a);
        }
        return m21413a;
    }

    /* renamed from: a */
    public void m21508a(@NonNull InterfaceC4508d interfaceC4508d) {
        this.f47342a.add(interfaceC4508d);
    }
}
