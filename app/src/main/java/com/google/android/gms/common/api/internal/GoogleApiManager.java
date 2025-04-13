package com.google.android.gms.common.api.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArraySet;
import androidx.room.util.C0576a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public class GoogleApiManager implements Handler.Callback {

    /* renamed from: q */
    @NonNull
    public static final Status f15410q = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: r */
    public static final Status f15411r = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: s */
    public static final Object f15412s = new Object();

    /* renamed from: t */
    @Nullable
    @GuardedBy
    public static GoogleApiManager f15413t;

    /* renamed from: d */
    @Nullable
    public TelemetryData f15416d;

    /* renamed from: e */
    @Nullable
    public TelemetryLoggingClient f15417e;

    /* renamed from: f */
    public final Context f15418f;

    /* renamed from: g */
    public final GoogleApiAvailability f15419g;

    /* renamed from: h */
    public final com.google.android.gms.common.internal.zal f15420h;

    /* renamed from: o */
    @NotOnlyInitialized
    public final Handler f15427o;

    /* renamed from: p */
    public volatile boolean f15428p;

    /* renamed from: b */
    public long f15414b = 10000;

    /* renamed from: c */
    public boolean f15415c = false;

    /* renamed from: i */
    public final AtomicInteger f15421i = new AtomicInteger(1);

    /* renamed from: j */
    public final AtomicInteger f15422j = new AtomicInteger(0);

    /* renamed from: k */
    public final Map<ApiKey<?>, zabq<?>> f15423k = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: l */
    @Nullable
    @GuardedBy
    public zaae f15424l = null;

    /* renamed from: m */
    @GuardedBy
    public final Set<ApiKey<?>> f15425m = new ArraySet(0);

    /* renamed from: n */
    public final Set<ApiKey<?>> f15426n = new ArraySet(0);

    @KeepForSdk
    public GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.f15428p = true;
        this.f15418f = context;
        com.google.android.gms.internal.base.zaq zaqVar = new com.google.android.gms.internal.base.zaq(looper, this);
        this.f15427o = zaqVar;
        this.f15419g = googleApiAvailability;
        this.f15420h = new com.google.android.gms.common.internal.zal(googleApiAvailability);
        PackageManager packageManager = context.getPackageManager();
        if (DeviceProperties.f15898d == null) {
            DeviceProperties.f15898d = Boolean.valueOf(PlatformVersion.m8244a() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (DeviceProperties.f15898d.booleanValue()) {
            this.f15428p = false;
        }
        zaqVar.sendMessage(zaqVar.obtainMessage(6));
    }

    /* renamed from: d */
    public static Status m7982d(ApiKey<?> apiKey, ConnectionResult connectionResult) {
        String str = apiKey.f15386b.f15347c;
        String valueOf = String.valueOf(connectionResult);
        return new Status(1, 17, C0000a.m22s(new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", valueOf), connectionResult.f15316d, connectionResult);
    }

    @NonNull
    /* renamed from: g */
    public static GoogleApiManager m7983g(@NonNull Context context) {
        GoogleApiManager googleApiManager;
        synchronized (f15412s) {
            try {
                if (f15413t == null) {
                    Looper looper = GmsClientSupervisor.m8116a().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    int i2 = GoogleApiAvailability.f15324c;
                    f15413t = new GoogleApiManager(applicationContext, looper, GoogleApiAvailability.f15326e);
                }
                googleApiManager = f15413t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return googleApiManager;
    }

    /* renamed from: a */
    public final void m7984a(@NonNull zaae zaaeVar) {
        synchronized (f15412s) {
            if (this.f15424l != zaaeVar) {
                this.f15424l = zaaeVar;
                this.f15425m.clear();
            }
            this.f15425m.addAll(zaaeVar.f15457g);
        }
    }

    @WorkerThread
    /* renamed from: b */
    public final boolean m7985b() {
        if (this.f15415c) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = RootTelemetryConfigManager.m8135a().f15738a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.f15740c) {
            return false;
        }
        int i2 = this.f15420h.f15765a.get(203400000, -1);
        return i2 == -1 || i2 == 0;
    }

    /* renamed from: c */
    public final boolean m7986c(ConnectionResult connectionResult, int i2) {
        boolean booleanValue;
        Boolean bool;
        GoogleApiAvailability googleApiAvailability = this.f15419g;
        Context context = this.f15418f;
        Objects.requireNonNull(googleApiAvailability);
        synchronized (InstantApps.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = InstantApps.f15912a;
            if (context2 != null && (bool = InstantApps.f15913b) != null && context2 == applicationContext) {
                booleanValue = bool.booleanValue();
            }
            InstantApps.f15913b = null;
            if (PlatformVersion.m8244a()) {
                InstantApps.f15913b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    InstantApps.f15913b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    InstantApps.f15913b = Boolean.FALSE;
                }
            }
            InstantApps.f15912a = applicationContext;
            booleanValue = InstantApps.f15913b.booleanValue();
        }
        if (booleanValue) {
            return false;
        }
        PendingIntent m7925b = connectionResult.m7913m() ? connectionResult.f15316d : googleApiAvailability.m7925b(context, connectionResult.f15315c, 0, null);
        if (m7925b == null) {
            return false;
        }
        int i3 = connectionResult.f15315c;
        int i4 = GoogleApiActivity.f15368c;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", m7925b);
        intent.putExtra("failing_client_id", i2);
        intent.putExtra("notify_manager", true);
        googleApiAvailability.m7923i(context, i3, null, PendingIntent.getActivity(context, 0, intent, com.google.android.gms.internal.base.zal.f16230a | 134217728));
        return true;
    }

    @WorkerThread
    /* renamed from: e */
    public final zabq<?> m7987e(GoogleApi<?> googleApi) {
        ApiKey<?> apiKey = googleApi.f15357e;
        zabq<?> zabqVar = this.f15423k.get(apiKey);
        if (zabqVar == null) {
            zabqVar = new zabq<>(this, googleApi);
            this.f15423k.put(apiKey, zabqVar);
        }
        if (zabqVar.m8065v()) {
            this.f15426n.add(apiKey);
        }
        zabqVar.m8061p();
        return zabqVar;
    }

    @WorkerThread
    /* renamed from: f */
    public final void m7988f() {
        TelemetryData telemetryData = this.f15416d;
        if (telemetryData != null) {
            if (telemetryData.f15746b > 0 || m7985b()) {
                if (this.f15417e == null) {
                    this.f15417e = new com.google.android.gms.common.internal.service.zao(this.f15418f, TelemetryLoggingOptions.f15748c);
                }
                this.f15417e.mo8137b(telemetryData);
            }
            this.f15416d = null;
        }
    }

    /* renamed from: h */
    public final <O extends Api.ApiOptions, ResultT> void m7989h(@NonNull GoogleApi<O> googleApi, int i2, @NonNull TaskApiCall<Api.AnyClient, ResultT> taskApiCall, @NonNull TaskCompletionSource<ResultT> taskCompletionSource, @NonNull StatusExceptionMapper statusExceptionMapper) {
        int i3 = taskApiCall.f15435c;
        if (i3 != 0) {
            ApiKey<O> apiKey = googleApi.f15357e;
            zacd zacdVar = null;
            if (m7985b()) {
                RootTelemetryConfiguration rootTelemetryConfiguration = RootTelemetryConfigManager.m8135a().f15738a;
                boolean z = true;
                if (rootTelemetryConfiguration != null) {
                    if (rootTelemetryConfiguration.f15740c) {
                        boolean z2 = rootTelemetryConfiguration.f15741d;
                        zabq<?> zabqVar = this.f15423k.get(apiKey);
                        if (zabqVar != null) {
                            Object obj = zabqVar.f15525b;
                            if (obj instanceof BaseGmsClient) {
                                BaseGmsClient baseGmsClient = (BaseGmsClient) obj;
                                if ((baseGmsClient.f15650A != null) && !baseGmsClient.m8098e()) {
                                    ConnectionTelemetryConfiguration m8071a = zacd.m8071a(zabqVar, baseGmsClient, i3);
                                    if (m8071a != null) {
                                        zabqVar.f15535l++;
                                        z = m8071a.f15695d;
                                    }
                                }
                            }
                        }
                        z = z2;
                    }
                }
                zacdVar = new zacd(this, i3, apiKey, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
            }
            if (zacdVar != null) {
                zzw<ResultT> zzwVar = taskCompletionSource.f17240a;
                final Handler handler = this.f15427o;
                Objects.requireNonNull(handler);
                zzwVar.mo9699d(new Executor() { // from class: com.google.android.gms.common.api.internal.zabk
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        handler.post(runnable);
                    }
                }, zacdVar);
            }
        }
        zag zagVar = new zag(i2, taskApiCall, taskCompletionSource, statusExceptionMapper);
        Handler handler2 = this.f15427o;
        handler2.sendMessage(handler2.obtainMessage(4, new zach(zagVar, this.f15422j.get(), googleApi)));
    }

    @Override // android.os.Handler.Callback
    @WorkerThread
    public final boolean handleMessage(@NonNull Message message) {
        zabq<?> zabqVar;
        Feature[] mo8070g;
        boolean z;
        int i2 = message.what;
        switch (i2) {
            case 1:
                this.f15414b = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f15427o.removeMessages(12);
                for (ApiKey<?> apiKey : this.f15423k.keySet()) {
                    Handler handler = this.f15427o;
                    handler.sendMessageDelayed(handler.obtainMessage(12, apiKey), this.f15414b);
                }
                return true;
            case 2:
                Objects.requireNonNull((zal) message.obj);
                throw null;
            case 3:
                for (zabq<?> zabqVar2 : this.f15423k.values()) {
                    zabqVar2.m8060o();
                    zabqVar2.m8061p();
                }
                return true;
            case 4:
            case 8:
            case 13:
                zach zachVar = (zach) message.obj;
                zabq<?> zabqVar3 = this.f15423k.get(zachVar.f15564c.f15357e);
                if (zabqVar3 == null) {
                    zabqVar3 = m7987e(zachVar.f15564c);
                }
                if (!zabqVar3.m8065v() || this.f15422j.get() == zachVar.f15563b) {
                    zabqVar3.m8062r(zachVar.f15562a);
                } else {
                    zachVar.f15562a.mo8072a(f15410q);
                    zabqVar3.m8064u();
                }
                return true;
            case 5:
                int i3 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<zabq<?>> it = this.f15423k.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        zabqVar = it.next();
                        if (zabqVar.f15530g == i3) {
                        }
                    } else {
                        zabqVar = null;
                    }
                }
                if (zabqVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i3);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                } else if (connectionResult.f15315c == 13) {
                    GoogleApiAvailability googleApiAvailability = this.f15419g;
                    int i4 = connectionResult.f15315c;
                    Objects.requireNonNull(googleApiAvailability);
                    AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f15332a;
                    String m7912o = ConnectionResult.m7912o(i4);
                    String str = connectionResult.f15317e;
                    Status status = new Status(17, C0000a.m22s(new StringBuilder(String.valueOf(m7912o).length() + 69 + String.valueOf(str).length()), "Error resolution was canceled by the user, original error message: ", m7912o, ": ", str));
                    Preconditions.m8128c(zabqVar.f15536m.f15427o);
                    zabqVar.m8050d(status, null, false);
                } else {
                    Status m7982d = m7982d(zabqVar.f15526c, connectionResult);
                    Preconditions.m8128c(zabqVar.f15536m.f15427o);
                    zabqVar.m8050d(m7982d, null, false);
                }
                return true;
            case 6:
                if (this.f15418f.getApplicationContext() instanceof Application) {
                    BackgroundDetector.m7967b((Application) this.f15418f.getApplicationContext());
                    BackgroundDetector backgroundDetector = BackgroundDetector.f15389f;
                    backgroundDetector.m7968a(new zabl(this));
                    if (!backgroundDetector.f15391c.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!backgroundDetector.f15391c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            backgroundDetector.f15390b.set(true);
                        }
                    }
                    if (!backgroundDetector.f15390b.get()) {
                        this.f15414b = 300000L;
                    }
                }
                return true;
            case 7:
                m7987e((GoogleApi) message.obj);
                return true;
            case 9:
                if (this.f15423k.containsKey(message.obj)) {
                    zabq<?> zabqVar4 = this.f15423k.get(message.obj);
                    Preconditions.m8128c(zabqVar4.f15536m.f15427o);
                    if (zabqVar4.f15532i) {
                        zabqVar4.m8061p();
                    }
                }
                return true;
            case 10:
                Iterator<ApiKey<?>> it2 = this.f15426n.iterator();
                while (it2.hasNext()) {
                    zabq<?> remove = this.f15423k.remove(it2.next());
                    if (remove != null) {
                        remove.m8064u();
                    }
                }
                this.f15426n.clear();
                return true;
            case 11:
                if (this.f15423k.containsKey(message.obj)) {
                    zabq<?> zabqVar5 = this.f15423k.get(message.obj);
                    Preconditions.m8128c(zabqVar5.f15536m.f15427o);
                    if (zabqVar5.f15532i) {
                        zabqVar5.m8056k();
                        GoogleApiManager googleApiManager = zabqVar5.f15536m;
                        Status status2 = googleApiManager.f15419g.m7918d(googleApiManager.f15418f) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error.");
                        Preconditions.m8128c(zabqVar5.f15536m.f15427o);
                        zabqVar5.m8050d(status2, null, false);
                        zabqVar5.f15525b.mo7937d("Timing out connection while resuming.");
                    }
                }
                return true;
            case 12:
                if (this.f15423k.containsKey(message.obj)) {
                    this.f15423k.get(message.obj).m8059n(true);
                }
                return true;
            case 14:
                Objects.requireNonNull((zaaf) message.obj);
                if (!this.f15423k.containsKey(null)) {
                    throw null;
                }
                this.f15423k.get(null).m8059n(false);
                throw null;
            case 15:
                zabs zabsVar = (zabs) message.obj;
                if (this.f15423k.containsKey(zabsVar.f15537a)) {
                    zabq<?> zabqVar6 = this.f15423k.get(zabsVar.f15537a);
                    if (zabqVar6.f15533j.contains(zabsVar) && !zabqVar6.f15532i) {
                        if (zabqVar6.f15525b.mo7942i()) {
                            zabqVar6.m8051e();
                        } else {
                            zabqVar6.m8061p();
                        }
                    }
                }
                return true;
            case 16:
                zabs zabsVar2 = (zabs) message.obj;
                if (this.f15423k.containsKey(zabsVar2.f15537a)) {
                    zabq<?> zabqVar7 = this.f15423k.get(zabsVar2.f15537a);
                    if (zabqVar7.f15533j.remove(zabsVar2)) {
                        zabqVar7.f15536m.f15427o.removeMessages(15, zabsVar2);
                        zabqVar7.f15536m.f15427o.removeMessages(16, zabsVar2);
                        Feature feature = zabsVar2.f15538b;
                        ArrayList arrayList = new ArrayList(zabqVar7.f15524a.size());
                        for (zai zaiVar : zabqVar7.f15524a) {
                            if ((zaiVar instanceof zac) && (mo8070g = ((zac) zaiVar).mo8070g(zabqVar7)) != null) {
                                int length = mo8070g.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 < length) {
                                        if (com.google.android.gms.common.internal.Objects.m8123a(mo8070g[i5], feature)) {
                                            z = i5 >= 0;
                                        } else {
                                            i5++;
                                        }
                                    }
                                }
                                if (z) {
                                    arrayList.add(zaiVar);
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            zai zaiVar2 = (zai) arrayList.get(i6);
                            zabqVar7.f15524a.remove(zaiVar2);
                            zaiVar2.mo8073b(new UnsupportedApiCallException(feature));
                        }
                    }
                }
                return true;
            case 17:
                m7988f();
                return true;
            case 18:
                zace zaceVar = (zace) message.obj;
                if (zaceVar.f15557c == 0) {
                    TelemetryData telemetryData = new TelemetryData(zaceVar.f15556b, Arrays.asList(zaceVar.f15555a));
                    if (this.f15417e == null) {
                        this.f15417e = new com.google.android.gms.common.internal.service.zao(this.f15418f, TelemetryLoggingOptions.f15748c);
                    }
                    this.f15417e.mo8137b(telemetryData);
                } else {
                    TelemetryData telemetryData2 = this.f15416d;
                    if (telemetryData2 != null) {
                        List<MethodInvocation> list = telemetryData2.f15747c;
                        if (telemetryData2.f15746b != zaceVar.f15556b || (list != null && list.size() >= zaceVar.f15558d)) {
                            this.f15427o.removeMessages(17);
                            m7988f();
                        } else {
                            TelemetryData telemetryData3 = this.f15416d;
                            MethodInvocation methodInvocation = zaceVar.f15555a;
                            if (telemetryData3.f15747c == null) {
                                telemetryData3.f15747c = new ArrayList();
                            }
                            telemetryData3.f15747c.add(methodInvocation);
                        }
                    }
                    if (this.f15416d == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(zaceVar.f15555a);
                        this.f15416d = new TelemetryData(zaceVar.f15556b, arrayList2);
                        Handler handler2 = this.f15427o;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), zaceVar.f15557c);
                    }
                }
                return true;
            case 19:
                this.f15415c = false;
                return true;
            default:
                C0576a.m4123v(31, "Unknown message id: ", i2, "GoogleApiManager");
                return false;
        }
    }

    /* renamed from: i */
    public final void m7990i(@NonNull ConnectionResult connectionResult, int i2) {
        if (m7986c(connectionResult, i2)) {
            return;
        }
        Handler handler = this.f15427o;
        handler.sendMessage(handler.obtainMessage(5, i2, 0, connectionResult));
    }
}
