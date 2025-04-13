package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.hd1;
import com.yandex.mobile.ads.impl.qd1;
import com.yandex.mobile.ads.impl.sv0;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class nd1 implements qd1.InterfaceC5632a, hd1.InterfaceC5177a {

    /* renamed from: k */
    public static final /* synthetic */ KProperty<Object>[] f52916k = {Reflection.m32195c(new MutablePropertyReference1Impl(nd1.class, "adParameterManager", "getAdParameterManager()Lcom/yandex/mobile/ads/core/report/Report$ReportParameterManager;", 0)), Reflection.m32195c(new MutablePropertyReference1Impl(nd1.class, "requestParameterManager", "getRequestParameterManager()Lcom/yandex/mobile/ads/core/report/Report$ReportParameterManager;", 0))};

    /* renamed from: l */
    @Deprecated
    private static final long f52917l = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a */
    @NotNull
    private final C5724s3 f52918a;

    /* renamed from: b */
    @NotNull
    private final tf1 f52919b;

    /* renamed from: c */
    @NotNull
    private final qd1 f52920c;

    /* renamed from: d */
    @NotNull
    private final hd1 f52921d;

    /* renamed from: e */
    @NotNull
    private final pd1 f52922e;

    /* renamed from: f */
    @NotNull
    private final we1 f52923f;

    /* renamed from: g */
    @NotNull
    private final lp0 f52924g;

    /* renamed from: h */
    private boolean f52925h;

    /* renamed from: i */
    @NotNull
    private final C5484a f52926i;

    /* renamed from: j */
    @NotNull
    private final C5485b f52927j;

    /* renamed from: com.yandex.mobile.ads.impl.nd1$a */
    public static final class C5484a extends ObservableProperty<sv0.InterfaceC5763a> {
        public C5484a() {
            super(null);
        }

        @Override // kotlin.properties.ObservableProperty
        public final void afterChange(@NotNull KProperty<?> property, sv0.InterfaceC5763a interfaceC5763a, sv0.InterfaceC5763a interfaceC5763a2) {
            Intrinsics.m32179h(property, "property");
            nd1.this.f52922e.m27316a(interfaceC5763a2);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nd1$b */
    public static final class C5485b extends ObservableProperty<sv0.InterfaceC5763a> {
        public C5485b() {
            super(null);
        }

        @Override // kotlin.properties.ObservableProperty
        public final void afterChange(@NotNull KProperty<?> property, sv0.InterfaceC5763a interfaceC5763a, sv0.InterfaceC5763a interfaceC5763a2) {
            Intrinsics.m32179h(property, "property");
            nd1.this.f52922e.m27319b(interfaceC5763a2);
        }
    }

    public nd1(@NotNull Context context, @NotNull hc1<?> videoAdInfo, @NotNull C5724s3 adLoadingPhasesManager, @NotNull sd1 videoAdStatusController, @NotNull ag1 videoViewProvider, @NotNull gf1 renderValidator, @NotNull tf1 videoTracker) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        Intrinsics.m32179h(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.m32179h(videoAdStatusController, "videoAdStatusController");
        Intrinsics.m32179h(videoViewProvider, "videoViewProvider");
        Intrinsics.m32179h(renderValidator, "renderValidator");
        Intrinsics.m32179h(videoTracker, "videoTracker");
        this.f52918a = adLoadingPhasesManager;
        this.f52919b = videoTracker;
        this.f52920c = new qd1(renderValidator, this);
        this.f52921d = new hd1(videoAdStatusController, this);
        this.f52922e = new pd1(context, adLoadingPhasesManager);
        this.f52923f = new we1(videoAdInfo, videoViewProvider);
        this.f52924g = new lp0(false);
        this.f52926i = new C5484a();
        this.f52927j = new C5485b();
    }

    /* renamed from: b */
    public final void m26852b(@Nullable sv0.InterfaceC5763a interfaceC5763a) {
        this.f52927j.setValue(this, f52916k[1], interfaceC5763a);
    }

    /* renamed from: c */
    public final void m26853c() {
        this.f52920c.m27700b();
        this.f52921d.m25130b();
        this.f52924g.m26513a();
    }

    /* renamed from: d */
    public final void m26854d() {
        this.f52920c.m27700b();
        this.f52921d.m25130b();
        this.f52924g.m26513a();
    }

    /* renamed from: e */
    public final void m26855e() {
        this.f52925h = false;
        this.f52922e.m27318a((Map<String, ? extends Object>) null);
        this.f52920c.m27700b();
        this.f52921d.m25130b();
        this.f52924g.m26513a();
    }

    /* renamed from: f */
    public final void m26856f() {
        this.f52920c.m27699a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m26847b(nd1 this$0) {
        Intrinsics.m32179h(this$0, "this$0");
        this$0.m26850a(new ed1(8, new C5350ko()));
    }

    /* renamed from: a */
    public final void m26851a(@Nullable sv0.InterfaceC5763a interfaceC5763a) {
        this.f52926i.setValue(this, f52916k[0], interfaceC5763a);
    }

    @Override // com.yandex.mobile.ads.impl.qd1.InterfaceC5632a
    /* renamed from: a */
    public final void mo26849a() {
        this.f52920c.m27700b();
        this.f52918a.m28055b(EnumC5668r3.f54179l);
        this.f52919b.mo25516i();
        this.f52921d.m25129a();
        this.f52924g.m26514a(f52917l, new en1(this, 11));
    }

    @Override // com.yandex.mobile.ads.impl.hd1.InterfaceC5177a
    /* renamed from: b */
    public final void mo25131b() {
        this.f52922e.m27318a((Map<String, ? extends Object>) this.f52923f.mo22529a());
        this.f52918a.m28050a(EnumC5668r3.f54179l);
        if (this.f52925h) {
            return;
        }
        this.f52925h = true;
        this.f52922e.m27315a();
    }

    /* renamed from: a */
    public final void m26850a(@NotNull ed1 error) {
        Intrinsics.m32179h(error, "error");
        this.f52920c.m27700b();
        this.f52921d.m25130b();
        this.f52924g.m26513a();
        if (this.f52925h) {
            return;
        }
        this.f52925h = true;
        String lowerCase = dd1.m23872a(error.m24128a()).toLowerCase(Locale.ROOT);
        Intrinsics.m32178g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String message = error.m24129b().getMessage();
        if (message == null) {
            message = "";
        }
        this.f52922e.m27317a(lowerCase, message);
    }
}
