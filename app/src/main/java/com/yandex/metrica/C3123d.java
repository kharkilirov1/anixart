package com.yandex.metrica;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import com.yandex.metrica.impl.p023ob.C4271rn;
import com.yandex.metrica.impl.p023ob.InterfaceC3513O6;

/* renamed from: com.yandex.metrica.d */
/* loaded from: classes2.dex */
class C3123d implements InterfaceC3513O6 {

    /* renamed from: a */
    public final /* synthetic */ JobParameters f42430a;

    /* renamed from: b */
    public final /* synthetic */ JobWorkItem f42431b;

    /* renamed from: c */
    public final /* synthetic */ ConfigurationJobService f42432c;

    public C3123d(ConfigurationJobService configurationJobService, JobParameters jobParameters, JobWorkItem jobWorkItem) {
        this.f42432c = configurationJobService;
        this.f42430a = jobParameters;
        this.f42431b = jobWorkItem;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3513O6
    /* renamed from: a */
    public void mo17790a() {
        try {
            this.f42430a.completeWork(this.f42431b);
            ConfigurationJobService configurationJobService = this.f42432c;
            JobParameters jobParameters = this.f42430a;
            ((C4271rn) configurationJobService.f42229b.m18387a()).execute(new RunnableC3094b(configurationJobService, jobParameters));
        } catch (Throwable unused) {
        }
    }
}
