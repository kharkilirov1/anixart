package com.yandex.mobile.ads.impl;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.drm.InterfaceC4719f;
import com.yandex.mobile.ads.impl.bc0;
import com.yandex.mobile.ads.impl.cc0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.uj */
/* loaded from: classes3.dex */
public abstract class AbstractC5868uj<T> extends AbstractC4917ce {

    /* renamed from: h */
    private final HashMap<T, b<T>> f55533h = new HashMap<>();

    /* renamed from: i */
    @Nullable
    private Handler f55534i;

    /* renamed from: j */
    @Nullable
    private v71 f55535j;

    /* renamed from: com.yandex.mobile.ads.impl.uj$b */
    public static final class b<T> {

        /* renamed from: a */
        public final bc0 f55540a;

        /* renamed from: b */
        public final bc0.InterfaceC4859c f55541b;

        /* renamed from: c */
        public final AbstractC5868uj<T>.a f55542c;

        public b(bc0 bc0Var, bc0.InterfaceC4859c interfaceC4859c, AbstractC5868uj<T>.a aVar) {
            this.f55540a = bc0Var;
            this.f55541b = interfaceC4859c;
            this.f55542c = aVar;
        }
    }

    @Nullable
    /* renamed from: a */
    public abstract bc0.C4858b mo29025a(T t, bc0.C4858b c4858b);

