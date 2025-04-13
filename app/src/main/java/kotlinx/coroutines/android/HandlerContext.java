package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.NonDisposableHandle;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HandlerDispatcher.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlinx/coroutines/android/HandlerContext;", "Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/Delay;", "_immediate", "Lkotlinx/coroutines/android/HandlerContext;", "kotlinx-coroutines-android"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class HandlerContext extends HandlerDispatcher {

    @Nullable
    private volatile HandlerContext _immediate;

    /* renamed from: c */
    @NotNull
    public final Handler f67070c;

    /* renamed from: d */
    @Nullable
    public final String f67071d;

    /* renamed from: e */
    public final boolean f67072e;

    /* renamed from: f */
    @NotNull
    public final HandlerContext f67073f;

    public HandlerContext(Handler handler, String str, boolean z) {
        super(null);
        this.f67070c = handler;
        this.f67071d = str;
        this.f67072e = z;
        this._immediate = z ? this : null;
        HandlerContext handlerContext = this._immediate;
        if (handlerContext == null) {
            handlerContext = new HandlerContext(handler, str, true);
            this._immediate = handlerContext;
        }
        this.f67073f = handlerContext;
    }

    /* renamed from: Z */
    public final void m34122Z(CoroutineContext coroutineContext, Runnable runnable) {
        JobKt.m34070b(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        Objects.requireNonNull((DefaultIoScheduler) Dispatchers.f66989b);
        DefaultIoScheduler.f68347d.mo3221m(coroutineContext, runnable);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof HandlerContext) && ((HandlerContext) obj).f67070c == this.f67070c;
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: g */
    public void mo34030g(long j2, @NotNull final CancellableContinuation<? super Unit> cancellableContinuation) {
        final Runnable runnable = new Runnable() { // from class: kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                CancellableContinuation.this.mo33969x(this, Unit.f63088a);
            }
        };
        if (this.f67070c.postDelayed(runnable, RangesKt.m32237d(j2, 4611686018427387903L))) {
            cancellableContinuation.mo33966r(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Throwable th) {
                    HandlerContext.this.f67070c.removeCallbacks(runnable);
                    return Unit.f63088a;
                }
            });
        } else {
            m34122Z(cancellableContinuation.getF66944f(), runnable);
        }
    }

    public int hashCode() {
        return System.identityHashCode(this.f67070c);
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.Delay
    @NotNull
    /* renamed from: l */
    public DisposableHandle mo34028l(long j2, @NotNull final Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        if (this.f67070c.postDelayed(runnable, RangesKt.m32237d(j2, 4611686018427387903L))) {
            return new DisposableHandle() { // from class: kotlinx.coroutines.android.a
                @Override // kotlinx.coroutines.DisposableHandle
                /* renamed from: f */
                public final void mo34038f() {
                    HandlerContext handlerContext = HandlerContext.this;
                    handlerContext.f67070c.removeCallbacks(runnable);
                }
            };
        }
        m34122Z(coroutineContext, runnable);
        return NonDisposableHandle.f67044b;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: m */
    public void mo3221m(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        if (this.f67070c.post(runnable)) {
            return;
        }
        m34122Z(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: q */
    public boolean mo3222q(@NotNull CoroutineContext coroutineContext) {
        return (this.f67072e && Intrinsics.m32174c(Looper.myLooper(), this.f67070c.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        String m34116w = m34116w();
        if (m34116w != null) {
            return m34116w;
        }
        String str = this.f67071d;
        if (str == null) {
            str = this.f67070c.toString();
        }
        return this.f67072e ? Intrinsics.m32187p(str, ".immediate") : str;
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    /* renamed from: v */
    public MainCoroutineDispatcher mo34115v() {
        return this.f67073f;
    }
}
