package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@VisibleForTesting
/* loaded from: classes.dex */
final class zzsi extends zzut {

    /* renamed from: r */
    public final EmailAuthCredential f16801r;

    public zzsi(EmailAuthCredential emailAuthCredential) {
        super(2);
        this.f16801r = emailAuthCredential;
        Preconditions.m8130e(emailAuthCredential.f22300b, "email cannot be null");
        Preconditions.m8130e(emailAuthCredential.f22301c, "password cannot be null");
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuv
    /* renamed from: a */
    public final void mo9353a(TaskCompletionSource taskCompletionSource, zztt zzttVar) {
        this.f16877q = new zzus(this, taskCompletionSource);
        EmailAuthCredential emailAuthCredential = this.f16801r;
        String str = emailAuthCredential.f22300b;
        String str2 = emailAuthCredential.f22301c;
        Preconditions.m8129d(str2);
        zzom zzomVar = new zzom(str, str2, this.f16864d.mo12247f1());
        zzuq zzuqVar = this.f16862b;
        Objects.requireNonNull(zzttVar);
        Preconditions.m8129d(zzomVar.f16642b);
        Preconditions.m8129d(zzomVar.f16643c);
        Preconditions.m8129d(zzomVar.f16644d);
        Objects.requireNonNull(zzuqVar, "null reference");
        zzrx zzrxVar = zzttVar.f16822a;
        String str3 = zzomVar.f16642b;
        String str4 = zzomVar.f16643c;
        String str5 = zzomVar.f16644d;
        zzts zztsVar = new zzts(zzuqVar, zztt.f16821c);
        Objects.requireNonNull(zzrxVar);
        Preconditions.m8129d(str3);
        Preconditions.m8129d(str4);
        Preconditions.m8129d(str5);
        zzrxVar.m9351a(str5, new zzqu(zzrxVar, str3, str4, zztsVar));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzut
    /* renamed from: b */
    public final void mo9354b() {
        zzx m9356e = zztq.m9356e(this.f16863c, this.f16870j);
        ((zzg) this.f16865e).mo12317a(this.f16869i, m9356e);
        zzr zzrVar = new zzr(m9356e);
        this.f16875o = true;
        this.f16877q.m9435a(zzrVar, null);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuv
    /* renamed from: u */
    public final String mo9355u() {
        return "linkEmailAuthCredential";
    }
}
