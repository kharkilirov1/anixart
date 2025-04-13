package com.yandex.metrica.impl.p023ob;

import android.annotation.TargetApi;
import android.telephony.CellIdentityGsm;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3700Vj;

@TargetApi
/* renamed from: com.yandex.metrica.impl.ob.ck */
/* loaded from: classes2.dex */
public class C3878ck extends AbstractC3576Qj {

    /* renamed from: c */
    @NonNull
    private final InterfaceC4164nk<CellIdentityGsm> f44886c;

    public C3878ck() {
        this(C3658U2.m19211a(28) ? new C4216pk() : new C4190ok());
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3576Qj
    /* renamed from: b */
    public void mo18923b(@NonNull CellInfo cellInfo, @NonNull C3700Vj.a aVar) {
        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        aVar.m19330a(1).m19335b(Integer.valueOf(cellIdentity.getCid())).m19337c(Integer.valueOf(cellIdentity.getLac())).m19346l(Integer.valueOf(cellInfoGsm.getCellSignalStrength().getDbm())).m19343i(this.f44886c.mo20466b(cellIdentity)).m19344j(this.f44886c.mo20465a(cellIdentity));
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3576Qj
    /* renamed from: c */
    public void mo18924c(@NonNull CellInfo cellInfo, @NonNull C3700Vj.a aVar) {
        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
        if (C3658U2.m19211a(24)) {
            aVar.m19331a(Integer.valueOf(cellInfoGsm.getCellIdentity().getArfcn()));
        }
    }

    @VisibleForTesting
    public C3878ck(@NonNull InterfaceC4164nk<CellIdentityGsm> interfaceC4164nk) {
        this.f44886c = interfaceC4164nk;
    }
}
