package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.s7 */
/* loaded from: classes2.dex */
public class C4281s7 implements InterfaceC3920ea<C3943f7, C3397Jf> {

    /* renamed from: a */
    @NonNull
    private final C4255r7 f46346a;

    /* renamed from: b */
    @NonNull
    private final C4307t7 f46347b;

    public C4281s7() {
        this(new C4255r7(new C3239D7()), new C4307t7());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public C3943f7 mo17817a(@NonNull C3397Jf c3397Jf) {
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public C4281s7(@NonNull C4255r7 c4255r7, @NonNull C4307t7 c4307t7) {
        this.f46346a = c4255r7;
        this.f46347b = c4307t7;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3397Jf mo17818b(@NonNull C3943f7 c3943f7) {
        C3397Jf c3397Jf = new C3397Jf();
        c3397Jf.f43245b = this.f46346a.mo17818b(c3943f7.f45116a);
        String str = c3943f7.f45117b;
        if (str != null) {
            c3397Jf.f43246c = str;
        }
        c3397Jf.f43247d = this.f46347b.m19491a(c3943f7.f45118c);
        return c3397Jf;
    }
}
