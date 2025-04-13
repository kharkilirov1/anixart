package com.yandex.metrica.push.common.service;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.push.common.PushServiceFacade;
import com.yandex.metrica.push.common.utils.ConsumerWithThrowable;
import com.yandex.metrica.push.common.utils.CoreUtils;
import com.yandex.metrica.push.common.utils.TrackersHub;
import java.util.HashMap;

@RequiresApi
/* renamed from: com.yandex.metrica.push.common.service.a */
/* loaded from: classes2.dex */
class C4495a implements PushServiceCommandLauncher {

    /* renamed from: a */
    @NonNull
    private final Context f47239a;

    /* renamed from: b */
    @Nullable
    private final JobScheduler f47240b;

    /* renamed from: com.yandex.metrica.push.common.service.a$a */
    public class a implements ConsumerWithThrowable<JobScheduler> {

        /* renamed from: a */
        public final /* synthetic */ JobInfo f47241a;

        /* renamed from: b */
        public final /* synthetic */ Bundle f47242b;

        /* renamed from: com.yandex.metrica.push.common.service.a$a$a, reason: collision with other inner class name */
        public class C7009a extends HashMap<String, Object> {

            /* renamed from: a */
            public final /* synthetic */ int f47243a;

            public C7009a(int i2) {
                this.f47243a = i2;
                put("status", Integer.valueOf(i2));
                put("command", a.this.f47242b.getString(PushServiceFacade.EXTRA_COMMAND));
            }
        }

        public a(C4495a c4495a, JobInfo jobInfo, Bundle bundle) {
            this.f47241a = jobInfo;
            this.f47242b = bundle;
        }

        @Override // com.yandex.metrica.push.common.utils.ConsumerWithThrowable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void consume(@NonNull JobScheduler jobScheduler) throws Throwable {
            int schedule = jobScheduler.schedule(this.f47241a);
            if (schedule != 1) {
                TrackersHub.getInstance().reportEvent("Scheduling job failed", new C7009a(schedule));
            }
        }
    }

    public C4495a(@NonNull Context context) {
        this(context, (JobScheduler) context.getSystemService("jobscheduler"));
    }

    @Override // com.yandex.metrica.push.common.service.PushServiceCommandLauncher
    public void launchService(@NonNull Bundle bundle) {
        CoreUtils.accessSystemServiceSafely(new a(this, new JobInfo.Builder(2281488, new ComponentName(this.f47239a.getPackageName(), "com.yandex.metrica.push.service.PushJobService")).setTransientExtras(bundle).setOverrideDeadline(10L).build(), bundle), this.f47240b, "launching PushJobServiceController command", "JobScheduler");
    }

    @VisibleForTesting
    public C4495a(@NonNull Context context, @Nullable JobScheduler jobScheduler) {
        this.f47239a = context;
        this.f47240b = jobScheduler;
    }
}
