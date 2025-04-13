package com.yandex.mobile.ads.instream;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;

@MainThread
/* loaded from: classes3.dex */
public interface InstreamAdBreakEventListener {
    void onInstreamAdBreakCompleted();

    void onInstreamAdBreakError(@NonNull String str);

    void onInstreamAdBreakPrepared();

    void onInstreamAdBreakStarted();
}
