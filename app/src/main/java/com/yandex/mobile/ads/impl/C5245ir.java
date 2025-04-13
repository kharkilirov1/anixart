package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.yandex.mobile.ads.base.model.AdUnitIdBiddingSettings;
import com.yandex.mobile.ads.base.model.BiddingSettings;
import com.yandex.mobile.ads.impl.wm0;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.ir */
/* loaded from: classes3.dex */
final class C5245ir {

    /* renamed from: a */
    @NonNull
    private final C5101g2 f51370a;

    /* renamed from: c */
    @NonNull
    private final C5106g6 f51372c;

    /* renamed from: d */
    @NonNull
    private final wm0 f51373d;

    /* renamed from: b */
    @NonNull
    private final C5483nd f51371b = new C5483nd();

    /* renamed from: e */
    @NonNull
    private final Handler f51374e = new Handler(Looper.getMainLooper());

    /* renamed from: com.yandex.mobile.ads.impl.ir$a */
    public final class a implements wm0.InterfaceC5980b {

        /* renamed from: a */
        @NonNull
        private final InterfaceC5588pe f51375a;

        public /* synthetic */ a(C5245ir c5245ir, InterfaceC5588pe interfaceC5588pe, int i2) {
            this(interfaceC5588pe);
        }

        @WorkerThread
        /* renamed from: a */
        public final void m25604a(@Nullable JSONArray jSONArray) {
            C5245ir.this.m25600a(this.f51375a, C5245ir.m25598a(C5245ir.this, jSONArray));
        }

        private a(InterfaceC5588pe interfaceC5588pe) {
            this.f51375a = interfaceC5588pe;
        }
    }

    public C5245ir(@NonNull C5101g2 c5101g2, @NonNull BiddingSettings biddingSettings) {
        this.f51370a = c5101g2;
        this.f51372c = new C5106g6(biddingSettings);
        this.f51373d = new wm0(new ed0(c5101g2, null));
    }

    /* renamed from: a */
    public static String m25598a(C5245ir c5245ir, JSONArray jSONArray) {
        Objects.requireNonNull(c5245ir);
        if (jSONArray.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("networks", jSONArray);
                C5483nd c5483nd = c5245ir.f51371b;
                String jSONObject2 = jSONObject.toString();
                Objects.requireNonNull(c5483nd);
                return C5483nd.m26844a(jSONObject2);
            } catch (JSONException e2) {
                n60.m26808a(e2, "Can't create bidding data", new Object[0]);
            }
        }
        return null;
    }

    @WorkerThread
    /* renamed from: a */
    public final void m25603a(@NonNull Context context, @NonNull InterfaceC5588pe interfaceC5588pe) {
        AdUnitIdBiddingSettings m24807a = this.f51372c.m24807a(this.f51370a.m24779c());
        if (m24807a != null) {
            this.f51373d.m29502b(context, m24807a.m21921d(), new a(this, interfaceC5588pe, 0));
        } else {
            interfaceC5588pe.mo27320a(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m25600a(@NonNull InterfaceC5588pe interfaceC5588pe, @Nullable String str) {
        this.f51374e.post(new hn1(interfaceC5588pe, str, 2));
    }
}
