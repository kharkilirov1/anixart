package com.google.android.gms.internal.p041firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzai;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzrq implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ zzts f16783a;

    /* renamed from: b */
    public final /* synthetic */ zzrx f16784b;

    public zzrq(zzrx zzrxVar, zzts zztsVar) {
        this.f16784b = zzrxVar;
        this.f16783a = zztsVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(@Nullable String str) {
        this.f16783a.mo9385d(zzai.m12298a(str));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        zzxs zzxsVar = (zzxs) obj;
        if (!TextUtils.isEmpty(zzxsVar.f17076q)) {
            this.f16783a.m9384c(new zzqe(zzxsVar.f17076q, zzxsVar.f17075p, zzxsVar.m9478b()));
        } else {
            zzrx.m9348d(this.f16784b, zzxsVar, this.f16783a, this);
        }
    }
}
