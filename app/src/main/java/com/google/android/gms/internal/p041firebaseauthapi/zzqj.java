package com.google.android.gms.internal.p041firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzai;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzqj implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ zzts f16709a;

    /* renamed from: b */
    public final /* synthetic */ zzrx f16710b;

    public zzqj(zzrx zzrxVar, zzts zztsVar) {
        this.f16710b = zzrxVar;
        this.f16709a = zztsVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(@Nullable String str) {
        this.f16709a.mo9385d(zzai.m12298a(str));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        zzvz zzvzVar = (zzvz) obj;
        if (!TextUtils.isEmpty(zzvzVar.f16929g)) {
            this.f16709a.m9384c(new zzqe(zzvzVar.f16929g, zzvzVar.f16928f, null));
        } else {
            this.f16710b.m9352b(new zzwq(zzvzVar.f16925c, zzvzVar.f16924b, Long.valueOf(zzvzVar.f16927e), "Bearer"), null, null, Boolean.valueOf(zzvzVar.f16926d), null, this.f16709a, this);
        }
    }
}
