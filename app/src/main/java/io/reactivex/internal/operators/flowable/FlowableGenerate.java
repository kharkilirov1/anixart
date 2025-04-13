package io.reactivex.internal.operators.flowable;

import io.reactivex.Emitter;
import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableGenerate<T, S> extends Flowable<T> {

    public static final class GeneratorSubscription<T, S> extends AtomicLong implements Emitter<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60214b;

        /* renamed from: c */
        public final BiFunction<S, ? super Emitter<T>, S> f60215c;

        /* renamed from: d */
        public final Consumer<? super S> f60216d;

        /* renamed from: e */
        public S f60217e;

        /* renamed from: f */
        public volatile boolean f60218f;

        /* renamed from: g */
        public boolean f60219g;

        /* renamed from: a */
        public final void m31511a(S s) {
            try {
                this.f60216d.accept(s);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                RxJavaPlugins.m31848b(th);
            }
        }

        /* renamed from: b */
        public void m31512b(Throwable th) {
            if (this.f60219g) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f60219g = true;
                this.f60214b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f60218f) {
                return;
            }
            this.f60218f = true;
            if (BackpressureHelper.m31808a(this, 1L) == 0) {
                S s = this.f60217e;
                this.f60217e = null;
                m31511a(s);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
        
            r9.f60217e = r0;
            r10 = addAndGet(-r4);
         */
        @Override // org.reactivestreams.Subscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void request(long r10) {
            /*
                r9 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.m31803h(r10)
                if (r0 != 0) goto L7
                return
            L7:
                long r0 = io.reactivex.internal.util.BackpressureHelper.m31808a(r9, r10)
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L12
                return
            L12:
                S r0 = r9.f60217e
                io.reactivex.functions.BiFunction<S, ? super io.reactivex.Emitter<T>, S> r1 = r9.f60215c
            L16:
                r4 = r2
            L17:
                int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r6 == 0) goto L4a
                boolean r6 = r9.f60218f
                r7 = 0
                if (r6 == 0) goto L26
                r9.f60217e = r7
                r9.m31511a(r0)
                return
            L26:
                r6 = 1
                java.lang.Object r0 = r1.apply(r0, r9)     // Catch: java.lang.Throwable -> L3b
                boolean r8 = r9.f60219g
                if (r8 == 0) goto L37
                r9.f60218f = r6
                r9.f60217e = r7
                r9.m31511a(r0)
                return
            L37:
                r6 = 1
                long r4 = r4 + r6
                goto L17
            L3b:
                r10 = move-exception
                io.reactivex.exceptions.Exceptions.m31402a(r10)
                r9.f60218f = r6
                r9.f60217e = r7
                r9.m31512b(r10)
                r9.m31511a(r0)
                return
            L4a:
                long r10 = r9.get()
                int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r6 != 0) goto L17
                r9.f60217e = r0
                long r10 = -r4
                long r10 = r9.addAndGet(r10)
                int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r4 != 0) goto L16
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableGenerate.GeneratorSubscription.request(long):void");
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            subscriber.mo31352d(EmptySubscription.INSTANCE);
            subscriber.onError(th);
        }
    }
}
