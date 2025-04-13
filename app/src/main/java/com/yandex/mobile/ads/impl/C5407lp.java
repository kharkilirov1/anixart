package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div2.DivData;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import java.util.Objects;
import java.util.UUID;

/* renamed from: com.yandex.mobile.ads.impl.lp */
/* loaded from: classes3.dex */
public final class C5407lp implements InterfaceC5651qo<NativeAdView> {

    /* renamed from: a */
    @NonNull
    private final DivData f52479a;

    /* renamed from: b */
    @NonNull
    private final C4984dq f52480b;

    /* renamed from: c */
    @NonNull
    private final C5351kp f52481c;

    public C5407lp(@NonNull Context context, @NonNull DivData divData, @NonNull C5689rh c5689rh, @NonNull InterfaceC5541ok interfaceC5541ok) {
        this(divData, new C4984dq(), new C5351kp(context, c5689rh, interfaceC5541ok));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: a */
    public final void mo22712a(@NonNull NativeAdView nativeAdView) {
        NativeAdView nativeAdView2 = nativeAdView;
        try {
            Context context = nativeAdView2.getContext();
            Objects.requireNonNull(this.f52480b);
            Div2View m23926a = C4984dq.m23926a(context);
            nativeAdView2.addView(m23926a);
            m23926a.m16823x(this.f52479a, new DivDataTag(UUID.randomUUID().toString()));
            m23926a.setActionHandler(this.f52481c);
        } catch (Throwable unused) {
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: c */
    public final void mo22713c() {
    }

    @VisibleForTesting
    public C5407lp(@NonNull DivData divData, @NonNull C4984dq c4984dq, @NonNull C5351kp c5351kp) {
        this.f52479a = divData;
        this.f52480b = c4984dq;
        this.f52481c = c5351kp;
    }
}
