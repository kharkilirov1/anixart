package com.google.common.util.concurrent;

import androidx.room.util.C0576a;
import com.google.android.exoplayer2.extractor.C1008a;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.base.Throwables;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.j2objc.annotations.ReflectionSupport;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
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
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p000a.C0000a;
import sun.misc.Unsafe;

@ReflectionSupport
@GwtCompatible
/* loaded from: classes2.dex */
public abstract class AbstractFuture<V> extends InternalFutureFailureAccess implements ListenableFuture<V> {

    /* renamed from: e */
    public static final boolean f22045e;

    /* renamed from: f */
    public static final Logger f22046f;

    /* renamed from: g */
    public static final AtomicHelper f22047g;

    /* renamed from: h */
    public static final Object f22048h;

    /* renamed from: b */
    @NullableDecl
    public volatile Object f22049b;

    /* renamed from: c */
    @NullableDecl
    public volatile Listener f22050c;

    /* renamed from: d */
    @NullableDecl
    public volatile Waiter f22051d;

    public static abstract class AtomicHelper {
        public AtomicHelper() {
        }

        /* renamed from: a */
        public abstract boolean mo12153a(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2);

        /* renamed from: b */
        public abstract boolean mo12154b(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo12155c(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2);

        /* renamed from: d */
        public abstract void mo12156d(Waiter waiter, Waiter waiter2);

        /* renamed from: e */
        public abstract void mo12157e(Waiter waiter, Thread thread);

        public AtomicHelper(C19491 c19491) {
        }
    }

    public static final class Cancellation {

        /* renamed from: c */
        public static final Cancellation f22052c;

        /* renamed from: d */
        public static final Cancellation f22053d;

        /* renamed from: a */
        public final boolean f22054a;

        /* renamed from: b */
        @NullableDecl
        public final Throwable f22055b;

        static {
            if (AbstractFuture.f22045e) {
                f22053d = null;
                f22052c = null;
            } else {
                f22053d = new Cancellation(false, null);
                f22052c = new Cancellation(true, null);
            }
        }

        public Cancellation(boolean z, @NullableDecl Throwable th) {
            this.f22054a = z;
            this.f22055b = th;
        }
    }

    public static final class Failure {

        /* renamed from: b */
        public static final Failure f22056b = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.common.util.concurrent.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: a */
        public final Throwable f22057a;

        public Failure(Throwable th) {
            Objects.requireNonNull(th);
            this.f22057a = th;
        }
    }

    public static final class Listener {

        /* renamed from: d */
        public static final Listener f22058d = new Listener(null, null);

        /* renamed from: a */
        public final Runnable f22059a;

        /* renamed from: b */
        public final Executor f22060b;

        /* renamed from: c */
        @NullableDecl
        public Listener f22061c;

        public Listener(Runnable runnable, Executor executor) {
            this.f22059a = runnable;
            this.f22060b = executor;
        }
    }

    public static final class SafeAtomicHelper extends AtomicHelper {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<Waiter, Thread> f22062a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<Waiter, Waiter> f22063b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractFuture, Waiter> f22064c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractFuture, Listener> f22065d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractFuture, Object> f22066e;

