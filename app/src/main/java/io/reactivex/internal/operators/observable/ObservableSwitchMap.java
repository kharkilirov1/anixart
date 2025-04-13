package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableSwitchMap<T, R> extends AbstractObservableWithUpstream<T, R> {

    public static final class SwitchMapInnerObserver<T, R> extends AtomicReference<Disposable> implements Observer<R> {

        /* renamed from: b */
        public final SwitchMapObserver<T, R> f62064b;

        /* renamed from: c */
        public final long f62065c;

        /* renamed from: d */
        public final int f62066d;

        /* renamed from: e */
        public volatile SimpleQueue<R> f62067e;

        /* renamed from: f */
        public volatile boolean f62068f;

        public SwitchMapInnerObserver(SwitchMapObserver<T, R> switchMapObserver, long j2, int i2) {
            this.f62064b = switchMapObserver;
            this.f62065c = j2;
            this.f62066d = i2;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31413e(this, disposable)) {
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int mo31420F = queueDisposable.mo31420F(7);
                    if (mo31420F == 1) {
                        this.f62067e = queueDisposable;
                        this.f62068f = true;
                        this.f62064b.m31724c();
                        return;
                    } else if (mo31420F == 2) {
                        this.f62067e = queueDisposable;
                        return;
                    }
                }
                this.f62067e = new SpscLinkedArrayQueue(this.f62066d);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f62065c == this.f62064b.f62079k) {
                this.f62068f = true;
                this.f62064b.m31724c();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            SwitchMapObserver<T, R> switchMapObserver = this.f62064b;
            Objects.requireNonNull(switchMapObserver);
            if (this.f62065c != switchMapObserver.f62079k || !ExceptionHelper.m31817a(switchMapObserver.f62074f, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            if (!switchMapObserver.f62073e) {
                switchMapObserver.f62077i.mo31379f();
            }
            this.f62068f = true;
            switchMapObserver.m31724c();
        }

        @Override // io.reactivex.Observer
        public void onNext(R r) {
            if (this.f62065c == this.f62064b.f62079k) {
                if (r != null) {
                    this.f62067e.offer(r);
                }
                this.f62064b.m31724c();
            }
        }
    }

    public static final class SwitchMapObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* renamed from: l */
        public static final SwitchMapInnerObserver<Object, Object> f62069l;

        /* renamed from: b */
        public final Observer<? super R> f62070b;

        /* renamed from: d */
        public final int f62072d;

        /* renamed from: e */
        public final boolean f62073e;

        /* renamed from: g */
        public volatile boolean f62075g;

        /* renamed from: h */
        public volatile boolean f62076h;

        /* renamed from: i */
        public Disposable f62077i;

        /* renamed from: k */
        public volatile long f62079k;

        /* renamed from: j */
        public final AtomicReference<SwitchMapInnerObserver<T, R>> f62078j = new AtomicReference<>();

        /* renamed from: c */
        public final Function<? super T, ? extends ObservableSource<? extends R>> f62071c = null;

        /* renamed from: f */
        public final AtomicThrowable f62074f = new AtomicThrowable();

        static {
            SwitchMapInnerObserver<Object, Object> switchMapInnerObserver = new SwitchMapInnerObserver<>(null, -1L, 1);
            f62069l = switchMapInnerObserver;
            DisposableHelper.m31409a(switchMapInnerObserver);
        }

        public SwitchMapObserver(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function, int i2, boolean z) {
            this.f62070b = observer;
            this.f62072d = i2;
            this.f62073e = z;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62077i, disposable)) {
                this.f62077i = disposable;
                this.f62070b.mo31373a(this);
            }
        }

        /* renamed from: b */
        public void m31723b() {
            SwitchMapInnerObserver<Object, Object> switchMapInnerObserver;
            SwitchMapInnerObserver<T, R> switchMapInnerObserver2 = this.f62078j.get();
            SwitchMapInnerObserver<Object, Object> switchMapInnerObserver3 = f62069l;
            if (switchMapInnerObserver2 == switchMapInnerObserver3 || (switchMapInnerObserver = (SwitchMapInnerObserver) this.f62078j.getAndSet(switchMapInnerObserver3)) == switchMapInnerObserver3 || switchMapInnerObserver == null) {
                return;
            }
            DisposableHelper.m31409a(switchMapInnerObserver);
        }

        /* JADX WARN: Removed duplicated region for block: B:71:0x00e9 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x000f A[SYNTHETIC] */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m31724c() {
            /*
                Method dump skipped, instructions count: 241
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapObserver.m31724c():void");
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f62076h) {
                return;
            }
            this.f62076h = true;
            this.f62077i.mo31379f();
            m31723b();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f62075g) {
                return;
            }
            this.f62075g = true;
            m31724c();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f62075g || !ExceptionHelper.m31817a(this.f62074f, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            if (!this.f62073e) {
                m31723b();
            }
            this.f62075g = true;
            m31724c();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            SwitchMapInnerObserver<T, R> switchMapInnerObserver;
            long j2 = this.f62079k + 1;
            this.f62079k = j2;
            SwitchMapInnerObserver<T, R> switchMapInnerObserver2 = this.f62078j.get();
            if (switchMapInnerObserver2 != null) {
                DisposableHelper.m31409a(switchMapInnerObserver2);
            }
            try {
                ObservableSource<? extends R> apply = this.f62071c.apply(t);
                Objects.requireNonNull(apply, "The ObservableSource returned is null");
                ObservableSource<? extends R> observableSource = apply;
                SwitchMapInnerObserver<T, R> switchMapInnerObserver3 = new SwitchMapInnerObserver<>(this, j2, this.f62072d);
                do {
                    switchMapInnerObserver = this.f62078j.get();
                    if (switchMapInnerObserver == f62069l) {
                        return;
                    }
                } while (!this.f62078j.compareAndSet(switchMapInnerObserver, switchMapInnerObserver3));
                observableSource.mo31364c(switchMapInnerObserver3);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f62077i.mo31379f();
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62076h;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super R> observer) {
        if (ObservableScalarXMap.m31717a(this.f61337b, observer, null)) {
            return;
        }
        this.f61337b.mo31364c(new SwitchMapObserver(observer, null, 0, false));
    }
}
