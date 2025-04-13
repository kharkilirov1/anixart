package com.yandex.metrica.impl.p023ob;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.impl.p023ob.C4429y;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.x */
/* loaded from: classes2.dex */
public class C4403x implements C4429y.b {

    /* renamed from: a */
    @NonNull
    private final Set<b> f46905a = new HashSet();

    /* renamed from: b */
    @NonNull
    private final InterfaceExecutorC4297sn f46906b;

    /* renamed from: com.yandex.metrica.impl.ob.x$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Activity f46907a;

        public a(Activity activity) {
            this.f46907a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4403x.this.m21122a(this.f46907a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.x$b */
    public interface b {
        @WorkerThread
        /* renamed from: a */
        void mo21124a(@NonNull Activity activity);
    }

    public C4403x(@NonNull C4429y c4429y, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        this.f46906b = interfaceExecutorC4297sn;
        c4429y.m21170a(this, new C4429y.a[0]);
    }

    /* renamed from: a */
    public synchronized void m21123a(@NonNull b bVar) {
        this.f46905a.add(bVar);
    }

    /* renamed from: a */
    public void m21122a(@NonNull Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f46905a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((b) it.next()).mo21124a(activity);
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.C4429y.b
    @MainThread
    /* renamed from: a */
    public void mo17912a(@NonNull Activity activity, @NonNull C4429y.a aVar) {
        ((C4271rn) this.f46906b).execute(new a(activity));
    }
}
