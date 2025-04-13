package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;

/* renamed from: com.yandex.mobile.ads.impl.fw */
/* loaded from: classes3.dex */
final class C5094fw implements InterfaceC5750sk {

    /* renamed from: a */
    @NonNull
    private final InterfaceC5338ki f50447a;

    public C5094fw(@NonNull InterfaceC5338ki interfaceC5338ki) {
        this.f50447a = interfaceC5338ki;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5750sk
    /* renamed from: a */
    public final void mo24744a(@NonNull RelativeLayout relativeLayout) {
        relativeLayout.setBackground(C5005e5.f49807b);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5750sk
    /* renamed from: b */
    public final void mo24746b() {
        this.f50447a.mo25882b();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5750sk
    /* renamed from: c */
    public final void mo24747c() {
        this.f50447a.mo25883c();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5750sk
    /* renamed from: d */
    public final void mo24748d() {
        this.f50447a.invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5750sk
    @NonNull
    /* renamed from: a */
    public final RelativeLayout mo24742a(@NonNull C5715rw c5715rw, @NonNull AdResponse adResponse) {
        Context context = c5715rw.getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(0);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.addView(c5715rw, new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.addView(this.f50447a.mo25884d(), C5057f5.m24319a(context, c5715rw));
        return relativeLayout;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5750sk
    /* renamed from: a */
    public final void mo24745a(boolean z) {
        this.f50447a.mo25881a(z);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5750sk
    /* renamed from: a */
    public final void mo24743a() {
        this.f50447a.mo25880a();
    }
}
