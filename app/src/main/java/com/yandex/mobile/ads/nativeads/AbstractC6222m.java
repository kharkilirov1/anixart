package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5101g2;
import com.yandex.mobile.ads.impl.C5689rh;
import com.yandex.mobile.ads.impl.C5782t5;
import com.yandex.mobile.ads.impl.cx0;
import com.yandex.mobile.ads.impl.eh0;
import com.yandex.mobile.ads.impl.kh0;
import com.yandex.mobile.ads.impl.nk0;
import com.yandex.mobile.ads.impl.r71;
import com.yandex.mobile.ads.impl.w10;
import com.yandex.mobile.ads.impl.yi0;
import com.yandex.mobile.ads.nativeads.template.C6252c;
import com.yandex.mobile.ads.nativeads.template.NativeBannerView;
import com.yandex.mobile.ads.nativeads.video.C6259a;
import java.util.Collections;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.nativeads.m */
/* loaded from: classes3.dex */
public abstract class AbstractC6222m extends AbstractC6221l0 implements InterfaceC6256u {

    /* renamed from: F */
    @NonNull
    private final C6232r f57754F;

    /* renamed from: G */
    @NonNull
    private final AbstractC6202c f57755G;

    /* renamed from: H */
    @NonNull
    private final r71 f57756H;

    /* renamed from: I */
    @NonNull
    private final C6209f0 f57757I;

    /* renamed from: J */
    @NonNull
    private final nk0 f57758J;

    /* renamed from: K */
    @NonNull
    public w10 f57759K;

    public AbstractC6222m(@NonNull Context context, @NonNull eh0 eh0Var, @NonNull C6232r c6232r, @NonNull w10 w10Var, @NonNull C6198a c6198a) {
        super(context, c6198a);
        this.f57754F = c6232r;
        this.f57759K = w10Var;
        kh0 m30491d = c6198a.m30491d();
        this.f57755G = AbstractC6202c.m30536a(m30491d.m26128c().m27740g());
        C6209f0 m30588a = m30588a(eh0Var, m30491d.m26126a());
        this.f57757I = m30588a;
        m30582a(m30588a);
        this.f57756H = new r71();
        this.f57758J = new nk0();
    }

    @NonNull
    /* renamed from: a */
    private C6209f0 m30588a(@NonNull eh0 eh0Var, @NonNull C5101g2 c5101g2) {
        C6209f0 c6209f0 = new C6209f0(Collections.singletonList(eh0Var), c5101g2);
        int m24174g = eh0Var.m24174g();
        if (m24174g != 0) {
            c6209f0.m30545a(cx0.m23548a(m24174g));
        }
        c6209f0.m30544a(this.f57737l);
        return c6209f0;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void addImageLoadingListener(@NonNull NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.f57754F.m30629a(nativeAdImageLoadingListener);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void bindNativeAd(@NonNull NativeAdViewBinder nativeAdViewBinder) throws NativeAdException {
        View nativeAdView = nativeAdViewBinder.getNativeAdView();
        this.f57756H.m27859a(nativeAdView, new C6220l(this));
        C6267z c6267z = new C6267z(nativeAdViewBinder);
        AbstractC6202c abstractC6202c = AbstractC6202c.f57676a;
        this.f57757I.m30543a(1);
        m30581a((AbstractC6222m) nativeAdView, this.f57759K, (yi0<AbstractC6222m>) c6267z, abstractC6202c);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    @NonNull
    public final NativeAdAssets getAdAssets() {
        return this.f57754F.m30628a();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    @NonNull
    public final NativeAdType getAdType() {
        int m28463a;
        int m30630b = this.f57754F.m30630b();
        Objects.requireNonNull(this.f57758J);
        NativeAdType nativeAdType = NativeAdType.CONTENT;
        return (m30630b == 0 || (m28463a = C5782t5.m28463a(m30630b)) == 0) ? nativeAdType : m28463a != 1 ? m28463a != 2 ? nativeAdType : NativeAdType.MEDIA : NativeAdType.APP_INSTALL;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    @Nullable
    public final String getInfo() {
        return this.f57754F.m30632c();
    }

    @Override // com.yandex.mobile.ads.nativeads.video.InterfaceC6260b, com.yandex.mobile.ads.nativeads.video.NativeAdVideoControllerProvider
    public final C6259a getNativeAdVideoController() {
        return this.f57748w;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void loadImages() {
        this.f57754F.m30633d();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void removeImageLoadingListener(@NonNull NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.f57754F.m30631b(nativeAdImageLoadingListener);
    }

    @Override // com.yandex.mobile.ads.nativeads.AbstractC6221l0, com.yandex.mobile.ads.nativeads.OpenLinksInAppProvider
    public final void setShouldOpenLinksInApp(boolean z) {
        super.setShouldOpenLinksInApp(z);
    }

    @Override // com.yandex.mobile.ads.nativeads.InterfaceC6256u
    /* renamed from: a */
    public final void mo30562a(@NonNull NativeBannerView nativeBannerView) throws NativeAdException {
        C6252c c6252c = new C6252c();
        nativeBannerView.m30592a((NativeBannerView) this);
        AbstractC6202c abstractC6202c = this.f57755G;
        this.f57757I.m30543a(2);
        m30581a((AbstractC6222m) nativeBannerView, this.f57759K, (yi0<AbstractC6222m>) c6252c, abstractC6202c);
    }

    @Override // com.yandex.mobile.ads.nativeads.InterfaceC6256u
    /* renamed from: a */
    public final void mo30561a(@NonNull NativeAdViewBinder nativeAdViewBinder, @NonNull C5689rh c5689rh) throws NativeAdException {
        View nativeAdView = nativeAdViewBinder.getNativeAdView();
        this.f57756H.m27859a(nativeAdView, new C6220l(this));
        m30580a(nativeAdView, this.f57759K, new C6267z(nativeAdViewBinder), c5689rh);
    }

    @Override // com.yandex.mobile.ads.nativeads.AbstractC6221l0
    /* renamed from: a */
    public final void mo30579a(@NonNull Context context) {
        this.f57756H.m27858a(context);
        super.mo30579a(context);
    }
}
