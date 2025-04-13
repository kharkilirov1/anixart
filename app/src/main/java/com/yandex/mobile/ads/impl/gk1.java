package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.webkit.WebView;
import com.yandex.mobile.ads.banner.AbstractC4639g;
import com.yandex.mobile.ads.banner.C4635c;
import com.yandex.mobile.ads.banner.C4637e;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class gk1 {

    /* renamed from: a */
    @NotNull
    private final Context f50636a;

    /* renamed from: b */
    @NotNull
    private final C5101g2 f50637b;

    /* renamed from: c */
    @NotNull
    private final AdResponse<String> f50638c;

    /* renamed from: d */
    @NotNull
    private final AbstractC4639g f50639d;

    /* renamed from: e */
    @NotNull
    private final InterfaceC5176hd f50640e;

    /* renamed from: f */
    @NotNull
    private final C5967wc f50641f;

    /* renamed from: g */
    @NotNull
    private final lf0 f50642g;

    /* renamed from: h */
    @NotNull
    private final C5516nz f50643h;

    /* renamed from: i */
    @NotNull
    private final C5393ld f50644i;

    /* renamed from: j */
    @NotNull
    private final C5855uc f50645j;

    /* renamed from: k */
    @Nullable
    private C5133a f50646k;

    /* renamed from: com.yandex.mobile.ads.impl.gk1$a */
    public static final class C5133a {

        /* renamed from: a */
        @NotNull
        private final C4635c f50647a;

        /* renamed from: b */
        @NotNull
        private final InterfaceC5418lz f50648b;

        /* renamed from: c */
        @NotNull
        private final C5134b f50649c;

        public C5133a(@NotNull C4635c contentController, @NotNull InterfaceC5418lz htmlWebViewAdapter, @NotNull C5134b webViewListener) {
            Intrinsics.m32179h(contentController, "contentController");
            Intrinsics.m32179h(htmlWebViewAdapter, "htmlWebViewAdapter");
            Intrinsics.m32179h(webViewListener, "webViewListener");
            this.f50647a = contentController;
            this.f50648b = htmlWebViewAdapter;
            this.f50649c = webViewListener;
        }

        @NotNull
        /* renamed from: a */
        public final C4635c m24914a() {
            return this.f50647a;
        }

        @NotNull
        /* renamed from: b */
        public final InterfaceC5418lz m24915b() {
            return this.f50648b;
        }

        @NotNull
        /* renamed from: c */
        public final C5134b m24916c() {
            return this.f50649c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gk1$b */
    public static final class C5134b implements InterfaceC5719rz {

        /* renamed from: a */
        @NotNull
        private final Context f50650a;

        /* renamed from: b */
        @NotNull
        private final C5101g2 f50651b;

        /* renamed from: c */
        @NotNull
        private final AdResponse<String> f50652c;

        /* renamed from: d */
        @NotNull
        private final gk1 f50653d;

        /* renamed from: e */
        @NotNull
        private final C4635c f50654e;

        /* renamed from: f */
        @NotNull
        private wk1<gk1> f50655f;

        /* renamed from: g */
        @NotNull
        private final C5205hz f50656g;

        /* renamed from: h */
        @Nullable
        private WebView f50657h;

        /* renamed from: i */
        @Nullable
        private Map<String, String> f50658i;

        public C5134b(@NotNull Context context, @NotNull C5101g2 adConfiguration, @NotNull AdResponse<String> adResponse, @NotNull gk1 bannerHtmlAd, @NotNull C4635c contentController, @NotNull wk1<gk1> creationListener, @NotNull C5205hz htmlClickHandler) {
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(adConfiguration, "adConfiguration");
            Intrinsics.m32179h(adResponse, "adResponse");
            Intrinsics.m32179h(bannerHtmlAd, "bannerHtmlAd");
            Intrinsics.m32179h(contentController, "contentController");
            Intrinsics.m32179h(creationListener, "creationListener");
            Intrinsics.m32179h(htmlClickHandler, "htmlClickHandler");
            this.f50650a = context;
            this.f50651b = adConfiguration;
            this.f50652c = adResponse;
            this.f50653d = bannerHtmlAd;
            this.f50654e = contentController;
            this.f50655f = creationListener;
            this.f50656g = htmlClickHandler;
        }

        @Nullable
        /* renamed from: a */
        public final Map<String, String> m24917a() {
            return this.f50658i;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5719rz
        /* renamed from: a */
        public final void mo23257a(boolean z) {
        }

        @Nullable
        /* renamed from: b */
        public final WebView m24918b() {
            return this.f50657h;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5719rz
        /* renamed from: a */
        public final void mo23255a(@NotNull yo0 webView, @Nullable Map map) {
            Intrinsics.m32179h(webView, "webView");
            this.f50657h = webView;
            this.f50658i = map;
            this.f50655f.mo24189a((wk1<gk1>) this.f50653d);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5719rz
        /* renamed from: a */
        public final void mo23253a(@NotNull C5563p2 adFetchRequestError) {
            Intrinsics.m32179h(adFetchRequestError, "adFetchRequestError");
            this.f50655f.mo24188a(adFetchRequestError);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5719rz
        /* renamed from: a */
        public final void mo23256a(@NotNull String clickUrl) {
            Intrinsics.m32179h(clickUrl, "clickUrl");
            this.f50656g.m25400a(clickUrl, this.f50652c, new C6099z0(this.f50650a, this.f50651b.m24796r(), this.f50654e.m30346h()));
        }

        public /* synthetic */ C5134b(Context context, C5101g2 c5101g2, AdResponse adResponse, gk1 gk1Var, C4635c c4635c, wk1 wk1Var) {
            this(context, c5101g2, adResponse, gk1Var, c4635c, wk1Var, new C5205hz(context, c5101g2));
        }
    }

    public gk1(@NotNull Context context, @NotNull C5101g2 adConfiguration, @NotNull AdResponse adResponse, @NotNull AbstractC4639g adView, @NotNull C4637e bannerShowEventListener, @NotNull C5967wc sizeValidator, @NotNull lf0 mraidCompatibilityDetector, @NotNull C5516nz htmlWebViewAdapterFactoryProvider, @NotNull C5393ld bannerWebViewFactory, @NotNull C5855uc bannerAdContentControllerFactory) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        Intrinsics.m32179h(adResponse, "adResponse");
        Intrinsics.m32179h(adView, "adView");
        Intrinsics.m32179h(bannerShowEventListener, "bannerShowEventListener");
        Intrinsics.m32179h(sizeValidator, "sizeValidator");
        Intrinsics.m32179h(mraidCompatibilityDetector, "mraidCompatibilityDetector");
        Intrinsics.m32179h(htmlWebViewAdapterFactoryProvider, "htmlWebViewAdapterFactoryProvider");
        Intrinsics.m32179h(bannerWebViewFactory, "bannerWebViewFactory");
        Intrinsics.m32179h(bannerAdContentControllerFactory, "bannerAdContentControllerFactory");
        this.f50636a = context;
        this.f50637b = adConfiguration;
        this.f50638c = adResponse;
        this.f50639d = adView;
        this.f50640e = bannerShowEventListener;
        this.f50641f = sizeValidator;
        this.f50642g = mraidCompatibilityDetector;
        this.f50643h = htmlWebViewAdapterFactoryProvider;
        this.f50644i = bannerWebViewFactory;
        this.f50645j = bannerAdContentControllerFactory;
    }

    /* renamed from: a */
    public final void m24912a(@NotNull SizeInfo configurationSizeInfo, @NotNull String htmlResponse, @NotNull ke1 videoEventController, @NotNull wk1<gk1> creationListener) throws mi1 {
        Intrinsics.m32179h(configurationSizeInfo, "configurationSizeInfo");
        Intrinsics.m32179h(htmlResponse, "htmlResponse");
        Intrinsics.m32179h(videoEventController, "videoEventController");
        Intrinsics.m32179h(creationListener, "creationListener");
        C5333kd m26431a = this.f50644i.m26431a(this.f50638c, configurationSizeInfo);
        Objects.requireNonNull(this.f50642g);
        boolean m26444a = lf0.m26444a(htmlResponse);
        C5855uc c5855uc = this.f50645j;
        Context context = this.f50636a;
        AdResponse<String> adResponse = this.f50638c;
        C5101g2 c5101g2 = this.f50637b;
        AbstractC4639g abstractC4639g = this.f50639d;
        InterfaceC5176hd interfaceC5176hd = this.f50640e;
        Objects.requireNonNull(c5855uc);
        C4635c m28980a = C5855uc.m28980a(context, adResponse, c5101g2, abstractC4639g, interfaceC5176hd);
        l20 m24328i = m28980a.m24328i();
        Intrinsics.m32178g(m24328i, "contentController.impressionEventsObservable");
        C5134b c5134b = new C5134b(this.f50636a, this.f50637b, this.f50638c, this, m28980a, creationListener);
        Objects.requireNonNull(this.f50643h);
        InterfaceC5418lz mo22468a = C5516nz.m26964a(m26444a).mo22468a(m26431a, c5134b, videoEventController, m24328i);
        Intrinsics.m32178g(mo22468a, "htmlWebViewAdapterFactor…roller, eventsObservable)");
        this.f50646k = new C5133a(m28980a, mo22468a, c5134b);
        mo22468a.mo26546a(htmlResponse);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ gk1(android.content.Context r12, com.yandex.mobile.ads.impl.C5101g2 r13, com.yandex.mobile.ads.base.AdResponse r14, com.yandex.mobile.ads.banner.AbstractC4639g r15, com.yandex.mobile.ads.banner.C4637e r16) {
        /*
            r11 = this;
            com.yandex.mobile.ads.impl.wc r6 = new com.yandex.mobile.ads.impl.wc
            r6.<init>()
            com.yandex.mobile.ads.impl.lf0 r7 = new com.yandex.mobile.ads.impl.lf0
            r7.<init>()
            com.yandex.mobile.ads.impl.nz r8 = com.yandex.mobile.ads.impl.C5516nz.m26965a()
            java.lang.String r0 = "getInstance()"
            kotlin.jvm.internal.Intrinsics.m32178g(r8, r0)
            com.yandex.mobile.ads.impl.ld r9 = new com.yandex.mobile.ads.impl.ld
            r1 = r12
            r2 = r13
            r9.<init>(r12, r13)
            com.yandex.mobile.ads.impl.uc r10 = new com.yandex.mobile.ads.impl.uc
            r10.<init>()
            r0 = r11
            r3 = r14
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gk1.<init>(android.content.Context, com.yandex.mobile.ads.impl.g2, com.yandex.mobile.ads.base.AdResponse, com.yandex.mobile.ads.banner.g, com.yandex.mobile.ads.banner.e):void");
    }

    /* renamed from: a */
    public final void m24913a(@NotNull dk1 showEventListener) {
        Intrinsics.m32179h(showEventListener, "showEventListener");
        C5133a c5133a = this.f50646k;
        if (c5133a == null) {
            C5563p2 INVALID_SDK_STATE = AbstractC5524o4.f53159k;
            Intrinsics.m32178g(INVALID_SDK_STATE, "INVALID_SDK_STATE");
            showEventListener.m23901a(INVALID_SDK_STATE);
            return;
        }
        C4635c m24914a = c5133a.m24914a();
        WebView m24918b = c5133a.m24916c().m24918b();
        Map<String, String> m24917a = c5133a.m24916c().m24917a();
        if (m24918b instanceof C5333kd) {
            C5333kd c5333kd = (C5333kd) m24918b;
            SizeInfo m26110k = c5333kd.m26110k();
            SizeInfo m24792n = this.f50637b.m24792n();
            if ((m26110k == null || m24792n == null) ? false : r11.m27822a(this.f50636a, this.f50638c, m26110k, this.f50641f, m24792n)) {
                this.f50639d.setVisibility(0);
                hg1.m25194a(this.f50639d, m24918b, this.f50636a, c5333kd.m26110k(), new ik1(this.f50636a, this.f50639d, this.f50637b, m24914a));
                m24914a.m24325a(m24917a);
                showEventListener.m23900a();
                return;
            }
        }
        C5563p2 BANNER_RESPONSE_INVALID_SIZE = AbstractC5524o4.f53157i;
        Intrinsics.m32178g(BANNER_RESPONSE_INVALID_SIZE, "BANNER_RESPONSE_INVALID_SIZE");
        showEventListener.m23901a(BANNER_RESPONSE_INVALID_SIZE);
    }

    /* renamed from: a */
    public final void m24911a() {
        C5133a c5133a = this.f50646k;
        if (c5133a != null) {
            c5133a.m24915b().invalidate();
            c5133a.m24914a().m21755m();
        }
        this.f50646k = null;
    }
}
