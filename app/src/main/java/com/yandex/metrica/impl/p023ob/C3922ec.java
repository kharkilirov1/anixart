package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: com.yandex.metrica.impl.ob.ec */
/* loaded from: classes2.dex */
public class C3922ec implements InterfaceC4104lc {

    /* renamed from: a */
    private final Object f45032a;

    /* renamed from: b */
    @Nullable
    private C3575Qi f45033b;

    /* renamed from: c */
    private volatile FutureTask<Void> f45034c;

    /* renamed from: d */
    @NonNull
    private final g f45035d;

    /* renamed from: e */
    @NonNull
    private final g f45036e;

    /* renamed from: f */
    @NonNull
    private final g f45037f;

    /* renamed from: g */
    @NonNull
    private final InterfaceC3870cc f45038g;

    /* renamed from: h */
    @NonNull
    private final InterfaceC3870cc f45039h;

    /* renamed from: i */
    @NonNull
    private final InterfaceC3870cc f45040i;

    /* renamed from: j */
    @Nullable
    private Context f45041j;

    /* renamed from: k */
    @NonNull
    private InterfaceExecutorC4297sn f45042k;

    /* renamed from: l */
    @NonNull
    private volatile C3974gc f45043l;

    /* renamed from: com.yandex.metrica.impl.ob.ec$a */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            C3922ec c3922ec = C3922ec.this;
            C3844bc m19797a = C3922ec.m19797a(c3922ec, c3922ec.f45041j);
            C3922ec c3922ec2 = C3922ec.this;
            C3844bc m19803b = C3922ec.m19803b(c3922ec2, c3922ec2.f45041j);
            C3922ec c3922ec3 = C3922ec.this;
            c3922ec.f45043l = new C3974gc(m19797a, m19803b, C3922ec.m19798a(c3922ec3, c3922ec3.f45041j, new C4130mc()));
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$b */
    public class b implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ Context f45045a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC4156nc f45046b;

