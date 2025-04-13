package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class DeviceProperties {

    /* renamed from: a */
    @Nullable
    public static Boolean f15895a;

    /* renamed from: b */
    @Nullable
    public static Boolean f15896b;

    /* renamed from: c */
    @Nullable
    public static Boolean f15897c;

    /* renamed from: d */
    @Nullable
    public static Boolean f15898d;

    @KeepForSdk
    @TargetApi
    /* renamed from: a */
    public static boolean m8239a(@NonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f15895a == null) {
            f15895a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f15895a.booleanValue();
    }

    @KeepForSdk
    @TargetApi
    /* renamed from: b */
    public static boolean m8240b(@NonNull Context context) {
        if (!m8239a(context)) {
            return false;
        }
        if (!(Build.VERSION.SDK_INT >= 24)) {
            return true;
        }
        if (f15896b == null) {
            f15896b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f15896b.booleanValue() && !PlatformVersion.m8244a();
    }
}
