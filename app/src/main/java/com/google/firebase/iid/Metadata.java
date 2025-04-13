package com.google.firebase.iid;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseApp;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class Metadata {

    /* renamed from: a */
    public final Context f23091a;

    /* renamed from: b */
    @GuardedBy
    public String f23092b;

    /* renamed from: c */
    @GuardedBy
    public String f23093c;

    /* renamed from: d */
    @GuardedBy
    public int f23094d;

    /* renamed from: e */
    @GuardedBy
    public int f23095e = 0;

    public Metadata(Context context) {
        this.f23091a = context;
    }

    /* renamed from: b */
    public static String m12534b(FirebaseApp firebaseApp) {
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
    public synchronized String m12535a() {
        if (this.f23092b == null) {
            m12537d();
        }
        return this.f23092b;
    }

    /* renamed from: c */
    public final PackageInfo m12536c(String str) {
        try {
            return this.f23091a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* renamed from: d */
    public final synchronized void m12537d() {
        PackageInfo m12536c = m12536c(this.f23091a.getPackageName());
        if (m12536c != null) {
            this.f23092b = Integer.toString(m12536c.versionCode);
            this.f23093c = m12536c.versionName;
        }
    }
}
