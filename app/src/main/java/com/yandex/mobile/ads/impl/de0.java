package com.yandex.mobile.ads.impl;

import com.yandex.metrica.IReporter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class de0 implements vv0 {

    /* renamed from: b */
    @NotNull
    private static final Object f49638b = new Object();

    /* renamed from: c */
    public static final /* synthetic */ int f49639c = 0;

    /* renamed from: a */
    @Nullable
    private final IReporter f49640a;

    /* renamed from: com.yandex.mobile.ads.impl.de0$a */
    public static final class C4968a {
        @NotNull
        /* renamed from: a */
        public static Object m23877a() {
            return de0.f49638b;
        }
    }

    public de0(@Nullable IReporter iReporter) {
        this.f49640a = iReporter;
    }

    @Override // com.yandex.mobile.ads.impl.vv0
    /* renamed from: a */
    public final void mo23876a(@NotNull sv0 report) {
        Intrinsics.m32179h(report, "report");
        if (this.f49640a == null) {
            n60.m26811d("Reporter is null", new Object[0]);
            return;
        }
        String m28360b = report.m28360b();
        Intrinsics.m32178g(m28360b, "report.eventName");
        Map<String, Object> m28359a = report.m28359a();
        Intrinsics.m32178g(m28359a, "report.data");
        try {
            m23875a(m28360b, m28359a);
            this.f49640a.reportEvent(m28360b, m28359a);
        } catch (Throwable th) {
            n60.m26808a(th, th.toString(), new Object[0]);
        }
    }

    /* renamed from: a */
    private static void m23875a(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.m32062g(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ArraysKt.m31966p(new Object[]{entry.getValue()}));
        }
        n60.m26809b("reportEvent(), eventName = " + str + ", reportData = " + linkedHashMap, new Object[0]);
    }
}
