package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.observers.BasicFuseableObserver;

/* loaded from: classes3.dex */
public final class ObservableDoAfterNext<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class DoAfterObserver<T> extends BasicFuseableObserver<T, T> {

        /* renamed from: g */
        public final Consumer<? super T> f61597g;

        public DoAfterObserver(Observer<? super T> observer, Consumer<? super T> consumer) {
            super(observer);
            this.f61597g = null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            return m31430c(i2);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f59631b.onNext(t);
            if (this.f59635f == 0) {
                try {
                    this.f61597g.accept(t);
                } catch (Throwable th) {
                    m31429b(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T poll = this.f59633d.poll();
            if (poll != null) {
                this.f61597g.accept(poll);
            }
            return poll;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new DoAfterObserver(observer, null));
    }
}
