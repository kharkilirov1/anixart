package com.p017vk.api.sdk;

import com.p017vk.api.sdk.okhttp.OkHttpExecutor$updateClient$1;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* compiled from: VKOkHttpProvider.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/vk/api/sdk/VKOkHttpProvider;", "", "BuilderUpdateFunction", "DefaultProvider", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public abstract class VKOkHttpProvider {

    /* compiled from: VKOkHttpProvider.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/vk/api/sdk/VKOkHttpProvider$BuilderUpdateFunction;", "", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public interface BuilderUpdateFunction {
    }

    /* compiled from: VKOkHttpProvider.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/vk/api/sdk/VKOkHttpProvider$DefaultProvider;", "Lcom/vk/api/sdk/VKOkHttpProvider;", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class DefaultProvider extends VKOkHttpProvider {

        /* renamed from: a */
        public volatile OkHttpClient f30652a;

        @Override // com.p017vk.api.sdk.VKOkHttpProvider
        @NotNull
        /* renamed from: a */
        public OkHttpClient mo16496a() {
            if (this.f30652a == null) {
                OkHttpClient.Builder newBuilder = new OkHttpClient().newBuilder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                this.f30652a = newBuilder.connectTimeout(20L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(20L, timeUnit).followRedirects(true).followSslRedirects(true).build();
            }
            OkHttpClient okHttpClient = this.f30652a;
            if (okHttpClient != null) {
                return okHttpClient;
            }
            Intrinsics.m32188q();
            throw null;
        }

        @Override // com.p017vk.api.sdk.VKOkHttpProvider
        /* renamed from: b */
        public void mo16497b(@NotNull BuilderUpdateFunction builderUpdateFunction) {
            if (this.f30652a != null) {
                OkHttpClient okHttpClient = this.f30652a;
                if (okHttpClient == null) {
                    Intrinsics.m32188q();
                    throw null;
                }
                OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
                Intrinsics.m32175d(newBuilder, "okHttpClient!!.newBuilder()");
                ((OkHttpExecutor$updateClient$1) builderUpdateFunction).m16519a(newBuilder);
                this.f30652a = newBuilder.build();
            }
        }
    }

    @NotNull
    /* renamed from: a */
    public abstract OkHttpClient mo16496a();

    /* renamed from: b */
    public abstract void mo16497b(@NotNull BuilderUpdateFunction builderUpdateFunction);
}
