package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Notification;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableDematerialize<T, R> extends AbstractFlowableWithUpstream<T, R> {

    public static final class DematerializeSubscriber<T, R> implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super R> f60056b;

        /* renamed from: c */
        public final Function<? super T, ? extends Notification<R>> f60057c = null;

        /* renamed from: d */
        public boolean f60058d;

        /* renamed from: e */
        public Subscription f60059e;

        public DematerializeSubscriber(Subscriber<? super R> subscriber, Function<? super T, ? extends Notification<R>> function) {
            this.f60056b = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60059e.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60059e, subscription)) {
                this.f60059e = subscription;
                this.f60056b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60058d) {
                return;
            }
            this.f60058d = true;
            this.f60056b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60058d) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f60058d = true;
                this.f60056b.onError(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60058d) {
                if (t instanceof Notification) {
                    Notification notification = (Notification) t;
                    if (notification.m31359d()) {
                        RxJavaPlugins.m31848b(notification.m31356a());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                Notification<R> apply = this.f60057c.apply(t);
                Objects.requireNonNull(apply, "The selector returned a null Notification");
                Notification<R> notification2 = apply;
                if (notification2.m31359d()) {
                    this.f60059e.cancel();
                    onError(notification2.m31356a());
                } else if (!notification2.m31358c()) {
                    this.f60056b.onNext(notification2.m31357b());
                } else {
                    this.f60059e.cancel();
                    onComplete();
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f60059e.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f60059e.request(j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
        this.f59782c.m31349b(new DematerializeSubscriber(subscriber, null));
    }
}
