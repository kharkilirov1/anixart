package com.yandex.metrica.impl.p023ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3700Vj;
import p000a.C0000a;

@TargetApi
/* renamed from: com.yandex.metrica.impl.ob.Qj */
/* loaded from: classes2.dex */
public abstract class AbstractC3576Qj implements InterfaceC3806a0 {

    /* renamed from: a */
    private final String f43769a;

    /* renamed from: b */
    @Nullable
    private volatile C4292si f43770b;

    public AbstractC3576Qj() {
        StringBuilder m24u = C0000a.m24u("[");
        m24u.append(getClass().getName());
        m24u.append("]");
        this.f43769a = m24u.toString();
    }

    /* renamed from: b */
    private boolean m18920b(@NonNull CellInfo cellInfo) {
        C4292si c4292si = this.f43770b;
        if (c4292si == null || !c4292si.f46421u) {
            return false;
        }
        return !c4292si.f46422v || cellInfo.isRegistered();
    }

    /* renamed from: a */
    public void mo18921a(@NonNull CellInfo cellInfo, @NonNull C3700Vj.a aVar) {
        mo18923b(cellInfo, aVar);
        if (m18920b(cellInfo)) {
            mo18924c(cellInfo, aVar);
        }
    }

    /* renamed from: b */
    public abstract void mo18923b(@NonNull CellInfo cellInfo, @NonNull C3700Vj.a aVar);

    /* renamed from: c */
    public abstract void mo18924c(@NonNull CellInfo cellInfo, @NonNull C3700Vj.a aVar);

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3806a0
    /* renamed from: a */
    public void mo18922a(@NonNull C4292si c4292si) {
        this.f43770b = c4292si;
    }
}
