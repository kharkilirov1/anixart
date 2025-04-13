package com.google.android.gms.internal.p040authapiphone;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzk implements RemoteCall {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    /* renamed from: a */
    public final void mo8007a(Object obj, Object obj2) {
        zzp zzpVar = new zzp((TaskCompletionSource) obj2);
        zzh zzhVar = (zzh) ((zzw) obj).m8111y();
        Parcel m8314i = zzhVar.m8314i();
        zzc.m8319b(m8314i, zzpVar);
        zzhVar.m8315q(4, m8314i);
    }
}
