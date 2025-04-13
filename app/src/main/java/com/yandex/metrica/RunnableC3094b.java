package com.yandex.metrica;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;
import com.yandex.metrica.impl.p023ob.AbstractC3538P6;
import java.util.Objects;

/* renamed from: com.yandex.metrica.b */
/* loaded from: classes2.dex */
class RunnableC3094b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ JobParameters f42308b;

    /* renamed from: c */
    public final /* synthetic */ ConfigurationJobService f42309c;

    public RunnableC3094b(ConfigurationJobService configurationJobService, JobParameters jobParameters) {
        this.f42309c = configurationJobService;
        this.f42308b = jobParameters;
    }

    @Override // java.lang.Runnable
    public void run() {
        ConfigurationJobService configurationJobService = this.f42309c;
        JobParameters jobParameters = this.f42308b;
        int i2 = ConfigurationJobService.f42228e;
        Objects.requireNonNull(configurationJobService);
        while (true) {
            try {
                JobWorkItem dequeueWork = jobParameters.dequeueWork();
                if (dequeueWork == null) {
                    return;
                }
                Intent intent = dequeueWork.getIntent();
                if (intent != null) {
                    AbstractC3538P6 abstractC3538P6 = configurationJobService.f42231d.get(intent.getAction());
                    if (abstractC3538P6 != null) {
                        configurationJobService.f42229b.m18389a(abstractC3538P6, intent.getExtras(), new C3123d(configurationJobService, jobParameters, dequeueWork));
                    } else {
                        jobParameters.completeWork(dequeueWork);
                    }
                } else {
                    jobParameters.completeWork(dequeueWork);
                }
            } catch (Throwable unused) {
                configurationJobService.jobFinished(jobParameters, true);
                return;
            }
        }
    }
}
