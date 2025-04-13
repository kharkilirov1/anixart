package io.grpc.internal;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
class SerializeReentrantCallsDirectExecutor implements Executor {

    /* renamed from: d */
    public static final Logger f59074d = Logger.getLogger(SerializeReentrantCallsDirectExecutor.class.getName());

    /* renamed from: b */
    public boolean f59075b;

    /* renamed from: c */
    public ArrayDeque<Runnable> f59076c;

    /* renamed from: a */
    public final void m31176a() {
        while (true) {
            Runnable poll = this.f59076c.poll();
            if (poll == null) {
                return;
            }
            try {
                poll.run();
            } catch (Throwable th) {
                f59074d.log(Level.SEVERE, "Exception while executing runnable " + poll, th);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r6.f59076c == null) goto L9;
     */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void execute(java.lang.Runnable r7) {
        /*
            r6 = this;
            java.lang.String r0 = "'task' must not be null."
            com.google.common.base.Preconditions.m11187k(r7, r0)
            boolean r0 = r6.f59075b
            if (r0 != 0) goto L43
            r0 = 1
            r6.f59075b = r0
            r0 = 0
            r7.run()     // Catch: java.lang.Throwable -> L1a
            java.util.ArrayDeque<java.lang.Runnable> r7 = r6.f59076c
            if (r7 == 0) goto L17
        L14:
            r6.m31176a()
        L17:
            r6.f59075b = r0
            goto L54
        L1a:
            r1 = move-exception
            java.util.logging.Logger r2 = io.grpc.internal.SerializeReentrantCallsDirectExecutor.f59074d     // Catch: java.lang.Throwable -> L38
            java.util.logging.Level r3 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r4.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = "Exception while executing runnable "
            r4.append(r5)     // Catch: java.lang.Throwable -> L38
            r4.append(r7)     // Catch: java.lang.Throwable -> L38
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L38
            r2.log(r3, r7, r1)     // Catch: java.lang.Throwable -> L38
            java.util.ArrayDeque<java.lang.Runnable> r7 = r6.f59076c
            if (r7 == 0) goto L17
            goto L14
        L38:
            r7 = move-exception
            java.util.ArrayDeque<java.lang.Runnable> r1 = r6.f59076c
            if (r1 == 0) goto L40
            r6.m31176a()
        L40:
            r6.f59075b = r0
            throw r7
        L43:
            java.util.ArrayDeque<java.lang.Runnable> r0 = r6.f59076c
            if (r0 != 0) goto L4f
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 4
            r0.<init>(r1)
            r6.f59076c = r0
        L4f:
            java.util.ArrayDeque<java.lang.Runnable> r0 = r6.f59076c
            r0.add(r7)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.SerializeReentrantCallsDirectExecutor.execute(java.lang.Runnable):void");
    }
}
