package com.yandex.metrica.impl.p023ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.C3130i;
import com.yandex.metrica.C4483l;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.yandex.metrica.impl.ob.l3 */
/* loaded from: classes2.dex */
public class C4095l3 implements InterfaceC3756Y0 {

    /* renamed from: f */
    @Nullable
    @SuppressLint
    private static volatile C4095l3 f45855f = null;

    /* renamed from: g */
    private static volatile boolean f45856g = false;

    /* renamed from: a */
    @NonNull
    private final Context f45857a;

    /* renamed from: b */
    @NonNull
    private final C4069k3 f45858b;

    /* renamed from: c */
    @NonNull
    private final FutureTask<InterfaceC3885d1> f45859c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC3859c1 f45860d;

    /* renamed from: e */
    @NonNull
    private final C4245qn f45861e;

    /* renamed from: com.yandex.metrica.impl.ob.l3$a */
    public class a implements Callable<InterfaceC3885d1> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public InterfaceC3885d1 call() throws Exception {
            return C4095l3.m20317a(C4095l3.this);
        }
    }

    private C4095l3(@NonNull Context context, @NonNull C4069k3 c4069k3, @NonNull C4245qn c4245qn) {
        this(context, c4069k3, c4069k3.m20228a(context, c4245qn), c4245qn);
    }

    @NonNull
    @AnyThread
    /* renamed from: a */
    public static C4095l3 m20318a(@NonNull Context context) {
        if (f45855f == null) {
            synchronized (C4095l3.class) {
                if (f45855f == null) {
                    f45855f = new C4095l3(context.getApplicationContext(), new C4069k3(), C3755Y.m19410g().m19414d());
                    C4095l3 c4095l3 = f45855f;
                    c4095l3.f45861e.m20607b().execute(new RunnableC4121m3(c4095l3));
                }
            }
        }
        return f45855f;
    }

    @AnyThread
    /* renamed from: f */
    private static InterfaceC4379w1 m20327f() {
        return m20330i() ? f45855f.m20328g() : C3755Y.m19410g().m19416f();
    }

    @NonNull
    @AnyThread
    /* renamed from: g */
    private InterfaceC3885d1 m20328g() {
        try {
            return this.f45859c.get();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    @AnyThread
    /* renamed from: h */
    public static synchronized boolean m20329h() {
        boolean z;
        synchronized (C4095l3.class) {
            z = f45856g;
        }
        return z;
    }

    @AnyThread
    /* renamed from: i */
    public static synchronized boolean m20330i() {
        boolean z;
        synchronized (C4095l3.class) {
            if (f45855f != null && f45855f.f45859c.isDone()) {
                z = f45855f.m20328g().mo18768d() != null;
            }
        }
        return z;
    }

    @AnyThread
    /* renamed from: j */
    public static synchronized void m20331j() {
        synchronized (C4095l3.class) {
            f45856g = true;
        }
    }

    @Nullable
    @AnyThread
    /* renamed from: k */
    public static C4095l3 m20332k() {
        return f45855f;
    }

    @Nullable
    @WorkerThread
    /* renamed from: d */
    public C4301t1 m20344d() {
        return m20328g().mo18768d();
    }

    @NonNull
    @AnyThread
    /* renamed from: e */
    public InterfaceC4104lc m20345e() {
        return this.f45860d.mo18692d();
    }

    @WorkerThread
    /* renamed from: b */
    public static void m20324b(boolean z) {
        m20327f().mo18459a(z);
    }

    @WorkerThread
    /* renamed from: c */
    public static void m20326c(boolean z) {
        m20327f().setStatisticsSending(z);
    }

    @VisibleForTesting
    public C4095l3(@NonNull Context context, @NonNull C4069k3 c4069k3, @NonNull InterfaceC3859c1 interfaceC3859c1, @NonNull C4245qn c4245qn) {
        this.f45857a = context;
        this.f45858b = c4069k3;
        this.f45860d = interfaceC3859c1;
        this.f45861e = c4245qn;
        FutureTask<InterfaceC3885d1> futureTask = new FutureTask<>(new a());
        this.f45859c = futureTask;
        c4245qn.m20607b().execute(futureTask);
    }

    @AnyThread
    /* renamed from: b */
    public void m20341b(@NonNull C4483l c4483l) {
        this.f45860d.mo18688a(c4483l, this);
    }

    @WorkerThread
    /* renamed from: c */
    public void m20343c(@NonNull C3130i c3130i) {
        m20328g().mo18767c(c3130i);
    }

    @WorkerThread
    /* renamed from: b */
    public void m20340b(@NonNull YandexMetricaConfig yandexMetricaConfig, @NonNull C4483l c4483l) {
        m20328g().mo18765a(yandexMetricaConfig, c4483l);
    }

    @Nullable
    @AnyThread
    /* renamed from: c */
    public String m20342c() {
        return m20328g().mo18766c();
    }

    @WorkerThread
    /* renamed from: b */
    public void m20339b(@NonNull AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        m20328g().mo18761a(appMetricaDeviceIDListener);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3756Y0
    @NonNull
    /* renamed from: b */
    public InterfaceC3731X0 mo18639b() {
        return m20328g().mo18639b();
    }

    @WorkerThread
    /* renamed from: a */
    public static void m20319a(@Nullable Location location) {
        m20327f().mo18452a(location);
    }

    @WorkerThread
    /* renamed from: a */
    public static void m20322a(boolean z) {
        m20327f().mo18462b(z);
    }

    @WorkerThread
    /* renamed from: a */
    public static void m20321a(String str, String str2) {
        m20327f().mo18354c(str, str2);
    }

    @WorkerThread
    /* renamed from: a */
    public static void m20320a(@Nullable String str) {
        m20327f().setUserProfileID(str);
    }

    @WorkerThread
    /* renamed from: a */
    public void m20336a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        m20328g().mo18763a(deferredDeeplinkParametersListener);
    }

    @WorkerThread
    /* renamed from: a */
    public void m20335a(DeferredDeeplinkListener deferredDeeplinkListener) {
        m20328g().mo18762a(deferredDeeplinkListener);
    }

    @NonNull
    @WorkerThread
    /* renamed from: a */
    public InterfaceC3706W0 m20333a(@NonNull C3130i c3130i) {
        return m20328g().mo18759a(c3130i);
    }

    @Nullable
    @AnyThread
    /* renamed from: a */
    public String m20334a() {
        return m20328g().mo18760a();
    }

    @WorkerThread
    /* renamed from: a */
    public void m20337a(@NonNull IIdentifierCallback iIdentifierCallback, @NonNull List<String> list) {
        m20328g().mo18764a(iIdentifierCallback, list);
    }

    @WorkerThread
    /* renamed from: a */
    public void m20338a(@Nullable Map<String, Object> map) {
        this.f45860d.mo18689a(map);
    }

    /* renamed from: a */
    public static InterfaceC3885d1 m20317a(C4095l3 c4095l3) {
        return c4095l3.f45858b.m20229a(c4095l3.f45857a, c4095l3.f45860d);
    }
}
