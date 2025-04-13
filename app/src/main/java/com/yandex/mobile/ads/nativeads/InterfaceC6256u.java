package com.yandex.mobile.ads.nativeads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5600pp;
import com.yandex.mobile.ads.impl.C5689rh;
import com.yandex.mobile.ads.impl.zj0;
import com.yandex.mobile.ads.nativeads.template.NativeBannerView;
import com.yandex.mobile.ads.nativeads.video.InterfaceC6260b;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.nativeads.u */
/* loaded from: classes3.dex */
public interface InterfaceC6256u extends NativeAd, OpenLinksInAppProvider, CustomClickable, InterfaceC6260b {
    @NonNull
    /* renamed from: a */
    zj0 mo30560a();

    /* renamed from: a */
    void mo30561a(@NonNull NativeAdViewBinder nativeAdViewBinder, @NonNull C5689rh c5689rh) throws NativeAdException;

    /* renamed from: a */
    void mo30562a(@NonNull NativeBannerView nativeBannerView) throws NativeAdException;

    @Nullable
    /* renamed from: b */
    List<C5600pp> mo30563b();

    void destroy();
}
