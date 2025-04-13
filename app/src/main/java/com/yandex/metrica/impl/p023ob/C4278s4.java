package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.InterfaceC4044j4;
import com.yandex.metrica.impl.p023ob.InterfaceC4122m4;

/* renamed from: com.yandex.metrica.impl.ob.s4 */
/* loaded from: classes2.dex */
public class C4278s4<COMPONENT extends InterfaceC4122m4 & InterfaceC4044j4> implements InterfaceC3992h4<C4252r4> {

    /* renamed from: a */
    @NonNull
    private final InterfaceC3361I4<COMPONENT> f46342a;

    public C4278s4(@NonNull InterfaceC3361I4<COMPONENT> interfaceC3361I4) {
        this.f46342a = interfaceC3361I4;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3992h4
    /* renamed from: a */
    public C4252r4 mo19568a(@NonNull Context context, @NonNull C3862c4 c3862c4, @NonNull C3734X3 c3734x3) {
        return new C4252r4(context, c3862c4, c3734x3, new C4382w4(c3734x3.f44442b), this.f46342a, new C3888d4(), C3300Fi.m18104a());
    }
}
