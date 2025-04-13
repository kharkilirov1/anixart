package com.yandex.div.core.state;

import androidx.annotation.AnyThread;
import androidx.collection.ArrayMap;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.state.DivStateCache;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivStateManager.kt */
@AnyThread
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/state/DivStateManager;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public final class DivStateManager {

    /* renamed from: a */
    @NotNull
    public final DivStateCache f31325a;

    /* renamed from: b */
    @NotNull
    public final TemporaryDivStateCache f31326b;

    /* renamed from: c */
    @NotNull
    public final ArrayMap<DivDataTag, DivViewState> f31327c;

    @Inject
    public DivStateManager(@NotNull DivStateCache cache, @NotNull TemporaryDivStateCache temporaryCache) {
        Intrinsics.m32179h(cache, "cache");
        Intrinsics.m32179h(temporaryCache, "temporaryCache");
        this.f31325a = cache;
        this.f31326b = temporaryCache;
        this.f31327c = new ArrayMap<>();
    }

    @Nullable
    /* renamed from: a */
    public final DivViewState m16712a(@NotNull DivDataTag tag) {
        DivViewState divViewState;
        Intrinsics.m32179h(tag, "tag");
        synchronized (this.f31327c) {
            divViewState = this.f31327c.get(tag);
            if (divViewState == null) {
                String mo17546d = this.f31325a.mo17546d(tag.f30859a);
                divViewState = mo17546d == null ? null : new DivViewState(Long.parseLong(mo17546d));
                this.f31327c.put(tag, divViewState);
            }
        }
        return divViewState;
    }

    /* renamed from: b */
    public final void m16713b(@NotNull DivDataTag tag, long j2, boolean z) {
        Intrinsics.m32179h(tag, "tag");
        if (Intrinsics.m32174c(DivDataTag.f30858b, tag)) {
            return;
        }
        synchronized (this.f31327c) {
            DivViewState m16712a = m16712a(tag);
            this.f31327c.put(tag, m16712a == null ? new DivViewState(j2) : new DivViewState(j2, m16712a.f31336b));
            TemporaryDivStateCache temporaryDivStateCache = this.f31326b;
            String str = tag.f30859a;
            Intrinsics.m32178g(str, "tag.id");
            String stateId = String.valueOf(j2);
            Objects.requireNonNull(temporaryDivStateCache);
            Intrinsics.m32179h(stateId, "stateId");
            temporaryDivStateCache.m16722a(str, "/", stateId);
            if (!z) {
                this.f31325a.mo17545c(tag.f30859a, String.valueOf(j2));
            }
        }
    }

    /* renamed from: c */
    public final void m16714c(@NotNull String str, @NotNull DivStatePath divStatePath, boolean z) {
        Intrinsics.m32179h(divStatePath, "divStatePath");
        String m16717b = divStatePath.m16717b();
        String m16716a = divStatePath.m16716a();
        if (m16717b == null || m16716a == null) {
            return;
        }
        synchronized (this.f31327c) {
            this.f31326b.m16722a(str, m16717b, m16716a);
            if (!z) {
                this.f31325a.mo17544b(str, m16717b, m16716a);
            }
        }
    }
}
