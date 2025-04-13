package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.motion.widget.RunnableC0207a;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.util.PriorityMapping;

@RequiresApi
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: b */
    public static final /* synthetic */ int f9282b = 0;

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i2 = jobParameters.getExtras().getInt("priority");
        int i3 = jobParameters.getExtras().getInt("attemptNumber");
        TransportRuntime.m5522c(getApplicationContext());
        TransportContext.Builder m5519a = TransportContext.m5519a();
        m5519a.mo5508b(string);
        m5519a.mo5510d(PriorityMapping.m5604b(i2));
        if (string2 != null) {
            m5519a.mo5509c(Base64.decode(string2, 0));
        }
        TransportRuntime.m5521b().f9169d.m5565b(m5519a.mo5507a(), i3, new RunnableC0207a(this, jobParameters, 6));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
