package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.ResultKt;
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

/* compiled from: Lifecycle.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m31884d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 4, 1})
@DebugMetadata(m32125c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", m32126f = "Lifecycle.kt", m32127l = {C4632R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated}, m32128m = "invokeSuspend")
/* loaded from: classes.dex */
final class LifecycleCoroutineScope$launchWhenCreated$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f4588f;

    /* renamed from: g */
    public final /* synthetic */ LifecycleCoroutineScope f4589g;

    /* renamed from: h */
    public final /* synthetic */ Function2 f4590h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScope$launchWhenCreated$1(LifecycleCoroutineScope lifecycleCoroutineScope, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f4589g = lifecycleCoroutineScope;
        this.f4590h = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> completion) {
        Intrinsics.m32179h(completion, "completion");
        return new LifecycleCoroutineScope$launchWhenCreated$1(this.f4589g, this.f4590h, completion);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> completion = continuation;
        Intrinsics.m32179h(completion, "completion");
        return new LifecycleCoroutineScope$launchWhenCreated$1(this.f4589g, this.f4590h, completion).mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f4588f;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            Lifecycle mo3195h = this.f4589g.mo3195h();
            Function2 function2 = this.f4590h;
            this.f4588f = 1;
            if (PausingDispatcherKt.m3223a(mo3195h, Lifecycle.State.CREATED, function2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m31892b(obj);
        }
        return Unit.f63088a;
    }
}
