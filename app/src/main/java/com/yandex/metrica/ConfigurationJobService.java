package com.yandex.metrica;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.AbstractC3538P6;
import com.yandex.metrica.impl.p023ob.C3238D6;
import com.yandex.metrica.impl.p023ob.C3388J6;
import com.yandex.metrica.impl.p023ob.C3488N6;
import com.yandex.metrica.impl.p023ob.C3532P0;
import com.yandex.metrica.impl.p023ob.C3563Q6;
import com.yandex.metrica.impl.p023ob.C3587R6;
import com.yandex.metrica.impl.p023ob.C4271rn;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@TargetApi
/* loaded from: classes2.dex */
public class ConfigurationJobService extends JobService {

    /* renamed from: e */
    public static final /* synthetic */ int f42228e = 0;

    /* renamed from: b */
    public C3388J6 f42229b;

    /* renamed from: c */
    @NonNull
    public SparseArray<AbstractC3538P6> f42230c = new SparseArray<>();

    /* renamed from: d */
    @NonNull
    public Map<String, AbstractC3538P6> f42231d = new HashMap();

    public boolean complexJob(int i2) {
        return i2 == 1512302347;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C3532P0.m18695a(getApplicationContext());
        Context applicationContext = getApplicationContext();
        String.format(Locale.US, "[ConfigurationJobService:%s]", applicationContext.getPackageName());
        this.f42229b = new C3388J6();
        C3488N6 c3488n6 = new C3488N6(getApplicationContext(), this.f42229b.m18387a(), new C3238D6(applicationContext));
        this.f42230c.append(1512302345, new C3563Q6(getApplicationContext(), c3488n6));
        this.f42230c.append(1512302346, new C3587R6(getApplicationContext(), c3488n6));
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@Nullable JobParameters jobParameters) {
        if (jobParameters == null) {
            return false;
        }
        try {
            try {
                if (complexJob(jobParameters.getJobId())) {
                    ((C4271rn) this.f42229b.m18387a()).execute(new RunnableC3094b(this, jobParameters));
                } else {
                    AbstractC3538P6 abstractC3538P6 = this.f42230c.get(jobParameters.getJobId());
                    if (abstractC3538P6 == null) {
                        return false;
                    }
                    this.f42229b.m18389a(abstractC3538P6, jobParameters.getTransientExtras(), new C3122c(this, jobParameters));
                }
                return true;
            } catch (Throwable unused) {
                jobFinished(jobParameters, false);
                return false;
            }
        } catch (Throwable unused2) {
            return false;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@Nullable JobParameters jobParameters) {
        return jobParameters != null && complexJob(jobParameters.getJobId());
    }
}
