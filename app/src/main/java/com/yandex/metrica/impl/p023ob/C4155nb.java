package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3596Rf;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.nb */
/* loaded from: classes2.dex */
public class C4155nb implements InterfaceC3920ea<Map<String, String>, C4311tb<C3596Rf.i, InterfaceC3305Fn>> {

    /* renamed from: a */
    @NonNull
    private final C3704Vn f46005a;

    public C4155nb() {
        this(new C3704Vn(20480, 100, 1000));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public Map<String, String> mo17817a(@NonNull C4311tb<C3596Rf.i, InterfaceC3305Fn> c4311tb) {
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public C4155nb(@NonNull C3704Vn c3704Vn) {
        this.f46005a = c3704Vn;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4311tb<C3596Rf.i, InterfaceC3305Fn> mo17818b(@NonNull Map<String, String> map) {
        C3580Qn<Map<String, String>, C3355Hn> mo19058a = this.f46005a.mo19058a(map);
        C3596Rf.i iVar = new C3596Rf.i();
        iVar.f43849c = mo19058a.f43778b.f43074b;
        Map<String, String> map2 = mo19058a.f43777a;
        if (map2 != null) {
            iVar.f43848b = new C3596Rf.i.a[map2.size()];
            int i2 = 0;
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                iVar.f43848b[i2] = new C3596Rf.i.a();
                iVar.f43848b[i2].f43851b = C3509O2.m18658c(entry.getKey());
                iVar.f43848b[i2].f43852c = C3509O2.m18658c(entry.getValue());
                i2++;
            }
        }
        return new C4311tb<>(iVar, mo19058a.f43778b);
    }
}