        public b(Context context, InterfaceC4156nc interfaceC4156nc) {
            this.f45045a = context;
            this.f45046b = interfaceC4156nc;
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            C3974gc c3974gc = C3922ec.this.f45043l;
            C3922ec c3922ec = C3922ec.this;
            C3844bc m19799a = C3922ec.m19799a(c3922ec, C3922ec.m19797a(c3922ec, this.f45045a), c3974gc.m19958a());
            C3922ec c3922ec2 = C3922ec.this;
            C3844bc m19799a2 = C3922ec.m19799a(c3922ec2, C3922ec.m19803b(c3922ec2, this.f45045a), c3974gc.m19959b());
            C3922ec c3922ec3 = C3922ec.this;
            c3922ec.f45043l = new C3974gc(m19799a, m19799a2, C3922ec.m19799a(c3922ec3, C3922ec.m19798a(c3922ec3, this.f45045a, this.f45046b), c3974gc.m19960c()));
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$c */
    public static class c implements g {
        @Override // com.yandex.metrica.impl.p023ob.C3922ec.g
        /* renamed from: a */
        public boolean mo19813a(@Nullable C3575Qi c3575Qi) {
            return true;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$d */
    public static class d implements g {
        @Override // com.yandex.metrica.impl.p023ob.C3922ec.g
        /* renamed from: a */
        public boolean mo19813a(@Nullable C3575Qi c3575Qi) {
            return c3575Qi != null && (c3575Qi.m18848f().f46423w || !c3575Qi.m18860r());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$e */
    public static class e implements g {
        @Override // com.yandex.metrica.impl.p023ob.C3922ec.g
        /* renamed from: a */
        public boolean mo19813a(@Nullable C3575Qi c3575Qi) {
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$f */
    public static class f implements g {
        @Override // com.yandex.metrica.impl.p023ob.C3922ec.g
        /* renamed from: a */
        public boolean mo19813a(@Nullable C3575Qi c3575Qi) {
            return c3575Qi != null && c3575Qi.m18848f().f46423w;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$g */
    public interface g {
        /* renamed from: a */
        boolean mo19813a(@Nullable C3575Qi c3575Qi);
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$h */
    public static class h implements g {
        @Override // com.yandex.metrica.impl.p023ob.C3922ec.g
        /* renamed from: a */
        public boolean mo19813a(@Nullable C3575Qi c3575Qi) {
            return c3575Qi != null && (c3575Qi.m18848f().f46415o || !c3575Qi.m18860r());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$i */
    public static class i implements g {
        @Override // com.yandex.metrica.impl.p023ob.C3922ec.g
        /* renamed from: a */
        public boolean mo19813a(@Nullable C3575Qi c3575Qi) {
            return c3575Qi != null && c3575Qi.m18848f().f46415o;
        }
    }

    public C3922ec(@NonNull g gVar, @NonNull g gVar2, @NonNull g gVar3, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, String str) {
        this(gVar, gVar2, gVar3, interfaceExecutorC4297sn, new C3896dc(new C4260rc("google")), new C3896dc(new C4260rc("huawei")), new C3896dc(new C4260rc("yandex")), str);
    }

    /* renamed from: a */
    public static C3844bc m19799a(C3922ec c3922ec, C3844bc c3844bc, C3844bc c3844bc2) {
        Objects.requireNonNull(c3922ec);
        EnumC3911e1 enumC3911e1 = c3844bc.f44823b;
        return enumC3911e1 != EnumC3911e1.OK ? new C3844bc(c3844bc2.f44822a, enumC3911e1, c3844bc.f44824c) : c3844bc;
    }

    /* renamed from: c */
    public void m19812c(@NonNull Context context) {
        this.f45041j = context.getApplicationContext();
    }

    @VisibleForTesting
    public C3922ec(@NonNull g gVar, @NonNull g gVar2, @NonNull g gVar3, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull InterfaceC3870cc interfaceC3870cc, @NonNull InterfaceC3870cc interfaceC3870cc2, @NonNull InterfaceC3870cc interfaceC3870cc3, String str) {
        this.f45032a = new Object();
        this.f45035d = gVar;
        this.f45036e = gVar2;
        this.f45037f = gVar3;
        this.f45038g = interfaceC3870cc;
        this.f45039h = interfaceC3870cc2;
        this.f45040i = interfaceC3870cc3;
        this.f45042k = interfaceExecutorC4297sn;
        this.f45043l = new C3974gc();
    }

    /* renamed from: c */
    private void m19804c() {
        boolean z;
        if (this.f45041j != null) {
            synchronized (this) {
                EnumC3911e1 enumC3911e1 = this.f45043l.m19958a().f44823b;
                EnumC3911e1 enumC3911e12 = EnumC3911e1.UNKNOWN;
                if (enumC3911e1 != enumC3911e12) {
                    z = this.f45043l.m19959b().f44823b != enumC3911e12;
                }
            }
            if (z) {
                return;
            }
            m19805a(this.f45041j);
        }
    }

    /* renamed from: b */
    public void m19811b(@NonNull Context context) {
        this.f45041j = context.getApplicationContext();
        if (this.f45034c == null) {
            synchronized (this.f45032a) {
                if (this.f45034c == null) {
                    this.f45034c = new FutureTask<>(new a());
                    ((C4271rn) this.f45042k).execute(this.f45034c);
                }
            }
        }
    }

    /* renamed from: a */
    public void m19808a(@NonNull Context context, @Nullable C3575Qi c3575Qi) {
        this.f45033b = c3575Qi;
        m19811b(context);
    }

    /* renamed from: a */
    public void m19809a(@NonNull C3575Qi c3575Qi) {
        this.f45033b = c3575Qi;
    }

    /* renamed from: b */
    public static C3844bc m19803b(C3922ec c3922ec, Context context) {
        if (c3922ec.f45036e.mo19813a(c3922ec.f45033b)) {
            return c3922ec.f45039h.mo19674a(context);
        }
        C3575Qi c3575Qi = c3922ec.f45033b;
        if (c3575Qi != null && c3575Qi.m18860r()) {
            if (!c3922ec.f45033b.m18848f().f46423w) {
                return new C3844bc(null, EnumC3911e1.FEATURE_DISABLED, "startup forbade ads identifiers collecting");
            }
            return new C3844bc(null, EnumC3911e1.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
        }
        return new C3844bc(null, EnumC3911e1.NO_STARTUP, "startup has not been received yet");
    }

    @NonNull
    /* renamed from: a */
    public C3974gc m19805a(@NonNull Context context) {
        m19811b(context);
        try {
            this.f45034c.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f45043l;
    }

    @NonNull
    /* renamed from: a */
    public C3974gc m19806a(@NonNull Context context, @NonNull InterfaceC4156nc interfaceC4156nc) {
        FutureTask futureTask = new FutureTask(new b(context.getApplicationContext(), interfaceC4156nc));
        ((C4271rn) this.f45042k).execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f45043l;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4104lc
    @Nullable
    @Deprecated
    /* renamed from: b */
    public Boolean mo19810b() {
        m19804c();
        C3818ac c3818ac = this.f45043l.m19958a().f44822a;
        if (c3818ac == null) {
            return null;
        }
        return c3818ac.f44735c;
    }

    /* renamed from: a */
    public static C3844bc m19797a(C3922ec c3922ec, Context context) {
        if (c3922ec.f45035d.mo19813a(c3922ec.f45033b)) {
            return c3922ec.f45038g.mo19674a(context);
        }
        C3575Qi c3575Qi = c3922ec.f45033b;
        if (c3575Qi != null && c3575Qi.m18860r()) {
            if (!c3922ec.f45033b.m18848f().f46415o) {
                return new C3844bc(null, EnumC3911e1.FEATURE_DISABLED, "startup forbade ads identifiers collecting");
            }
            return new C3844bc(null, EnumC3911e1.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
        }
        return new C3844bc(null, EnumC3911e1.NO_STARTUP, "startup has not been received yet");
    }

    /* renamed from: a */
    public static C3844bc m19798a(C3922ec c3922ec, Context context, InterfaceC4156nc interfaceC4156nc) {
        if (c3922ec.f45037f.mo19813a(c3922ec.f45033b)) {
            return c3922ec.f45040i.mo19675a(context, interfaceC4156nc);
        }
        return new C3844bc(null, EnumC3911e1.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4104lc
    @Nullable
    @Deprecated
    /* renamed from: a */
    public String mo19807a() {
        m19804c();
        C3818ac c3818ac = this.f45043l.m19958a().f44822a;
        if (c3818ac == null) {
            return null;
        }
        return c3818ac.f44734b;
    }
}
