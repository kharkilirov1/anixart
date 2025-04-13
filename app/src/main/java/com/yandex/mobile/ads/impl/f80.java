package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5201hv;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final class f80<T> {

    /* renamed from: a */
    private final InterfaceC4972di f50146a;

    /* renamed from: b */
    private final InterfaceC4944cy f50147b;

    /* renamed from: c */
    private final InterfaceC5064b<T> f50148c;

    /* renamed from: d */
    private final CopyOnWriteArraySet<C5065c<T>> f50149d;

    /* renamed from: e */
    private final ArrayDeque<Runnable> f50150e;

    /* renamed from: f */
    private final ArrayDeque<Runnable> f50151f;

    /* renamed from: g */
    private boolean f50152g;

    /* renamed from: com.yandex.mobile.ads.impl.f80$a */
    public interface InterfaceC5063a<T> {
        void invoke(T t);
    }

    /* renamed from: com.yandex.mobile.ads.impl.f80$b */
    public interface InterfaceC5064b<T> {
        /* renamed from: a */
        void mo23918a(T t, C5201hv c5201hv);
    }

    public f80(Looper looper, InterfaceC4972di interfaceC4972di, InterfaceC5064b<T> interfaceC5064b) {
        this(new CopyOnWriteArraySet(), looper, interfaceC4972di, interfaceC5064b);
    }

    @CheckResult
    /* renamed from: a */
    public final f80<T> m24340a(Looper looper, InterfaceC5064b<T> interfaceC5064b) {
        return new f80<>(this.f50149d, looper, this.f50146a, interfaceC5064b);
    }

    /* renamed from: b */
    public final void m24345b(T t) {
        Iterator<C5065c<T>> it = this.f50149d.iterator();
        while (it.hasNext()) {
            C5065c<T> next = it.next();
            if (next.f50153a.equals(t)) {
                next.m24348b(this.f50148c);
                this.f50149d.remove(next);
            }
        }
    }

    private f80(CopyOnWriteArraySet<C5065c<T>> copyOnWriteArraySet, Looper looper, InterfaceC4972di interfaceC4972di, InterfaceC5064b<T> interfaceC5064b) {
        this.f50146a = interfaceC4972di;
        this.f50149d = copyOnWriteArraySet;
        this.f50148c = interfaceC5064b;
        this.f50150e = new ArrayDeque<>();
        this.f50151f = new ArrayDeque<>();
        this.f50147b = interfaceC4972di.mo23885a(looper, new Handler.Callback() { // from class: com.yandex.mobile.ads.impl.io1
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m24337a;
                m24337a = f80.this.m24337a(message);
                return m24337a;
            }
        });
    }

    /* renamed from: a */
    public final void m24343a(T t) {
        if (this.f50152g) {
            return;
        }
        Objects.requireNonNull(t);
        this.f50149d.add(new C5065c<>(t));
    }

    /* renamed from: com.yandex.mobile.ads.impl.f80$c */
    public static final class C5065c<T> {

        /* renamed from: a */
        public final T f50153a;

        /* renamed from: b */
        private C5201hv.a f50154b = new C5201hv.a();

        /* renamed from: c */
        private boolean f50155c;

        /* renamed from: d */
        private boolean f50156d;

        public C5065c(T t) {
            this.f50153a = t;
        }

        /* renamed from: a */
        public final void m24346a(int i2, InterfaceC5063a<T> interfaceC5063a) {
            if (this.f50156d) {
                return;
            }
            if (i2 != -1) {
                this.f50154b.m25377a(i2);
            }
            this.f50155c = true;
            interfaceC5063a.invoke(this.f50153a);
        }

        /* renamed from: b */
        public final void m24348b(InterfaceC5064b<T> interfaceC5064b) {
            this.f50156d = true;
            if (this.f50155c) {
                interfaceC5064b.mo23918a(this.f50153a, this.f50154b.m25378a());
            }
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5065c.class != obj.getClass()) {
                return false;
            }
            return this.f50153a.equals(((C5065c) obj).f50153a);
        }

        public final int hashCode() {
            return this.f50153a.hashCode();
        }

        /* renamed from: a */
        public final void m24347a(InterfaceC5064b<T> interfaceC5064b) {
            if (this.f50156d || !this.f50155c) {
                return;
            }
            C5201hv m25378a = this.f50154b.m25378a();
            this.f50154b = new C5201hv.a();
            this.f50155c = false;
            interfaceC5064b.mo23918a(this.f50153a, m25378a);
        }
    }

    /* renamed from: b */
    public final void m24344b() {
        Iterator<C5065c<T>> it = this.f50149d.iterator();
        while (it.hasNext()) {
            it.next().m24348b(this.f50148c);
        }
        this.f50149d.clear();
        this.f50152g = true;
    }

    /* renamed from: a */
    public final void m24342a(final int i2, final InterfaceC5063a<T> interfaceC5063a) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f50149d);
        this.f50151f.add(new Runnable() { // from class: com.yandex.mobile.ads.impl.jo1
            @Override // java.lang.Runnable
            public final void run() {
                f80.m24336a(copyOnWriteArraySet, i2, interfaceC5063a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m24336a(CopyOnWriteArraySet copyOnWriteArraySet, int i2, InterfaceC5063a interfaceC5063a) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((C5065c) it.next()).m24346a(i2, interfaceC5063a);
        }
    }

    /* renamed from: a */
    public final void m24341a() {
        if (this.f50151f.isEmpty()) {
            return;
        }
        if (!this.f50147b.mo23557b()) {
            InterfaceC4944cy interfaceC4944cy = this.f50147b;
            interfaceC4944cy.mo23554a(interfaceC4944cy.mo23556b(0));
        }
        boolean z = !this.f50150e.isEmpty();
        this.f50150e.addAll(this.f50151f);
        this.f50151f.clear();
        if (z) {
            return;
        }
        while (!this.f50150e.isEmpty()) {
            this.f50150e.peekFirst().run();
            this.f50150e.removeFirst();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m24337a(Message message) {
        Iterator<C5065c<T>> it = this.f50149d.iterator();
        while (it.hasNext()) {
            it.next().m24347a(this.f50148c);
            if (this.f50147b.mo23557b()) {
                return true;
            }
        }
        return true;
    }
}
