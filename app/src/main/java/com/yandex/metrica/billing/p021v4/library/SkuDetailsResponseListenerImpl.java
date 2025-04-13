package com.yandex.metrica.billing.p021v4.library;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.yandex.metrica.billing_interface.AbstractRunnableC3120f;
import com.yandex.metrica.impl.p023ob.InterfaceC4221q;
import kotlin.Metadata;

@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/metrica/billing/v4/library/SkuDetailsResponseListenerImpl;", "Lcom/android/billingclient/api/SkuDetailsResponseListener;", "billing-v4_publicBinaryProdRelease"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class SkuDetailsResponseListenerImpl implements SkuDetailsResponseListener {

    /* renamed from: e */
    public static final /* synthetic */ int f42371e = 0;

    /* renamed from: a */
    public final String f42372a;

    /* renamed from: b */
    public final BillingClient f42373b;

    /* renamed from: c */
    public final InterfaceC4221q f42374c;

    /* renamed from: d */
    public final C3113b f42375d;

    /* renamed from: com.yandex.metrica.billing.v4.library.SkuDetailsResponseListenerImpl$a */
    public final class C3110a extends AbstractRunnableC3120f {
        @Override // com.yandex.metrica.billing_interface.AbstractRunnableC3120f
        /* renamed from: a */
        public void mo17778a() {
            int i2 = SkuDetailsResponseListenerImpl.f42371e;
            throw null;
        }
    }

    /* renamed from: com.yandex.metrica.billing.v4.library.SkuDetailsResponseListenerImpl$b */
    public final class C3111b extends AbstractRunnableC3120f {

        /* renamed from: b */
        public final /* synthetic */ SkuDetailsResponseListenerImpl f42376b;

        /* renamed from: c */
        public final /* synthetic */ PurchaseResponseListenerImpl f42377c;

        /* renamed from: com.yandex.metrica.billing.v4.library.SkuDetailsResponseListenerImpl$b$a */
        public static final class a extends AbstractRunnableC3120f {
            public a() {
            }

            @Override // com.yandex.metrica.billing_interface.AbstractRunnableC3120f
            /* renamed from: a */
            public void mo17778a() {
                C3111b c3111b = C3111b.this;
                c3111b.f42376b.f42375d.m17788a(c3111b.f42377c);
            }
        }

        @Override // com.yandex.metrica.billing_interface.AbstractRunnableC3120f
        /* renamed from: a */
        public void mo17778a() {
            if (!this.f42376b.f42373b.isReady()) {
                this.f42376b.f42374c.mo17781a().execute(new a());
            } else {
                SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl = this.f42376b;
                skuDetailsResponseListenerImpl.f42373b.queryPurchasesAsync(skuDetailsResponseListenerImpl.f42372a, this.f42377c);
            }
        }
    }
}
