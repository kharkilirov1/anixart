package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.observers.BasicFuseableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ObservableDistinct<T, K> extends AbstractObservableWithUpstream<T, T> {

    public static final class DistinctObserver<T, K> extends BasicFuseableObserver<T, T> {

        /* renamed from: g */
        public final Collection<? super K> f61591g;

        /* renamed from: h */
        public final Function<? super T, K> f61592h;

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            return m31430c(i2);
        }

        @Override // io.reactivex.internal.observers.BasicFuseableObserver, io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f61591g.clear();
            super.clear();
        }

        @Override // io.reactivex.internal.observers.BasicFuseableObserver, io.reactivex.Observer
        public void onComplete() {
            if (this.f59634e) {
                return;
            }
            this.f59634e = true;
            this.f61591g.clear();
            this.f59631b.onComplete();
        }

        @Override // io.reactivex.internal.observers.BasicFuseableObserver, io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f59634e) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f59634e = true;
            this.f61591g.clear();
            this.f59631b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f59634e) {
                return;
            }
            if (this.f59635f != 0) {
                this.f59631b.onNext(null);
                return;
            }
            try {
                K apply = this.f61592h.apply(t);
                Objects.requireNonNull(apply, "The keySelector returned a null key");
                if (this.f61591g.add(apply)) {
                    this.f59631b.onNext(t);
                }
            } catch (Throwable th) {
                m31429b(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T poll;
            Collection<? super K> collection;
            K apply;
            do {
                poll = this.f59633d.poll();
                if (poll == null) {
                    break;
                }
                collection = this.f61591g;
                apply = this.f61592h.apply(poll);
                Objects.requireNonNull(apply, "The keySelector returned a null key");
            } while (!collection.add(apply));
            return poll;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            observer.mo31373a(EmptyDisposable.INSTANCE);
            observer.onError(th);
        }
    }
}
