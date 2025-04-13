package androidx.concurrent.futures;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000a.C0000a;

@RestrictTo
/* loaded from: classes.dex */
public abstract class AbstractResolvableFuture<V> implements ListenableFuture<V> {

    /* renamed from: e */
    public static final boolean f1857e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f */
    public static final Logger f1858f = Logger.getLogger(AbstractResolvableFuture.class.getName());

    /* renamed from: g */
    public static final AtomicHelper f1859g;

    /* renamed from: h */
    public static final Object f1860h;

    /* renamed from: b */
    @Nullable
    public volatile Object f1861b;

    /* renamed from: c */
    @Nullable
    public volatile Listener f1862c;

    /* renamed from: d */
    @Nullable
    public volatile Waiter f1863d;

    public static abstract class AtomicHelper {
        public AtomicHelper() {
        }

        /* renamed from: a */
        public abstract boolean mo1146a(AbstractResolvableFuture<?> abstractResolvableFuture, Listener listener, Listener listener2);

        /* renamed from: b */
        public abstract boolean mo1147b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo1148c(AbstractResolvableFuture<?> abstractResolvableFuture, Waiter waiter, Waiter waiter2);

        /* renamed from: d */
        public abstract void mo1149d(Waiter waiter, Waiter waiter2);

        /* renamed from: e */
        public abstract void mo1150e(Waiter waiter, Thread thread);

        public AtomicHelper(C01731 c01731) {
        }
    }

    public static final class Cancellation {

        /* renamed from: c */
        public static final Cancellation f1864c;

        /* renamed from: d */
        public static final Cancellation f1865d;

        /* renamed from: a */
        public final boolean f1866a;

        /* renamed from: b */
        @Nullable
        public final Throwable f1867b;

        static {
            if (AbstractResolvableFuture.f1857e) {
                f1865d = null;
                f1864c = null;
            } else {
                f1865d = new Cancellation(false, null);
                f1864c = new Cancellation(true, null);
            }
        }

        public Cancellation(boolean z, @Nullable Throwable th) {
            this.f1866a = z;
            this.f1867b = th;
        }
    }

    public static final class Failure {

        /* renamed from: a */
        public final Throwable f1868a;

