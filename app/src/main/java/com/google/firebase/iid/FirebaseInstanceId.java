package com.google.firebase.iid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.RequestDeduplicator;
import com.google.firebase.iid.Store;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.platforminfo.UserAgentPublisher;
import com.yandex.metrica.push.common.CoreConstants;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public class FirebaseInstanceId {

    /* renamed from: j */
    public static Store f23055j;

    /* renamed from: l */
    @VisibleForTesting
    @GuardedBy
    public static ScheduledExecutorService f23057l;

    /* renamed from: a */
    @VisibleForTesting
    public final Executor f23058a;

    /* renamed from: b */
    public final FirebaseApp f23059b;

    /* renamed from: c */
    public final Metadata f23060c;

    /* renamed from: d */
    public final GmsRpc f23061d;

    /* renamed from: e */
    public final RequestDeduplicator f23062e;

    /* renamed from: f */
    public final FirebaseInstallationsApi f23063f;

    /* renamed from: g */
    @GuardedBy
    public boolean f23064g;

    /* renamed from: h */
    public final List<FirebaseInstanceIdInternal.NewTokenListener> f23065h;

    /* renamed from: i */
    public static final long f23054i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: k */
    public static final Pattern f23056k = Pattern.compile("\\AA[\\w-]{38}\\z");

    public FirebaseInstanceId(FirebaseApp firebaseApp, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        firebaseApp.m12217a();
        Metadata metadata = new Metadata(firebaseApp.f22259a);
        ExecutorService m12519a = FirebaseIidExecutors.m12519a();
        ExecutorService m12519a2 = FirebaseIidExecutors.m12519a();
        this.f23064g = false;
        this.f23065h = new ArrayList();
        if (Metadata.m12534b(firebaseApp) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            if (f23055j == null) {
                firebaseApp.m12217a();
                f23055j = new Store(firebaseApp.f22259a);
            }
        }
        this.f23059b = firebaseApp;
        this.f23060c = metadata;
        this.f23061d = new GmsRpc(firebaseApp, metadata, provider, provider2, firebaseInstallationsApi);
        this.f23058a = m12519a2;
        this.f23062e = new RequestDeduplicator(m12519a);
        this.f23063f = firebaseInstallationsApi;
    }

    /* renamed from: a */
    public static <T> T m12520a(@NonNull Task<T> task) throws InterruptedException {
        Preconditions.m8132g(task, "Task must not be null");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.mo9699d(FirebaseInstanceId$$Lambda$1.f23069b, new OnCompleteListener(countDownLatch) { // from class: com.google.firebase.iid.FirebaseInstanceId$$Lambda$2

            /* renamed from: a */
            public final CountDownLatch f23070a;

            {
                this.f23070a = countDownLatch;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(Task task2) {
                CountDownLatch countDownLatch2 = this.f23070a;
                Store store = FirebaseInstanceId.f23055j;
                countDownLatch2.countDown();
            }
        });
        countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
        if (task.mo9712q()) {
            return task.mo9708m();
        }
        if (task.mo9710o()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.mo9711p()) {
            throw new IllegalStateException(task.mo9707l());
        }
        throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
    }

    /* renamed from: c */
    public static void m12521c(@NonNull FirebaseApp firebaseApp) {
        firebaseApp.m12217a();
        Preconditions.m8130e(firebaseApp.f22261c.f22279g, "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        firebaseApp.m12217a();
        Preconditions.m8130e(firebaseApp.f22261c.f22274b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        firebaseApp.m12217a();
        Preconditions.m8130e(firebaseApp.f22261c.f22273a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        firebaseApp.m12217a();
        Preconditions.m8127b(firebaseApp.f22261c.f22274b.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        firebaseApp.m12217a();
        Preconditions.m8127b(f23056k.matcher(firebaseApp.f22261c.f22273a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @NonNull
    @Keep
    public static FirebaseInstanceId getInstance(@NonNull FirebaseApp firebaseApp) {
        m12521c(firebaseApp);
        firebaseApp.m12217a();
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) firebaseApp.f22262d.get(FirebaseInstanceId.class);
        Preconditions.m8132g(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    /* renamed from: i */
    public static boolean m12522i() {
        return Log.isLoggable("FirebaseInstanceId", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3));
    }

    /* renamed from: b */
    public String m12523b() throws IOException {
        String m12534b = Metadata.m12534b(this.f23059b);
        m12521c(this.f23059b);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        try {
            return ((InstanceIdResult) Tasks.m9720b(m12525e(m12534b, "*"), 30000L, TimeUnit.MILLISECONDS)).getToken();
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e2);
            }
            if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                synchronized (this) {
                    f23055j.m12545c();
                }
            }
            throw ((IOException) cause);
        }
    }

    /* renamed from: d */
    public void m12524d(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (f23057l == null) {
                f23057l = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("FirebaseInstanceId"));
            }
            f23057l.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    /* renamed from: e */
    public final Task<InstanceIdResult> m12525e(final String str, final String str2) {
        if (str2.isEmpty() || str2.equalsIgnoreCase("fcm") || str2.equalsIgnoreCase(CoreConstants.Transport.GCM)) {
            str2 = "*";
        }
        return Tasks.m9723e(null).mo9706k(this.f23058a, new Continuation(this, str, str2) { // from class: com.google.firebase.iid.FirebaseInstanceId$$Lambda$0

            /* renamed from: b */
            public final FirebaseInstanceId f23066b;

            /* renamed from: c */
            public final String f23067c;

            /* renamed from: d */
            public final String f23068d;

            {
                this.f23066b = this;
                this.f23067c = str;
                this.f23068d = str2;
            }

            /* JADX WARN: Type inference failed for: r8v0, types: [com.google.firebase.iid.FirebaseInstanceId$$Lambda$3] */
            @Override // com.google.android.gms.tasks.Continuation
            /* renamed from: e */
            public Object mo7340e(Task task) {
                final FirebaseInstanceId firebaseInstanceId = this.f23066b;
                final String str3 = this.f23067c;
                final String str4 = this.f23068d;
                Objects.requireNonNull(firebaseInstanceId);
                try {
                    Store store = FirebaseInstanceId.f23055j;
                    String m12218e = firebaseInstanceId.f23059b.m12218e();
                    synchronized (store) {
                        store.f23109c.put(m12218e, Long.valueOf(store.m12546d(m12218e)));
                    }
                    final String str5 = (String) FirebaseInstanceId.m12520a(firebaseInstanceId.f23063f.getId());
                    final Store.Token m12528h = firebaseInstanceId.m12528h(str3, str4);
                    if (!firebaseInstanceId.m12532m(m12528h)) {
                        return Tasks.m9723e(new InstanceIdResultImpl(str5, m12528h.f23112a));
                    }
                    final RequestDeduplicator requestDeduplicator = firebaseInstanceId.f23062e;
                    ?? r8 = new RequestDeduplicator.GetTokenRequest(firebaseInstanceId, str5, str3, str4, m12528h) { // from class: com.google.firebase.iid.FirebaseInstanceId$$Lambda$3

                        /* renamed from: a */
                        public final FirebaseInstanceId f23071a;

                        /* renamed from: b */
                        public final String f23072b;

                        /* renamed from: c */
                        public final String f23073c;

                        /* renamed from: d */
                        public final String f23074d;

                        /* renamed from: e */
                        public final Store.Token f23075e;

                        {
                            this.f23071a = firebaseInstanceId;
                            this.f23072b = str5;
                            this.f23073c = str3;
                            this.f23074d = str4;
                            this.f23075e = m12528h;
                        }

                        /* renamed from: a */
                        public Task m12533a() {
                            int i2;
                            String str6;
                            String str7;
                            HeartBeatInfo.HeartBeat mo12508b;
                            PackageInfo m12536c;
                            final FirebaseInstanceId firebaseInstanceId2 = this.f23071a;
                            final String str8 = this.f23072b;
                            final String str9 = this.f23073c;
                            final String str10 = this.f23074d;
                            final Store.Token token = this.f23075e;
                            final GmsRpc gmsRpc = firebaseInstanceId2.f23061d;
                            Objects.requireNonNull(gmsRpc);
                            Bundle bundle = new Bundle();
                            bundle.putString("scope", str10);
                            bundle.putString("sender", str9);
                            bundle.putString("subtype", str9);
                            bundle.putString("appid", str8);
                            FirebaseApp firebaseApp = gmsRpc.f23083a;
                            firebaseApp.m12217a();
                            bundle.putString("gmp_app_id", firebaseApp.f22261c.f22274b);
                            Metadata metadata = gmsRpc.f23084b;
                            synchronized (metadata) {
                                if (metadata.f23094d == 0 && (m12536c = metadata.m12536c("com.google.android.gms")) != null) {
                                    metadata.f23094d = m12536c.versionCode;
                                }
                                i2 = metadata.f23094d;
                            }
                            bundle.putString("gmsv", Integer.toString(i2));
                            bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
                            bundle.putString("app_ver", gmsRpc.f23084b.m12535a());
                            Metadata metadata2 = gmsRpc.f23084b;
                            synchronized (metadata2) {
                                if (metadata2.f23093c == null) {
                                    metadata2.m12537d();
                                }
                                str6 = metadata2.f23093c;
                            }
                            bundle.putString("app_ver_name", str6);
                            FirebaseApp firebaseApp2 = gmsRpc.f23083a;
                            firebaseApp2.m12217a();
                            try {
                                str7 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(firebaseApp2.f22260b.getBytes()), 11);
                            } catch (NoSuchAlgorithmException unused) {
                                str7 = "[HASH-ERROR]";
                            }
                            bundle.putString("firebase-app-name-hash", str7);
                            try {
                                String mo12554a = ((InstallationTokenResult) Tasks.m9719a(gmsRpc.f23088f.mo12560a(false))).mo12554a();
                                if (TextUtils.isEmpty(mo12554a)) {
                                    Log.w("FirebaseInstanceId", "FIS auth token is empty");
                                } else {
                                    bundle.putString("Goog-Firebase-Installations-Auth", mo12554a);
                                }
                            } catch (InterruptedException | ExecutionException e2) {
                                Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e2);
                            }
                            bundle.putString("cliv", "fiid-21.1.0");
                            HeartBeatInfo heartBeatInfo = gmsRpc.f23087e.get();
                            UserAgentPublisher userAgentPublisher = gmsRpc.f23086d.get();
                            if (heartBeatInfo != null && userAgentPublisher != null && (mo12508b = heartBeatInfo.mo12508b("fire-iid")) != HeartBeatInfo.HeartBeat.NONE) {
                                bundle.putString("Firebase-Client-Log-Type", Integer.toString(mo12508b.f23045b));
                                bundle.putString("Firebase-Client", userAgentPublisher.mo12721a());
                            }
                            Task<Bundle> m7895a = gmsRpc.f23085c.m7895a(bundle);
                            Executor executor = FirebaseIidExecutors.f23052a;
                            return m7895a.mo9704i(FirebaseIidExecutors$$Lambda$0.f23053b, new Continuation(gmsRpc) { // from class: com.google.firebase.iid.GmsRpc$$Lambda$0

                                /* renamed from: b */
                                public final GmsRpc f23089b;

                                {
                                    this.f23089b = gmsRpc;
                                }

                                @Override // com.google.android.gms.tasks.Continuation
                                /* renamed from: e */
                                public Object mo7340e(Task task2) {
                                    Objects.requireNonNull(this.f23089b);
                                    Bundle bundle2 = (Bundle) task2.mo9709n(IOException.class);
                                    if (bundle2 == null) {
                                        throw new IOException("SERVICE_NOT_AVAILABLE");
                                    }
                                    String string = bundle2.getString("registration_id");
                                    if (string != null || (string = bundle2.getString("unregistered")) != null) {
                                        return string;
                                    }
                                    String string2 = bundle2.getString("error");
                                    if ("RST".equals(string2)) {
                                        throw new IOException("INSTANCE_ID_RESET");
                                    }
                                    if (string2 != null) {
                                        throw new IOException(string2);
                                    }
                                    String valueOf = String.valueOf(bundle2);
                                    Log.w("FirebaseInstanceId", C0000a.m20q(new StringBuilder(valueOf.length() + 21), "Unexpected response: ", valueOf), new Throwable());
                                    throw new IOException("SERVICE_NOT_AVAILABLE");
                                }
                            }).mo9714s(firebaseInstanceId2.f23058a, new SuccessContinuation(firebaseInstanceId2, str9, str10, str8) { // from class: com.google.firebase.iid.FirebaseInstanceId$$Lambda$4

                                /* renamed from: b */
                                public final FirebaseInstanceId f23076b;

                                /* renamed from: c */
                                public final String f23077c;

                                /* renamed from: d */
                                public final String f23078d;

                                /* renamed from: e */
                                public final String f23079e;

                                {
                                    this.f23076b = firebaseInstanceId2;
                                    this.f23077c = str9;
                                    this.f23078d = str10;
                                    this.f23079e = str8;
                                }

                                @Override // com.google.android.gms.tasks.SuccessContinuation
                                /* renamed from: a */
                                public Task mo7910a(Object obj) {
                                    FirebaseInstanceId firebaseInstanceId3 = this.f23076b;
                                    String str11 = this.f23077c;
                                    String str12 = this.f23078d;
                                    String str13 = this.f23079e;
                                    String str14 = (String) obj;
                                    Store store2 = FirebaseInstanceId.f23055j;
                                    String m12526f = firebaseInstanceId3.m12526f();
                                    String m12535a = firebaseInstanceId3.f23060c.m12535a();
                                    synchronized (store2) {
                                        String m12547a = Store.Token.m12547a(str14, m12535a, System.currentTimeMillis());
                                        if (m12547a != null) {
                                            SharedPreferences.Editor edit = store2.f23107a.edit();
                                            edit.putString(store2.m12544b(m12526f, str11, str12), m12547a);
                                            edit.commit();
                                        }
                                    }
                                    return Tasks.m9723e(new InstanceIdResultImpl(str13, str14));
                                }
                            }).mo9702g(FirebaseInstanceId$$Lambda$5.f23080b, new OnSuccessListener(firebaseInstanceId2, token) { // from class: com.google.firebase.iid.FirebaseInstanceId$$Lambda$6

                                /* renamed from: b */
                                public final FirebaseInstanceId f23081b;

                                /* renamed from: c */
                                public final Store.Token f23082c;

                                {
                                    this.f23081b = firebaseInstanceId2;
                                    this.f23082c = token;
                                }

                                @Override // com.google.android.gms.tasks.OnSuccessListener
                                public void onSuccess(Object obj) {
                                    FirebaseInstanceId firebaseInstanceId3 = this.f23081b;
                                    Store.Token token2 = this.f23082c;
                                    Objects.requireNonNull(firebaseInstanceId3);
                                    String token3 = ((InstanceIdResult) obj).getToken();
                                    if (token2 == null || !token3.equals(token2.f23112a)) {
                                        Iterator<FirebaseInstanceIdInternal.NewTokenListener> it = firebaseInstanceId3.f23065h.iterator();
                                        while (it.hasNext()) {
                                            it.next().mo12553a(token3);
                                        }
                                    }
                                }
                            });
                        }
                    };
                    synchronized (requestDeduplicator) {
                        final Pair<String, String> pair = new Pair<>(str3, str4);
                        Task<InstanceIdResult> task2 = requestDeduplicator.f23101b.get(pair);
                        if (task2 != null) {
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                String valueOf = String.valueOf(pair);
                                StringBuilder sb = new StringBuilder(valueOf.length() + 29);
                                sb.append("Joining ongoing request for: ");
                                sb.append(valueOf);
                                Log.d("FirebaseInstanceId", sb.toString());
                            }
                            return task2;
                        }
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            String valueOf2 = String.valueOf(pair);
                            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 24);
                            sb2.append("Making new request for: ");
                            sb2.append(valueOf2);
                            Log.d("FirebaseInstanceId", sb2.toString());
                        }
                        Task<InstanceIdResult> mo9706k = r8.m12533a().mo9706k(requestDeduplicator.f23100a, new Continuation(requestDeduplicator, pair) { // from class: com.google.firebase.iid.RequestDeduplicator$$Lambda$0

                            /* renamed from: b */
                            public final RequestDeduplicator f23102b;

                            /* renamed from: c */
                            public final Pair f23103c;

                            {
                                this.f23102b = requestDeduplicator;
                                this.f23103c = pair;
                            }

                            @Override // com.google.android.gms.tasks.Continuation
                            /* renamed from: e */
                            public Object mo7340e(Task task3) {
                                RequestDeduplicator requestDeduplicator2 = this.f23102b;
                                Pair pair2 = this.f23103c;
                                synchronized (requestDeduplicator2) {
                                    requestDeduplicator2.f23101b.remove(pair2);
                                }
                                return task3;
                            }
                        });
                        requestDeduplicator.f23101b.put(pair, mo9706k);
                        return mo9706k;
                    }
                } catch (InterruptedException e2) {
                    throw new IllegalStateException(e2);
                }
            }
        });
    }

    /* renamed from: f */
    public final String m12526f() {
        FirebaseApp firebaseApp = this.f23059b;
        firebaseApp.m12217a();
        return "[DEFAULT]".equals(firebaseApp.f22260b) ? "" : this.f23059b.m12218e();
    }

    @Nullable
    @Deprecated
    /* renamed from: g */
    public String m12527g() {
        m12521c(this.f23059b);
        Store.Token m12528h = m12528h(Metadata.m12534b(this.f23059b), "*");
        if (m12532m(m12528h)) {
            synchronized (this) {
                if (!this.f23064g) {
                    m12531l(0L);
                }
            }
        }
        int i2 = Store.Token.f23111e;
        if (m12528h == null) {
            return null;
        }
        return m12528h.f23112a;
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: h */
    public Store.Token m12528h(String str, String str2) {
        Store.Token m12548b;
        Store store = f23055j;
        String m12526f = m12526f();
        synchronized (store) {
            m12548b = Store.Token.m12548b(store.f23107a.getString(store.m12544b(m12526f, str, str2), null));
        }
        return m12548b;
    }

    @VisibleForTesting
    /* renamed from: j */
    public boolean m12529j() {
        int i2;
        Metadata metadata = this.f23060c;
        synchronized (metadata) {
            i2 = metadata.f23095e;
            if (i2 == 0) {
                PackageManager packageManager = metadata.f23091a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
                    i2 = 0;
                } else {
                    if (!PlatformVersion.m8244a()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            metadata.f23095e = 1;
                            i2 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                        metadata.f23095e = 2;
                        i2 = 2;
                    }
                    Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
                    if (PlatformVersion.m8244a()) {
                        metadata.f23095e = 2;
                        i2 = 2;
                    } else {
                        metadata.f23095e = 1;
                        i2 = 1;
                    }
                }
            }
        }
        return i2 != 0;
    }

    /* renamed from: k */
    public synchronized void m12530k(boolean z) {
        this.f23064g = z;
    }

    /* renamed from: l */
    public synchronized void m12531l(long j2) {
        m12524d(new SyncTask(this, Math.min(Math.max(30L, j2 + j2), f23054i)), j2);
        this.f23064g = true;
    }

    /* renamed from: m */
    public boolean m12532m(@Nullable Store.Token token) {
        if (token != null) {
            if (!(System.currentTimeMillis() > token.f23114c + Store.Token.f23110d || !this.f23060c.m12535a().equals(token.f23113b))) {
                return false;
            }
        }
        return true;
    }
}
