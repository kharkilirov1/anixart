package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;

/* renamed from: com.yandex.mobile.ads.impl.yu */
/* loaded from: classes3.dex */
final class C6092yu implements InterfaceC5750sk {

    /* renamed from: a */
    @NonNull
    private final InterfaceC5338ki f56927a;

    public C6092yu(@NonNull InterfaceC5338ki interfaceC5338ki) {
        this.f56927a = interfaceC5338ki;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5750sk
    /* renamed from: a */
    public final void mo24744a(@NonNull RelativeLayout relativeLayout) {
        relativeLayout.setBackground(C5005e5.f49806a);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5750sk
    /* renamed from: b */
    public final void mo24746b() {
        this.f56927a.mo25882b();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5750sk
    /* renamed from: c */
    public final void mo24747c() {
        this.f56927a.mo25883c();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5750sk
    /* renamed from: d */
    public final void mo24748d() {
        this.f56927a.invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5750sk
    @NonNull
    /* renamed from: a */
    public final RelativeLayout mo24742a(@NonNull C5715rw c5715rw, @NonNull AdResponse adResponse) {
        Context context = c5715rw.getContext();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(0);
        RelativeLayout.LayoutParams m24317a = C5057f5.m24317a(context, adResponse);
        int i2 = tg1.f55120b;
        int m26789a = n11.m26789a(context, 1, 64.0f);
        m24317a.width = Math.min(m24317a.width + m26789a, context.getResources().getDisplayMetrics().widthPixels);
        m24317a.height = Math.min(m24317a.height + m26789a, context.getResources().getDisplayMetrics().heightPixels);
        relativeLayout.setLayoutParams(m24317a);
        relativeLayout.addView(c5715rw, C5057f5.m24317a(context, adResponse));
        relativeLayout.addView(this.f56927a.mo25884d(), C5057f5.m24319a(context, c5715rw));
        return relativeLayout;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5750sk
    /* renamed from: a */
    public final void mo24745a(boolean z) {
        this.f56927a.mo25881a(z);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5750sk
    /* renamed from: a */
    public final void mo24743a() {
        this.f56927a.mo25880a();
    }
}
