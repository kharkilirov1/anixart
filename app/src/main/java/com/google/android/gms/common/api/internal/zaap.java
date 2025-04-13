package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zaap extends zaav {

    /* renamed from: c */
    public final ArrayList<Api.Client> f15471c;

    /* renamed from: d */
    public final /* synthetic */ zaaw f15472d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaap(zaaw zaawVar, ArrayList<Api.Client> arrayList) {
        super(zaawVar);
        this.f15472d = zaawVar;
        this.f15471c = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.zaav
    @WorkerThread
    /* renamed from: a */
    public final void mo8026a() {
        Set<Scope> set;
        zaaw zaawVar = this.f15472d;
        zabe zabeVar = zaawVar.f15478a.f15514h;
        ClientSettings clientSettings = zaawVar.f15495r;
        if (clientSettings == null) {
            set = Collections.emptySet();
        } else {
            HashSet hashSet = new HashSet(clientSettings.f15682b);
            Map<Api<?>, com.google.android.gms.common.internal.zab> map = zaawVar.f15495r.f15684d;
            for (Api<?> api : map.keySet()) {
                if (!zaawVar.f15478a.f15511e.containsKey(api.f15346b)) {
                    Objects.requireNonNull(map.get(api));
                    hashSet.addAll(null);
                }
            }
            set = hashSet;
        }
        zabeVar.f15504c = set;
        ArrayList<Api.Client> arrayList = this.f15471c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Api.Client client = arrayList.get(i2);
            zaaw zaawVar2 = this.f15472d;
            client.mo7936c(zaawVar2.f15492o, zaawVar2.f15478a.f15514h.f15504c);
        }
    }
}
