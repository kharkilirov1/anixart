package com.google.android.exoplayer2.scheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.util.Util;
import java.util.Objects;

@RequiresApi
/* loaded from: classes.dex */
public final class PlatformScheduler implements Scheduler {

    /* renamed from: a */
    public static final int f12214a;

    public static final class PlatformSchedulerService extends JobService {
        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            PersistableBundle extras = jobParameters.getExtras();
            int m6758a = new Requirements(extras.getInt("requirements")).m6758a(this);
            if (m6758a != 0) {
                C0576a.m4123v(33, "Requirements not met: ", m6758a, "PlatformScheduler");
                jobFinished(jobParameters, true);
                return false;
            }
            String string = extras.getString("service_action");
            Objects.requireNonNull(string);
            String string2 = extras.getString("service_package");
            Objects.requireNonNull(string2);
            Intent intent = new Intent(string).setPackage(string2);
            if (Util.f14736a >= 26) {
                startForegroundService(intent);
                return false;
            }
            startService(intent);
            return false;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    static {
        f12214a = (Util.f14736a >= 26 ? 16 : 0) | 15;
    }

    @Override // com.google.android.exoplayer2.scheduler.Scheduler
    public boolean cancel() {
        throw null;
    }
}
