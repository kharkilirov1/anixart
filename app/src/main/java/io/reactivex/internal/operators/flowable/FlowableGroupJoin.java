package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableGroupJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractFlowableWithUpstream<TLeft, R> {

    public static final class GroupJoinSubscription<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Subscription, JoinSupport {

        /* renamed from: p */
        public static final Integer f60252p = 1;

        /* renamed from: q */
        public static final Integer f60253q = 2;

        /* renamed from: r */
        public static final Integer f60254r = 3;

        /* renamed from: s */
        public static final Integer f60255s = 4;

        /* renamed from: b */
        public final Subscriber<? super R> f60256b;

        /* renamed from: m */
        public int f60267m;

        /* renamed from: n */
        public int f60268n;

        /* renamed from: o */
        public volatile boolean f60269o;

        /* renamed from: c */
        public final AtomicLong f60257c = new AtomicLong();

        /* renamed from: e */
        public final CompositeDisposable f60259e = new CompositeDisposable();

        /* renamed from: d */
        public final SpscLinkedArrayQueue<Object> f60258d = new SpscLinkedArrayQueue<>(Flowable.f59569b);

        /* renamed from: f */
        public final Map<Integer, UnicastProcessor<TRight>> f60260f = new LinkedHashMap();

        /* renamed from: g */
        public final Map<Integer, TRight> f60261g = new LinkedHashMap();

        /* renamed from: h */
        public final AtomicReference<Throwable> f60262h = new AtomicReference<>();

        /* renamed from: i */
        public final Function<? super TLeft, ? extends Publisher<TLeftEnd>> f60263i = null;

        /* renamed from: j */
        public final Function<? super TRight, ? extends Publisher<TRightEnd>> f60264j = null;

        /* renamed from: k */
        public final BiFunction<? super TLeft, ? super Flowable<TRight>, ? extends R> f60265k = null;

        /* renamed from: l */
        public final AtomicInteger f60266l = new AtomicInteger(2);

        public GroupJoinSubscription(Subscriber<? super R> subscriber, Function<? super TLeft, ? extends Publisher<TLeftEnd>> function, Function<? super TRight, ? extends Publisher<TRightEnd>> function2, BiFunction<? super TLeft, ? super Flowable<TRight>, ? extends R> biFunction) {
            this.f60256b = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        /* renamed from: a */
        public void mo31518a(Throwable th) {
            if (ExceptionHelper.m31817a(this.f60262h, th)) {
                m31523f();
            } else {
                RxJavaPlugins.m31848b(th);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        /* renamed from: b */
        public void mo31519b(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f60262h, th)) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f60266l.decrementAndGet();
                m31523f();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        /* renamed from: c */
        public void mo31520c(boolean z, Object obj) {
            synchronized (this) {
                this.f60258d.m31765c(z ? f60252p : f60253q, obj);
            }
            m31523f();
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f60269o) {
                return;
            }
            this.f60269o = true;
            this.f60259e.mo31379f();
            if (getAndIncrement() == 0) {
                this.f60258d.clear();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        /* renamed from: d */
        public void mo31521d(boolean z, LeftRightEndSubscriber leftRightEndSubscriber) {
            synchronized (this) {
                this.f60258d.m31765c(z ? f60254r : f60255s, leftRightEndSubscriber);
            }
            m31523f();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        /* renamed from: e */
        public void mo31522e(LeftRightSubscriber leftRightSubscriber) {
            this.f60259e.mo31394c(leftRightSubscriber);
            this.f60266l.decrementAndGet();
            m31523f();
        }

        /* renamed from: f */
        public void m31523f() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.f60258d;
            Subscriber<? super R> subscriber = this.f60256b;
            int i2 = 1;
            while (!this.f60269o) {
                if (this.f60262h.get() != null) {
                    spscLinkedArrayQueue.clear();
                    this.f60259e.mo31379f();
                    m31524g(subscriber);
                    return;
                }
                boolean z = this.f60266l.get() == 0;
                Integer num = (Integer) spscLinkedArrayQueue.poll();
                boolean z2 = num == null;
                if (z && z2) {
                    Iterator<UnicastProcessor<TRight>> it = this.f60260f.values().iterator();
                    while (it.hasNext()) {
                        it.next().onComplete();
                    }
                    this.f60260f.clear();
                    this.f60261g.clear();
                    this.f60259e.mo31379f();
                    subscriber.onComplete();
                    return;
                }
                if (z2) {
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    Object poll = spscLinkedArrayQueue.poll();
                    if (num == f60252p) {
                        UnicastProcessor unicastProcessor = new UnicastProcessor(Flowable.f59569b, null, true);
                        int i3 = this.f60267m;
                        this.f60267m = i3 + 1;
                        this.f60260f.put(Integer.valueOf(i3), unicastProcessor);
                        try {
                            Publisher apply = this.f60263i.apply(poll);
                            Objects.requireNonNull(apply, "The leftEnd returned a null Publisher");
                            Publisher publisher = apply;
                            LeftRightEndSubscriber leftRightEndSubscriber = new LeftRightEndSubscriber(this, true, i3);
                            this.f60259e.mo31393b(leftRightEndSubscriber);
                            publisher.mo31351g(leftRightEndSubscriber);
                            if (this.f60262h.get() != null) {
                                spscLinkedArrayQueue.clear();
                                this.f60259e.mo31379f();
                                m31524g(subscriber);
                                return;
                            }
                            try {
                                R apply2 = this.f60265k.apply(poll, unicastProcessor);
                                Objects.requireNonNull(apply2, "The resultSelector returned a null value");
                                if (this.f60257c.get() == 0) {
                                    m31525h(new MissingBackpressureException("Could not emit value due to lack of requests"), subscriber, spscLinkedArrayQueue);
                                    return;
                                }
                                subscriber.onNext(apply2);
                                BackpressureHelper.m31812e(this.f60257c, 1L);
                                Iterator<TRight> it2 = this.f60261g.values().iterator();
                                while (it2.hasNext()) {
                                    unicastProcessor.onNext(it2.next());
                                }
                            } catch (Throwable th) {
                                m31525h(th, subscriber, spscLinkedArrayQueue);
                                return;
                            }
                        } catch (Throwable th2) {
                            m31525h(th2, subscriber, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == f60253q) {
                        int i4 = this.f60268n;
                        this.f60268n = i4 + 1;
                        this.f60261g.put(Integer.valueOf(i4), poll);
                        try {
                            Publisher apply3 = this.f60264j.apply(poll);
                            Objects.requireNonNull(apply3, "The rightEnd returned a null Publisher");
                            Publisher publisher2 = apply3;
                            LeftRightEndSubscriber leftRightEndSubscriber2 = new LeftRightEndSubscriber(this, false, i4);
                            this.f60259e.mo31393b(leftRightEndSubscriber2);
                            publisher2.mo31351g(leftRightEndSubscriber2);
                            if (this.f60262h.get() != null) {
                                spscLinkedArrayQueue.clear();
                                this.f60259e.mo31379f();
                                m31524g(subscriber);
                                return;
                            } else {
                                Iterator<UnicastProcessor<TRight>> it3 = this.f60260f.values().iterator();
                                while (it3.hasNext()) {
                                    it3.next().onNext(poll);
                                }
                            }
                        } catch (Throwable th3) {
                            m31525h(th3, subscriber, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == f60254r) {
                        LeftRightEndSubscriber leftRightEndSubscriber3 = (LeftRightEndSubscriber) poll;
                        UnicastProcessor<TRight> remove = this.f60260f.remove(Integer.valueOf(leftRightEndSubscriber3.f60272d));
                        this.f60259e.mo31392a(leftRightEndSubscriber3);
                        if (remove != null) {
                            remove.onComplete();
                        }
                    } else if (num == f60255s) {
                        LeftRightEndSubscriber leftRightEndSubscriber4 = (LeftRightEndSubscriber) poll;
                        this.f60261g.remove(Integer.valueOf(leftRightEndSubscriber4.f60272d));
                        this.f60259e.mo31392a(leftRightEndSubscriber4);
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        /* renamed from: g */
        public void m31524g(Subscriber<?> subscriber) {
            Throwable m31818b = ExceptionHelper.m31818b(this.f60262h);
            Iterator<UnicastProcessor<TRight>> it = this.f60260f.values().iterator();
            while (it.hasNext()) {
                it.next().onError(m31818b);
            }
            this.f60260f.clear();
            this.f60261g.clear();
            subscriber.onError(m31818b);
        }

        /* renamed from: h */
        public void m31525h(Throwable th, Subscriber<?> subscriber, SimpleQueue<?> simpleQueue) {
            Exceptions.m31402a(th);
            ExceptionHelper.m31817a(this.f60262h, th);
            ((SpscLinkedArrayQueue) simpleQueue).clear();
            this.f60259e.mo31379f();
            m31524g(subscriber);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f60257c, j2);
            }
        }
    }

    public interface JoinSupport {
        /* renamed from: a */
        void mo31518a(Throwable th);

        /* renamed from: b */
        void mo31519b(Throwable th);

        /* renamed from: c */
        void mo31520c(boolean z, Object obj);

        /* renamed from: d */
        void mo31521d(boolean z, LeftRightEndSubscriber leftRightEndSubscriber);

        /* renamed from: e */
        void mo31522e(LeftRightSubscriber leftRightSubscriber);
    }

    public static final class LeftRightEndSubscriber extends AtomicReference<Subscription> implements FlowableSubscriber<Object>, Disposable {

        /* renamed from: b */
        public final JoinSupport f60270b;

        /* renamed from: c */
        public final boolean f60271c;

        /* renamed from: d */
        public final int f60272d;

        public LeftRightEndSubscriber(JoinSupport joinSupport, boolean z, int i2) {
            this.f60270b = joinSupport;
            this.f60271c = z;
            this.f60272d = i2;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31802f(this, subscription, Long.MAX_VALUE);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            SubscriptionHelper.m31797a(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60270b.mo31521d(this.f60271c, this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60270b.mo31518a(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (SubscriptionHelper.m31797a(this)) {
                this.f60270b.mo31521d(this.f60271c, this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get() == SubscriptionHelper.CANCELLED;
        }
    }

    public static final class LeftRightSubscriber extends AtomicReference<Subscription> implements FlowableSubscriber<Object>, Disposable {

        /* renamed from: b */
        public final JoinSupport f60273b;

        /* renamed from: c */
        public final boolean f60274c;

        public LeftRightSubscriber(JoinSupport joinSupport, boolean z) {
            this.f60273b = joinSupport;
            this.f60274c = z;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31802f(this, subscription, Long.MAX_VALUE);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            SubscriptionHelper.m31797a(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60273b.mo31522e(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60273b.mo31519b(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f60273b.mo31520c(this.f60274c, obj);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get() == SubscriptionHelper.CANCELLED;
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
        GroupJoinSubscription groupJoinSubscription = new GroupJoinSubscription(subscriber, null, null, null);
        subscriber.mo31352d(groupJoinSubscription);
        LeftRightSubscriber leftRightSubscriber = new LeftRightSubscriber(groupJoinSubscription, true);
        groupJoinSubscription.f60259e.mo31393b(leftRightSubscriber);
        groupJoinSubscription.f60259e.mo31393b(new LeftRightSubscriber(groupJoinSubscription, false));
        this.f59782c.m31349b(leftRightSubscriber);
        throw null;
    }
}
