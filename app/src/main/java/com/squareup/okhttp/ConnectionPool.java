package com.squareup.okhttp;

import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.RouteDatabase;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.StreamAllocation;
import com.squareup.okhttp.internal.p013io.RealConnection;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class ConnectionPool {

    /* renamed from: a */
    public final Executor f24826a;

    /* renamed from: b */
    public final int f24827b;

    /* renamed from: c */
    public final long f24828c;

    /* renamed from: d */
    public Runnable f24829d;

    /* renamed from: e */
    public final Deque<RealConnection> f24830e;

    /* renamed from: f */
    public final RouteDatabase f24831f;

    static {
        String property = System.getProperty("http.keepAlive");
        String property2 = System.getProperty("http.keepAliveDuration");
        String property3 = System.getProperty("http.maxConnections");
        long parseLong = property2 != null ? Long.parseLong(property2) : 300000L;
        if (property != null && !Boolean.parseBoolean(property)) {
            new ConnectionPool(0, parseLong);
        } else if (property3 != null) {
            new ConnectionPool(Integer.parseInt(property3), parseLong);
        } else {
            new ConnectionPool(5, parseLong);
        }
    }

    public ConnectionPool(int i2, long j2) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f24826a = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.m13942j("OkHttp ConnectionPool", true));
        this.f24829d = new Runnable() { // from class: com.squareup.okhttp.ConnectionPool.1
            @Override // java.lang.Runnable
            public void run() {
                long j3;
                while (true) {
                    ConnectionPool connectionPool = ConnectionPool.this;
                    long nanoTime = System.nanoTime();
                    synchronized (connectionPool) {
                        RealConnection realConnection = null;
                        long j4 = Long.MIN_VALUE;
                        int i3 = 0;
                        int i4 = 0;
                        for (RealConnection realConnection2 : connectionPool.f24830e) {
                            if (connectionPool.m13884a(realConnection2, nanoTime) > 0) {
                                i4++;
                            } else {
                                i3++;
                                long j5 = nanoTime - realConnection2.f25200h;
                                if (j5 > j4) {
                                    realConnection = realConnection2;
                                    j4 = j5;
                                }
                            }
                        }
                        j3 = connectionPool.f24828c;
                        if (j4 < j3 && i3 <= connectionPool.f24827b) {
                            if (i3 > 0) {
                                j3 -= j4;
                            } else if (i4 <= 0) {
                                j3 = -1;
                            }
                        }
                        connectionPool.f24830e.remove(realConnection);
                        Util.m13936d(realConnection.f25194b);
                        j3 = 0;
                    }
                    if (j3 == -1) {
                        return;
                    }
                    if (j3 > 0) {
                        long j6 = j3 / 1000000;
                        long j7 = j3 - (1000000 * j6);
                        synchronized (ConnectionPool.this) {
                            try {
                                ConnectionPool.this.wait(j6, (int) j7);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }
            }
        };
        this.f24830e = new ArrayDeque();
        this.f24831f = new RouteDatabase();
        this.f24827b = i2;
        this.f24828c = timeUnit.toNanos(j2);
        if (j2 <= 0) {
            throw new IllegalArgumentException(C0000a.m11h("keepAliveDuration <= 0: ", j2));
        }
    }

    /* renamed from: a */
    public final int m13884a(RealConnection realConnection, long j2) {
        List<Reference<StreamAllocation>> list = realConnection.f25198f;
        int i2 = 0;
        while (i2 < list.size()) {
            if (list.get(i2).get() != null) {
                i2++;
            } else {
                Logger logger = Internal.f24954a;
                StringBuilder m24u = C0000a.m24u("A connection to ");
                m24u.append(realConnection.f25193a.f24931a.f24770a);
                m24u.append(" was leaked. Did you forget to close a response body?");
                logger.warning(m24u.toString());
                list.remove(i2);
                realConnection.f25199g = true;
                if (list.isEmpty()) {
                    realConnection.f25200h = j2 - this.f24828c;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
