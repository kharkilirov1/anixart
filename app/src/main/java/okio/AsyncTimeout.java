package okio;

import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: AsyncTimeout.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0004J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\fH\u0014J%\u0010\u0016\u001a\u0002H\u0017\"\u0004\b\u0000\u0010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0019H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, m31884d2 = {"Lokio/AsyncTimeout;", "Lokio/Timeout;", "()V", "inQueue", "", "next", "timeoutAt", "", "access$newTimeoutException", "Ljava/io/IOException;", "cause", "enter", "", "exit", "newTimeoutException", "remainingNanos", "now", "sink", "Lokio/Sink;", "source", "Lokio/Source;", "timedOut", "withTimeout", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Companion", "Watchdog", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class AsyncTimeout extends Timeout {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static AsyncTimeout head;
    private boolean inQueue;
    private AsyncTimeout next;
    private long timeoutAt;

    /* compiled from: AsyncTimeout.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m31884d2 = {"Lokio/AsyncTimeout$Companion;", "", "", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "", "TIMEOUT_WRITE_SIZE", "I", "Lokio/AsyncTimeout;", "head", "Lokio/AsyncTimeout;", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        @Nullable
        /* renamed from: a */
        public final AsyncTimeout m34513a() throws InterruptedException {
            AsyncTimeout asyncTimeout = AsyncTimeout.head;
            Intrinsics.m32176e(asyncTimeout);
            AsyncTimeout asyncTimeout2 = asyncTimeout.next;
            if (asyncTimeout2 == null) {
                long nanoTime = System.nanoTime();
                AsyncTimeout.class.wait(AsyncTimeout.IDLE_TIMEOUT_MILLIS);
                AsyncTimeout asyncTimeout3 = AsyncTimeout.head;
                Intrinsics.m32176e(asyncTimeout3);
                if (asyncTimeout3.next != null || System.nanoTime() - nanoTime < AsyncTimeout.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return AsyncTimeout.head;
            }
            long remainingNanos = asyncTimeout2.remainingNanos(System.nanoTime());
            if (remainingNanos > 0) {
                long j2 = remainingNanos / 1000000;
                AsyncTimeout.class.wait(j2, (int) (remainingNanos - (1000000 * j2)));
                return null;
            }
            AsyncTimeout asyncTimeout4 = AsyncTimeout.head;
            Intrinsics.m32176e(asyncTimeout4);
            asyncTimeout4.next = asyncTimeout2.next;
            asyncTimeout2.next = null;
            return asyncTimeout2;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: AsyncTimeout.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lokio/AsyncTimeout$Watchdog;", "Ljava/lang/Thread;", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Watchdog extends Thread {
        public Watchdog() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AsyncTimeout m34513a;
            while (true) {
                try {
                    synchronized (AsyncTimeout.class) {
                        m34513a = AsyncTimeout.INSTANCE.m34513a();
                        if (m34513a == AsyncTimeout.head) {
                            AsyncTimeout.head = null;
                            return;
                        }
                    }
                    if (m34513a != null) {
                        m34513a.timedOut();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long now) {
        return this.timeoutAt - now;
    }

    @PublishedApi
    @NotNull
    public final IOException access$newTimeoutException(@Nullable IOException cause) {
        return newTimeoutException(cause);
    }

    public final void enter() {
        if (!(!this.inQueue)) {
            throw new IllegalStateException("Unbalanced enter/exit".toString());
        }
        long timeoutNanos = getTimeoutNanos();
        boolean hasDeadline = getHasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            this.inQueue = true;
            Objects.requireNonNull(INSTANCE);
            synchronized (AsyncTimeout.class) {
                if (head == null) {
                    head = new AsyncTimeout();
                    new Watchdog().start();
                }
                long nanoTime = System.nanoTime();
                if (timeoutNanos != 0 && hasDeadline) {
                    this.timeoutAt = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime) + nanoTime;
                } else if (timeoutNanos != 0) {
                    this.timeoutAt = timeoutNanos + nanoTime;
                } else {
                    if (!hasDeadline) {
                        throw new AssertionError();
                    }
                    this.timeoutAt = deadlineNanoTime();
                }
                long remainingNanos = remainingNanos(nanoTime);
                AsyncTimeout asyncTimeout = head;
                Intrinsics.m32176e(asyncTimeout);
                while (asyncTimeout.next != null) {
                    AsyncTimeout asyncTimeout2 = asyncTimeout.next;
                    Intrinsics.m32176e(asyncTimeout2);
                    if (remainingNanos < asyncTimeout2.remainingNanos(nanoTime)) {
                        break;
                    }
                    asyncTimeout = asyncTimeout.next;
                    Intrinsics.m32176e(asyncTimeout);
                }
                this.next = asyncTimeout.next;
                asyncTimeout.next = this;
                if (asyncTimeout == head) {
                    AsyncTimeout.class.notify();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        r2.next = r4.next;
        r4.next = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean exit() {
        /*
            r4 = this;
            boolean r0 = r4.inQueue
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r4.inQueue = r1
            okio.AsyncTimeout$Companion r0 = okio.AsyncTimeout.INSTANCE
            java.util.Objects.requireNonNull(r0)
            java.lang.Class<okio.AsyncTimeout> r0 = okio.AsyncTimeout.class
            monitor-enter(r0)
            okio.AsyncTimeout r2 = access$getHead$cp()     // Catch: java.lang.Throwable -> L31
        L14:
            if (r2 == 0) goto L2e
            okio.AsyncTimeout r3 = access$getNext$p(r2)     // Catch: java.lang.Throwable -> L31
            if (r3 != r4) goto L29
            okio.AsyncTimeout r3 = access$getNext$p(r4)     // Catch: java.lang.Throwable -> L31
            access$setNext$p(r2, r3)     // Catch: java.lang.Throwable -> L31
            r2 = 0
            access$setNext$p(r4, r2)     // Catch: java.lang.Throwable -> L31
            monitor-exit(r0)
            goto L30
        L29:
            okio.AsyncTimeout r2 = access$getNext$p(r2)     // Catch: java.lang.Throwable -> L31
            goto L14
        L2e:
            r1 = 1
            monitor-exit(r0)
        L30:
            return r1
        L31:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.AsyncTimeout.exit():boolean");
    }

    @NotNull
    public IOException newTimeoutException(@Nullable IOException cause) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    @NotNull
    public final Sink sink(@NotNull final Sink sink) {
        Intrinsics.m32179h(sink, "sink");
        return new Sink() { // from class: okio.AsyncTimeout$sink$1
            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                asyncTimeout.enter();
                try {
                    sink.close();
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                } catch (IOException e2) {
                    if (!asyncTimeout.exit()) {
                        throw e2;
                    }
                    throw asyncTimeout.access$newTimeoutException(e2);
                } finally {
                    asyncTimeout.exit();
                }
            }

            @Override // okio.Sink, java.io.Flushable
            public void flush() {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                asyncTimeout.enter();
                try {
                    sink.flush();
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                } catch (IOException e2) {
                    if (!asyncTimeout.exit()) {
                        throw e2;
                    }
                    throw asyncTimeout.access$newTimeoutException(e2);
                } finally {
                    asyncTimeout.exit();
                }
            }

            @Override // okio.Sink
            public Timeout timeout() {
                return AsyncTimeout.this;
            }

            @NotNull
            public String toString() {
                StringBuilder m24u = C0000a.m24u("AsyncTimeout.sink(");
                m24u.append(sink);
                m24u.append(')');
                return m24u.toString();
            }

            @Override // okio.Sink
            public void write(@NotNull Buffer source, long j2) {
                Intrinsics.m32179h(source, "source");
                Util.m34510b(source.f68742c, 0L, j2);
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    Segment segment = source.f68741b;
                    Intrinsics.m32176e(segment);
                    while (true) {
                        if (j3 >= TextBuffer.MAX_SEGMENT_LEN) {
                            break;
                        }
                        j3 += segment.f68795c - segment.f68794b;
                        if (j3 >= j2) {
                            j3 = j2;
                            break;
                        } else {
                            segment = segment.f68798f;
                            Intrinsics.m32176e(segment);
                        }
                    }
                    AsyncTimeout asyncTimeout = AsyncTimeout.this;
                    asyncTimeout.enter();
                    try {
                        sink.write(source, j3);
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                        j2 -= j3;
                    } catch (IOException e2) {
                        if (!asyncTimeout.exit()) {
                            throw e2;
                        }
                        throw asyncTimeout.access$newTimeoutException(e2);
                    } finally {
                        asyncTimeout.exit();
                    }
                }
            }
        };
    }

    @NotNull
    public final Source source(@NotNull final Source source) {
        Intrinsics.m32179h(source, "source");
        return new Source() { // from class: okio.AsyncTimeout$source$1
            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                asyncTimeout.enter();
                try {
                    source.close();
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                } catch (IOException e2) {
                    if (!asyncTimeout.exit()) {
                        throw e2;
                    }
                    throw asyncTimeout.access$newTimeoutException(e2);
                } finally {
                    asyncTimeout.exit();
                }
            }

            @Override // okio.Source
            public long read(@NotNull Buffer sink, long j2) {
                Intrinsics.m32179h(sink, "sink");
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                asyncTimeout.enter();
                try {
                    long read = source.read(sink, j2);
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                    return read;
                } catch (IOException e2) {
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(e2);
                    }
                    throw e2;
                } finally {
                    asyncTimeout.exit();
                }
            }

            @Override // okio.Source
            public Timeout timeout() {
                return AsyncTimeout.this;
            }

            @NotNull
            public String toString() {
                StringBuilder m24u = C0000a.m24u("AsyncTimeout.source(");
                m24u.append(source);
                m24u.append(')');
                return m24u.toString();
            }
        };
    }

    public void timedOut() {
    }

    public final <T> T withTimeout(@NotNull Function0<? extends T> block) {
        Intrinsics.m32179h(block, "block");
        enter();
        try {
            T invoke = block.invoke();
            if (exit()) {
                throw access$newTimeoutException(null);
            }
            return invoke;
        } catch (IOException e2) {
            if (exit()) {
                throw access$newTimeoutException(e2);
            }
            throw e2;
        } finally {
            exit();
        }
    }
}
