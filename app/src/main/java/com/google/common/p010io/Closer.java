package com.google.common.p010io;

import androidx.room.util.C0576a;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Throwables;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtIncompatible
/* loaded from: classes2.dex */
public final class Closer implements Closeable {

    /* renamed from: e */
    public static final Suppressor f21849e;

    /* renamed from: b */
    @VisibleForTesting
    public final Suppressor f21850b;

    /* renamed from: c */
    public final Deque<Closeable> f21851c;

    /* renamed from: d */
    @NullableDecl
    public Throwable f21852d;

    @VisibleForTesting
    public static final class LoggingSuppressor implements Suppressor {

        /* renamed from: a */
        public static final LoggingSuppressor f21853a = new LoggingSuppressor();

        @Override // com.google.common.io.Closer.Suppressor
        /* renamed from: a */
        public void mo12050a(Closeable closeable, Throwable th, Throwable th2) {
            Logger logger = Closeables.f21848a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(closeable);
            logger.log(level, C0576a.m4114m(valueOf.length() + 42, "Suppressing exception thrown when closing ", valueOf), th2);
        }
    }

    @VisibleForTesting
    public static final class SuppressingSuppressor implements Suppressor {

        /* renamed from: a */
        public static final SuppressingSuppressor f21854a = new SuppressingSuppressor();

        /* renamed from: b */
        public static final Method f21855b;

        static {
            Method method;
            try {
                method = Throwable.class.getMethod("addSuppressed", Throwable.class);
            } catch (Throwable unused) {
                method = null;
            }
            f21855b = method;
        }

        @Override // com.google.common.io.Closer.Suppressor
        /* renamed from: a */
        public void mo12050a(Closeable closeable, Throwable th, Throwable th2) {
            if (th == th2) {
                return;
            }
            try {
                f21855b.invoke(th, th2);
            } catch (Throwable unused) {
                LoggingSuppressor.f21853a.mo12050a(closeable, th, th2);
            }
        }
    }

    @VisibleForTesting
    public interface Suppressor {
        /* renamed from: a */
        void mo12050a(Closeable closeable, Throwable th, Throwable th2);
    }

    static {
        f21849e = SuppressingSuppressor.f21855b != null ? SuppressingSuppressor.f21854a : LoggingSuppressor.f21853a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Throwable th = this.f21852d;
        while (!this.f21851c.isEmpty()) {
            Closeable removeFirst = this.f21851c.removeFirst();
            try {
                removeFirst.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.f21850b.mo12050a(removeFirst, th, th2);
                }
            }
        }
        if (this.f21852d != null || th == null) {
            return;
        }
        Throwables.m11224e(th, IOException.class);
        throw new AssertionError(th);
    }
}
