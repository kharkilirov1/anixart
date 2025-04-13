package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.components.C2061b;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.events.Publisher;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class FirebaseApp {

    /* renamed from: k */
    public static final Object f22256k = new Object();

    /* renamed from: l */
    public static final Executor f22257l = new UiExecutor(null);

    /* renamed from: m */
    @GuardedBy
    public static final Map<String, FirebaseApp> f22258m = new ArrayMap();

    /* renamed from: a */
    public final Context f22259a;

    /* renamed from: b */
    public final String f22260b;

    /* renamed from: c */
    public final FirebaseOptions f22261c;

    /* renamed from: d */
    public final ComponentRuntime f22262d;

    /* renamed from: e */
    public final AtomicBoolean f22263e;

    /* renamed from: f */
    public final AtomicBoolean f22264f;

    /* renamed from: g */
    public final Lazy<DataCollectionConfigStorage> f22265g;

    /* renamed from: h */
    public final Provider<DefaultHeartBeatController> f22266h;

    /* renamed from: i */
    public final List<BackgroundStateChangeListener> f22267i;

    /* renamed from: j */
    public final List<FirebaseAppLifecycleListener> f22268j;

    @KeepForSdk
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        /* renamed from: a */
        void mo12220a(boolean z);
    }

    @TargetApi
    public static class GlobalBackgroundStateListener implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a */
        public static AtomicReference<GlobalBackgroundStateListener> f22269a = new AtomicReference<>();

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        /* renamed from: a */
        public void mo7970a(boolean z) {
            Object obj = FirebaseApp.f22256k;
            synchronized (FirebaseApp.f22256k) {
                Iterator it = new ArrayList(((ArrayMap) FirebaseApp.f22258m).values()).iterator();
                while (it.hasNext()) {
                    FirebaseApp firebaseApp = (FirebaseApp) it.next();
                    if (firebaseApp.f22263e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator<BackgroundStateChangeListener> it2 = firebaseApp.f22267i.iterator();
                        while (it2.hasNext()) {
                            it2.next().mo12220a(z);
                        }
                    }
                }
            }
        }
    }

    public static class UiExecutor implements Executor {

        /* renamed from: b */
        public static final Handler f22270b = new Handler(Looper.getMainLooper());

        public UiExecutor() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            f22270b.post(runnable);
        }

        public UiExecutor(C20441 c20441) {
        }
    }

    @TargetApi
    public static class UserUnlockReceiver extends BroadcastReceiver {

        /* renamed from: b */
        public static AtomicReference<UserUnlockReceiver> f22271b = new AtomicReference<>();

        /* renamed from: a */
        public final Context f22272a;

        public UserUnlockReceiver(Context context) {
            this.f22272a = context;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object obj = FirebaseApp.f22256k;
            synchronized (FirebaseApp.f22256k) {
                Iterator it = ((ArrayMap) FirebaseApp.f22258m).values().iterator();
                while (it.hasNext()) {
                    ((FirebaseApp) it.next()).m12219f();
                }
            }
            this.f22272a.unregisterReceiver(this);
        }
    }

    public FirebaseApp(final Context context, String str, FirebaseOptions firebaseOptions) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f22263e = atomicBoolean;
        this.f22264f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f22267i = copyOnWriteArrayList;
        this.f22268j = new CopyOnWriteArrayList();
        this.f22259a = context;
        Preconditions.m8129d(str);
        this.f22260b = str;
        Objects.requireNonNull(firebaseOptions, "null reference");
        this.f22261c = firebaseOptions;
        List<Provider<ComponentRegistrar>> m12341a = ComponentDiscovery.m12340b(context, ComponentDiscoveryService.class).m12341a();
        Executor executor = f22257l;
        Provider<Set<Object>> provider = ComponentRuntime.f22484g;
        ComponentRuntime.Builder builder = new ComponentRuntime.Builder(executor);
        builder.f22492b.addAll(m12341a);
        builder.f22492b.add(new C2061b(new FirebaseCommonRegistrar(), 1));
        builder.f22493c.add(Component.m12331e(context, Context.class, new Class[0]));
        builder.f22493c.add(Component.m12331e(this, FirebaseApp.class, new Class[0]));
        builder.f22493c.add(Component.m12331e(firebaseOptions, FirebaseOptions.class, new Class[0]));
        ComponentRuntime componentRuntime = new ComponentRuntime(builder.f22491a, builder.f22492b, builder.f22493c, null);
        this.f22262d = componentRuntime;
        this.f22265g = new Lazy<>(new Provider() { // from class: com.google.firebase.b
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                FirebaseApp firebaseApp = FirebaseApp.this;
                Context context2 = context;
                Object obj = FirebaseApp.f22256k;
                return new DataCollectionConfigStorage(context2, firebaseApp.m12218e(), (Publisher) firebaseApp.f22262d.get(Publisher.class));
            }
        });
        this.f22266h = componentRuntime.mo12337a(DefaultHeartBeatController.class);
        BackgroundStateChangeListener backgroundStateChangeListener = new BackgroundStateChangeListener() { // from class: com.google.firebase.a
            @Override // com.google.firebase.FirebaseApp.BackgroundStateChangeListener
            /* renamed from: a */
            public final void mo12220a(boolean z) {
                FirebaseApp firebaseApp = FirebaseApp.this;
                Object obj = FirebaseApp.f22256k;
                Objects.requireNonNull(firebaseApp);
                if (z) {
                    return;
                }
                firebaseApp.f22266h.get().m12509c();
            }
        };
        m12217a();
        if (atomicBoolean.get() && BackgroundDetector.f15389f.f15390b.get()) {
            backgroundStateChangeListener.mo12220a(true);
        }
        copyOnWriteArrayList.add(backgroundStateChangeListener);
    }

    /* renamed from: b */
    public static List<String> m12211b() {
        ArrayList arrayList = new ArrayList();
        synchronized (f22256k) {
            for (FirebaseApp firebaseApp : ((ArrayMap) f22258m).values()) {
                firebaseApp.m12217a();
                arrayList.add(firebaseApp.f22260b);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @NonNull
    /* renamed from: c */
    public static FirebaseApp m12212c() {
        FirebaseApp firebaseApp;
        synchronized (f22256k) {
            firebaseApp = (FirebaseApp) ((SimpleArrayMap) f22258m).get("[DEFAULT]");
            if (firebaseApp == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.m8246a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return firebaseApp;
    }

    @NonNull
    /* renamed from: d */
    public static FirebaseApp m12213d(@NonNull String str) {
        FirebaseApp firebaseApp;
        String str2;
        synchronized (f22256k) {
            firebaseApp = (FirebaseApp) ((SimpleArrayMap) f22258m).get(str.trim());
            if (firebaseApp == null) {
                List<String> m12211b = m12211b();
                if (((ArrayList) m12211b).isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", m12211b);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
            firebaseApp.f22266h.get().m12509c();
        }
        return firebaseApp;
    }

    @Nullable
    /* renamed from: g */
    public static FirebaseApp m12214g(@NonNull Context context) {
        synchronized (f22256k) {
            if (((SimpleArrayMap) f22258m).m1119f("[DEFAULT]") >= 0) {
                return m12212c();
            }
            FirebaseOptions m12222a = FirebaseOptions.m12222a(context);
            if (m12222a != null) {
                return m12215h(context, m12222a);
            }
            Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
            return null;
        }
    }

    @NonNull
    /* renamed from: h */
    public static FirebaseApp m12215h(@NonNull Context context, @NonNull FirebaseOptions firebaseOptions) {
        return m12216i(context, firebaseOptions, "[DEFAULT]");
    }

    @NonNull
    /* renamed from: i */
    public static FirebaseApp m12216i(@NonNull Context context, @NonNull FirebaseOptions firebaseOptions, @NonNull String str) {
        FirebaseApp firebaseApp;
        AtomicReference<GlobalBackgroundStateListener> atomicReference = GlobalBackgroundStateListener.f22269a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            if (GlobalBackgroundStateListener.f22269a.get() == null) {
                GlobalBackgroundStateListener globalBackgroundStateListener = new GlobalBackgroundStateListener();
                if (GlobalBackgroundStateListener.f22269a.compareAndSet(null, globalBackgroundStateListener)) {
                    BackgroundDetector.m7967b(application);
                    BackgroundDetector.f15389f.m7968a(globalBackgroundStateListener);
                }
            }
        }
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f22256k) {
            Object obj = f22258m;
            Preconditions.m8134i(!((SimpleArrayMap) obj).containsKey(trim), "FirebaseApp name " + trim + " already exists!");
            Preconditions.m8132g(context, "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, trim, firebaseOptions);
            ((SimpleArrayMap) obj).put(trim, firebaseApp);
        }
        firebaseApp.m12219f();
        return firebaseApp;
    }

    /* renamed from: a */
    public final void m12217a() {
        Preconditions.m8134i(!this.f22264f.get(), "FirebaseApp was deleted");
    }

    @KeepForSdk
    /* renamed from: e */
    public String m12218e() {
        StringBuilder sb = new StringBuilder();
        m12217a();
        byte[] bytes = this.f22260b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        m12217a();
        byte[] bytes2 = this.f22261c.f22274b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseApp)) {
            return false;
        }
        String str = this.f22260b;
        FirebaseApp firebaseApp = (FirebaseApp) obj;
        firebaseApp.m12217a();
        return str.equals(firebaseApp.f22260b);
    }

    /* renamed from: f */
    public final void m12219f() {
        HashMap hashMap;
        if (!UserManagerCompat.m1977a(this.f22259a)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            m12217a();
            sb.append(this.f22260b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f22259a;
            if (UserUnlockReceiver.f22271b.get() == null) {
                UserUnlockReceiver userUnlockReceiver = new UserUnlockReceiver(context);
                if (UserUnlockReceiver.f22271b.compareAndSet(null, userUnlockReceiver)) {
                    context.registerReceiver(userUnlockReceiver, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Device unlocked: initializing all Firebase APIs for app ");
        m12217a();
        sb2.append(this.f22260b);
        Log.i("FirebaseApp", sb2.toString());
        ComponentRuntime componentRuntime = this.f22262d;
        m12217a();
        boolean equals = "[DEFAULT]".equals(this.f22260b);
        if (componentRuntime.f22490f.compareAndSet(null, Boolean.valueOf(equals))) {
            synchronized (componentRuntime) {
                hashMap = new HashMap(componentRuntime.f22485a);
            }
            componentRuntime.m12343e(hashMap, equals);
        }
        this.f22266h.get().m12509c();
    }

    public int hashCode() {
        return this.f22260b.hashCode();
    }

    public String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.m8124a("name", this.f22260b);
        toStringHelper.m8124a("options", this.f22261c);
        return toStringHelper.toString();
    }
}
