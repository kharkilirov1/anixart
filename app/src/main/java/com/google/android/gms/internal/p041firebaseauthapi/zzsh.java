package com.google.android.gms.internal.p041firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.internal.zzay;
import com.google.firebase.auth.internal.zzg;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@VisibleForTesting
/* loaded from: classes.dex */
final class zzsh extends zzut {

    /* renamed from: r */
    public final zzoi f16800r;

    public zzsh(String str) {
        super(1);
        Preconditions.m8130e(str, "refresh token cannot be null");
        this.f16800r = new zzoi(str);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuv
    /* renamed from: a */
    public final void mo9353a(TaskCompletionSource taskCompletionSource, zztt zzttVar) {
        this.f16877q = new zzus(this, taskCompletionSource);
        zzoi zzoiVar = this.f16800r;
        zzuq zzuqVar = this.f16862b;
        Objects.requireNonNull(zzttVar);
        Objects.requireNonNull(zzoiVar, "null reference");
        Objects.requireNonNull(zzuqVar, "null reference");
        Preconditions.m8129d(zzoiVar.f16639b);
        zzrx zzrxVar = zzttVar.f16822a;
        String str = zzoiVar.f16639b;
        zzts zztsVar = new zzts(zzuqVar, zztt.f16821c);
        Objects.requireNonNull(zzrxVar);
        Preconditions.m8129d(str);
        zzrxVar.f16798a.mo9418d(new zzwf(str), new zzqq(zztsVar));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzut
    /* renamed from: b */
    public final void mo9354b() {
        if (TextUtils.isEmpty(this.f16869i.f16969b)) {
            zzwq zzwqVar = this.f16869i;
            String str = this.f16800r.f16639b;
            Objects.requireNonNull(zzwqVar);
            Preconditions.m8129d(str);
            zzwqVar.f16969b = str;
        }
        ((zzg) this.f16865e).mo12317a(this.f16869i, this.f16864d);
        GetTokenResult m12303a = zzay.m12303a(this.f16869i.f16970c);
        this.f16875o = true;
        this.f16877q.m9435a(m12303a, null);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuv
    /* renamed from: u */
    public final String mo9355u() {
        return "getAccessToken";
    }
}
