package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3596Rf;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.qb */
/* loaded from: classes2.dex */
public class C4233qb implements InterfaceC3920ea<List<String>, C4311tb<C3596Rf.l[], InterfaceC3305Fn>> {

    /* renamed from: a */
    @NonNull
    private final C3654Tn f46232a;

    public C4233qb() {
        this(new C3654Tn(20, 100));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public List<String> mo17817a(@NonNull C4311tb<C3596Rf.l[], InterfaceC3305Fn> c4311tb) {
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public C4233qb(@NonNull C3654Tn c3654Tn) {
        this.f46232a = c3654Tn;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4311tb<C3596Rf.l[], InterfaceC3305Fn> mo17818b(@NonNull List<String> list) {
        C3580Qn<List<Object>, C3355Hn> mo19058a = this.f46232a.mo19058a((List<Object>) list);
        List<Object> list2 = mo19058a.f43777a;
        C3596Rf.l[] lVarArr = new C3596Rf.l[0];
        if (list2 != null) {
            lVarArr = new C3596Rf.l[list2.size()];
            for (int i2 = 0; i2 < list2.size(); i2++) {
                lVarArr[i2] = new C3596Rf.l();
                lVarArr[i2].f43863b = C3509O2.m18658c((String) list2.get(i2));
            }
        }
        return new C4311tb<>(lVarArr, mo19058a.f43778b);
    }
}
