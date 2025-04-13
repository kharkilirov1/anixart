package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.internal.zzai;
import com.google.firebase.auth.zze;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzrx {

    /* renamed from: a */
    public final zzuz f16798a;

    public zzrx(zzuz zzuzVar) {
        this.f16798a = zzuzVar;
    }

    /* renamed from: d */
    public static void m9348d(zzrx zzrxVar, zzxs zzxsVar, zzts zztsVar, zzux zzuxVar) {
        if (!(zzxsVar.f17061b || !TextUtils.isEmpty(zzxsVar.f17072m))) {
            zzrxVar.m9352b(new zzwq(zzxsVar.f17063d, zzxsVar.f17062c, Long.valueOf(zzxsVar.f17064e), "Bearer"), zzxsVar.f17067h, zzxsVar.f17066g, Boolean.valueOf(zzxsVar.f17068i), zzxsVar.m9478b(), zztsVar, zzuxVar);
            return;
        }
        zzqc zzqcVar = new zzqc(zzxsVar.f17061b ? new Status(17012, null) : zzai.m12298a(zzxsVar.f17072m), zzxsVar.m9478b(), zzxsVar.f17065f, zzxsVar.f17074o);
        Objects.requireNonNull(zztsVar);
        try {
            zztsVar.f16819a.mo9380m(zzqcVar);
        } catch (RemoteException e2) {
            Logger logger = zztsVar.f16820b;
            Log.e(logger.f15834a, logger.m8206c("RemoteException when sending failure result with credential", new Object[0]), e2);
        }
    }

    /* renamed from: e */
    public static void m9349e(zzrx zzrxVar, zzts zztsVar, zzwq zzwqVar, zzxg zzxgVar, zzux zzuxVar) {
        Objects.requireNonNull(zztsVar, "null reference");
        zzrxVar.f16798a.mo9419e(new zzwg(zzwqVar.f16970c), new zzqk(zzrxVar, zzuxVar, zztsVar, zzwqVar, zzxgVar));
    }

    /* renamed from: f */
    public static void m9350f(zzrx zzrxVar, zzts zztsVar, zzwq zzwqVar, zzwj zzwjVar, zzxg zzxgVar, zzux zzuxVar) {
        Objects.requireNonNull(zztsVar, "null reference");
        Objects.requireNonNull(zzwqVar, "null reference");
        Objects.requireNonNull(zzwjVar, "null reference");
        Objects.requireNonNull(zzxgVar, "null reference");
        Objects.requireNonNull(zzuxVar, "null reference");
        zzrxVar.f16798a.mo9422h(zzxgVar, new zzql(zzrxVar, zzxgVar, zzwjVar, zztsVar, zzwqVar, zzuxVar));
    }

    /* renamed from: a */
    public final void m9351a(String str, zzuy zzuyVar) {
        Preconditions.m8129d(str);
        zzwq m9467m = zzwq.m9467m(str);
        if (m9467m.m9469o()) {
            zzuyVar.mo9346b(m9467m);
        } else {
            this.f16798a.mo9418d(new zzwf(m9467m.f16969b), new zzrw(zzuyVar));
        }
    }

    /* renamed from: b */
    public final void m9352b(zzwq zzwqVar, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable zze zzeVar, zzts zztsVar, zzux zzuxVar) {
        Objects.requireNonNull(zzwqVar, "null reference");
        Objects.requireNonNull(zzuxVar, "null reference");
        Objects.requireNonNull(zztsVar, "null reference");
        this.f16798a.mo9419e(new zzwg(zzwqVar.f16970c), new zzqm(zzuxVar, str2, str, bool, zzeVar, zztsVar, zzwqVar));
    }
}
