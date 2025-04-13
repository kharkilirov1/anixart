package com.p017vk.api.sdk.utils;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VKValidationLocker.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/vk/api/sdk/utils/VKValidationLocker;", "", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class VKValidationLocker {

    /* renamed from: a */
    public static final ReentrantLock f30795a;

    /* renamed from: b */
    public static final Condition f30796b;

    /* renamed from: c */
    public static final VKValidationLocker f30797c = new VKValidationLocker();

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f30795a = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        Intrinsics.m32175d(newCondition, "locker.newCondition()");
        f30796b = newCondition;
    }

    /* renamed from: a */
    public final void m16537a() {
        try {
            ReentrantLock reentrantLock = f30795a;
            reentrantLock.lock();
            try {
                f30796b.await();
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: b */
    public final void m16538b() {
        ReentrantLock reentrantLock = f30795a;
        reentrantLock.lock();
        try {
            f30796b.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }
}
