package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.DoNotMock;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Closeable;
import java.io.IOException;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

@DoNotMock
@Beta
/* loaded from: classes2.dex */
public final class ClosingFuture<V> {

    /* renamed from: d */
    public static final Logger f22136d = Logger.getLogger(ClosingFuture.class.getName());

    /* renamed from: a */
    public final AtomicReference<State> f22137a;

    /* renamed from: b */
    public final CloseableList f22138b;

    /* renamed from: c */
    public final FluentFuture<V> f22139c;

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$1 */
    class C19751 implements FutureCallback<Closeable> {
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$10 */
    class RunnableC197610 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            Logger logger = ClosingFuture.f22136d;
            new ValueAndCloser(null);
            throw null;
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$12 */
    public static /* synthetic */ class C197812 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22141a;

        static {
            int[] iArr = new int[State.values().length];
            f22141a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22141a[5] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22141a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22141a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22141a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22141a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$2 */
    class CallableC19792 implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            throw null;
        }

        public String toString() {
            throw null;
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$3 */
    class C19803 implements AsyncCallable<Object> {
        public String toString() {
            throw null;
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$4 */
    class C19814 implements AsyncFunction<Object, Object> {
        @Override // com.google.common.util.concurrent.AsyncFunction
        public ListenableFuture<Object> apply(Object obj) throws Exception {
            throw null;
        }

        public String toString() {
            throw null;
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$5 */
    class C19825 implements AsyncFunction<Object, Object> {
        @Override // com.google.common.util.concurrent.AsyncFunction
        public ListenableFuture<Object> apply(Object obj) throws Exception {
            throw null;
        }

        public String toString() {
            throw null;
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$6 */
    class C19836 implements AsyncClosingFunction<Object, Object> {
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$7 */
    class C19847 implements AsyncFunction<Throwable, Object> {
        @Override // com.google.common.util.concurrent.AsyncFunction
        public ListenableFuture<Object> apply(Throwable th) throws Exception {
            throw null;
        }

        public String toString() {
            throw null;
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$8 */
    class C19858 implements AsyncFunction<Throwable, Object> {
        @Override // com.google.common.util.concurrent.AsyncFunction
        public ListenableFuture<Object> apply(Throwable th) throws Exception {
            throw null;
        }

        public String toString() {
            throw null;
        }
    }

    public interface AsyncClosingCallable<V> {
    }

    public interface AsyncClosingFunction<T, U> {
    }

    public static final class CloseableList extends IdentityHashMap<Closeable, Executor> implements Closeable {

        /* renamed from: b */
        public final DeferredCloser f22143b = new DeferredCloser(this);

        /* renamed from: c */
        public volatile boolean f22144c;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f22144c) {
                return;
            }
            synchronized (this) {
                if (this.f22144c) {
                    return;
                }
                this.f22144c = true;
                for (Map.Entry<Closeable, Executor> entry : entrySet()) {
                    ClosingFuture.m12176a(entry.getKey(), entry.getValue());
                }
                clear();
            }
        }
    }

    public interface ClosingCallable<V> {
    }

    public interface ClosingFunction<T, U> {
    }

    @DoNotMock
    public static class Combiner {

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner$1 */
        class CallableC19871 implements Callable<Object> {
            @Override // java.util.concurrent.Callable
            public Object call() throws Exception {
                Objects.requireNonNull(null);
                throw null;
            }

            public String toString() {
                throw null;
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner$2 */
        class C19882 implements AsyncCallable<Object> {
            public String toString() {
                throw null;
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner$3 */
        public class C19893 implements Function<ClosingFuture<?>, FluentFuture<?>> {
            @Override // com.google.common.base.Function
            public FluentFuture<?> apply(ClosingFuture<?> closingFuture) {
                return closingFuture.f22139c;
            }
        }

        public interface AsyncCombiningCallable<V> {
        }

        public interface CombiningCallable<V> {
        }
    }

    public static final class Combiner2<V1, V2> extends Combiner {

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner2$1 */
        class C19901 implements Combiner.CombiningCallable<Object> {
            public String toString() {
                throw null;
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner2$2 */
        class C19912 implements Combiner.AsyncCombiningCallable<Object> {
            public String toString() {
                throw null;
            }
        }

        public interface AsyncClosingFunction2<V1, V2, U> {
        }

        public interface ClosingFunction2<V1, V2, U> {
        }
    }

    public static final class Combiner3<V1, V2, V3> extends Combiner {

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner3$1 */
        class C19921 implements Combiner.CombiningCallable<Object> {
            public String toString() {
                throw null;
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner3$2 */
        class C19932 implements Combiner.AsyncCombiningCallable<Object> {
            public String toString() {
                throw null;
            }
        }

        public interface AsyncClosingFunction3<V1, V2, V3, U> {
        }

        public interface ClosingFunction3<V1, V2, V3, U> {
        }
    }

    public static final class Combiner4<V1, V2, V3, V4> extends Combiner {

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner4$1 */
        class C19941 implements Combiner.CombiningCallable<Object> {
            public String toString() {
                throw null;
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner4$2 */
        class C19952 implements Combiner.AsyncCombiningCallable<Object> {
            public String toString() {
                throw null;
            }
        }

        public interface AsyncClosingFunction4<V1, V2, V3, V4, U> {
        }

        public interface ClosingFunction4<V1, V2, V3, V4, U> {
        }
    }

    public static final class Combiner5<V1, V2, V3, V4, V5> extends Combiner {

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner5$1 */
        class C19961 implements Combiner.CombiningCallable<Object> {
            public String toString() {
                throw null;
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner5$2 */
        class C19972 implements Combiner.AsyncCombiningCallable<Object> {
            public String toString() {
                throw null;
            }
        }

        public interface AsyncClosingFunction5<V1, V2, V3, V4, V5, U> {
        }

        public interface ClosingFunction5<V1, V2, V3, V4, V5, U> {
        }
    }

    public static final class DeferredCloser {

        /* renamed from: a */
        @RetainedWith
        public final CloseableList f22145a;

        public DeferredCloser(CloseableList closeableList) {
            this.f22145a = closeableList;
        }
    }

    public static final class Peeker {
    }

    public enum State {
        OPEN,
        SUBSUMED,
        WILL_CLOSE,
        CLOSING,
        CLOSED,
        WILL_CREATE_VALUE_AND_CLOSER
    }

    public static final class ValueAndCloser<V> {

        /* renamed from: a */
        public final ClosingFuture<? extends V> f22153a;

        public ValueAndCloser(ClosingFuture<? extends V> closingFuture) {
            Objects.requireNonNull(closingFuture);
            this.f22153a = closingFuture;
        }
    }

    public interface ValueAndCloserConsumer<V> {
    }

    /* renamed from: a */
    public static void m12176a(final Closeable closeable, Executor executor) {
        if (closeable == null) {
            return;
        }
        try {
            executor.execute(new Runnable() { // from class: com.google.common.util.concurrent.ClosingFuture.11
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        closeable.close();
                    } catch (IOException | RuntimeException e2) {
                        ClosingFuture.f22136d.log(Level.WARNING, "thrown by close()", e2);
                    }
                }
            });
        } catch (RejectedExecutionException e2) {
            Logger logger = f22136d;
            Level level = Level.WARNING;
            if (logger.isLoggable(level)) {
                logger.log(level, String.format("while submitting close to %s; will close inline", executor), (Throwable) e2);
            }
            m12176a(closeable, DirectExecutor.INSTANCE);
        }
    }

    public void finalize() {
        State state = this.f22137a.get();
        State state2 = State.OPEN;
        if (state.equals(state2)) {
            Logger logger = f22136d;
            logger.log(Level.SEVERE, "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            if (this.f22137a.compareAndSet(state2, State.WILL_CLOSE)) {
                logger.log(Level.FINER, "will close {0}", this);
                this.f22139c.mo1145r(new Runnable() { // from class: com.google.common.util.concurrent.ClosingFuture.9
                    @Override // java.lang.Runnable
                    public void run() {
                        ClosingFuture closingFuture = ClosingFuture.this;
                        State state3 = State.WILL_CLOSE;
                        State state4 = State.CLOSING;
                        Preconditions.m11195s(closingFuture.f22137a.compareAndSet(state3, state4), "Expected state to be %s, but it was %s", state3, state4);
                        ClosingFuture closingFuture2 = ClosingFuture.this;
                        Objects.requireNonNull(closingFuture2);
                        ClosingFuture.f22136d.log(Level.FINER, "closing {0}", closingFuture2);
                        closingFuture2.f22138b.close();
                        ClosingFuture closingFuture3 = ClosingFuture.this;
                        State state5 = State.CLOSED;
                        Preconditions.m11195s(closingFuture3.f22137a.compareAndSet(state4, state5), "Expected state to be %s, but it was %s", state4, state5);
                    }
                }, DirectExecutor.INSTANCE);
                return;
            }
            int ordinal = this.f22137a.get().ordinal();
            if (ordinal == 0) {
                throw new AssertionError();
            }
            if (ordinal == 1) {
                throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
            }
            if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
                throw new IllegalStateException("Cannot call finishToFuture() twice");
            }
            if (ordinal == 5) {
                throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
            }
        }
    }

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("state", this.f22137a.get());
        m11166b.m11172f(this.f22139c);
        return m11166b.toString();
    }
}
