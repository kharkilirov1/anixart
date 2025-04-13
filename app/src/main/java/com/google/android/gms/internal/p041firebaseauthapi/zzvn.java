package com.google.android.gms.internal.p041firebaseauthapi;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.p040authapiphone.zzab;
import com.google.android.gms.internal.p040authapiphone.zzac;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.PhoneAuthCredential;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzvn {

    /* renamed from: d */
    public static final Logger f16903d = new Logger("FirebaseAuth", "SmsRetrieverHelper");

    /* renamed from: a */
    public final Context f16904a;

    /* renamed from: c */
    public final HashMap f16906c = new HashMap();

    /* renamed from: b */
    public final ScheduledExecutorService f16905b = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));

    public zzvn(@NonNull Context context) {
        this.f16904a = context;
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m9452b(zzvn zzvnVar, String str) {
        zzvm zzvmVar = (zzvm) zzvnVar.f16906c.get(str);
        if (zzvmVar == null || zzag.m8817c(zzvmVar.f16897d) || zzag.m8817c(zzvmVar.f16898e) || zzvmVar.f16895b.isEmpty()) {
            return;
        }
        Iterator it = zzvmVar.f16895b.iterator();
        while (it.hasNext()) {
            ((zzts) it.next()).m9389h(PhoneAuthCredential.m12260p(zzvmVar.f16897d, zzvmVar.f16898e));
        }
        zzvmVar.f16901h = true;
    }

    /* renamed from: g */
    public static String m9453g(String str, String str2) {
        String m16m = C0000a.m16m(str, " ", str2);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(m16m.getBytes(zzo.f16629a));
            String substring = Base64.encodeToString(Arrays.copyOf(messageDigest.digest(), 9), 3).substring(0, 11);
            f16903d.m8204a("Package: " + str + " -- Hash: " + substring, new Object[0]);
            return substring;
        } catch (NoSuchAlgorithmException e2) {
            f16903d.m8205b("NoSuchAlgorithm: ".concat(String.valueOf(e2.getMessage())), new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public final String m9454a() {
        try {
            String packageName = this.f16904a.getPackageName();
            String m9453g = m9453g(packageName, (Build.VERSION.SDK_INT < 28 ? Wrappers.m8251a(this.f16904a).m8250b(packageName, 64).signatures : Wrappers.m8251a(this.f16904a).m8250b(packageName, 134217728).signingInfo.getApkContentsSigners())[0].toCharsString());
            if (m9453g != null) {
                return m9453g;
            }
            Logger logger = f16903d;
            Log.e(logger.f15834a, logger.m8206c("Hash generation failed.", new Object[0]));
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Logger logger2 = f16903d;
            Log.e(logger2.f15834a, logger2.m8206c("Unable to find package to obtain hash.", new Object[0]));
            return null;
        }
    }

    /* renamed from: c */
    public final void m9455c(zzts zztsVar, String str) {
        zzvm zzvmVar = (zzvm) this.f16906c.get(str);
        if (zzvmVar == null) {
            return;
        }
        zzvmVar.f16895b.add(zztsVar);
        if (zzvmVar.f16900g) {
            zztsVar.mo9383b(zzvmVar.f16897d);
        }
        if (zzvmVar.f16901h) {
            zztsVar.m9389h(PhoneAuthCredential.m12260p(zzvmVar.f16897d, zzvmVar.f16898e));
        }
        if (zzvmVar.f16902i) {
            zztsVar.m9382a(zzvmVar.f16897d);
        }
    }

    /* renamed from: d */
    public final void m9456d(String str) {
        zzvm zzvmVar = (zzvm) this.f16906c.get(str);
        if (zzvmVar == null) {
            return;
        }
        ScheduledFuture scheduledFuture = zzvmVar.f16899f;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            zzvmVar.f16899f.cancel(false);
        }
        zzvmVar.f16895b.clear();
        this.f16906c.remove(str);
    }

    /* renamed from: e */
    public final void m9457e(final String str, zzts zztsVar, long j2, boolean z) {
        this.f16906c.put(str, new zzvm(j2, z));
        m9455c(zztsVar, str);
        zzvm zzvmVar = (zzvm) this.f16906c.get(str);
        long j3 = zzvmVar.f16894a;
        if (j3 <= 0) {
            Logger logger = f16903d;
            Log.w(logger.f15834a, logger.m8206c("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]));
            return;
        }
        zzvmVar.f16899f = this.f16905b.schedule(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.zzvi
            @Override // java.lang.Runnable
            public final void run() {
                zzvn.this.m9460i(str);
            }
        }, j3, TimeUnit.SECONDS);
        if (!zzvmVar.f16896c) {
            Logger logger2 = f16903d;
            Log.w(logger2.f15834a, logger2.m8206c("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]));
            return;
        }
        zzvl zzvlVar = new zzvl(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        Context applicationContext = this.f16904a.getApplicationContext();
        int i2 = zzb.f16396c;
        if (zza.m8569a()) {
            applicationContext.registerReceiver(zzvlVar, intentFilter, true != zza.m8569a() ? 0 : 2);
        } else {
            applicationContext.registerReceiver(zzvlVar, intentFilter);
        }
        final zzab zzabVar = new zzab(this.f16904a);
        TaskApiCall.Builder m8008a = TaskApiCall.m8008a();
        m8008a.f15436a = new RemoteCall(zzabVar) { // from class: com.google.android.gms.internal.auth-api-phone.zzx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            /* renamed from: a */
            public final void mo8007a(Object obj, Object obj2) {
                zzh zzhVar = (zzh) ((zzw) obj).m8111y();
                zzz zzzVar = new zzz((TaskCompletionSource) obj2);
                Parcel m8314i = zzhVar.m8314i();
                zzc.m8319b(m8314i, zzzVar);
                zzhVar.m8315q(1, m8314i);
            }
        };
        m8008a.f15438c = new Feature[]{zzac.f15999a};
        m8008a.f15439d = 1567;
        zzabVar.m7949d(1, m8008a.m8009a()).mo9700e(new zzvj());
    }

    /* renamed from: f */
    public final boolean m9458f(String str) {
        return this.f16906c.get(str) != null;
    }

    /* renamed from: h */
    public final void m9459h(String str) {
        zzvm zzvmVar = (zzvm) this.f16906c.get(str);
        if (zzvmVar == null || zzvmVar.f16901h || zzag.m8817c(zzvmVar.f16897d)) {
            return;
        }
        Logger logger = f16903d;
        Log.w(logger.f15834a, logger.m8206c("Timed out waiting for SMS.", new Object[0]));
        Iterator it = zzvmVar.f16895b.iterator();
        while (it.hasNext()) {
            ((zzts) it.next()).m9382a(zzvmVar.f16897d);
        }
        zzvmVar.f16902i = true;
    }

    /* renamed from: i */
    public final void m9460i(String str) {
        zzvm zzvmVar = (zzvm) this.f16906c.get(str);
        if (zzvmVar == null) {
            return;
        }
        if (!zzvmVar.f16902i) {
            m9459h(str);
        }
        m9456d(str);
    }
}
