package com.p017vk.api.sdk.chain;

import com.p017vk.api.sdk.VKApiManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: RetryChainCall.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/vk/api/sdk/chain/RetryChainCall;", "T", "Lcom/vk/api/sdk/chain/ChainCall;", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public abstract class RetryChainCall<T> extends ChainCall<T> {

    /* renamed from: b */
    public final int f30689b;

    public RetryChainCall(@NotNull VKApiManager vKApiManager, int i2) {
        super(vKApiManager);
        this.f30689b = i2;
        if (i2 < 0) {
            throw new IllegalArgumentException("retryLimit must be >= 0");
        }
    }
}
