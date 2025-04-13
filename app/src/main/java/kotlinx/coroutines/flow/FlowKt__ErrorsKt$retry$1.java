package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Errors.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m31884d2 = {"T", "", "it", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", m32126f = "Errors.kt", m32127l = {}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlowKt__ErrorsKt$retry$1 extends SuspendLambda implements Function2<Throwable, Continuation<? super Boolean>, Object> {
    public FlowKt__ErrorsKt$retry$1(Continuation<? super FlowKt__ErrorsKt$retry$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FlowKt__ErrorsKt$retry$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Throwable th, Continuation<? super Boolean> continuation) {
        new FlowKt__ErrorsKt$retry$1(continuation);
        ResultKt.m31892b(Unit.f63088a);
        return Boolean.TRUE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        ResultKt.m31892b(obj);
        return Boolean.TRUE;
    }
}
