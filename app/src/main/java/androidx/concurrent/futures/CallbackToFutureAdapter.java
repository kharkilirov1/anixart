package androidx.concurrent.futures;

import androidx.annotation.NonNull;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class CallbackToFutureAdapter {

    public static final class Completer<T> {

        /* renamed from: a */
        public ResolvableFuture<Void> f1881a = new ResolvableFuture<>();

        /* renamed from: b */
        public boolean f1882b;

        public void finalize() {
            ResolvableFuture<Void> resolvableFuture;
            if (this.f1882b || (resolvableFuture = this.f1881a) == null) {
                return;
            }
            resolvableFuture.mo1143h(null);
        }
    }

    public static final class FutureGarbageCollectedException extends Throwable {
        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public interface Resolver<T> {
    }

    public static final class SafeFuture<T> implements ListenableFuture<T> {

        /* renamed from: androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture$1 */
        public class C01751 extends AbstractResolvableFuture<T> {
            @Override // androidx.concurrent.futures.AbstractResolvableFuture
            /* renamed from: f */
            public String mo1141f() {
                Objects.requireNonNull(null);
                throw null;
            }
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            throw null;
        }

        @Override // java.util.concurrent.Future
        public T get() throws InterruptedException, ExecutionException {
            throw null;
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            throw null;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            throw null;
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        /* renamed from: r */
        public void mo1145r(@NonNull Runnable runnable, @NonNull Executor executor) {
            throw null;
        }

        public String toString() {
            throw null;
        }

        @Override // java.util.concurrent.Future
        public T get(long j2, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            throw null;
        }
    }
}
