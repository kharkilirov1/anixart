package com.yandex.metrica.impl.p023ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3700Vj;

@TargetApi
/* renamed from: com.yandex.metrica.impl.ob.ak */
/* loaded from: classes2.dex */
public class C3826ak extends AbstractC3576Qj {
    @Override // com.yandex.metrica.impl.p023ob.AbstractC3576Qj
    /* renamed from: b */
    public void mo18923b(@NonNull CellInfo cellInfo, @NonNull C3700Vj.a aVar) {
        aVar.m19346l(Integer.valueOf(((CellInfoCdma) cellInfo).getCellSignalStrength().getDbm()));
        aVar.m19330a(2);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3576Qj
    /* renamed from: c */
    public void mo18924c(@NonNull CellInfo cellInfo, @NonNull C3700Vj.a aVar) {
    }
}
