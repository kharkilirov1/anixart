package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.util.concurrent.locks.ReentrantLock;

@Beta
@GwtIncompatible
/* loaded from: classes2.dex */
public final class Monitor {

    /* renamed from: a */
    public final ReentrantLock f22201a = new ReentrantLock(false);

    @Beta
    public static abstract class Guard {
        public Guard(Monitor monitor) {
            Preconditions.m11187k(monitor, "monitor");
            monitor.f22201a.newCondition();
        }
    }

    /* renamed from: a */
    public void m12200a() {
        ReentrantLock reentrantLock = this.f22201a;
        try {
            reentrantLock.getHoldCount();
        } finally {
            reentrantLock.unlock();
        }
    }
}
