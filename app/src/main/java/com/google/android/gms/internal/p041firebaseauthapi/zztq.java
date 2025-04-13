package com.google.android.gms.internal.p041firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzba;
import com.google.firebase.auth.internal.zzbk;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzt;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.internal.zzz;
import com.yandex.metrica.push.common.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zztq extends zzuw {
    public zztq(FirebaseApp firebaseApp) {
        this.f16881a = new zztt(firebaseApp);
        this.f16882b = Executors.newCachedThreadPool();
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: e */
    public static zzx m9356e(FirebaseApp firebaseApp, zzwj zzwjVar) {
        Objects.requireNonNull(firebaseApp, "null reference");
        Objects.requireNonNull(zzwjVar, "null reference");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzt(zzwjVar, CoreConstants.Transport.FIREBASE));
        List list = zzwjVar.f16953g.f16987b;
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                arrayList.add(new zzt((zzww) list.get(i2)));
            }
        }
        zzx zzxVar = new zzx(firebaseApp, arrayList);
        zzxVar.f22445j = new zzz(zzwjVar.f16957k, zzwjVar.f16956j);
        zzxVar.f22446k = zzwjVar.f16958l;
        zzxVar.f22447l = zzwjVar.f16959m;
        zzxVar.mo12253o1(zzba.m12309b(zzwjVar.f16960n));
        return zzxVar;
    }

    /* renamed from: b */
    public final Task m9357b(FirebaseApp firebaseApp, String str, String str2, @Nullable String str3, zzg zzgVar) {
        zztb zztbVar = new zztb(str, str2, str3);
        zztbVar.m9438d(firebaseApp);
        zztbVar.m9437c(zzgVar);
        return m9441a(zztbVar);
    }

    /* renamed from: c */
    public final Task m9358c(FirebaseApp firebaseApp, EmailAuthCredential emailAuthCredential, zzg zzgVar) {
        zztc zztcVar = new zztc(emailAuthCredential);
        zztcVar.m9438d(firebaseApp);
        zztcVar.m9437c(zzgVar);
        return m9441a(zztcVar);
    }

    /* renamed from: d */
    public final Task m9359d(FirebaseApp firebaseApp, PhoneAuthCredential phoneAuthCredential, @Nullable String str, zzg zzgVar) {
        zzvh.m9451b();
        zztd zztdVar = new zztd(phoneAuthCredential, str);
        zztdVar.m9438d(firebaseApp);
        zztdVar.m9437c(zzgVar);
        return m9441a(zztdVar);
    }

    /* renamed from: f */
    public final Task m9360f(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzbk zzbkVar) {
        zzsh zzshVar = new zzsh(str);
        zzshVar.m9438d(firebaseApp);
        zzshVar.m9439e(firebaseUser);
        zzshVar.m9437c(zzbkVar);
        zzshVar.f16866f = zzbkVar;
        return m9441a(zzshVar);
    }

    /* renamed from: g */
    public final Task m9361g(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, zzbk zzbkVar) {
        Objects.requireNonNull(firebaseApp, "null reference");
        Objects.requireNonNull(authCredential, "null reference");
        List mo12248j1 = firebaseUser.mo12248j1();
        if (mo12248j1 != null && mo12248j1.contains(authCredential.mo12229m())) {
            return Tasks.m9722d(zztu.m9397a(new Status(17015, null)));
        }
        if (authCredential instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredential;
            if (!TextUtils.isEmpty(emailAuthCredential.f22302d)) {
                zzsl zzslVar = new zzsl(emailAuthCredential);
                zzslVar.m9438d(firebaseApp);
                zzslVar.m9439e(firebaseUser);
                zzslVar.m9437c(zzbkVar);
                zzslVar.f16866f = zzbkVar;
                return m9441a(zzslVar);
            }
            zzsi zzsiVar = new zzsi(emailAuthCredential);
            zzsiVar.m9438d(firebaseApp);
            zzsiVar.m9439e(firebaseUser);
            zzsiVar.m9437c(zzbkVar);
            zzsiVar.f16866f = zzbkVar;
            return m9441a(zzsiVar);
        }
        if (!(authCredential instanceof PhoneAuthCredential)) {
            zzsj zzsjVar = new zzsj(authCredential);
            zzsjVar.m9438d(firebaseApp);
            zzsjVar.m9439e(firebaseUser);
            zzsjVar.m9437c(zzbkVar);
            zzsjVar.f16866f = zzbkVar;
            return m9441a(zzsjVar);
        }
        zzvh.m9451b();
        zzsk zzskVar = new zzsk((PhoneAuthCredential) authCredential);
        zzskVar.m9438d(firebaseApp);
        zzskVar.m9439e(firebaseUser);
        zzskVar.m9437c(zzbkVar);
        zzskVar.f16866f = zzbkVar;
        return m9441a(zzskVar);
    }

    /* renamed from: h */
    public final Task m9362h(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, @Nullable String str, zzbk zzbkVar) {
        zzsn zzsnVar = new zzsn(authCredential, str);
        zzsnVar.m9438d(firebaseApp);
        zzsnVar.m9439e(firebaseUser);
        zzsnVar.m9437c(zzbkVar);
        zzsnVar.f16866f = zzbkVar;
        return m9441a(zzsnVar);
    }

    /* renamed from: i */
    public final Task m9363i(FirebaseApp firebaseApp, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, zzbk zzbkVar) {
        zzsp zzspVar = new zzsp(emailAuthCredential);
        zzspVar.m9438d(firebaseApp);
        zzspVar.m9439e(firebaseUser);
        zzspVar.m9437c(zzbkVar);
        zzspVar.f16866f = zzbkVar;
        return m9441a(zzspVar);
    }

    /* renamed from: j */
    public final Task m9364j(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, String str2, @Nullable String str3, zzbk zzbkVar) {
        zzsr zzsrVar = new zzsr(str, str2, str3);
        zzsrVar.m9438d(firebaseApp);
        zzsrVar.m9439e(firebaseUser);
        zzsrVar.m9437c(zzbkVar);
        zzsrVar.f16866f = zzbkVar;
        return m9441a(zzsrVar);
    }

    /* renamed from: k */
    public final Task m9365k(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, @Nullable String str, zzbk zzbkVar) {
        zzvh.m9451b();
        zzst zzstVar = new zzst(phoneAuthCredential, str);
        zzstVar.m9438d(firebaseApp);
        zzstVar.m9439e(firebaseUser);
        zzstVar.m9437c(zzbkVar);
        zzstVar.f16866f = zzbkVar;
        return m9441a(zzstVar);
    }

    /* renamed from: l */
    public final Task m9366l(FirebaseApp firebaseApp, AuthCredential authCredential, @Nullable String str, zzg zzgVar) {
        zzsz zzszVar = new zzsz(authCredential, str);
        zzszVar.m9438d(firebaseApp);
        zzszVar.m9437c(zzgVar);
        return m9441a(zzszVar);
    }
}
