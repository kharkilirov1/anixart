package kotlin.script.experimental.host;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BasicScriptingHost.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, m31884d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 1, 13})
@DebugMetadata(m32125c = "kotlin/script/experimental/host/BasicScriptingHost$runInCoroutineContext$1", m32126f = "BasicScriptingHost.kt", m32127l = {35, 35}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BasicScriptingHost$runInCoroutineContext$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {

    /* renamed from: f */
    public CoroutineScope f66635f;

    /* renamed from: g */
    public int f66636g;

    /* renamed from: h */
    public final /* synthetic */ Function2 f66637h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicScriptingHost$runInCoroutineContext$1(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f66637h = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> completion) {
        Intrinsics.m32180i(completion, "completion");
        BasicScriptingHost$runInCoroutineContext$1 basicScriptingHost$runInCoroutineContext$1 = new BasicScriptingHost$runInCoroutineContext$1(this.f66637h, completion);
        basicScriptingHost$runInCoroutineContext$1.f66635f = (CoroutineScope) obj;
        return basicScriptingHost$runInCoroutineContext$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<Object> continuation) {
        Continuation<Object> completion = continuation;
        Intrinsics.m32180i(completion, "completion");
        BasicScriptingHost$runInCoroutineContext$1 basicScriptingHost$runInCoroutineContext$1 = new BasicScriptingHost$runInCoroutineContext$1(this.f66637h, completion);
        basicScriptingHost$runInCoroutineContext$1.f66635f = coroutineScope;
        return basicScriptingHost$runInCoroutineContext$1.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f66636g;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (obj instanceof Result.Failure) {
                throw ((Result.Failure) obj).f63061b;
            }
        } else {
            if (obj instanceof Result.Failure) {
                throw ((Result.Failure) obj).f63061b;
            }
            CoroutineScope coroutineScope = this.f66635f;
            Function2 function2 = this.f66637h;
            this.f66636g = 1;
            obj = function2.invoke(coroutineScope, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
