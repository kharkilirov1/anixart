package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

@RequiresApi
/* loaded from: classes.dex */
public class JobInfoScheduler implements WorkScheduler {

    /* renamed from: a */
    public final Context f9279a;

    /* renamed from: b */
    public final EventStore f9280b;

    /* renamed from: c */
    public final SchedulerConfig f9281c;

    public JobInfoScheduler(Context context, EventStore eventStore, SchedulerConfig schedulerConfig) {
        this.f9279a = context;
        this.f9280b = eventStore;
        this.f9281c = schedulerConfig;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    /* renamed from: a */
    public void mo5550a(TransportContext transportContext, int i2) {
        mo5551b(transportContext, i2, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    /* renamed from: b */
    public void mo5551b(TransportContext transportContext, int i2, boolean z) {
        boolean z2;
        ComponentName componentName = new ComponentName(this.f9279a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f9279a.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(this.f9279a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(transportContext.mo5504b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(PriorityMapping.m5603a(transportContext.mo5506d())).array());
        if (transportContext.mo5505c() != null) {
            adler32.update(transportContext.mo5505c());
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i3 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i3 >= i2) {
                        z2 = true;
                    }
                }
            }
            z2 = false;
            if (z2) {
                Logging.m5544a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", transportContext);
                return;
            }
        }
        long mo5584U0 = this.f9280b.mo5584U0(transportContext);
        SchedulerConfig schedulerConfig = this.f9281c;
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        Priority mo5506d = transportContext.mo5506d();
        builder.setMinimumLatency(schedulerConfig.m5562c(mo5506d, mo5584U0, i2));
        Set<SchedulerConfig.Flag> mo5555c = schedulerConfig.mo5553d().get(mo5506d).mo5555c();
        if (mo5555c.contains(SchedulerConfig.Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (mo5555c.contains(SchedulerConfig.Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (mo5555c.contains(SchedulerConfig.Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i2);
        persistableBundle.putString("backendName", transportContext.mo5504b());
        persistableBundle.putInt("priority", PriorityMapping.m5603a(transportContext.mo5506d()));
        if (transportContext.mo5505c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(transportContext.mo5505c(), 0));
        }
        builder.setExtras(persistableBundle);
        Logging.m5545b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", transportContext, Integer.valueOf(value), Long.valueOf(this.f9281c.m5562c(transportContext.mo5506d(), mo5584U0, i2)), Long.valueOf(mo5584U0), Integer.valueOf(i2));
        jobScheduler.schedule(builder.build());
    }
}
