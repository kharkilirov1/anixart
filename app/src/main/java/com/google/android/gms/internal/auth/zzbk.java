package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzbk implements RemoteCall {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    /* renamed from: a */
    public final void mo8007a(Object obj, Object obj2) {
        zzbn zzbnVar = new zzbn((TaskCompletionSource) obj2);
        zzbh zzbhVar = (zzbh) ((zzbe) obj).m8111y();
        Parcel m8329i = zzbhVar.m8329i();
        zzc.m8339c(m8329i, zzbnVar);
        zzbhVar.m8330q(3, m8329i);
    }
}
