package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.cx0;
import com.yandex.mobile.ads.impl.eh0;
import com.yandex.mobile.ads.impl.qi0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.q */
/* loaded from: classes3.dex */
final class C6189q {

    /* renamed from: a */
    @NonNull
    private final C6188p f57567a;

    public C6189q(@NonNull Context context) {
        this.f57567a = new C6188p(context);
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/yandex/mobile/ads/mediation/nativeads/MediatedNativeAd;Ljava/util/Map<Ljava/lang/String;Landroid/graphics/Bitmap;>;Ljava/lang/Object;)Lcom/yandex/mobile/ads/base/AdResponse<Lcom/yandex/mobile/ads/impl/qi0;>; */
    @NonNull
    /* renamed from: a */
    public final AdResponse m30436a(@NonNull MediatedNativeAd mediatedNativeAd, @NonNull Map map, @NonNull int i2) {
        ArrayList m30435a = this.f57567a.m30435a(mediatedNativeAd.getMediatedNativeAdAssets(), map);
        eh0 eh0Var = new eh0();
        eh0Var.m24168c(cx0.m23548a(i2));
        eh0Var.m24169c(m30435a);
        qi0 qi0Var = new qi0();
        qi0Var.m27731a(Collections.singletonList(eh0Var));
        return new AdResponse.C4646b().m21874a((AdResponse.C4646b) qi0Var).m21875a();
    }
}
