package com.yandex.mobile.ads.mediation.nativeads;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.i20;
import com.yandex.mobile.ads.mediation.nativeads.C6180h;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.g */
/* loaded from: classes3.dex */
final class C6179g implements i20 {

    /* renamed from: a */
    public final /* synthetic */ MediatedNativeAd f57543a;

    /* renamed from: b */
    public final /* synthetic */ int f57544b;

    /* renamed from: c */
    public final /* synthetic */ C6180h.a f57545c;

    /* renamed from: d */
    public final /* synthetic */ C6180h f57546d;

    public C6179g(C6180h c6180h, MediatedNativeAd mediatedNativeAd, int i2, C6180h.a aVar) {
        this.f57546d = c6180h;
        this.f57543a = mediatedNativeAd;
        this.f57544b = i2;
        this.f57545c = aVar;
    }

    @Override // com.yandex.mobile.ads.impl.i20
    /* renamed from: a */
    public final void mo25427a(@NonNull Map<String, Bitmap> map) {
        C6180h.m30429a(this.f57546d, this.f57543a, map, this.f57544b, this.f57545c);
    }
}
