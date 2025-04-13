package io.grpc;

import io.grpc.PersistentHashArrayMappedTrie;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

@CheckReturnValue
/* loaded from: classes3.dex */
public class Context {

    /* renamed from: e */
    public static final Logger f58098e = Logger.getLogger(Context.class.getName());

    /* renamed from: f */
    public static final Context f58099f = new Context();

    /* renamed from: b */
    public final CancellableContext f58100b = null;

    /* renamed from: c */
    public final PersistentHashArrayMappedTrie.Node<Key<?>, Object> f58101c = null;

    /* renamed from: d */
    public final int f58102d = 0;

    /* renamed from: io.grpc.Context$1 */
    class RunnableC62921 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Runnable f58103b;

        /* renamed from: c */
        public final /* synthetic */ Context f58104c;

        @Override // java.lang.Runnable
        public void run() {
            Context mo30831b = this.f58104c.mo30831b();
            try {
                this.f58103b.run();
            } finally {
                this.f58104c.mo30833h(mo30831b);
            }
        }
    }

    /* renamed from: io.grpc.Context$1CurrentContextExecutor, reason: invalid class name */
    final class C1CurrentContextExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            Objects.requireNonNull(Context.m30829g());
            throw null;
        }
    }

    /* renamed from: io.grpc.Context$1FixedContextExecutor, reason: invalid class name */
    final class C1FixedContextExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            throw null;
        }
    }

    /* renamed from: io.grpc.Context$2 */
    class CallableC62932 implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            throw null;
        }
    }

    public @interface CanIgnoreReturnValue {
    }

    public static final class CancellableContext extends Context implements Closeable {

        /* renamed from: g */
        public final Deadline f58105g;

        /* renamed from: h */
        public final Context f58106h;

        /* renamed from: i */
        public ArrayList<ExecutableListener> f58107i;

        /* renamed from: j */
        public CancellationListener f58108j;

        /* renamed from: k */
        public Throwable f58109k;

        /* renamed from: l */
        public ScheduledFuture<?> f58110l;

        /* renamed from: m */
        public boolean f58111m;

        /* renamed from: io.grpc.Context$CancellableContext$1CancelOnExpiration, reason: invalid class name */
        final class C1CancelOnExpiration implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ CancellableContext f58113b;

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f58113b.m30838m(new TimeoutException("context timed out"));
                } catch (Throwable th) {
                    Context.f58098e.log(Level.SEVERE, "Cancel threw an exception, which should not happen", th);
                }
            }
        }

        @Override // io.grpc.Context
        /* renamed from: a */
        public void mo30830a(CancellationListener cancellationListener, Executor executor) {
            Context.m30828e(cancellationListener, "cancellationListener");
            m30837l(new ExecutableListener(executor, cancellationListener, this));
        }

        @Override // io.grpc.Context
        /* renamed from: b */
        public Context mo30831b() {
            return this.f58106h.mo30831b();
        }

        @Override // io.grpc.Context
        /* renamed from: c */
        public Throwable mo30832c() {
            if (mo30835j()) {
                return this.f58109k;
            }
            return null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            m30838m(null);
        }

        @Override // io.grpc.Context
        /* renamed from: h */
        public void mo30833h(Context context) {
            this.f58106h.mo30833h(context);
        }

        @Override // io.grpc.Context
        /* renamed from: i */
        public Deadline mo30834i() {
            return this.f58105g;
        }

        @Override // io.grpc.Context
        /* renamed from: j */
        public boolean mo30835j() {
            synchronized (this) {
                if (this.f58111m) {
                    return true;
                }
                if (!super.mo30835j()) {
                    return false;
                }
                m30838m(super.mo30832c());
                return true;
            }
        }

        @Override // io.grpc.Context
        /* renamed from: k */
        public void mo30836k(CancellationListener cancellationListener) {
            m30839n(cancellationListener, this);
        }

        /* renamed from: l */
        public final void m30837l(ExecutableListener executableListener) {
            synchronized (this) {
                if (mo30835j()) {
                    executableListener.m30841a();
                } else {
                    ArrayList<ExecutableListener> arrayList = this.f58107i;
                    if (arrayList == null) {
                        ArrayList<ExecutableListener> arrayList2 = new ArrayList<>();
                        this.f58107i = arrayList2;
                        arrayList2.add(executableListener);
                        CancellableContext cancellableContext = this.f58100b;
                        if (cancellableContext != null) {
                            CancellationListener cancellationListener = new CancellationListener() { // from class: io.grpc.Context.CancellableContext.1
                                @Override // io.grpc.Context.CancellationListener
                                /* renamed from: a */
                                public void mo30840a(Context context) {
                                    CancellableContext.this.m30838m(context.mo30832c());
                                }
                            };
                            this.f58108j = cancellationListener;
                            cancellableContext.m30837l(new ExecutableListener(DirectExecutor.INSTANCE, cancellationListener, this));
                        }
                    } else {
                        arrayList.add(executableListener);
                    }
                }
            }
        }

        @CanIgnoreReturnValue
        /* renamed from: m */
        public boolean m30838m(Throwable th) {
            boolean z;
            ScheduledFuture<?> scheduledFuture;
            synchronized (this) {
                z = true;
                if (this.f58111m) {
                    scheduledFuture = null;
                    z = false;
                } else {
                    this.f58111m = true;
                    scheduledFuture = this.f58110l;
                    if (scheduledFuture != null) {
                        this.f58110l = null;
                    } else {
                        scheduledFuture = null;
                    }
                    this.f58109k = th;
                }
            }
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            if (z) {
                synchronized (this) {
                    ArrayList<ExecutableListener> arrayList = this.f58107i;
                    if (arrayList != null) {
                        CancellationListener cancellationListener = this.f58108j;
                        this.f58108j = null;
                        this.f58107i = null;
                        Iterator<ExecutableListener> it = arrayList.iterator();
                        while (it.hasNext()) {
                            ExecutableListener next = it.next();
                            if (next.f58118d == this) {
                                next.m30841a();
                            }
                        }
                        Iterator<ExecutableListener> it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ExecutableListener next2 = it2.next();
                            if (next2.f58118d != this) {
                                next2.m30841a();
                            }
                        }
                        CancellableContext cancellableContext = this.f58100b;
                        if (cancellableContext != null) {
                            cancellableContext.m30839n(cancellationListener, cancellableContext);
                        }
                    }
                }
            }
            return z;
        }

        /* renamed from: n */
        public final void m30839n(CancellationListener cancellationListener, Context context) {
            synchronized (this) {
                ArrayList<ExecutableListener> arrayList = this.f58107i;
                if (arrayList != null) {
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        ExecutableListener executableListener = this.f58107i.get(size);
                        if (executableListener.f58117c == cancellationListener && executableListener.f58118d == context) {
                            this.f58107i.remove(size);
                            break;
                        }
                        size--;
                    }
                    if (this.f58107i.isEmpty()) {
                        CancellableContext cancellableContext = this.f58100b;
                        if (cancellableContext != null) {
                            cancellableContext.mo30836k(this.f58108j);
                        }
                        this.f58108j = null;
                        this.f58107i = null;
                    }
                }
            }
        }
    }

    public interface CancellationListener {
        /* renamed from: a */
        void mo30840a(Context context);
    }

    public @interface CheckReturnValue {
    }

    public enum DirectExecutor implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Context.DirectExecutor";
        }
    }

    public static final class ExecutableListener implements Runnable {

        /* renamed from: b */
        public final Executor f58116b;

        /* renamed from: c */
        public final CancellationListener f58117c;

        /* renamed from: d */
        public final Context f58118d;

        public ExecutableListener(Executor executor, CancellationListener cancellationListener, Context context) {
            this.f58116b = executor;
            this.f58117c = cancellationListener;
            this.f58118d = context;
        }

        /* renamed from: a */
        public void m30841a() {
            try {
                this.f58116b.execute(this);
            } catch (Throwable th) {
                Context.f58098e.log(Level.INFO, "Exception notifying context listener", th);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f58117c.mo30840a(this.f58118d);
        }
    }

    public static final class Key<T> {

        /* renamed from: a */
        public final String f58119a;

        public Key(String str) {
            Context.m30828e(str, "name");
            this.f58119a = str;
        }

        public String toString() {
            return this.f58119a;
        }
    }

    public static final class LazyStorage {

        /* renamed from: a */
        public static final Storage f58120a;

        static {
            Storage threadLocalContextStorage;
            AtomicReference atomicReference = new AtomicReference();
            try {
                threadLocalContextStorage = (Storage) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(Storage.class).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e2) {
                atomicReference.set(e2);
                threadLocalContextStorage = new ThreadLocalContextStorage();
            } catch (Exception e3) {
                throw new RuntimeException("Storage override failed to initialize", e3);
            }
            f58120a = threadLocalContextStorage;
            Throwable th = (Throwable) atomicReference.get();
            if (th != null) {
                Context.f58098e.log(Level.FINE, "Storage override doesn't exist. Using default", th);
            }
        }
    }

    public static abstract class Storage {
        /* renamed from: a */
        public abstract Context mo30842a();

        /* renamed from: b */
        public abstract void mo30843b(Context context, Context context2);

        /* renamed from: c */
        public Context mo30844c(Context context) {
            mo30842a();
            throw new UnsupportedOperationException("Deprecated. Do not call.");
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: e */
    public static <T> T m30828e(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: g */
    public static Context m30829g() {
        Context mo30842a = LazyStorage.f58120a.mo30842a();
        return mo30842a == null ? f58099f : mo30842a;
    }

    /* renamed from: a */
    public void mo30830a(CancellationListener cancellationListener, Executor executor) {
        m30828e(cancellationListener, "cancellationListener");
        CancellableContext cancellableContext = this.f58100b;
        if (cancellableContext == null) {
            return;
        }
        cancellableContext.m30837l(new ExecutableListener(executor, cancellationListener, this));
    }

    /* renamed from: b */
    public Context mo30831b() {
        Context mo30844c = LazyStorage.f58120a.mo30844c(this);
        return mo30844c == null ? f58099f : mo30844c;
    }

    /* renamed from: c */
    public Throwable mo30832c() {
        CancellableContext cancellableContext = this.f58100b;
        if (cancellableContext == null) {
            return null;
        }
        return cancellableContext.mo30832c();
    }

    /* renamed from: h */
    public void mo30833h(Context context) {
        m30828e(context, "toAttach");
        LazyStorage.f58120a.mo30843b(this, context);
    }

    /* renamed from: i */
    public Deadline mo30834i() {
        CancellableContext cancellableContext = this.f58100b;
        if (cancellableContext == null) {
            return null;
        }
        return cancellableContext.f58105g;
    }

    /* renamed from: j */
    public boolean mo30835j() {
        CancellableContext cancellableContext = this.f58100b;
        if (cancellableContext == null) {
            return false;
        }
        return cancellableContext.mo30835j();
    }

    /* renamed from: k */
    public void mo30836k(CancellationListener cancellationListener) {
        CancellableContext cancellableContext = this.f58100b;
        if (cancellableContext == null) {
            return;
        }
        cancellableContext.m30839n(cancellationListener, this);
    }
}
