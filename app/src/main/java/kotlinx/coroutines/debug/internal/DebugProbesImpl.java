package kotlinx.coroutines.debug.internal;

import java.text.SimpleDateFormat;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DebugProbesImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl;", "", "", "installations", "I", "CoroutineOwner", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class DebugProbesImpl {

    /* renamed from: a */
    @NotNull
    public static final DebugProbesImpl f67427a = new DebugProbesImpl();

    /* renamed from: b */
    @NotNull
    public static final ConcurrentWeakMap<CoroutineOwner<?>, Boolean> f67428b;

    /* renamed from: c */
    public static boolean f67429c;

    /* renamed from: d */
    @Nullable
    public static final Function1<Boolean, Unit> f67430d;

    /* renamed from: e */
    @NotNull
    public static final ConcurrentWeakMap<CoroutineStackFrame, DebugCoroutineInfoImpl> f67431e;
    private static volatile int installations;

    /* compiled from: DebugProbesImpl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class CoroutineOwner<T> implements Continuation<T>, CoroutineStackFrame {
        @Override // kotlin.coroutines.Continuation
        @NotNull
        /* renamed from: g */
        public CoroutineContext getF66928c() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        @Nullable
        /* renamed from: h */
        public CoroutineStackFrame mo32119h() {
            return null;
        }

        @Override // kotlin.coroutines.Continuation
        /* renamed from: j */
        public void mo31877j(@NotNull Object obj) {
            DebugProbesImpl debugProbesImpl = DebugProbesImpl.f67427a;
            DebugProbesImpl.f67428b.remove(this);
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        @Nullable
        /* renamed from: s */
        public StackTraceElement mo32120s() {
            return null;
        }

        @NotNull
        public String toString() {
            throw null;
        }
    }

    /* synthetic */ class SequenceNumberRefVolatile {
        public volatile long sequenceNumber;
    }

    static {
        Object m31891a;
        Object newInstance;
        new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        f67428b = new ConcurrentWeakMap<>(false);
        new ReentrantReadWriteLock();
        f67429c = true;
        try {
            newInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
        } catch (Throwable th) {
            m31891a = ResultKt.m31891a(th);
        }
        if (newInstance == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
        }
        TypeIntrinsics.m32215d(newInstance, 1);
        m31891a = (Function1) newInstance;
        if (m31891a instanceof Result.Failure) {
            m31891a = null;
        }
        f67430d = (Function1) m31891a;
        f67431e = new ConcurrentWeakMap<>(true);
        AtomicLongFieldUpdater.newUpdater(SequenceNumberRefVolatile.class, "sequenceNumber");
    }
}
