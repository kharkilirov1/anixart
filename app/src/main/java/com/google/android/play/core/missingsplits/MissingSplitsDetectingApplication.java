package com.google.android.play.core.missingsplits;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.play:core@@1.10.2 */
@Deprecated
/* loaded from: classes.dex */
public class MissingSplitsDetectingApplication extends Application {

    /* renamed from: b */
    public boolean f20168b = false;

    @Override // android.app.Application
    public final void onCreate() {
        boolean booleanValue;
        boolean z;
        Intent intent;
        Class<?> cls;
        boolean z2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Set emptySet;
        String[] strArr;
        if (this.f20168b) {
            throw new IllegalStateException("The onCreate method must be invoked at most once.");
        }
        boolean z3 = true;
        this.f20168b = true;
        AtomicReference<Boolean> atomicReference = MissingSplitsManagerFactory.f20169a;
        Runtime runtime = Runtime.getRuntime();
        zza zzaVar = new zza(this, getPackageManager());
        AtomicReference<Boolean> atomicReference2 = MissingSplitsManagerFactory.f20169a;
        zzb zzbVar = new zzb(this, runtime, zzaVar, atomicReference2);
        synchronized (atomicReference2) {
            if (atomicReference2.get() == null) {
                try {
                    applicationInfo = getPackageManager().getApplicationInfo(getPackageName(), 128);
                } catch (PackageManager.NameNotFoundException unused) {
                    zzb.f20173e.m10838e("App '%s' is not found in the PackageManager", zzbVar.f20174a.getPackageName());
                }
                if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                    if (Boolean.TRUE.equals(bundle.get("com.android.vending.splits.required"))) {
                        try {
                            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
                            emptySet = new HashSet();
                            if (packageInfo != null && (strArr = packageInfo.splitNames) != null) {
                                Collections.addAll(emptySet, strArr);
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                            zzb.f20173e.m10838e("App '%s' is not found in PackageManager", zzbVar.f20174a.getPackageName());
                            emptySet = Collections.emptySet();
                        }
                        if (emptySet.isEmpty() || (emptySet.size() == 1 && emptySet.contains(""))) {
                            z2 = true;
                            atomicReference2.set(Boolean.valueOf(z2));
                        }
                    }
                }
                z2 = false;
                atomicReference2.set(Boolean.valueOf(z2));
            }
            booleanValue = zzbVar.f20177d.get().booleanValue();
        }
        if (booleanValue) {
            Iterator<ActivityManager.AppTask> it = zzbVar.m10932a().iterator();
            while (true) {
                if (it.hasNext()) {
                    ActivityManager.AppTask next = it.next();
                    if (next.getTaskInfo() != null && next.getTaskInfo().baseIntent != null && next.getTaskInfo().baseIntent.getComponent() != null && PlayCoreMissingSplitsActivity.class.getName().equals(next.getTaskInfo().baseIntent.getComponent().getClassName())) {
                        break;
                    }
                } else {
                    Iterator<ActivityManager.AppTask> it2 = zzbVar.m10932a().iterator();
                    loop1: while (it2.hasNext()) {
                        ActivityManager.RecentTaskInfo taskInfo = it2.next().getTaskInfo();
                        if (taskInfo != null && (intent = taskInfo.baseIntent) != null && intent.getComponent() != null) {
                            ComponentName component = taskInfo.baseIntent.getComponent();
                            String className = component.getClassName();
                            try {
                                cls = Class.forName(className);
                            } catch (ClassNotFoundException unused3) {
                                zzb.f20173e.m10838e("ClassNotFoundException when scanning class hierarchy of '%s'", className);
                                try {
                                    if (zzbVar.f20174a.getPackageManager().getActivityInfo(component, 0) != null) {
                                    }
                                } catch (PackageManager.NameNotFoundException unused4) {
                                }
                            }
                            while (cls != null) {
                                if (cls.equals(Activity.class)) {
                                    z = true;
                                    break;
                                } else {
                                    Class<? super Object> superclass = cls.getSuperclass();
                                    cls = superclass != cls ? superclass : null;
                                }
                            }
                        }
                    }
                    z = false;
                    zza zzaVar2 = zzbVar.f20176c;
                    Objects.requireNonNull(zzaVar2);
                    zza.f20170c.m10837d("Disabling all non-activity components", new Object[0]);
                    zzaVar2.m10931b(zzaVar2.m10930a(), 2);
                    Iterator<ActivityManager.AppTask> it3 = zzbVar.m10932a().iterator();
                    while (it3.hasNext()) {
                        it3.next().finishAndRemoveTask();
                    }
                    if (z) {
                        zzbVar.f20174a.getPackageManager().setComponentEnabledSetting(new ComponentName(zzbVar.f20174a, (Class<?>) PlayCoreMissingSplitsActivity.class), 1, 1);
                        zzbVar.f20174a.startActivity(new Intent(zzbVar.f20174a, (Class<?>) PlayCoreMissingSplitsActivity.class).addFlags(884998144));
                    }
                    zzbVar.f20175b.exit(0);
                }
            }
        } else {
            zza zzaVar3 = zzbVar.f20176c;
            Iterator<ComponentInfo> it4 = zzaVar3.m10930a().iterator();
            while (true) {
                if (!it4.hasNext()) {
                    zza.f20170c.m10834a("All non-activity components are disabled", new Object[0]);
                    break;
                }
                ComponentInfo next2 = it4.next();
                if (zzaVar3.f20172b.getComponentEnabledSetting(new ComponentName(next2.packageName, next2.name)) != 2) {
                    zza.f20170c.m10834a("Not all non-activity components are disabled", new Object[0]);
                    z3 = false;
                    break;
                }
            }
            if (z3) {
                zza zzaVar4 = zzbVar.f20176c;
                Objects.requireNonNull(zzaVar4);
                zza.f20170c.m10837d("Resetting enabled state of all non-activity components", new Object[0]);
                zzaVar4.m10931b(zzaVar4.m10930a(), 0);
                zzbVar.f20175b.exit(0);
            }
            z3 = false;
        }
        if (z3) {
            return;
        }
        super.onCreate();
    }
}
