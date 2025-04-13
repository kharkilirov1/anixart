package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Interruptible.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m31884d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", m32126f = "Interruptible.kt", m32127l = {}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InterruptibleKt$runInterruptible$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {

    /* renamed from: f */
    public /* synthetic */ Object f67012f;

    /* renamed from: g */
    public final /* synthetic */ Function0<Object> f67013g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterruptibleKt$runInterruptible$2(Function0<Object> function0, Continuation<? super InterruptibleKt$runInterruptible$2> continuation) {
        super(2, continuation);
        this.f67013g = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        InterruptibleKt$runInterruptible$2 interruptibleKt$runInterruptible$2 = new InterruptibleKt$runInterruptible$2(this.f67013g, continuation);
        interruptibleKt$runInterruptible$2.f67012f = obj;
        return interruptibleKt$runInterruptible$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(CoroutineScope coroutineScope, Continuation<Object> continuation) {
        InterruptibleKt$runInterruptible$2 interruptibleKt$runInterruptible$2 = new InterruptibleKt$runInterruptible$2(this.f67013g, continuation);
        interruptibleKt$runInterruptible$2.f67012f = coroutineScope;
        return interruptibleKt$runInterruptible$2.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        ResultKt.m31892b(obj);
        CoroutineContext f68244b = ((CoroutineScope) this.f67012f).getF68244b();
        Function0<Object> function0 = this.f67013g;
        try {
            ThreadState threadState = new ThreadState(JobKt.m34073e(f68244b));
            threadState.m34120c();
            try {
                return function0.invoke();
            } finally {
                threadState.m34118a();
            }
        } catch (InterruptedException e2) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e2);
        }
    }
}
