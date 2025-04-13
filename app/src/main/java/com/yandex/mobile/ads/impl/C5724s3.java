package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.s3 */
/* loaded from: classes3.dex */
public final class C5724s3 {

    /* renamed from: a */
    @NotNull
    private final Object f54487a = new Object();

    /* renamed from: b */
    @NotNull
    private final wp0 f54488b = new wp0();

    /* renamed from: c */
    @NotNull
    private final LinkedHashMap f54489c = new LinkedHashMap();

    /* renamed from: d */
    @NotNull
    private final ArrayList f54490d = new ArrayList();

    /* renamed from: a */
    public final void m28053a(@NotNull C5783t6 parametersProvider) {
        EnumC5668r3 adLoadingPhaseType = EnumC5668r3.f54168a;
        Intrinsics.m32179h(adLoadingPhaseType, "adLoadingPhaseType");
        Intrinsics.m32179h(parametersProvider, "parametersProvider");
        m28051a(adLoadingPhaseType, parametersProvider, null);
    }

    @NotNull
    /* renamed from: b */
    public final List<C5617q3> m28054b() {
        List<C5617q3> m32027j0;
        synchronized (this.f54487a) {
            m32027j0 = CollectionsKt.m32027j0(this.f54490d);
        }
        return m32027j0;
    }

    /* renamed from: b */
    public final void m28055b(@NotNull EnumC5668r3 adLoadingPhaseType) {
        Intrinsics.m32179h(adLoadingPhaseType, "adLoadingPhaseType");
        m28052a(adLoadingPhaseType, null);
    }

    /* renamed from: a */
    public final void m28052a(@NotNull EnumC5668r3 adLoadingPhaseType, @Nullable Object obj) {
        Intrinsics.m32179h(adLoadingPhaseType, "adLoadingPhaseType");
        synchronized (this.f54487a) {
            Map map = (Map) this.f54489c.get(adLoadingPhaseType);
            if (map == null) {
                map = new LinkedHashMap();
            }
            this.f54489c.put(adLoadingPhaseType, map);
            map.put(obj, Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    /* renamed from: a */
    public final void m28050a(@NotNull EnumC5668r3 adLoadingPhaseType) {
        Intrinsics.m32179h(adLoadingPhaseType, "adLoadingPhaseType");
        wp0 parametersProvider = this.f54488b;
        Intrinsics.m32179h(parametersProvider, "parametersProvider");
        m28051a(adLoadingPhaseType, parametersProvider, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052 A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x000d, B:9:0x0031, B:10:0x0048, B:12:0x0052, B:17:0x0018, B:19:0x0020), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031 A[Catch: all -> 0x005a, TryCatch #0 {, blocks: (B:4:0x000d, B:9:0x0031, B:10:0x0048, B:12:0x0052, B:17:0x0018, B:19:0x0020), top: B:3:0x000d }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m28051a(@org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.EnumC5668r3 r6, @org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.xp0 r7, @org.jetbrains.annotations.Nullable com.yandex.mobile.ads.impl.pa1 r8) {
        /*
            r5 = this;
            java.lang.String r0 = "adLoadingPhaseType"
            kotlin.jvm.internal.Intrinsics.m32179h(r6, r0)
            java.lang.String r0 = "parametersProvider"
            kotlin.jvm.internal.Intrinsics.m32179h(r7, r0)
            java.lang.Object r0 = r5.f54487a
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r5.f54489c     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L5a
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L5a
            if (r1 != 0) goto L18
            goto L2e
        L18:
            java.lang.Object r1 = r1.get(r8)     // Catch: java.lang.Throwable -> L5a
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto L2e
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L5a
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L5a
            long r3 = r3 - r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L5a
            goto L2f
        L2e:
            r1 = 0
        L2f:
            if (r1 == 0) goto L48
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L5a
            java.util.Map r7 = r7.mo26828a(r1)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = "parametersProvider.getReportParameters(duration)"
            kotlin.jvm.internal.Intrinsics.m32178g(r7, r1)     // Catch: java.lang.Throwable -> L5a
            com.yandex.mobile.ads.impl.q3 r1 = new com.yandex.mobile.ads.impl.q3     // Catch: java.lang.Throwable -> L5a
            r1.<init>(r6, r7)     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayList r7 = r5.f54490d     // Catch: java.lang.Throwable -> L5a
            r7.add(r1)     // Catch: java.lang.Throwable -> L5a
        L48:
            java.util.LinkedHashMap r7 = r5.f54489c     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Throwable -> L5a
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Throwable -> L5a
            if (r6 == 0) goto L58
            java.lang.Object r6 = r6.remove(r8)     // Catch: java.lang.Throwable -> L5a
            java.lang.Long r6 = (java.lang.Long) r6     // Catch: java.lang.Throwable -> L5a
        L58:
            monitor-exit(r0)
            return
        L5a:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5724s3.m28051a(com.yandex.mobile.ads.impl.r3, com.yandex.mobile.ads.impl.xp0, com.yandex.mobile.ads.impl.pa1):void");
    }

    /* renamed from: a */
    public final void m28049a() {
        synchronized (this.f54487a) {
            this.f54489c.clear();
            this.f54490d.clear();
        }
    }
}
