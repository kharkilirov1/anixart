package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.yandex.mobile.ads.impl.w */
/* loaded from: classes3.dex */
final class C5948w implements InterfaceC5830u {

    /* renamed from: f */
    private static final Object f55964f = new Object();

    /* renamed from: g */
    private static volatile C5948w f55965g;

    /* renamed from: d */
    private boolean f55969d;

    /* renamed from: a */
    private final Object f55966a = new Object();

    /* renamed from: b */
    @NonNull
    private final WeakHashMap f55967b = new WeakHashMap();

    /* renamed from: c */
    @NonNull
    private final WeakHashMap f55968c = new WeakHashMap();

    /* renamed from: e */
    private final Application.ActivityLifecycleCallbacks f55970e = new a();

    /* renamed from: com.yandex.mobile.ads.impl.w$a */
    public class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @NonNull
        /* renamed from: a */
        private HashSet m29355a(@NonNull WeakHashMap weakHashMap) {
            HashSet hashSet;
            synchronized (C5948w.this.f55966a) {
                Set keySet = weakHashMap.keySet();
                hashSet = new HashSet(keySet.size());
                for (Object obj : keySet) {
                    if (obj != null) {
                        hashSet.add(obj);
                    }
                }
            }
            return hashSet;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
            Iterator it = m29355a(C5948w.this.f55968c).iterator();
            while (it.hasNext()) {
                ((ex0) it.next()).mo24276a(activity, bundle);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@NonNull Activity activity) {
            Iterator it = m29355a(C5948w.this.f55967b).iterator();
            while (it.hasNext()) {
                ((InterfaceC4996e0) it.next()).mo23985a(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@NonNull Activity activity) {
            Iterator it = m29355a(C5948w.this.f55967b).iterator();
            while (it.hasNext()) {
                ((InterfaceC4996e0) it.next()).mo23986b(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(@NonNull Activity activity, @Nullable Bundle bundle) {
            Iterator it = m29355a(C5948w.this.f55968c).iterator();
            while (it.hasNext()) {
                ((ex0) it.next()).mo24277b(activity, bundle);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(@NonNull Activity activity) {
            C5948w.this.m29351a(activity);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5830u
    /* renamed from: b */
    public final void mo28809b(@NonNull Context context, @NonNull InterfaceC4996e0 interfaceC4996e0) {
        boolean z;
        synchronized (this.f55966a) {
            this.f55967b.put(interfaceC4996e0, null);
            synchronized (this.f55966a) {
                z = this.f55969d;
            }
            if (!z) {
                try {
                    ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this.f55970e);
                    this.f55969d = true;
                } catch (Throwable th) {
                    n60.m26808a(th, "Can't register ActivityLifecycleCallbacks. Context can't be cast to Application", new Object[0]);
                }
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public static C5948w m29349a() {
        if (f55965g == null) {
            synchronized (f55964f) {
                if (f55965g == null) {
                    f55965g = new C5948w();
                }
            }
        }
        return f55965g;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5830u
    /* renamed from: a */
    public final void mo28807a(@NonNull Context context, @NonNull InterfaceC4996e0 interfaceC4996e0) {
        synchronized (this.f55966a) {
            this.f55967b.remove(interfaceC4996e0);
            m29351a(context);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5830u
    /* renamed from: a */
    public final void mo28808a(@NonNull Context context, @NonNull ex0 ex0Var) {
        synchronized (this.f55966a) {
            this.f55968c.remove(ex0Var);
            m29351a(context);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5830u
    /* renamed from: b */
    public final void mo28810b(@NonNull Context context, @NonNull ex0 ex0Var) {
        boolean z;
        synchronized (this.f55966a) {
            this.f55968c.put(ex0Var, null);
            synchronized (this.f55966a) {
                z = this.f55969d;
            }
            if (!z) {
                try {
                    ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this.f55970e);
                    this.f55969d = true;
                } catch (Throwable th) {
                    n60.m26808a(th, "Can't register ActivityLifecycleCallbacks. Context can't be cast to Application", new Object[0]);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m29351a(@NonNull Context context) {
        boolean z;
        synchronized (this.f55966a) {
            if (this.f55967b.isEmpty() && this.f55968c.isEmpty()) {
                try {
                    synchronized (this.f55966a) {
                        z = this.f55969d;
                    }
                    if (z) {
                        ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f55970e);
                        this.f55969d = false;
                    }
                } catch (Throwable th) {
                    n60.m26808a(th, "Can't unregister ActivityLifecycleCallbacks. Context can't be cast to Application", new Object[0]);
                }
            }
        }
    }
}
