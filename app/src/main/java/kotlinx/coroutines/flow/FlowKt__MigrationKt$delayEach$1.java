package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Migration.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, m31884d2 = {"T", "it", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", m32126f = "Migration.kt", m32127l = {427}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlowKt__MigrationKt$delayEach$1 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f67747f;

    /* renamed from: g */
    public final /* synthetic */ long f67748g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MigrationKt$delayEach$1(long j2, Continuation<? super FlowKt__MigrationKt$delayEach$1> continuation) {
        super(2, continuation);
        this.f67748g = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FlowKt__MigrationKt$delayEach$1(this.f67748g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return new FlowKt__MigrationKt$delayEach$1(this.f67748g, continuation).mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f67747f;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            long j2 = this.f67748g;
            this.f67747f = 1;
            if (DelayKt.m34032a(j2, this) == coroutineSingletons) {
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
