package com.yandex.metrica.impl.p023ob;

import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.plugins.YandexMetricaPlugins;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.p3 */
/* loaded from: classes2.dex */
public final class C4199p3 implements YandexMetricaPlugins {

    /* renamed from: a */
    private final C4342ug f46100a;

    public C4199p3(@NotNull C4342ug c4342ug) {
        this.f46100a = c4342ug;
    }

    @Override // com.yandex.metrica.plugins.YandexMetricaPlugins
    public void reportError(@NotNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        this.f46100a.m20890a(pluginErrorDetails, str);
    }

    @Override // com.yandex.metrica.plugins.YandexMetricaPlugins
    public void reportUnhandledException(@NotNull PluginErrorDetails pluginErrorDetails) {
        this.f46100a.m20889a(pluginErrorDetails);
    }

    @Override // com.yandex.metrica.plugins.YandexMetricaPlugins
    public void reportError(@NotNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        this.f46100a.m20891a(str, str2, pluginErrorDetails);
    }
}
