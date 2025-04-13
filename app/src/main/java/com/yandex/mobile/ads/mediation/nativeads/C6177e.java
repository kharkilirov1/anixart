package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.C5101g2;
import com.yandex.mobile.ads.impl.bi0;
import com.yandex.mobile.ads.nativeads.C6218k;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.e */
/* loaded from: classes3.dex */
public final class C6177e implements bi0 {

    /* renamed from: a */
    @NonNull
    private final a f57541a;

    /* renamed from: com.yandex.mobile.ads.mediation.nativeads.e$a */
    public interface a {
    }

    public C6177e(@NonNull C6190r c6190r) {
        this.f57541a = c6190r;
    }

    @Override // com.yandex.mobile.ads.impl.bi0
    @NonNull
    /* renamed from: a */
    public final C6218k mo22835a(@NonNull Context context, @NonNull C5101g2 c5101g2) {
        C6178f c6178f;
        C6218k c6218k = new C6218k(context, c5101g2);
        c6178f = ((C6190r) this.f57541a).f57568a.f57573e;
        c6178f.m30425a(c6218k);
        return c6218k;
    }
}
