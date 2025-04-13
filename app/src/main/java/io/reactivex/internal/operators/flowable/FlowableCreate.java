package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableCreate<T> extends Flowable<T> {

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$1 */
    public static /* synthetic */ class C65111 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60006a;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            f60006a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60006a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60006a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60006a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static abstract class BaseEmitter<T> extends AtomicLong implements FlowableEmitter<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60007b;

        /* renamed from: c */
        public final SequentialDisposable f60008c;

        /* renamed from: a */
        public void m31475a() {
            if (isCancelled()) {
                return;
            }
            try {
                this.f60007b.onComplete();
            } finally {
                DisposableHelper.m31409a(this.f60008c);
            }
        }

        /* renamed from: b */
        public boolean m31476b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isCancelled()) {
                return false;
            }
            try {
                this.f60007b.onError(th);
                DisposableHelper.m31409a(this.f60008c);
                return true;
            } catch (Throwable th2) {
                DisposableHelper.m31409a(this.f60008c);
                throw th2;
            }
        }

        /* renamed from: c */
        public final void m31477c(Throwable th) {
            if (mo31480f(th)) {
                return;
            }
            RxJavaPlugins.m31848b(th);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            DisposableHelper.m31409a(this.f60008c);
            mo31479e();
        }

        /* renamed from: d */
        public void mo31478d() {
        }

        /* renamed from: e */
        public void mo31479e() {
        }

        /* renamed from: f */
        public boolean mo31480f(Throwable th) {
            return m31476b(th);
        }

        @Override // io.reactivex.FlowableEmitter
        public final boolean isCancelled() {
            return this.f60008c.mo31380s();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this, j2);
                mo31478d();
            }
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }

    public static final class BufferAsyncEmitter<T> extends BaseEmitter<T> {

        /* renamed from: d */
        public final SpscLinkedArrayQueue<T> f60009d;

        /* renamed from: e */
        public Throwable f60010e;

        /* renamed from: f */
        public volatile boolean f60011f;

        /* renamed from: g */
        public final AtomicInteger f60012g;

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        /* renamed from: d */
        public void mo31478d() {
            m31481g();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        /* renamed from: e */
        public void mo31479e() {
            if (this.f60012g.getAndIncrement() == 0) {
                this.f60009d.clear();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        /* renamed from: f */
        public boolean mo31480f(Throwable th) {
            if (this.f60011f || isCancelled()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f60010e = th;
            this.f60011f = true;
            m31481g();
            return true;
        }

        /* renamed from: g */
        public void m31481g() {
            if (this.f60012g.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = this.f60007b;
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.f60009d;
            int i2 = 1;
            do {
                long j2 = get();
                long j3 = 0;
                while (j3 != j2) {
                    if (isCancelled()) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    boolean z = this.f60011f;
                    T poll = spscLinkedArrayQueue.poll();
                    boolean z2 = poll == null;
                    if (z && z2) {
                        Throwable th = this.f60010e;
                        if (th != null) {
                            m31476b(th);
                            return;
                        } else {
                            m31475a();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext(poll);
                    j3++;
                }
                if (j3 == j2) {
                    if (isCancelled()) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    boolean z3 = this.f60011f;
                    boolean isEmpty = spscLinkedArrayQueue.isEmpty();
                    if (z3 && isEmpty) {
                        Throwable th2 = this.f60010e;
                        if (th2 != null) {
                            m31476b(th2);
                            return;
                        } else {
                            m31475a();
                            return;
                        }
                    }
                }
                if (j3 != 0) {
                    BackpressureHelper.m31812e(this, j3);
                }
                i2 = this.f60012g.addAndGet(-i2);
            } while (i2 != 0);
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t) {
            if (this.f60011f || isCancelled()) {
                return;
            }
            this.f60009d.offer(t);
            m31481g();
        }
    }

    public static final class DropAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        /* renamed from: g */
        public void mo31482g() {
        }
    }

    public static final class ErrorAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        /* renamed from: g */
        public void mo31482g() {
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("create: could not emit value due to lack of requests");
            if (mo31480f(missingBackpressureException)) {
                return;
            }
            RxJavaPlugins.m31848b(missingBackpressureException);
        }
    }

    public static final class LatestAsyncEmitter<T> extends BaseEmitter<T> {

        /* renamed from: d */
        public final AtomicReference<T> f60013d;

        /* renamed from: e */
        public Throwable f60014e;

        /* renamed from: f */
        public volatile boolean f60015f;

        /* renamed from: g */
        public final AtomicInteger f60016g;

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        /* renamed from: d */
        public void mo31478d() {
            m31483g();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        /* renamed from: e */
        public void mo31479e() {
            if (this.f60016g.getAndIncrement() == 0) {
                this.f60013d.lazySet(null);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        /* renamed from: f */
        public boolean mo31480f(Throwable th) {
            if (this.f60015f || isCancelled()) {
                return false;
            }
            if (th == null) {
                m31477c(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.f60014e = th;
            this.f60015f = true;
            m31483g();
            return true;
        }

        /* renamed from: g */
        public void m31483g() {
            if (this.f60016g.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = this.f60007b;
            AtomicReference<T> atomicReference = this.f60013d;
            int i2 = 1;
            do {
                long j2 = get();
                long j3 = 0;
                while (true) {
                    if (j3 == j2) {
                        break;
                    }
                    if (isCancelled()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z = this.f60015f;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z2 = andSet == null;
                    if (z && z2) {
                        Throwable th = this.f60014e;
                        if (th != null) {
                            m31476b(th);
                            return;
                        } else {
                            m31475a();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext(andSet);
                    j3++;
                }
                if (j3 == j2) {
                    if (isCancelled()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z3 = this.f60015f;
                    boolean z4 = atomicReference.get() == null;
                    if (z3 && z4) {
                        Throwable th2 = this.f60014e;
                        if (th2 != null) {
                            m31476b(th2);
                            return;
                        } else {
                            m31475a();
                            return;
                        }
                    }
                }
                if (j3 != 0) {
                    BackpressureHelper.m31812e(this, j3);
                }
                i2 = this.f60016g.addAndGet(-i2);
            } while (i2 != 0);
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t) {
            if (this.f60015f || isCancelled()) {
                return;
            }
            this.f60013d.set(t);
            m31483g();
        }
    }

    public static final class MissingEmitter<T> extends BaseEmitter<T> {
        @Override // io.reactivex.Emitter
        public void onNext(T t) {
            long j2;
            if (isCancelled()) {
                return;
            }
            this.f60007b.onNext(t);
            do {
                j2 = get();
                if (j2 == 0) {
                    return;
                }
            } while (!compareAndSet(j2, j2 - 1));
        }
    }

    public static abstract class NoOverflowBaseAsyncEmitter<T> extends BaseEmitter<T> {
        /* renamed from: g */
        public abstract void mo31482g();

        @Override // io.reactivex.Emitter
        public final void onNext(T t) {
            if (isCancelled()) {
                return;
            }
            if (get() == 0) {
                mo31482g();
            } else {
                this.f60007b.onNext(t);
                BackpressureHelper.m31812e(this, 1L);
            }
        }
    }

    public static final class SerializedEmitter<T> extends AtomicInteger implements FlowableEmitter<T> {
        @Override // io.reactivex.FlowableEmitter
        public boolean isCancelled() {
            throw null;
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t) {
            throw null;
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public String toString() {
            throw null;
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        throw null;
    }
}
