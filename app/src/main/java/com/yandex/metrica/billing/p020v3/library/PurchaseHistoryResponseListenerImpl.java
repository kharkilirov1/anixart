package com.yandex.metrica.billing.p020v3.library;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.SkuDetailsParams;
import com.yandex.metrica.billing_interface.AbstractRunnableC3120f;
import com.yandex.metrica.billing_interface.C3115a;
import com.yandex.metrica.billing_interface.C3121g;
import com.yandex.metrica.impl.p023ob.InterfaceC4221q;
import com.yandex.metrica.impl.p023ob.InterfaceC4273s;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
class PurchaseHistoryResponseListenerImpl implements PurchaseHistoryResponseListener {

    /* renamed from: g */
    public static final /* synthetic */ int f42321g = 0;

    /* renamed from: a */
    @NonNull
    public final Executor f42322a;

    /* renamed from: b */
    @NonNull
    public final BillingClient f42323b;

    /* renamed from: c */
    @NonNull
    public final InterfaceC4221q f42324c;

    /* renamed from: d */
    @NonNull
    public final String f42325d;

    /* renamed from: e */
    @NonNull
    public final C3102b f42326e;

    /* renamed from: f */
    @NonNull
    public final C3121g f42327f;

    /* renamed from: com.yandex.metrica.billing.v3.library.PurchaseHistoryResponseListenerImpl$a */
    class C3097a extends AbstractRunnableC3120f {
        @Override // com.yandex.metrica.billing_interface.AbstractRunnableC3120f
        /* renamed from: a */
        public void mo17778a() throws Throwable {
            int i2 = PurchaseHistoryResponseListenerImpl.f42321g;
            throw null;
        }
    }

    /* renamed from: com.yandex.metrica.billing.v3.library.PurchaseHistoryResponseListenerImpl$b */
    class CallableC3098b implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ Map f42328b;

        /* renamed from: c */
        public final /* synthetic */ Map f42329c;

        /* renamed from: d */
        public final /* synthetic */ PurchaseHistoryResponseListenerImpl f42330d;

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            this.f42330d.m17779a(this.f42328b, this.f42329c);
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.billing.v3.library.PurchaseHistoryResponseListenerImpl$c */
    class C3099c extends AbstractRunnableC3120f {

        /* renamed from: b */
        public final /* synthetic */ SkuDetailsParams f42331b;

        /* renamed from: c */
        public final /* synthetic */ SkuDetailsResponseListenerImpl f42332c;

        /* renamed from: d */
        public final /* synthetic */ PurchaseHistoryResponseListenerImpl f42333d;

        /* renamed from: com.yandex.metrica.billing.v3.library.PurchaseHistoryResponseListenerImpl$c$a */
        public class a extends AbstractRunnableC3120f {
            public a() {
            }

            @Override // com.yandex.metrica.billing_interface.AbstractRunnableC3120f
            /* renamed from: a */
            public void mo17778a() {
                C3099c c3099c = C3099c.this;
                c3099c.f42333d.f42326e.m17780a(c3099c.f42332c);
            }
        }

        @Override // com.yandex.metrica.billing_interface.AbstractRunnableC3120f
        /* renamed from: a */
        public void mo17778a() throws Throwable {
            if (this.f42333d.f42323b.isReady()) {
                this.f42333d.f42323b.querySkuDetailsAsync(this.f42331b, this.f42332c);
            } else {
                this.f42333d.f42322a.execute(new a());
            }
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    public void m17779a(@NonNull Map<String, C3115a> map, @NonNull Map<String, C3115a> map2) {
        InterfaceC4273s mo17786e = this.f42324c.mo17786e();
        Objects.requireNonNull(this.f42327f);
        long currentTimeMillis = System.currentTimeMillis();
        for (C3115a c3115a : map.values()) {
            if (map2.containsKey(c3115a.f42393b)) {
                c3115a.f42396e = currentTimeMillis;
            } else {
                C3115a mo20069a = mo17786e.mo20069a(c3115a.f42393b);
                if (mo20069a != null) {
                    c3115a.f42396e = mo20069a.f42396e;
                }
            }
        }
        mo17786e.mo20070a(map);
        if (mo17786e.mo20071a() || !"inapp".equals(this.f42325d)) {
            return;
        }
        mo17786e.mo20072b();
    }
}
