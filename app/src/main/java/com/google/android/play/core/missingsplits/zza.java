package com.google.android.play.core.missingsplits;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import com.google.android.play.core.internal.zzag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zza {

    /* renamed from: c */
    public static final zzag f20170c = new zzag("MissingSplitsAppComponentsHelper");

    /* renamed from: a */
    public final Context f20171a;

    /* renamed from: b */
    public final PackageManager f20172b;

    public zza(Context context, PackageManager packageManager) {
        this.f20171a = context;
        this.f20172b = packageManager;
    }

    /* renamed from: a */
    public final List<ComponentInfo> m10930a() {
        try {
            ArrayList arrayList = new ArrayList();
            PackageInfo packageInfo = this.f20172b.getPackageInfo(this.f20171a.getPackageName(), 526);
            ProviderInfo[] providerInfoArr = packageInfo.providers;
            if (providerInfoArr != null) {
                Collections.addAll(arrayList, providerInfoArr);
            }
            ActivityInfo[] activityInfoArr = packageInfo.receivers;
            if (activityInfoArr != null) {
                Collections.addAll(arrayList, activityInfoArr);
            }
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                Collections.addAll(arrayList, serviceInfoArr);
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e2) {
            f20170c.m10838e("Failed to resolve own package : %s", e2);
            return Collections.emptyList();
        }
    }

    /* renamed from: b */
    public final void m10931b(List<ComponentInfo> list, int i2) {
        for (ComponentInfo componentInfo : list) {
            this.f20172b.setComponentEnabledSetting(new ComponentName(componentInfo.packageName, componentInfo.name), i2, 1);
        }
    }
}
