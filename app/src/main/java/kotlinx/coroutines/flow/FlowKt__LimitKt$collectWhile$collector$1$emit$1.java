package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Limit.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 176)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1", m32126f = "Limit.kt", m32127l = {131}, m32128m = "emit")
/* loaded from: classes3.dex */
public final class FlowKt__LimitKt$collectWhile$collector$1$emit$1 extends ContinuationImpl {

    /* renamed from: e */
    public Object f67687e;

    /* renamed from: f */
    public /* synthetic */ Object f67688f;

    /* renamed from: g */
    public final /* synthetic */ FlowKt__LimitKt$collectWhile$collector$1 f67689g;

    /* renamed from: h */
    public int f67690h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$collectWhile$collector$1$emit$1(FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1, Continuation<? super FlowKt__LimitKt$collectWhile$collector$1$emit$1> continuation) {
        super(continuation);
        this.f67689g = flowKt__LimitKt$collectWhile$collector$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f67688f = obj;
        this.f67690h |= Integer.MIN_VALUE;
        return this.f67689g.mo4139f(null, this);
    }
}
