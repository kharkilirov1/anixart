package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.PhoneAuthCredential;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzqv implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ zzuy f16740a;

    /* renamed from: b */
    public final /* synthetic */ zzqw f16741b;

    public zzqv(zzqw zzqwVar, zzuy zzuyVar) {
        this.f16741b = zzqwVar;
        this.f16740a = zzuyVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(@Nullable String str) {
        this.f16740a.mo9345a(str);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        zzxz zzxzVar = (zzxz) obj;
        if (TextUtils.isEmpty(zzxzVar.f17101f)) {
            this.f16741b.f16744c.m9352b(new zzwq(zzxzVar.f17098c, zzxzVar.f17097b, Long.valueOf(zzxzVar.f17099d), "Bearer"), null, "phone", Boolean.valueOf(zzxzVar.f17100e), null, this.f16741b.f16743b, this.f16740a);
            return;
        }
        Status status = new Status(17025, null);
        zzts zztsVar = this.f16741b.f16743b;
        PhoneAuthCredential phoneAuthCredential = new PhoneAuthCredential(null, null, false, zzxzVar.f17102g, true, zzxzVar.f17101f, null);
        Objects.requireNonNull(zztsVar);
        try {
            zztsVar.f16819a.mo9379l(status, phoneAuthCredential);
        } catch (RemoteException e2) {
            Logger logger = zztsVar.f16820b;
            Log.e(logger.f15834a, logger.m8206c("RemoteException when sending failure result.", new Object[0]), e2);
        }
    }
}
