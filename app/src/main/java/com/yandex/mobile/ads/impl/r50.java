package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class r50 implements vc1<VideoAd> {

    /* renamed from: a */
    @NonNull
    private final x11 f54195a = new x11();

    /* renamed from: b */
    @NonNull
    private final gc1 f54196b = new gc1();

    /* renamed from: c */
    @NonNull
    private final InstreamAdBreakPosition f54197c;

    /* renamed from: d */
    private final long f54198d;

    public r50(@NonNull InstreamAdBreakPosition instreamAdBreakPosition, long j2) {
        this.f54197c = instreamAdBreakPosition;
        this.f54198d = j2;
    }

    @Override // com.yandex.mobile.ads.impl.vc1
    @NonNull
    /* renamed from: a */
    public final Object mo25904a(@NonNull pb1 pb1Var, @NonNull C5083fl c5083fl, @NonNull jb0 jb0Var, @NonNull gd1 gd1Var, @Nullable String str, @Nullable JSONObject jSONObject) {
        f50 m29627a = this.f54195a.m29627a(c5083fl);
        b50 b50Var = new b50(this.f54197c, jb0Var.m25841d(), jb0Var.m25843f(), jb0Var.m25839b());
        long m24614d = c5083fl.m24614d();
        gc1 gc1Var = this.f54196b;
        long j2 = this.f54198d;
        Objects.requireNonNull(gc1Var);
        return new k50(gc1.m24841a(j2, gd1Var, pb1Var), b50Var, gd1Var, m29627a, str, jSONObject, m24614d);
    }
}
