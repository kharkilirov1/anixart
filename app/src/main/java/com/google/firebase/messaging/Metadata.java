package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.FirebaseApp;
import java.util.List;

/* loaded from: classes2.dex */
class Metadata {

    /* renamed from: a */
    public final Context f23295a;

    /* renamed from: b */
    @GuardedBy
    public String f23296b;

    /* renamed from: c */
    @GuardedBy
    public String f23297c;

    /* renamed from: d */
    @GuardedBy
    public int f23298d;

    /* renamed from: e */
    @GuardedBy
    public int f23299e = 0;

    public Metadata(Context context) {
        this.f23295a = context;
    }

    /* renamed from: b */
    public static String m12665b(FirebaseApp firebaseApp) {
        firebaseApp.m12217a();
        String str = firebaseApp.f22261c.f22277e;
        if (str != null) {
            return str;
        }
        firebaseApp.m12217a();
        String str2 = firebaseApp.f22261c.f22274b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* renamed from: a */
    public synchronized String m12666a() {
        if (this.f23296b == null) {
            m12669e();
        }
        return this.f23296b;
    }

    /* renamed from: c */
    public final PackageInfo m12667c(String str) {
        try {
            return this.f23295a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("FirebaseMessaging", "Failed to find package " + e2);
            return null;
        }
    }

    /* renamed from: d */
    public boolean m12668d() {
        int i2;
        synchronized (this) {
            i2 = this.f23299e;
            if (i2 == 0) {
                PackageManager packageManager = this.f23295a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i2 = 0;
                } else {
                    if (!PlatformVersion.m8244a()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f23299e = 1;
                            i2 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (PlatformVersion.m8244a()) {
                            this.f23299e = 2;
                        } else {
                            this.f23299e = 1;
                        }
                        i2 = this.f23299e;
                    } else {
                        this.f23299e = 2;
                        i2 = 2;
                    }
                }
            }
        }
        return i2 != 0;
    }

    /* renamed from: e */
    public final synchronized void m12669e() {
        PackageInfo m12667c = m12667c(this.f23295a.getPackageName());
        if (m12667c != null) {
            this.f23296b = Integer.toString(m12667c.versionCode);
            this.f23297c = m12667c.versionName;
        }
    }
}
