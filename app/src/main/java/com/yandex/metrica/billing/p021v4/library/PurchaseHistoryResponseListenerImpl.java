package com.yandex.metrica.billing.p021v4.library;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.SkuDetailsParams;
import com.yandex.metrica.billing_interface.AbstractRunnableC3120f;
import com.yandex.metrica.impl.p023ob.C4143n;
import com.yandex.metrica.impl.p023ob.InterfaceC4221q;
import com.yandex.metrica.impl.p023ob.InterfaceC4273s;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/metrica/billing/v4/library/PurchaseHistoryResponseListenerImpl;", "Lcom/android/billingclient/api/PurchaseHistoryResponseListener;", "billing-v4_publicBinaryProdRelease"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class PurchaseHistoryResponseListenerImpl implements PurchaseHistoryResponseListener {

    /* renamed from: e */
    public static final /* synthetic */ int f42358e = 0;

    /* renamed from: a */
    public final BillingClient f42359a;

    /* renamed from: b */
    public final InterfaceC4221q f42360b;

    /* renamed from: c */
    public final String f42361c;

    /* renamed from: d */
    public final C3113b f42362d;

    /* renamed from: com.yandex.metrica.billing.v4.library.PurchaseHistoryResponseListenerImpl$a */
    public final class C3106a extends AbstractRunnableC3120f {
        @Override // com.yandex.metrica.billing_interface.AbstractRunnableC3120f
        /* renamed from: a */
        public void mo17778a() {
            int i2 = PurchaseHistoryResponseListenerImpl.f42358e;
            throw null;
        }
    }

    /* renamed from: com.yandex.metrica.billing.v4.library.PurchaseHistoryResponseListenerImpl$b */
    final class C3107b extends Lambda implements Function0<Unit> {

        /* renamed from: b */
        public final /* synthetic */ PurchaseHistoryResponseListenerImpl f42363b;

        /* renamed from: c */
        public final /* synthetic */ Map f42364c;

        /* renamed from: d */
        public final /* synthetic */ Map f42365d;

        @Override // kotlin.jvm.functions.Function0
        public Unit invoke() {
            C4143n c4143n = C4143n.f45964a;
            Map map = this.f42364c;
            Map map2 = this.f42365d;
            PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl = this.f42363b;
            String str = purchaseHistoryResponseListenerImpl.f42361c;
            InterfaceC4273s mo17786e = purchaseHistoryResponseListenerImpl.f42360b.mo17786e();
            Intrinsics.m32178g(mo17786e, "utilsProvider.billingInfoManager");
            C4143n.m20406a(c4143n, map, map2, str, mo17786e, null, 16);
            return Unit.f63088a;
        }
    }

    /* renamed from: com.yandex.metrica.billing.v4.library.PurchaseHistoryResponseListenerImpl$c */
    public final class C3108c extends AbstractRunnableC3120f {

        /* renamed from: b */
        public final /* synthetic */ PurchaseHistoryResponseListenerImpl f42366b;

        /* renamed from: c */
        public final /* synthetic */ SkuDetailsParams f42367c;

        /* renamed from: d */
        public final /* synthetic */ SkuDetailsResponseListenerImpl f42368d;

        /* renamed from: com.yandex.metrica.billing.v4.library.PurchaseHistoryResponseListenerImpl$c$a */
        public static final class a extends AbstractRunnableC3120f {
            public a() {
            }

            @Override // com.yandex.metrica.billing_interface.AbstractRunnableC3120f
            /* renamed from: a */
            public void mo17778a() {
                C3108c c3108c = C3108c.this;
                c3108c.f42366b.f42362d.m17788a(c3108c.f42368d);
            }
        }

        @Override // com.yandex.metrica.billing_interface.AbstractRunnableC3120f
        /* renamed from: a */
        public void mo17778a() {
            if (this.f42366b.f42359a.isReady()) {
                this.f42366b.f42359a.querySkuDetailsAsync(this.f42367c, this.f42368d);
            } else {
                this.f42366b.f42360b.mo17781a().execute(new a());
            }
        }
    }
}
