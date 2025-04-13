package kotlinx.coroutines.flow;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SharingStarted.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m31884d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/coroutines/flow/SharingCommand;", "", "count", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", m32126f = "SharingStarted.kt", m32127l = {178, 180, 182, 183, 185}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class StartedWhileSubscribed$command$1 extends SuspendLambda implements Function3<FlowCollector<? super SharingCommand>, Integer, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public int f68059f;

    /* renamed from: g */
    public /* synthetic */ Object f68060g;

    /* renamed from: h */
    public /* synthetic */ int f68061h;

    /* renamed from: i */
    public final /* synthetic */ StartedWhileSubscribed f68062i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedWhileSubscribed$command$1(StartedWhileSubscribed startedWhileSubscribed, Continuation<? super StartedWhileSubscribed$command$1> continuation) {
        super(3, continuation);
        this.f68062i = startedWhileSubscribed;
    }

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: k */
    public Object mo16505k(FlowCollector<? super SharingCommand> flowCollector, Integer num, Continuation<? super Unit> continuation) {
        int intValue = num.intValue();
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.f68062i, continuation);
        startedWhileSubscribed$command$1.f68060g = flowCollector;
        startedWhileSubscribed$command$1.f68061h = intValue;
        return startedWhileSubscribed$command$1.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        FlowCollector flowCollector;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f68059f;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    flowCollector = (FlowCollector) this.f68060g;
                    ResultKt.m31892b(obj);
                    Objects.requireNonNull(this.f68062i);
                } else if (i2 == 3) {
                    flowCollector = (FlowCollector) this.f68060g;
                    ResultKt.m31892b(obj);
                    Objects.requireNonNull(this.f68062i);
                    this.f68060g = flowCollector;
                    this.f68059f = 4;
                    if (DelayKt.m34032a(0L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i2 == 4) {
                    flowCollector = (FlowCollector) this.f68060g;
                    ResultKt.m31892b(obj);
                } else if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.m31892b(obj);
            return Unit.f63088a;
        }
        ResultKt.m31892b(obj);
        FlowCollector flowCollector2 = (FlowCollector) this.f68060g;
        if (this.f68061h > 0) {
            SharingCommand sharingCommand = SharingCommand.START;
            this.f68059f = 1;
            if (flowCollector2.mo4139f(sharingCommand, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return Unit.f63088a;
        }
        Objects.requireNonNull(this.f68062i);
        this.f68060g = flowCollector2;
        this.f68059f = 2;
        if (DelayKt.m34032a(0L, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        flowCollector = flowCollector2;
        Objects.requireNonNull(this.f68062i);
        SharingCommand sharingCommand2 = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
        this.f68060g = null;
        this.f68059f = 5;
        if (flowCollector.mo4139f(sharingCommand2, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return Unit.f63088a;
    }
}
