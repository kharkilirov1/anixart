package com.yandex.metrica.impl.p023ob;

import android.annotation.TargetApi;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoWcdma;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.DoNotInline;
import com.yandex.metrica.impl.p023ob.C3700Vj;

@TargetApi
@DoNotInline
/* renamed from: com.yandex.metrica.impl.ob.ik */
/* loaded from: classes2.dex */
public class C4034ik extends AbstractC3576Qj {

    /* renamed from: c */
    @NonNull
    private final InterfaceC4164nk<CellIdentityWcdma> f45353c;

    public C4034ik() {
        this(C3658U2.m19211a(28) ? new C4320tk() : new C4294sk());
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3576Qj
    /* renamed from: b */
    public void mo18923b(@NonNull CellInfo cellInfo, @NonNull C3700Vj.a aVar) {
        CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        aVar.m19330a(3).m19335b(Integer.valueOf(cellIdentity.getCid())).m19337c(Integer.valueOf(cellIdentity.getLac())).m19345k(Integer.valueOf(cellIdentity.getPsc())).m19346l(Integer.valueOf(cellInfoWcdma.getCellSignalStrength().getDbm())).m19343i(this.f45353c.mo20466b(cellIdentity)).m19344j(this.f45353c.mo20465a(cellIdentity));
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3576Qj
    /* renamed from: c */
    public void mo18924c(@NonNull CellInfo cellInfo, @NonNull C3700Vj.a aVar) {
        if (C3658U2.m19211a(24)) {
            aVar.m19331a(Integer.valueOf(C3904dk.m19772a(((CellInfoWcdma) cellInfo).getCellIdentity())));
        }
    }

    @VisibleForTesting
    public C4034ik(@NonNull InterfaceC4164nk<CellIdentityWcdma> interfaceC4164nk) {
        this.f45353c = interfaceC4164nk;
    }
}
