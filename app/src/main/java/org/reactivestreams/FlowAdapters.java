package org.reactivestreams;

import java.util.concurrent.Flow;

/* loaded from: classes3.dex */
public final class FlowAdapters {

    public static final class FlowPublisherFromReactive<T> implements Flow.Publisher<T> {
        @Override // java.util.concurrent.Flow.Publisher
        public void subscribe(Flow.Subscriber<? super T> subscriber) {
            throw null;
        }
    }

    public static final class FlowToReactiveProcessor<T, U> implements Flow.Processor<T, U> {
        @Override // java.util.concurrent.Flow.Subscriber
        public void onComplete() {
            throw null;
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onError(Throwable th) {
            throw null;
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onNext(T t) {
            throw null;
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onSubscribe(Flow.Subscription subscription) {
            throw null;
        }

        @Override // java.util.concurrent.Flow.Publisher
        public void subscribe(Flow.Subscriber<? super U> subscriber) {
            throw null;
        }
    }

    public static final class FlowToReactiveSubscriber<T> implements Flow.Subscriber<T> {

        /* renamed from: a */
        public final Subscriber<? super T> f69330a;

        @Override // java.util.concurrent.Flow.Subscriber
        public void onComplete() {
            this.f69330a.onComplete();
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onError(Throwable th) {
            this.f69330a.onError(th);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onNext(T t) {
            this.f69330a.onNext(t);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onSubscribe(Flow.Subscription subscription) {
            this.f69330a.mo31352d(subscription == null ? null : new ReactiveToFlowSubscription(subscription));
        }
    }

    public static final class FlowToReactiveSubscription implements Flow.Subscription {

        /* renamed from: a */
        public final Subscription f69331a;

        public FlowToReactiveSubscription(Subscription subscription) {
            this.f69331a = subscription;
        }

        @Override // java.util.concurrent.Flow.Subscription
        public void cancel() {
            this.f69331a.cancel();
        }

        @Override // java.util.concurrent.Flow.Subscription
        public void request(long j2) {
            this.f69331a.request(j2);
        }
    }

    public static final class ReactivePublisherFromFlow<T> implements Publisher<T> {
        @Override // org.reactivestreams.Publisher
        /* renamed from: g */
        public void mo31351g(Subscriber<? super T> subscriber) {
            throw null;
        }
    }

    public static final class ReactiveToFlowProcessor<T, U> implements Processor<T, U> {
        @Override // org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            throw null;
        }

        @Override // org.reactivestreams.Publisher
        /* renamed from: g */
        public void mo31351g(Subscriber<? super U> subscriber) {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            throw null;
        }
    }

    public static final class ReactiveToFlowSubscriber<T> implements Subscriber<T> {

        /* renamed from: b */
        public final Flow.Subscriber<? super T> f69332b;

        @Override // org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            this.f69332b.onSubscribe(subscription == null ? null : new FlowToReactiveSubscription(subscription));
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f69332b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f69332b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f69332b.onNext(t);
        }
    }

    public static final class ReactiveToFlowSubscription implements Subscription {

        /* renamed from: b */
        public final Flow.Subscription f69333b;

        public ReactiveToFlowSubscription(Flow.Subscription subscription) {
            this.f69333b = subscription;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f69333b.cancel();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f69333b.request(j2);
        }
    }

    public FlowAdapters() {
        throw new IllegalStateException("No instances!");
    }
}
