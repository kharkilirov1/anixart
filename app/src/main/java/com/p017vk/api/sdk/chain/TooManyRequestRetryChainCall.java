package com.p017vk.api.sdk.chain;

import com.p017vk.api.sdk.VKApiManager;
import com.p017vk.api.sdk.exceptions.VKApiException;
import com.p017vk.api.sdk.exceptions.VKApiExecutionException;
import com.p017vk.api.sdk.utils.ExponentialBackoff;
import com.p017vk.api.sdk.utils.log.Logger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TooManyRequestRetryChainCall.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/vk/api/sdk/chain/TooManyRequestRetryChainCall;", "T", "Lcom/vk/api/sdk/chain/RetryChainCall;", "Backoff", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class TooManyRequestRetryChainCall<T> extends RetryChainCall<T> {

    /* renamed from: c */
    @NotNull
    public final ChainCall<T> f30690c;

    /* compiled from: TooManyRequestRetryChainCall.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/vk/api/sdk/chain/TooManyRequestRetryChainCall$Backoff;", "", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Backoff {

        /* renamed from: b */
        public static final Backoff f30692b = new Backoff();

        /* renamed from: a */
        public static final ExponentialBackoff f30691a = new ExponentialBackoff(1000, 8000, 1.2f, 0.0f, 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TooManyRequestRetryChainCall(@NotNull VKApiManager vKApiManager, int i2, @NotNull ChainCall<? extends T> chainCall) {
        super(vKApiManager, i2);
        this.f30690c = chainCall;
    }

    @Override // com.p017vk.api.sdk.chain.ChainCall
    @Nullable
    /* renamed from: a */
    public T mo16503a(@NotNull ChainArgs chainArgs) throws Exception {
        ExponentialBackoff exponentialBackoff;
        boolean z;
        long j2;
        int i2 = this.f30689b;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                Backoff backoff = Backoff.f30692b;
                synchronized (backoff) {
                    exponentialBackoff = Backoff.f30691a;
                    z = exponentialBackoff.f30783c > 0;
                }
                if (z) {
                    synchronized (backoff) {
                        j2 = exponentialBackoff.f30782b;
                    }
                    Thread.sleep(j2);
                }
                try {
                    T mo16503a = this.f30690c.mo16503a(chainArgs);
                    synchronized (backoff) {
                        exponentialBackoff.f30782b = exponentialBackoff.f30784d;
                        exponentialBackoff.f30783c = 0;
                    }
                    return mo16503a;
                } catch (VKApiExecutionException e2) {
                    if (!(e2.f30698b == 6)) {
                        throw e2;
                    }
                    this.f30680a.f30636c.f30621i.mo16540b(Logger.LogLevel.DEBUG, "Too many requests", e2);
                    synchronized (Backoff.f30692b) {
                        Backoff.f30691a.m16533a();
                        if (i3 == i2) {
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        throw new VKApiException("Can't handle too many requests due to retry limit!");
    }
}
