package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: com.yandex.mobile.ads.impl.a6 */
/* loaded from: classes3.dex */
public final class C4794a6 {

    /* renamed from: a */
    @NonNull
    private final HashMap f48314a = new HashMap();

    /* renamed from: b */
    @Nullable
    private dr0 f48315b;

    @NonNull
    /* renamed from: a */
    public final d40 m22380a(@NonNull VideoAd videoAd) {
        d40 d40Var = (d40) this.f48314a.get(videoAd);
        return d40Var != null ? d40Var : d40.f49559a;
    }

    @Nullable
    /* renamed from: b */
    public final dr0 m22384b() {
        return this.f48315b;
    }

    /* renamed from: c */
    public final boolean m22385c() {
        Collection values = this.f48314a.values();
        return values.contains(d40.f49561c) || values.contains(d40.f49562d);
    }

    /* renamed from: a */
    public final void m22383a(@NonNull VideoAd videoAd, @NonNull d40 d40Var) {
        this.f48314a.put(videoAd, d40Var);
    }

    /* renamed from: a */
    public final void m22381a() {
        this.f48314a.clear();
    }

    /* renamed from: a */
    public final void m22382a(@Nullable dr0 dr0Var) {
        this.f48315b = dr0Var;
    }
}
