package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Limit.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 176)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__LimitKt", m32126f = "Limit.kt", m32127l = {137}, m32128m = "collectWhile")
/* loaded from: classes3.dex */
final class FlowKt__LimitKt$collectWhile$1<T> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67683e;

    /* renamed from: f */
    public /* synthetic */ Object f67684f;

    /* renamed from: g */
    public int f67685g;

    public FlowKt__LimitKt$collectWhile$1(Continuation<? super FlowKt__LimitKt$collectWhile$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        FlowKt__LimitKt$collectWhile$1<T> flowKt__LimitKt$collectWhile$1;
        AbortFlowException e2;
        FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1;
        this.f67684f = obj;
        int i2 = this.f67685g | Integer.MIN_VALUE;
        this.f67685g = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f67685g = i2 - Integer.MIN_VALUE;
            flowKt__LimitKt$collectWhile$1 = this;
        } else {
            flowKt__LimitKt$collectWhile$1 = new FlowKt__LimitKt$collectWhile$1<>(this);
        }
        Object obj2 = flowKt__LimitKt$collectWhile$1.f67684f;
        int i3 = flowKt__LimitKt$collectWhile$1.f67685g;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowKt__LimitKt$collectWhile$collector$1 = (FlowKt__LimitKt$collectWhile$collector$1) flowKt__LimitKt$collectWhile$1.f67683e;
            try {
                ResultKt.m31892b(obj2);
            } catch (AbortFlowException e3) {
                e2 = e3;
            }
            return Unit.f63088a;
        }
        ResultKt.m31892b(obj2);
        FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$12 = new FlowKt__LimitKt$collectWhile$collector$1(null);
        try {
            flowKt__LimitKt$collectWhile$1.f67683e = flowKt__LimitKt$collectWhile$collector$12;
            flowKt__LimitKt$collectWhile$1.f67685g = 1;
            throw null;
        } catch (AbortFlowException e4) {
            e2 = e4;
            flowKt__LimitKt$collectWhile$collector$1 = flowKt__LimitKt$collectWhile$collector$12;
        }
        if (e2.f68087b != flowKt__LimitKt$collectWhile$collector$1) {
            throw e2;
        }
        return Unit.f63088a;
    }
}
