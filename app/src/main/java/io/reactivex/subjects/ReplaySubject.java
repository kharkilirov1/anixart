package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ReplaySubject<T> extends Subject<T> {

    /* renamed from: c */
    public static final Object[] f62960c = new Object[0];

    /* renamed from: b */
    public boolean f62961b;

    public static final class Node<T> extends AtomicReference<Node<T>> {
    }

    public interface ReplayBuffer<T> {
    }

    public static final class ReplayDisposable<T> extends AtomicInteger implements Disposable {

        /* renamed from: b */
        public final Observer<? super T> f62962b;

        /* renamed from: c */
        public final ReplaySubject<T> f62963c;

        /* renamed from: d */
        public volatile boolean f62964d;

        public ReplayDisposable(Observer<? super T> observer, ReplaySubject<T> replaySubject) {
            this.f62962b = observer;
            this.f62963c = replaySubject;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f62964d) {
                return;
            }
            this.f62964d = true;
            Objects.requireNonNull(this.f62963c);
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62964d;
        }
    }

    public static final class SizeAndTimeBoundReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {
    }

    public static final class SizeBoundReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {
    }

    public static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
    }

    public static final class UnboundedReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {
    }

    @Override // io.reactivex.Observer
    /* renamed from: a */
    public void mo31373a(Disposable disposable) {
        if (this.f62961b) {
            disposable.mo31379f();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        ReplayDisposable replayDisposable = new ReplayDisposable(observer, this);
        observer.mo31373a(replayDisposable);
        if (!replayDisposable.f62964d) {
            throw null;
        }
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.f62961b) {
            return;
        }
        this.f62961b = true;
        throw null;
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        Objects.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f62961b) {
            RxJavaPlugins.m31848b(th);
        } else {
            this.f62961b = true;
            throw null;
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        Objects.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f62961b) {
            throw null;
        }
    }
}
