package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zaao extends zaav {

    /* renamed from: c */
    public final Map<Api.Client, zaal> f15469c;

    /* renamed from: d */
    public final /* synthetic */ zaaw f15470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaao(zaaw zaawVar, Map<Api.Client, zaal> map) {
        super(zaawVar);
        this.f15470d = zaawVar;
        this.f15469c = map;
    }

    @Override // com.google.android.gms.common.api.internal.zaav
    @GuardedBy
    @WorkerThread
    /* renamed from: a */
    public final void mo8026a() {
        com.google.android.gms.signin.zae zaeVar;
        com.google.android.gms.common.internal.zal zalVar = new com.google.android.gms.common.internal.zal(this.f15470d.f15481d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Api.Client client : this.f15469c.keySet()) {
            if (!client.mo7943j() || this.f15469c.get(client).f15465c) {
                arrayList2.add(client);
            } else {
                arrayList.add(client);
            }
        }
        int i2 = -1;
        int i3 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i3 < size) {
                i2 = zalVar.m8187a(this.f15470d.f15480c, (Api.Client) arrayList.get(i3));
                i3++;
                if (i2 != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i3 < size2) {
                i2 = zalVar.m8187a(this.f15470d.f15480c, (Api.Client) arrayList2.get(i3));
                i3++;
                if (i2 == 0) {
                    break;
                }
            }
        }
        if (i2 != 0) {
            ConnectionResult connectionResult = new ConnectionResult(i2, null);
            zaaw zaawVar = this.f15470d;
            zabi zabiVar = zaawVar.f15478a;
            zabiVar.f15509c.sendMessage(zabiVar.f15509c.obtainMessage(1, new zaam(this, zaawVar, connectionResult)));
            return;
        }
        zaaw zaawVar2 = this.f15470d;
        if (zaawVar2.f15490m && (zaeVar = zaawVar2.f15488k) != null) {
            zaeVar.mo9689r();
        }
        for (Api.Client client2 : this.f15469c.keySet()) {
            zaal zaalVar = this.f15469c.get(client2);
            if (!client2.mo7943j() || zalVar.m8187a(this.f15470d.f15480c, client2) == 0) {
                client2.mo7940g(zaalVar);
            } else {
                zaaw zaawVar3 = this.f15470d;
                zabi zabiVar2 = zaawVar3.f15478a;
                zabiVar2.f15509c.sendMessage(zabiVar2.f15509c.obtainMessage(1, new zaan(zaawVar3, zaalVar)));
            }
        }
    }
}
