package com.google.android.gms.common.wrappers;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class PackageManagerWrapper {

    /* renamed from: a */
    @NonNull
    public final Context f15914a;

    public PackageManagerWrapper(@NonNull Context context) {
        this.f15914a = context;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public ApplicationInfo m8249a(@NonNull String str, int i2) throws PackageManager.NameNotFoundException {
        return this.f15914a.getPackageManager().getApplicationInfo(str, i2);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public PackageInfo m8250b(@NonNull String str, int i2) throws PackageManager.NameNotFoundException {
        return this.f15914a.getPackageManager().getPackageInfo(str, i2);
    }
}
