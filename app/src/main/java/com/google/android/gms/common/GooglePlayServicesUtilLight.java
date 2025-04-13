package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.UserManager;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public class GooglePlayServicesUtilLight {

    /* renamed from: b */
    public static boolean f15333b = false;

    /* renamed from: c */
    @VisibleForTesting
    public static boolean f15334c = false;

    /* renamed from: a */
    @VisibleForTesting
    @KeepForSdk
    public static final AtomicBoolean f15332a = new AtomicBoolean();

    /* renamed from: d */
    public static final AtomicBoolean f15335d = new AtomicBoolean();

    @KeepForSdk
    public GooglePlayServicesUtilLight() {
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    /* renamed from: a */
    public static boolean m7926a(@NonNull Context context, int i2) {
        if (i2 == 18) {
            return true;
        }
        if (i2 == 1) {
            return m7927b(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi
    /* renamed from: b */
    public static boolean m7927b(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            applicationInfo = context.getPackageManager().getApplicationInfo(str, RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        if (equals) {
            return applicationInfo.enabled;
        }
        if (applicationInfo.enabled) {
            Object systemService = context.getSystemService("user");
            Objects.requireNonNull(systemService, "null reference");
            Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
            if (!(applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile")))) {
                return true;
            }
        }
        return false;
    }
}
