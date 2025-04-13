package com.google.android.gms.internal.p041firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzai;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzrc implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ zzrd f16758a;

    public zzrc(zzrd zzrdVar) {
        this.f16758a = zzrdVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(@Nullable String str) {
        this.f16758a.f16760b.mo9385d(zzai.m12298a(str));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        zzyb zzybVar = (zzyb) obj;
        if (TextUtils.isEmpty(zzybVar.f17105b) || TextUtils.isEmpty(zzybVar.f17106c)) {
            this.f16758a.f16760b.mo9385d(zzai.m12298a("INTERNAL_SUCCESS_SIGN_OUT"));
            return;
        }
        zzwq zzwqVar = new zzwq(zzybVar.f17106c, zzybVar.f17105b, Long.valueOf(zzws.m9470a(zzybVar.f17105b)), "Bearer");
        zzrd zzrdVar = this.f16758a;
        zzrdVar.f16761c.m9352b(zzwqVar, null, null, Boolean.FALSE, null, zzrdVar.f16760b, this);
    }
}
