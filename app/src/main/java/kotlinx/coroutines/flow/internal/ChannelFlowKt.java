package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChannelFlow.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class ChannelFlowKt {
    @Nullable
    /* renamed from: a */
    public static final <T, V> Object m34254a(@NotNull CoroutineContext coroutineContext, V v, @NotNull Object obj, @NotNull Function2<? super V, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> frame) {
        Object m34338c = ThreadContextKt.m34338c(coroutineContext, obj);
        try {
            StackFrameContinuation stackFrameContinuation = new StackFrameContinuation(frame, coroutineContext);
            TypeIntrinsics.m32215d(function2, 2);
            Object invoke = function2.invoke(v, stackFrameContinuation);
            ThreadContextKt.m34336a(coroutineContext, m34338c);
            if (invoke == CoroutineSingletons.COROUTINE_SUSPENDED) {
                Intrinsics.m32179h(frame, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            ThreadContextKt.m34336a(coroutineContext, m34338c);
            throw th;
        }
    }
}
