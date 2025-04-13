package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ju0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.bp */
/* loaded from: classes3.dex */
public final class C4879bp {

    /* renamed from: a */
    @Nullable
    private ThreadPoolExecutor f48951a;

    /* renamed from: b */
    @NotNull
    private final ArrayDeque<ju0.RunnableC5303a> f48952b = new ArrayDeque<>();

    /* renamed from: c */
    @NotNull
    private final ArrayDeque<ju0.RunnableC5303a> f48953c = new ArrayDeque<>();

    /* renamed from: d */
    @NotNull
    private final ArrayDeque<ju0> f48954d = new ArrayDeque<>();

    /* renamed from: a */
    public final void m22907a(@NotNull ju0.RunnableC5303a call) {
        ju0.RunnableC5303a runnableC5303a;
        Intrinsics.m32179h(call, "call");
        synchronized (this) {
            this.f48952b.add(call);
            if (!call.m25979a().m25970f()) {
                String m25983c = call.m25983c();
                Iterator<ju0.RunnableC5303a> it = this.f48953c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator<ju0.RunnableC5303a> it2 = this.f48952b.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                runnableC5303a = null;
                                break;
                            } else {
                                runnableC5303a = it2.next();
                                if (Intrinsics.m32174c(runnableC5303a.m25983c(), m25983c)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        runnableC5303a = it.next();
                        if (Intrinsics.m32174c(runnableC5303a.m25983c(), m25983c)) {
                            break;
                        }
                    }
                }
                if (runnableC5303a != null) {
                    call.m25980a(runnableC5303a);
                }
            }
        }
        m22905a();
    }

    /* renamed from: b */
    public final void m22909b(@NotNull ju0.RunnableC5303a call) {
        Intrinsics.m32179h(call, "call");
        call.m25982b().decrementAndGet();
        m22906a(this.f48953c, call);
    }

    /* renamed from: b */
    public final void m22910b(@NotNull ju0 call) {
        Intrinsics.m32179h(call, "call");
        ArrayDeque<ju0> arrayDeque = this.f48954d;
        synchronized (this) {
            if (!arrayDeque.remove(call)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        m22905a();
    }

    /* renamed from: a */
    public final synchronized void m22908a(@NotNull ju0 call) {
        Intrinsics.m32179h(call, "call");
        this.f48954d.add(call);
    }

    /* renamed from: a */
    private final void m22906a(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        m22905a();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m22905a() {
        /*
            r14 = this;
            boolean r0 = com.yandex.mobile.ads.impl.t91.f54984f
            if (r0 == 0) goto L2e
            boolean r0 = java.lang.Thread.holdsLock(r14)
            if (r0 != 0) goto Lb
            goto L2e
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Thread "
            java.lang.StringBuilder r1 = com.yandex.mobile.ads.impl.l60.m26356a(r1)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST NOT hold lock on "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r14)
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.ju0$a> r1 = r14.f48952b     // Catch: java.lang.Throwable -> Ld2
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r2 = "readyAsyncCalls.iterator()"
            kotlin.jvm.internal.Intrinsics.m32178g(r1, r2)     // Catch: java.lang.Throwable -> Ld2
        L3f:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Ld2
            if (r2 == 0) goto L73
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Ld2
            com.yandex.mobile.ads.impl.ju0$a r2 = (com.yandex.mobile.ads.impl.ju0.RunnableC5303a) r2     // Catch: java.lang.Throwable -> Ld2
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.ju0$a> r3 = r14.f48953c     // Catch: java.lang.Throwable -> Ld2
            int r3 = r3.size()     // Catch: java.lang.Throwable -> Ld2
            r4 = 64
            if (r3 >= r4) goto L73
            java.util.concurrent.atomic.AtomicInteger r3 = r2.m25982b()     // Catch: java.lang.Throwable -> Ld2
            int r3 = r3.get()     // Catch: java.lang.Throwable -> Ld2
            r4 = 5
            if (r3 >= r4) goto L3f
            r1.remove()     // Catch: java.lang.Throwable -> Ld2
            java.util.concurrent.atomic.AtomicInteger r3 = r2.m25982b()     // Catch: java.lang.Throwable -> Ld2
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> Ld2
            r0.add(r2)     // Catch: java.lang.Throwable -> Ld2
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.ju0$a> r3 = r14.f48953c     // Catch: java.lang.Throwable -> Ld2
            r3.add(r2)     // Catch: java.lang.Throwable -> Ld2
            goto L3f
        L73:
            monitor-enter(r14)     // Catch: java.lang.Throwable -> Ld2
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.ju0$a> r1 = r14.f48953c     // Catch: java.lang.Throwable -> Lcf
            r1.size()     // Catch: java.lang.Throwable -> Lcf
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.ju0> r1 = r14.f48954d     // Catch: java.lang.Throwable -> Lcf
            r1.size()     // Catch: java.lang.Throwable -> Lcf
            monitor-exit(r14)     // Catch: java.lang.Throwable -> Ld2
            monitor-exit(r14)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
        L86:
            if (r3 >= r1) goto Lce
            java.lang.Object r4 = r0.get(r3)
            com.yandex.mobile.ads.impl.ju0$a r4 = (com.yandex.mobile.ads.impl.ju0.RunnableC5303a) r4
            monitor-enter(r14)
            java.util.concurrent.ThreadPoolExecutor r5 = r14.f48951a     // Catch: java.lang.Throwable -> Lcb
            if (r5 != 0) goto Lbf
            java.util.concurrent.ThreadPoolExecutor r5 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> Lcb
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> Lcb
            java.util.concurrent.SynchronousQueue r12 = new java.util.concurrent.SynchronousQueue     // Catch: java.lang.Throwable -> Lcb
            r12.<init>()     // Catch: java.lang.Throwable -> Lcb
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcb
            r6.<init>()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r7 = com.yandex.mobile.ads.impl.t91.f54985g     // Catch: java.lang.Throwable -> Lcb
            r6.append(r7)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r7 = " Dispatcher"
            r6.append(r7)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lcb
            java.util.concurrent.ThreadFactory r13 = com.yandex.mobile.ads.impl.t91.m28507a(r6, r2)     // Catch: java.lang.Throwable -> Lcb
            r7 = 0
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 60
            r6 = r5
            r6.<init>(r7, r8, r9, r11, r12, r13)     // Catch: java.lang.Throwable -> Lcb
            r14.f48951a = r5     // Catch: java.lang.Throwable -> Lcb
        Lbf:
            java.util.concurrent.ThreadPoolExecutor r5 = r14.f48951a     // Catch: java.lang.Throwable -> Lcb
            kotlin.jvm.internal.Intrinsics.m32176e(r5)     // Catch: java.lang.Throwable -> Lcb
            monitor-exit(r14)
            r4.m25981a(r5)
            int r3 = r3 + 1
            goto L86
        Lcb:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        Lce:
            return
        Lcf:
            r0 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> Ld2
            throw r0     // Catch: java.lang.Throwable -> Ld2
        Ld2:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C4879bp.m22905a():void");
    }
}
