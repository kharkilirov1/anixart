package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.internal.zzai;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzqu implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ String f16736a;

    /* renamed from: b */
    public final /* synthetic */ String f16737b;

    /* renamed from: c */
    public final /* synthetic */ zzts f16738c;

    /* renamed from: d */
    public final /* synthetic */ zzrx f16739d;

    public zzqu(zzrx zzrxVar, String str, String str2, zzts zztsVar) {
        this.f16739d = zzrxVar;
        this.f16736a = str;
        this.f16737b = str2;
        this.f16738c = zztsVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(@Nullable String str) {
        this.f16738c.mo9385d(zzai.m12298a(str));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        zzwq zzwqVar = (zzwq) obj;
        zzxg zzxgVar = new zzxg();
        String str = zzwqVar.f16970c;
        Preconditions.m8129d(str);
        zzxgVar.f17006b = str;
        zzxgVar.m9475a(this.f16736a);
        zzxgVar.m9476b(this.f16737b);
        zzrx.m9349e(this.f16739d, this.f16738c, zzwqVar, zzxgVar, this);
    }
}
