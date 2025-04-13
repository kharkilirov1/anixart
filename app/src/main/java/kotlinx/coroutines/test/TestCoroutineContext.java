package kotlinx.coroutines.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: TestCoroutineContext.kt */
@Deprecated
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/test/TestCoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "Dispatcher", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class TestCoroutineContext implements CoroutineContext {

    /* renamed from: b */
    @Nullable
    public final String f68449b = null;

    /* renamed from: c */
    @NotNull
    public final List<Throwable> f68450c = new ArrayList();

    /* renamed from: d */
    @NotNull
    public final Dispatcher f68451d = new Dispatcher();

    /* renamed from: e */
    @NotNull
    public final CoroutineExceptionHandler f68452e;

    /* renamed from: f */
    @NotNull
    public final ThreadSafeHeap<TimedRunnableObsolete> f68453f;

    /* renamed from: g */
    public long f68454g;

    /* compiled from: TestCoroutineContext.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/test/TestCoroutineContext$Dispatcher;", "Lkotlinx/coroutines/EventLoop;", "Lkotlinx/coroutines/Delay;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public final class Dispatcher extends EventLoop implements Delay {
        public Dispatcher() {
            m34042b0(false);
        }

        @Override // kotlinx.coroutines.Delay
        /* renamed from: g */
        public void mo34030g(long j2, @NotNull final CancellableContinuation<? super Unit> cancellableContinuation) {
            TestCoroutineContext.m34404d(TestCoroutineContext.this, new Runnable() { // from class: kotlinx.coroutines.test.TestCoroutineContext$Dispatcher$scheduleResumeAfterDelay$$inlined$Runnable$1
                @Override // java.lang.Runnable
                public final void run() {
                    CancellableContinuation.this.mo33969x(this, Unit.f63088a);
                }
            }, j2);
        }

        @Override // kotlinx.coroutines.Delay
        @NotNull
        /* renamed from: l */
        public DisposableHandle mo34028l(long j2, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
            final TimedRunnableObsolete m34404d = TestCoroutineContext.m34404d(TestCoroutineContext.this, runnable, j2);
            final TestCoroutineContext testCoroutineContext = TestCoroutineContext.this;
            return new DisposableHandle() { // from class: kotlinx.coroutines.test.TestCoroutineContext$Dispatcher$invokeOnTimeout$1
                @Override // kotlinx.coroutines.DisposableHandle
                /* renamed from: f */
                public void mo34038f() {
                    TestCoroutineContext.this.f68453f.m34342d(m34404d);
                }
            };
        }

        @Override // kotlinx.coroutines.CoroutineDispatcher
        /* renamed from: m */
        public void mo3221m(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
            TestCoroutineContext testCoroutineContext = TestCoroutineContext.this;
            ThreadSafeHeap<TimedRunnableObsolete> threadSafeHeap = testCoroutineContext.f68453f;
            long j2 = testCoroutineContext.f68454g;
            testCoroutineContext.f68454g = 1 + j2;
            TimedRunnableObsolete timedRunnableObsolete = new TimedRunnableObsolete(runnable, j2, 0L, 4);
            synchronized (threadSafeHeap) {
                threadSafeHeap.m34339a(timedRunnableObsolete);
            }
        }

        @Override // kotlinx.coroutines.CoroutineDispatcher
        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("Dispatcher(");
            m24u.append(TestCoroutineContext.this);
            m24u.append(')');
            return m24u.toString();
        }
    }

    public TestCoroutineContext() {
        int i2 = CoroutineExceptionHandler.f66965I1;
        this.f68452e = new C6854x227a8509(CoroutineExceptionHandler.Key.f66966b, this);
        this.f68453f = new ThreadSafeHeap<>();
    }

    /* renamed from: d */
    public static final TimedRunnableObsolete m34404d(TestCoroutineContext testCoroutineContext, Runnable runnable, long j2) {
        long j3 = testCoroutineContext.f68454g;
        testCoroutineContext.f68454g = 1 + j3;
        TimedRunnableObsolete timedRunnableObsolete = new TimedRunnableObsolete(runnable, j3, TimeUnit.MILLISECONDS.toNanos(j2) + 0);
        ThreadSafeHeap<TimedRunnableObsolete> threadSafeHeap = testCoroutineContext.f68453f;
        synchronized (threadSafeHeap) {
            threadSafeHeap.m34339a(timedRunnableObsolete);
        }
        return timedRunnableObsolete;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return function2.invoke(function2.invoke(r, this.f68451d), this.f68452e);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        int i2 = ContinuationInterceptor.f63221G1;
        if (key == ContinuationInterceptor.Key.f63222b) {
            return this.f68451d;
        }
        int i3 = CoroutineExceptionHandler.f66965I1;
        if (key == CoroutineExceptionHandler.Key.f66966b) {
            return this.f68452e;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        int i2 = ContinuationInterceptor.f63221G1;
        if (key == ContinuationInterceptor.Key.f63222b) {
            return this.f68452e;
        }
        int i3 = CoroutineExceptionHandler.f66965I1;
        return key == CoroutineExceptionHandler.Key.f66966b ? this.f68451d : this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.DefaultImpls.m32114a(this, coroutineContext);
    }

    @NotNull
    public String toString() {
        String str = this.f68449b;
        return str == null ? Intrinsics.m32187p("TestCoroutineContext@", DebugStringsKt.m34023b(this)) : str;
    }
}
