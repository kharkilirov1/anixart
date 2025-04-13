package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.BuildConfigFieldProvider;
import com.yandex.mobile.ads.common.MobileAds;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.fa */
/* loaded from: classes3.dex */
public final class C5069fa {

    /* renamed from: a */
    @NotNull
    private final i90 f50185a;

    /* renamed from: b */
    @NotNull
    private final C5989wt f50186b;

    /* renamed from: com.yandex.mobile.ads.impl.fa$a */
    public static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: b */
        public final /* synthetic */ Context f50188b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.f50188b = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C5069fa.this.m24377b(this.f50188b);
            return Unit.f63088a;
        }
    }

    public C5069fa(@NotNull g90 mainThreadHandler, @NotNull i90 manifestAnalyzer) {
        Intrinsics.m32179h(mainThreadHandler, "mainThreadHandler");
        Intrinsics.m32179h(manifestAnalyzer, "manifestAnalyzer");
        this.f50185a = manifestAnalyzer;
        this.f50186b = new C5989wt(mainThreadHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final void m24377b(Context context) {
        if (BuildConfigFieldProvider.isAutotest()) {
            return;
        }
        Objects.requireNonNull(this.f50185a);
        if (i90.m25465b(context)) {
            MobileAds.initialize(context, dn1.f49711v);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m24374a() {
        n60.m26809b("SDK initialized", new Object[0]);
    }

    /* renamed from: a */
    public final void m24378a(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        cz0 m29824a = xz0.m29823b().m29824a(context);
        if (m29824a != null && m29824a.m23614w()) {
            this.f50186b.m29565a(new a(context));
        } else {
            m24377b(context);
        }
    }
}
