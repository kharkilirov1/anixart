package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.AggregateFuture;

@GwtCompatible
/* loaded from: classes2.dex */
final class CombinedFuture<V> extends AggregateFuture<Object, V> {

    /* renamed from: o */
    public CombinedFuture<V>.CombinedFutureInterruptibleTask<?> f22154o;

    public final class AsyncCallableInterruptibleTask extends CombinedFuture<V>.CombinedFutureInterruptibleTask<ListenableFuture<V>> {
        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: d */
        public Object mo12177d() throws Exception {
            throw null;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: e */
        public String mo12178e() {
            throw null;
        }
    }

    public final class CallableInterruptibleTask extends CombinedFuture<V>.CombinedFutureInterruptibleTask<V> {
        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: d */
        public V mo12177d() throws Exception {
            throw null;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: e */
        public String mo12178e() {
            throw null;
        }
    }

    public abstract class CombinedFutureInterruptibleTask<T> extends InterruptibleTask<T> {
        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: a */
        public final void mo12179a(T t, Throwable th) {
            throw null;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: c */
        public final boolean mo12180c() {
            throw null;
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    /* renamed from: j */
    public void mo12146j() {
        CombinedFuture<V>.CombinedFutureInterruptibleTask<?> combinedFutureInterruptibleTask = this.f22154o;
        if (combinedFutureInterruptibleTask != null) {
            combinedFutureInterruptibleTask.m12197b();
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    /* renamed from: t */
    public void mo12172t(AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.mo12172t(releaseResourcesReason);
        if (releaseResourcesReason == AggregateFuture.ReleaseResourcesReason.OUTPUT_FUTURE_DONE) {
            this.f22154o = null;
        }
    }
}
