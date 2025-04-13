package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public interface AppMetricaDeviceIDListener {

    public enum Reason {
        UNKNOWN,
        NETWORK,
        INVALID_RESPONSE
    }

    void onError(@NonNull Reason reason);

    void onLoaded(@Nullable String str);
}
