package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import com.yandex.mobile.ads.impl.sv0;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* renamed from: com.yandex.mobile.ads.impl.z */
/* loaded from: classes3.dex */
public final class C6098z {

    /* renamed from: a */
    @NonNull
    private final Context f56984a;

    /* renamed from: b */
    @NonNull
    private final C4948d0 f56985b;

    /* renamed from: c */
    @NonNull
    private final a f56986c = new a(this);

    /* renamed from: d */
    @NonNull
    private final InterfaceC5830u f56987d = C5895v.m29150a();

    /* renamed from: e */
    @NonNull
    private final t41 f56988e = t41.m28460a();

    public C6098z(@NonNull Context context, @NonNull C5101g2 c5101g2, @NonNull InterfaceC4832b0 interfaceC4832b0, @Nullable FalseClick falseClick) {
        this.f56984a = context.getApplicationContext();
        this.f56985b = new C4948d0(context, c5101g2, interfaceC4832b0, falseClick);
    }

    /* renamed from: a */
    public final void m30001a() {
        this.f56987d.mo28809b(this.f56984a, (InterfaceC4996e0) this.f56986c);
        this.f56987d.mo28810b(this.f56984a, (ex0) this.f56986c);
    }

    /* renamed from: b */
    public final void m30003b() {
        this.f56985b.m23732a(3);
    }

    /* renamed from: c */
    public final void m30004c() {
        this.f56985b.m23734b(3);
    }

    /* renamed from: d */
    public final void m30005d() {
        this.f56985b.m23732a(1);
        this.f56987d.mo28807a(this.f56984a, (InterfaceC4996e0) this.f56986c);
        this.f56987d.mo28808a(this.f56984a, (ex0) this.f56986c);
        this.f56988e.m28461a(h70.f50866c, this);
    }

    /* renamed from: e */
    public final void m30006e() {
        this.f56988e.m28462b(h70.f50866c, this);
        this.f56987d.mo28809b(this.f56984a, (InterfaceC4996e0) this.f56986c);
        this.f56987d.mo28810b(this.f56984a, (ex0) this.f56986c);
        this.f56985b.m23734b(1);
    }

    /* renamed from: f */
    public final void m30007f() {
        this.f56985b.m23732a(2);
    }

    /* renamed from: g */
    public final void m30008g() {
        this.f56985b.m23734b(2);
    }

    @VisibleForTesting
    /* renamed from: com.yandex.mobile.ads.impl.z$a */
    public static class a implements InterfaceC4996e0, ex0 {

        /* renamed from: a */
        @Nullable
        private WeakReference<Activity> f56989a;

        /* renamed from: b */
        @Nullable
        private String f56990b;

        /* renamed from: c */
        @NonNull
        private final C6098z f56991c;

        public a(@NonNull C6098z c6098z) {
            this.f56991c = c6098z;
        }

        @Override // com.yandex.mobile.ads.impl.ex0
        /* renamed from: a */
        public final void mo24276a(@NonNull Activity activity, @Nullable Bundle bundle) {
            String string;
            n60.m26809b("onCreated, activity = " + activity, new Object[0]);
            if (bundle == null || (string = bundle.getString("yandex_mobile_ads_activity_id")) == null || !string.equals(this.f56990b)) {
                return;
            }
            this.f56991c.m30005d();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4996e0
        /* renamed from: b */
        public final void mo23986b(@NonNull Activity activity) {
            n60.m26809b("onResume, activity = " + activity, new Object[0]);
            WeakReference<Activity> weakReference = this.f56989a;
            if (weakReference == null || !activity.equals(weakReference.get())) {
                return;
            }
            this.f56991c.m30005d();
        }

        @Override // com.yandex.mobile.ads.impl.ex0
        /* renamed from: b */
        public final void mo24277b(@NonNull Activity activity, @Nullable Bundle bundle) {
            WeakReference<Activity> weakReference;
            n60.m26809b("onSaveInstanceState, activity = " + activity, new Object[0]);
            if (bundle == null || (weakReference = this.f56989a) == null || !activity.equals(weakReference.get())) {
                return;
            }
            String uuid = UUID.randomUUID().toString();
            this.f56990b = uuid;
            bundle.putString("yandex_mobile_ads_activity_id", uuid);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4996e0
        /* renamed from: a */
        public final void mo23985a(@NonNull Activity activity) {
            n60.m26809b("onPause, activity = " + activity, new Object[0]);
            if (this.f56989a == null) {
                this.f56989a = new WeakReference<>(activity);
            }
        }
    }

    /* renamed from: a */
    public final void m30002a(@NonNull sv0.InterfaceC5763a interfaceC5763a) {
        this.f56985b.m23733a(interfaceC5763a);
    }
}
