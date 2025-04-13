package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5724s3;
import com.yandex.mobile.ads.impl.jw0;
import com.yandex.mobile.ads.impl.ki0;
import com.yandex.mobile.ads.impl.kk0;
import com.yandex.mobile.ads.impl.li0;
import com.yandex.mobile.ads.impl.mk0;
import com.yandex.mobile.ads.impl.qi0;

/* renamed from: com.yandex.mobile.ads.nativeads.q */
/* loaded from: classes3.dex */
final class C6230q implements ki0 {

    /* renamed from: a */
    @NonNull
    private final C6226o f57784a;

    /* renamed from: b */
    @NonNull
    private final li0 f57785b;

    public C6230q(@NonNull Context context, @NonNull li0 li0Var) {
        this.f57785b = li0Var;
        C5724s3 c5724s3 = new C5724s3();
        C6236t c6236t = new C6236t(context, c5724s3, this);
        C6226o c6226o = new C6226o(context, c6236t, c5724s3);
        this.f57784a = c6226o;
        c6236t.m30647a(c6226o.m28616d());
    }

    /* renamed from: a */
    public final void m30620a(@NonNull NativeAdRequestConfiguration nativeAdRequestConfiguration, @NonNull kk0 kk0Var, @NonNull mk0 mk0Var, @NonNull jw0<qi0> jw0Var) {
        this.f57784a.m30597a(nativeAdRequestConfiguration, kk0Var, mk0Var, jw0Var, 1);
    }

    /* renamed from: b */
    public final void m30624b() {
        ((C6228p) this.f57785b).m30614a(this);
    }

    /* renamed from: a */
    public final void m30621a(@NonNull NativeAdRequestConfiguration nativeAdRequestConfiguration, @NonNull kk0 kk0Var, @NonNull mk0 mk0Var, @NonNull jw0<qi0> jw0Var, int i2) {
        this.f57784a.m30597a(nativeAdRequestConfiguration, kk0Var, mk0Var, jw0Var, i2);
    }

    /* renamed from: a */
    public final void m30619a(@Nullable NativeAdLoadListener nativeAdLoadListener) {
        this.f57784a.m30596a(nativeAdLoadListener);
    }

    /* renamed from: a */
    public final void m30622a(@Nullable NativeBulkAdLoadListener nativeBulkAdLoadListener) {
        this.f57784a.m30598a(nativeBulkAdLoadListener);
    }

    /* renamed from: a */
    public final void m30623a(@Nullable SliderAdLoadListener sliderAdLoadListener) {
        this.f57784a.m30599a(sliderAdLoadListener);
    }

    /* renamed from: a */
    public final void m30618a() {
        this.f57784a.m30600u();
    }
}
