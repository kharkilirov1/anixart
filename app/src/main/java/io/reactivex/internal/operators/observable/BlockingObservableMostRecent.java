package io.reactivex.internal.operators.observable;

import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.DefaultObserver;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class BlockingObservableMostRecent<T> implements Iterable<T> {

    public static final class MostRecentObserver<T> extends DefaultObserver<T> {

        /* renamed from: c */
        public volatile Object f61346c;

        public final class Iterator implements java.util.Iterator<T> {

            /* renamed from: b */
            public Object f61347b;

            /* renamed from: c */
            public final /* synthetic */ MostRecentObserver f61348c;

            @Override // java.util.Iterator
            public boolean hasNext() {
                this.f61347b = this.f61348c.f61346c;
                return !NotificationLite.m31834h(r0);
            }

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.f61347b == null) {
                        this.f61347b = this.f61348c.f61346c;
                    }
                    if (NotificationLite.m31834h(this.f61347b)) {
                        throw new NoSuchElementException();
                    }
                    if (NotificationLite.m31835i(this.f61347b)) {
                        throw ExceptionHelper.m31821e(NotificationLite.m31833f(this.f61347b));
                    }
                    return (T) this.f61347b;
                } finally {
                    this.f61347b = null;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61346c = NotificationLite.COMPLETE;
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61346c = NotificationLite.m31832e(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f61346c = t;
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        throw null;
    }
}
