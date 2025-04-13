package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Context.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", m32126f = "Context.kt", m32127l = {275}, m32128m = "emit")
/* loaded from: classes3.dex */
public final class CancellableFlowImpl$collect$2$emit$1 extends ContinuationImpl {

    /* renamed from: e */
    public /* synthetic */ Object f67444e;

    /* renamed from: f */
    public final /* synthetic */ CancellableFlowImpl$collect$2<T> f67445f;

    /* renamed from: g */
    public int f67446g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CancellableFlowImpl$collect$2$emit$1(CancellableFlowImpl$collect$2<? super T> cancellableFlowImpl$collect$2, Continuation<? super CancellableFlowImpl$collect$2$emit$1> continuation) {
        super(continuation);
        this.f67445f = cancellableFlowImpl$collect$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f67444e = obj;
        this.f67446g |= Integer.MIN_VALUE;
        return this.f67445f.mo4139f(null, this);
    }
}
