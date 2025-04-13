package com.yandex.metrica.push.impl;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.yandex.metrica.push.common.utils.InternalLogger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.push.impl.X0 */
/* loaded from: classes2.dex */
public class C4557X0 {

    /* renamed from: a */
    @NonNull
    private final a f47325a;

    /* renamed from: b */
    @NonNull
    private final C4551U0 f47326b;

    /* renamed from: c */
    @NonNull
    private final CountDownLatch f47327c;

    /* renamed from: com.yandex.metrica.push.impl.X0$a */
    public static abstract class a {

        /* renamed from: a */
        private Looper f47328a;

        @NonNull
        /* renamed from: a */
        public Looper m21484a() {
            return this.f47328a;
        }

        /* renamed from: a */
        public abstract void mo21485a(@NonNull CountDownLatch countDownLatch);

        /* renamed from: a */
        public static void m21483a(a aVar, Looper looper) {
            aVar.f47328a = looper;
        }
    }

    public C4557X0(@NonNull a aVar, @NonNull C4551U0 c4551u0) {
        this.f47325a = aVar;
        a.m21483a(aVar, c4551u0.m21476a());
        this.f47326b = c4551u0;
        this.f47327c = new CountDownLatch(1);
    }

    /* renamed from: a */
    public void m21482a(long j2, @NonNull TimeUnit timeUnit) {
        if (this.f47327c.getCount() != 0) {
            this.f47326b.m21477a(new RunnableC4555W0(this));
        }
        try {
            this.f47327c.await(j2, timeUnit);
        } catch (InterruptedException e2) {
            InternalLogger.m21369e(e2, e2.getMessage(), new Object[0]);
            Thread.currentThread().interrupt();
        }
    }
}
