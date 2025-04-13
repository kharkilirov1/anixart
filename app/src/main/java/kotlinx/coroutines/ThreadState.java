package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Interruptible.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007¨\u0006\b"}, m31884d2 = {"Lkotlinx/coroutines/ThreadState;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class ThreadState implements Function1<Throwable, Unit> {

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f67055e = AtomicIntegerFieldUpdater.newUpdater(ThreadState.class, "_state");

    /* renamed from: b */
    @NotNull
    public final Job f67056b;

    /* renamed from: d */
    @Nullable
    public DisposableHandle f67058d;

    @NotNull
    private volatile /* synthetic */ int _state = 0;

    /* renamed from: c */
    public final Thread f67057c = Thread.currentThread();

    public ThreadState(@NotNull Job job) {
        this.f67056b = job;
    }

    /* renamed from: a */
    public final void m34118a() {
        while (true) {
            int i2 = this._state;
            if (i2 != 0) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m34119b(i2);
                        throw null;
                    }
                }
            } else if (f67055e.compareAndSet(this, i2, 1)) {
                DisposableHandle disposableHandle = this.f67058d;
                if (disposableHandle == null) {
                    return;
                }
                disposableHandle.mo34038f();
                return;
            }
        }
    }

    /* renamed from: b */
    public final Void m34119b(int i2) {
        throw new IllegalStateException(Intrinsics.m32187p("Illegal state ", Integer.valueOf(i2)).toString());
    }

    /* renamed from: c */
    public final void m34120c() {
        int i2;
        this.f67058d = this.f67056b.mo34063n(true, true, this);
        do {
            i2 = this._state;
            if (i2 != 0) {
                if (i2 == 2 || i2 == 3) {
                    return;
                }
                m34119b(i2);
                throw null;
            }
        } while (!f67055e.compareAndSet(this, i2, 0));
    }

    @Override // kotlin.jvm.functions.Function1
    public Unit invoke(Throwable th) {
        while (true) {
            int i2 = this._state;
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2 && i2 != 3) {
                    m34119b(i2);
                    throw null;
                }
            } else if (f67055e.compareAndSet(this, i2, 2)) {
                this.f67057c.interrupt();
                this._state = 3;
                break;
            }
        }
        return Unit.f63088a;
    }
}
