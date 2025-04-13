package com.google.firebase.installations;

import androidx.activity.RunnableC0042c;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;
import com.google.firebase.installations.local.IidStore;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FirebaseInstallations implements FirebaseInstallationsApi {

    /* renamed from: m */
    public static final Object f23129m = new Object();

    /* renamed from: n */
    public static final ThreadFactory f23130n = new ThreadFactory() { // from class: com.google.firebase.installations.FirebaseInstallations.1

        /* renamed from: b */
        public final AtomicInteger f23143b = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f23143b.getAndIncrement())));
        }
    };

    /* renamed from: a */
    public final FirebaseApp f23131a;

    /* renamed from: b */
    public final FirebaseInstallationServiceClient f23132b;

    /* renamed from: c */
    public final PersistedInstallation f23133c;

    /* renamed from: d */
    public final Utils f23134d;

    /* renamed from: e */
    public final IidStore f23135e;

    /* renamed from: f */
    public final RandomFidGenerator f23136f;

    /* renamed from: g */
    public final Object f23137g;

    /* renamed from: h */
    public final ExecutorService f23138h;

    /* renamed from: i */
    public final ExecutorService f23139i;

    /* renamed from: j */
    @GuardedBy
    public String f23140j;

    /* renamed from: k */
    @GuardedBy
    public Set<FidListener> f23141k;

    /* renamed from: l */
    @GuardedBy
    public final List<StateListener> f23142l;

    /* renamed from: com.google.firebase.installations.FirebaseInstallations$2 */
    class C21442 implements FidListenerHandle {
    }

    /* renamed from: com.google.firebase.installations.FirebaseInstallations$3 */
    public static /* synthetic */ class C21453 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23144a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f23145b;

        static {
            int[] iArr = new int[TokenResult.ResponseCode.values().length];
            f23145b = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23145b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23145b[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[InstallationResponse.ResponseCode.values().length];
            f23144a = iArr2;
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23144a[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public FirebaseInstallations(FirebaseApp firebaseApp, @NonNull Provider<HeartBeatController> provider) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = f23130n;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, threadFactory);
        firebaseApp.m12217a();
        FirebaseInstallationServiceClient firebaseInstallationServiceClient = new FirebaseInstallationServiceClient(firebaseApp.f22259a, provider);
        PersistedInstallation persistedInstallation = new PersistedInstallation(firebaseApp);
        Utils m12578c = Utils.m12578c();
        IidStore iidStore = new IidStore(firebaseApp);
        RandomFidGenerator randomFidGenerator = new RandomFidGenerator();
        this.f23137g = new Object();
        this.f23141k = new HashSet();
        this.f23142l = new ArrayList();
        this.f23131a = firebaseApp;
        this.f23132b = firebaseInstallationServiceClient;
        this.f23133c = persistedInstallation;
        this.f23134d = m12578c;
        this.f23135e = iidStore;
        this.f23136f = randomFidGenerator;
        this.f23138h = threadPoolExecutor;
        this.f23139i = new ThreadPoolExecutor(0, 1, 30L, timeUnit, new LinkedBlockingQueue(), threadFactory);
    }

    @NonNull
    /* renamed from: f */
    public static FirebaseInstallations m12559f(@NonNull FirebaseApp firebaseApp) {
        firebaseApp.m12217a();
        return (FirebaseInstallations) firebaseApp.f22262d.get(FirebaseInstallationsApi.class);
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    /* renamed from: a */
    public Task<InstallationTokenResult> mo12560a(boolean z) {
        m12568j();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        GetAuthTokenListener getAuthTokenListener = new GetAuthTokenListener(this.f23134d, taskCompletionSource);
        synchronized (this.f23137g) {
            this.f23142l.add(getAuthTokenListener);
        }
        Task task = taskCompletionSource.f17240a;
        this.f23138h.execute(new RunnableC2147a(this, z, 0));
        return task;
    }

    /* renamed from: b */
    public final void m12561b(boolean z) {
        PersistedInstallationEntry m12602c;
        synchronized (f23129m) {
            FirebaseApp firebaseApp = this.f23131a;
            firebaseApp.m12217a();
            CrossProcessLock m12557a = CrossProcessLock.m12557a(firebaseApp.f22259a, "generatefid.lock");
            try {
                m12602c = this.f23133c.m12602c();
                if (m12602c.m12604i()) {
                    String m12569k = m12569k(m12602c);
                    PersistedInstallation persistedInstallation = this.f23133c;
                    m12602c = m12602c.mo12590k().mo12594d(m12569k).mo12597g(PersistedInstallation.RegistrationStatus.UNREGISTERED).mo12591a();
                    persistedInstallation.m12601b(m12602c);
                }
            } finally {
                if (m12557a != null) {
                    m12557a.m12558b();
                }
            }
        }
        if (z) {
            m12602c = m12602c.mo12590k().mo12592b(null).mo12591a();
        }
        m12572n(m12602c);
        this.f23139i.execute(new RunnableC2147a(this, z, 1));
    }

    /* renamed from: c */
    public final PersistedInstallationEntry m12562c(@NonNull PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        TokenResult m12622b = this.f23132b.m12622b(m12563d(), persistedInstallationEntry.mo12585c(), m12566h(), persistedInstallationEntry.mo12587e());
        int ordinal = m12622b.mo12612b().ordinal();
        if (ordinal == 0) {
            String mo12613c = m12622b.mo12613c();
            long mo12614d = m12622b.mo12614d();
            return persistedInstallationEntry.mo12590k().mo12592b(mo12613c).mo12593c(mo12614d).mo12598h(this.f23134d.m12580b()).mo12591a();
        }
        if (ordinal == 1) {
            return persistedInstallationEntry.mo12590k().mo12595e("BAD CONFIG").mo12597g(PersistedInstallation.RegistrationStatus.REGISTER_ERROR).mo12591a();
        }
        if (ordinal != 2) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        m12573o(null);
        return persistedInstallationEntry.mo12590k().mo12597g(PersistedInstallation.RegistrationStatus.NOT_GENERATED).mo12591a();
    }

    @Nullable
    /* renamed from: d */
    public String m12563d() {
        FirebaseApp firebaseApp = this.f23131a;
        firebaseApp.m12217a();
        return firebaseApp.f22261c.f22273a;
    }

    @VisibleForTesting
    /* renamed from: e */
    public String m12564e() {
        FirebaseApp firebaseApp = this.f23131a;
        firebaseApp.m12217a();
        return firebaseApp.f22261c.f22274b;
    }

    /* renamed from: g */
    public final PersistedInstallationEntry m12565g() {
        PersistedInstallationEntry m12602c;
        synchronized (f23129m) {
            FirebaseApp firebaseApp = this.f23131a;
            firebaseApp.m12217a();
            CrossProcessLock m12557a = CrossProcessLock.m12557a(firebaseApp.f22259a, "generatefid.lock");
            try {
                m12602c = this.f23133c.m12602c();
            } finally {
                if (m12557a != null) {
                    m12557a.m12558b();
                }
            }
        }
        return m12602c;
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public Task<String> getId() {
        String str;
        m12568j();
        synchronized (this) {
            str = this.f23140j;
        }
        if (str != null) {
            return Tasks.m9723e(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        GetIdListener getIdListener = new GetIdListener(taskCompletionSource);
        synchronized (this.f23137g) {
            this.f23142l.add(getIdListener);
        }
        Task task = taskCompletionSource.f17240a;
        this.f23138h.execute(new RunnableC0042c(this, 6));
        return task;
    }

    @Nullable
    /* renamed from: h */
    public String m12566h() {
        FirebaseApp firebaseApp = this.f23131a;
        firebaseApp.m12217a();
        return firebaseApp.f22261c.f22279g;
    }

    /* renamed from: i */
    public final void m12567i(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (f23129m) {
            FirebaseApp firebaseApp = this.f23131a;
            firebaseApp.m12217a();
            CrossProcessLock m12557a = CrossProcessLock.m12557a(firebaseApp.f22259a, "generatefid.lock");
            try {
                this.f23133c.m12601b(persistedInstallationEntry);
            } finally {
                if (m12557a != null) {
                    m12557a.m12558b();
                }
            }
        }
    }

    /* renamed from: j */
    public final void m12568j() {
        Preconditions.m8130e(m12564e(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.m8130e(m12566h(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.m8130e(m12563d(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String m12564e = m12564e();
        Pattern pattern = Utils.f23156c;
        Preconditions.m8127b(m12564e.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.m8127b(Utils.f23156c.matcher(m12563d()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.f22260b) != false) goto L6;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m12569k(com.google.firebase.installations.local.PersistedInstallationEntry r6) {
        /*
            r5 = this;
            com.google.firebase.FirebaseApp r0 = r5.f23131a
            r0.m12217a()
            java.lang.String r0 = r0.f22260b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            com.google.firebase.FirebaseApp r0 = r5.f23131a
            r0.m12217a()
            java.lang.String r0 = r0.f22260b
            java.lang.String r1 = "[DEFAULT]"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2b
        L1e:
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r6 = r6.mo12588f()
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION
            if (r6 != r0) goto L28
            r6 = 1
            goto L29
        L28:
            r6 = 0
        L29:
            if (r6 != 0) goto L32
        L2b:
            com.google.firebase.installations.RandomFidGenerator r6 = r5.f23136f
            java.lang.String r6 = r6.m12577a()
            return r6
        L32:
            com.google.firebase.installations.local.IidStore r6 = r5.f23135e
            android.content.SharedPreferences r0 = r6.f23177a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f23177a     // Catch: java.lang.Throwable -> L5d
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L5d
            android.content.SharedPreferences r2 = r6.f23177a     // Catch: java.lang.Throwable -> L5a
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5a
            if (r2 == 0) goto L48
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5d
            goto L4d
        L48:
            java.lang.String r2 = r6.m12599a()     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5d
        L4d:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L59
            com.google.firebase.installations.RandomFidGenerator r6 = r5.f23136f
            java.lang.String r2 = r6.m12577a()
        L59:
            return r2
        L5a:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5a
            throw r6     // Catch: java.lang.Throwable -> L5d
        L5d:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.FirebaseInstallations.m12569k(com.google.firebase.installations.local.PersistedInstallationEntry):java.lang.String");
    }

    /* renamed from: l */
    public final PersistedInstallationEntry m12570l(PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        String str = null;
        if (persistedInstallationEntry.mo12585c() != null && persistedInstallationEntry.mo12585c().length() == 11) {
            IidStore iidStore = this.f23135e;
            synchronized (iidStore.f23177a) {
                String[] strArr = IidStore.f23176c;
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    String str2 = strArr[i2];
                    String string = iidStore.f23177a.getString("|T|" + iidStore.f23178b + "|" + str2, null);
                    if (string == null || string.isEmpty()) {
                        i2++;
                    } else if (string.startsWith("{")) {
                        try {
                            str = new JSONObject(string).getString(FirebaseMessagingService.EXTRA_TOKEN);
                        } catch (JSONException unused) {
                        }
                    } else {
                        str = string;
                    }
                }
            }
        }
        InstallationResponse m12621a = this.f23132b.m12621a(m12563d(), persistedInstallationEntry.mo12585c(), m12566h(), m12564e(), str);
        int ordinal = m12621a.mo12609d().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return persistedInstallationEntry.mo12590k().mo12595e("BAD CONFIG").mo12597g(PersistedInstallation.RegistrationStatus.REGISTER_ERROR).mo12591a();
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        String mo12607b = m12621a.mo12607b();
        String mo12608c = m12621a.mo12608c();
        return persistedInstallationEntry.mo12590k().mo12594d(mo12607b).mo12597g(PersistedInstallation.RegistrationStatus.REGISTERED).mo12592b(m12621a.mo12606a().mo12613c()).mo12596f(mo12608c).mo12593c(m12621a.mo12606a().mo12614d()).mo12598h(this.f23134d.m12580b()).mo12591a();
    }

    /* renamed from: m */
    public final void m12571m(Exception exc) {
        synchronized (this.f23137g) {
            Iterator<StateListener> it = this.f23142l.iterator();
            while (it.hasNext()) {
                if (it.next().mo12575a(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: n */
    public final void m12572n(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (this.f23137g) {
            Iterator<StateListener> it = this.f23142l.iterator();
            while (it.hasNext()) {
                if (it.next().mo12576b(persistedInstallationEntry)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: o */
    public final synchronized void m12573o(String str) {
        this.f23140j = str;
    }
}
