package com.yandex.mobile.ads.appopenad;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@MainThread
/* loaded from: classes2.dex */
public interface AppOpenAd {
    void setAdEventListener(@Nullable AppOpenAdEventListener appOpenAdEventListener);

    void show(@NonNull Activity activity);
}
