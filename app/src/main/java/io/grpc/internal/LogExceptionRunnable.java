package io.grpc.internal;

import com.google.common.base.Throwables;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class LogExceptionRunnable implements Runnable {

    /* renamed from: c */
    public static final Logger f58812c = Logger.getLogger(LogExceptionRunnable.class.getName());

    /* renamed from: b */
    public final Runnable f58813b;

    public LogExceptionRunnable(Runnable runnable) {
        this.f58813b = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f58813b.run();
        } catch (Throwable th) {
            Logger logger = f58812c;
            Level level = Level.SEVERE;
            StringBuilder m24u = C0000a.m24u("Exception while executing runnable ");
            m24u.append(this.f58813b);
            logger.log(level, m24u.toString(), th);
            Throwables.m11225f(th);
            throw new AssertionError(th);
        }
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("LogExceptionRunnable(");
        m24u.append(this.f58813b);
        m24u.append(")");
        return m24u.toString();
    }
}
