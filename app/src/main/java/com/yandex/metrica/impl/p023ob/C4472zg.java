package com.yandex.metrica.impl.p023ob;

import androidx.annotation.Nullable;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.plugins.StackTraceItem;
import java.util.Collection;

/* renamed from: com.yandex.metrica.impl.ob.zg */
/* loaded from: classes2.dex */
public class C4472zg implements IPluginReporter {

    /* renamed from: a */
    private final InterfaceC4350uo<PluginErrorDetails> f47117a = new C4272ro(new C4246qo("Error details"));

    /* renamed from: b */
    private final InterfaceC4350uo<String> f47118b = new C4272ro(new C4220po("Error identifier"));

    /* renamed from: c */
    private final InterfaceC4350uo<Collection<StackTraceItem>> f47119c = new C4194oo("Stacktrace");

    /* renamed from: a */
    public boolean m21296a(@Nullable PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        this.f47117a.mo18360a(pluginErrorDetails);
        return this.f47119c.mo18360a(pluginErrorDetails.getStacktrace()).m20772b();
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(@Nullable PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        this.f47117a.mo18360a(pluginErrorDetails);
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportUnhandledException(@Nullable PluginErrorDetails pluginErrorDetails) {
        this.f47117a.mo18360a(pluginErrorDetails);
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(@Nullable String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        this.f47118b.mo18360a(str);
    }
}
