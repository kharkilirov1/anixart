package com.swiftsoft.anixartd.dagger.module;

import android.content.Context;
import com.swiftsoft.anixartd.Prefs;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Objects;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class AppModule_ProvidePrefsFactory implements Factory<Prefs> {

    /* renamed from: a */
    public final AppModule f25578a;

    /* renamed from: b */
    public final Provider<Context> f25579b;

    public AppModule_ProvidePrefsFactory(AppModule appModule, Provider<Context> provider) {
        this.f25578a = appModule;
        this.f25579b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        AppModule appModule = this.f25578a;
        Context context = this.f25579b.get();
        Objects.requireNonNull(appModule);
        Intrinsics.m32179h(context, "context");
        return new Prefs(context);
    }
}
