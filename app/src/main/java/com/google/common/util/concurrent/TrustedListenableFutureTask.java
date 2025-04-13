package com.google.common.util.concurrent;

import androidx.room.util.C0576a;
import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.FluentFuture;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

@GwtCompatible
/* loaded from: classes2.dex */
class TrustedListenableFutureTask<V> extends FluentFuture.TrustedFuture<V> implements RunnableFuture<V> {

    /* renamed from: i */
    public volatile InterruptibleTask<?> f22246i;

    public final class TrustedFutureInterruptibleAsyncTask extends InterruptibleTask<ListenableFuture<V>> {
        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: a */
        public void mo12179a(Object obj, Throwable th) {
            Objects.requireNonNull(th);
            throw null;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: c */
        public final boolean mo12180c() {
            throw null;
        }

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

    public final class TrustedFutureInterruptibleTask extends InterruptibleTask<V> {

        /* renamed from: e */
        public final Callable<V> f22247e;

        public TrustedFutureInterruptibleTask(Callable<V> callable) {
            Objects.requireNonNull(callable);
            this.f22247e = callable;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: a */
        public void mo12179a(V v, Throwable th) {
            if (th == null) {
                TrustedListenableFutureTask.this.mo12149n(v);
            } else {
                TrustedListenableFutureTask.this.mo12150o(th);
            }
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: c */
        public final boolean mo12180c() {
            return TrustedListenableFutureTask.this.isDone();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: d */
        public V mo12177d() throws Exception {
            return this.f22247e.call();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* renamed from: e */
        public String mo12178e() {
            return this.f22247e.toString();
        }
    }

    public TrustedListenableFutureTask(Callable<V> callable) {
        this.f22246i = new TrustedFutureInterruptibleTask(callable);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    /* renamed from: c */
    public void mo12134c() {
        InterruptibleTask<?> interruptibleTask;
        if (m12152q() && (interruptibleTask = this.f22246i) != null) {
            interruptibleTask.m12197b();
        }
        this.f22246i = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    /* renamed from: l */
    public String mo12135l() {
        InterruptibleTask<?> interruptibleTask = this.f22246i;
        if (interruptibleTask == null) {
            return super.mo12135l();
        }
        String valueOf = String.valueOf(interruptibleTask);
        return C0576a.m4115n(valueOf.length() + 7, "task=[", valueOf, "]");
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        InterruptibleTask<?> interruptibleTask = this.f22246i;
        if (interruptibleTask != null) {
            interruptibleTask.run();
        }
        this.f22246i = null;
    }
}
