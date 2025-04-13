package com.yandex.metrica.push.common.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes2.dex */
public interface Tracker {
    void pauseSession();

    void reportError(@NonNull String str, @Nullable Throwable th);

    void reportEvent(@NonNull String str);

    void reportEvent(@NonNull String str, @Nullable Map<String, Object> map);

    void reportUnhandledException(@NonNull Throwable th);

    void resumeSession();
}
