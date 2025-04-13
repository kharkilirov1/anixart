package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class ObservableBuffer<T, U extends Collection<? super T>> extends AbstractObservableWithUpstream<T, U> {

    public static final class BufferExactObserver<T, U extends Collection<? super T>> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super U> f61380b;

        /* renamed from: c */
        public final int f61381c;

        /* renamed from: d */
        public final Callable<U> f61382d = null;

        /* renamed from: e */
        public U f61383e;

        /* renamed from: f */
        public int f61384f;

        /* renamed from: g */
        public Disposable f61385g;

        public BufferExactObserver(Observer<? super U> observer, int i2, Callable<U> callable) {
            this.f61380b = observer;
            this.f61381c = i2;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61385g, disposable)) {
                this.f61385g = disposable;
                this.f61380b.mo31373a(this);
            }
        }

        /* renamed from: b */
        public boolean m31649b() {
            try {
                U call = this.f61382d.call();
                Objects.requireNonNull(call, "Empty buffer supplied");
                this.f61383e = call;
                return true;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61383e = null;
                Disposable disposable = this.f61385g;
                if (disposable == null) {
                    EmptyDisposable.m31418d(th, this.f61380b);
                    return false;
                }
                disposable.mo31379f();
                this.f61380b.onError(th);
                return false;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61385g.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            U u = this.f61383e;
            if (u != null) {
                this.f61383e = null;
                if (!u.isEmpty()) {
                    this.f61380b.onNext(u);
                }
                this.f61380b.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61383e = null;
            this.f61380b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            U u = this.f61383e;
            if (u != null) {
                u.add(t);
                int i2 = this.f61384f + 1;
                this.f61384f = i2;
                if (i2 >= this.f61381c) {
                    this.f61380b.onNext(u);
                    this.f61384f = 0;
                    m31649b();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61385g.mo31380s();
        }
    }

    public static final class BufferSkipObserver<T, U extends Collection<? super T>> extends AtomicBoolean implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super U> f61386b;

        /* renamed from: c */
        public final int f61387c;

        /* renamed from: d */
        public final int f61388d;

        /* renamed from: e */
        public final Callable<U> f61389e;

        /* renamed from: f */
        public Disposable f61390f;

        /* renamed from: g */
        public final ArrayDeque<U> f61391g;

        /* renamed from: h */
        public long f61392h;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61390f, disposable)) {
                this.f61390f = disposable;
                this.f61386b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61390f.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            while (!this.f61391g.isEmpty()) {
                this.f61386b.onNext(this.f61391g.poll());
            }
            this.f61386b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61391g.clear();
            this.f61386b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            long j2 = this.f61392h;
            this.f61392h = 1 + j2;
            if (j2 % this.f61388d == 0) {
                try {
                    U call = this.f61389e.call();
                    Objects.requireNonNull(call, "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                    this.f61391g.offer(call);
                } catch (Throwable th) {
                    this.f61391g.clear();
                    this.f61390f.mo31379f();
                    this.f61386b.onError(th);
                    return;
                }
            }
            Iterator<U> it = this.f61391g.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t);
                if (this.f61387c <= next.size()) {
                    it.remove();
                    this.f61386b.onNext(next);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61390f.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super U> observer) {
        BufferExactObserver bufferExactObserver = new BufferExactObserver(observer, 0, null);
        if (bufferExactObserver.m31649b()) {
            this.f61337b.mo31364c(bufferExactObserver);
        }
    }
}
