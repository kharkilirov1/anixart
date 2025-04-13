package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Notification;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableMaterialize<T> extends AbstractFlowableWithUpstream<T, Notification<T>> {

    public static final class MaterializeSubscriber<T> extends SinglePostCompleteSubscriber<T, Notification<T>> {
        public MaterializeSubscriber(Subscriber<? super Notification<T>> subscriber) {
            super(subscriber);
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber
        /* renamed from: c */
        public void mo31529c(Object obj) {
            Notification notification = (Notification) obj;
            if (notification.m31359d()) {
                RxJavaPlugins.m31848b(notification.m31356a());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            m31788b(Notification.f59570b);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            Objects.requireNonNull(th, "error is null");
            m31788b(new Notification(NotificationLite.m31832e(th)));
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f62754e++;
            Subscriber<? super R> subscriber = this.f62751b;
            Objects.requireNonNull(t, "value is null");
            subscriber.onNext(new Notification(t));
        }
    }

    public FlowableMaterialize(Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super Notification<T>> subscriber) {
        this.f59782c.m31349b(new MaterializeSubscriber(subscriber));
    }
}
