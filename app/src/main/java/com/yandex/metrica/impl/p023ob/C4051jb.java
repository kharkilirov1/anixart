package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3596Rf;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.jb */
/* loaded from: classes2.dex */
public class C4051jb implements InterfaceC3920ea<List<String>, C4311tb<C3596Rf.d, InterfaceC3305Fn>> {

    /* renamed from: a */
    @NonNull
    private final C3654Tn f45407a;

    public C4051jb() {
        this(new C3654Tn(20, 100));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public List<String> mo17817a(@NonNull C4311tb<C3596Rf.d, InterfaceC3305Fn> c4311tb) {
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public C4051jb(@NonNull C3654Tn c3654Tn) {
        this.f45407a = c3654Tn;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4311tb<C3596Rf.d, InterfaceC3305Fn> mo17818b(@NonNull List<String> list) {
        C3580Qn<List<Object>, C3355Hn> mo19058a = this.f45407a.mo19058a((List<Object>) list);
        C3596Rf.d dVar = new C3596Rf.d();
        List<Object> list2 = mo19058a.f43777a;
        int i2 = C3509O2.f43529a;
        byte[][] bArr = new byte[0][];
        if (list2 != null) {
            bArr = new byte[list2.size()][];
            for (int i3 = 0; i3 < list2.size(); i3++) {
                bArr[i3] = C3509O2.m18658c((String) list2.get(i3));
            }
        }
        dVar.f43836b = bArr;
        return new C4311tb<>(dVar, mo19058a.f43778b);
    }
}
