package com.yandex.metrica.impl.p023ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3700Vj;

@TargetApi
/* renamed from: com.yandex.metrica.impl.ob.Tj */
/* loaded from: classes2.dex */
public class C3650Tj implements InterfaceC4138mk {

    /* renamed from: a */
    @NonNull
    private final C3800Zj f44104a;

    /* renamed from: b */
    @NonNull
    private final C3775Yj f44105b;

    public C3650Tj() {
        this(new C3800Zj(), new C3775Yj());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3806a0
    /* renamed from: a */
    public void mo18922a(@NonNull C4292si c4292si) {
        this.f44104a.mo18922a(c4292si);
    }

    @VisibleForTesting
    public C3650Tj(@NonNull C3800Zj c3800Zj, @NonNull C3775Yj c3775Yj) {
        this.f44104a = c3800Zj;
        this.f44105b = c3775Yj;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4138mk
    @NonNull
    /* renamed from: a */
    public C3700Vj mo19167a(@NonNull CellInfo cellInfo) {
        C3700Vj.a aVar = new C3700Vj.a();
        this.f44104a.m19525a(cellInfo, aVar);
        return this.f44105b.m19485a(new C3700Vj(aVar));
    }
}
