package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3734X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.r4 */
/* loaded from: classes2.dex */
public class C4252r4 implements InterfaceC3450Li, InterfaceC4096l4 {

    /* renamed from: a */
    @NonNull
    private final Context f46269a;

    /* renamed from: b */
    @NonNull
    private final C3862c4 f46270b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC3361I4<InterfaceC4122m4> f46271c;

    /* renamed from: d */
    @NonNull
    private final C3624Si f46272d;

    /* renamed from: e */
    @NonNull
    private final C4382w4 f46273e;

    /* renamed from: f */
    @Nullable
    private InterfaceC4122m4 f46274f;

    /* renamed from: g */
    @Nullable
    private InterfaceC4070k4 f46275g;

    /* renamed from: h */
    private List<InterfaceC3450Li> f46276h = new ArrayList();

    /* renamed from: i */
    @NonNull
    private final C3888d4 f46277i;

    public C4252r4(@NonNull Context context, @NonNull C3862c4 c3862c4, @NonNull C3734X3 c3734x3, @NonNull C4382w4 c4382w4, @NonNull InterfaceC3361I4<InterfaceC4122m4> interfaceC3361I4, @NonNull C3888d4 c3888d4, @NonNull C3300Fi c3300Fi) {
        this.f46269a = context;
        this.f46270b = c3862c4;
        this.f46273e = c4382w4;
        this.f46271c = interfaceC3361I4;
        this.f46277i = c3888d4;
        this.f46272d = c3300Fi.m18108a(context, c3862c4, c3734x3.f44441a);
        c3300Fi.m18109a(c3862c4, this);
    }

    /* renamed from: a */
    public void m20619a(@NonNull C4066k0 c4066k0, @NonNull C3734X3 c3734x3) {
        InterfaceC4122m4 interfaceC4122m4;
        ((C3635T4) m20617a()).m19140b();
        if (C3382J0.m18367a(c4066k0.m20212n())) {
            interfaceC4122m4 = m20617a();
        } else {
            if (this.f46274f == null) {
                synchronized (this) {
                    InterfaceC4122m4 mo17888a = this.f46271c.mo17888a(this.f46269a, this.f46270b, this.f46273e.m21083a(), this.f46272d);
                    this.f46274f = mo17888a;
                    this.f46276h.add(mo17888a);
                }
            }
            interfaceC4122m4 = this.f46274f;
        }
        if (!C3382J0.m18370b(c4066k0.m20212n())) {
            C3734X3.a aVar = c3734x3.f44442b;
            synchronized (this) {
                this.f46273e.m21084a(aVar);
                InterfaceC4070k4 interfaceC4070k4 = this.f46275g;
                if (interfaceC4070k4 != null) {
                    ((C3635T4) interfaceC4070k4).mo19138a(aVar);
                }
                InterfaceC4122m4 interfaceC4122m42 = this.f46274f;
                if (interfaceC4122m42 != null) {
                    interfaceC4122m42.mo19138a(aVar);
                }
            }
        }
        interfaceC4122m4.mo19139a(c4066k0);
    }

    /* renamed from: b */
    public synchronized void m20620b(@NonNull InterfaceC3261E4 interfaceC3261E4) {
        this.f46277i.m19707b(interfaceC3261E4);
    }

    /* renamed from: a */
    public synchronized void m20618a(@NonNull InterfaceC3261E4 interfaceC3261E4) {
        this.f46277i.m19706a(interfaceC3261E4);
    }

    /* renamed from: a */
    private InterfaceC4070k4 m20617a() {
        if (this.f46275g == null) {
            synchronized (this) {
                InterfaceC4070k4 mo17889b = this.f46271c.mo17889b(this.f46269a, this.f46270b, this.f46273e.m21083a(), this.f46272d);
                this.f46275g = mo17889b;
                this.f46276h.add(mo17889b);
            }
        }
        return this.f46275g;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3450Li
    /* renamed from: a */
    public synchronized void mo18513a(@NonNull C3575Qi c3575Qi) {
        Iterator<InterfaceC3450Li> it = this.f46276h.iterator();
        while (it.hasNext()) {
            it.next().mo18513a(c3575Qi);
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3450Li
    /* renamed from: a */
    public synchronized void mo18512a(@NonNull EnumC3350Hi enumC3350Hi, @Nullable C3575Qi c3575Qi) {
        Iterator<InterfaceC3450Li> it = this.f46276h.iterator();
        while (it.hasNext()) {
            it.next().mo18512a(enumC3350Hi, c3575Qi);
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4096l4
    /* renamed from: a */
    public void mo19499a(@NonNull C3734X3 c3734x3) {
        this.f46272d.m19099a(c3734x3.f44441a);
        C3734X3.a aVar = c3734x3.f44442b;
        synchronized (this) {
            this.f46273e.m21084a(aVar);
            InterfaceC4070k4 interfaceC4070k4 = this.f46275g;
            if (interfaceC4070k4 != null) {
                ((C3635T4) interfaceC4070k4).mo19138a(aVar);
            }
            InterfaceC4122m4 interfaceC4122m4 = this.f46274f;
            if (interfaceC4122m4 != null) {
                interfaceC4122m4.mo19138a(aVar);
            }
        }
    }
}
