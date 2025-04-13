package com.swiftsoft.anixartd.dagger.module;

import android.content.Context;
import android.os.Build;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.utils.Police;
import com.yandex.div2.C3033a;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class AppModule_ProvideRetrofitFactory implements Factory<Retrofit> {

    /* renamed from: a */
    public final AppModule f25608a;

    /* renamed from: b */
    public final Provider<Context> f25609b;

    public AppModule_ProvideRetrofitFactory(AppModule appModule, Provider<Context> provider) {
        this.f25608a = appModule;
        this.f25609b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        AppModule appModule = this.f25608a;
        final Context context = this.f25609b.get();
        Objects.requireNonNull(appModule);
        Intrinsics.m32179h(context, "context");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        final String m17745g = C3033a.m17745g(new Object[]{"8.2.3", 24111318, Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT), Build.SUPPORTED_ABIS[0], Build.MANUFACTURER, Build.MODEL, Locale.getDefault().getLanguage()}, 8, "AnixartApp/%s-%d (Android %s; SDK %s; %s; %s %s; %s)", "format(format, *args)");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.connectTimeout(20L, timeUnit);
        builder.writeTimeout(20L, timeUnit);
        builder.readTimeout(20L, timeUnit);
        builder.addInterceptor(new Interceptor() { // from class: com.swiftsoft.anixartd.dagger.module.AppModule$provideRetrofit$lambda$2$$inlined$-addInterceptor$1
            @Override // okhttp3.Interceptor
            @NotNull
            public final Response intercept(@NotNull Interceptor.Chain chain) {
                Intrinsics.m32179h(chain, "chain");
                try {
                    return chain.proceed(chain.request().newBuilder().header("User-Agent", m17745g).header("Sign", new Police().m16344a(context)).build());
                } catch (NullPointerException unused) {
                    return chain.proceed(chain.request());
                }
            }
        });
        Retrofit.Builder builder2 = new Retrofit.Builder();
        String string = App.f25340b.m14044b().f25344a.getString("API_BASE_URL", "https://api.anixart.tv/");
        if (string == null) {
            string = "";
        }
        HttpUrl httpUrl = HttpUrl.get(string);
        Objects.requireNonNull(httpUrl, "baseUrl == null");
        if (!"".equals(httpUrl.pathSegments().get(r5.size() - 1))) {
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }
        builder2.f69577c = httpUrl;
        OkHttpClient build = builder.build();
        Objects.requireNonNull(build, "client == null");
        builder2.f69576b = build;
        builder2.f69578d.add(new JacksonConverterFactory(new ObjectMapper()));
        builder2.f69579e.add(new RxJava2CallAdapterFactory(null, false));
        return builder2.m35040a();
    }
}
