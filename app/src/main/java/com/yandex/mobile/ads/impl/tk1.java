package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class tk1 implements uk1<sk1> {

    /* renamed from: a */
    @NotNull
    private final Context f55134a;

    /* renamed from: b */
    @NotNull
    private final C5101g2 f55135b;

    /* renamed from: c */
    @Nullable
    private sk1 f55136c;

    public tk1(@NotNull Context context, @NotNull C5101g2 adConfiguration) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        this.f55134a = context;
        this.f55135b = adConfiguration;
    }

    @Override // com.yandex.mobile.ads.impl.uk1
    /* renamed from: a */
    public final void mo25233a(@NotNull AdResponse<String> adResponse, @NotNull SizeInfo sizeInfo, @NotNull String htmlResponse, @NotNull wk1<sk1> creationListener) throws mi1 {
        Intrinsics.m32179h(adResponse, "adResponse");
        Intrinsics.m32179h(sizeInfo, "sizeInfo");
        Intrinsics.m32179h(htmlResponse, "htmlResponse");
        Intrinsics.m32179h(creationListener, "creationListener");
        sk1 sk1Var = new sk1(this.f55134a, this.f55135b, adResponse, htmlResponse);
        this.f55136c = sk1Var;
        sk1Var.m28291a(new C5807a(this, sk1Var, creationListener));
        sk1Var.m28295g();
    }

    /* renamed from: com.yandex.mobile.ads.impl.tk1$a */
    public final class C5807a implements InterfaceC5693rk {

        /* renamed from: a */
        @NotNull
        private final sk1 f55137a;

        /* renamed from: b */
        @NotNull
        private final wk1<sk1> f55138b;

        /* renamed from: c */
        public final /* synthetic */ tk1 f55139c;

        public C5807a(tk1 tk1Var, @NotNull sk1 fullscreenHtmlAd, @NotNull wk1<sk1> creationListener) {
            Intrinsics.m32179h(fullscreenHtmlAd, "fullscreenHtmlAd");
            Intrinsics.m32179h(creationListener, "creationListener");
            this.f55139c = tk1Var;
            this.f55137a = fullscreenHtmlAd;
            this.f55138b = creationListener;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5693rk
        /* renamed from: a */
        public final void mo27937a() {
            tk1.m28671a(this.f55139c);
            this.f55138b.mo24189a((wk1<sk1>) this.f55137a);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5693rk
        /* renamed from: a */
        public final void mo27938a(@NotNull C5563p2 adFetchRequestError) {
            Intrinsics.m32179h(adFetchRequestError, "adFetchRequestError");
            tk1.m28671a(this.f55139c);
            this.f55138b.mo24188a(adFetchRequestError);
        }
    }

    @Override // com.yandex.mobile.ads.impl.uk1
    /* renamed from: a */
    public final void mo25232a() {
        sk1 sk1Var = this.f55136c;
        if (sk1Var != null) {
            sk1Var.m28292d();
        }
        sk1 sk1Var2 = this.f55136c;
        if (sk1Var2 != null) {
            sk1Var2.m28291a((InterfaceC5693rk) null);
        }
        this.f55136c = null;
    }

    /* renamed from: a */
    public static final void m28671a(tk1 tk1Var) {
        sk1 sk1Var = tk1Var.f55136c;
        if (sk1Var != null) {
            sk1Var.m28291a((InterfaceC5693rk) null);
        }
        tk1Var.f55136c = null;
    }
}
