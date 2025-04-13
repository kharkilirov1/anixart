package com.yandex.metrica.plugins;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public interface IPluginReporter {
    void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str);

    void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails);

    void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails);
}
