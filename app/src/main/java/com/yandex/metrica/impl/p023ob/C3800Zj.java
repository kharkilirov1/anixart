package com.yandex.metrica.impl.p023ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3700Vj;

@TargetApi
/* renamed from: com.yandex.metrica.impl.ob.Zj */
/* loaded from: classes2.dex */
public class C3800Zj implements InterfaceC3806a0 {

    /* renamed from: a */
    @NonNull
    private final C4086kk f44690a;

    /* renamed from: b */
    @NonNull
    private final AbstractC3576Qj f44691b;

    /* renamed from: c */
    @NonNull
    private final AbstractC3576Qj f44692c;

    /* renamed from: d */
    @NonNull
    private final AbstractC3576Qj f44693d;

    /* renamed from: e */
    @NonNull
    private final AbstractC3576Qj f44694e;

    /* renamed from: f */
    @NonNull
    private final InterfaceC3806a0[] f44695f;

    public C3800Zj() {
        this(new C3852bk());
    }

    /* renamed from: a */
    public void m19525a(CellInfo cellInfo, C3700Vj.a aVar) {
        this.f44690a.m20305a(cellInfo, aVar);
        if (cellInfo instanceof CellInfoGsm) {
            this.f44691b.mo18921a((CellInfoGsm) cellInfo, aVar);
            return;
        }
        if (cellInfo instanceof CellInfoCdma) {
            this.f44692c.mo18921a((CellInfoCdma) cellInfo, aVar);
            return;
        }
        if (cellInfo instanceof CellInfoLte) {
            this.f44693d.mo18921a((CellInfoLte) cellInfo, aVar);
        } else if (C3658U2.m19211a(18) && (cellInfo instanceof CellInfoWcdma)) {
            this.f44694e.mo18921a((CellInfoWcdma) cellInfo, aVar);
        }
    }

    private C3800Zj(@NonNull AbstractC3576Qj abstractC3576Qj) {
        this(new C4086kk(), new C3878ck(), new C3826ak(), new C4008hk(), C3658U2.m19211a(18) ? new C4034ik() : abstractC3576Qj);
    }

    @VisibleForTesting
    public C3800Zj(@NonNull C4086kk c4086kk, @NonNull AbstractC3576Qj abstractC3576Qj, @NonNull AbstractC3576Qj abstractC3576Qj2, @NonNull AbstractC3576Qj abstractC3576Qj3, @NonNull AbstractC3576Qj abstractC3576Qj4) {
        this.f44690a = c4086kk;
        this.f44691b = abstractC3576Qj;
        this.f44692c = abstractC3576Qj2;
        this.f44693d = abstractC3576Qj3;
        this.f44694e = abstractC3576Qj4;
        this.f44695f = new InterfaceC3806a0[]{abstractC3576Qj, abstractC3576Qj2, abstractC3576Qj4, abstractC3576Qj3};
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3806a0
    /* renamed from: a */
    public void mo18922a(@NonNull C4292si c4292si) {
        for (InterfaceC3806a0 interfaceC3806a0 : this.f44695f) {
            interfaceC3806a0.mo18922a(c4292si);
        }
    }
}
