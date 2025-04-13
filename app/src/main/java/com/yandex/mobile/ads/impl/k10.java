package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class k10 {

    /* renamed from: h */
    @NotNull
    private static final Object f51800h = new Object();

    /* renamed from: i */
    public static final /* synthetic */ int f51801i = 0;

    /* renamed from: a */
    @NotNull
    private final C5430m9 f51802a;

    /* renamed from: b */
    @NotNull
    private final C5787t9 f51803b;

    /* renamed from: c */
    @NotNull
    private final C5680r9 f51804c;

    /* renamed from: d */
    @NotNull
    private final Context f51805d;

    /* renamed from: e */
    @Nullable
    private C5571p9 f51806e;

    /* renamed from: f */
    @NotNull
    private final l10 f51807f;

    /* renamed from: g */
    @NotNull
    private final String f51808g;

    /* renamed from: com.yandex.mobile.ads.impl.k10$a */
    public static final class C5314a {
        @NotNull
        /* renamed from: a */
        public static Object m26012a() {
            return k10.f51800h;
        }
    }

    public k10(@NotNull Context context, @NotNull C5430m9 appMetricaBridge, @NotNull C5787t9 appMetricaIdentifiersValidator, @NotNull C5680r9 appMetricaIdentifiersLoader, @NotNull ca0 mauidManager) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(appMetricaBridge, "appMetricaBridge");
        Intrinsics.m32179h(appMetricaIdentifiersValidator, "appMetricaIdentifiersValidator");
        Intrinsics.m32179h(appMetricaIdentifiersLoader, "appMetricaIdentifiersLoader");
        Intrinsics.m32179h(mauidManager, "mauidManager");
        this.f51802a = appMetricaBridge;
        this.f51803b = appMetricaIdentifiersValidator;
        this.f51804c = appMetricaIdentifiersLoader;
        this.f51807f = l10.f52208a;
        this.f51808g = mauidManager.m23085a();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.m32178g(applicationContext, "context.applicationContext");
        this.f51805d = applicationContext;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.yandex.mobile.ads.impl.p9] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @NotNull
    /* renamed from: b */
    public final C5571p9 m26009b() {
        ?? r2;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (f51800h) {
            C5571p9 c5571p9 = this.f51806e;
            r2 = c5571p9;
            if (c5571p9 == null) {
                C5430m9 c5430m9 = this.f51802a;
                Context context = this.f51805d;
                Objects.requireNonNull(c5430m9);
                String m26591b = C5430m9.m26591b(context);
                C5430m9 c5430m92 = this.f51802a;
                Context context2 = this.f51805d;
                Objects.requireNonNull(c5430m92);
                C5571p9 c5571p92 = new C5571p9(null, C5430m9.m26588a(context2), m26591b);
                this.f51804c.m27872a(this.f51805d, this);
                r2 = c5571p92;
            }
            objectRef.f63351b = r2;
        }
        return r2;
    }

    @NotNull
    /* renamed from: c */
    public final l10 m26010c() {
        return this.f51807f;
    }

    @NotNull
    /* renamed from: d */
    public final String m26011d() {
        return this.f51808g;
    }

    /* renamed from: a */
    public final void m26008a(@NotNull C5571p9 appMetricaIdentifiers) {
        Intrinsics.m32179h(appMetricaIdentifiers, "appMetricaIdentifiers");
        synchronized (f51800h) {
            Objects.requireNonNull(this.f51803b);
            if (C5787t9.m28481a(appMetricaIdentifiers)) {
                this.f51806e = appMetricaIdentifiers;
            }
        }
    }

    public /* synthetic */ k10(Context context, C5430m9 c5430m9, C5787t9 c5787t9, C5680r9 c5680r9) {
        this(context, c5430m9, c5787t9, c5680r9, new ca0(r80.m27863a(context)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k10(@NotNull Context context) {
        this(context, new C5430m9(), new C5787t9(), new C5680r9(new C5430m9(), new C5626q9()));
        Intrinsics.m32179h(context, "context");
    }
}
