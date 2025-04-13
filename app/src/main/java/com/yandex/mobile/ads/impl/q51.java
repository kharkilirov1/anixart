package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.r51;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class q51 {

    /* renamed from: a */
    @NotNull
    private final r51 f53941a;

    /* renamed from: b */
    @NotNull
    private final String f53942b;

    /* renamed from: c */
    private boolean f53943c;

    /* renamed from: d */
    @Nullable
    private n51 f53944d;

    /* renamed from: e */
    @NotNull
    private final ArrayList f53945e;

    /* renamed from: f */
    private boolean f53946f;

    public q51(@NotNull r51 taskRunner, @NotNull String name) {
        Intrinsics.m32179h(taskRunner, "taskRunner");
        Intrinsics.m32179h(name, "name");
        this.f53941a = taskRunner;
        this.f53942b = name;
        this.f53945e = new ArrayList();
    }

    /* renamed from: a */
    public final void m27633a(@Nullable n51 n51Var) {
        this.f53944d = n51Var;
    }

    /* renamed from: b */
    public final boolean m27636b() {
        n51 n51Var = this.f53944d;
        if (n51Var != null && n51Var.m26800a()) {
            this.f53946f = true;
        }
        boolean z = false;
        for (int size = this.f53945e.size() - 1; -1 < size; size--) {
            if (((n51) this.f53945e.get(size)).m26800a()) {
                n51 n51Var2 = (n51) this.f53945e.get(size);
                r51 r51Var = r51.f54199h;
                if (r51.C5672b.m27854a().isLoggable(Level.FINE)) {
                    o51.m27004a(n51Var2, this, "canceled");
                }
                this.f53945e.remove(size);
                z = true;
            }
        }
        return z;
    }

    @Nullable
    /* renamed from: c */
    public final n51 m27637c() {
        return this.f53944d;
    }

    /* renamed from: d */
    public final boolean m27638d() {
        return this.f53946f;
    }

    @NotNull
    /* renamed from: e */
    public final ArrayList m27639e() {
        return this.f53945e;
    }

    @NotNull
    /* renamed from: f */
    public final String m27640f() {
        return this.f53942b;
    }

    /* renamed from: g */
    public final boolean m27641g() {
        return this.f53943c;
    }

    @NotNull
    /* renamed from: h */
    public final r51 m27642h() {
        return this.f53941a;
    }

    /* renamed from: i */
    public final void m27643i() {
        this.f53946f = false;
    }

    /* renamed from: j */
    public final void m27644j() {
        if (t91.f54984f && Thread.holdsLock(this)) {
            StringBuilder m26356a = l60.m26356a("Thread ");
            m26356a.append(Thread.currentThread().getName());
            m26356a.append(" MUST NOT hold lock on ");
            m26356a.append(this);
            throw new AssertionError(m26356a.toString());
        }
        synchronized (this.f53941a) {
            this.f53943c = true;
            if (m27636b()) {
                this.f53941a.m27846a(this);
            }
        }
    }

    @NotNull
    public final String toString() {
        return this.f53942b;
    }

    /* renamed from: a */
    public final void m27634a(@NotNull n51 task, long j2) {
        Intrinsics.m32179h(task, "task");
        synchronized (this.f53941a) {
            if (this.f53943c) {
                if (task.m26800a()) {
                    r51 r51Var = r51.f54199h;
                    if (r51.C5672b.m27854a().isLoggable(Level.FINE)) {
                        o51.m27004a(task, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                } else {
                    r51 r51Var2 = r51.f54199h;
                    if (r51.C5672b.m27854a().isLoggable(Level.FINE)) {
                        o51.m27004a(task, this, "schedule failed (queue is shutdown)");
                    }
                    throw new RejectedExecutionException();
                }
            }
            if (m27635a(task, j2, false)) {
                this.f53941a.m27846a(this);
            }
        }
    }

    /* renamed from: a */
    public final boolean m27635a(@NotNull n51 task, long j2, boolean z) {
        String sb;
        Intrinsics.m32179h(task, "task");
        task.m26799a(this);
        long mo27851a = this.f53941a.m27849d().mo27851a();
        long j3 = mo27851a + j2;
        int indexOf = this.f53945e.indexOf(task);
        if (indexOf != -1) {
            if (task.m26802c() <= j3) {
                r51 r51Var = r51.f54199h;
                if (r51.C5672b.m27854a().isLoggable(Level.FINE)) {
                    o51.m27004a(task, this, "already scheduled");
                }
                return false;
            }
            this.f53945e.remove(indexOf);
        }
        task.m26798a(j3);
        r51 r51Var2 = r51.f54199h;
        if (r51.C5672b.m27854a().isLoggable(Level.FINE)) {
            if (z) {
                StringBuilder m26356a = l60.m26356a("run again after ");
                m26356a.append(o51.m27003a(j3 - mo27851a));
                sb = m26356a.toString();
            } else {
                StringBuilder m26356a2 = l60.m26356a("scheduled after ");
                m26356a2.append(o51.m27003a(j3 - mo27851a));
                sb = m26356a2.toString();
            }
            o51.m27004a(task, this, sb);
        }
        Iterator it = this.f53945e.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (((n51) it.next()).m26802c() - mo27851a > j2) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            i2 = this.f53945e.size();
        }
        this.f53945e.add(i2, task);
        return i2 == 0;
    }

    /* renamed from: a */
    public final void m27632a() {
        if (t91.f54984f && Thread.holdsLock(this)) {
            StringBuilder m26356a = l60.m26356a("Thread ");
            m26356a.append(Thread.currentThread().getName());
            m26356a.append(" MUST NOT hold lock on ");
            m26356a.append(this);
            throw new AssertionError(m26356a.toString());
        }
        synchronized (this.f53941a) {
            if (m27636b()) {
                this.f53941a.m27846a(this);
            }
        }
    }
}
