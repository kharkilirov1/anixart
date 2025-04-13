package com.yandex.metrica.push.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.push.InterfaceC4508d;

/* renamed from: com.yandex.metrica.push.impl.T */
/* loaded from: classes2.dex */
public class C4548T implements InterfaceC4508d {

    /* renamed from: a */
    @NonNull
    private final C4563a0 f47311a;

    @VisibleForTesting
    public C4548T(@NonNull C4563a0 c4563a0) {
        this.f47311a = c4563a0;
    }

    /* renamed from: a */
    public InterfaceC4508d[] m21474a(@NonNull Context context, @NonNull C4562a c4562a) {
        return new InterfaceC4508d[]{new C4573f0(context), new C4543Q(), new C4558Y(c4562a.m21501g()), new C4569d0(c4562a.m21501g()), new C4556X(c4562a), new C4550U(c4562a), new C4567c0(c4562a.m21501g()), new C4546S(c4562a.m21501g()), new C4552V(c4562a), new C4571e0()};
    }

    @Override // com.yandex.metrica.push.InterfaceC4508d
    @NonNull
    /* renamed from: a */
    public InterfaceC4508d.a mo21412a(@NonNull C4596r c4596r) {
        return this.f47311a.mo21412a(c4596r);
    }

    /* renamed from: a */
    public void m21473a(@NonNull InterfaceC4508d... interfaceC4508dArr) {
        for (InterfaceC4508d interfaceC4508d : interfaceC4508dArr) {
            this.f47311a.m21508a(interfaceC4508d);
        }
    }
}
