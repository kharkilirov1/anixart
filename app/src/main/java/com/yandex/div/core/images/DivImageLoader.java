package com.yandex.div.core.images;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public interface DivImageLoader {
    @NonNull
    LoadReference loadImage(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback);

    @NonNull
    LoadReference loadImage(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback, int i2);

    @NonNull
    LoadReference loadImageBytes(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback);

    @NonNull
    LoadReference loadImageBytes(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback, int i2);
}
