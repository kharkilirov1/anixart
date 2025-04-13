package com.yandex.div.internal.util;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CompletedFuture.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/internal/util/CompletedFuture;", "T", "Ljava/util/concurrent/Future;", "utils_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class CompletedFuture<T> implements Future<T> {

    /* renamed from: b */
    public final T f33883b;

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get() {
        return this.f33883b;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get(long j2, @NotNull TimeUnit unit) {
        Intrinsics.m32179h(unit, "unit");
        return this.f33883b;
    }
}
