package com.yandex.metrica.push.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.appmetrica.push.firebase.FirebasePushServiceControllerProvider;
import com.yandex.metrica.push.InterfaceC4490b;
import com.yandex.metrica.push.InterfaceC4491c;
import com.yandex.metrica.push.TokenUpdateListener;
import com.yandex.metrica.push.common.CoreConstants;
import com.yandex.metrica.push.common.utils.TrackersHub;
import com.yandex.metrica.push.core.notification.C4502e;
import com.yandex.metrica.push.core.notification.C4503f;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.metrica.push.impl.a */
/* loaded from: classes2.dex */
public final class C4562a {

    /* renamed from: j */
    @SuppressLint
    private static volatile C4562a f47332j;

    /* renamed from: a */
    @NonNull
    private final Context f47334a;

    /* renamed from: b */
    @NonNull
    private final Object f47335b = new Object();

    /* renamed from: c */
    private boolean f47336c = false;

    /* renamed from: d */
    @Nullable
    private C4570e f47337d;

    /* renamed from: e */
    @Nullable
    @Deprecated
    private String f47338e;

    /* renamed from: f */
    @Nullable
    private Map<String, String> f47339f;

    /* renamed from: g */
    @NonNull
    private InterfaceC4572f f47340g;

    /* renamed from: h */
    @Nullable
    private TokenUpdateListener f47341h;

    /* renamed from: i */
    private static final String[] f47331i = {CoreConstants.Transport.FIREBASE, CoreConstants.Transport.GCM, CoreConstants.Transport.HMS};

    /* renamed from: k */
    private static final Object f47333k = new Object();

    @VisibleForTesting
    public C4562a(@NonNull Context context) {
        this.f47334a = context;
        this.f47340g = new C4564b(context, this);
        m21489b(context);
    }

    @NonNull
    /* renamed from: a */
    public static C4562a m21488a(@NonNull Context context) {
        if (f47332j == null) {
            synchronized (f47333k) {
                if (f47332j == null) {
                    f47332j = new C4562a(context.getApplicationContext());
                }
            }
        }
        return f47332j;
    }

    /* renamed from: b */
    private void m21489b(@NonNull Context context) {
        TrackersHub.getInstance().registerTracker(new C4528I0(context, "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"));
        C4603u0.m21732a().m21733a(((C4564b) this.f47340g).m21520l());
    }

    @Nullable
    /* renamed from: c */
    public InterfaceC4491c m21497c() {
        Objects.requireNonNull(this.f47340g);
        return null;
    }

    @NonNull
    /* renamed from: d */
    public C4560Z m21498d() {
        return ((C4564b) this.f47340g).m21516h();
    }

    @NonNull
    /* renamed from: e */
    public C4566c m21499e() {
        return ((C4564b) this.f47340g).m21517i();
    }

    @NonNull
    /* renamed from: f */
    public C4565b0 m21500f() {
        return ((C4564b) this.f47340g).m21518j();
    }

    @NonNull
    /* renamed from: g */
    public C4568d m21501g() {
        return ((C4564b) this.f47340g).m21519k();
    }

    @Nullable
    /* renamed from: h */
    public C4570e m21502h() {
        return this.f47337d;
    }

    @NonNull
    /* renamed from: i */
    public InterfaceC4572f m21503i() {
        return this.f47340g;
    }

    @Nullable
    @Deprecated
    /* renamed from: j */
    public String m21504j() {
        return this.f47338e;
    }

    @Nullable
    /* renamed from: k */
    public Map<String, String> m21505k() {
        return this.f47339f;
    }

    @MainThread
    /* renamed from: l */
    public void m21506l() {
        m21494a(new FirebasePushServiceControllerProvider(this.f47334a));
    }

    /* renamed from: m */
    public boolean m21507m() {
        boolean z;
        synchronized (this.f47335b) {
            z = this.f47336c;
        }
        return z;
    }

