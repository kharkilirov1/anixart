package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.Function;
import io.reactivex.internal.observers.BasicFuseableObserver;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ObservableMap<T, U> extends AbstractObservableWithUpstream<T, U> {

    /* renamed from: c */
    public final Function<? super T, ? extends U> f61800c;

    public static final class MapObserver<T, U> extends BasicFuseableObserver<T, U> {

        /* renamed from: g */
        public final Function<? super T, ? extends U> f61801g;

        public MapObserver(Observer<? super U> observer, Function<? super T, ? extends U> function) {
            super(observer);
            this.f61801g = function;
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
                this.f59631b.onNext(null);
                return;
            }
            try {
                U apply = this.f61801g.apply(t);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                this.f59631b.onNext(apply);
            } catch (Throwable th) {
                m31429b(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public U poll() throws Exception {
            T poll = this.f59633d.poll();
            if (poll == null) {
                return null;
            }
            U apply = this.f61801g.apply(poll);
            Objects.requireNonNull(apply, "The mapper function returned a null value.");
            return apply;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super U> observer) {
        this.f61337b.mo31364c(new MapObserver(observer, this.f61800c));
    }
}
