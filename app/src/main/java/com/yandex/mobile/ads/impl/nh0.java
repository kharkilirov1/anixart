package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.sv0;

/* loaded from: classes3.dex */
public final class nh0 {

    /* renamed from: a */
    @NonNull
    private final Context f53008a;

    /* renamed from: b */
    @NonNull
    private final C5101g2 f53009b;

    /* renamed from: c */
    @NonNull
    private final AdResponse f53010c;

    /* renamed from: d */
    @Nullable
    private sv0.InterfaceC5763a f53011d;

    public nh0(@NonNull Context context, @NonNull AdResponse adResponse, @NonNull C5101g2 c5101g2) {
        this.f53008a = context.getApplicationContext();
        this.f53009b = c5101g2;
        this.f53010c = adResponse;
    }

    /* renamed from: a */
    public final void m26913a(@NonNull sv0.InterfaceC5763a interfaceC5763a) {
        this.f53011d = interfaceC5763a;
    }

    @NonNull
    /* renamed from: a */
    public final C6123zh m26912a(@NonNull String str, @NonNull String str2) {
        return new C6123zh(this.f53008a, this.f53010c, this.f53009b, new oh0(str, str2, this.f53011d));
    }
}
