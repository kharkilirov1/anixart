package com.google.android.gms.internal.p041firebaseauthapi;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zztt {

    /* renamed from: c */
    public static final Logger f16821c = new Logger("FirebaseAuth", "FirebaseAuthFallback:");

    /* renamed from: a */
    public final zzrx f16822a;

    /* renamed from: b */
    public final zzvn f16823b;

    public zztt(FirebaseApp firebaseApp) {
        Objects.requireNonNull(firebaseApp, "null reference");
        firebaseApp.m12217a();
        Context context = firebaseApp.f22259a;
        Objects.requireNonNull(context, "null reference");
        this.f16822a = new zzrx(new zzuh(firebaseApp, zzug.m9413a()));
        this.f16823b = new zzvn(context);
    }

    /* renamed from: a */
    public static boolean m9390a(long j2, boolean z) {
        if (j2 > 0 && z) {
            return true;
        }
        Logger logger = f16821c;
        Log.w(logger.f15834a, logger.m8206c("App hash will not be appended to the request.", new Object[0]));
        return false;
    }

    /* renamed from: b */
    public final void m9391b(zznw zznwVar, zztr zztrVar) {
        Objects.requireNonNull((Object) null, "null reference");
        throw null;
    }

    /* renamed from: c */
    public final void m9392c(zzoq zzoqVar, zztr zztrVar) {
        Objects.requireNonNull(zztrVar, "null reference");
        PhoneAuthCredential phoneAuthCredential = zzoqVar.f16648c;
        Objects.requireNonNull(phoneAuthCredential, "null reference");
        String str = zzoqVar.f16647b;
        Preconditions.m8129d(str);
        zzrx zzrxVar = this.f16822a;
        zzxy m9445a = zzvd.m9445a(phoneAuthCredential);
        zzts zztsVar = new zzts(zztrVar, f16821c);
        Objects.requireNonNull(zzrxVar);
        Preconditions.m8129d(str);
        zzrxVar.m9351a(str, new zzqw(zzrxVar, m9445a, zztsVar));
    }

    /* renamed from: d */
    public final void m9393d(zzpe zzpeVar, zztr zztrVar) {
        Objects.requireNonNull(zzpeVar, "null reference");
        Objects.requireNonNull(zzpeVar.f16658b, "null reference");
        Objects.requireNonNull(zztrVar, "null reference");
        zzrx zzrxVar = this.f16822a;
        zzxq zzxqVar = zzpeVar.f16658b;
        zzts zztsVar = new zzts(zztrVar, f16821c);
        Objects.requireNonNull(zzrxVar);
        Objects.requireNonNull(zzxqVar, "null reference");
        zzxqVar.f17059p = true;
        zzrxVar.f16798a.mo9425k(zzxqVar, new zzrq(zzrxVar, zztsVar));
    }

    /* renamed from: e */
    public final void m9394e(zzpi zzpiVar, zztr zztrVar) {
        Objects.requireNonNull(zzpiVar, "null reference");
        Preconditions.m8129d(zzpiVar.f16661b);
        Preconditions.m8129d(zzpiVar.f16662c);
        Objects.requireNonNull(zztrVar, "null reference");
        zzrx zzrxVar = this.f16822a;
        String str = zzpiVar.f16661b;
        String str2 = zzpiVar.f16662c;
        String str3 = zzpiVar.f16663d;
        zzts zztsVar = new zzts(zztrVar, f16821c);
        Objects.requireNonNull(zzrxVar);
        Preconditions.m8129d(str);
        Preconditions.m8129d(str2);
        zzrxVar.f16798a.mo9426l(new zzxw(str, str2, str3), new zzqh(zzrxVar, zztsVar));
    }

    /* renamed from: f */
    public final void m9395f(zzpk zzpkVar, zztr zztrVar) {
        Objects.requireNonNull(zzpkVar, "null reference");
        Objects.requireNonNull(zzpkVar.f16664b, "null reference");
        Objects.requireNonNull(zztrVar, "null reference");
        zzrx zzrxVar = this.f16822a;
        EmailAuthCredential emailAuthCredential = zzpkVar.f16664b;
        zzts zztsVar = new zzts(zztrVar, f16821c);
        Objects.requireNonNull(zzrxVar);
        Objects.requireNonNull(emailAuthCredential, "null reference");
        if (emailAuthCredential.f22304f) {
            zzrxVar.m9351a(emailAuthCredential.f22303e, new zzqi(zzrxVar, emailAuthCredential, zztsVar));
        } else {
            zzrxVar.f16798a.mo9416b(new zzvy(emailAuthCredential, null), new zzqj(zzrxVar, zztsVar));
        }
    }

    /* renamed from: g */
    public final void m9396g(zzpm zzpmVar, zztr zztrVar) {
        Objects.requireNonNull(zztrVar, "null reference");
        Objects.requireNonNull(zzpmVar, "null reference");
        PhoneAuthCredential phoneAuthCredential = zzpmVar.f16665b;
        Objects.requireNonNull(phoneAuthCredential, "null reference");
        zzrx zzrxVar = this.f16822a;
        zzxy m9445a = zzvd.m9445a(phoneAuthCredential);
        zzts zztsVar = new zzts(zztrVar, f16821c);
        Objects.requireNonNull(zzrxVar);
        zzrxVar.f16798a.mo9427m(m9445a, new zzqt(zzrxVar, zztsVar));
    }
}
