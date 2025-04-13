package com.google.firebase.auth.internal;

import com.google.firebase.auth.MultiFactor;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public final class zzac extends MultiFactor {

    /* renamed from: a */
    public final zzx f22355a;

    public zzac(zzx zzxVar) {
        this.f22355a = zzxVar;
    }

    @Override // com.google.firebase.auth.MultiFactor
    /* renamed from: a */
    public final List<MultiFactorInfo> mo12258a() {
        zzbb zzbbVar = this.f22355a.f22448m;
        if (zzbbVar == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = zzbbVar.f22393b.iterator();
        while (it.hasNext()) {
            arrayList.add((PhoneMultiFactorInfo) it.next());
        }
        return arrayList;
    }
}
