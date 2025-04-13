package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3472Mf;

/* renamed from: com.yandex.metrica.impl.ob.u7 */
/* loaded from: classes2.dex */
public class C4333u7 implements InterfaceC3920ea<C3995h7, C3472Mf> {

    /* renamed from: a */
    @NonNull
    private final C3164A7 f46591a;

    public C4333u7() {
        this(new C3164A7());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public C3995h7 mo17817a(@NonNull C3472Mf c3472Mf) {
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public C4333u7(@NonNull C3164A7 c3164a7) {
        this.f46591a = c3164a7;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3472Mf mo17818b(@NonNull C3995h7 c3995h7) {
        C3472Mf mo17818b = this.f46591a.mo17818b(c3995h7.f45260a);
        mo17818b.f43438h = 1;
        C3472Mf.a aVar = new C3472Mf.a();
        mo17818b.f43439i = aVar;
        aVar.f43443b = c3995h7.f45261b;
        return mo17818b;
    }
}
