package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Reduce.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 176)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2", m32126f = "Reduce.kt", m32127l = {45}, m32128m = "emit")
/* loaded from: classes3.dex */
public final class FlowKt__ReduceKt$fold$2$emit$1 extends ContinuationImpl {

    /* renamed from: e */
    public Object f67795e;

    /* renamed from: f */
    public /* synthetic */ Object f67796f;

    /* renamed from: g */
    public final /* synthetic */ FlowKt__ReduceKt$fold$2<T> f67797g;

    /* renamed from: h */
    public int f67798h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ReduceKt$fold$2$emit$1(FlowKt__ReduceKt$fold$2<? super T> flowKt__ReduceKt$fold$2, Continuation<? super FlowKt__ReduceKt$fold$2$emit$1> continuation) {
        super(continuation);
        this.f67797g = flowKt__ReduceKt$fold$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f67796f = obj;
        this.f67798h |= Integer.MIN_VALUE;
        return this.f67797g.mo4139f(null, this);
    }
}
