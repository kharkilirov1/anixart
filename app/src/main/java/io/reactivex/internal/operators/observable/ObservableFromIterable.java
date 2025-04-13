package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.observers.BasicQueueDisposable;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ObservableFromIterable<T> extends Observable<T> {

    /* renamed from: b */
    public final Iterable<? extends T> f61704b;

    public static final class FromIterableDisposable<T> extends BasicQueueDisposable<T> {

        /* renamed from: b */
        public final Observer<? super T> f61705b;

        /* renamed from: c */
        public final Iterator<? extends T> f61706c;

        /* renamed from: d */
        public volatile boolean f61707d;

        /* renamed from: e */
        public boolean f61708e;

        /* renamed from: f */
        public boolean f61709f;

        /* renamed from: g */
        public boolean f61710g;

        public FromIterableDisposable(Observer<? super T> observer, Iterator<? extends T> it) {
            this.f61705b = observer;
            this.f61706c = it;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            if ((i2 & 1) == 0) {
                return 0;
            }
            this.f61708e = true;
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f61709f = true;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61707d = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f61709f;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            if (this.f61709f) {
                return null;
            }
            if (!this.f61710g) {
                this.f61710g = true;
            } else if (!this.f61706c.hasNext()) {
                this.f61709f = true;
                return null;
            }
            T next = this.f61706c.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            return next;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61707d;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        try {
            Iterator<? extends T> it = this.f61704b.iterator();
            try {
                if (!it.hasNext()) {
                    observer.mo31373a(emptyDisposable);
                    observer.onComplete();
                    return;
                }
                FromIterableDisposable fromIterableDisposable = new FromIterableDisposable(observer, it);
                observer.mo31373a(fromIterableDisposable);
                if (fromIterableDisposable.f61708e) {
                    return;
                }
                while (!fromIterableDisposable.f61707d) {
                    try {
                        T next = fromIterableDisposable.f61706c.next();
                        Objects.requireNonNull(next, "The iterator returned a null value");
                        fromIterableDisposable.f61705b.onNext(next);
                        if (fromIterableDisposable.f61707d) {
                            return;
                        }
                        try {
                            if (!fromIterableDisposable.f61706c.hasNext()) {
                                if (fromIterableDisposable.f61707d) {
                                    return;
                                }
                                fromIterableDisposable.f61705b.onComplete();
                                return;
                            }
                        } catch (Throwable th) {
                            Exceptions.m31402a(th);
                            fromIterableDisposable.f61705b.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.m31402a(th2);
                        fromIterableDisposable.f61705b.onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.m31402a(th3);
                observer.mo31373a(emptyDisposable);
                observer.onError(th3);
            }
        } catch (Throwable th4) {
            Exceptions.m31402a(th4);
            observer.mo31373a(emptyDisposable);
            observer.onError(th4);
        }
    }
}
