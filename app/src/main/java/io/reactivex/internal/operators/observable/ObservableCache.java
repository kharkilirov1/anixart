package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class ObservableCache<T> extends AbstractObservableWithUpstream<T, T> implements Observer<T> {

    /* renamed from: c */
    public volatile long f61450c;

    /* renamed from: d */
    public Node<T> f61451d;

    /* renamed from: e */
    public int f61452e;

    /* renamed from: f */
    public Throwable f61453f;

    /* renamed from: g */
    public volatile boolean f61454g;

    public static final class CacheDisposable<T> extends AtomicInteger implements Disposable {

        /* renamed from: b */
        public final Observer<? super T> f61455b;

        /* renamed from: c */
        public final ObservableCache<T> f61456c;

        /* renamed from: d */
        public Node<T> f61457d = null;

        /* renamed from: e */
        public volatile boolean f61458e;

        public CacheDisposable(Observer<? super T> observer, ObservableCache<T> observableCache) {
            this.f61455b = observer;
            this.f61456c = observableCache;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f61458e) {
                return;
            }
            this.f61458e = true;
            Objects.requireNonNull(this.f61456c);
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61458e;
        }
    }

    public static final class Node<T> {

        /* renamed from: a */
        public final T[] f61459a;

        /* renamed from: b */
        public volatile Node<T> f61460b;

        public Node(int i2) {
            this.f61459a = (T[]) new Object[i2];
        }
    }

    @Override // io.reactivex.Observer
    /* renamed from: a */
    public void mo31373a(Disposable disposable) {
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        observer.mo31373a(new CacheDisposable(observer, this));
        throw null;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        this.f61454g = true;
        throw null;
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        this.f61453f = th;
        this.f61454g = true;
        throw null;
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        int i2 = this.f61452e;
        if (i2 == 0) {
            Node<T> node = new Node<>(i2);
            node.f61459a[0] = t;
            this.f61452e = 1;
            this.f61451d.f61460b = node;
            this.f61451d = node;
        } else {
            this.f61451d.f61459a[i2] = t;
            this.f61452e = i2 + 1;
        }
        this.f61450c++;
        throw null;
    }
}
