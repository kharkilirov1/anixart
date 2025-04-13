package com.yandex.mobile.ads.mediation.nativeads;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.eh0;
import com.yandex.mobile.ads.impl.ld0;
import com.yandex.mobile.ads.impl.xl0;
import com.yandex.mobile.ads.impl.yl0;
import com.yandex.mobile.ads.nativeads.C6235s0;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.o */
/* loaded from: classes3.dex */
public final class C6187o implements yl0 {

    /* renamed from: a */
    @NonNull
    private final MediatedNativeAd f57560a;

    /* renamed from: b */
    @NonNull
    private final C6235s0 f57561b = new C6235s0();

    /* renamed from: c */
    @NonNull
    private final ld0 f57562c;

    public C6187o(@NonNull MediatedNativeAd mediatedNativeAd, @NonNull ld0 ld0Var) {
        this.f57560a = mediatedNativeAd;
        this.f57562c = ld0Var;
    }

    @Override // com.yandex.mobile.ads.impl.yl0
    @NonNull
    /* renamed from: a */
    public final xl0 mo29951a(@NonNull eh0 eh0Var) {
        return new C6186n(this.f57561b.mo29951a(eh0Var), this.f57560a, this.f57562c);
    }
}
