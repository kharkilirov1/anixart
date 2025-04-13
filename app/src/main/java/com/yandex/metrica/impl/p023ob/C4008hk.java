package com.yandex.metrica.impl.p023ob;

import android.annotation.TargetApi;
import android.telephony.CellIdentityLte;
import android.telephony.CellInfo;
import android.telephony.CellInfoLte;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3700Vj;

@TargetApi
/* renamed from: com.yandex.metrica.impl.ob.hk */
/* loaded from: classes2.dex */
public class C4008hk extends AbstractC3576Qj {

    /* renamed from: c */
    private final InterfaceC4164nk<CellIdentityLte> f45303c;

    public C4008hk() {
        this(C3658U2.m19211a(28) ? new C4268rk() : new C4242qk());
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3576Qj
    /* renamed from: b */
    public void mo18923b(@NonNull CellInfo cellInfo, @NonNull C3700Vj.a aVar) {
        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        aVar.m19330a(4).m19335b(Integer.valueOf(cellIdentity.getCi())).m19337c(Integer.valueOf(cellIdentity.getTac())).m19345k(Integer.valueOf(cellIdentity.getPci())).m19346l(Integer.valueOf(cellInfoLte.getCellSignalStrength().getDbm())).m19343i(this.f45303c.mo20466b(cellIdentity)).m19344j(this.f45303c.mo20465a(cellIdentity));
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3576Qj
    /* renamed from: c */
    public void mo18924c(@NonNull CellInfo cellInfo, @NonNull C3700Vj.a aVar) {
        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
        if (C3658U2.m19211a(24)) {
            aVar.m19331a(Integer.valueOf(C3904dk.m19771a(cellInfoLte.getCellIdentity())));
        }
        if (C3658U2.m19211a(26)) {
            aVar.m19340f(Integer.valueOf(C3930ek.m19827b(cellInfoLte.getCellSignalStrength())));
            aVar.m19342h(Integer.valueOf(C3930ek.m19828c(cellInfoLte.getCellSignalStrength())));
            aVar.m19339e(Integer.valueOf(C3930ek.m19826a(cellInfoLte.getCellSignalStrength())));
        }
        if (C3658U2.m19211a(28)) {
            aVar.m19338d(Integer.valueOf(C3956fk.m19915a(cellInfoLte.getCellIdentity())));
        }
        if (C3658U2.m19211a(29)) {
            aVar.m19341g(Integer.valueOf(C3982gk.m19974a(cellInfoLte.getCellSignalStrength())));
        }
    }

    @VisibleForTesting
    public C4008hk(@NonNull InterfaceC4164nk<CellIdentityLte> interfaceC4164nk) {
        this.f45303c = interfaceC4164nk;
    }
}
