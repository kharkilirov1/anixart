package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;
import io.reactivex.internal.observers.BasicFuseableObserver;

/* loaded from: classes3.dex */
public final class ObservableDistinctUntilChanged<T, K> extends AbstractObservableWithUpstream<T, T> {

    public static final class DistinctUntilChangedObserver<T, K> extends BasicFuseableObserver<T, T> {

        /* renamed from: g */
        public final Function<? super T, K> f61593g;

        /* renamed from: h */
        public final BiPredicate<? super K, ? super K> f61594h;

        /* renamed from: i */
        public K f61595i;

        /* renamed from: j */
        public boolean f61596j;

        public DistinctUntilChangedObserver(Observer<? super T> observer, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
            super(observer);
            this.f61593g = null;
            this.f61594h = null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            return m31430c(i2);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f59634e) {
                return;
            }
            if (this.f59635f != 0) {
                this.f59631b.onNext(t);
                return;
            }
            try {
                K apply = this.f61593g.apply(t);
                if (this.f61596j) {
                    boolean mo31404a = this.f61594h.mo31404a(this.f61595i, apply);
                    this.f61595i = apply;
                    if (mo31404a) {
                        return;
                    }
                } else {
                    this.f61596j = true;
                    this.f61595i = apply;
                }
                this.f59631b.onNext(t);
            } catch (Throwable th) {
                m31429b(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            while (true) {
                T poll = this.f59633d.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f61593g.apply(poll);
                if (!this.f61596j) {
                    this.f61596j = true;
                    this.f61595i = apply;
                    return poll;
                }
                if (!this.f61594h.mo31404a(this.f61595i, apply)) {
                    this.f61595i = apply;
                    return poll;
                }
                this.f61595i = apply;
            }
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new DistinctUntilChangedObserver(observer, null, null));
    }
}