    @Override // com.yandex.mobile.ads.impl.AbstractC4917ce
    @CallSuper
    /* renamed from: a */
    public void mo23238a(@Nullable v71 v71Var) {
        this.f55535j = v71Var;
        this.f55534i = s91.m28099a((Handler.Callback) null);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4917ce
    @CallSuper
    /* renamed from: b */
    public final void mo23241b() {
        for (b<T> bVar : this.f55533h.values()) {
            bVar.f55540a.mo22799c(bVar.f55541b);
        }
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract void m29023a(T t, bc0 bc0Var, k61 k61Var);

    @Override // com.yandex.mobile.ads.impl.AbstractC4917ce
    @CallSuper
    /* renamed from: e */
    public void mo23244e() {
        for (b<T> bVar : this.f55533h.values()) {
            bVar.f55540a.mo22794a(bVar.f55541b);
            bVar.f55540a.mo22796a((cc0) bVar.f55542c);
            bVar.f55540a.mo22793a((InterfaceC4719f) bVar.f55542c);
        }
        this.f55533h.clear();
    }

    /* renamed from: com.yandex.mobile.ads.impl.uj$a */
    public final class a implements cc0, InterfaceC4719f {

        /* renamed from: a */
        private final T f55536a;

        /* renamed from: b */
        private cc0.C4914a f55537b;

        /* renamed from: c */
        private InterfaceC4719f.a f55538c;

        public a(T t) {
            this.f55537b = AbstractC5868uj.this.m23240b((bc0.C4858b) null);
            this.f55538c = AbstractC5868uj.this.m23235a((bc0.C4858b) null);
            this.f55536a = t;
        }

        /* renamed from: e */
        private boolean m29029e(int i2, @Nullable bc0.C4858b c4858b) {
            bc0.C4858b c4858b2;
            if (c4858b != null) {
                c4858b2 = AbstractC5868uj.this.mo29025a((AbstractC5868uj) this.f55536a, c4858b);
                if (c4858b2 == null) {
                    return false;
                }
            } else {
                c4858b2 = null;
            }
            Objects.requireNonNull(AbstractC5868uj.this);
            cc0.C4914a c4914a = this.f55537b;
            if (c4914a.f49200a != i2 || !s91.m28112a(c4914a.f49201b, c4858b2)) {
                this.f55537b = AbstractC5868uj.this.m23239b(i2, c4858b2);
            }
            InterfaceC4719f.a aVar = this.f55538c;
            if (aVar.f48020a == i2 && s91.m28112a(aVar.f48021b, c4858b2)) {
                return true;
            }
            this.f55538c = AbstractC5868uj.this.m23234a(i2, c4858b2);
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.cc0
        /* renamed from: a */
        public final void mo23190a(int i2, @Nullable bc0.C4858b c4858b, j80 j80Var, rb0 rb0Var) {
            if (m29029e(i2, c4858b)) {
                this.f55537b.m23213a(j80Var, m29028a(rb0Var));
            }
        }

        @Override // com.yandex.mobile.ads.impl.cc0
        /* renamed from: b */
        public final void mo23193b(int i2, @Nullable bc0.C4858b c4858b, j80 j80Var, rb0 rb0Var) {
            if (m29029e(i2, c4858b)) {
                this.f55537b.m23217b(j80Var, m29028a(rb0Var));
            }
        }

        @Override // com.yandex.mobile.ads.impl.cc0
        /* renamed from: c */
        public final void mo23194c(int i2, @Nullable bc0.C4858b c4858b, j80 j80Var, rb0 rb0Var) {
            if (m29029e(i2, c4858b)) {
                this.f55537b.m23218c(j80Var, m29028a(rb0Var));
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4719f
        /* renamed from: d */
        public final void mo22164d(int i2, @Nullable bc0.C4858b c4858b) {
            if (m29029e(i2, c4858b)) {
                this.f55538c.m22182b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.cc0
        /* renamed from: a */
        public final void mo23191a(int i2, @Nullable bc0.C4858b c4858b, j80 j80Var, rb0 rb0Var, IOException iOException, boolean z) {
            if (m29029e(i2, c4858b)) {
                this.f55537b.m23214a(j80Var, m29028a(rb0Var), iOException, z);
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4719f
        /* renamed from: b */
        public final void mo22162b(int i2, @Nullable bc0.C4858b c4858b) {
            if (m29029e(i2, c4858b)) {
                this.f55538c.m22184d();
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4719f
        /* renamed from: c */
        public final void mo22163c(int i2, @Nullable bc0.C4858b c4858b) {
            if (m29029e(i2, c4858b)) {
                this.f55538c.m22178a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.cc0
        /* renamed from: a */
        public final void mo23192a(int i2, @Nullable bc0.C4858b c4858b, rb0 rb0Var) {
            if (m29029e(i2, c4858b)) {
                this.f55537b.m23215a(m29028a(rb0Var));
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4719f
        /* renamed from: a */
        public final void mo22160a(int i2, @Nullable bc0.C4858b c4858b, int i3) {
            if (m29029e(i2, c4858b)) {
                this.f55538c.m22179a(i3);
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4719f
        /* renamed from: a */
        public final void mo22161a(int i2, @Nullable bc0.C4858b c4858b, Exception exc) {
            if (m29029e(i2, c4858b)) {
                this.f55538c.m22181a(exc);
            }
        }

        @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4719f
        /* renamed from: a */
        public final void mo22159a(int i2, @Nullable bc0.C4858b c4858b) {
            if (m29029e(i2, c4858b)) {
                this.f55538c.m22183c();
            }
        }

        /* renamed from: a */
        private rb0 m29028a(rb0 rb0Var) {
            AbstractC5868uj abstractC5868uj = AbstractC5868uj.this;
            long j2 = rb0Var.f54259f;
            Objects.requireNonNull(abstractC5868uj);
            AbstractC5868uj abstractC5868uj2 = AbstractC5868uj.this;
            long j3 = rb0Var.f54260g;
            Objects.requireNonNull(abstractC5868uj2);
            return (j2 == rb0Var.f54259f && j3 == rb0Var.f54260g) ? rb0Var : new rb0(rb0Var.f54254a, rb0Var.f54255b, rb0Var.f54256c, rb0Var.f54257d, rb0Var.f54258e, j2, j3);
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4917ce
    @CallSuper
    /* renamed from: a */
    public final void mo23236a() {
        for (b<T> bVar : this.f55533h.values()) {
            bVar.f55540a.mo22798b(bVar.f55541b);
        }
    }

    /* renamed from: a */
    public final void m29026a(final T t, bc0 bc0Var) {
        C5220ia.m25473a(!this.f55533h.containsKey(t));
        bc0.InterfaceC4859c interfaceC4859c = new bc0.InterfaceC4859c() { // from class: com.yandex.mobile.ads.impl.hq1
            @Override // com.yandex.mobile.ads.impl.bc0.InterfaceC4859c
            /* renamed from: a */
            public final void mo22801a(bc0 bc0Var2, k61 k61Var) {
                AbstractC5868uj.this.m29023a(t, bc0Var2, k61Var);
            }
        };
        a aVar = new a(t);
        this.f55533h.put(t, new b<>(bc0Var, interfaceC4859c, aVar));
        Handler handler = this.f55534i;
        Objects.requireNonNull(handler);
        bc0Var.mo22792a(handler, (cc0) aVar);
        Handler handler2 = this.f55534i;
        Objects.requireNonNull(handler2);
        bc0Var.mo22791a(handler2, (InterfaceC4719f) aVar);
        bc0Var.mo22795a(interfaceC4859c, this.f55535j, m23242c());
        if (m23243d()) {
            return;
        }
        bc0Var.mo22798b(interfaceC4859c);
    }
}
