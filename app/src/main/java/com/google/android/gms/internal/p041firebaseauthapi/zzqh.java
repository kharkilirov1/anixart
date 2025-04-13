package com.google.android.gms.internal.p041firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzai;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzqh implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ zzts f16704a;

    /* renamed from: b */
    public final /* synthetic */ zzrx f16705b;

    public zzqh(zzrx zzrxVar, zzts zztsVar) {
        this.f16705b = zzrxVar;
        this.f16704a = zztsVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(@Nullable String str) {
        this.f16704a.mo9385d(zzai.m12298a(str));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        zzxx zzxxVar = (zzxx) obj;
        if (!TextUtils.isEmpty(zzxxVar.f17090f)) {
            this.f16704a.m9384c(new zzqe(zzxxVar.f17090f, zzxxVar.f17089e, null));
        } else {
            this.f16705b.m9352b(new zzwq(zzxxVar.f17087c, zzxxVar.f17086b, Long.valueOf(zzxxVar.f17088d), "Bearer"), null, null, Boolean.FALSE, null, this.f16704a, this);
        }
    }
}
