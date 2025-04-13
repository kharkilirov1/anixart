package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: PausingDispatcher.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m31884d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 4, 1})
@DebugMetadata(m32125c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", m32126f = "PausingDispatcher.kt", m32127l = {162}, m32128m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PausingDispatcherKt$whenStateAtLeast$2<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {

    /* renamed from: f */
    public /* synthetic */ Object f4635f;

    /* renamed from: g */
    public int f4636g;

    /* renamed from: h */
    public final /* synthetic */ Lifecycle f4637h;

    /* renamed from: i */
    public final /* synthetic */ Lifecycle.State f4638i;

    /* renamed from: j */
    public final /* synthetic */ Function2 f4639j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f4637h = lifecycle;
        this.f4638i = state;
        this.f4639j = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> completion) {
        Intrinsics.m32179h(completion, "completion");
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.f4637h, this.f4638i, this.f4639j, completion);
        pausingDispatcherKt$whenStateAtLeast$2.f4635f = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Object obj) {
        Continuation completion = (Continuation) obj;
        Intrinsics.m32179h(completion, "completion");
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.f4637h, this.f4638i, this.f4639j, completion);
        pausingDispatcherKt$whenStateAtLeast$2.f4635f = coroutineScope;
        return pausingDispatcherKt$whenStateAtLeast$2.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        LifecycleController lifecycleController;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f4636g;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            CoroutineContext f68244b = ((CoroutineScope) this.f4635f).getF68244b();
            int i3 = Job.f67018J1;
            Job job = (Job) f68244b.get(Job.Key.f67019b);
            if (job == null) {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
            PausingDispatcher pausingDispatcher = new PausingDispatcher();
            LifecycleController lifecycleController2 = new LifecycleController(this.f4637h, this.f4638i, pausingDispatcher.f4634c, job);
            try {
                Function2 function2 = this.f4639j;
                this.f4635f = lifecycleController2;
                this.f4636g = 1;
                obj = BuildersKt.m33963b(pausingDispatcher, function2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                lifecycleController = lifecycleController2;
            } catch (Throwable th) {
                th = th;
                lifecycleController = lifecycleController2;
                lifecycleController.m3194a();
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lifecycleController = (LifecycleController) this.f4635f;
            try {
                ResultKt.m31892b(obj);
            } catch (Throwable th2) {
                th = th2;
                lifecycleController.m3194a();
                throw th;
            }
        }
        lifecycleController.m3194a();
        return obj;
    }
}
