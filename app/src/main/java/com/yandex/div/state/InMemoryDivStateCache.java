package com.yandex.div.state;

import androidx.annotation.AnyThread;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InMemoryDivStateCache.kt */
@AnyThread
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/state/InMemoryDivStateCache;", "Lcom/yandex/div/state/DivStateCache;", "div-states_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class InMemoryDivStateCache implements DivStateCache {

    /* renamed from: a */
    public final Map<Pair<String, String>, String> f34365a = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: b */
    public final Map<String, String> f34366b = Collections.synchronizedMap(new LinkedHashMap());

    @Override // com.yandex.div.state.DivStateCache
    @Nullable
    /* renamed from: a */
    public String mo17543a(@NotNull String str, @NotNull String str2) {
        return this.f34365a.get(new Pair(str, str2));
    }

    @Override // com.yandex.div.state.DivStateCache
    /* renamed from: b */
    public void mo17544b(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Map<Pair<String, String>, String> states = this.f34365a;
        Intrinsics.m32178g(states, "states");
        states.put(new Pair<>(str, str2), str3);
    }

    @Override // com.yandex.div.state.DivStateCache
    /* renamed from: c */
    public void mo17545c(@NotNull String cardId, @NotNull String state) {
        Intrinsics.m32179h(cardId, "cardId");
        Intrinsics.m32179h(state, "state");
        Map<String, String> rootStates = this.f34366b;
        Intrinsics.m32178g(rootStates, "rootStates");
        rootStates.put(cardId, state);
    }

    @Override // com.yandex.div.state.DivStateCache
    @Nullable
    /* renamed from: d */
    public String mo17546d(@NotNull String cardId) {
        Intrinsics.m32179h(cardId, "cardId");
        return this.f34366b.get(cardId);
    }
}
