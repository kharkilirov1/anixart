package io.reactivex.internal.operators.single;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;

/* loaded from: classes3.dex */
public final class SingleInternalHelper {

    public enum NoSuchElementCallable implements Callable<NoSuchElementException> {
        /* JADX INFO: Fake field, exist only in values array */
        INSTANCE;

        @Override // java.util.concurrent.Callable
        public NoSuchElementException call() throws Exception {
            return new NoSuchElementException();
        }
    }

    public enum ToFlowable implements Function<SingleSource, Publisher> {
        /* JADX INFO: Fake field, exist only in values array */
        INSTANCE;

        @Override // io.reactivex.functions.Function
        public Publisher apply(SingleSource singleSource) throws Exception {
            return new SingleToFlowable(singleSource);
        }
    }

    public static final class ToFlowableIterable<T> implements Iterable<Flowable<T>> {
        @Override // java.lang.Iterable
        public Iterator<Flowable<T>> iterator() {
            throw null;
        }
    }

    public static final class ToFlowableIterator<T> implements Iterator<Flowable<T>> {

        /* renamed from: b */
        public final Iterator<? extends SingleSource<? extends T>> f62536b;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f62536b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return new SingleToFlowable(this.f62536b.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public enum ToObservable implements Function<SingleSource, Observable> {
        /* JADX INFO: Fake field, exist only in values array */
        INSTANCE;

        @Override // io.reactivex.functions.Function
        public Observable apply(SingleSource singleSource) throws Exception {
            return new SingleToObservable(singleSource);
        }
    }

    public SingleInternalHelper() {
        throw new IllegalStateException("No instances!");
    }
}
