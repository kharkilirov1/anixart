package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import com.yandex.metrica.billing.p020v3.library.C3103c;
import com.yandex.metrica.billing.p021v4.library.C3114c;
import com.yandex.metrica.billing_interface.EnumC3116b;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.x3 */
/* loaded from: classes2.dex */
public final class C4407x3 {
    @NotNull
    /* renamed from: a */
    public final InterfaceC4247r m21139a(@NotNull Context context, @NotNull Executor executor, @NotNull Executor executor2, @NotNull EnumC3116b enumC3116b, @NotNull InterfaceC4325u interfaceC4325u, @NotNull InterfaceC4299t interfaceC4299t) {
        int ordinal = enumC3116b.ordinal();
        return ordinal != 0 ? ordinal != 1 ? new C3160A3() : new C3114c(context, executor, executor2, interfaceC4325u, interfaceC4299t, new C4117m(interfaceC4325u), new C4169o(null, 1)) : new C3103c(context, executor, executor2, new C4039j(interfaceC4325u), new C4065k(), interfaceC4299t);
    }
}
