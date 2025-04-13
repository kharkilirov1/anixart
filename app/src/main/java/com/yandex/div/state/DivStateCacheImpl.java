package com.yandex.div.state;

import androidx.annotation.AnyThread;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.util.SingleThreadExecutor;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivStateCacheImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/state/DivStateCacheImpl;", "Lcom/yandex/div/state/DivStateCache;", "WorkerThreadExecutor", "div-states_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivStateCacheImpl implements DivStateCache {

    /* compiled from: DivStateCacheImpl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/state/DivStateCacheImpl$WorkerThreadExecutor;", "Lcom/yandex/div/internal/util/SingleThreadExecutor;", "div-states_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class WorkerThreadExecutor extends SingleThreadExecutor {
        @Override // com.yandex.div.internal.util.SingleThreadExecutor
        /* renamed from: a */
        public void mo16546a(@NotNull RuntimeException runtimeException) {
        }
    }

    @Override // com.yandex.div.state.DivStateCache
    @AnyThread
    @Nullable
    /* renamed from: a */
    public String mo17543a(@NotNull String str, @NotNull String str2) {
        throw null;
    }

    @Override // com.yandex.div.state.DivStateCache
    @AnyThread
    /* renamed from: b */
    public void mo17544b(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.m32178g(null, "cache");
        throw null;
    }

    @Override // com.yandex.div.state.DivStateCache
    @AnyThread
    /* renamed from: c */
    public void mo17545c(@NotNull String cardId, @NotNull String stateId) {
        Intrinsics.m32179h(cardId, "cardId");
        Intrinsics.m32179h(stateId, "stateId");
        Intrinsics.m32178g(null, "rootState");
        throw null;
    }

    @Override // com.yandex.div.state.DivStateCache
    @AnyThread
    @Nullable
    /* renamed from: d */
    public String mo17546d(@NotNull String cardId) {
        Intrinsics.m32179h(cardId, "cardId");
        try {
            Intrinsics.m32178g(null, "rootState");
            throw null;
        } catch (ExecutionException unused) {
            int i2 = Assert.f33709a;
            return null;
        }
    }
}
