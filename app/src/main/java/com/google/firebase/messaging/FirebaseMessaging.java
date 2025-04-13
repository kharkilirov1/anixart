package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.internal.DataCollectionConfigStorage;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Store;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class FirebaseMessaging {

    /* renamed from: n */
    public static final long f23264n = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: o */
    @GuardedBy
    public static Store f23265o;

    /* renamed from: p */
    @Nullable
    @SuppressLint
    @VisibleForTesting
    public static TransportFactory f23266p;

    /* renamed from: q */
    @GuardedBy
    @VisibleForTesting
    public static ScheduledExecutorService f23267q;

    /* renamed from: a */
    public final FirebaseApp f23268a;

    /* renamed from: b */
    @Nullable
    public final FirebaseInstanceIdInternal f23269b;

    /* renamed from: c */
    public final FirebaseInstallationsApi f23270c;

    /* renamed from: d */
    public final Context f23271d;

    /* renamed from: e */
    public final GmsRpc f23272e;

    /* renamed from: f */
    public final RequestDeduplicator f23273f;

    /* renamed from: g */
    public final AutoInit f23274g;

    /* renamed from: h */
    public final Executor f23275h;

    /* renamed from: i */
    public final Executor f23276i;

    /* renamed from: j */
    public final Executor f23277j;

    /* renamed from: k */
    public final Task<TopicsSubscriber> f23278k;

    /* renamed from: l */
    public final Metadata f23279l;

    /* renamed from: m */
    @GuardedBy
    public boolean f23280m;

    public class AutoInit {

        /* renamed from: a */
        public final Subscriber f23281a;

        /* renamed from: b */
        @GuardedBy
        public boolean f23282b;

        /* renamed from: c */
        @Nullable
        @GuardedBy
        public EventHandler<DataCollectionDefaultChange> f23283c;

        /* renamed from: d */
        @Nullable
        @GuardedBy
        public Boolean f23284d;

        public AutoInit(Subscriber subscriber) {
            this.f23281a = subscriber;
        }

        /* renamed from: a */
        public synchronized void m12654a() {
            if (this.f23282b) {
                return;
            }
            Boolean m12656c = m12656c();
            this.f23284d = m12656c;
            if (m12656c == null) {
                EventHandler<DataCollectionDefaultChange> eventHandler = new EventHandler() { // from class: com.google.firebase.messaging.i
                    @Override // com.google.firebase.events.EventHandler
                    /* renamed from: a */
                    public final void mo12387a(Event event) {
                        FirebaseMessaging.AutoInit autoInit = FirebaseMessaging.AutoInit.this;
                        if (autoInit.m12655b()) {
                            FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
                            Store store = FirebaseMessaging.f23265o;
                            firebaseMessaging.m12651h();
                        }
                    }
                };
                this.f23283c = eventHandler;
                this.f23281a.mo12350a(DataCollectionDefaultChange.class, eventHandler);
            }
            this.f23282b = true;
        }

        /* renamed from: b */
        public synchronized boolean m12655b() {
            boolean z;
            boolean z2;
            m12654a();
            Boolean bool = this.f23284d;
            if (bool != null) {
                z2 = bool.booleanValue();
            } else {
                FirebaseApp firebaseApp = FirebaseMessaging.this.f23268a;
                firebaseApp.m12217a();
                DataCollectionConfigStorage dataCollectionConfigStorage = firebaseApp.f22265g.get();
                synchronized (dataCollectionConfigStorage) {
                    z = dataCollectionConfigStorage.f23225d;
                }
                z2 = z;
            }
            return z2;
        }

        @Nullable
        /* renamed from: c */
        public final Boolean m12656c() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            FirebaseApp firebaseApp = FirebaseMessaging.this.f23268a;
            firebaseApp.m12217a();
            Context context = firebaseApp.f22259a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, @Nullable FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi, @Nullable TransportFactory transportFactory, Subscriber subscriber) {
        firebaseApp.m12217a();
        final Metadata metadata = new Metadata(firebaseApp.f22259a);
        final GmsRpc gmsRpc = new GmsRpc(firebaseApp, metadata, provider, provider2, firebaseInstallationsApi);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        final int i2 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        final int i3 = 0;
        this.f23280m = false;
        f23266p = transportFactory;
        this.f23268a = firebaseApp;
        this.f23269b = firebaseInstanceIdInternal;
        this.f23270c = firebaseInstallationsApi;
        this.f23274g = new AutoInit(subscriber);
        firebaseApp.m12217a();
        final Context context = firebaseApp.f22259a;
        this.f23271d = context;
        FcmLifecycleCallbacks fcmLifecycleCallbacks = new FcmLifecycleCallbacks();
        this.f23279l = metadata;
        this.f23276i = newSingleThreadExecutor;
        this.f23272e = gmsRpc;
        this.f23273f = new RequestDeduplicator(newSingleThreadExecutor);
        this.f23275h = scheduledThreadPoolExecutor;
        this.f23277j = threadPoolExecutor;
        firebaseApp.m12217a();
        Context context2 = firebaseApp.f22259a;
        if (context2 instanceof Application) {
            ((Application) context2).registerActivityLifecycleCallbacks(fcmLifecycleCallbacks);
        } else {
            Log.w("FirebaseMessaging", "Context " + context2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.mo12539b(new FirebaseInstanceIdInternal.NewTokenListener() { // from class: com.google.firebase.messaging.f
                @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener
                /* renamed from: a */
                public final void mo12553a(String str) {
                    FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
                    Store store = FirebaseMessaging.f23265o;
                    firebaseMessaging.m12649f(str);
                }
            });
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.h

            /* renamed from: c */
            public final /* synthetic */ FirebaseMessaging f23388c;

            {
                this.f23388c = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r7 = this;
                    int r0 = r2
                    switch(r0) {
                        case 0: goto L6;
                        default: goto L5;
                    }
                L5:
                    goto L14
                L6:
                    com.google.firebase.messaging.FirebaseMessaging r0 = r7.f23388c
                    com.google.firebase.messaging.FirebaseMessaging$AutoInit r1 = r0.f23274g
                    boolean r1 = r1.m12655b()
                    if (r1 == 0) goto L13
                    r0.m12651h()
                L13:
                    return
                L14:
                    com.google.firebase.messaging.FirebaseMessaging r0 = r7.f23388c
                    android.content.Context r0 = r0.f23271d
                    android.content.Context r1 = r0.getApplicationContext()
                    if (r1 != 0) goto L1f
                    r1 = r0
                L1f:
                    r2 = 0
                    java.lang.String r3 = "com.google.firebase.messaging"
                    android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r2)
                    java.lang.String r3 = "proxy_notification_initialized"
                    boolean r1 = r1.getBoolean(r3, r2)
                    if (r1 == 0) goto L2f
                    goto L75
                L2f:
                    java.lang.String r1 = "firebase_messaging_notification_delegation_enabled"
                    r3 = 1
                    android.content.Context r4 = r0.getApplicationContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L59
                    android.content.pm.PackageManager r5 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L59
                    if (r5 == 0) goto L59
                    java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L59
                    r6 = 128(0x80, float:1.8E-43)
                    android.content.pm.ApplicationInfo r4 = r5.getApplicationInfo(r4, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L59
                    if (r4 == 0) goto L59
                    android.os.Bundle r5 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L59
                    if (r5 == 0) goto L59
                    boolean r5 = r5.containsKey(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L59
                    if (r5 == 0) goto L59
                    android.os.Bundle r4 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L59
                    boolean r1 = r4.getBoolean(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L59
                    goto L5a
                L59:
                    r1 = 1
                L5a:
                    int r4 = android.os.Build.VERSION.SDK_INT
                    r5 = 29
                    if (r4 < r5) goto L61
                    r2 = 1
                L61:
                    if (r2 != 0) goto L68
                    r0 = 0
                    com.google.android.gms.tasks.Tasks.m9723e(r0)
                    goto L75
                L68:
                    com.google.android.gms.tasks.TaskCompletionSource r2 = new com.google.android.gms.tasks.TaskCompletionSource
                    r2.<init>()
                    com.google.firebase.messaging.j r3 = new com.google.firebase.messaging.j
                    r3.<init>()
                    r3.run()
                L75:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.RunnableC2164h.run():void");
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i4 = TopicsSubscriber.f23334j;
        Task<TopicsSubscriber> m9721c = Tasks.m9721c(scheduledThreadPoolExecutor2, new Callable() { // from class: com.google.firebase.messaging.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                TopicsStore topicsStore;
                Context context3 = context;
                ScheduledExecutorService scheduledExecutorService = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                Metadata metadata2 = metadata;
                GmsRpc gmsRpc2 = gmsRpc;
                int i5 = TopicsSubscriber.f23334j;
                synchronized (TopicsStore.class) {
                    WeakReference<TopicsStore> weakReference = TopicsStore.f23329d;
                    topicsStore = weakReference != null ? weakReference.get() : null;
                    if (topicsStore == null) {
                        SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                        TopicsStore topicsStore2 = new TopicsStore(sharedPreferences, scheduledExecutorService);
                        synchronized (topicsStore2) {
                            topicsStore2.f23331b = SharedPreferencesQueue.m12683b(sharedPreferences, "topic_operation_queue", ",", scheduledExecutorService);
                        }
                        TopicsStore.f23329d = new WeakReference<>(topicsStore2);
                        topicsStore = topicsStore2;
                    }
                }
                return new TopicsSubscriber(firebaseMessaging, metadata2, topicsStore, gmsRpc2, context3, scheduledExecutorService);
            }
        });
        this.f23278k = m9721c;
        m9721c.mo9702g(scheduledThreadPoolExecutor, new C2161e(this));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.h

            /* renamed from: c */
            public final /* synthetic */ FirebaseMessaging f23388c;

            {
                this.f23388c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                /*
                    this = this;
                    int r0 = r2
                    switch(r0) {
                        case 0: goto L6;
                        default: goto L5;
                    }
                L5:
                    goto L14
                L6:
                    com.google.firebase.messaging.FirebaseMessaging r0 = r7.f23388c
                    com.google.firebase.messaging.FirebaseMessaging$AutoInit r1 = r0.f23274g
                    boolean r1 = r1.m12655b()
                    if (r1 == 0) goto L13
                    r0.m12651h()
                L13:
                    return
                L14:
                    com.google.firebase.messaging.FirebaseMessaging r0 = r7.f23388c
                    android.content.Context r0 = r0.f23271d
                    android.content.Context r1 = r0.getApplicationContext()
                    if (r1 != 0) goto L1f
                    r1 = r0
                L1f:
                    r2 = 0
                    java.lang.String r3 = "com.google.firebase.messaging"
                    android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r2)
                    java.lang.String r3 = "proxy_notification_initialized"
                    boolean r1 = r1.getBoolean(r3, r2)
                    if (r1 == 0) goto L2f
                    goto L75
                L2f:
                    java.lang.String r1 = "firebase_messaging_notification_delegation_enabled"
                    r3 = 1
                    android.content.Context r4 = r0.getApplicationContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L59
                    android.content.pm.PackageManager r5 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L59
                    if (r5 == 0) goto L59
                    java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L59
                    r6 = 128(0x80, float:1.8E-43)
                    android.content.pm.ApplicationInfo r4 = r5.getApplicationInfo(r4, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L59
                    if (r4 == 0) goto L59
                    android.os.Bundle r5 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L59
                    if (r5 == 0) goto L59
                    boolean r5 = r5.containsKey(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L59
                    if (r5 == 0) goto L59
                    android.os.Bundle r4 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L59
                    boolean r1 = r4.getBoolean(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L59
                    goto L5a
                L59:
                    r1 = 1
                L5a:
                    int r4 = android.os.Build.VERSION.SDK_INT
                    r5 = 29
                    if (r4 < r5) goto L61
                    r2 = 1
                L61:
                    if (r2 != 0) goto L68
                    r0 = 0
                    com.google.android.gms.tasks.Tasks.m9723e(r0)
                    goto L75
                L68:
                    com.google.android.gms.tasks.TaskCompletionSource r2 = new com.google.android.gms.tasks.TaskCompletionSource
                    r2.<init>()
                    com.google.firebase.messaging.j r3 = new com.google.firebase.messaging.j
                    r3.<init>()
                    r3.run()
                L75:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.RunnableC2164h.run():void");
            }
        });
    }

    @NonNull
    /* renamed from: c */
    public static synchronized Store m12644c(Context context) {
        Store store;
        synchronized (FirebaseMessaging.class) {
            if (f23265o == null) {
                f23265o = new Store(context);
            }
            store = f23265o;
        }
        return store;
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull FirebaseApp firebaseApp) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseApp.m12217a();
            firebaseMessaging = (FirebaseMessaging) firebaseApp.f22262d.get(FirebaseMessaging.class);
            Preconditions.m8132g(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    /* renamed from: a */
    public String m12645a() throws IOException {
        Task<String> task;
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.f23269b;
        if (firebaseInstanceIdInternal != null) {
            try {
                return (String) Tasks.m9719a(firebaseInstanceIdInternal.mo12538a());
            } catch (InterruptedException | ExecutionException e2) {
                throw new IOException(e2);
            }
        }
        Store.Token m12648e = m12648e();
        if (!m12653j(m12648e)) {
            return m12648e.f23318a;
        }
        String m12665b = Metadata.m12665b(this.f23268a);
        RequestDeduplicator requestDeduplicator = this.f23273f;
        synchronized (requestDeduplicator) {
            task = requestDeduplicator.f23305b.get(m12665b);
            if (task == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + m12665b);
                }
                GmsRpc gmsRpc = this.f23272e;
                task = gmsRpc.m12658a(gmsRpc.m12660c(Metadata.m12665b(gmsRpc.f23286a), "*", new Bundle())).mo9714s(this.f23277j, new C2163g(this, m12665b, m12648e)).mo9706k(requestDeduplicator.f23304a, new C2167k(requestDeduplicator, m12665b, 0));
                requestDeduplicator.f23305b.put(m12665b, task);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + m12665b);
            }
        }
        try {
            return (String) Tasks.m9719a(task);
        } catch (InterruptedException | ExecutionException e3) {
            throw new IOException(e3);
        }
    }

    /* renamed from: b */
    public void m12646b(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            if (f23267q == null) {
                f23267q = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            f23267q.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    /* renamed from: d */
    public final String m12647d() {
        FirebaseApp firebaseApp = this.f23268a;
        firebaseApp.m12217a();
        return "[DEFAULT]".equals(firebaseApp.f22260b) ? "" : this.f23268a.m12218e();
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: e */
    public Store.Token m12648e() {
        Store.Token m12687b;
        Store m12644c = m12644c(this.f23271d);
        String m12647d = m12647d();
        String m12665b = Metadata.m12665b(this.f23268a);
        synchronized (m12644c) {
            m12687b = Store.Token.m12687b(m12644c.f23316a.getString(m12644c.m12685a(m12647d, m12665b), null));
        }
        return m12687b;
    }

    /* renamed from: f */
    public final void m12649f(String str) {
        FirebaseApp firebaseApp = this.f23268a;
        firebaseApp.m12217a();
        if ("[DEFAULT]".equals(firebaseApp.f22260b)) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder m24u = C0000a.m24u("Invoking onNewToken for app: ");
                FirebaseApp firebaseApp2 = this.f23268a;
                firebaseApp2.m12217a();
                m24u.append(firebaseApp2.f22260b);
                Log.d("FirebaseMessaging", m24u.toString());
            }
            Intent intent = new Intent(FirebaseMessagingService.ACTION_NEW_TOKEN);
            intent.putExtra(FirebaseMessagingService.EXTRA_TOKEN, str);
            new FcmBroadcastProcessor(this.f23271d).m12642b(intent);
        }
    }

    /* renamed from: g */
    public synchronized void m12650g(boolean z) {
        this.f23280m = z;
    }

    /* renamed from: h */
    public final void m12651h() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.f23269b;
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.getToken();
        } else if (m12653j(m12648e())) {
            synchronized (this) {
                if (!this.f23280m) {
                    m12652i(0L);
                }
            }
        }
    }

    /* renamed from: i */
    public synchronized void m12652i(long j2) {
        m12646b(new SyncTask(this, Math.min(Math.max(30L, 2 * j2), f23264n)), j2);
        this.f23280m = true;
    }

    @VisibleForTesting
    /* renamed from: j */
    public boolean m12653j(@Nullable Store.Token token) {
        if (token != null) {
            if (!(System.currentTimeMillis() > token.f23320c + Store.Token.f23317d || !this.f23279l.m12666a().equals(token.f23319b))) {
                return false;
            }
        }
        return true;
    }
}
