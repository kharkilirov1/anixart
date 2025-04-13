package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.sv0;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class pd1 {

    /* renamed from: a */
    @NotNull
    private final vv0 f53545a;

    /* renamed from: b */
    @NotNull
    private final od1 f53546b;

    /* renamed from: c */
    @Nullable
    private sv0.InterfaceC5763a f53547c;

    /* renamed from: d */
    @Nullable
    private sv0.InterfaceC5763a f53548d;

    /* renamed from: e */
    @Nullable
    private Map<String, ? extends Object> f53549e;

    public pd1(@NotNull Context context, @NotNull C5724s3 adLoadingPhasesManager) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adLoadingPhasesManager, "adLoadingPhasesManager");
        this.f53545a = C5730s8.m28078a(context);
        this.f53546b = new od1(adLoadingPhasesManager);
    }

    /* renamed from: a */
    public final void m27316a(@Nullable sv0.InterfaceC5763a interfaceC5763a) {
        this.f53548d = interfaceC5763a;
    }

    /* renamed from: b */
    public final void m27319b(@Nullable sv0.InterfaceC5763a interfaceC5763a) {
        this.f53547c = interfaceC5763a;
    }

    /* renamed from: a */
    public final void m27318a(@Nullable Map<String, ? extends Object> map) {
        this.f53549e = map;
    }

    /* renamed from: a */
    public final void m27315a() {
        Map m32065j = MapsKt.m32065j(new Pair("status", "success"));
        m32065j.putAll(this.f53546b.m27079a());
        Map<String, ? extends Object> map = this.f53549e;
        if (map == null) {
            map = EmptyMap.f63145b;
        }
        m32065j.putAll(map);
        sv0.InterfaceC5763a interfaceC5763a = this.f53547c;
        Map<String, Object> mo22529a = interfaceC5763a != null ? interfaceC5763a.mo22529a() : null;
        if (mo22529a == null) {
            mo22529a = EmptyMap.f63145b;
        }
        m32065j.putAll(mo22529a);
        sv0.InterfaceC5763a interfaceC5763a2 = this.f53548d;
        Map<String, Object> mo22529a2 = interfaceC5763a2 != null ? interfaceC5763a2.mo22529a() : null;
        if (mo22529a2 == null) {
            mo22529a2 = EmptyMap.f63145b;
        }
        m32065j.putAll(mo22529a2);
        this.f53545a.mo23876a(new sv0(sv0.EnumC5764b.f54825M, (Map<String, Object>) m32065j));
    }

    /* renamed from: a */
    public final void m27317a(@NotNull String failureReason, @NotNull String errorMessage) {
        Intrinsics.m32179h(failureReason, "failureReason");
        Intrinsics.m32179h(errorMessage, "errorMessage");
        Map m32065j = MapsKt.m32065j(new Pair("status", "error"), new Pair("failure_reason", failureReason), new Pair("error_message", errorMessage));
        Map<String, ? extends Object> map = this.f53549e;
        if (map == null) {
            map = EmptyMap.f63145b;
        }
        m32065j.putAll(map);
        sv0.InterfaceC5763a interfaceC5763a = this.f53547c;
        Map<String, Object> mo22529a = interfaceC5763a != null ? interfaceC5763a.mo22529a() : null;
        if (mo22529a == null) {
            mo22529a = EmptyMap.f63145b;
        }
        m32065j.putAll(mo22529a);
        sv0.InterfaceC5763a interfaceC5763a2 = this.f53548d;
        Map<String, Object> mo22529a2 = interfaceC5763a2 != null ? interfaceC5763a2.mo22529a() : null;
        if (mo22529a2 == null) {
            mo22529a2 = EmptyMap.f63145b;
        }
        m32065j.putAll(mo22529a2);
        this.f53545a.mo23876a(new sv0(sv0.EnumC5764b.f54825M, (Map<String, Object>) m32065j));
    }
}
