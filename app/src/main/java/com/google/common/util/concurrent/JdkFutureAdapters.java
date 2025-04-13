package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Beta
@GwtIncompatible
/* loaded from: classes2.dex */
public final class JdkFutureAdapters {

    public static class ListenableFutureAdapter<V> extends ForwardingFuture<V> implements ListenableFuture<V> {

        /* renamed from: b */
        public static final Executor f22195b;

        /* renamed from: com.google.common.util.concurrent.JdkFutureAdapters$ListenableFutureAdapter$1 */
        public class RunnableC20121 implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ ListenableFutureAdapter f22196b;

            @Override // java.lang.Runnable
            public void run() {
                try {
                    ListenableFutureAdapter listenableFutureAdapter = this.f22196b;
                    Executor executor = ListenableFutureAdapter.f22195b;
                    Objects.requireNonNull(listenableFutureAdapter);
                    Uninterruptibles.m12209a(null);
                } catch (Throwable unused) {
                }
                ListenableFutureAdapter listenableFutureAdapter2 = this.f22196b;
                Executor executor2 = ListenableFutureAdapter.f22195b;
                Objects.requireNonNull(listenableFutureAdapter2);
                throw null;
            }
        }

        static {
            ThreadFactoryBuilder threadFactoryBuilder = new ThreadFactoryBuilder();
            threadFactoryBuilder.f22238b = Boolean.TRUE;
            String.format(Locale.ROOT, "ListenableFutureAdapter-thread-%d", 0);
            threadFactoryBuilder.f22237a = "ListenableFutureAdapter-thread-%d";
            f22195b = Executors.newCachedThreadPool(threadFactoryBuilder.m12208a());
        }

        @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public /* bridge */ /* synthetic */ Object mo7455G() {
            return null;
        }

        @Override // com.google.common.util.concurrent.ForwardingFuture
        /* renamed from: H */
        public Future<V> mo7455G() {
            return null;
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        /* renamed from: r */
        public void mo1145r(Runnable runnable, Executor executor) {
            throw null;
        }
    }
}
