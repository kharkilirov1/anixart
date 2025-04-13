package com.google.common.util.concurrent;

import com.google.errorprone.annotations.DoNotMock;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

@DoNotMock
/* loaded from: classes2.dex */
public interface ListenableFuture<V> extends Future<V> {
    /* renamed from: r */
    void mo1145r(Runnable runnable, Executor executor);
}
