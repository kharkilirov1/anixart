package com.yandex.metrica.push.service;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.common.PushServiceFacade;
import com.yandex.metrica.push.common.utils.PublicLogger;
import com.yandex.metrica.push.common.utils.TrackersHub;
import com.yandex.metrica.push.impl.C4530J0;
import com.yandex.metrica.push.impl.C4609x0;
import com.yandex.metrica.push.impl.InterfaceC4607w0;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@TargetApi
/* loaded from: classes2.dex */
public class PushJobService extends JobService {

    /* renamed from: a */
    @NonNull
    private final C4609x0 f47589a = new C4609x0();

    /* renamed from: b */
    @NonNull
    private final Executor f47590b = Executors.newSingleThreadExecutor();

    /* renamed from: com.yandex.metrica.push.service.PushJobService$a */
    public class RunnableC4614a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC4607w0 f47591a;

        /* renamed from: b */
        public final /* synthetic */ Bundle f47592b;

        /* renamed from: c */
        public final /* synthetic */ JobParameters f47593c;

        public RunnableC4614a(InterfaceC4607w0 interfaceC4607w0, Bundle bundle, JobParameters jobParameters) {
            this.f47591a = interfaceC4607w0;
            this.f47592b = bundle;
            this.f47593c = jobParameters;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f47591a.mo21417a(PushJobService.this, this.f47592b);
            PushJobService.this.jobFinished(this.f47593c, false);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@Nullable JobParameters jobParameters) {
        if (jobParameters == null) {
            return false;
        }
        try {
            Bundle transientExtras = jobParameters.getTransientExtras();
            String string = transientExtras.getString(PushServiceFacade.EXTRA_COMMAND);
            C4616a.m21746a(string, transientExtras.getLong(PushServiceFacade.EXTRA_COMMAND_RECEIVED_TIME, -1L), C4530J0.m21445a(transientExtras), "PushJobService");
            InterfaceC4607w0 m21745a = this.f47589a.m21745a(string);
            if (m21745a == null) {
                return false;
            }
            this.f47590b.execute(new RunnableC4614a(m21745a, transientExtras, jobParameters));
            return true;
        } catch (Throwable th) {
            TrackersHub.getInstance().reportError("Failed to handle command ", th);
            PublicLogger.m21384e(th, "An unexpected error occurred while running the AppMetreica Push SDK. You can report it via https://appmetrica.yandex.com/docs/troubleshooting/other.html", new Object[0]);
            return false;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