        public SafeAtomicHelper(AtomicReferenceFieldUpdater<Waiter, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<Waiter, Waiter> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, Waiter> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, Listener> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            super(null);
            this.f22062a = atomicReferenceFieldUpdater;
            this.f22063b = atomicReferenceFieldUpdater2;
            this.f22064c = atomicReferenceFieldUpdater3;
            this.f22065d = atomicReferenceFieldUpdater4;
            this.f22066e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: a */
        public boolean mo12153a(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2) {
            AtomicReferenceFieldUpdater<AbstractFuture, Listener> atomicReferenceFieldUpdater = this.f22065d;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractFuture, listener, listener2)) {
                if (atomicReferenceFieldUpdater.get(abstractFuture) != listener) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: b */
        public boolean mo12154b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater = this.f22066e;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractFuture, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(abstractFuture) != obj) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: c */
        public boolean mo12155c(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2) {
            AtomicReferenceFieldUpdater<AbstractFuture, Waiter> atomicReferenceFieldUpdater = this.f22064c;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractFuture, waiter, waiter2)) {
                if (atomicReferenceFieldUpdater.get(abstractFuture) != waiter) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: d */
        public void mo12156d(Waiter waiter, Waiter waiter2) {
            this.f22063b.lazySet(waiter, waiter2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: e */
        public void mo12157e(Waiter waiter, Thread thread) {
            this.f22062a.lazySet(waiter, thread);
        }
    }

    public static final class SetFuture<V> implements Runnable {

        /* renamed from: b */
        public final AbstractFuture<V> f22067b;

        /* renamed from: c */
        public final ListenableFuture<? extends V> f22068c;

        public SetFuture(AbstractFuture<V> abstractFuture, ListenableFuture<? extends V> listenableFuture) {
            this.f22067b = abstractFuture;
            this.f22068c = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f22067b.f22049b != this) {
                return;
            }
            if (AbstractFuture.f22047g.mo12154b(this.f22067b, this, AbstractFuture.m12142h(this.f22068c))) {
                AbstractFuture.m12139e(this.f22067b);
            }
        }
    }

    public static final class SynchronizedHelper extends AtomicHelper {
        public SynchronizedHelper() {
            super(null);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: a */
        public boolean mo12153a(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f22050c != listener) {
                    return false;
                }
                abstractFuture.f22050c = listener2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: b */
        public boolean mo12154b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f22049b != obj) {
                    return false;
                }
                abstractFuture.f22049b = obj2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: c */
        public boolean mo12155c(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f22051d != waiter) {
                    return false;
                }
                abstractFuture.f22051d = waiter2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: d */
        public void mo12156d(Waiter waiter, Waiter waiter2) {
            waiter.f22077b = waiter2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: e */
        public void mo12157e(Waiter waiter, Thread thread) {
            waiter.f22076a = thread;
        }

        public SynchronizedHelper(C19491 c19491) {
            super(null);
        }
    }

    public interface Trusted<V> extends ListenableFuture<V> {
    }

    public static abstract class TrustedFuture<V> extends AbstractFuture<V> implements Trusted<V> {
        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @CanIgnoreReturnValue
        public boolean cancel(boolean z) {
            return super.cancel(z);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @CanIgnoreReturnValue
        public V get() throws InterruptedException, ExecutionException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f22049b instanceof Cancellation;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.ListenableFuture
        /* renamed from: r */
        public final void mo1145r(Runnable runnable, Executor executor) {
            super.mo1145r(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @CanIgnoreReturnValue
        public final V get(long j2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return (V) super.get(j2, timeUnit);
        }
    }

    public static final class UnsafeAtomicHelper extends AtomicHelper {

        /* renamed from: a */
        public static final Unsafe f22069a;

        /* renamed from: b */
        public static final long f22070b;

        /* renamed from: c */
        public static final long f22071c;

        /* renamed from: d */
        public static final long f22072d;

        /* renamed from: e */
        public static final long f22073e;

        /* renamed from: f */
        public static final long f22074f;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e2) {
                    throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.1
                    @Override // java.security.PrivilegedExceptionAction
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Unsafe run() throws Exception {
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                f22071c = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("d"));
                f22070b = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("c"));
                f22072d = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("b"));
                f22073e = unsafe.objectFieldOffset(Waiter.class.getDeclaredField("a"));
                f22074f = unsafe.objectFieldOffset(Waiter.class.getDeclaredField("b"));
                f22069a = unsafe;
            } catch (Exception e3) {
                Throwables.m11225f(e3);
                throw new RuntimeException(e3);
            }
        }

        public UnsafeAtomicHelper() {
            super(null);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: a */
        public boolean mo12153a(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2) {
            return C0576a.m4101B(f22069a, abstractFuture, f22070b, listener, listener2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: b */
        public boolean mo12154b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return C0576a.m4101B(f22069a, abstractFuture, f22072d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: c */
        public boolean mo12155c(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2) {
            return C0576a.m4101B(f22069a, abstractFuture, f22071c, waiter, waiter2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: d */
        public void mo12156d(Waiter waiter, Waiter waiter2) {
            f22069a.putObject(waiter, f22074f, waiter2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: e */
        public void mo12157e(Waiter waiter, Thread thread) {
            f22069a.putObject(waiter, f22073e, thread);
        }

        public UnsafeAtomicHelper(C19491 c19491) {
            super(null);
        }
    }

    public static final class Waiter {

        /* renamed from: c */
        public static final Waiter f22075c = new Waiter(false);

        /* renamed from: a */
        @NullableDecl
        public volatile Thread f22076a;

        /* renamed from: b */
        @NullableDecl
        public volatile Waiter f22077b;

        public Waiter(boolean z) {
        }

        public Waiter() {
            AbstractFuture.f22047g.mo12157e(this, Thread.currentThread());
        }
    }

    static {
        boolean z;
        AtomicHelper synchronizedHelper;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f22045e = z;
        f22046f = Logger.getLogger(AbstractFuture.class.getName());
        Throwable th = null;
        try {
            synchronizedHelper = new UnsafeAtomicHelper(null);
            th = null;
        } catch (Throwable th2) {
            th = th2;
            try {
                synchronizedHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Waiter.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Waiter.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Listener.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "b"));
            } catch (Throwable th3) {
                synchronizedHelper = new SynchronizedHelper(null);
                th = th3;
            }
        }
        f22047g = synchronizedHelper;
        if (th != null) {
            Logger logger = f22046f;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th);
        }
        f22048h = new Object();
    }

    /* renamed from: b */
    private void m12138b(StringBuilder sb) {
        try {
            Object m12143i = m12143i(this);
            sb.append("SUCCESS, result=[");
            m12145d(sb, m12143i);
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

    /* renamed from: e */
    public static void m12139e(AbstractFuture<?> abstractFuture) {
        Listener listener;
        Listener listener2;
        Listener listener3 = null;
        while (true) {
            Waiter waiter = abstractFuture.f22051d;
            if (f22047g.mo12155c(abstractFuture, waiter, Waiter.f22075c)) {
                while (waiter != null) {
                    Thread thread = waiter.f22076a;
                    if (thread != null) {
                        waiter.f22076a = null;
                        LockSupport.unpark(thread);
                    }
                    waiter = waiter.f22077b;
                }
                abstractFuture.mo12134c();
                do {
                    listener = abstractFuture.f22050c;
                } while (!f22047g.mo12153a(abstractFuture, listener, Listener.f22058d));
                while (true) {
                    listener2 = listener3;
                    listener3 = listener;
                    if (listener3 == null) {
                        break;
                    }
                    listener = listener3.f22061c;
                    listener3.f22061c = listener2;
                }
                while (listener2 != null) {
                    listener3 = listener2.f22061c;
                    Runnable runnable = listener2.f22059a;
                    if (runnable instanceof SetFuture) {
                        SetFuture setFuture = (SetFuture) runnable;
                        abstractFuture = setFuture.f22067b;
                        if (abstractFuture.f22049b == setFuture) {
                            if (f22047g.mo12154b(abstractFuture, setFuture, m12142h(setFuture.f22068c))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m12140f(runnable, listener2.f22060b);
                    }
                    listener2 = listener3;
                }
                return;
            }
        }
    }

    /* renamed from: f */
    public static void m12140f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f22046f;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.log(level, C1008a.m6437d(valueOf2.length() + valueOf.length() + 57, "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    private V m12141g(Object obj) throws ExecutionException {
        if (obj instanceof Cancellation) {
            Throwable th = ((Cancellation) obj).f22055b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f22057a);
        }
        if (obj == f22048h) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static Object m12142h(ListenableFuture<?> listenableFuture) {
        Throwable mo12144a;
        if (listenableFuture instanceof Trusted) {
            Object obj = ((AbstractFuture) listenableFuture).f22049b;
            if (!(obj instanceof Cancellation)) {
                return obj;
            }
            Cancellation cancellation = (Cancellation) obj;
            return cancellation.f22054a ? cancellation.f22055b != null ? new Cancellation(false, cancellation.f22055b) : Cancellation.f22053d : obj;
        }
        if ((listenableFuture instanceof InternalFutureFailureAccess) && (mo12144a = ((InternalFutureFailureAccess) listenableFuture).mo12144a()) != null) {
            return new Failure(mo12144a);
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!f22045e) && isCancelled) {
            return Cancellation.f22053d;
        }
        try {
            Object m12143i = m12143i(listenableFuture);
            if (!isCancelled) {
                return m12143i == null ? f22048h : m12143i;
            }
            String valueOf = String.valueOf(listenableFuture);
            StringBuilder sb = new StringBuilder(valueOf.length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(valueOf);
            return new Cancellation(false, new IllegalArgumentException(sb.toString()));
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new Cancellation(false, e2);
            }
            String valueOf2 = String.valueOf(listenableFuture);
            return new Failure(new IllegalArgumentException(C0576a.m4114m(valueOf2.length() + 77, "get() threw CancellationException, despite reporting isCancelled() == false: ", valueOf2), e2));
        } catch (ExecutionException e3) {
            if (!isCancelled) {
                return new Failure(e3.getCause());
            }
            String valueOf3 = String.valueOf(listenableFuture);
            return new Cancellation(false, new IllegalArgumentException(C0576a.m4114m(valueOf3.length() + 84, "get() did not throw CancellationException, despite reporting isCancelled() == true: ", valueOf3), e3));
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    /* renamed from: i */
    public static <V> V m12143i(Future<V> future) throws ExecutionException {
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

    @Override // com.google.common.util.concurrent.internal.InternalFutureFailureAccess
    @NullableDecl
    /* renamed from: a */
    public final Throwable mo12144a() {
        if (!(this instanceof Trusted)) {
            return null;
        }
        Object obj = this.f22049b;
        if (obj instanceof Failure) {
            return ((Failure) obj).f22057a;
        }
        return null;
    }

    @Beta
    @ForOverride
    /* renamed from: c */
    public void mo12134c() {
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    public boolean cancel(boolean z) {
        Object obj = this.f22049b;
        if (!(obj == null) && !(obj instanceof SetFuture)) {
            return false;
        }
        Cancellation cancellation = f22045e ? new Cancellation(z, new CancellationException("Future.cancel() was called.")) : z ? Cancellation.f22052c : Cancellation.f22053d;
        boolean z2 = false;
        AbstractFuture<V> abstractFuture = this;
        while (true) {
            if (f22047g.mo12154b(abstractFuture, obj, cancellation)) {
                if (z) {
                    abstractFuture.mo12146j();
                }
                m12139e(abstractFuture);
                if (!(obj instanceof SetFuture)) {
                    return true;
                }
                ListenableFuture<? extends V> listenableFuture = ((SetFuture) obj).f22068c;
                if (!(listenableFuture instanceof Trusted)) {
                    listenableFuture.cancel(z);
                    return true;
                }
                abstractFuture = (AbstractFuture) listenableFuture;
                obj = abstractFuture.f22049b;
                if (!(obj == null) && !(obj instanceof SetFuture)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = abstractFuture.f22049b;
                if (!(obj instanceof SetFuture)) {
                    return z2;
                }
            }
        }
    }

    /* renamed from: d */
    public final void m12145d(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    public V get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f22049b;
        if ((obj != null) && (!(obj instanceof SetFuture))) {
            return m12141g(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            Waiter waiter = this.f22051d;
            if (waiter != Waiter.f22075c) {
                Waiter waiter2 = new Waiter();
                do {
                    AtomicHelper atomicHelper = f22047g;
                    atomicHelper.mo12156d(waiter2, waiter);
                    if (atomicHelper.mo12155c(this, waiter, waiter2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                m12148m(waiter2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f22049b;
                            if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
                                return m12141g(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m12148m(waiter2);
                    } else {
                        waiter = this.f22051d;
                    }
                } while (waiter != Waiter.f22075c);
            }
            return m12141g(this.f22049b);
        }
        while (nanos > 0) {
            Object obj3 = this.f22049b;
            if ((obj3 != null) && (!(obj3 instanceof SetFuture))) {
                return m12141g(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractFuture = toString();
        String timeUnit2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = timeUnit2.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder m4121t = C0576a.m4121t(C0576a.m4106e(lowerCase2, 28), "Waited ", j2, " ");
        m4121t.append(lowerCase2);
        String sb = m4121t.toString();
        if (nanos + 1000 < 0) {
            String concat = String.valueOf(sb).concat(" (plus ");
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String valueOf = String.valueOf(concat);
                StringBuilder m4121t2 = C0576a.m4121t(C0576a.m4106e(lowerCase, valueOf.length() + 21), valueOf, convert, " ");
                m4121t2.append(lowerCase);
                String sb2 = m4121t2.toString();
                if (z) {
                    sb2 = String.valueOf(sb2).concat(",");
                }
                concat = String.valueOf(sb2).concat(" ");
            }
            if (z) {
                String valueOf2 = String.valueOf(concat);
                concat = C0576a.m4113l(valueOf2.length() + 33, valueOf2, nanos2, " nanoseconds ");
            }
            sb = String.valueOf(concat).concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(String.valueOf(sb).concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(C0576a.m4115n(C0576a.m4106e(abstractFuture, C0576a.m4106e(sb, 5)), sb, " for ", abstractFuture));
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f22049b instanceof Cancellation;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof SetFuture)) & (this.f22049b != null);
    }

    /* renamed from: j */
    public void mo12146j() {
    }

    /* renamed from: k */
    public final void m12147k(@NullableDecl Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(m12152q());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NullableDecl
    /* renamed from: l */
    public String mo12135l() {
        if (this instanceof ScheduledFuture) {
            return C0576a.m4113l(41, "remaining delay=[", ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), " ms]");
        }
        return null;
    }

    /* renamed from: m */
    public final void m12148m(Waiter waiter) {
        waiter.f22076a = null;
        while (true) {
            Waiter waiter2 = this.f22051d;
            if (waiter2 == Waiter.f22075c) {
                return;
            }
            Waiter waiter3 = null;
            while (waiter2 != null) {
                Waiter waiter4 = waiter2.f22077b;
                if (waiter2.f22076a != null) {
                    waiter3 = waiter2;
                } else if (waiter3 != null) {
                    waiter3.f22077b = waiter4;
                    if (waiter3.f22076a == null) {
                        break;
                    }
                } else if (!f22047g.mo12155c(this, waiter2, waiter4)) {
                    break;
                }
                waiter2 = waiter4;
            }
            return;
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: n */
    public boolean mo12149n(@NullableDecl V v) {
        if (v == null) {
            v = (V) f22048h;
        }
        if (!f22047g.mo12154b(this, null, v)) {
            return false;
        }
        m12139e(this);
        return true;
    }

    @CanIgnoreReturnValue
    /* renamed from: o */
    public boolean mo12150o(Throwable th) {
        Objects.requireNonNull(th);
        if (!f22047g.mo12154b(this, null, new Failure(th))) {
            return false;
        }
        m12139e(this);
        return true;
    }

    @CanIgnoreReturnValue
    /* renamed from: p */
    public boolean mo12151p(ListenableFuture<? extends V> listenableFuture) {
        Failure failure;
        Objects.requireNonNull(listenableFuture);
        Object obj = this.f22049b;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!f22047g.mo12154b(this, null, m12142h(listenableFuture))) {
                    return false;
                }
                m12139e(this);
                return true;
            }
            SetFuture setFuture = new SetFuture(this, listenableFuture);
            if (f22047g.mo12154b(this, null, setFuture)) {
                try {
                    listenableFuture.mo1145r(setFuture, DirectExecutor.INSTANCE);
                } catch (Throwable th) {
                    try {
                        failure = new Failure(th);
                    } catch (Throwable unused) {
                        failure = Failure.f22056b;
                    }
                    f22047g.mo12154b(this, setFuture, failure);
                }
                return true;
            }
            obj = this.f22049b;
        }
        if (obj instanceof Cancellation) {
            listenableFuture.cancel(((Cancellation) obj).f22054a);
        }
        return false;
    }

    /* renamed from: q */
    public final boolean m12152q() {
        Object obj = this.f22049b;
        return (obj instanceof Cancellation) && ((Cancellation) obj).f22054a;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    /* renamed from: r */
    public void mo1145r(Runnable runnable, Executor executor) {
        Listener listener;
        Preconditions.m11187k(runnable, "Runnable was null.");
        Preconditions.m11187k(executor, "Executor was null.");
        if (!isDone() && (listener = this.f22050c) != Listener.f22058d) {
            Listener listener2 = new Listener(runnable, executor);
            do {
                listener2.f22061c = listener;
                if (f22047g.mo12153a(this, listener, listener2)) {
                    return;
                } else {
                    listener = this.f22050c;
                }
            } while (listener != Listener.f22058d);
        }
        m12140f(runnable, executor);
    }

    public String toString() {
        String m4114m;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m12138b(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f22049b;
            if (obj instanceof SetFuture) {
                sb.append(", setFuture=[");
                ListenableFuture<? extends V> listenableFuture = ((SetFuture) obj).f22068c;
                try {
                    if (listenableFuture == this) {
                        sb.append("this future");
                    } else {
                        sb.append(listenableFuture);
                    }
                } catch (RuntimeException | StackOverflowError e2) {
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e2.getClass());
                }
                sb.append("]");
            } else {
                try {
                    m4114m = Strings.m11217a(mo12135l());
                } catch (RuntimeException | StackOverflowError e3) {
                    String valueOf = String.valueOf(e3.getClass());
                    m4114m = C0576a.m4114m(valueOf.length() + 38, "Exception thrown from implementation: ", valueOf);
                }
                if (m4114m != null) {
                    C0000a.m1B(sb, ", info=[", m4114m, "]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                m12138b(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f22049b;
            if ((obj2 != null) & (!(obj2 instanceof SetFuture))) {
                return m12141g(obj2);
            }
            Waiter waiter = this.f22051d;
            if (waiter != Waiter.f22075c) {
                Waiter waiter2 = new Waiter();
                do {
                    AtomicHelper atomicHelper = f22047g;
                    atomicHelper.mo12156d(waiter2, waiter);
                    if (atomicHelper.mo12155c(this, waiter, waiter2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f22049b;
                            } else {
                                m12148m(waiter2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof SetFuture))));
                        return m12141g(obj);
                    }
                    waiter = this.f22051d;
                } while (waiter != Waiter.f22075c);
            }
            return m12141g(this.f22049b);
        }
        throw new InterruptedException();
    }
}
