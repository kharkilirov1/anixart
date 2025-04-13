package com.p017vk.api.sdk.okhttp;

import com.p017vk.api.sdk.VKApiConfig;
import com.p017vk.api.sdk.VKOkHttpProvider;
import com.p017vk.api.sdk.utils.log.Logger;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* compiled from: OkHttpExecutor.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"com/vk/api/sdk/okhttp/OkHttpExecutor$updateClient$1", "Lcom/vk/api/sdk/VKOkHttpProvider$BuilderUpdateFunction;", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class OkHttpExecutor$updateClient$1 implements VKOkHttpProvider.BuilderUpdateFunction {

    /* renamed from: a */
    public final /* synthetic */ OkHttpExecutor f30730a;

    public OkHttpExecutor$updateClient$1(OkHttpExecutor okHttpExecutor) {
        this.f30730a = okHttpExecutor;
    }

    @NotNull
    /* renamed from: a */
    public OkHttpClient.Builder m16519a(@NotNull OkHttpClient.Builder builder) {
        if (Logger.LogLevel.NONE != this.f30730a.f30728i.f30731a.f30621i.mo16539a()) {
            VKApiConfig vKApiConfig = this.f30730a.f30728i.f30731a;
            builder.addInterceptor(new LoggingInterceptor(vKApiConfig.f30624l, vKApiConfig.f30621i));
        }
        return builder;
    }
}
