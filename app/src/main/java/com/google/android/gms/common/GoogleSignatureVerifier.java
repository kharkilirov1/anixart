package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public class GoogleSignatureVerifier {

    /* renamed from: b */
    @Nullable
    public static GoogleSignatureVerifier f15336b;

    /* renamed from: a */
    public final Context f15337a;

    public GoogleSignatureVerifier(@NonNull Context context) {
        this.f15337a = context.getApplicationContext();
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static GoogleSignatureVerifier m7928a(@NonNull Context context) {
        Objects.requireNonNull(context, "null reference");
        synchronized (GoogleSignatureVerifier.class) {
            if (f15336b == null) {
                zzk zzkVar = zzm.f15927a;
                synchronized (zzm.class) {
                    if (zzm.f15933g == null) {
                        zzm.f15933g = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f15336b = new GoogleSignatureVerifier(context);
            }
        }
        return f15336b;
    }

    @Nullable
    /* renamed from: b */
    public static final zzi m7929b(PackageInfo packageInfo, zzi... zziVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        zzj zzjVar = new zzj(packageInfo.signatures[0].toByteArray());
        for (int i2 = 0; i2 < zziVarArr.length; i2++) {
            if (zziVarArr[i2].equals(zzjVar)) {
                return zziVarArr[i2];
            }
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m7930c(@NonNull PackageInfo packageInfo, boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? m7929b(packageInfo, zzl.f15926a) : m7929b(packageInfo, zzl.f15926a[0])) != null) {
                return true;
            }
        }
        return false;
    }
}
