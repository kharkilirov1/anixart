package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.internal.zzai;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzru implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ String f16793a;

    /* renamed from: b */
    public final /* synthetic */ zzts f16794b;

    /* renamed from: c */
    public final /* synthetic */ zzrx f16795c;

    public zzru(zzrx zzrxVar, String str, zzts zztsVar) {
        this.f16795c = zzrxVar;
        this.f16793a = str;
        this.f16794b = zztsVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(@Nullable String str) {
        this.f16794b.mo9385d(zzai.m12298a(str));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        zzwq zzwqVar = (zzwq) obj;
        String str = zzwqVar.f16970c;
        zzxg zzxgVar = new zzxg();
        Preconditions.m8129d(str);
        zzxgVar.f17006b = str;
        zzxgVar.m9476b(this.f16793a);
        zzrx.m9349e(this.f16795c, this.f16794b, zzwqVar, zzxgVar, this);
    }
}
