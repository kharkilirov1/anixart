package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.D7 */
/* loaded from: classes2.dex */
public class C3239D7 implements InterfaceC3920ea<C4125m7, C3547Pf> {

    /* renamed from: a */
    @NonNull
    private final C3189B7 f42701a;

    public C3239D7() {
        this(new C3189B7());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public C4125m7 mo17817a(@NonNull C3547Pf c3547Pf) {
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public C3239D7(@NonNull C3189B7 c3189b7) {
        this.f42701a = c3189b7;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3547Pf mo17818b(@NonNull C4125m7 c4125m7) {
        C3547Pf c3547Pf = new C3547Pf();
        Integer num = c4125m7.f45942e;
        c3547Pf.f43652f = num == null ? -1 : num.intValue();
        c3547Pf.f43651e = c4125m7.f45941d;
        c3547Pf.f43649c = c4125m7.f45939b;
        c3547Pf.f43648b = c4125m7.f45938a;
        c3547Pf.f43650d = c4125m7.f45940c;
        C3189B7 c3189b7 = this.f42701a;
        List<StackTraceElement> list = c4125m7.f45943f;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C4099l7((StackTraceElement) it.next()));
        }
        c3547Pf.f43653g = c3189b7.mo17818b((List<C4099l7>) arrayList);
        return c3547Pf;
    }
}
