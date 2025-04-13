package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.video.playback.model.AdPodInfo;
import com.yandex.mobile.ads.video.playback.model.MediaFile;
import com.yandex.mobile.ads.video.playback.model.SkipInfo;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class k50 implements VideoAd {

    /* renamed from: a */
    @NonNull
    private final MediaFile f51838a;

    /* renamed from: b */
    @NonNull
    private final AdPodInfo f51839b;

    /* renamed from: c */
    @Nullable
    private final SkipInfo f51840c;

    /* renamed from: d */
    @Nullable
    private final String f51841d;

    /* renamed from: e */
    @Nullable
    private final JSONObject f51842e;

    /* renamed from: f */
    private final long f51843f;

    /* renamed from: g */
    @NonNull
    private final String f51844g;

    public k50(@NonNull String str, @NonNull b50 b50Var, @NonNull gd1 gd1Var, @Nullable f50 f50Var, @Nullable String str2, @Nullable JSONObject jSONObject, long j2) {
        this.f51844g = str;
        this.f51840c = f50Var;
        this.f51838a = b50Var;
        this.f51839b = gd1Var;
        this.f51841d = str2;
        this.f51842e = jSONObject;
        this.f51843f = j2;
    }

    @Nullable
    /* renamed from: a */
    public final JSONObject m26034a() {
        return this.f51842e;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    @NonNull
    public final AdPodInfo getAdPodInfo() {
        return this.f51839b;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    public final long getDuration() {
        return this.f51843f;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    @Nullable
    public final String getInfo() {
        return this.f51841d;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    @NonNull
    public final MediaFile getMediaFile() {
        return this.f51838a;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    @Nullable
    public final SkipInfo getSkipInfo() {
        return this.f51840c;
    }

    @NonNull
    public final String toString() {
        return this.f51844g;
    }
}
