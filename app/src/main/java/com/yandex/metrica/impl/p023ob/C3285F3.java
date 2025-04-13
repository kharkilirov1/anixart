package com.yandex.metrica.impl.p023ob;

import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.yandex.metrica.impl.ob.F3 */
/* loaded from: classes2.dex */
public class C3285F3 {

    /* renamed from: a */
    private final C4375vn f42854a;

    /* renamed from: b */
    private final BlockingQueue<b> f42855b = new LinkedBlockingQueue();

    /* renamed from: c */
    private ConcurrentHashMap<Class, CopyOnWriteArrayList<C3385J3<? extends C3335H3>>> f42856c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private WeakHashMap<Object, CopyOnWriteArrayList<d>> f42857d = new WeakHashMap<>();

    /* renamed from: e */
    private ConcurrentHashMap<Class, C3335H3> f42858e = new ConcurrentHashMap<>();

    /* renamed from: com.yandex.metrica.impl.ob.F3$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                Objects.requireNonNull(C3285F3.this);
                try {
                    ((b) C3285F3.this.f42855b.take()).m18029a();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.F3$b */
    public static class b {

        /* renamed from: a */
        private final C3335H3 f42860a;

        /* renamed from: b */
        private final C3385J3<? extends C3335H3> f42861b;

        public /* synthetic */ b(C3335H3 c3335h3, C3385J3 c3385j3, a aVar) {
            this(c3335h3, c3385j3);
        }

        /* renamed from: a */
        public void m18029a() {
            try {
                if (this.f42861b.m18379a(this.f42860a)) {
                    return;
                }
                this.f42861b.m18380b(this.f42860a);
            } catch (Throwable unused) {
            }
        }

        private b(C3335H3 c3335h3, C3385J3<? extends C3335H3> c3385j3) {
            this.f42860a = c3335h3;
            this.f42861b = c3385j3;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.F3$c */
    public static final class c {

        /* renamed from: a */
        private static final C3285F3 f42862a = new C3285F3();
    }

    /* renamed from: com.yandex.metrica.impl.ob.F3$d */
    public static class d {

        /* renamed from: a */
        public final CopyOnWriteArrayList<C3385J3<? extends C3335H3>> f42863a;

        /* renamed from: b */
        public final C3385J3<? extends C3335H3> f42864b;

        public /* synthetic */ d(CopyOnWriteArrayList copyOnWriteArrayList, C3385J3 c3385j3, a aVar) {
            this(copyOnWriteArrayList, c3385j3);
        }

        public void finalize() throws Throwable {
            super.finalize();
            this.f42863a.remove(this.f42864b);
        }

        private d(CopyOnWriteArrayList<C3385J3<? extends C3335H3>> copyOnWriteArrayList, C3385J3<? extends C3335H3> c3385j3) {
            this.f42863a = copyOnWriteArrayList;
            this.f42864b = c3385j3;
        }
    }

    @VisibleForTesting
    public C3285F3() {
        C4375vn m21117a = ThreadFactoryC4401wn.m21117a("YMM-BD", new a());
        this.f42854a = m21117a;
        m21117a.start();
    }

    /* renamed from: a */
    public static final C3285F3 m18024a() {
        return c.f42862a;
    }

    /* renamed from: a */
    public synchronized void m18026a(C3335H3 c3335h3) {
        synchronized (this) {
            CopyOnWriteArrayList<C3385J3<? extends C3335H3>> copyOnWriteArrayList = this.f42856c.get(c3335h3.getClass());
            if (copyOnWriteArrayList != null) {
                Iterator<C3385J3<? extends C3335H3>> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    this.f42855b.add(new b(c3335h3, it.next(), null));
                }
            }
        }
        this.f42858e.put(c3335h3.getClass(), c3335h3);
    }

    /* renamed from: a */
    public synchronized void m18028a(Object obj, Class cls, C3385J3<? extends C3335H3> c3385j3) {
        CopyOnWriteArrayList<C3385J3<? extends C3335H3>> copyOnWriteArrayList = this.f42856c.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f42856c.put(cls, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(c3385j3);
        CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.f42857d.get(obj);
        if (copyOnWriteArrayList2 == null) {
            copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            this.f42857d.put(obj, copyOnWriteArrayList2);
        }
        a aVar = null;
        copyOnWriteArrayList2.add(new d(copyOnWriteArrayList, c3385j3, aVar));
        C3335H3 c3335h3 = this.f42858e.get(cls);
        if (c3335h3 != null) {
            this.f42855b.add(new b(c3335h3, c3385j3, aVar));
        }
    }

    /* renamed from: a */
    public synchronized void m18027a(Object obj) {
        CopyOnWriteArrayList<d> remove = this.f42857d.remove(obj);
        if (remove != null) {
            for (d dVar : remove) {
                dVar.f42863a.remove(dVar.f42864b);
            }
        }
    }
}
