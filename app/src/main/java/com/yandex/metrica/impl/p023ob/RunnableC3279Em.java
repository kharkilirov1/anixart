package com.yandex.metrica.impl.p023ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import com.yandex.metrica.MetricaService;

/* renamed from: com.yandex.metrica.impl.ob.Em */
/* loaded from: classes2.dex */
public final class RunnableC3279Em implements Runnable {

    /* renamed from: a */
    public final Context f42850a;

    public RunnableC3279Em(Context context) {
        this.f42850a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context = this.f42850a;
        try {
            PackageInfo packageInfo = null;
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 516);
            } catch (Throwable unused) {
            }
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                for (ServiceInfo serviceInfo : serviceInfoArr) {
                    if (MetricaService.class.getName().equals(serviceInfo.name) && !serviceInfo.enabled) {
                        try {
                            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) MetricaService.class), 1, 1);
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
        } catch (Throwable unused3) {
        }
    }
}
