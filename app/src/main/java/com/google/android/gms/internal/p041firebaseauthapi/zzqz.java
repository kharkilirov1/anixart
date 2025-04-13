package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.internal.zzai;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzqz implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ zzts f16750a;

    /* renamed from: b */
    public final /* synthetic */ zzrx f16751b;

    public zzqz(zzrx zzrxVar, zzts zztsVar) {
        this.f16751b = zzrxVar;
        this.f16750a = zztsVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(@Nullable String str) {
        this.f16750a.mo9385d(zzai.m12298a(str));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        zzwq zzwqVar = (zzwq) obj;
        zzxg zzxgVar = new zzxg();
        String str = zzwqVar.f16970c;
        Preconditions.m8129d(str);
        zzxgVar.f17006b = str;
        zzxgVar.m9475a(null);
        zzxgVar.m9476b(null);
        zzrx.m9349e(this.f16751b, this.f16750a, zzwqVar, zzxgVar, this);
    }
}
