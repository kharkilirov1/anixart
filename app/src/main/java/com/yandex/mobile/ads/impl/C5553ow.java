package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.AdResultReceiver;

/* renamed from: com.yandex.mobile.ads.impl.ow */
/* loaded from: classes3.dex */
public final class C5553ow implements ue0, ve0 {

    /* renamed from: a */
    @NonNull
    private final Context f53336a;

    /* renamed from: b */
    @NonNull
    private final AdResponse<String> f53337b;

    /* renamed from: c */
    @NonNull
    private final AdResultReceiver f53338c;

    /* renamed from: d */
    @NonNull
    private final ck1 f53339d;

    public C5553ow(@NonNull Context context, @NonNull C5101g2 c5101g2, @NonNull AdResponse<String> adResponse, @NonNull AdResultReceiver adResultReceiver) {
        this.f53336a = context;
        this.f53337b = adResponse;
        this.f53338c = adResultReceiver;
        this.f53339d = new ck1(c5101g2);
    }

    @Override // com.yandex.mobile.ads.impl.ve0
    /* renamed from: a */
    public final void mo22863a() {
        this.f53339d.m23303a(this.f53336a, this.f53337b);
        this.f53338c.send(13, null);
    }

    @Override // com.yandex.mobile.ads.impl.ue0
    /* renamed from: b */
    public final void mo26325b() {
        this.f53338c.send(15, null);
    }

    @Override // com.yandex.mobile.ads.impl.ue0
    /* renamed from: d */
    public final void mo26329d() {
        this.f53338c.send(14, null);
    }
}
