package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.ObservableQueueDrain;
import io.reactivex.internal.util.QueueDrainHelper;

/* loaded from: classes3.dex */
public abstract class QueueDrainObserver<T, U, V> extends QueueDrainSubscriberPad2 implements Observer<T>, ObservableQueueDrain<U, V> {

    /* renamed from: c */
    public final Observer<? super V> f59667c;

    /* renamed from: d */
    public final SimplePlainQueue<U> f59668d;

    /* renamed from: e */
    public volatile boolean f59669e;

    /* renamed from: f */
    public volatile boolean f59670f;

    /* renamed from: g */
    public Throwable f59671g;

    public QueueDrainObserver(Observer<? super V> observer, SimplePlainQueue<U> simplePlainQueue) {
        this.f59667c = observer;
        this.f59668d = simplePlainQueue;
    }

    @Override // io.reactivex.internal.util.ObservableQueueDrain
    /* renamed from: b */
    public final boolean mo31437b() {
        return this.f59669e;
    }

    @Override // io.reactivex.internal.util.ObservableQueueDrain
    /* renamed from: c */
    public void mo31438c(Observer<? super V> observer, U u) {
    }

    @Override // io.reactivex.internal.util.ObservableQueueDrain
    /* renamed from: d */
    public final Throwable mo31439d() {
        return this.f59671g;
    }

    /* renamed from: e */
    public final boolean m31440e() {
        return this.f59672b.getAndIncrement() == 0;
    }

    /* renamed from: g */
    public final boolean m31441g() {
        return this.f59672b.get() == 0 && this.f59672b.compareAndSet(0, 1);
    }

    /* renamed from: h */
    public final void m31442h(U u, boolean z, Disposable disposable) {
        Observer<? super V> observer = this.f59667c;
        SimplePlainQueue<U> simplePlainQueue = this.f59668d;
        if (this.f59672b.get() == 0 && this.f59672b.compareAndSet(0, 1)) {
            mo31438c(observer, u);
            if (m31444j(-1) == 0) {
                return;
            }
        } else {
            simplePlainQueue.offer(u);
            if (!m31440e()) {
                return;
            }
        }
        QueueDrainHelper.m31843c(simplePlainQueue, observer, z, disposable, this);
    }

    /* renamed from: i */
    public final void m31443i(U u, boolean z, Disposable disposable) {
        Observer<? super V> observer = this.f59667c;
        SimplePlainQueue<U> simplePlainQueue = this.f59668d;
        if (this.f59672b.get() != 0 || !this.f59672b.compareAndSet(0, 1)) {
            simplePlainQueue.offer(u);
            if (!m31440e()) {
                return;
            }
        } else if (simplePlainQueue.isEmpty()) {
            mo31438c(observer, u);
            if (m31444j(-1) == 0) {
                return;
            }
        } else {
            simplePlainQueue.offer(u);
        }
        QueueDrainHelper.m31843c(simplePlainQueue, observer, z, disposable, this);
    }

    /* renamed from: j */
    public final int m31444j(int i2) {
        return this.f59672b.addAndGet(i2);
    }
}
