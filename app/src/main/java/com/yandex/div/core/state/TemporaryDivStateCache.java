package com.yandex.div.core.state;

import androidx.annotation.AnyThread;
import com.yandex.div.core.dagger.DivScope;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TemporaryDivStateCache.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/state/TemporaryDivStateCache;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public final class TemporaryDivStateCache {

    /* renamed from: a */
    @NotNull
    public final Map<String, Map<String, String>> f31340a = new LinkedHashMap();

    @Inject
    public TemporaryDivStateCache() {
    }

    @AnyThread
    /* renamed from: a */
    public final void m16722a(@NotNull String str, @NotNull String str2, @NotNull String stateId) {
        Intrinsics.m32179h(stateId, "stateId");
        synchronized (this.f31340a) {
            Map<String, Map<String, String>> map = this.f31340a;
            Map<String, String> map2 = map.get(str);
            if (map2 == null) {
                map2 = new LinkedHashMap<>();
                map.put(str, map2);
            }
            map2.put(str2, stateId);
        }
    }
}
