package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.logging.Logger;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzrm implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ zzuy f16777a;

    /* renamed from: b */
    public final /* synthetic */ zzrn f16778b;

    public zzrm(zzrn zzrnVar, zzuy zzuyVar) {
        this.f16778b = zzrnVar;
        this.f16777a = zzuyVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(@Nullable String str) {
        this.f16777a.mo9345a(str);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        zzts zztsVar = this.f16778b.f16779a;
        Objects.requireNonNull(zztsVar);
        try {
            zztsVar.f16819a.mo9381x();
        } catch (RemoteException e2) {
            Logger logger = zztsVar.f16820b;
            Log.e(logger.f15834a, logger.m8206c("RemoteException when sending delete account response.", new Object[0]), e2);
        }
    }
}
