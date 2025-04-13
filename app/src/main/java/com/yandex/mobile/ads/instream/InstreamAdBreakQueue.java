package com.yandex.mobile.ads.instream;

import androidx.annotation.MainThread;
import androidx.annotation.Nullable;

@MainThread
/* loaded from: classes3.dex */
public interface InstreamAdBreakQueue<T> {
    int getCount();

    @Nullable
    T poll();
}
