package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C4377w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.M0 */
/* loaded from: classes2.dex */
public class C3457M0 {

    /* renamed from: a */
    @NonNull
    private final List<d> f43377a = new ArrayList();

    /* renamed from: b */
    @Nullable
    private C3575Qi f43378b;

    /* renamed from: com.yandex.metrica.impl.ob.M0$b */
    public static class b {

        /* renamed from: a */
        private boolean f43379a = false;

        /* renamed from: b */
        private long f43380b;

        /* renamed from: c */
        private long f43381c;

        /* renamed from: d */
        private long f43382d;

        /* renamed from: e */
        @NonNull
        private final c f43383e;

        public b(@Nullable C3575Qi c3575Qi, @NonNull c cVar, @NonNull String str) {
            this.f43383e = cVar;
            this.f43381c = c3575Qi == null ? 0L : c3575Qi.m18858p();
            this.f43380b = c3575Qi != null ? c3575Qi.m18821B() : 0L;
            this.f43382d = Long.MAX_VALUE;
        }

        /* renamed from: a */
        public void m18542a(long j2, @NonNull TimeUnit timeUnit) {
            this.f43382d = timeUnit.toMillis(j2);
        }

        /* renamed from: b */
        public boolean m18544b() {
            if (this.f43379a) {
                return true;
            }
            c cVar = this.f43383e;
            long j2 = this.f43381c;
            long j3 = this.f43380b;
            long j4 = this.f43382d;
            Objects.requireNonNull(cVar);
            return j3 - j2 >= j4;
        }

        /* renamed from: a */
        public void m18541a() {
            this.f43379a = true;
        }

        /* renamed from: a */
        public void m18543a(@NonNull C3575Qi c3575Qi) {
            this.f43380b = c3575Qi.m18821B();
            this.f43381c = c3575Qi.m18858p();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.M0$c */
    public static class c {
    }

    /* renamed from: com.yandex.metrica.impl.ob.M0$d */
    public static class d {

        /* renamed from: a */
        @NonNull
        private b f43384a;

        /* renamed from: b */
        @NonNull
        private final C4377w.b f43385b;

        /* renamed from: c */
        @NonNull
        private final InterfaceExecutorC4297sn f43386c;

        /* renamed from: a */
        public void m18546a(@NonNull C3575Qi c3575Qi) {
            this.f43384a.m18543a(c3575Qi);
        }

        private d(@NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull C4377w.b bVar, @NonNull b bVar2) {
            this.f43385b = bVar;
            this.f43384a = bVar2;
            this.f43386c = interfaceExecutorC4297sn;
        }

        /* renamed from: a */
        public void m18545a(long j2) {
            this.f43384a.m18542a(j2, TimeUnit.SECONDS);
        }

        /* renamed from: a */
        public boolean m18547a(int i2) {
            if (!this.f43384a.m18544b()) {
                return false;
            }
            this.f43385b.m21072a(TimeUnit.SECONDS.toMillis(i2), this.f43386c);
            this.f43384a.m18541a();
            return true;
        }
    }

    /* renamed from: a */
    public synchronized d m18539a(@NonNull Runnable runnable, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull String str) {
        d dVar;
        C4377w.b bVar = new C4377w.b(runnable, C3532P0.m18696i().m18697a());
        b bVar2 = new b(this.f43378b, new c(), str);
        synchronized (this) {
            dVar = new d(interfaceExecutorC4297sn, bVar, bVar2);
            this.f43377a.add(dVar);
        }
        return dVar;
        return dVar;
    }

    /* renamed from: a */
    public void m18540a(@NonNull C3575Qi c3575Qi) {
        ArrayList arrayList;
        synchronized (this) {
            this.f43378b = c3575Qi;
            arrayList = new ArrayList(this.f43377a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((d) it.next()).m18546a(c3575Qi);
        }
    }
}
