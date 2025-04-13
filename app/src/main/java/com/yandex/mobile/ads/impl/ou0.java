package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.eq0;
import com.yandex.mobile.ads.impl.ju0;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class ou0 {

    /* renamed from: a */
    private final int f53328a;

    /* renamed from: b */
    private final long f53329b;

    /* renamed from: c */
    @NotNull
    private final q51 f53330c;

    /* renamed from: d */
    @NotNull
    private final nu0 f53331d;

    /* renamed from: e */
    @NotNull
    private final ConcurrentLinkedQueue<ku0> f53332e;

    public ou0(@NotNull r51 taskRunner, @NotNull TimeUnit timeUnit) {
        Intrinsics.m32179h(taskRunner, "taskRunner");
        Intrinsics.m32179h(timeUnit, "timeUnit");
        this.f53328a = 5;
        this.f53329b = timeUnit.toNanos(5L);
        this.f53330c = taskRunner.m27850e();
        this.f53331d = new nu0(this, C0000a.m20q(new StringBuilder(), t91.f54985g, " ConnectionPool"));
        this.f53332e = new ConcurrentLinkedQueue<>();
    }

    /* renamed from: a */
    public final boolean m27115a(@NotNull C6008x6 address, @NotNull ju0 call, @Nullable List<dy0> list, boolean z) {
        Intrinsics.m32179h(address, "address");
        Intrinsics.m32179h(call, "call");
        Iterator<ku0> it = this.f53332e.iterator();
        while (it.hasNext()) {
            ku0 connection = it.next();
            Intrinsics.m32178g(connection, "connection");
            synchronized (connection) {
                if (z) {
                    if (!connection.m26277h()) {
                        continue;
                    }
                }
                if (connection.m26269a(address, list)) {
                    call.m25961a(connection);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void m27116b(@NotNull ku0 connection) {
        Intrinsics.m32179h(connection, "connection");
        if (!t91.f54984f || Thread.holdsLock(connection)) {
            this.f53332e.add(connection);
            this.f53330c.m27634a(this.f53331d, 0L);
        } else {
            StringBuilder m26356a = l60.m26356a("Thread ");
            m26356a.append(Thread.currentThread().getName());
            m26356a.append(" MUST hold lock on ");
            m26356a.append(connection);
            throw new AssertionError(m26356a.toString());
        }
    }

    /* renamed from: a */
    public final long m27113a(long j2) {
        Iterator<ku0> it = this.f53332e.iterator();
        int i2 = 0;
        long j3 = Long.MIN_VALUE;
        ku0 ku0Var = null;
        int i3 = 0;
        while (it.hasNext()) {
            ku0 connection = it.next();
            Intrinsics.m32178g(connection, "connection");
            synchronized (connection) {
                if (m27112a(connection, j2) > 0) {
                    i3++;
                } else {
                    i2++;
                    long m26272c = j2 - connection.m26272c();
                    if (m26272c > j3) {
                        ku0Var = connection;
                        j3 = m26272c;
                    }
                }
            }
        }
        long j4 = this.f53329b;
        if (j3 < j4 && i2 <= this.f53328a) {
            if (i2 > 0) {
                return j4 - j3;
            }
            if (i3 > 0) {
                return j4;
            }
            return -1L;
        }
        Intrinsics.m32176e(ku0Var);
        synchronized (ku0Var) {
            if (!ku0Var.m26271b().isEmpty()) {
                return 0L;
            }
            if (ku0Var.m26272c() + j3 != j2) {
                return 0L;
            }
            ku0Var.m26281l();
            this.f53332e.remove(ku0Var);
            t91.m28510a(ku0Var.m26282m());
            if (this.f53332e.isEmpty()) {
                this.f53330c.m27632a();
            }
            return 0L;
        }
    }

    /* renamed from: a */
    public final boolean m27114a(@NotNull ku0 connection) {
        Intrinsics.m32179h(connection, "connection");
        if (t91.f54984f && !Thread.holdsLock(connection)) {
            StringBuilder m26356a = l60.m26356a("Thread ");
            m26356a.append(Thread.currentThread().getName());
            m26356a.append(" MUST hold lock on ");
            m26356a.append(connection);
            throw new AssertionError(m26356a.toString());
        }
        if (!connection.m26273d() && this.f53328a != 0) {
            this.f53330c.m27634a(this.f53331d, 0L);
            return false;
        }
        connection.m26281l();
        this.f53332e.remove(connection);
        if (this.f53332e.isEmpty()) {
            this.f53330c.m27632a();
        }
        return true;
    }

    /* renamed from: a */
    private final int m27112a(ku0 ku0Var, long j2) {
        if (t91.f54984f && !Thread.holdsLock(ku0Var)) {
            StringBuilder m26356a = l60.m26356a("Thread ");
            m26356a.append(Thread.currentThread().getName());
            m26356a.append(" MUST hold lock on ");
            m26356a.append(ku0Var);
            throw new AssertionError(m26356a.toString());
        }
        ArrayList m26271b = ku0Var.m26271b();
        int i2 = 0;
        while (i2 < m26271b.size()) {
            Reference reference = (Reference) m26271b.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                StringBuilder m26356a2 = l60.m26356a("A connection to ");
                m26356a2.append(ku0Var.m26280k().m23960a().m29677k());
                m26356a2.append(" was leaked. Did you forget to close a response body?");
                String sb = m26356a2.toString();
                int i3 = eq0.f50037c;
                eq0.C5041a.m24241b().mo24234a(((ju0.C5304b) reference).m25984a(), sb);
                m26271b.remove(i2);
                ku0Var.m26281l();
                if (m26271b.isEmpty()) {
                    ku0Var.m26265a(j2 - this.f53329b);
                    return 0;
                }
            }
        }
        return m26271b.size();
    }
}
