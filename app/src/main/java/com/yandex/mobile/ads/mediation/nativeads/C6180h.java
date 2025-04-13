package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.q10;
import com.yandex.mobile.ads.impl.qi0;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.h */
/* loaded from: classes3.dex */
final class C6180h {

    /* renamed from: a */
    @NonNull
    private final q10 f57547a;

    /* renamed from: b */
    @NonNull
    private final C6181i f57548b;

    /* renamed from: c */
    @NonNull
    private final C6189q f57549c;

    /* renamed from: com.yandex.mobile.ads.mediation.nativeads.h$a */
    public interface a {
        /* renamed from: a */
        void mo30431a(@NonNull AdResponse<qi0> adResponse);
    }

    public C6180h(@NonNull Context context, @NonNull q10 q10Var, @NonNull C6181i c6181i) {
        this.f57547a = q10Var;
        this.f57548b = c6181i;
        this.f57549c = new C6189q(context);
    }

    /* renamed from: a */
    public final void m30430a(@NonNull MediatedNativeAd mediatedNativeAd, @NonNull int i2, @NonNull ArrayList arrayList, @NonNull a aVar) {
        this.f57547a.m27596a(this.f57548b.m30432a(arrayList), new C6179g(this, mediatedNativeAd, i2, aVar));
    }

    /* renamed from: a */
    public static void m30429a(C6180h c6180h, MediatedNativeAd mediatedNativeAd, Map map, int i2, a aVar) {
        aVar.mo30431a(c6180h.f57549c.m30436a(mediatedNativeAd, map, i2));
    }
}
