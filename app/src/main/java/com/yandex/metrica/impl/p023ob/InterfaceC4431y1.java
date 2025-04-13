package com.yandex.metrica.impl.p023ob;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.yandex.metrica.MetricaService;

/* renamed from: com.yandex.metrica.impl.ob.y1 */
/* loaded from: classes2.dex */
public interface InterfaceC4431y1 extends InterfaceC3508O1 {
    /* renamed from: a */
    void mo17863a(int i2, Bundle bundle);

    /* renamed from: a */
    void mo17867a(@NonNull Bundle bundle);

    /* renamed from: a */
    void mo17868a(@NonNull MetricaService.InterfaceC3085e interfaceC3085e);

    @Deprecated
    /* renamed from: a */
    void mo17870a(String str, int i2, String str2, Bundle bundle) throws RemoteException;

    /* renamed from: b */
    void mo17873b(@NonNull Bundle bundle);

    void reportData(Bundle bundle);
}
