package com.yandex.div.core.downloader;

import androidx.collection.ArrayMap;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div2.Div;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivPatchCache.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/downloader/DivPatchCache;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public class DivPatchCache {

    /* renamed from: a */
    @NotNull
    public final ArrayMap<DivDataTag, DivPatchMap> f31158a = new ArrayMap<>();

    @Inject
    public DivPatchCache() {
    }

    @Nullable
    /* renamed from: a */
    public List<Div> m16666a(@NotNull DivDataTag tag, @NotNull String str) {
        Intrinsics.m32179h(tag, "tag");
        if (this.f31158a.get(tag) == null) {
            return null;
        }
        throw null;
    }
}
