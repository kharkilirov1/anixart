package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p023ob.C3734X3;

/* renamed from: com.yandex.metrica.impl.ob.B4 */
/* loaded from: classes2.dex */
class C3186B4 extends C3511O4 {
    @Override // com.yandex.metrica.impl.p023ob.C3511O4, com.yandex.metrica.impl.p023ob.InterfaceC3361I4
    @NonNull
    /* renamed from: a */
    public InterfaceC4122m4 mo17888a(@NonNull Context context, @NonNull C3862c4 c3862c4, @NonNull C3734X3.a aVar, @NonNull C3624Si c3624Si) {
        return new C3709W3(context, c3624Si.m19103c(), c3862c4, aVar, new C4434y4(C3532P0.m18696i().m18719v()), new C3825aj());
    }

    @Override // com.yandex.metrica.impl.p023ob.C3511O4, com.yandex.metrica.impl.p023ob.InterfaceC3361I4
    @NonNull
    /* renamed from: b */
    public InterfaceC4070k4 mo17889b(@NonNull Context context, @NonNull C3862c4 c3862c4, @NonNull C3734X3.a aVar, @NonNull C3624Si c3624Si) {
        return new C3635T4(context, c3862c4, aVar, c3624Si.m19103c(), new C3825aj(), CounterConfiguration.EnumC3079b.APPMETRICA);
    }

    @Override // com.yandex.metrica.impl.p023ob.C3511O4
    @NonNull
    /* renamed from: c */
    public C3940f4 mo17888a(@NonNull Context context, @NonNull C3862c4 c3862c4, @NonNull C3734X3.a aVar, @NonNull C3624Si c3624Si) {
        return new C3709W3(context, c3624Si.m19103c(), c3862c4, aVar, new C4434y4(C3532P0.m18696i().m18719v()), new C3825aj());
    }

    @Override // com.yandex.metrica.impl.p023ob.C3511O4
    @NonNull
    /* renamed from: d */
    public C3635T4 mo17889b(@NonNull Context context, @NonNull C3862c4 c3862c4, @NonNull C3734X3.a aVar, @NonNull C3624Si c3624Si) {
        return new C3635T4(context, c3862c4, aVar, c3624Si.m19103c(), new C3825aj(), CounterConfiguration.EnumC3079b.APPMETRICA);
    }
}
