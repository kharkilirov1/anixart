package com.yandex.mobile.ads.mediation.nativeads;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.ld0;
import com.yandex.mobile.ads.impl.xl0;
import com.yandex.mobile.ads.nativeads.C6200b;
import com.yandex.mobile.ads.nativeads.C6264w;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.n */
/* loaded from: classes3.dex */
final class C6186n implements xl0 {

    /* renamed from: a */
    @NonNull
    private final xl0 f57556a;

    /* renamed from: b */
    @NonNull
    private final MediatedNativeAd f57557b;

    /* renamed from: c */
    @NonNull
    private final ld0 f57558c;

    /* renamed from: d */
    private boolean f57559d = false;

    public C6186n(@NonNull xl0 xl0Var, @NonNull MediatedNativeAd mediatedNativeAd, @NonNull ld0 ld0Var) {
        this.f57556a = xl0Var;
        this.f57557b = mediatedNativeAd;
        this.f57558c = ld0Var;
    }

    @Override // com.yandex.mobile.ads.impl.xl0
    /* renamed from: a */
    public final void mo29766a(@NonNull C6264w c6264w) {
        this.f57556a.mo29766a(c6264w);
        NativeAdViewBinder m30755f = c6264w.m30755f();
        if (m30755f != null) {
            this.f57557b.unbindNativeAd(m30755f);
        }
    }

    @Override // com.yandex.mobile.ads.impl.xl0
    /* renamed from: a */
    public final void mo29767a(@NonNull C6264w c6264w, @NonNull C6200b c6200b) {
        this.f57556a.mo29767a(c6264w, c6200b);
        NativeAdViewBinder m30755f = c6264w.m30755f();
        if (m30755f != null) {
            this.f57557b.bindNativeAd(m30755f);
        }
        if (c6264w.m30754e() == null || this.f57559d) {
            return;
        }
        this.f57559d = true;
        this.f57558c.m26432a();
    }

    @Override // com.yandex.mobile.ads.impl.xl0
    /* renamed from: a */
    public final void mo29765a() {
        this.f57556a.mo29765a();
    }
}
