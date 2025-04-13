package com.yandex.metrica.impl.p023ob;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.ConfigurationJobService;

@TargetApi
/* renamed from: com.yandex.metrica.impl.ob.D6 */
/* loaded from: classes2.dex */
public class C3238D6 implements InterfaceC3338H6, InterfaceC3263E6 {

    /* renamed from: a */
    @NonNull
    private final Context f42699a;

    /* renamed from: b */
    @Nullable
    private final JobScheduler f42700b;

    public C3238D6(@NonNull Context context) {
        this(context, (JobScheduler) context.getSystemService("jobscheduler"));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3338H6
    /* renamed from: a */
    public void mo17952a(long j2, boolean z) {
        JobInfo.Builder minimumLatency = new JobInfo.Builder(1512302345, new ComponentName(this.f42699a.getPackageName(), ConfigurationJobService.class.getName())).setMinimumLatency(j2);
        if (z) {
            minimumLatency.setOverrideDeadline(j2);
        }
        JobScheduler jobScheduler = this.f42700b;
        if (jobScheduler != null) {
            try {
                jobScheduler.schedule(minimumLatency.build());
            } catch (Throwable unused) {
            }
        }
    }

    @VisibleForTesting
    public C3238D6(@NonNull Context context, @Nullable JobScheduler jobScheduler) {
        this.f42699a = context;
        this.f42700b = jobScheduler;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3338H6
    /* renamed from: a */
    public void mo17951a() {
        JobScheduler jobScheduler = this.f42700b;
        if (jobScheduler != null) {
            try {
                jobScheduler.cancel(1512302345);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3263E6
    /* renamed from: a */
    public void mo17953a(@NonNull Bundle bundle) {
        JobInfo build = new JobInfo.Builder(1512302346, new ComponentName(this.f42699a.getPackageName(), ConfigurationJobService.class.getName())).setTransientExtras(bundle).setOverrideDeadline(10L).build();
        JobScheduler jobScheduler = this.f42700b;
        if (jobScheduler != null) {
            try {
                jobScheduler.schedule(build);
            } catch (Throwable unused) {
            }
        }
    }
}
