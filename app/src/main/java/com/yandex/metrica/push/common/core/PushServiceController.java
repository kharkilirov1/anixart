package com.yandex.metrica.push.common.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public interface PushServiceController {
    @NonNull
    String getTitle();

    @Nullable
    String getToken();

    boolean register();
}
