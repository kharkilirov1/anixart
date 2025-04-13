package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.r7 */
/* loaded from: classes2.dex */
public class C4255r7 implements InterfaceC3920ea<C3917e7, C3372If> {

    /* renamed from: a */
    @NonNull
    private C3239D7 f46294a;

    public C4255r7(@NonNull C3239D7 c3239d7) {
        this.f46294a = c3239d7;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public C3917e7 mo17817a(@NonNull C3372If c3372If) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3372If mo17818b(@NonNull C3917e7 c3917e7) {
        C3372If c3372If = new C3372If();
        C4125m7 c4125m7 = c3917e7.f45020a;
        if (c4125m7 != null) {
            c3372If.f43123b = this.f46294a.mo17818b(c4125m7);
        }
        c3372If.f43124c = new C3547Pf[c3917e7.f45021b.size()];
        int i2 = 0;
        Iterator<C4125m7> it = c3917e7.f45021b.iterator();
        while (it.hasNext()) {
            c3372If.f43124c[i2] = this.f46294a.mo17818b(it.next());
            i2++;
        }
        String str = c3917e7.f45022c;
        if (str != null) {
            c3372If.f43125d = str;
        }
        return c3372If;
    }
}
