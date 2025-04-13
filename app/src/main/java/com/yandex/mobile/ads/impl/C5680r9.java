package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.metrica.IIdentifierCallback;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.r9 */
/* loaded from: classes3.dex */
public final class C5680r9 implements IIdentifierCallback {

    /* renamed from: g */
    @Deprecated
    private static final long f54229g = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: h */
    @Deprecated
    @NotNull
    private static final List<String> f54230h = CollectionsKt.m31994G("yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_uuid", "yandex_mobile_metrica_device_id");

    /* renamed from: a */
    @NotNull
    private final C5430m9 f54231a;

    /* renamed from: b */
    @NotNull
    private final C5626q9 f54232b;

    /* renamed from: c */
    @NotNull
    private final Handler f54233c;

    /* renamed from: d */
    @NotNull
    private final C5479n9 f54234d;

    /* renamed from: e */
    private boolean f54235e;

    /* renamed from: f */
    @NotNull
    private final Object f54236f;

    /* renamed from: com.yandex.mobile.ads.impl.r9$a */
    public static final class a extends Lambda implements Function0<Unit> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C5680r9.m27870b(C5680r9.this);
            Objects.requireNonNull(C5680r9.this.f54234d);
            C5680r9.m27868a(C5680r9.this, C5479n9.m26820a());
            return Unit.f63088a;
        }
    }

    public C5680r9(@NotNull C5430m9 appMetricaBridge, @NotNull C5626q9 appMetricaIdentifiersChangedObservable) {
        Intrinsics.m32179h(appMetricaBridge, "appMetricaBridge");
        Intrinsics.m32179h(appMetricaIdentifiersChangedObservable, "appMetricaIdentifiersChangedObservable");
        this.f54231a = appMetricaBridge;
        this.f54232b = appMetricaIdentifiersChangedObservable;
        this.f54233c = new Handler(Looper.getMainLooper());
        this.f54234d = new C5479n9();
        this.f54236f = new Object();
    }

    /* renamed from: b */
    public static final void m27870b(C5680r9 c5680r9) {
        synchronized (c5680r9.f54236f) {
            c5680r9.f54233c.removeCallbacksAndMessages(null);
            c5680r9.f54235e = false;
        }
    }

    @Override // com.yandex.metrica.IIdentifierCallback
    public final void onReceive(@Nullable Map<String, String> map) {
        n60.m26811d("Params from the AppMetrica were obtained, data: %s", map);
        synchronized (this.f54236f) {
            this.f54233c.removeCallbacksAndMessages(null);
            this.f54235e = false;
        }
        if (map != null) {
            this.f54232b.m27661a(new C5571p9(map.get("yandex_mobile_metrica_get_ad_url"), map.get("yandex_mobile_metrica_device_id"), map.get("yandex_mobile_metrica_uuid")));
            return;
        }
        Objects.requireNonNull(this.f54234d);
        n60.m26810c(C5479n9.m26822c(), new Object[0]);
        this.f54232b.m27659a();
    }

    @Override // com.yandex.metrica.IIdentifierCallback
    public final void onRequestError(@NotNull IIdentifierCallback.Reason failureReason) {
        Intrinsics.m32179h(failureReason, "failureReason");
        synchronized (this.f54236f) {
            this.f54233c.removeCallbacksAndMessages(null);
            this.f54235e = false;
        }
        n60.m26810c(this.f54234d.m26823a(failureReason), new Object[0]);
        this.f54232b.m27659a();
    }

    /* renamed from: a */
    public static final void m27868a(C5680r9 c5680r9, String str) {
        Objects.requireNonNull(c5680r9);
        n60.m26810c(str, new Object[0]);
        c5680r9.f54232b.m27659a();
    }

    /* renamed from: a */
    public final void m27872a(@NotNull Context context, @NotNull k10 observer) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(observer, "observer");
        this.f54232b.m27660a(observer);
        try {
            m27867a(context);
        } catch (Throwable th) {
            synchronized (this.f54236f) {
                this.f54233c.removeCallbacksAndMessages(null);
                this.f54235e = false;
                n60.m26808a(th, th.getMessage(), new Object[0]);
            }
        }
    }

    /* renamed from: a */
    private final void m27867a(Context context) {
        boolean z;
        synchronized (this.f54236f) {
            z = true;
            if (this.f54235e) {
                z = false;
            } else {
                this.f54235e = true;
            }
        }
        if (z) {
            n60.m26809b("requestStartupParams", new Object[0]);
            m27866a();
            C5430m9 c5430m9 = this.f54231a;
            List<String> list = f54230h;
            Objects.requireNonNull(c5430m9);
            C5430m9.m26589a(context, this, list);
        }
    }

    /* renamed from: a */
    private final void m27866a() {
        this.f54233c.postDelayed(new kp1(new a(), 1), f54229g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m27869a(Function0 tmp0) {
        Intrinsics.m32179h(tmp0, "$tmp0");
        tmp0.invoke();
    }
}
