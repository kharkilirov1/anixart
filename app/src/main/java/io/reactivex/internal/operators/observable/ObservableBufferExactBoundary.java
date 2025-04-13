package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.observers.SerializedObserver;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class ObservableBufferExactBoundary<T, U extends Collection<? super T>, B> extends AbstractObservableWithUpstream<T, U> {

    public static final class BufferBoundaryObserver<T, U extends Collection<? super T>, B> extends DisposableObserver<B> {

        /* renamed from: c */
        public final BufferExactBoundaryObserver<T, U, B> f61415c;

        public BufferBoundaryObserver(BufferExactBoundaryObserver<T, U, B> bufferExactBoundaryObserver) {
            this.f61415c = bufferExactBoundaryObserver;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61415c.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            BufferExactBoundaryObserver<T, U, B> bufferExactBoundaryObserver = this.f61415c;
            bufferExactBoundaryObserver.mo31379f();
            bufferExactBoundaryObserver.f59667c.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(B b) {
            BufferExactBoundaryObserver<T, U, B> bufferExactBoundaryObserver = this.f61415c;
            Objects.requireNonNull(bufferExactBoundaryObserver);
            try {
                U call = bufferExactBoundaryObserver.f61416h.call();
                Objects.requireNonNull(call, "The buffer supplied is null");
                U u = call;
                synchronized (bufferExactBoundaryObserver) {
                    U u2 = bufferExactBoundaryObserver.f61420l;
                    if (u2 != null) {
                        bufferExactBoundaryObserver.f61420l = u;
                        bufferExactBoundaryObserver.m31442h(u2, false, bufferExactBoundaryObserver);
                    }
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                bufferExactBoundaryObserver.mo31379f();
                bufferExactBoundaryObserver.f59667c.onError(th);
            }
        }
    }

    public static final class BufferExactBoundaryObserver<T, U extends Collection<? super T>, B> extends QueueDrainObserver<T, U, U> implements Disposable {

        /* renamed from: h */
        public final Callable<U> f61416h;

        /* renamed from: i */
        public final ObservableSource<B> f61417i;

        /* renamed from: j */
        public Disposable f61418j;

        /* renamed from: k */
        public Disposable f61419k;

        /* renamed from: l */
        public U f61420l;

        public BufferExactBoundaryObserver(Observer<? super U> observer, Callable<U> callable, ObservableSource<B> observableSource) {
            super(observer, new MpscLinkedQueue());
            this.f61416h = null;
            this.f61417i = null;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61418j, disposable)) {
                this.f61418j = disposable;
                try {
                    U call = this.f61416h.call();
                    Objects.requireNonNull(call, "The buffer supplied is null");
                    this.f61420l = call;
                    BufferBoundaryObserver bufferBoundaryObserver = new BufferBoundaryObserver(this);
                    this.f61419k = bufferBoundaryObserver;
                    this.f59667c.mo31373a(this);
                    if (this.f59669e) {
                        return;
                    }
                    this.f61417i.mo31364c(bufferBoundaryObserver);
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    this.f59669e = true;
                    disposable.mo31379f();
                    EmptyDisposable.m31418d(th, this.f59667c);
                }
            }
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        /* renamed from: c */
        public void mo31438c(Observer observer, Object obj) {
            this.f59667c.onNext((Collection) obj);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f59669e) {
                return;
            }
            this.f59669e = true;
            this.f61419k.mo31379f();
            this.f61418j.mo31379f();
            if (m31440e()) {
                this.f59668d.clear();
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            synchronized (this) {
                U u = this.f61420l;
                if (u == null) {
                    return;
                }
                this.f61420l = null;
                this.f59668d.offer(u);
                this.f59670f = true;
                if (m31440e()) {
                    QueueDrainHelper.m31843c(this.f59668d, this.f59667c, false, this, this);
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            mo31379f();
            this.f59667c.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            synchronized (this) {
                U u = this.f61420l;
                if (u == null) {
                    return;
                }
                u.add(t);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f59669e;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super U> observer) {
        this.f61337b.mo31364c(new BufferExactBoundaryObserver(new SerializedObserver(observer), null, null));
    }
}
