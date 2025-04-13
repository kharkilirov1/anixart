package com.yandex.metrica.impl.p023ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3575Qi;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.dd */
/* loaded from: classes2.dex */
public class C3897dd {

    /* renamed from: n */
    @SuppressLint
    private static volatile C3897dd f44921n;

    /* renamed from: o */
    public static final long f44922o = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: p */
    private static final Object f44923p = new Object();

    /* renamed from: q */
    public static final /* synthetic */ int f44924q = 0;

    /* renamed from: c */
    @Nullable
    private C3668Uc f44927c;

    /* renamed from: d */
    @NonNull
    private C3575Qi f44928d;

    /* renamed from: e */
    @Nullable
    private C4339ud f44929e;

    /* renamed from: f */
    @NonNull
    private c f44930f;

    /* renamed from: g */
    private Runnable f44931g;

    /* renamed from: h */
    @NonNull
    private final C4468zc f44932h;

    /* renamed from: i */
    @NonNull
    private final C3190B8 f44933i;

    /* renamed from: j */
    @NonNull
    private final C3165A8 f44934j;

    /* renamed from: k */
    @NonNull
    private final C4106le f44935k;

    /* renamed from: b */
    private boolean f44926b = false;

    /* renamed from: l */
    private boolean f44936l = false;

    /* renamed from: m */
    private final Object f44937m = new Object();

    /* renamed from: a */
    @NonNull
    private final WeakHashMap<Object, Object> f44925a = new WeakHashMap<>();

    /* renamed from: com.yandex.metrica.impl.ob.dd$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C3575Qi f44938a;

        public a(C3575Qi c3575Qi) {
            this.f44938a = c3575Qi;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3897dd.this.f44929e != null) {
                C3897dd.this.f44929e.m20879a(this.f44938a);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dd$b */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C3668Uc f44940a;

        public b(C3668Uc c3668Uc) {
            this.f44940a = c3668Uc;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3897dd.this.f44929e != null) {
                C3897dd.this.f44929e.m20880a(this.f44940a);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dd$c */
    public static class c {
    }

    @VisibleForTesting
    public C3897dd(@NonNull Context context, @NonNull C3923ed c3923ed, @NonNull c cVar, @NonNull C3575Qi c3575Qi) {
        this.f44932h = new C4468zc(context, c3923ed.m19814a(), c3923ed.m19817d());
        this.f44933i = c3923ed.m19816c();
        this.f44934j = c3923ed.m19815b();
        this.f44935k = c3923ed.m19818e();
        this.f44930f = cVar;
        this.f44928d = c3575Qi;
    }

    /* renamed from: b */
    public void m19727b(@Nullable Object obj) {
        synchronized (this.f44937m) {
            this.f44925a.remove(obj);
            m19720b();
        }
    }

    /* renamed from: a */
    public static C3897dd m19718a(Context context) {
        if (f44921n == null) {
            synchronized (f44923p) {
                if (f44921n == null) {
                    Context applicationContext = context.getApplicationContext();
                    f44921n = new C3897dd(applicationContext, new C3923ed(applicationContext), new c(), new C3575Qi.b(applicationContext).m18918a());
                }
            }
        }
        return f44921n;
    }

    /* renamed from: b */
    private void m19720b() {
        if (this.f44936l) {
            if (!this.f44926b || this.f44925a.isEmpty()) {
                this.f44932h.f47109b.execute(new RunnableC3819ad(this));
                Runnable runnable = this.f44931g;
                if (runnable != null) {
                    this.f44932h.f47109b.m20672a(runnable);
                }
                this.f44936l = false;
                return;
            }
            return;
        }
        if (!this.f44926b || this.f44925a.isEmpty()) {
            return;
        }
        if (this.f44929e == null) {
            c cVar = this.f44930f;
            C4365vd c4365vd = new C4365vd(this.f44932h, this.f44933i, this.f44934j, this.f44928d, this.f44927c);
            Objects.requireNonNull(cVar);
            this.f44929e = new C4339ud(c4365vd);
        }
        this.f44932h.f47109b.execute(new RunnableC3845bd(this));
        if (this.f44931g == null) {
            RunnableC3871cd runnableC3871cd = new RunnableC3871cd(this);
            this.f44931g = runnableC3871cd;
            this.f44932h.f47109b.m20673a(runnableC3871cd, f44922o);
        }
        this.f44932h.f47109b.execute(new RunnableC3793Zc(this));
        this.f44936l = true;
    }

    /* renamed from: a */
    public void m19725a(@Nullable Object obj) {
        synchronized (this.f44937m) {
            this.f44925a.put(obj, null);
            m19720b();
        }
    }

    @Nullable
    /* renamed from: a */
    public Location m19722a() {
        C4339ud c4339ud = this.f44929e;
        if (c4339ud == null) {
            return null;
        }
        return c4339ud.m20881b();
    }

    @AnyThread
    /* renamed from: a */
    public void m19726a(boolean z) {
        synchronized (this.f44937m) {
            if (this.f44926b != z) {
                this.f44926b = z;
                this.f44935k.m20358a(z);
                this.f44932h.f47110c.m19899a(this.f44935k.m20356a());
                m19720b();
            }
        }
    }

    /* renamed from: b */
    public static void m19721b(C3897dd c3897dd) {
        c3897dd.f44932h.f47109b.m20673a(c3897dd.f44931g, f44922o);
    }

    @AnyThread
    /* renamed from: a */
    public void m19723a(@NonNull C3575Qi c3575Qi, @Nullable C3668Uc c3668Uc) {
        synchronized (this.f44937m) {
            this.f44928d = c3575Qi;
            this.f44935k.m20357a(c3575Qi);
            this.f44932h.f47110c.m19899a(this.f44935k.m20356a());
            this.f44932h.f47109b.execute(new a(c3575Qi));
            if (!C3658U2.m19213a(this.f44927c, c3668Uc)) {
                m19724a(c3668Uc);
            }
        }
    }

    @AnyThread
    /* renamed from: a */
    public void m19724a(@Nullable C3668Uc c3668Uc) {
        synchronized (this.f44937m) {
            this.f44927c = c3668Uc;
        }
        this.f44932h.f47109b.execute(new b(c3668Uc));
    }
}
