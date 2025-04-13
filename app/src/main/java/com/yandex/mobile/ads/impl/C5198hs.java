package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.InterfaceC5090fs;

/* renamed from: com.yandex.mobile.ads.impl.hs */
/* loaded from: classes3.dex */
public final class C5198hs {

    /* renamed from: a */
    @NonNull
    private final Context f51131a;

    /* renamed from: b */
    @NonNull
    private final C5101g2 f51132b;

    /* renamed from: c */
    @NonNull
    private final AdResponse f51133c;

    public C5198hs(@NonNull Context context, @NonNull AdResponse adResponse, @NonNull C5101g2 c5101g2) {
        this.f51131a = context.getApplicationContext();
        this.f51132b = c5101g2;
        this.f51133c = adResponse;
    }

    @NonNull
    /* renamed from: a */
    public final C5987ws m25359a() {
        return new C5987ws(new InterfaceC5090fs.b(this.f51131a).m24737a(), new fc0(this.f51131a), new af1(this.f51131a, this.f51133c, this.f51132b));
    }
}
