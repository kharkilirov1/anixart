package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.internal.zzai;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzrt implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ String f16790a;

    /* renamed from: b */
    public final /* synthetic */ zzts f16791b;

    /* renamed from: c */
    public final /* synthetic */ zzrx f16792c;

    public zzrt(zzrx zzrxVar, String str, zzts zztsVar) {
        this.f16792c = zzrxVar;
        this.f16790a = str;
        this.f16791b = zztsVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(@Nullable String str) {
        this.f16791b.mo9385d(zzai.m12298a(str));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        zzwq zzwqVar = (zzwq) obj;
        zzxg zzxgVar = new zzxg();
        String str = zzwqVar.f16970c;
        Preconditions.m8129d(str);
        zzxgVar.f17006b = str;
        zzxgVar.m9475a(this.f16790a);
        zzrx.m9349e(this.f16792c, this.f16791b, zzwqVar, zzxgVar, this);
    }
}
