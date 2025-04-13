package com.google.android.gms.internal.p039authapi;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
final class zbf extends zbd {

    /* renamed from: a */
    public final /* synthetic */ zbg f16018a;

    public zbf(zbg zbgVar) {
        this.f16018a = zbgVar;
    }

    @Override // com.google.android.gms.internal.p039authapi.zbd, com.google.android.gms.internal.p039authapi.zbs
    /* renamed from: b */
    public final void mo8326b(Status status) {
        this.f16018a.mo7882a(new zbe(status, null));
    }

    @Override // com.google.android.gms.internal.p039authapi.zbd, com.google.android.gms.internal.p039authapi.zbs
    /* renamed from: d2 */
    public final void mo8327d2(Status status, Credential credential) {
        this.f16018a.mo7882a(new zbe(status, credential));
    }
}
