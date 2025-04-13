package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.video.playback.model.MediaFile;

/* loaded from: classes3.dex */
public final class b50 implements MediaFile {

    /* renamed from: a */
    @NonNull
    private final InstreamAdBreakPosition f48760a;

    /* renamed from: b */
    @NonNull
    private final String f48761b;

    /* renamed from: c */
    private final int f48762c;

    /* renamed from: d */
    private final int f48763d;

    public b50(@NonNull InstreamAdBreakPosition instreamAdBreakPosition, @NonNull String str, int i2, int i3) {
        this.f48760a = instreamAdBreakPosition;
        this.f48761b = str;
        this.f48762c = i2;
        this.f48763d = i3;
    }

    @NonNull
    /* renamed from: a */
    public final InstreamAdBreakPosition m22721a() {
        return this.f48760a;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    public final int getAdHeight() {
        return this.f48763d;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    public final int getAdWidth() {
        return this.f48762c;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile, com.yandex.mobile.ads.impl.uc1
    @NonNull
    public final String getUrl() {
        return this.f48761b;
    }
}
