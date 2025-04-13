package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.banner.AbstractC4639g;
import com.yandex.mobile.ads.banner.C4637e;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.impl.ik0;
import com.yandex.mobile.ads.nativeads.InterfaceC6256u;
import com.yandex.mobile.ads.nativeads.NativeAd;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class el1 implements InterfaceC6021xc {

    /* renamed from: a */
    @NotNull
    private final C4637e f49993a;

    /* renamed from: b */
    @NotNull
    private final ik0 f49994b;

    /* renamed from: c */
    @NotNull
    private final C5118gd f49995c;

    /* renamed from: d */
    @NotNull
    private final aj0 f49996d;

    /* renamed from: e */
    @NotNull
    private final ck1 f49997e;

    /* renamed from: f */
    @NotNull
    private final dj0 f49998f;

    /* renamed from: g */
    @NotNull
    private final Handler f49999g;

    /* renamed from: h */
    @NotNull
    private final xz0 f50000h;

    /* renamed from: i */
    @NotNull
    private final m60 f50001i;

    /* renamed from: j */
    @NotNull
    private final C5967wc f50002j;

    /* renamed from: k */
    @NotNull
    private final ViewTreeObserver.OnPreDrawListener f50003k;

    /* renamed from: l */
    @Nullable
    private AdResponse<String> f50004l;

    /* renamed from: m */
    @Nullable
    private NativeAd f50005m;

    /* renamed from: n */
    private boolean f50006n;

    /* renamed from: o */
    @Nullable
    private C5073fd f50007o;

    public el1(@NotNull C4637e loadController, @NotNull ik0 nativeResponseCreator, @NotNull C5118gd contentControllerCreator, @NotNull aj0 requestParameterManager, @NotNull ck1 yandexAdapterReporter, @NotNull dj0 adEventListener, @NotNull Handler handler, @NotNull xz0 sdkSettings, @NotNull m60 sizeInfoController, @NotNull C5967wc sizeValidator) {
        Intrinsics.m32179h(loadController, "loadController");
        Intrinsics.m32179h(nativeResponseCreator, "nativeResponseCreator");
        Intrinsics.m32179h(contentControllerCreator, "contentControllerCreator");
        Intrinsics.m32179h(requestParameterManager, "requestParameterManager");
        Intrinsics.m32179h(yandexAdapterReporter, "yandexAdapterReporter");
        Intrinsics.m32179h(adEventListener, "adEventListener");
        Intrinsics.m32179h(handler, "handler");
        Intrinsics.m32179h(sdkSettings, "sdkSettings");
        Intrinsics.m32179h(sizeInfoController, "sizeInfoController");
        Intrinsics.m32179h(sizeValidator, "sizeValidator");
        this.f49993a = loadController;
        this.f49994b = nativeResponseCreator;
        this.f49995c = contentControllerCreator;
        this.f49996d = requestParameterManager;
        this.f49997e = yandexAdapterReporter;
        this.f49998f = adEventListener;
        this.f49999g = handler;
        this.f50000h = sdkSettings;
        this.f50001i = sizeInfoController;
        this.f50002j = sizeValidator;
        this.f50003k = new ViewTreeObserver.OnPreDrawListener() { // from class: com.yandex.mobile.ads.impl.eo1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean m24198g;
                m24198g = el1.m24198g(el1.this);
                return m24198g;
            }
        };
    }

    /* renamed from: f */
    public static final void m24197f(el1 el1Var) {
        el1Var.f50004l = null;
        el1Var.f50005m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final boolean m24198g(el1 this$0) {
        Intrinsics.m32179h(this$0, "this$0");
        m60 m60Var = this$0.f50001i;
        C5101g2 m28616d = this$0.f49993a.m28616d();
        Intrinsics.m32178g(m28616d, "loadController.adConfiguration");
        m60Var.m26582a(m28616d, this$0.f49993a.m21783y());
        this$0.f49999g.postDelayed(new fo1(this$0, 0), 50L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m24199h(el1 this$0) {
        Intrinsics.m32179h(this$0, "this$0");
        hg1.m25195a(this$0.f49993a.m21783y(), false);
    }

    /* renamed from: com.yandex.mobile.ads.impl.el1$b */
    public final class C5034b implements ik0.InterfaceC5236b {
        public C5034b() {
        }

        @Override // com.yandex.mobile.ads.impl.ik0.InterfaceC5236b
        /* renamed from: a */
        public final void mo24208a(@NotNull NativeAd createdNativeAd) {
            Intrinsics.m32179h(createdNativeAd, "createdNativeAd");
            if (el1.this.f50006n) {
                return;
            }
            el1.this.f50005m = createdNativeAd;
            el1.this.f49999g.post(new fo1(el1.this, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static final void m24205a(el1 this$0) {
            Intrinsics.m32179h(this$0, "this$0");
            this$0.f49993a.mo21780p();
            this$0.m24202a();
        }

        @Override // com.yandex.mobile.ads.impl.ik0.InterfaceC5236b
        /* renamed from: a */
        public final void mo24207a(@NotNull C5563p2 adRequestError) {
            Intrinsics.m32179h(adRequestError, "adRequestError");
            if (el1.this.f50006n) {
                return;
            }
            el1.m24197f(el1.this);
            el1.this.f49993a.mo21797b(adRequestError);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6021xc
    /* renamed from: a */
    public final void mo24185a(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        C5073fd c5073fd = this.f50007o;
        if (c5073fd != null) {
            c5073fd.m24546a();
        }
        this.f49994b.m25555a();
        this.f50004l = null;
        this.f50005m = null;
        this.f50006n = true;
    }

    /* renamed from: com.yandex.mobile.ads.impl.el1$a */
    public final class C5033a implements zw0 {

        /* renamed from: a */
        @NotNull
        private final Context f50008a;

        /* renamed from: b */
        @NotNull
        private final AdResponse<?> f50009b;

        /* renamed from: c */
        public final /* synthetic */ el1 f50010c;

        public C5033a(el1 el1Var, @NotNull Context context, @NotNull AdResponse<?> adResponse) {
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(adResponse, "adResponse");
            this.f50010c = el1Var;
            this.f50008a = context;
            this.f50009b = adResponse;
        }

        @Override // com.yandex.mobile.ads.impl.zw0
        /* renamed from: a */
        public final void mo24203a() {
            C5563p2 adRequestError = AbstractC5524o4.f53152d;
            Intrinsics.m32179h(adRequestError, "adRequestError");
            this.f50010c.f49997e.m23304a(this.f50008a, this.f50009b, this.f50010c.f49996d);
            this.f50010c.f49997e.m23305a(this.f50008a, this.f50009b, (bj0) null);
        }

        @Override // com.yandex.mobile.ads.impl.zw0
        /* renamed from: a */
        public final void mo24204a(@NotNull qi0 nativeAdResponse) {
            Intrinsics.m32179h(nativeAdResponse, "nativeAdResponse");
            bj0 bj0Var = new bj0(nativeAdResponse);
            this.f50010c.f49997e.m23304a(this.f50008a, this.f50009b, this.f50010c.f49996d);
            this.f50010c.f49997e.m23305a(this.f50008a, this.f50009b, bj0Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6021xc
    /* renamed from: a */
    public final void mo24186a(@NotNull Context context, @NotNull AdResponse<String> response) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(response, "response");
        cz0 m29824a = this.f50000h.m29824a(context);
        if (!(m29824a != null ? m29824a.m23579R() : false)) {
            this.f49993a.mo21797b(AbstractC5524o4.f53149a);
            return;
        }
        if (this.f50006n) {
            return;
        }
        SizeInfo m28622j = this.f49993a.m28622j();
        SizeInfo m21805F = response.m21805F();
        Intrinsics.m32178g(m21805F, "response.sizeInfo");
        this.f50004l = response;
        if (m28622j != null && r11.m27822a(context, response, m21805F, this.f50002j, m28622j)) {
            this.f49994b.m25556a(response, new C5034b(), new C5033a(this, context, response));
            return;
        }
        C5563p2 m26995a = AbstractC5524o4.m26995a(m28622j != null ? m28622j.m21916c(context) : 0, m28622j != null ? m28622j.m21913a(context) : 0, m21805F.m21919e(), m21805F.m21915c(), tg1.m28658c(context), tg1.m28656b(context));
        String m27145b = m26995a.m27145b();
        Intrinsics.m32178g(m27145b, "error.description");
        e60.m24034a(m27145b, new Object[0]);
        this.f49993a.mo21797b(m26995a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ el1(com.yandex.mobile.ads.banner.C4637e r12) {
        /*
            r11 = this;
            com.yandex.mobile.ads.impl.ik0 r2 = new com.yandex.mobile.ads.impl.ik0
            android.content.Context r0 = r12.m28621i()
            com.yandex.mobile.ads.impl.g2 r1 = r12.m28616d()
            com.yandex.mobile.ads.impl.s3 r3 = r12.m28617e()
            r2.<init>(r0, r1, r3)
            com.yandex.mobile.ads.impl.gd r3 = new com.yandex.mobile.ads.impl.gd
            r3.<init>()
            com.yandex.mobile.ads.impl.aj0 r4 = new com.yandex.mobile.ads.impl.aj0
            com.yandex.mobile.ads.impl.g2 r0 = r12.m28616d()
            r4.<init>(r0)
            com.yandex.mobile.ads.impl.ck1 r5 = new com.yandex.mobile.ads.impl.ck1
            com.yandex.mobile.ads.impl.g2 r0 = r12.m28616d()
            r5.<init>(r0)
            com.yandex.mobile.ads.impl.dj0 r6 = new com.yandex.mobile.ads.impl.dj0
            r6.<init>(r12)
            android.os.Handler r7 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r7.<init>(r0)
            com.yandex.mobile.ads.impl.xz0 r8 = com.yandex.mobile.ads.impl.xz0.m29823b()
            java.lang.String r0 = "getInstance()"
            kotlin.jvm.internal.Intrinsics.m32178g(r8, r0)
            com.yandex.mobile.ads.impl.m60 r9 = new com.yandex.mobile.ads.impl.m60
            android.content.Context r0 = r12.m28621i()
            java.lang.String r1 = "loadController.context"
            kotlin.jvm.internal.Intrinsics.m32178g(r0, r1)
            r9.<init>(r0)
            com.yandex.mobile.ads.impl.wc r10 = new com.yandex.mobile.ads.impl.wc
            r10.<init>()
            r0 = r11
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.el1.<init>(com.yandex.mobile.ads.banner.e):void");
    }

    /* renamed from: a */
    public final void m24202a() {
        NativeAd nativeAd;
        if (this.f50006n) {
            return;
        }
        AdResponse<String> adResponse = this.f50004l;
        AbstractC4639g m21783y = this.f49993a.m21783y();
        Intrinsics.m32178g(m21783y, "loadController.adView");
        if (adResponse == null || (nativeAd = this.f50005m) == null) {
            return;
        }
        C5118gd c5118gd = this.f49995c;
        Context m28621i = this.f49993a.m28621i();
        Intrinsics.m32178g(m28621i, "loadController.context");
        C5073fd m24842a = c5118gd.m24842a(m28621i, adResponse, (InterfaceC6256u) nativeAd, m21783y, this.f49998f, this.f50003k);
        this.f50007o = m24842a;
        m24842a.m24547b();
    }
}
