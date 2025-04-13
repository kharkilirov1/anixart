package com.p017vk.api.sdk.chain;

import com.p017vk.api.sdk.VKApiManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChainCall.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/vk/api/sdk/chain/ChainCall;", "T", "", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public abstract class ChainCall<T> {

    /* renamed from: a */
    @NotNull
    public final VKApiManager f30680a;

    public ChainCall(@NotNull VKApiManager vKApiManager) {
        this.f30680a = vKApiManager;
    }

    @Nullable
    /* renamed from: a */
    public abstract T mo16503a(@NotNull ChainArgs chainArgs) throws Exception;
}
