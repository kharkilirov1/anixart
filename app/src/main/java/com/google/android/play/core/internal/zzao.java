package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzao extends zzah {

    /* renamed from: c */
    public final /* synthetic */ IBinder f20102c;

    /* renamed from: d */
    public final /* synthetic */ zzar f20103d;

    public zzao(zzar zzarVar, IBinder iBinder) {
        this.f20103d = zzarVar;
        this.f20102c = iBinder;
    }

    @Override // com.google.android.play.core.internal.zzah
    /* renamed from: a */
    public final void mo10662a() {
        zzas zzasVar = this.f20103d.f20105b;
        zzasVar.f20120n = (T) zzasVar.f20115i.mo10661a(this.f20102c);
        zzas zzasVar2 = this.f20103d.f20105b;
        zzasVar2.f20108b.m10837d("linkToDeath", new Object[0]);
        try {
            zzasVar2.f20120n.asBinder().linkToDeath(zzasVar2.f20117k, 0);
        } catch (RemoteException e2) {
            zzasVar2.f20108b.m10836c(e2, "linkToDeath failed", new Object[0]);
        }
        zzas zzasVar3 = this.f20103d.f20105b;
        zzasVar3.f20113g = false;
        Iterator<zzah> it = zzasVar3.f20110d.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.f20103d.f20105b.f20110d.clear();
    }
}
