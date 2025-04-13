package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.util.concurrent.FluentFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeoutException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: classes2.dex */
final class TimeoutFuture<V> extends FluentFuture.TrustedFuture<V> {

    /* renamed from: i */
    @NullableDecl
    public ScheduledFuture<?> f22245i;

    public static final class Fire<V> implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static final class TimeoutFutureException extends TimeoutException {
        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            setStackTrace(new StackTraceElement[0]);
            return this;
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    /* renamed from: c */
    public void mo12134c() {
        m12147k(null);
        ScheduledFuture<?> scheduledFuture = this.f22245i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f22245i = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    /* renamed from: l */
    public String mo12135l() {
        return null;
    }
}
