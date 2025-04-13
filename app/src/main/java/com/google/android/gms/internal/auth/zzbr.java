package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzbr extends zzbd {

    /* renamed from: a */
    public final /* synthetic */ zzbs f16054a;

    public zzbr(zzbs zzbsVar) {
        this.f16054a = zzbsVar;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    /* renamed from: g0 */
    public final void mo8333g0(String str) {
        if (str != null) {
            this.f16054a.mo7882a(new zzbv(str));
        } else {
            this.f16054a.mo7882a(new zzbv(new Status(3006, null)));
        }
    }
}
