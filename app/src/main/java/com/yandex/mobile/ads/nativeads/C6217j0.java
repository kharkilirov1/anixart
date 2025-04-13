package com.yandex.mobile.ads.nativeads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5600pp;
import com.yandex.mobile.ads.impl.C5689rh;
import com.yandex.mobile.ads.impl.zj0;
import com.yandex.mobile.ads.nativeads.template.NativeBannerView;
import com.yandex.mobile.ads.nativeads.video.C6259a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.nativeads.j0 */
/* loaded from: classes3.dex */
public final class C6217j0 implements InterfaceC6256u {

    /* renamed from: a */
    @NonNull
    private final List<InterfaceC6256u> f57714a;

    /* renamed from: b */
    @Nullable
    private final InterfaceC6256u f57715b;

    public C6217j0(@NonNull ArrayList arrayList) {
        this.f57714a = arrayList;
        this.f57715b = arrayList.isEmpty() ? null : (InterfaceC6256u) arrayList.get(0);
    }

    @Override // com.yandex.mobile.ads.nativeads.InterfaceC6256u
    /* renamed from: a */
    public final void mo30562a(@NonNull NativeBannerView nativeBannerView) throws NativeAdException {
        InterfaceC6256u interfaceC6256u = this.f57715b;
        if (interfaceC6256u != null) {
            interfaceC6256u.mo30562a(nativeBannerView);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void addImageLoadingListener(@NonNull NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        InterfaceC6256u interfaceC6256u = this.f57715b;
        if (interfaceC6256u != null) {
            interfaceC6256u.addImageLoadingListener(nativeAdImageLoadingListener);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.InterfaceC6256u
    @Nullable
    /* renamed from: b */
    public final List<C5600pp> mo30563b() {
        InterfaceC6256u interfaceC6256u = this.f57715b;
        if (interfaceC6256u != null) {
            return interfaceC6256u.mo30563b();
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void bindNativeAd(@NonNull NativeAdViewBinder nativeAdViewBinder) throws NativeAdException {
        InterfaceC6256u interfaceC6256u = this.f57715b;
        if (interfaceC6256u != null) {
            interfaceC6256u.bindNativeAd(nativeAdViewBinder);
        }
    }

    @NonNull
    /* renamed from: d */
    public final List<InterfaceC6256u> m30564d() {
        return this.f57714a;
    }

    @Override // com.yandex.mobile.ads.nativeads.InterfaceC6256u
    public final void destroy() {
        InterfaceC6256u interfaceC6256u = this.f57715b;
        if (interfaceC6256u != null) {
            interfaceC6256u.destroy();
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    @NonNull
    public final NativeAdAssets getAdAssets() {
        InterfaceC6256u interfaceC6256u = this.f57715b;
        return interfaceC6256u != null ? interfaceC6256u.getAdAssets() : new C6208f();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    @NonNull
    public final NativeAdType getAdType() {
        InterfaceC6256u interfaceC6256u = this.f57715b;
        return interfaceC6256u != null ? interfaceC6256u.getAdType() : NativeAdType.CONTENT;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    @Nullable
    public final String getInfo() {
        InterfaceC6256u interfaceC6256u = this.f57715b;
        if (interfaceC6256u != null) {
            return interfaceC6256u.getInfo();
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.video.InterfaceC6260b, com.yandex.mobile.ads.nativeads.video.NativeAdVideoControllerProvider
    @Nullable
    public final C6259a getNativeAdVideoController() {
        InterfaceC6256u interfaceC6256u = this.f57715b;
        if (interfaceC6256u == null) {
            return null;
        }
        return interfaceC6256u.getNativeAdVideoController();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void loadImages() {
        InterfaceC6256u interfaceC6256u = this.f57715b;
        if (interfaceC6256u != null) {
            interfaceC6256u.loadImages();
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void removeImageLoadingListener(@NonNull NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        InterfaceC6256u interfaceC6256u = this.f57715b;
        if (interfaceC6256u != null) {
            interfaceC6256u.removeImageLoadingListener(nativeAdImageLoadingListener);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.CustomClickable
    public final void setCustomClickHandler(@Nullable CustomClickHandler customClickHandler) {
        InterfaceC6256u interfaceC6256u = this.f57715b;
        if (interfaceC6256u != null) {
            interfaceC6256u.setCustomClickHandler(customClickHandler);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void setNativeAdEventListener(@Nullable NativeAdEventListener nativeAdEventListener) {
        InterfaceC6256u interfaceC6256u = this.f57715b;
        if (interfaceC6256u != null) {
            interfaceC6256u.setNativeAdEventListener(nativeAdEventListener);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.OpenLinksInAppProvider
    public final void setShouldOpenLinksInApp(boolean z) {
        InterfaceC6256u interfaceC6256u = this.f57715b;
        if (interfaceC6256u != null) {
            interfaceC6256u.setShouldOpenLinksInApp(z);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.InterfaceC6256u
    /* renamed from: a */
    public final void mo30561a(@NonNull NativeAdViewBinder nativeAdViewBinder, @NonNull C5689rh c5689rh) throws NativeAdException {
        InterfaceC6256u interfaceC6256u = this.f57715b;
        if (interfaceC6256u != null) {
            interfaceC6256u.mo30561a(nativeAdViewBinder, c5689rh);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.InterfaceC6256u
    @NonNull
    /* renamed from: a */
    public final zj0 mo30560a() {
        InterfaceC6256u interfaceC6256u = this.f57715b;
        return interfaceC6256u != null ? interfaceC6256u.mo30560a() : new zj0(null, null);
    }
}
