package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Count.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__CountKt$count$4", m32126f = "Count.kt", m32127l = {31}, m32128m = "emit")
/* loaded from: classes3.dex */
public final class FlowKt__CountKt$count$4$emit$1 extends ContinuationImpl {

    /* renamed from: e */
    public Object f67539e;

    /* renamed from: f */
    public /* synthetic */ Object f67540f;

    /* renamed from: g */
    public final /* synthetic */ FlowKt__CountKt$count$4<T> f67541g;

    /* renamed from: h */
    public int f67542h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__CountKt$count$4$emit$1(FlowKt__CountKt$count$4<? super T> flowKt__CountKt$count$4, Continuation<? super FlowKt__CountKt$count$4$emit$1> continuation) {
        super(continuation);
        this.f67541g = flowKt__CountKt$count$4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f67540f = obj;
        this.f67542h |= Integer.MIN_VALUE;
        return this.f67541g.mo4139f(null, this);
    }
}
