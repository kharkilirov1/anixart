package com.google.android.gms.internal.p040authapiphone;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzl implements RemoteCall {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    /* renamed from: a */
    public final void mo8007a(Object obj, Object obj2) {
        zzo zzoVar = new zzo((TaskCompletionSource) obj2);
        zzh zzhVar = (zzh) ((zzw) obj).m8111y();
        Parcel m8314i = zzhVar.m8314i();
        zzc.m8319b(m8314i, zzoVar);
        zzhVar.m8315q(3, m8314i);
    }
}
