package kotlinx.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Cancellable.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class CancellableKt {
    /* renamed from: a */
    public static final void m34347a(Continuation<?> continuation, Throwable th) {
        continuation.mo31877j(ResultKt.m31891a(th));
        throw th;
    }

    /* renamed from: b */
    public static final void m34348b(@NotNull Continuation<? super Unit> continuation, @NotNull Continuation<?> continuation2) {
        try {
            DispatchedContinuationKt.m34280a(IntrinsicsKt.m32122b(continuation), Unit.f63088a, null);
        } catch (Throwable th) {
            m34347a(continuation2, th);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InternalCoroutinesApi
    /* renamed from: c */
    public static final <T> void m34349c(@NotNull final Function1<? super Continuation<? super T>, ? extends Object> function1, @NotNull final Continuation<? super T> completion) {
        Continuation<Unit> continuation;
        try {
            Intrinsics.m32179h(function1, "<this>");
            Intrinsics.m32179h(completion, "completion");
            if (function1 instanceof BaseContinuationImpl) {
                continuation = ((BaseContinuationImpl) function1).mo32123l(completion);
            } else {
                final CoroutineContext f66928c = completion.getF66928c();
                continuation = f66928c == EmptyCoroutineContext.f63224b ? new RestrictedContinuationImpl(completion) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1

                    /* renamed from: c */
                    public int f63230c;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    /* renamed from: m */
                    public Object mo2379m(@NotNull Object obj) {
                        int i2 = this.f63230c;
                        if (i2 != 0) {
                            if (i2 != 1) {
                                throw new IllegalStateException("This coroutine had already completed".toString());
                            }
                            this.f63230c = 2;
                            ResultKt.m31892b(obj);
                            return obj;
                        }
                        this.f63230c = 1;
                        ResultKt.m31892b(obj);
                        Intrinsics.m32177f(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                        Function1 function12 = function1;
                        TypeIntrinsics.m32215d(function12, 1);
                        return function12.invoke(this);
                    }
                } : new ContinuationImpl(completion, f66928c) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2

                    /* renamed from: e */
                    public int f63232e;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    /* renamed from: m */
                    public Object mo2379m(@NotNull Object obj) {
                        int i2 = this.f63232e;
                        if (i2 != 0) {
                            if (i2 != 1) {
                                throw new IllegalStateException("This coroutine had already completed".toString());
                            }
                            this.f63232e = 2;
                            ResultKt.m31892b(obj);
                            return obj;
                        }
                        this.f63232e = 1;
                        ResultKt.m31892b(obj);
                        Intrinsics.m32177f(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                        Function1 function12 = function1;
                        TypeIntrinsics.m32215d(function12, 1);
                        return function12.invoke(this);
                    }
                };
            }
            DispatchedContinuationKt.m34280a(IntrinsicsKt.m32122b(continuation), Unit.f63088a, null);
        } catch (Throwable th) {
            m34347a(completion, th);
            throw null;
        }
    }

    /* renamed from: d */
    public static final <R, T> void m34350d(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, @NotNull Continuation<? super T> continuation, @Nullable Function1<? super Throwable, Unit> function1) {
        try {
            DispatchedContinuationKt.m34280a(IntrinsicsKt.m32122b(IntrinsicsKt.m32121a(function2, r, continuation)), Unit.f63088a, function1);
        } catch (Throwable th) {
            m34347a(continuation, th);
            throw null;
        }
    }
}
