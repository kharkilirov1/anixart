package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class QueueDrainHelper {
    public QueueDrainHelper() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static <T, U> boolean m31841a(boolean z, boolean z2, Observer<?> observer, boolean z3, SimpleQueue<?> simpleQueue, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        if (observableQueueDrain.mo31437b()) {
            simpleQueue.clear();
            disposable.mo31379f();
            return true;
        }
        if (!z) {
            return false;
        }
        if (z3) {
            if (!z2) {
                return false;
            }
            if (disposable != null) {
                disposable.mo31379f();
            }
            Throwable mo31439d = observableQueueDrain.mo31439d();
            if (mo31439d != null) {
                observer.onError(mo31439d);
            } else {
                observer.onComplete();
            }
            return true;
        }
        Throwable mo31439d2 = observableQueueDrain.mo31439d();
        if (mo31439d2 != null) {
            simpleQueue.clear();
            if (disposable != null) {
                disposable.mo31379f();
            }
            observer.onError(mo31439d2);
            return true;
        }
        if (!z2) {
            return false;
        }
        if (disposable != null) {
            disposable.mo31379f();
        }
        observer.onComplete();
        return true;
    }

    /* renamed from: b */
    public static <T> SimpleQueue<T> m31842b(int i2) {
        return i2 < 0 ? new SpscLinkedArrayQueue(-i2) : new SpscArrayQueue(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r9 = r10.m31444j(-r9);
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T, U> void m31843c(io.reactivex.internal.fuseable.SimplePlainQueue<T> r13, io.reactivex.Observer<? super U> r14, boolean r15, io.reactivex.disposables.Disposable r16, io.reactivex.internal.util.ObservableQueueDrain<T, U> r17) {
        /*
            r7 = r17
            r8 = 1
            r9 = 1
        L4:
            r10 = r7
            io.reactivex.internal.observers.QueueDrainObserver r10 = (io.reactivex.internal.observers.QueueDrainObserver) r10
            boolean r0 = r10.f59670f
            boolean r1 = r13.isEmpty()
            r2 = r14
            r3 = r15
            r4 = r13
            r5 = r16
            r6 = r17
            boolean r0 = m31841a(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L1b
            return
        L1b:
            boolean r0 = r10.f59670f
            java.lang.Object r11 = r13.poll()
            if (r11 != 0) goto L25
            r12 = 1
            goto L27
        L25:
            r1 = 0
            r12 = 0
        L27:
            r1 = r12
            r2 = r14
            r3 = r15
            r4 = r13
            r5 = r16
            r6 = r17
            boolean r0 = m31841a(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L36
            return
        L36:
            if (r12 == 0) goto L40
            int r0 = -r9
            int r9 = r10.m31444j(r0)
            if (r9 != 0) goto L4
            return
        L40:
            r0 = r14
            r7.mo31438c(r14, r11)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.QueueDrainHelper.m31843c(io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.Observer, boolean, io.reactivex.disposables.Disposable, io.reactivex.internal.util.ObservableQueueDrain):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003e A[SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T, U> void m31844d(io.reactivex.internal.fuseable.SimplePlainQueue<T> r9, org.reactivestreams.Subscriber<? super U> r10, boolean r11, io.reactivex.disposables.Disposable r12, io.reactivex.internal.util.QueueDrain<T, U> r13) {
        /*
            r0 = 1
            r1 = 1
        L2:
            r2 = r13
            io.reactivex.internal.subscribers.QueueDrainSubscriber r2 = (io.reactivex.internal.subscribers.QueueDrainSubscriber) r2
            boolean r3 = r2.f62747g
            java.lang.Object r4 = r9.poll()
            r5 = 0
            if (r4 != 0) goto L10
            r6 = 1
            goto L11
        L10:
            r6 = 0
        L11:
            boolean r7 = r2.f62746f
            if (r7 == 0) goto L19
            r9.clear()
            goto L3b
        L19:
            if (r3 == 0) goto L3c
            if (r11 == 0) goto L2b
            if (r6 == 0) goto L3c
            java.lang.Throwable r3 = r2.f62748h
            if (r3 == 0) goto L27
            r10.onError(r3)
            goto L3b
        L27:
            r10.onComplete()
            goto L3b
        L2b:
            java.lang.Throwable r3 = r2.f62748h
            if (r3 == 0) goto L36
            r9.clear()
            r10.onError(r3)
            goto L3b
        L36:
            if (r6 == 0) goto L3c
            r10.onComplete()
        L3b:
            r5 = 1
        L3c:
            if (r5 == 0) goto L44
            if (r12 == 0) goto L43
            r12.mo31379f()
        L43:
            return
        L44:
            if (r6 == 0) goto L4e
            int r1 = -r1
            int r1 = r2.m31784h(r1)
            if (r1 != 0) goto L2
            return
        L4e:
            long r5 = r2.m31786j()
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L6d
            boolean r3 = r13.mo31456a(r10, r4)
            if (r3 == 0) goto L2
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L2
            r3 = 1
            r2.m31785i(r3)
            goto L2
        L6d:
            r9.clear()
            if (r12 == 0) goto L75
            r12.mo31379f()
        L75:
            io.reactivex.exceptions.MissingBackpressureException r9 = new io.reactivex.exceptions.MissingBackpressureException
            java.lang.String r11 = "Could not emit value due to lack of requests."
            r9.<init>(r11)
            r10.onError(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.QueueDrainHelper.m31844d(io.reactivex.internal.fuseable.SimplePlainQueue, org.reactivestreams.Subscriber, boolean, io.reactivex.disposables.Disposable, io.reactivex.internal.util.QueueDrain):void");
    }

    /* renamed from: e */
    public static <T> boolean m31845e(long j2, Subscriber<? super T> subscriber, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        boolean z;
        boolean z2;
        long j3 = j2 & Long.MIN_VALUE;
        while (true) {
            if (j3 != j2) {
                try {
                    z = booleanSupplier.mo31405a();
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    z = true;
                }
                if (z) {
                    return true;
                }
                T poll = queue.poll();
                if (poll == null) {
                    subscriber.onComplete();
                    return true;
                }
                subscriber.onNext(poll);
                j3++;
            } else {
                try {
                    z2 = booleanSupplier.mo31405a();
                } catch (Throwable th2) {
                    Exceptions.m31402a(th2);
                    z2 = true;
                }
                if (z2) {
                    return true;
                }
                if (queue.isEmpty()) {
                    subscriber.onComplete();
                    return true;
                }
                j2 = atomicLong.get();
                if (j2 == j3) {
                    long addAndGet = atomicLong.addAndGet(-(j3 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & addAndGet) == 0) {
                        return false;
                    }
                    j2 = addAndGet;
                    j3 = addAndGet & Long.MIN_VALUE;
                } else {
                    continue;
                }
            }
        }
    }
}
