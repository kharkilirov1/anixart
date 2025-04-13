package com.yandex.metrica.billing.p020v3.library;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.yandex.metrica.billing_interface.AbstractRunnableC3120f;
import com.yandex.metrica.impl.p023ob.C4195p;
import com.yandex.metrica.impl.p023ob.InterfaceC4221q;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
class BillingClientStateListenerImpl implements BillingClientStateListener {

    /* renamed from: g */
    public static final /* synthetic */ int f42310g = 0;

    /* renamed from: a */
    @NonNull
    public final C4195p f42311a;

    /* renamed from: b */
    @NonNull
    public final Executor f42312b;

    /* renamed from: c */
    @NonNull
    public final Executor f42313c;

    /* renamed from: d */
    @NonNull
    public final BillingClient f42314d;

    /* renamed from: e */
    @NonNull
    public final InterfaceC4221q f42315e;

    /* renamed from: f */
    @NonNull
    public final C3102b f42316f;

    /* renamed from: com.yandex.metrica.billing.v3.library.BillingClientStateListenerImpl$a */
    class C3095a extends AbstractRunnableC3120f {
        @Override // com.yandex.metrica.billing_interface.AbstractRunnableC3120f
        /* renamed from: a */
        public void mo17778a() throws Throwable {
            int i2 = BillingClientStateListenerImpl.f42310g;
            throw null;
        }
    }

    /* renamed from: com.yandex.metrica.billing.v3.library.BillingClientStateListenerImpl$b */
    class C3096b extends AbstractRunnableC3120f {

        /* renamed from: b */
        public final /* synthetic */ String f42317b;

        /* renamed from: c */
        public final /* synthetic */ PurchaseHistoryResponseListenerImpl f42318c;

        /* renamed from: d */
        public final /* synthetic */ BillingClientStateListenerImpl f42319d;

        /* renamed from: com.yandex.metrica.billing.v3.library.BillingClientStateListenerImpl$b$a */
        public class a extends AbstractRunnableC3120f {
            public a() {
            }

            @Override // com.yandex.metrica.billing_interface.AbstractRunnableC3120f
            /* renamed from: a */
            public void mo17778a() {
                C3096b c3096b = C3096b.this;
                c3096b.f42319d.f42316f.m17780a(c3096b.f42318c);
            }
        }

        @Override // com.yandex.metrica.billing_interface.AbstractRunnableC3120f
        /* renamed from: a */
        public void mo17778a() throws Throwable {
            if (this.f42319d.f42314d.isReady()) {
                this.f42319d.f42314d.queryPurchaseHistoryAsync(this.f42317b, this.f42318c);
            } else {
                this.f42319d.f42312b.execute(new a());
            }
        }
    }

    @VisibleForTesting
    public BillingClientStateListenerImpl(@NonNull C4195p c4195p, @NonNull Executor executor, @NonNull Executor executor2, @NonNull BillingClient billingClient, @NonNull InterfaceC4221q interfaceC4221q, @NonNull C3102b c3102b) {
        this.f42311a = c4195p;
        this.f42312b = executor;
        this.f42313c = executor2;
        this.f42314d = billingClient;
        this.f42315e = interfaceC4221q;
        this.f42316f = c3102b;
    }
}
