package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.div2.DivData;
import com.yandex.mobile.ads.nativeads.InterfaceC6256u;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ad */
/* loaded from: classes3.dex */
public final class C4806ad {

    /* renamed from: a */
    @NotNull
    private final C5933vp f48485a;

    /* renamed from: b */
    @NotNull
    private final C6086yp f48486b;

    /* renamed from: c */
    @NotNull
    private final C5195hp f48487c;

    public C4806ad(@NotNull C5933vp divKitDesignProvider, @NotNull C6086yp divKitIntegrationValidator, @NotNull C5195hp divDataCreator) {
        Intrinsics.m32179h(divKitDesignProvider, "divKitDesignProvider");
        Intrinsics.m32179h(divKitIntegrationValidator, "divKitIntegrationValidator");
        Intrinsics.m32179h(divDataCreator, "divDataCreator");
        this.f48485a = divKitDesignProvider;
        this.f48486b = divKitIntegrationValidator;
        this.f48487c = divDataCreator;
    }

    @Nullable
    /* renamed from: a */
    public final C6116zc m22464a(@NotNull Context context, @NotNull InterfaceC6256u nativeAdPrivate) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(nativeAdPrivate, "nativeAdPrivate");
        Objects.requireNonNull(this.f48486b);
        if (!C6086yp.m29956a(context)) {
            return null;
        }
        Objects.requireNonNull(this.f48485a);
        C5600pp m29248a = C5933vp.m29248a(nativeAdPrivate);
        if (m29248a == null) {
            return null;
        }
        Objects.requireNonNull(this.f48487c);
        DivData m25353a = C5195hp.m25353a(m29248a);
        if (m25353a != null) {
            return new C6116zc(m25353a);
        }
        return null;
    }

    public /* synthetic */ C4806ad() {
        this(new C5933vp(), new C6086yp(), new C5195hp());
    }
}
