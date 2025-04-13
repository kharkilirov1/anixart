package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.wm0;
import com.yandex.mobile.ads.mediation.base.C6164a;
import com.yandex.mobile.ads.mediation.base.MediatedBidderTokenLoadListener;
import com.yandex.mobile.ads.mediation.base.MediatedBidderTokenLoader;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class td0 {

    /* renamed from: a */
    @NonNull
    private final cd0<C6164a> f55079a;

    /* renamed from: b */
    @NonNull
    private final sd0 f55080b = new sd0();

    /* renamed from: c */
    @NonNull
    private final rd0 f55081c;

    /* renamed from: com.yandex.mobile.ads.impl.td0$a */
    public class C5795a implements MediatedBidderTokenLoadListener {

        /* renamed from: a */
        public final /* synthetic */ qd0 f55082a;

        /* renamed from: b */
        public final /* synthetic */ Context f55083b;

        /* renamed from: c */
        public final /* synthetic */ C6164a f55084c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC5796b f55085d;

        /* renamed from: e */
        public final /* synthetic */ C5535oe f55086e;

        /* renamed from: f */
        public final /* synthetic */ long f55087f;

        public C5795a(qd0 qd0Var, Context context, C6164a c6164a, InterfaceC5796b interfaceC5796b, C5535oe c5535oe, long j2) {
            this.f55082a = qd0Var;
            this.f55083b = context;
            this.f55084c = c6164a;
            this.f55085d = interfaceC5796b;
            this.f55086e = c5535oe;
            this.f55087f = j2;
        }

        @Override // com.yandex.mobile.ads.mediation.base.MediatedBidderTokenLoadListener
        public final void onBidderTokenFailedToLoad(@NonNull String str) {
            td0.m28631a(td0.this, this.f55083b, this.f55082a, this.f55084c, str, null, this.f55085d);
        }

        @Override // com.yandex.mobile.ads.mediation.base.MediatedBidderTokenLoadListener
        public final void onBidderTokenLoaded(@NonNull String str) {
            JSONObject jSONObject;
            if (TextUtils.isEmpty(str)) {
                td0.m28631a(td0.this, this.f55083b, this.f55082a, this.f55084c, this.f55082a.m27676c() + " provided empty token", null, this.f55085d);
                return;
            }
            if (this.f55086e.m27080a()) {
                td0.m28631a(td0.this, this.f55083b, this.f55082a, this.f55084c, this.f55082a.m27676c() + " didn't provide bidder token after timeout", Long.valueOf(SystemClock.elapsedRealtime() - this.f55087f), this.f55085d);
                return;
            }
            sd0 sd0Var = td0.this.f55080b;
            qd0 qd0Var = this.f55082a;
            Objects.requireNonNull(sd0Var);
            String m27676c = qd0Var.m27676c();
            Map<String, String> m27677d = qd0Var.m27677d();
            Map<String, String> m27680g = qd0Var.m27680g();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adapter", m27676c);
                if (m27677d != null) {
                    jSONObject2.put("bidding_info", new JSONObject(m27677d));
                }
                jSONObject2.put("network_data", new JSONObject(m27680g));
                jSONObject2.put("bidder_token", str);
                jSONObject = jSONObject2;
            } catch (JSONException e2) {
                n60.m26808a(e2, "Can't create mediation network json object", new Object[0]);
                jSONObject = null;
            }
            if (jSONObject == null) {
                td0.m28631a(td0.this, this.f55083b, this.f55082a, this.f55084c, "Can't create bidding data json object for network.", null, this.f55085d);
            } else {
                td0.m28632a(td0.this, this.f55083b, this.f55082a, this.f55084c, jSONObject, this.f55085d);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.td0$b */
    public interface InterfaceC5796b {
    }

    public td0(@NonNull ed0 ed0Var) {
        this.f55079a = new cd0<>(ed0Var);
        this.f55081c = new rd0(ed0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @MainThread
    /* renamed from: a */
    public final void m28633a(@NonNull Context context, @NonNull qd0 qd0Var, @NonNull C5535oe c5535oe, @NonNull InterfaceC5796b interfaceC5796b) {
        C6164a m23226a = this.f55079a.m23226a(context, qd0Var, C6164a.class);
        if (!(m23226a instanceof MediatedBidderTokenLoader)) {
            if (m23226a == 0) {
                ((wm0.C5979a) interfaceC5796b).f56164b.countDown();
                return;
            } else {
                this.f55081c.m27907a(context, qd0Var, m23226a, "Can't create bidder token loader.", null);
                ((wm0.C5979a) interfaceC5796b).f56164b.countDown();
                return;
            }
        }
        try {
            ((MediatedBidderTokenLoader) m23226a).loadBidderToken(context, qd0Var.m27680g(), new C5795a(qd0Var, context, m23226a, interfaceC5796b, c5535oe, SystemClock.elapsedRealtime()));
        } catch (Throwable th) {
            this.f55081c.m27907a(context, qd0Var, m23226a, th.toString(), null);
            ((wm0.C5979a) interfaceC5796b).f56164b.countDown();
        }
    }

    /* renamed from: a */
    public static void m28631a(td0 td0Var, Context context, qd0 qd0Var, C6164a c6164a, String str, Long l2, InterfaceC5796b interfaceC5796b) {
        td0Var.f55081c.m27907a(context, qd0Var, c6164a, str, l2);
        ((wm0.C5979a) interfaceC5796b).f56164b.countDown();
    }

    /* renamed from: a */
    public static void m28632a(td0 td0Var, Context context, qd0 qd0Var, C6164a c6164a, JSONObject jSONObject, InterfaceC5796b interfaceC5796b) {
        Object obj;
        td0Var.f55081c.m27906a(context, qd0Var, c6164a);
        wm0.C5979a c5979a = (wm0.C5979a) interfaceC5796b;
        obj = wm0.this.f56160b;
        synchronized (obj) {
            c5979a.f56163a.add(jSONObject);
        }
        c5979a.f56164b.countDown();
    }
}