        static {
            new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: androidx.concurrent.futures.AbstractResolvableFuture.Failure.1
                @Override // java.lang.Throwable
                public synchronized Throwable fillInStackTrace() {
                    return this;
                }
            });
        }

        public Failure(Throwable th) {
            boolean z = AbstractResolvableFuture.f1857e;
            Objects.requireNonNull(th);
            this.f1868a = th;
        }
    }

    public static final class Listener {

        /* renamed from: d */
        public static final Listener f1869d = new Listener(null, null);

        /* renamed from: a */
        public final Runnable f1870a;

        /* renamed from: b */
        public final Executor f1871b;

        /* renamed from: c */
        @Nullable
        public Listener f1872c;

        public Listener(Runnable runnable, Executor executor) {
            this.f1870a = runnable;
            this.f1871b = executor;
        }
    }

    public static final class SafeAtomicHelper extends AtomicHelper {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<Waiter, Thread> f1873a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<Waiter, Waiter> f1874b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Waiter> f1875c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Listener> f1876d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> f1877e;

        public SafeAtomicHelper(AtomicReferenceFieldUpdater<Waiter, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<Waiter, Waiter> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractResolvableFuture, Waiter> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractResolvableFuture, Listener> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> atomicReferenceFieldUpdater5) {
            super(null);
            this.f1873a = atomicReferenceFieldUpdater;
            this.f1874b = atomicReferenceFieldUpdater2;
            this.f1875c = atomicReferenceFieldUpdater3;
            this.f1876d = atomicReferenceFieldUpdater4;
            this.f1877e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        /* renamed from: a */
        public boolean mo1146a(AbstractResolvableFuture<?> abstractResolvableFuture, Listener listener, Listener listener2) {
            AtomicReferenceFieldUpdater<AbstractResolvableFuture, Listener> atomicReferenceFieldUpdater = this.f1876d;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, listener, listener2)) {
                if (atomicReferenceFieldUpdater.get(abstractResolvableFuture) != listener) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        /* renamed from: b */
        public boolean mo1147b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> atomicReferenceFieldUpdater = this.f1877e;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(abstractResolvableFuture) != obj) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        /* renamed from: c */
        public boolean mo1148c(AbstractResolvableFuture<?> abstractResolvableFuture, Waiter waiter, Waiter waiter2) {
            AtomicReferenceFieldUpdater<AbstractResolvableFuture, Waiter> atomicReferenceFieldUpdater = this.f1875c;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, waiter, waiter2)) {
                if (atomicReferenceFieldUpdater.get(abstractResolvableFuture) != waiter) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        /* renamed from: d */
        public void mo1149d(Waiter waiter, Waiter waiter2) {
            this.f1874b.lazySet(waiter, waiter2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        /* renamed from: e */
        public void mo1150e(Waiter waiter, Thread thread) {
            this.f1873a.lazySet(waiter, thread);
        }
    }

    public static final class SetFuture<V> implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    public static final class SynchronizedHelper extends AtomicHelper {
        public SynchronizedHelper() {
            super(null);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        /* renamed from: a */
        public boolean mo1146a(AbstractResolvableFuture<?> abstractResolvableFuture, Listener listener, Listener listener2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.f1862c != listener) {
                    return false;
                }
                abstractResolvableFuture.f1862c = listener2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        /* renamed from: b */
        public boolean mo1147b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.f1861b != obj) {
                    return false;
                }
                abstractResolvableFuture.f1861b = obj2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        /* renamed from: c */
        public boolean mo1148c(AbstractResolvableFuture<?> abstractResolvableFuture, Waiter waiter, Waiter waiter2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.f1863d != waiter) {
                    return false;
                }
                abstractResolvableFuture.f1863d = waiter2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        /* renamed from: d */
        public void mo1149d(Waiter waiter, Waiter waiter2) {
            waiter.f1880b = waiter2;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        /* renamed from: e */
        public void mo1150e(Waiter waiter, Thread thread) {
            waiter.f1879a = thread;
        }
    }

    public static final class Waiter {

        /* renamed from: c */
        public static final Waiter f1878c = new Waiter(false);

        /* renamed from: a */
        @Nullable
        public volatile Thread f1879a;

        /* renamed from: b */
        @Nullable
        public volatile Waiter f1880b;

        public Waiter(boolean z) {
        }

        public Waiter() {
            AbstractResolvableFuture.f1859g.mo1150e(this, Thread.currentThread());
        }
    }

    static {
        AtomicHelper synchronizedHelper;
        try {
            synchronizedHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Waiter.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Waiter.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Listener.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Object.class, "b"));
            th = null;
        } catch (Throwable th) {
            th = th;
            synchronizedHelper = new SynchronizedHelper();
        }
        f1859g = synchronizedHelper;
        if (th != null) {
            f1858f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f1860h = new Object();
    }

    /* renamed from: b */
    public static void m1136b(AbstractResolvableFuture<?> abstractResolvableFuture) {
        Waiter waiter;
        Listener listener;
        do {
            waiter = abstractResolvableFuture.f1863d;
        } while (!f1859g.mo1148c(abstractResolvableFuture, waiter, Waiter.f1878c));
        while (waiter != null) {
            Thread thread = waiter.f1879a;
            if (thread != null) {
                waiter.f1879a = null;
                LockSupport.unpark(thread);
            }
            waiter = waiter.f1880b;
        }
        do {
            listener = abstractResolvableFuture.f1862c;
        } while (!f1859g.mo1146a(abstractResolvableFuture, listener, Listener.f1869d));
        Listener listener2 = null;
        while (listener != null) {
            Listener listener3 = listener.f1872c;
            listener.f1872c = listener2;
            listener2 = listener;
            listener = listener3;
        }
        while (listener2 != null) {
            Listener listener4 = listener2.f1872c;
            Runnable runnable = listener2.f1870a;
            if (runnable instanceof SetFuture) {
                Objects.requireNonNull((SetFuture) runnable);
                throw null;
            }
            m1137c(runnable, listener2.f1871b);
            listener2 = listener4;
        }
    }

    /* renamed from: c */
    public static void m1137c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f1858f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    /* renamed from: e */
    public static <V> V m1138e(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* renamed from: a */
    public final void m1139a(StringBuilder sb) {
        try {
            Object m1138e = m1138e(this);
            sb.append("SUCCESS, result=[");
            sb.append(m1138e == this ? "this future" : String.valueOf(m1138e));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f1861b;
        if ((obj == null) | (obj instanceof SetFuture)) {
            Cancellation cancellation = f1857e ? new Cancellation(z, new CancellationException("Future.cancel() was called.")) : z ? Cancellation.f1864c : Cancellation.f1865d;
            while (!f1859g.mo1147b(this, obj, cancellation)) {
                obj = this.f1861b;
                if (!(obj instanceof SetFuture)) {
                }
            }
            m1136b(this);
            if (!(obj instanceof SetFuture)) {
                return true;
            }
            Objects.requireNonNull((SetFuture) obj);
            throw null;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final V m1140d(Object obj) throws ExecutionException {
        if (obj instanceof Cancellation) {
            Throwable th = ((Cancellation) obj).f1867b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f1868a);
        }
        if (obj == f1860h) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: f */
    public String mo1141f() {
        Object obj = this.f1861b;
        if (obj instanceof SetFuture) {
            Objects.requireNonNull((SetFuture) obj);
            return "setFuture=[null]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        StringBuilder m24u = C0000a.m24u("remaining delay=[");
        m24u.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
        m24u.append(" ms]");
        return m24u.toString();
    }

    /* renamed from: g */
    public final void m1142g(Waiter waiter) {
        waiter.f1879a = null;
        while (true) {
            Waiter waiter2 = this.f1863d;
            if (waiter2 == Waiter.f1878c) {
                return;
            }
            Waiter waiter3 = null;
            while (waiter2 != null) {
                Waiter waiter4 = waiter2.f1880b;
                if (waiter2.f1879a != null) {
                    waiter3 = waiter2;
                } else if (waiter3 != null) {
                    waiter3.f1880b = waiter4;
                    if (waiter3.f1879a == null) {
                        break;
                    }
                } else if (!f1859g.mo1148c(this, waiter2, waiter4)) {
                    break;
                }
                waiter2 = waiter4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f1861b;
        if ((obj != null) && (!(obj instanceof SetFuture))) {
            return m1140d(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            Waiter waiter = this.f1863d;
            if (waiter != Waiter.f1878c) {
                Waiter waiter2 = new Waiter();
                do {
                    AtomicHelper atomicHelper = f1859g;
                    atomicHelper.mo1149d(waiter2, waiter);
                    if (atomicHelper.mo1148c(this, waiter, waiter2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m1142g(waiter2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f1861b;
                            if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
                                return m1140d(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m1142g(waiter2);
                    } else {
                        waiter = this.f1863d;
                    }
                } while (waiter != Waiter.f1878c);
            }
            return m1140d(this.f1861b);
        }
        while (nanos > 0) {
            Object obj3 = this.f1861b;
            if ((obj3 != null) && (!(obj3 instanceof SetFuture))) {
                return m1140d(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractResolvableFuture = toString();
        String timeUnit2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = timeUnit2.toLowerCase(locale);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String m14k = C0000a.m14k(str, " (plus ");
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = m14k + convert + " " + lowerCase;
                if (z) {
                    str2 = C0000a.m14k(str2, ",");
                }
                m14k = C0000a.m14k(str2, " ");
            }
            if (z) {
                m14k = m14k + nanos2 + " nanoseconds ";
            }
            str = C0000a.m14k(m14k, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(C0000a.m14k(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(C0000a.m16m(str, " for ", abstractResolvableFuture));
    }

    /* renamed from: h */
    public boolean mo1143h(@Nullable V v) {
        if (v == null) {
            v = (V) f1860h;
        }
        if (!f1859g.mo1147b(this, null, v)) {
            return false;
        }
        m1136b(this);
        return true;
    }

    /* renamed from: i */
    public boolean mo1144i(Throwable th) {
        Objects.requireNonNull(th);
        if (!f1859g.mo1147b(this, null, new Failure(th))) {
            return false;
        }
        m1136b(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1861b instanceof Cancellation;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof SetFuture)) & (this.f1861b != null);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    /* renamed from: r */
    public final void mo1145r(Runnable runnable, Executor executor) {
        Objects.requireNonNull(runnable);
        Objects.requireNonNull(executor);
        Listener listener = this.f1862c;
        if (listener != Listener.f1869d) {
            Listener listener2 = new Listener(runnable, executor);
            do {
                listener2.f1872c = listener;
                if (f1859g.mo1146a(this, listener, listener2)) {
                    return;
                } else {
                    listener = this.f1862c;
                }
            } while (listener != Listener.f1869d);
        }
        m1137c(runnable, executor);
    }

    public String toString() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m1139a(sb2);
        } else {
            try {
                sb = mo1141f();
            } catch (RuntimeException e2) {
                StringBuilder m24u = C0000a.m24u("Exception thrown from implementation: ");
                m24u.append(e2.getClass());
                sb = m24u.toString();
            }
            if (sb != null && !sb.isEmpty()) {
                C0000a.m1B(sb2, "PENDING, info=[", sb, "]");
            } else if (isDone()) {
                m1139a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f1861b;
            if ((obj2 != null) & (!(obj2 instanceof SetFuture))) {
                return m1140d(obj2);
            }
            Waiter waiter = this.f1863d;
            if (waiter != Waiter.f1878c) {
                Waiter waiter2 = new Waiter();
                do {
                    AtomicHelper atomicHelper = f1859g;
                    atomicHelper.mo1149d(waiter2, waiter);
                    if (atomicHelper.mo1148c(this, waiter, waiter2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f1861b;
                            } else {
                                m1142g(waiter2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof SetFuture))));
                        return m1140d(obj);
                    }
                    waiter = this.f1863d;
                } while (waiter != Waiter.f1878c);
            }
            return m1140d(this.f1861b);
        }
        throw new InterruptedException();
    }
}
