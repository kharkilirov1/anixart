package com.google.android.gms.internal.p041firebaseauthapi;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzui {

    /* renamed from: a */
    public final Context f16845a;

    /* renamed from: b */
    public zzvc f16846b;

    /* renamed from: c */
    public final String f16847c;

    /* renamed from: d */
    public final FirebaseApp f16848d;

    /* renamed from: e */
    public boolean f16849e = false;

    /* renamed from: f */
    public String f16850f;

    public zzui(Context context, FirebaseApp firebaseApp, String str) {
        Objects.requireNonNull(context, "null reference");
        this.f16845a = context;
        Objects.requireNonNull(firebaseApp, "null reference");
        this.f16848d = firebaseApp;
        this.f16847c = String.format("Android/%s/%s", "Fallback", str);
    }

    /* renamed from: a */
    public final void m9430a(URLConnection uRLConnection) {
        String str;
        String concat = this.f16849e ? String.valueOf(this.f16847c).concat("/FirebaseUI-Android") : String.valueOf(this.f16847c).concat("/FirebaseCore-Android");
        if (this.f16846b == null) {
            Context context = this.f16845a;
            this.f16846b = new zzvc(context, context.getPackageName());
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.f16846b.f16883a);
        uRLConnection.setRequestProperty("X-Android-Cert", this.f16846b.f16884b);
        uRLConnection.setRequestProperty("Accept-Language", zzuj.m9431a());
        uRLConnection.setRequestProperty("X-Client-Version", concat);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.f16850f);
        FirebaseApp firebaseApp = this.f16848d;
        firebaseApp.m12217a();
        uRLConnection.setRequestProperty("X-Firebase-GMPID", firebaseApp.f22261c.f22274b);
        HeartBeatController heartBeatController = (HeartBeatController) FirebaseAuth.getInstance(this.f16848d).f22318m.get();
        if (heartBeatController != null) {
            try {
                str = (String) Tasks.m9719a(heartBeatController.mo12507a());
            } catch (InterruptedException | ExecutionException e2) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: ".concat(String.valueOf(e2.getMessage())));
            }
            uRLConnection.setRequestProperty("X-Firebase-Client", str);
            this.f16850f = null;
        }
        str = null;
        uRLConnection.setRequestProperty("X-Firebase-Client", str);
        this.f16850f = null;
    }
}
