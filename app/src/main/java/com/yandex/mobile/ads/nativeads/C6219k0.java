package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5101g2;
import com.yandex.mobile.ads.impl.C5689rh;
import com.yandex.mobile.ads.impl.c21;
import com.yandex.mobile.ads.impl.eh0;
import com.yandex.mobile.ads.impl.kh0;
import com.yandex.mobile.ads.impl.kk0;
import com.yandex.mobile.ads.impl.sv0;
import com.yandex.mobile.ads.impl.w10;
import com.yandex.mobile.ads.impl.yi0;
import com.yandex.mobile.ads.nativeads.template.NativeBannerView;
import com.yandex.mobile.ads.nativeads.video.C6259a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.yandex.mobile.ads.nativeads.k0 */
/* loaded from: classes3.dex */
public final class C6219k0 extends AbstractC6221l0 implements c21, InterfaceC6256u {

    /* renamed from: F */
    @NonNull
    private final w10 f57718F;

    /* renamed from: G */
    @NonNull
    private final C6217j0 f57719G;

    public C6219k0(@NonNull Context context, @NonNull C6217j0 c6217j0, @NonNull w10 w10Var, @NonNull C6198a c6198a) {
        super(context, c6198a);
        this.f57718F = w10Var;
        this.f57719G = c6217j0;
        kh0 m30491d = c6198a.m30491d();
        m30582a(m30574a(m30491d.m26128c().m27736d(), m30491d.m26126a()));
    }

    @NonNull
    /* renamed from: a */
    private sv0.InterfaceC5763a m30574a(@NonNull List<eh0> list, @NonNull C5101g2 c5101g2) {
        String m26139a = kk0.f51999d.m26139a();
        C6209f0 c6209f0 = new C6209f0(list, c5101g2);
        c6209f0.m30543a(1);
        c6209f0.m30545a(m26139a);
        c6209f0.m30544a(this.f57737l);
        return c6209f0;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void addImageLoadingListener(@NonNull NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.f57719G.addImageLoadingListener(nativeAdImageLoadingListener);
    }

    @Override // com.yandex.mobile.ads.impl.c21
    /* renamed from: b */
    public final void mo23012b(@NonNull NativeAdViewBinder nativeAdViewBinder, @NonNull C5689rh c5689rh) throws NativeAdException {
        m30580a(nativeAdViewBinder.getNativeAdView(), this.f57718F, new C6267z(nativeAdViewBinder), c5689rh);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void bindNativeAd(@NonNull NativeAdViewBinder nativeAdViewBinder) throws NativeAdException {
        this.f57719G.bindNativeAd(nativeAdViewBinder);
    }

    @Override // com.yandex.mobile.ads.nativeads.SliderAd
    public final void bindSliderAd(@NonNull NativeAdViewBinder nativeAdViewBinder) throws NativeAdException {
        m30581a((C6219k0) nativeAdViewBinder.getNativeAdView(), this.f57718F, (yi0<C6219k0>) new C6267z(nativeAdViewBinder), AbstractC6202c.f57676a);
    }

    @Override // com.yandex.mobile.ads.impl.c21
    @NonNull
    /* renamed from: c */
    public final ArrayList mo23013c() {
        return new ArrayList(this.f57719G.m30564d());
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    @NonNull
    public final NativeAdAssets getAdAssets() {
        return this.f57719G.getAdAssets();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    @NonNull
    public final NativeAdType getAdType() {
        return this.f57719G.getAdType();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    @Nullable
    public final String getInfo() {
        return this.f57719G.getInfo();
    }

    @Override // com.yandex.mobile.ads.nativeads.video.InterfaceC6260b, com.yandex.mobile.ads.nativeads.video.NativeAdVideoControllerProvider
    public final C6259a getNativeAdVideoController() {
        return this.f57748w;
    }

    @Override // com.yandex.mobile.ads.nativeads.SliderAd
    @NonNull
    public final List<NativeAd> getNativeAds() {
        return new ArrayList(this.f57719G.m30564d());
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void loadImages() {
        this.f57719G.loadImages();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void removeImageLoadingListener(@NonNull NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.f57719G.removeImageLoadingListener(nativeAdImageLoadingListener);
    }

    @Override // com.yandex.mobile.ads.nativeads.AbstractC6221l0, com.yandex.mobile.ads.nativeads.NativeAd
    public final void setNativeAdEventListener(@Nullable NativeAdEventListener nativeAdEventListener) {
        this.f57719G.setNativeAdEventListener(nativeAdEventListener);
    }

    @Override // com.yandex.mobile.ads.nativeads.InterfaceC6256u
    /* renamed from: a */
    public final void mo30561a(@NonNull NativeAdViewBinder nativeAdViewBinder, @NonNull C5689rh c5689rh) throws NativeAdException {
        this.f57719G.mo30561a(nativeAdViewBinder, c5689rh);
    }

    @Override // com.yandex.mobile.ads.nativeads.InterfaceC6256u
    /* renamed from: a */
    public final void mo30562a(@NonNull NativeBannerView nativeBannerView) throws NativeAdException {
        this.f57719G.mo30562a(nativeBannerView);
    }
}
