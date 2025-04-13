package androidx.lifecycle;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Lifecycle.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m31884d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 4, 1})
@DebugMetadata(m32125c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", m32126f = "Lifecycle.kt", m32127l = {}, m32128m = "invokeSuspend")
/* loaded from: classes.dex */
final class LifecycleCoroutineScopeImpl$register$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public /* synthetic */ Object f4597f;

    /* renamed from: g */
    public final /* synthetic */ LifecycleCoroutineScopeImpl f4598g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScopeImpl$register$1(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, Continuation continuation) {
        super(2, continuation);
        this.f4598g = lifecycleCoroutineScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> completion) {
        Intrinsics.m32179h(completion, "completion");
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = new LifecycleCoroutineScopeImpl$register$1(this.f4598g, completion);
        lifecycleCoroutineScopeImpl$register$1.f4597f = obj;
        return lifecycleCoroutineScopeImpl$register$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> completion = continuation;
        Intrinsics.m32179h(completion, "completion");
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.f4598g;
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = new LifecycleCoroutineScopeImpl$register$1(lifecycleCoroutineScopeImpl, completion);
        lifecycleCoroutineScopeImpl$register$1.f4597f = coroutineScope;
        ResultKt.m31892b(Unit.f63088a);
        Objects.requireNonNull(lifecycleCoroutineScopeImpl);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        ResultKt.m31892b(obj);
        Objects.requireNonNull(this.f4598g);
        throw null;
    }
}
