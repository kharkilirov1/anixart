package kotlin.coroutines.intrinsics;

import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m31883d1 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt", "kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsKt"}, m31885k = 4, m31886mv = {1, 7, 1}, m31888xi = C4632R.styleable.AppCompatTheme_checkedTextViewStyle)
/* loaded from: classes3.dex */
public final class IntrinsicsKt extends IntrinsicsKt__IntrinsicsKt {
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin
    @NotNull
    /* renamed from: a */
    public static Continuation m32121a(@NotNull final Function2 function2, final Object obj, @NotNull final Continuation completion) {
        Intrinsics.m32179h(function2, "<this>");
        Intrinsics.m32179h(completion, "completion");
        if (function2 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) function2).mo2378a(obj, completion);
        }
        final CoroutineContext f66944f = completion.getF66944f();
        return f66944f == EmptyCoroutineContext.f63224b ? new RestrictedContinuationImpl(completion) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3

            /* renamed from: c */
            public int f63234c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            /* renamed from: m */
            public Object mo2379m(@NotNull Object obj2) {
                int i2 = this.f63234c;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("This coroutine had already completed".toString());
                    }
                    this.f63234c = 2;
                    ResultKt.m31892b(obj2);
                    return obj2;
                }
                this.f63234c = 1;
                ResultKt.m31892b(obj2);
                Intrinsics.m32177f(function2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                Function2 function22 = function2;
                TypeIntrinsics.m32215d(function22, 2);
                return function22.invoke(obj, this);
            }
        } : new ContinuationImpl(completion, f66944f) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4

            /* renamed from: e */
            public int f63237e;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            /* renamed from: m */
            public Object mo2379m(@NotNull Object obj2) {
                int i2 = this.f63237e;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("This coroutine had already completed".toString());
                    }
                    this.f63237e = 2;
                    ResultKt.m31892b(obj2);
                    return obj2;
                }
                this.f63237e = 1;
                ResultKt.m31892b(obj2);
                Intrinsics.m32177f(function2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                Function2 function22 = function2;
                TypeIntrinsics.m32215d(function22, 2);
                return function22.invoke(obj, this);
            }
        };
    }

    @SinceKotlin
    @NotNull
    /* renamed from: b */
    public static Continuation m32122b(@NotNull Continuation continuation) {
        Intrinsics.m32179h(continuation, "<this>");
        ContinuationImpl continuationImpl = continuation instanceof ContinuationImpl ? (ContinuationImpl) continuation : null;
        if (continuationImpl != null && (continuation = continuationImpl.f63245d) == null) {
            CoroutineContext f66944f = continuationImpl.getF66944f();
            int i2 = ContinuationInterceptor.f63221G1;
            ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) f66944f.get(ContinuationInterceptor.Key.f63222b);
            if (continuationInterceptor == null || (continuation = continuationInterceptor.mo32113e(continuationImpl)) == null) {
                continuation = continuationImpl;
            }
            continuationImpl.f63245d = continuation;
        }
        return continuation;
    }
}
