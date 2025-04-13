package com.yandex.metrica.impl.p023ob;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.qm */
/* loaded from: classes2.dex */
public class C4244qm<T> {

    /* renamed from: a */
    @Nullable
    private T f46251a;

    /* renamed from: b */
    @NonNull
    private final InterfaceExecutorC4297sn f46252b;

    /* renamed from: c */
    private final List<InterfaceC3757Y1<T>> f46253c = new ArrayList();

    /* renamed from: com.yandex.metrica.impl.ob.qm$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC3757Y1 f46254a;

        public a(InterfaceC3757Y1 interfaceC3757Y1) {
            this.f46254a = interfaceC3757Y1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            synchronized (C4244qm.this) {
                Object obj = C4244qm.this.f46251a;
                if (obj == null) {
                    C4244qm.this.f46253c.add(this.f46254a);
                } else {
                    this.f46254a.mo17914b(obj);
                }
            }
        }
    }

    @AnyThread
    public C4244qm(@NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        this.f46252b = interfaceExecutorC4297sn;
    }

    @AnyThread
    /* renamed from: a */
    public void m20604a(@NonNull InterfaceC3757Y1<T> interfaceC3757Y1) {
        ((C4271rn) this.f46252b).execute(new a(interfaceC3757Y1));
    }

    @WorkerThread
    /* renamed from: a */
    public synchronized void m20605a(@NonNull T t) {
        this.f46251a = t;
        Iterator<InterfaceC3757Y1<T>> it = this.f46253c.iterator();
        while (it.hasNext()) {
            it.next().mo17914b(t);
        }
        this.f46253c.clear();
    }
}
