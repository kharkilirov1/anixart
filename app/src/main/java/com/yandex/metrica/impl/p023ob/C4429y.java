package com.yandex.metrica.impl.p023ob;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.y */
/* loaded from: classes2.dex */
public class C4429y extends C4274s0 {

    /* renamed from: a */
    @Nullable
    private Application f46955a;

    /* renamed from: b */
    @NonNull
    private volatile c f46956b = c.NOT_WATCHING_YET;

    /* renamed from: c */
    @NonNull
    private final C3803Zm<a, b> f46957c = new C3803Zm<>(true);

    /* renamed from: com.yandex.metrica.impl.ob.y$a */
    public enum a {
        CREATED,
        RESUMED,
        PAUSED,
        STARTED,
        STOPPED,
        DESTROYED
    }

    /* renamed from: com.yandex.metrica.impl.ob.y$b */
    public interface b {
        @MainThread
        /* renamed from: a */
        void mo17912a(@NonNull Activity activity, @NonNull a aVar);
    }

    /* renamed from: com.yandex.metrica.impl.ob.y$c */
    public enum c {
        WATCHING(null),
        NO_APPLICATION("Bad application object"),
        NOT_WATCHING_YET("Internal inconsistency");


        /* renamed from: a */
        public final String f46969a;

        c(String str) {
            this.f46969a = str;
        }
    }

    @AnyThread
    /* renamed from: b */
    private synchronized void m21166b() {
        c cVar = this.f46956b;
        c cVar2 = c.WATCHING;
        if (cVar != cVar2 && !this.f46957c.m19539b()) {
            if (this.f46955a == null) {
                this.f46956b = c.NO_APPLICATION;
            } else {
                this.f46956b = cVar2;
                this.f46955a.registerActivityLifecycleCallbacks(this);
            }
        }
    }

    @AnyThread
    /* renamed from: a */
    public synchronized void m21169a(@NonNull Context context) {
        if (this.f46955a == null) {
            try {
                this.f46955a = (Application) context.getApplicationContext();
            } catch (Throwable unused) {
            }
        }
        m21166b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        m21165a(a.CREATED, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        m21165a(a.DESTROYED, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public void onActivityPaused(@NonNull Activity activity) {
        m21165a(a.PAUSED, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public void onActivityResumed(@NonNull Activity activity) {
        m21165a(a.RESUMED, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        m21165a(a.STARTED, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
        m21165a(a.STOPPED, activity);
    }

    @AnyThread
    /* renamed from: a */
    public synchronized void m21168a(@NonNull Application application) {
        if (this.f46955a == null) {
            this.f46955a = application;
        }
        m21166b();
    }

    @NonNull
    @AnyThread
    /* renamed from: a */
    public c m21167a() {
        return this.f46956b;
    }

    /* renamed from: a */
    private void m21165a(@NonNull a aVar, @NonNull Activity activity) {
        Collection<b> m19534a;
        synchronized (this) {
            m19534a = this.f46957c.m19534a(aVar);
        }
        if (m19534a != null) {
            Iterator<b> it = m19534a.iterator();
            while (it.hasNext()) {
                it.next().mo17912a(activity, aVar);
            }
        }
    }

    @AnyThread
    /* renamed from: a */
    public synchronized void m21170a(@NonNull b bVar, @Nullable a... aVarArr) {
        if (C3658U2.m19215a((Object[]) aVarArr)) {
            aVarArr = a.values();
        }
        for (a aVar : aVarArr) {
            this.f46957c.m19535a(aVar, bVar);
        }
        m21166b();
    }
}
