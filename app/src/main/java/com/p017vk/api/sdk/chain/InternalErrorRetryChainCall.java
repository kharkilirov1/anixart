package com.p017vk.api.sdk.chain;

import com.p017vk.api.sdk.VKApiManager;
import com.p017vk.api.sdk.exceptions.VKApiException;
import com.p017vk.api.sdk.exceptions.VKApiExecutionException;
import com.p017vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.p017vk.api.sdk.utils.ExponentialBackoff;
import com.p017vk.api.sdk.utils.log.Logger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InternalErrorRetryChainCall.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/vk/api/sdk/chain/InternalErrorRetryChainCall;", "T", "Lcom/vk/api/sdk/chain/RetryChainCall;", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class InternalErrorRetryChainCall<T> extends RetryChainCall<T> {

    /* renamed from: c */
    public final ExponentialBackoff f30681c;

    /* renamed from: d */
    @NotNull
    public final ChainCall<T> f30682d;

    /* JADX WARN: Multi-variable type inference failed */
    public InternalErrorRetryChainCall(@NotNull VKApiManager vKApiManager, int i2, @NotNull ChainCall<? extends T> chainCall) {
        super(vKApiManager, i2);
        this.f30682d = chainCall;
        this.f30681c = new ExponentialBackoff(1000L, 60000L, 1.5f, 0.0f, 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.vk.api.sdk.exceptions.VKApiIllegalResponseException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.vk.api.sdk.exceptions.VKApiExecutionException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.vk.api.sdk.utils.log.Logger] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.vk.api.sdk.utils.log.Logger] */
    @Override // com.p017vk.api.sdk.chain.ChainCall
    @Nullable
    /* renamed from: a */
    public T mo16503a(@NotNull ChainArgs chainArgs) throws Exception {
        Logger.LogLevel logLevel = Logger.LogLevel.WARNING;
        ?? e2 = 0;
        while (true) {
            int i2 = this.f30689b;
            if (i2 >= 0 && this.f30681c.f30783c > i2) {
                if (e2 == 0) {
                    throw new VKApiException("api-call failed due to retry limits, but no exception has tracked");
                }
                throw e2;
            }
            ExponentialBackoff exponentialBackoff = this.f30681c;
            if (exponentialBackoff.f30783c > 0) {
                Thread.sleep(exponentialBackoff.f30782b);
            }
            try {
                return this.f30682d.mo16503a(chainArgs);
            } catch (VKApiExecutionException e3) {
                e2 = e3;
                int i3 = e2.f30698b;
                if (!(i3 == 1 || i3 == 10 || i3 == 13)) {
                    throw e2;
                }
                this.f30680a.f30636c.f30621i.mo16540b(logLevel, "", e2);
                this.f30681c.m16533a();
            } catch (VKApiIllegalResponseException e4) {
                e2 = e4;
                this.f30680a.f30636c.f30621i.mo16540b(logLevel, "", e2);
                this.f30681c.m16533a();
            }
        }
    }
}
