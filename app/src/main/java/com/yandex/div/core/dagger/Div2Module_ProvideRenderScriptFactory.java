package com.yandex.div.core.dagger;

import android.content.Context;
import android.os.Build;
import android.renderscript.RenderScript;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import java.util.Objects;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class Div2Module_ProvideRenderScriptFactory implements Factory<RenderScript> {

    /* renamed from: a */
    public final Provider<Context> f31131a;

    public Div2Module_ProvideRenderScriptFactory(Provider<Context> provider) {
        this.f31131a = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        Context context = this.f31131a.get();
        RenderScript create = Build.VERSION.SDK_INT < 23 ? RenderScript.create(context) : RenderScript.createMultiContext(context, RenderScript.ContextType.NORMAL, 0, context.getApplicationInfo().targetSdkVersion);
        Objects.requireNonNull(create, "Cannot return null from a non-@Nullable @Provides method");
        return create;
    }
}
