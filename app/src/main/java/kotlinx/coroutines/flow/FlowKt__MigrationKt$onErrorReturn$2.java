package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Migration.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m31884d2 = {"T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "e", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", m32126f = "Migration.kt", m32127l = {306}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlowKt__MigrationKt$onErrorReturn$2 extends SuspendLambda implements Function3<FlowCollector<Object>, Throwable, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f67751f;

    /* renamed from: g */
    public /* synthetic */ Object f67752g;

    /* renamed from: h */
    public /* synthetic */ Object f67753h;

    /* renamed from: i */
    public final /* synthetic */ Function1<Throwable, Boolean> f67754i;

    /* renamed from: j */
    public final /* synthetic */ Object f67755j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__MigrationKt$onErrorReturn$2(Function1<? super Throwable, Boolean> function1, Object obj, Continuation<? super FlowKt__MigrationKt$onErrorReturn$2> continuation) {
        super(3, continuation);
        this.f67754i = function1;
        this.f67755j = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: k */
    public Object mo16505k(FlowCollector<Object> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        FlowKt__MigrationKt$onErrorReturn$2 flowKt__MigrationKt$onErrorReturn$2 = new FlowKt__MigrationKt$onErrorReturn$2(this.f67754i, this.f67755j, continuation);
        flowKt__MigrationKt$onErrorReturn$2.f67752g = flowCollector;
        flowKt__MigrationKt$onErrorReturn$2.f67753h = th;
        return flowKt__MigrationKt$onErrorReturn$2.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f67751f;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f67752g;
            Throwable th = (Throwable) this.f67753h;
            if (!this.f67754i.invoke(th).booleanValue()) {
                throw th;
            }
            Object obj2 = this.f67755j;
            this.f67752g = null;
            this.f67751f = 1;
            if (flowCollector.mo4139f(obj2, this) == coroutineSingletons) {
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
