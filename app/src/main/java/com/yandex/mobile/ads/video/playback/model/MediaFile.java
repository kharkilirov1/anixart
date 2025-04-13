package com.yandex.mobile.ads.video.playback.model;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.uc1;

/* loaded from: classes3.dex */
public interface MediaFile extends uc1 {
    int getAdHeight();

    int getAdWidth();

    @Override // com.yandex.mobile.ads.impl.uc1
    @NonNull
    String getUrl();
}
