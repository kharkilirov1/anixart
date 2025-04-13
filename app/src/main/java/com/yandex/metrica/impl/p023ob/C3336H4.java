package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.H4 */
/* loaded from: classes2.dex */
public class C3336H4 implements InterfaceC3630T, InterfaceC3261E4 {

    /* renamed from: a */
    @NonNull
    private C3784Z3 f43031a;

    /* renamed from: b */
    @Nullable
    private final ResultReceiver f43032b;

    public C3336H4(@NonNull Context context, @NonNull C3784Z3 c3784z3, @NonNull C3734X3 c3734x3) {
        this.f43031a = c3784z3;
        this.f43032b = c3734x3.f44443c;
        c3784z3.m19497a(this);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3261E4
    /* renamed from: a */
    public void mo17811a(@NonNull C4066k0 c4066k0, @NonNull C3734X3 c3734x3) {
        this.f43031a.m19498a(c3734x3.f44442b);
        this.f43031a.m19501a(c4066k0, this);
    }

    @NonNull
    /* renamed from: b */
    public C3784Z3 m18188b() {
        return this.f43031a;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3630T
    /* renamed from: a */
    public void mo18187a(@NonNull C3655U c3655u) {
        ResultReceiver resultReceiver = this.f43032b;
        int i2 = ResultReceiverC4144n0.f45965b;
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            c3655u.m19180c(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3261E4
    /* renamed from: a */
    public void mo17810a() {
        this.f43031a.m19503b(this);
    }
}
