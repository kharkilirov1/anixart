package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public abstract class BaseGmsClient<T extends IInterface> {

    /* renamed from: C */
    public static final Feature[] f15649C = new Feature[0];

    /* renamed from: b */
    public int f15652b;

    /* renamed from: c */
    public long f15653c;

    /* renamed from: d */
    public long f15654d;

    /* renamed from: e */
    public int f15655e;

    /* renamed from: f */
    public long f15656f;

    /* renamed from: h */
    @VisibleForTesting
    public zzu f15658h;

    /* renamed from: i */
    public final Context f15659i;

    /* renamed from: j */
    public final GmsClientSupervisor f15660j;

    /* renamed from: k */
    public final Handler f15661k;

    /* renamed from: n */
    @Nullable
    @GuardedBy
    public IGmsServiceBroker f15664n;

    /* renamed from: o */
    @NonNull
    @VisibleForTesting
    public ConnectionProgressReportCallbacks f15665o;

    /* renamed from: p */
    @Nullable
    @GuardedBy
    public T f15666p;

    /* renamed from: r */
    @Nullable
    @GuardedBy
    public zze f15668r;

    /* renamed from: t */
    @Nullable
    public final BaseConnectionCallbacks f15670t;

    /* renamed from: u */
    @Nullable
    public final BaseOnConnectionFailedListener f15671u;

    /* renamed from: v */
    public final int f15672v;

    /* renamed from: w */
    @Nullable
    public final String f15673w;

    /* renamed from: x */
    @Nullable
    public volatile String f15674x;

    /* renamed from: g */
    @Nullable
    public volatile String f15657g = null;

    /* renamed from: l */
    public final Object f15662l = new Object();

    /* renamed from: m */
    public final Object f15663m = new Object();

    /* renamed from: q */
    public final ArrayList<zzc<?>> f15667q = new ArrayList<>();

    /* renamed from: s */
    @GuardedBy
    public int f15669s = 1;

    /* renamed from: y */
    @Nullable
    public ConnectionResult f15675y = null;

    /* renamed from: z */
    public boolean f15676z = false;

    /* renamed from: A */
    @Nullable
    public volatile zzj f15650A = null;

    /* renamed from: B */
    @NonNull
    @VisibleForTesting
    public AtomicInteger f15651B = new AtomicInteger(0);

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    @KeepForSdk
    public interface BaseConnectionCallbacks {
        @KeepForSdk
        /* renamed from: i */
        void mo8112i(int i2);

        @KeepForSdk
        /* renamed from: t */
        void mo8113t(@Nullable Bundle bundle);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    @KeepForSdk
    public interface BaseOnConnectionFailedListener {
        @KeepForSdk
        /* renamed from: q */
        void mo8114q(@NonNull ConnectionResult connectionResult);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    @KeepForSdk
    public interface ConnectionProgressReportCallbacks {
        @KeepForSdk
        /* renamed from: a */
        void mo8025a(@NonNull ConnectionResult connectionResult);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public class LegacyClientCallbackAdapter implements ConnectionProgressReportCallbacks {
        @KeepForSdk
        public LegacyClientCallbackAdapter() {
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        /* renamed from: a */
        public final void mo8025a(@NonNull ConnectionResult connectionResult) {
            if (connectionResult.m7914n()) {
                BaseGmsClient baseGmsClient = BaseGmsClient.this;
                baseGmsClient.m8097c(null, baseGmsClient.mo8110x());
            } else {
                BaseOnConnectionFailedListener baseOnConnectionFailedListener = BaseGmsClient.this.f15671u;
                if (baseOnConnectionFailedListener != null) {
                    baseOnConnectionFailedListener.mo8114q(connectionResult);
                }
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    @KeepForSdk
    public interface SignOutCallbacks {
        @KeepForSdk
        /* renamed from: a */
        void mo8046a();
    }

    @VisibleForTesting
    @KeepForSdk
    public BaseGmsClient(@NonNull Context context, @NonNull Looper looper, @NonNull GmsClientSupervisor gmsClientSupervisor, @NonNull GoogleApiAvailabilityLight googleApiAvailabilityLight, int i2, @Nullable BaseConnectionCallbacks baseConnectionCallbacks, @Nullable BaseOnConnectionFailedListener baseOnConnectionFailedListener, @Nullable String str) {
        Preconditions.m8132g(context, "Context must not be null");
        this.f15659i = context;
        Preconditions.m8132g(looper, "Looper must not be null");
        Preconditions.m8132g(gmsClientSupervisor, "Supervisor must not be null");
        this.f15660j = gmsClientSupervisor;
        Preconditions.m8132g(googleApiAvailabilityLight, "API availability must not be null");
        this.f15661k = new zzb(this, looper);
        this.f15672v = i2;
        this.f15670t = baseConnectionCallbacks;
        this.f15671u = baseOnConnectionFailedListener;
        this.f15673w = str;
    }

    /* renamed from: F */
    public static /* bridge */ /* synthetic */ void m8088F(BaseGmsClient baseGmsClient, int i2) {
        int i3;
        int i4;
        synchronized (baseGmsClient.f15662l) {
            i3 = baseGmsClient.f15669s;
        }
        if (i3 == 3) {
            baseGmsClient.f15676z = true;
            i4 = 5;
        } else {
            i4 = 4;
        }
        Handler handler = baseGmsClient.f15661k;
        handler.sendMessage(handler.obtainMessage(i4, baseGmsClient.f15651B.get(), 16));
    }

    /* renamed from: G */
    public static /* bridge */ /* synthetic */ boolean m8089G(BaseGmsClient baseGmsClient, int i2, int i3, IInterface iInterface) {
        synchronized (baseGmsClient.f15662l) {
            if (baseGmsClient.f15669s != i2) {
                return false;
            }
            baseGmsClient.m8095I(i3, iInterface);
            return true;
        }
    }

    /* renamed from: H */
    public static /* bridge */ /* synthetic */ boolean m8090H(BaseGmsClient baseGmsClient) {
        if (baseGmsClient.f15676z || TextUtils.isEmpty(baseGmsClient.mo7879z()) || TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            Class.forName(baseGmsClient.mo7879z());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @NonNull
    @KeepForSdk
    /* renamed from: A */
    public abstract String mo7876A();

    @KeepForSdk
    /* renamed from: B */
    public boolean mo8091B() {
        return mo7877l() >= 211700000;
    }

    @KeepForSdk
    @CallSuper
    /* renamed from: C */
    public void m8092C(@NonNull ConnectionResult connectionResult) {
        this.f15655e = connectionResult.f15315c;
        this.f15656f = System.currentTimeMillis();
    }

    @KeepForSdk
    /* renamed from: D */
    public boolean mo8093D() {
        return this instanceof com.google.android.gms.internal.appset.zzd;
    }

    @NonNull
    /* renamed from: E */
    public final String m8094E() {
        String str = this.f15673w;
        return str == null ? this.f15659i.getClass().getName() : str;
    }

    /* renamed from: I */
    public final void m8095I(int i2, @Nullable T t) {
        zzu zzuVar;
        Preconditions.m8126a((i2 == 4) == (t != null));
        synchronized (this.f15662l) {
            this.f15669s = i2;
            this.f15666p = t;
            if (i2 == 1) {
                zze zzeVar = this.f15668r;
                if (zzeVar != null) {
                    GmsClientSupervisor gmsClientSupervisor = this.f15660j;
                    String str = this.f15658h.f15829a;
                    java.util.Objects.requireNonNull(str, "null reference");
                    zzu zzuVar2 = this.f15658h;
                    String str2 = zzuVar2.f15830b;
                    int i3 = zzuVar2.f15831c;
                    String m8094E = m8094E();
                    boolean z = this.f15658h.f15832d;
                    java.util.Objects.requireNonNull(gmsClientSupervisor);
                    gmsClientSupervisor.mo8117b(new zzn(str, str2, i3, z), zzeVar, m8094E);
                    this.f15668r = null;
                }
            } else if (i2 == 2 || i2 == 3) {
                zze zzeVar2 = this.f15668r;
                if (zzeVar2 != null && (zzuVar = this.f15658h) != null) {
                    String str3 = zzuVar.f15829a;
                    String str4 = zzuVar.f15830b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 70 + String.valueOf(str4).length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(str3);
                    sb.append(" on ");
                    sb.append(str4);
                    Log.e("GmsClient", sb.toString());
                    GmsClientSupervisor gmsClientSupervisor2 = this.f15660j;
                    String str5 = this.f15658h.f15829a;
                    java.util.Objects.requireNonNull(str5, "null reference");
                    zzu zzuVar3 = this.f15658h;
                    String str6 = zzuVar3.f15830b;
                    int i4 = zzuVar3.f15831c;
                    String m8094E2 = m8094E();
                    boolean z2 = this.f15658h.f15832d;
                    java.util.Objects.requireNonNull(gmsClientSupervisor2);
                    gmsClientSupervisor2.mo8117b(new zzn(str5, str6, i4, z2), zzeVar2, m8094E2);
                    this.f15651B.incrementAndGet();
                }
                zze zzeVar3 = new zze(this, this.f15651B.get());
                this.f15668r = zzeVar3;
                String mo7876A = mo7876A();
                Object obj = GmsClientSupervisor.f15716a;
                boolean mo8091B = mo8091B();
                this.f15658h = new zzu("com.google.android.gms", mo7876A, 4225, mo8091B);
                if (mo8091B && mo7877l() < 17895000) {
                    String valueOf = String.valueOf(this.f15658h.f15829a);
                    throw new IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                }
                GmsClientSupervisor gmsClientSupervisor3 = this.f15660j;
                String str7 = this.f15658h.f15829a;
                java.util.Objects.requireNonNull(str7, "null reference");
                zzu zzuVar4 = this.f15658h;
                if (!gmsClientSupervisor3.mo8118c(new zzn(str7, zzuVar4.f15830b, zzuVar4.f15831c, this.f15658h.f15832d), zzeVar3, m8094E(), mo8108v())) {
                    zzu zzuVar5 = this.f15658h;
                    String str8 = zzuVar5.f15829a;
                    String str9 = zzuVar5.f15830b;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str8).length() + 34 + String.valueOf(str9).length());
                    sb2.append("unable to connect to service: ");
                    sb2.append(str8);
                    sb2.append(" on ");
                    sb2.append(str9);
                    Log.w("GmsClient", sb2.toString());
                    int i5 = this.f15651B.get();
                    Handler handler = this.f15661k;
                    handler.sendMessage(handler.obtainMessage(7, i5, -1, new zzg(this, 16)));
                }
            } else if (i2 == 4) {
                java.util.Objects.requireNonNull(t, "null reference");
                this.f15654d = System.currentTimeMillis();
            }
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public void m8096b() {
        this.f15651B.incrementAndGet();
        synchronized (this.f15667q) {
            int size = this.f15667q.size();
            for (int i2 = 0; i2 < size; i2++) {
                zzc<?> zzcVar = this.f15667q.get(i2);
                synchronized (zzcVar) {
                    zzcVar.f15795a = null;
                }
            }
            this.f15667q.clear();
        }
        synchronized (this.f15663m) {
            this.f15664n = null;
        }
        m8095I(1, null);
    }

    @KeepForSdk
    @WorkerThread
    /* renamed from: c */
    public void m8097c(@Nullable IAccountAccessor iAccountAccessor, @NonNull Set<Scope> set) {
        Bundle mo8109w = mo8109w();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.f15672v, this.f15674x);
        getServiceRequest.f15702e = this.f15659i.getPackageName();
        getServiceRequest.f15705h = mo8109w;
        if (set != null) {
            getServiceRequest.f15704g = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo7946q()) {
            Account mo8106t = mo8106t();
            if (mo8106t == null) {
                mo8106t = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.f15706i = mo8106t;
            if (iAccountAccessor != null) {
                getServiceRequest.f15703f = iAccountAccessor.asBinder();
            }
        }
        getServiceRequest.f15707j = f15649C;
        getServiceRequest.f15708k = mo8107u();
        if (mo8093D()) {
            getServiceRequest.f15711n = true;
        }
        try {
            synchronized (this.f15663m) {
                IGmsServiceBroker iGmsServiceBroker = this.f15664n;
                if (iGmsServiceBroker != null) {
                    iGmsServiceBroker.mo8122j0(new zzd(this, this.f15651B.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            Handler handler = this.f15661k;
            handler.sendMessage(handler.obtainMessage(6, this.f15651B.get(), 3));
        } catch (RemoteException e3) {
            e = e3;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i2 = this.f15651B.get();
            Handler handler2 = this.f15661k;
            handler2.sendMessage(handler2.obtainMessage(1, i2, -1, new zzf(this, 8, null, null)));
        } catch (SecurityException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i22 = this.f15651B.get();
            Handler handler22 = this.f15661k;
            handler22.sendMessage(handler22.obtainMessage(1, i22, -1, new zzf(this, 8, null, null)));
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public void mo7937d(@NonNull String str) {
        this.f15657g = str;
        m8096b();
    }

    @KeepForSdk
    /* renamed from: e */
    public boolean m8098e() {
        boolean z;
        synchronized (this.f15662l) {
            int i2 = this.f15669s;
            z = true;
            if (i2 != 2 && i2 != 3) {
                z = false;
            }
        }
        return z;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: f */
    public String m8099f() {
        zzu zzuVar;
        if (!m8102i() || (zzuVar = this.f15658h) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return zzuVar.f15830b;
    }

    @KeepForSdk
    /* renamed from: g */
    public void m8100g(@NonNull ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        Preconditions.m8132g(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.f15665o = connectionProgressReportCallbacks;
        m8095I(2, null);
    }

    @KeepForSdk
    /* renamed from: h */
    public void m8101h(@NonNull SignOutCallbacks signOutCallbacks) {
        signOutCallbacks.mo8046a();
    }

    @KeepForSdk
    /* renamed from: i */
    public boolean m8102i() {
        boolean z;
        synchronized (this.f15662l) {
            z = this.f15669s == 4;
        }
        return z;
    }

    @KeepForSdk
    /* renamed from: j */
    public boolean m8103j() {
        return true;
    }

    @KeepForSdk
    /* renamed from: l */
    public int mo7877l() {
        return GoogleApiAvailabilityLight.f15327a;
    }

    @Nullable
    @KeepForSdk
    /* renamed from: m */
    public final Feature[] m8104m() {
        zzj zzjVar = this.f15650A;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.f15806c;
    }

    @Nullable
    @KeepForSdk
    /* renamed from: p */
    public String m8105p() {
        return this.f15657g;
    }

    @KeepForSdk
    /* renamed from: q */
    public boolean mo7946q() {
        return false;
    }

    @Nullable
    @KeepForSdk
    /* renamed from: s */
    public abstract T mo7878s(@NonNull IBinder iBinder);

    @Nullable
    @KeepForSdk
    /* renamed from: t */
    public Account mo8106t() {
        return null;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: u */
    public Feature[] mo8107u() {
        return f15649C;
    }

    @Nullable
    @KeepForSdk
    /* renamed from: v */
    public Executor mo8108v() {
        return null;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: w */
    public Bundle mo8109w() {
        return new Bundle();
    }

    @NonNull
    @KeepForSdk
    /* renamed from: x */
    public Set<Scope> mo8110x() {
        return Collections.emptySet();
    }

    @NonNull
    @KeepForSdk
    /* renamed from: y */
    public final T m8111y() throws DeadObjectException {
        T t;
        synchronized (this.f15662l) {
            try {
                if (this.f15669s == 5) {
                    throw new DeadObjectException();
                }
                if (!m8102i()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                t = this.f15666p;
                Preconditions.m8132g(t, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: z */
    public abstract String mo7879z();
}
