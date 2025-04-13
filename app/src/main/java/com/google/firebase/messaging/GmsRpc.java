package com.google.firebase.messaging;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.window.layout.ExecutorC0688c;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
class GmsRpc {

    /* renamed from: a */
    public final FirebaseApp f23286a;

    /* renamed from: b */
    public final Metadata f23287b;

    /* renamed from: c */
    public final Rpc f23288c;

    /* renamed from: d */
    public final Provider<UserAgentPublisher> f23289d;

    /* renamed from: e */
    public final Provider<HeartBeatInfo> f23290e;

    /* renamed from: f */
    public final FirebaseInstallationsApi f23291f;

    public GmsRpc(FirebaseApp firebaseApp, Metadata metadata, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        firebaseApp.m12217a();
        Rpc rpc = new Rpc(firebaseApp.f22259a);
        this.f23286a = firebaseApp;
        this.f23287b = metadata;
        this.f23288c = rpc;
        this.f23289d = provider;
        this.f23290e = provider2;
        this.f23291f = firebaseInstallationsApi;
    }

    /* renamed from: a */
    public final Task<String> m12658a(Task<Bundle> task) {
        return task.mo9704i(ExecutorC0688c.f6817i, new C2161e(this));
    }

    /* renamed from: b */
    public final void m12659b(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        int i2;
        String str3;
        String str4;
        HeartBeatInfo.HeartBeat mo12508b;
        PackageInfo m12667c;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        FirebaseApp firebaseApp = this.f23286a;
        firebaseApp.m12217a();
        bundle.putString("gmp_app_id", firebaseApp.f22261c.f22274b);
        Metadata metadata = this.f23287b;
        synchronized (metadata) {
            if (metadata.f23298d == 0 && (m12667c = metadata.m12667c("com.google.android.gms")) != null) {
                metadata.f23298d = m12667c.versionCode;
            }
            i2 = metadata.f23298d;
        }
        bundle.putString("gmsv", Integer.toString(i2));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f23287b.m12666a());
        Metadata metadata2 = this.f23287b;
        synchronized (metadata2) {
            if (metadata2.f23297c == null) {
                metadata2.m12669e();
            }
            str3 = metadata2.f23297c;
        }
        bundle.putString("app_ver_name", str3);
        FirebaseApp firebaseApp2 = this.f23286a;
        firebaseApp2.m12217a();
        try {
            str4 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(firebaseApp2.f22260b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str4 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str4);
        try {
            String mo12554a = ((InstallationTokenResult) Tasks.m9719a(this.f23291f.mo12560a(false))).mo12554a();
            if (TextUtils.isEmpty(mo12554a)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", mo12554a);
            }
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e2);
        }
        bundle.putString("appid", (String) Tasks.m9719a(this.f23291f.getId()));
        bundle.putString("cliv", "fcm-23.0.6");
        HeartBeatInfo heartBeatInfo = this.f23290e.get();
        UserAgentPublisher userAgentPublisher = this.f23289d.get();
        if (heartBeatInfo == null || userAgentPublisher == null || (mo12508b = heartBeatInfo.mo12508b("fire-iid")) == HeartBeatInfo.HeartBeat.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(mo12508b.f23045b));
        bundle.putString("Firebase-Client", userAgentPublisher.mo12721a());
    }

    /* renamed from: c */
    public final Task<Bundle> m12660c(String str, String str2, Bundle bundle) {
        try {
            m12659b(str, str2, bundle);
            return this.f23288c.m7895a(bundle);
        } catch (InterruptedException | ExecutionException e2) {
            return Tasks.m9722d(e2);
        }
    }
}
