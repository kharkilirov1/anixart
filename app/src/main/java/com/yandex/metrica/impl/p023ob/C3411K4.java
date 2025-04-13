package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p023ob.C3734X3;

/* renamed from: com.yandex.metrica.impl.ob.K4 */
/* loaded from: classes2.dex */
class C3411K4 implements InterfaceC3286F4, InterfaceC3361I4<C4174o4> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3286F4
    @NonNull
    /* renamed from: a */
    public InterfaceC3261E4 mo18031a(@NonNull Context context, @NonNull C3386J4 c3386j4, @NonNull C3211C4 c3211c4, @NonNull C3734X3 c3734x3) {
        return new C3436L4(context, c3386j4.m18386b(new C4226q4(c3211c4.m17920b(), c3211c4.m17919a()), c3734x3, new C4278s4(this)));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3361I4
    @NonNull
    /* renamed from: b */
    public InterfaceC4070k4 mo17889b(@NonNull Context context, @NonNull C3862c4 c3862c4, @NonNull C3734X3.a aVar, @NonNull C3624Si c3624Si) {
        return new C3635T4(context, c3862c4, aVar, c3624Si.m19103c(), new C3749Xi(c3624Si), CounterConfiguration.EnumC3079b.MAIN);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3361I4
    @NonNull
    /* renamed from: a */
    public InterfaceC4122m4 mo17888a(@NonNull Context context, @NonNull C3862c4 c3862c4, @NonNull C3734X3.a aVar, @NonNull C3624Si c3624Si) {
        return new C4174o4(context, c3624Si.m19103c(), c3862c4, aVar, C3532P0.m18696i().m18712o(), C3532P0.m18696i().m18719v(), new C3749Xi(c3624Si));
    }
}
