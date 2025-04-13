package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.subscribers.DefaultSubscriber;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class BlockingFlowableMostRecent<T> implements Iterable<T> {

    public static final class MostRecentSubscriber<T> extends DefaultSubscriber<T> {

        /* renamed from: c */
        public volatile Object f59794c;

        public final class Iterator implements java.util.Iterator<T> {

            /* renamed from: b */
            public Object f59795b;

            /* renamed from: c */
            public final /* synthetic */ MostRecentSubscriber f59796c;

            @Override // java.util.Iterator
            public boolean hasNext() {
                this.f59795b = this.f59796c.f59794c;
                return !NotificationLite.m31834h(r0);
            }

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.f59795b == null) {
                        this.f59795b = this.f59796c.f59794c;
                    }
                    if (NotificationLite.m31834h(this.f59795b)) {
                        throw new NoSuchElementException();
                    }
                    if (NotificationLite.m31835i(this.f59795b)) {
                        throw ExceptionHelper.m31821e(NotificationLite.m31833f(this.f59795b));
                    }
                    return (T) this.f59795b;
                } finally {
                    this.f59795b = null;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f59794c = NotificationLite.COMPLETE;
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f59794c = NotificationLite.m31832e(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f59794c = t;
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        throw null;
    }
}
