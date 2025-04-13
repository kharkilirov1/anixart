package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.internal.zzai;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzqy implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ zzxq f16747a;

    /* renamed from: b */
    public final /* synthetic */ zzts f16748b;

    /* renamed from: c */
    public final /* synthetic */ zzrx f16749c;

    public zzqy(zzrx zzrxVar, zzxq zzxqVar, zzts zztsVar) {
        this.f16749c = zzrxVar;
        this.f16747a = zzxqVar;
        this.f16748b = zztsVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(@Nullable String str) {
        this.f16748b.mo9385d(zzai.m12298a(str));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        zzxq zzxqVar = this.f16747a;
        zzxqVar.f17059p = true;
        String str = ((zzwq) obj).f16970c;
        Preconditions.m8129d(str);
        zzxqVar.f17046c = str;
        this.f16749c.f16798a.mo9425k(this.f16747a, new zzqx(this, this));
    }
}
