package io.reactivex.internal.operators.flowable;

import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableDoOnEach<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class DoOnEachConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {

        /* renamed from: g */
        public final Consumer<? super T> f60084g;

        /* renamed from: h */
        public final Consumer<? super Throwable> f60085h;

        /* renamed from: i */
        public final Action f60086i;

        /* renamed from: j */
        public final Action f60087j;

        public DoOnEachConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
            super(conditionalSubscriber);
            this.f60084g = null;
            this.f60085h = null;
            this.f60086i = null;
            this.f60087j = null;
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* renamed from: E */
        public boolean mo31428E(T t) {
            if (this.f62722e) {
                return false;
            }
            try {
                this.f60084g.accept(t);
                return this.f62719b.mo31428E(t);
            } catch (Throwable th) {
                m31776a(th);
                return false;
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            return m31777b(i2);
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f62722e) {
                return;
            }
            try {
                this.f60086i.run();
                this.f62722e = true;
                this.f62719b.onComplete();
                try {
                    this.f60087j.run();
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    RxJavaPlugins.m31848b(th);
                }
            } catch (Throwable th2) {
                m31776a(th2);
            }
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f62722e) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            boolean z = true;
            this.f62722e = true;
            try {
                this.f60085h.accept(th);
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                this.f62719b.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.f62719b.onError(th);
            }
            try {
                this.f60087j.run();
            } catch (Throwable th3) {
                Exceptions.m31402a(th3);
                RxJavaPlugins.m31848b(th3);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f62722e) {
                return;
            }
            if (this.f62723f != 0) {
                this.f62719b.onNext(null);
                return;
            }
            try {
                this.f60084g.accept(t);
                this.f62719b.onNext(t);
            } catch (Throwable th) {
                m31776a(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            try {
                T poll = this.f62721d.poll();
                if (poll != null) {
                    try {
                        this.f60084g.accept(poll);
                    } catch (Throwable th) {
                        try {
                            Exceptions.m31402a(th);
                            try {
                                this.f60085h.accept(th);
                                throw ExceptionHelper.m31819c(th);
                            } catch (Throwable th2) {
                                throw new CompositeException(th, th2);
                            }
                        } finally {
                            this.f60087j.run();
                        }
                    }
                } else if (this.f62723f == 1) {
                    this.f60086i.run();
                }
                return poll;
            } catch (Throwable th3) {
                Exceptions.m31402a(th3);
                try {
                    this.f60085h.accept(th3);
                    throw ExceptionHelper.m31819c(th3);
                } catch (Throwable th4) {
                    throw new CompositeException(th3, th4);
                }
            }
        }
    }

    public static final class DoOnEachSubscriber<T> extends BasicFuseableSubscriber<T, T> {

        /* renamed from: g */
        public final Consumer<? super T> f60088g;

        /* renamed from: h */
        public final Consumer<? super Throwable> f60089h;

        /* renamed from: i */
        public final Action f60090i;

        /* renamed from: j */
        public final Action f60091j;

        public DoOnEachSubscriber(Subscriber<? super T> subscriber, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
            super(subscriber);
            this.f60088g = null;
            this.f60089h = null;
            this.f60090i = null;
            this.f60091j = null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            return m31779b(i2);
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f62727e) {
                return;
            }
            try {
                this.f60090i.run();
                this.f62727e = true;
                this.f62724b.onComplete();
                try {
                    this.f60091j.run();
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    RxJavaPlugins.m31848b(th);
                }
            } catch (Throwable th2) {
                m31778a(th2);
            }
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f62727e) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            boolean z = true;
            this.f62727e = true;
            try {
                this.f60089h.accept(th);
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                this.f62724b.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.f62724b.onError(th);
            }
            try {
                this.f60091j.run();
            } catch (Throwable th3) {
                Exceptions.m31402a(th3);
                RxJavaPlugins.m31848b(th3);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f62727e) {
                return;
            }
            if (this.f62728f != 0) {
                this.f62724b.onNext(null);
                return;
            }
            try {
                this.f60088g.accept(t);
                this.f62724b.onNext(t);
            } catch (Throwable th) {
                m31778a(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            try {
                T poll = this.f62726d.poll();
                if (poll != null) {
                    try {
                        this.f60088g.accept(poll);
                    } catch (Throwable th) {
                        try {
                            Exceptions.m31402a(th);
                            try {
                                this.f60089h.accept(th);
                                throw ExceptionHelper.m31819c(th);
                            } catch (Throwable th2) {
                                throw new CompositeException(th, th2);
                            }
                        } finally {
                            this.f60091j.run();
                        }
                    }
                } else if (this.f62728f == 1) {
                    this.f60090i.run();
                }
                return poll;
            } catch (Throwable th3) {
                Exceptions.m31402a(th3);
                try {
                    this.f60089h.accept(th3);
                    throw ExceptionHelper.m31819c(th3);
                } catch (Throwable th4) {
                    throw new CompositeException(th3, th4);
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            this.f59782c.m31349b(new DoOnEachConditionalSubscriber((ConditionalSubscriber) subscriber, null, null, null, null));
        } else {
            this.f59782c.m31349b(new DoOnEachSubscriber(subscriber, null, null, null, null));
        }
    }
}
