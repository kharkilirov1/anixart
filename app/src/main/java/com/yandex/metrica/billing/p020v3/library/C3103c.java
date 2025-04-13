package com.yandex.metrica.billing.p020v3.library;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.android.billingclient.api.BillingClient;
import com.yandex.metrica.billing_interface.AbstractRunnableC3120f;
import com.yandex.metrica.impl.p023ob.C4195p;
import com.yandex.metrica.impl.p023ob.InterfaceC4221q;
import com.yandex.metrica.impl.p023ob.InterfaceC4247r;
import com.yandex.metrica.impl.p023ob.InterfaceC4273s;
import com.yandex.metrica.impl.p023ob.InterfaceC4299t;
import com.yandex.metrica.impl.p023ob.InterfaceC4351v;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.billing.v3.library.c */
/* loaded from: classes2.dex */
public class C3103c implements InterfaceC4247r, InterfaceC4221q {

    /* renamed from: a */
    @NonNull
    public final Context f42340a;

    /* renamed from: b */
    @NonNull
    public final Executor f42341b;

    /* renamed from: c */
    @NonNull
    public final Executor f42342c;

    /* renamed from: d */
    @NonNull
    public final InterfaceC4273s f42343d;

    /* renamed from: e */
    @NonNull
    public final InterfaceC4351v f42344e;

    /* renamed from: f */
    @NonNull
    public final InterfaceC4299t f42345f;

    /* renamed from: g */
    @Nullable
    public C4195p f42346g;

    /* renamed from: com.yandex.metrica.billing.v3.library.c$a */
    public class a extends AbstractRunnableC3120f {

        /* renamed from: b */
        public final /* synthetic */ C4195p f42347b;

        public a(C4195p c4195p) {
            this.f42347b = c4195p;
        }

        @Override // com.yandex.metrica.billing_interface.AbstractRunnableC3120f
        /* renamed from: a */
        public void mo17778a() {
            BillingClient build = BillingClient.newBuilder(C3103c.this.f42340a).setListener(new PurchasesUpdatedListenerImpl()).enablePendingPurchases().build();
            C4195p c4195p = this.f42347b;
            C3103c c3103c = C3103c.this;
            build.startConnection(new BillingClientStateListenerImpl(c4195p, c3103c.f42341b, c3103c.f42342c, build, c3103c, new C3102b(build)));
        }
    }

    public C3103c(@NonNull Context context, @NonNull Executor executor, @NonNull Executor executor2, @NonNull InterfaceC4273s interfaceC4273s, @NonNull InterfaceC4351v interfaceC4351v, @NonNull InterfaceC4299t interfaceC4299t) {
        this.f42340a = context;
        this.f42341b = executor;
        this.f42342c = executor2;
        this.f42343d = interfaceC4273s;
        this.f42344e = interfaceC4351v;
        this.f42345f = interfaceC4299t;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4247r
    /* renamed from: a */
    public synchronized void mo17782a(@Nullable C4195p c4195p) {
        this.f42346g = c4195p;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4247r
    @WorkerThread
    /* renamed from: b */
    public void mo17783b() throws Throwable {
        C4195p c4195p = this.f42346g;
        if (c4195p != null) {
            this.f42342c.execute(new a(c4195p));
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4221q
    @NonNull
    /* renamed from: c */
    public Executor mo17784c() {
        return this.f42342c;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4221q
    @NonNull
    /* renamed from: d */
    public InterfaceC4299t mo17785d() {
        return this.f42345f;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4221q
    @NonNull
    /* renamed from: e */
    public InterfaceC4273s mo17786e() {
        return this.f42343d;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4221q
    @NonNull
    /* renamed from: f */
    public InterfaceC4351v mo17787f() {
        return this.f42344e;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4221q
    @NonNull
    /* renamed from: a */
    public Executor mo17781a() {
        return this.f42341b;
    }
}
