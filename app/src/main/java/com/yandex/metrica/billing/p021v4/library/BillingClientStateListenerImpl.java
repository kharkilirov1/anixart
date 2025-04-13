package com.yandex.metrica.billing.p021v4.library;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.yandex.metrica.billing_interface.AbstractRunnableC3120f;
import com.yandex.metrica.impl.p023ob.C4195p;
import com.yandex.metrica.impl.p023ob.InterfaceC4221q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/metrica/billing/v4/library/BillingClientStateListenerImpl;", "Lcom/android/billingclient/api/BillingClientStateListener;", "billing-v4_publicBinaryProdRelease"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class BillingClientStateListenerImpl implements BillingClientStateListener {

    /* renamed from: e */
    public static final /* synthetic */ int f42349e = 0;

    /* renamed from: a */
    public final C4195p f42350a;

    /* renamed from: b */
    public final BillingClient f42351b;

    /* renamed from: c */
    public final InterfaceC4221q f42352c;

    /* renamed from: d */
    public final C3113b f42353d;

    /* renamed from: com.yandex.metrica.billing.v4.library.BillingClientStateListenerImpl$a */
    public final class C3104a extends AbstractRunnableC3120f {
        @Override // com.yandex.metrica.billing_interface.AbstractRunnableC3120f
        /* renamed from: a */
        public void mo17778a() {
            int i2 = BillingClientStateListenerImpl.f42349e;
            throw null;
        }
    }

    /* renamed from: com.yandex.metrica.billing.v4.library.BillingClientStateListenerImpl$b */
    public final class C3105b extends AbstractRunnableC3120f {

        /* renamed from: b */
        public final /* synthetic */ String f42354b;

        /* renamed from: c */
        public final /* synthetic */ PurchaseHistoryResponseListenerImpl f42355c;

        /* renamed from: d */
        public final /* synthetic */ BillingClientStateListenerImpl f42356d;

        /* renamed from: com.yandex.metrica.billing.v4.library.BillingClientStateListenerImpl$b$a */
        public static final class a extends AbstractRunnableC3120f {
            public a() {
            }

            @Override // com.yandex.metrica.billing_interface.AbstractRunnableC3120f
            /* renamed from: a */
            public void mo17778a() {
                C3105b c3105b = C3105b.this;
                c3105b.f42356d.f42353d.m17788a(c3105b.f42355c);
            }
        }

        @Override // com.yandex.metrica.billing_interface.AbstractRunnableC3120f
        /* renamed from: a */
        public void mo17778a() {
            if (this.f42356d.f42351b.isReady()) {
                this.f42356d.f42351b.queryPurchaseHistoryAsync(this.f42354b, this.f42355c);
            } else {
                this.f42356d.f42352c.mo17781a().execute(new a());
            }
        }
    }

    public BillingClientStateListenerImpl(@NotNull C4195p config, @NotNull BillingClient billingClient, @NotNull InterfaceC4221q utilsProvider) {
        Intrinsics.m32179h(config, "config");
        Intrinsics.m32179h(utilsProvider, "utilsProvider");
        C3113b c3113b = new C3113b(billingClient, null, 2);
        this.f42350a = config;
        this.f42351b = billingClient;
        this.f42352c = utilsProvider;
        this.f42353d = c3113b;
    }
}
