package io.reactivex.internal.operators.flowable;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.operators.flowable.FlowableSequenceEqual;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class FlowableSequenceEqualSingle<T> extends Single<Boolean> implements FuseToFlowable<Boolean> {

    public static final class EqualCoordinator<T> extends AtomicInteger implements Disposable, FlowableSequenceEqual.EqualCoordinatorHelper {

        /* renamed from: b */
        public final SingleObserver<? super Boolean> f60603b;

        /* renamed from: d */
        public final FlowableSequenceEqual.EqualSubscriber<T> f60605d;

        /* renamed from: e */
        public final FlowableSequenceEqual.EqualSubscriber<T> f60606e;

        /* renamed from: g */
        public T f60608g;

        /* renamed from: h */
        public T f60609h;

        /* renamed from: c */
        public final BiPredicate<? super T, ? super T> f60604c = null;

        /* renamed from: f */
        public final AtomicThrowable f60607f = new AtomicThrowable();

        public EqualCoordinator(SingleObserver<? super Boolean> singleObserver, int i2, BiPredicate<? super T, ? super T> biPredicate) {
            this.f60603b = singleObserver;
            this.f60605d = new FlowableSequenceEqual.EqualSubscriber<>(this, i2);
            this.f60606e = new FlowableSequenceEqual.EqualSubscriber<>(this, i2);
        }

        /* renamed from: a */
        public void m31585a() {
            SubscriptionHelper.m31797a(this.f60605d);
            this.f60605d.m31583a();
            SubscriptionHelper.m31797a(this.f60606e);
            this.f60606e.m31583a();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        /* renamed from: b */
        public void mo31580b(Throwable th) {
            if (ExceptionHelper.m31817a(this.f60607f, th)) {
                mo31581c();
            } else {
                RxJavaPlugins.m31848b(th);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        /* renamed from: c */
        public void mo31581c() {
            if (getAndIncrement() != 0) {
                return;
            }
            int i2 = 1;
            do {
                SimpleQueue<T> simpleQueue = this.f60605d.f60600f;
                SimpleQueue<T> simpleQueue2 = this.f60606e.f60600f;
                if (simpleQueue != null && simpleQueue2 != null) {
                    while (!mo31380s()) {
                        if (this.f60607f.get() != null) {
                            m31585a();
                            this.f60603b.onError(ExceptionHelper.m31818b(this.f60607f));
                            return;
                        }
                        boolean z = this.f60605d.f60601g;
                        T t = this.f60608g;
                        if (t == null) {
                            try {
                                t = simpleQueue.poll();
                                this.f60608g = t;
                            } catch (Throwable th) {
                                Exceptions.m31402a(th);
                                m31585a();
                                ExceptionHelper.m31817a(this.f60607f, th);
                                this.f60603b.onError(ExceptionHelper.m31818b(this.f60607f));
                                return;
                            }
                        }
                        boolean z2 = t == null;
                        boolean z3 = this.f60606e.f60601g;
                        T t2 = this.f60609h;
                        if (t2 == null) {
                            try {
                                t2 = simpleQueue2.poll();
                                this.f60609h = t2;
                            } catch (Throwable th2) {
                                Exceptions.m31402a(th2);
                                m31585a();
                                ExceptionHelper.m31817a(this.f60607f, th2);
                                this.f60603b.onError(ExceptionHelper.m31818b(this.f60607f));
                                return;
                            }
                        }
                        boolean z4 = t2 == null;
                        if (z && z3 && z2 && z4) {
                            this.f60603b.onSuccess(Boolean.TRUE);
                            return;
                        }
                        if (z && z3 && z2 != z4) {
                            m31585a();
                            this.f60603b.onSuccess(Boolean.FALSE);
                            return;
                        }
                        if (!z2 && !z4) {
                            try {
                                if (!this.f60604c.mo31404a(t, t2)) {
                                    m31585a();
                                    this.f60603b.onSuccess(Boolean.FALSE);
                                    return;
                                } else {
                                    this.f60608g = null;
                                    this.f60609h = null;
                                    this.f60605d.m31584b();
                                    this.f60606e.m31584b();
                                }
                            } catch (Throwable th3) {
                                Exceptions.m31402a(th3);
                                m31585a();
                                ExceptionHelper.m31817a(this.f60607f, th3);
                                this.f60603b.onError(ExceptionHelper.m31818b(this.f60607f));
                                return;
                            }
                        }
                    }
                    this.f60605d.m31583a();
                    this.f60606e.m31583a();
                    return;
                }
                if (mo31380s()) {
                    this.f60605d.m31583a();
                    this.f60606e.m31583a();
                    return;
                } else if (this.f60607f.get() != null) {
                    m31585a();
                    this.f60603b.onError(ExceptionHelper.m31818b(this.f60607f));
                    return;
                }
                i2 = addAndGet(-i2);
            } while (i2 != 0);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            SubscriptionHelper.m31797a(this.f60605d);
            SubscriptionHelper.m31797a(this.f60606e);
            if (getAndIncrement() == 0) {
                this.f60605d.m31583a();
                this.f60606e.m31583a();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f60605d.get() == SubscriptionHelper.CANCELLED;
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super Boolean> singleObserver) {
        singleObserver.mo31388a(new EqualCoordinator(singleObserver, 0, null));
        throw null;
    }
}
