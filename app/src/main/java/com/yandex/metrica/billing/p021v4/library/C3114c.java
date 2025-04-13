package com.yandex.metrica.billing.p021v4.library;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.android.billingclient.api.BillingClient;
import com.yandex.metrica.billing_interface.AbstractRunnableC3120f;
import com.yandex.metrica.impl.p023ob.C4195p;
import com.yandex.metrica.impl.p023ob.InterfaceC4221q;
import com.yandex.metrica.impl.p023ob.InterfaceC4247r;
import com.yandex.metrica.impl.p023ob.InterfaceC4273s;
import com.yandex.metrica.impl.p023ob.InterfaceC4299t;
import com.yandex.metrica.impl.p023ob.InterfaceC4325u;
import com.yandex.metrica.impl.p023ob.InterfaceC4351v;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.metrica.billing.v4.library.c */
/* loaded from: classes2.dex */
public final class C3114c implements InterfaceC4247r, InterfaceC4221q {

    /* renamed from: a */
    public C4195p f42383a;

    /* renamed from: b */
    public final Context f42384b;

    /* renamed from: c */
    public final Executor f42385c;

    /* renamed from: d */
    public final Executor f42386d;

    /* renamed from: e */
    public final InterfaceC4299t f42387e;

    /* renamed from: f */
    public final InterfaceC4273s f42388f;

    /* renamed from: g */
    public final InterfaceC4351v f42389g;

    /* renamed from: com.yandex.metrica.billing.v4.library.c$a */
    public static final class a extends AbstractRunnableC3120f {

        /* renamed from: c */
        public final /* synthetic */ C4195p f42391c;

        public a(C4195p c4195p) {
            this.f42391c = c4195p;
        }

        @Override // com.yandex.metrica.billing_interface.AbstractRunnableC3120f
        /* renamed from: a */
        public void mo17778a() {
            BillingClient build = BillingClient.newBuilder(C3114c.this.f42384b).setListener(new PurchasesUpdatedListenerImpl()).enablePendingPurchases().build();
            Intrinsics.m32178g(build, "BillingClient\n          …                 .build()");
            build.startConnection(new BillingClientStateListenerImpl(this.f42391c, build, C3114c.this));
        }
    }

    public C3114c(@NotNull Context context, @NotNull Executor workerExecutor, @NotNull Executor uiExecutor, @NotNull InterfaceC4325u billingInfoStorage, @NotNull InterfaceC4299t billingInfoSender, @NotNull InterfaceC4273s interfaceC4273s, @NotNull InterfaceC4351v interfaceC4351v) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(workerExecutor, "workerExecutor");
        Intrinsics.m32179h(uiExecutor, "uiExecutor");
        Intrinsics.m32179h(billingInfoStorage, "billingInfoStorage");
        Intrinsics.m32179h(billingInfoSender, "billingInfoSender");
        this.f42384b = context;
        this.f42385c = workerExecutor;
        this.f42386d = uiExecutor;
        this.f42387e = billingInfoSender;
        this.f42388f = interfaceC4273s;
        this.f42389g = interfaceC4351v;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4247r
    /* renamed from: a */
    public synchronized void mo17782a(@Nullable C4195p c4195p) {
        this.f42383a = c4195p;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4247r
    @WorkerThread
    /* renamed from: b */
    public void mo17783b() {
        C4195p c4195p = this.f42383a;
        if (c4195p != null) {
            this.f42386d.execute(new a(c4195p));
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4221q
    @NotNull
    /* renamed from: c */
    public Executor mo17784c() {
        return this.f42386d;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4221q
    @NotNull
    /* renamed from: d */
    public InterfaceC4299t mo17785d() {
        return this.f42387e;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4221q
    @NotNull
    /* renamed from: e */
    public InterfaceC4273s mo17786e() {
        return this.f42388f;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4221q
    @NotNull
    /* renamed from: f */
    public InterfaceC4351v mo17787f() {
        return this.f42389g;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4221q
    @NotNull
    /* renamed from: a */
    public Executor mo17781a() {
        return this.f42385c;
    }
}