    @VisibleForTesting
    /* renamed from: b */
    public void m21496b(@NonNull Map<String, String> map) {
        this.f47339f = map;
        for (String str : f47331i) {
            String str2 = map.get(str);
            this.f47338e = str2;
            if (!TextUtils.isEmpty(str2)) {
                break;
            }
        }
        TokenUpdateListener tokenUpdateListener = this.f47341h;
        if (tokenUpdateListener != null) {
            tokenUpdateListener.onTokenUpdated(map);
        }
    }

    /* renamed from: a */
    public void m21492a(@NonNull Map<String, String> map) {
        m21496b(map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            C4603u0.m21732a().mo21638a(((C4564b) this.f47340g).m21511c().m21731a(entry.getValue(), ((C4564b) this.f47340g).m21515g().m21405a()), entry.getKey());
        }
    }

    @NonNull
    /* renamed from: b */
    public C4502e m21495b() {
        return ((C4564b) this.f47340g).m21514f();
    }

    /* renamed from: a */
    public void m21493a(@NonNull Map<String, String> map, @Nullable Long l2) {
        m21496b(map);
        boolean z = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            C4503f m21405a = ((C4564b) this.f47340g).m21515g().m21405a();
            if (z) {
                m21405a.m21401a(l2);
                z = false;
            }
            C4603u0.m21732a().mo21642b(((C4564b) this.f47340g).m21511c().m21731a(entry.getValue(), m21405a), entry.getKey());
        }
    }

    @Nullable
    /* renamed from: a */
    public InterfaceC4490b m21490a() {
        Objects.requireNonNull(this.f47340g);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @androidx.annotation.MainThread
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m21494a(com.yandex.metrica.push.common.core.PushServiceControllerProvider... r7) {
        /*
            r6 = this;
            com.yandex.metrica.push.impl.f r0 = r6.f47340g
            com.yandex.metrica.push.impl.b r0 = (com.yandex.metrica.push.impl.C4564b) r0
            com.yandex.metrica.push.impl.H0 r0 = r0.m21510b()
            java.util.Objects.requireNonNull(r0)
            r1 = 1
            r2 = 0
            java.lang.String r3 = r0.m21438b()     // Catch: java.lang.Exception -> L25
            boolean r3 = com.yandex.metrica.push.common.utils.CoreUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L25
            if (r3 != 0) goto L25
            java.lang.String r0 = r0.m21438b()     // Catch: java.lang.Exception -> L25
            java.lang.String r3 = ":"
            boolean r0 = r0.contains(r3)     // Catch: java.lang.Exception -> L25
            if (r0 != 0) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            if (r0 == 0) goto Ld0
            java.lang.Object r0 = r6.f47335b
            monitor-enter(r0)
            boolean r3 = r6.f47336c     // Catch: java.lang.Throwable -> Lcd
            if (r3 != 0) goto Lc4
            java.lang.String r3 = "Initializing AppMetrica Push SDK"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lcd
            com.yandex.metrica.push.common.utils.PublicLogger.m21382d(r3, r4)     // Catch: java.lang.Throwable -> Lcd
            com.yandex.metrica.push.common.utils.TrackersHub r3 = com.yandex.metrica.push.common.utils.TrackersHub.getInstance()     // Catch: java.lang.Throwable -> Lcd
            r3.resumeSession()     // Catch: java.lang.Throwable -> Lcd
            com.yandex.metrica.push.common.utils.TrackersHub r3 = com.yandex.metrica.push.common.utils.TrackersHub.getInstance()     // Catch: java.lang.Throwable -> Lcd
            r3.pauseSession()     // Catch: java.lang.Throwable -> Lcd
            boolean r3 = com.yandex.metrica.C4484p.iifa()     // Catch: java.lang.Throwable -> Lcd
            if (r3 == 0) goto Lbc
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lcd
            int r4 = r7.length     // Catch: java.lang.Throwable -> Lcd
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lcd
            int r4 = r7.length     // Catch: java.lang.Throwable -> Lcd
        L51:
            if (r2 >= r4) goto L5f
            r5 = r7[r2]     // Catch: java.lang.Throwable -> Lcd
            com.yandex.metrica.push.common.core.PushServiceController r5 = r5.getPushServiceController()     // Catch: java.lang.Throwable -> Lcd
            r3.add(r5)     // Catch: java.lang.Throwable -> Lcd
            int r2 = r2 + 1
            goto L51
        L5f:
            com.yandex.metrica.push.impl.e r7 = new com.yandex.metrica.push.impl.e     // Catch: java.lang.Throwable -> Lcd
            android.content.Context r2 = r6.f47334a     // Catch: java.lang.Throwable -> Lcd
            r7.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lcd
            r6.f47337d = r7     // Catch: java.lang.Throwable -> Lcd
            android.content.Context r7 = r6.f47334a     // Catch: java.lang.Throwable -> Lcd
            com.yandex.metrica.push.common.PushServiceFacade.initPushService(r7)     // Catch: java.lang.Throwable -> Lcd
            com.yandex.metrica.push.core.notification.e r7 = r6.m21495b()     // Catch: java.lang.Throwable -> Lcd
            r7.m21399c()     // Catch: java.lang.Throwable -> Lcd
            com.yandex.metrica.push.impl.c r7 = r6.m21499e()     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r2 = "com.yandex.metrica.push.all_tokens"
            r3 = 0
            android.content.SharedPreferences r7 = r7.m21524a()     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r7 = r7.getString(r2, r3)     // Catch: java.lang.Throwable -> Lcd
            java.util.Map r7 = com.yandex.metrica.push.impl.C4587m0.m21556a(r7)     // Catch: java.lang.Throwable -> Lcd
            if (r7 == 0) goto Lb9
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lcd
            r2.<init>()     // Catch: java.lang.Throwable -> Lcd
            java.util.Set r7 = r7.entrySet()     // Catch: java.lang.Throwable -> Lcd
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> Lcd
        L96:
            boolean r3 = r7.hasNext()     // Catch: java.lang.Throwable -> Lcd
            if (r3 == 0) goto Lb2
            java.lang.Object r3 = r7.next()     // Catch: java.lang.Throwable -> Lcd
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> Lcd
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> Lcd
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> Lcd
            com.yandex.metrica.push.impl.m0 r3 = (com.yandex.metrica.push.impl.C4587m0) r3     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r3 = r3.f47397a     // Catch: java.lang.Throwable -> Lcd
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> Lcd
            goto L96
        Lb2:
            java.util.Map r7 = java.util.Collections.unmodifiableMap(r2)     // Catch: java.lang.Throwable -> Lcd
            r6.m21496b(r7)     // Catch: java.lang.Throwable -> Lcd
        Lb9:
            r6.f47336c = r1     // Catch: java.lang.Throwable -> Lcd
            goto Lcb
        Lbc:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r1 = "YandexMetrica isn't initialized. Use YandexMetrica#activate(android.content.Context, String) method to activate. See more at https://appmetrica.yandex.ru/docs/mobile-sdk-dg/push/android-initialize.html"
            r7.<init>(r1)     // Catch: java.lang.Throwable -> Lcd
            throw r7     // Catch: java.lang.Throwable -> Lcd
        Lc4:
            java.lang.String r7 = "AppMetrica Push SDK has already been initialized."
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lcd
            com.yandex.metrica.push.common.utils.PublicLogger.m21386w(r7, r1)     // Catch: java.lang.Throwable -> Lcd
        Lcb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lcd
            goto Ld7
        Lcd:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lcd
            throw r7
        Ld0:
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.String r0 = "Ignore AppMetrica Push SDK initialization from non main process"
            com.yandex.metrica.push.common.utils.PublicLogger.m21382d(r0, r7)
        Ld7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.push.impl.C4562a.m21494a(com.yandex.metrica.push.common.core.PushServiceControllerProvider[]):void");
    }

    /* renamed from: a */
    public void m21491a(@NonNull TokenUpdateListener tokenUpdateListener) {
        this.f47341h = tokenUpdateListener;
    }
}
