package com.yandex.mobile.ads.nativeads.video;

import com.yandex.mobile.ads.impl.nj0;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0004\u001a\u00020\u0002H\u0014¨\u0006\t"}, m31884d2 = {"Lcom/yandex/mobile/ads/nativeads/video/a;", "Lcom/yandex/mobile/ads/nativeads/video/NativeAdVideoController;", "", "pauseAd", "resumeAd", "Lcom/yandex/mobile/ads/impl/nj0;", "nativeForcePauseObserver", "<init>", "(Lcom/yandex/mobile/ads/impl/nj0;)V", "mobileads_externalRelease"}, m31885k = 1, m31886mv = {1, 7, 1})
/* renamed from: com.yandex.mobile.ads.nativeads.video.a */
/* loaded from: classes3.dex */
public final class C6259a extends NativeAdVideoController {

    /* renamed from: b */
    @Nullable
    private final nj0 f57961b;

    public C6259a(@Nullable nj0 nj0Var) {
        super(nj0Var);
        this.f57961b = nj0Var;
    }

    @Override // com.yandex.mobile.ads.nativeads.video.NativeAdVideoController
    public void pauseAd() {
        nj0 nj0Var = this.f57961b;
        if (nj0Var != null) {
            nj0Var.mo25211b();
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.video.NativeAdVideoController
    public void resumeAd() {
        nj0 nj0Var = this.f57961b;
        if (nj0Var != null) {
            nj0Var.mo25210a();
        }
    }
}
