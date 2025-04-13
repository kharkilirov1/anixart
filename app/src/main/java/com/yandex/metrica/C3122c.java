package com.yandex.metrica;

import android.app.job.JobParameters;
import com.yandex.metrica.impl.p023ob.InterfaceC3513O6;

/* renamed from: com.yandex.metrica.c */
/* loaded from: classes2.dex */
class C3122c implements InterfaceC3513O6 {

    /* renamed from: a */
    public final /* synthetic */ JobParameters f42428a;

    /* renamed from: b */
    public final /* synthetic */ ConfigurationJobService f42429b;

    public C3122c(ConfigurationJobService configurationJobService, JobParameters jobParameters) {
        this.f42429b = configurationJobService;
        this.f42428a = jobParameters;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3513O6
    /* renamed from: a */
    public void mo17790a() {
        try {
            this.f42429b.jobFinished(this.f42428a, false);
        } catch (Throwable unused) {
        }
    }
}
