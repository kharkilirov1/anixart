package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.C5275j9;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.k9 */
/* loaded from: classes3.dex */
public final class C5329k9 {

    /* renamed from: f */
    private static final long f51907f = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: g */
    @NotNull
    private static final Object f51908g = new Object();

    /* renamed from: a */
    @NotNull
    private final C5275j9 f51909a;

    /* renamed from: b */
    @NotNull
    private final C5479n9 f51910b;

    /* renamed from: c */
    @NotNull
    private final Handler f51911c;

    /* renamed from: d */
    @NotNull
    private final WeakHashMap<InterfaceC5117gc, Object> f51912d;

    /* renamed from: e */
    private boolean f51913e;

    /* renamed from: com.yandex.mobile.ads.impl.k9$a */
    public final class a implements C5275j9.a {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.C5275j9.a
        /* renamed from: a */
        public final void mo25820a(@Nullable String str) {
            C5329k9.this.m26085a(str);
        }

        @Override // com.yandex.mobile.ads.impl.C5275j9.a
        /* renamed from: b */
        public final void mo25821b(@Nullable String str) {
            C5329k9.m26084a(C5329k9.this, str);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k9$b */
    public static final class b extends Lambda implements Function0<Unit> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Objects.requireNonNull(C5329k9.this.f51910b);
            C5329k9.m26084a(C5329k9.this, C5479n9.m26820a());
            return Unit.f63088a;
        }
    }

    public C5329k9(@NotNull C5275j9 appMetricaAutograbLoader, @NotNull C5479n9 appMetricaErrorProvider, @NotNull Handler stopStartupParamsRequestHandler) {
        Intrinsics.m32179h(appMetricaAutograbLoader, "appMetricaAutograbLoader");
        Intrinsics.m32179h(appMetricaErrorProvider, "appMetricaErrorProvider");
        Intrinsics.m32179h(stopStartupParamsRequestHandler, "stopStartupParamsRequestHandler");
        this.f51909a = appMetricaAutograbLoader;
        this.f51910b = appMetricaErrorProvider;
        this.f51911c = stopStartupParamsRequestHandler;
        this.f51912d = new WeakHashMap<>();
    }

    /* renamed from: a */
    public static final void m26084a(C5329k9 c5329k9, String str) {
        Objects.requireNonNull(c5329k9);
        n60.m26809b(str, new Object[0]);
        c5329k9.m26085a((String) null);
    }

    /* renamed from: b */
    public final void m26090b(@NotNull InterfaceC5117gc autograbRequestListener) {
        boolean z;
        Intrinsics.m32179h(autograbRequestListener, "autograbRequestListener");
        Object obj = f51908g;
        synchronized (obj) {
            this.f51912d.put(autograbRequestListener, null);
        }
        try {
            synchronized (obj) {
                z = true;
                if (this.f51913e) {
                    z = false;
                } else {
                    this.f51913e = true;
                }
            }
            if (z) {
                m26083a();
                this.f51909a.m25819a(new a());
            }
        } catch (Throwable th) {
            n60.m26808a(th, th.getMessage(), new Object[0]);
            Objects.requireNonNull(this.f51910b);
            n60.m26809b(C5479n9.m26821b(), new Object[0]);
            m26085a((String) null);
        }
    }

    /* renamed from: a */
    public final void m26089a(@NotNull InterfaceC5117gc autograbRequestListener) {
        Intrinsics.m32179h(autograbRequestListener, "autograbRequestListener");
        synchronized (f51908g) {
            this.f51912d.remove(autograbRequestListener);
        }
    }

    /* renamed from: a */
    private final void m26083a() {
        this.f51911c.postDelayed(new kp1(new b(), 0), f51907f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m26086a(Function0 tmp0) {
        Intrinsics.m32179h(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[LOOP:0: B:11:0x0023->B:13:0x0029, LOOP_END] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m26085a(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r0 = com.yandex.mobile.ads.impl.C5329k9.f51908g
            monitor-enter(r0)
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L37
            java.util.WeakHashMap<com.yandex.mobile.ads.impl.gc, java.lang.Object> r2 = r4.f51912d     // Catch: java.lang.Throwable -> L37
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L37
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L37
            java.util.WeakHashMap<com.yandex.mobile.ads.impl.gc, java.lang.Object> r2 = r4.f51912d     // Catch: java.lang.Throwable -> L37
            r2.clear()     // Catch: java.lang.Throwable -> L37
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L37
            android.os.Handler r2 = r4.f51911c     // Catch: java.lang.Throwable -> L34
            r3 = 0
            r2.removeCallbacksAndMessages(r3)     // Catch: java.lang.Throwable -> L34
            r2 = 0
            r4.f51913e = r2     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)
            java.util.Iterator r0 = r1.iterator()
        L23:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            com.yandex.mobile.ads.impl.gc r1 = (com.yandex.mobile.ads.impl.InterfaceC5117gc) r1
            r1.mo24840a(r5)
            goto L23
        L33:
            return
        L34:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r5     // Catch: java.lang.Throwable -> L37
        L37:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5329k9.m26085a(java.lang.String):void");
    }
}
