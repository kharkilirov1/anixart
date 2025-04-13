package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import java.lang.Thread;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

@CanIgnoreReturnValue
@GwtIncompatible
/* loaded from: classes2.dex */
public final class ThreadFactoryBuilder {

    /* renamed from: a */
    public String f22237a = null;

    /* renamed from: b */
    public Boolean f22238b = null;

    @CheckReturnValue
    /* renamed from: a */
    public ThreadFactory m12208a() {
        String str = this.f22237a;
        return new ThreadFactory(Executors.defaultThreadFactory(), str, str != null ? new AtomicLong(0L) : null, this.f22238b, null, null) { // from class: com.google.common.util.concurrent.ThreadFactoryBuilder.1

            /* renamed from: b */
            public final /* synthetic */ ThreadFactory f22239b;

            /* renamed from: c */
            public final /* synthetic */ String f22240c;

            /* renamed from: d */
            public final /* synthetic */ AtomicLong f22241d;

            /* renamed from: e */
            public final /* synthetic */ Boolean f22242e;

            /* renamed from: f */
            public final /* synthetic */ Integer f22243f = null;

            /* renamed from: g */
            public final /* synthetic */ Thread.UncaughtExceptionHandler f22244g = null;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread newThread = this.f22239b.newThread(runnable);
                String str2 = this.f22240c;
                if (str2 != null) {
                    newThread.setName(String.format(Locale.ROOT, str2, Long.valueOf(this.f22241d.getAndIncrement())));
                }
                Boolean bool = this.f22242e;
                if (bool != null) {
                    newThread.setDaemon(bool.booleanValue());
                }
                Integer num = this.f22243f;
                if (num != null) {
                    newThread.setPriority(num.intValue());
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f22244g;
                if (uncaughtExceptionHandler != null) {
                    newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
                }
                return newThread;
            }
        };
    }
}
