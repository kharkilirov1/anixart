package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.observers.BasicFuseableObserver;

/* loaded from: classes3.dex */
public final class ObservableFilter<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class FilterObserver<T> extends BasicFuseableObserver<T, T> {

        /* renamed from: g */
        public final Predicate<? super T> f61635g;

        public FilterObserver(Observer<? super T> observer, Predicate<? super T> predicate) {
            super(observer);
            this.f61635g = null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            return m31430c(i2);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f59635f != 0) {
                this.f59631b.onNext(null);
                return;
            }
            try {
                if (this.f61635g.mo31407b(t)) {
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
            do {
                poll = this.f59633d.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.f61635g.mo31407b(poll));
            return poll;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new FilterObserver(observer, null));
    }
}
