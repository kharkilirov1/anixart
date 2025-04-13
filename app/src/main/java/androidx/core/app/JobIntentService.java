package androidx.core.app;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* loaded from: classes.dex */
public abstract class JobIntentService extends Service {

    /* renamed from: g */
    public static final HashMap<ComponentName, WorkEnqueuer> f3127g = new HashMap<>();

    /* renamed from: b */
    public CompatJobEngine f3128b;

    /* renamed from: c */
    public WorkEnqueuer f3129c;

    /* renamed from: d */
    public CommandProcessor f3130d;

    /* renamed from: e */
    public boolean f3131e = false;

    /* renamed from: f */
    public final ArrayList<CompatWorkItem> f3132f;

    public final class CommandProcessor extends AsyncTask<Void, Void, Void> {
        public CommandProcessor() {
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            CompatWorkItem remove;
            while (true) {
                JobIntentService jobIntentService = JobIntentService.this;
                CompatJobEngine compatJobEngine = jobIntentService.f3128b;
                if (compatJobEngine != null) {
                    remove = compatJobEngine.mo1583b();
                } else {
                    synchronized (jobIntentService.f3132f) {
                        remove = jobIntentService.f3132f.size() > 0 ? jobIntentService.f3132f.remove(0) : null;
                    }
                }
                if (remove == null) {
                    return null;
                }
                JobIntentService.this.m1580b(remove.getIntent());
                remove.mo1587b();
            }
        }

        @Override // android.os.AsyncTask
        public void onCancelled(Void r1) {
            JobIntentService.this.m1581c();
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r1) {
            JobIntentService.this.m1581c();
        }
    }

    public interface CompatJobEngine {
        /* renamed from: a */
        IBinder mo1582a();

        /* renamed from: b */
        GenericWorkItem mo1583b();
    }

    public static final class CompatWorkEnqueuer extends WorkEnqueuer {

        /* renamed from: a */
        public final PowerManager.WakeLock f3134a;

        /* renamed from: b */
        public final PowerManager.WakeLock f3135b;

        /* renamed from: c */
        public boolean f3136c;

        public CompatWorkEnqueuer(Context context, ComponentName componentName) {
            super(componentName);
            context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f3134a = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f3135b = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        /* renamed from: a */
        public void mo1584a() {
            synchronized (this) {
                if (this.f3136c) {
                    this.f3136c = false;
                    this.f3135b.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        /* renamed from: b */
        public void mo1585b() {
            synchronized (this) {
                if (!this.f3136c) {
                    this.f3136c = true;
                    this.f3135b.acquire(600000L);
                    this.f3134a.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        /* renamed from: c */
        public void mo1586c() {
            synchronized (this) {
            }
        }
    }

    public final class CompatWorkItem implements GenericWorkItem {

        /* renamed from: a */
        public final Intent f3137a;

        /* renamed from: b */
        public final int f3138b;

        public CompatWorkItem(Intent intent, int i2) {
            this.f3137a = intent;
            this.f3138b = i2;
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        /* renamed from: b */
        public void mo1587b() {
            JobIntentService.this.stopSelf(this.f3138b);
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public Intent getIntent() {
            return this.f3137a;
        }
    }

    public interface GenericWorkItem {
        /* renamed from: b */
        void mo1587b();

        Intent getIntent();
    }

    @RequiresApi
    public static final class JobServiceEngineImpl extends JobServiceEngine implements CompatJobEngine {

        /* renamed from: a */
        public final JobIntentService f3140a;

        /* renamed from: b */
        public final Object f3141b;

        /* renamed from: c */
        public JobParameters f3142c;

        public final class WrapperWorkItem implements GenericWorkItem {

            /* renamed from: a */
            public final JobWorkItem f3143a;

            public WrapperWorkItem(JobWorkItem jobWorkItem) {
                this.f3143a = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.GenericWorkItem
            /* renamed from: b */
            public void mo1587b() {
                synchronized (JobServiceEngineImpl.this.f3141b) {
                    JobParameters jobParameters = JobServiceEngineImpl.this.f3142c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f3143a);
                    }
                }
            }

            @Override // androidx.core.app.JobIntentService.GenericWorkItem
            public Intent getIntent() {
                return this.f3143a.getIntent();
            }
        }

        public JobServiceEngineImpl(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f3141b = new Object();
            this.f3140a = jobIntentService;
        }

        @Override // androidx.core.app.JobIntentService.CompatJobEngine
        /* renamed from: a */
        public IBinder mo1582a() {
            return getBinder();
        }

        @Override // androidx.core.app.JobIntentService.CompatJobEngine
        /* renamed from: b */
        public GenericWorkItem mo1583b() {
            synchronized (this.f3141b) {
                JobParameters jobParameters = this.f3142c;
                if (jobParameters == null) {
                    return null;
                }
                JobWorkItem dequeueWork = jobParameters.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                dequeueWork.getIntent().setExtrasClassLoader(this.f3140a.getClassLoader());
                return new WrapperWorkItem(dequeueWork);
            }
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.f3142c = jobParameters;
            this.f3140a.m1579a(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            CommandProcessor commandProcessor = this.f3140a.f3130d;
            if (commandProcessor != null) {
                commandProcessor.cancel(false);
            }
            synchronized (this.f3141b) {
                this.f3142c = null;
            }
            return true;
        }
    }

    @RequiresApi
    public static final class JobWorkEnqueuer extends WorkEnqueuer {
    }

    public static abstract class WorkEnqueuer {
        public WorkEnqueuer(ComponentName componentName) {
        }

        /* renamed from: a */
        public void mo1584a() {
        }

        /* renamed from: b */
        public void mo1585b() {
        }

        /* renamed from: c */
        public void mo1586c() {
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3132f = null;
        } else {
            this.f3132f = new ArrayList<>();
        }
    }

    /* renamed from: a */
    public void m1579a(boolean z) {
        if (this.f3130d == null) {
            this.f3130d = new CommandProcessor();
            WorkEnqueuer workEnqueuer = this.f3129c;
            if (workEnqueuer != null && z) {
                workEnqueuer.mo1585b();
            }
            this.f3130d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: b */
    public abstract void m1580b(@NonNull Intent intent);

    /* renamed from: c */
    public void m1581c() {
        ArrayList<CompatWorkItem> arrayList = this.f3132f;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f3130d = null;
                ArrayList<CompatWorkItem> arrayList2 = this.f3132f;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    m1579a(false);
                } else if (!this.f3131e) {
                    this.f3129c.mo1584a();
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(@NonNull Intent intent) {
        CompatJobEngine compatJobEngine = this.f3128b;
        if (compatJobEngine != null) {
            return compatJobEngine.mo1582a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f3128b = new JobServiceEngineImpl(this);
            this.f3129c = null;
            return;
        }
        this.f3128b = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap<ComponentName, WorkEnqueuer> hashMap = f3127g;
        WorkEnqueuer workEnqueuer = hashMap.get(componentName);
        if (workEnqueuer == null) {
            if (i2 >= 26) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            workEnqueuer = new CompatWorkEnqueuer(this, componentName);
            hashMap.put(componentName, workEnqueuer);
        }
        this.f3129c = workEnqueuer;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<CompatWorkItem> arrayList = this.f3132f;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f3131e = true;
                this.f3129c.mo1584a();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i2, int i3) {
        if (this.f3132f == null) {
            return 2;
        }
        this.f3129c.mo1586c();
        synchronized (this.f3132f) {
            ArrayList<CompatWorkItem> arrayList = this.f3132f;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new CompatWorkItem(intent, i3));
            m1579a(true);
        }
        return 3;
    }
}
