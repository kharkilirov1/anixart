package com.google.android.gms.auth.api.signin.internal;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Objects;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public final class zbt extends zbo {

    /* renamed from: a */
    public final Context f15247a;

    public zbt(Context context) {
        this.f15247a = context;
    }

    /* renamed from: q */
    public final void m7890q() {
        boolean z;
        AppOpsManager appOpsManager;
        Context context = this.f15247a;
        int callingUid = Binder.getCallingUid();
        PackageManagerWrapper m8251a = Wrappers.m8251a(context);
        Objects.requireNonNull(m8251a);
        boolean z2 = true;
        boolean z3 = false;
        try {
            appOpsManager = (AppOpsManager) m8251a.f15914a.getSystemService("appops");
        } catch (SecurityException unused) {
            z = false;
        }
        if (appOpsManager == null) {
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        }
        appOpsManager.checkPackage(callingUid, "com.google.android.gms");
        z = true;
        if (z) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                GoogleSignatureVerifier m7928a = GoogleSignatureVerifier.m7928a(context);
                Objects.requireNonNull(m7928a);
                if (packageInfo != null) {
                    if (!GoogleSignatureVerifier.m7930c(packageInfo, false)) {
                        if (GoogleSignatureVerifier.m7930c(packageInfo, true)) {
                            Context context2 = m7928a.f15337a;
                            try {
                                if (!GooglePlayServicesUtilLight.f15334c) {
                                    PackageInfo packageInfo2 = Wrappers.m8251a(context2).f15914a.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                                    GoogleSignatureVerifier.m7928a(context2);
                                    if (packageInfo2 == null || GoogleSignatureVerifier.m7930c(packageInfo2, false) || !GoogleSignatureVerifier.m7930c(packageInfo2, true)) {
                                        GooglePlayServicesUtilLight.f15333b = false;
                                    } else {
                                        GooglePlayServicesUtilLight.f15333b = true;
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
                            } finally {
                                GooglePlayServicesUtilLight.f15334c = true;
                            }
                            if (!(GooglePlayServicesUtilLight.f15333b || !"user".equals(Build.TYPE))) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    z3 = z2;
                }
                z2 = false;
                z3 = z2;
            } catch (PackageManager.NameNotFoundException unused2) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        if (!z3) {
            throw new SecurityException(C0000a.m8e("Calling UID ", Binder.getCallingUid(), " is not Google Play services."));
        }
    }
}
