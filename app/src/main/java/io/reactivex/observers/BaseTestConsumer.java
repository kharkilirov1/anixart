package io.reactivex.observers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.VolatileSizeArrayList;
import io.reactivex.observers.BaseTestConsumer;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public abstract class BaseTestConsumer<T, U extends BaseTestConsumer<T, U>> implements Disposable {

    /* renamed from: e */
    public long f62811e;

    /* renamed from: f */
    public boolean f62812f;

    /* renamed from: c */
    public final List<T> f62809c = new VolatileSizeArrayList();

    /* renamed from: d */
    public final List<Throwable> f62810d = new VolatileSizeArrayList();

    /* renamed from: b */
    public final CountDownLatch f62808b = new CountDownLatch(1);

    public enum TestWaitStrategy implements Runnable {
        /* JADX INFO: Fake field, exist only in values array */
        SPIN { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.1
            @Override // java.lang.Runnable
            public void run() {
            }
        },
        /* JADX INFO: Fake field, exist only in values array */
        YIELD { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.2
            @Override // java.lang.Runnable
            public void run() {
                Thread.yield();
            }
        },
        /* JADX INFO: Fake field, exist only in values array */
        SLEEP_1MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.3
            @Override // java.lang.Runnable
            public void run() {
                TestWaitStrategy.m31846a(1);
            }
        },
        /* JADX INFO: Fake field, exist only in values array */
        SLEEP_10MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.4
            @Override // java.lang.Runnable
            public void run() {
                TestWaitStrategy.m31846a(10);
            }
        },
        /* JADX INFO: Fake field, exist only in values array */
        SLEEP_100MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.5
            @Override // java.lang.Runnable
            public void run() {
                TestWaitStrategy.m31846a(100);
            }
        },
        /* JADX INFO: Fake field, exist only in values array */
        SLEEP_1000MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.6
            @Override // java.lang.Runnable
            public void run() {
                TestWaitStrategy.m31846a(1000);
            }
        };

        TestWaitStrategy(C65161 c65161) {
        }

        /* renamed from: a */
        public static void m31846a(int i2) {
            try {
                Thread.sleep(i2);
            } catch (InterruptedException e2) {
                throw new RuntimeException(e2);
            }
        }
    }
}
