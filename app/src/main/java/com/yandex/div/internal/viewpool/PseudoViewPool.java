package com.yandex.div.internal.viewpool;

import android.view.View;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PseudoViewPool.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/viewpool/PseudoViewPool;", "Lcom/yandex/div/internal/viewpool/ViewPool;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class PseudoViewPool implements ViewPool {

    /* renamed from: a */
    @NotNull
    public final ConcurrentHashMap<String, ViewFactory<? extends View>> f33924a = new ConcurrentHashMap<>();

    @Override // com.yandex.div.internal.viewpool.ViewPool
    @NotNull
    /* renamed from: a */
    public <T extends View> T mo17400a(@NotNull String tag) {
        Intrinsics.m32179h(tag, "tag");
        ConcurrentHashMap<String, ViewFactory<? extends View>> concurrentHashMap = this.f33924a;
        Intrinsics.m32179h(concurrentHashMap, "<this>");
        ViewFactory<? extends View> viewFactory = concurrentHashMap.get(tag);
        if (viewFactory != null) {
            return (T) viewFactory.mo16909a();
        }
        throw new NoSuchElementException((String) null);
    }

    @Override // com.yandex.div.internal.viewpool.ViewPool
    /* renamed from: b */
    public <T extends View> void mo17401b(@NotNull String str, @NotNull ViewFactory<T> viewFactory, int i2) {
        this.f33924a.put(str, viewFactory);
    }
}
