package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzr implements RemoteCall {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    /* renamed from: a */
    public final void mo8007a(Object obj, Object obj2) {
        zzp zzpVar = (zzp) ((zzi) obj).m8111y();
        zzw zzwVar = new zzw((TaskCompletionSource) obj2);
        Parcel m8329i = zzpVar.m8329i();
        zzc.m8339c(m8329i, zzwVar);
        zzc.m8338b(m8329i, null);
        m8329i.writeString(null);
        zzc.m8338b(m8329i, null);
        zzpVar.m8330q(1, m8329i);
    }
}
