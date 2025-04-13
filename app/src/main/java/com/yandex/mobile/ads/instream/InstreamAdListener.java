package com.yandex.mobile.ads.instream;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;

@MainThread
/* loaded from: classes3.dex */
public interface InstreamAdListener {
    void onError(@NonNull String str);

    void onInstreamAdCompleted();

    void onInstreamAdPrepared();
}
