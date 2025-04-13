package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Merge.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", m32126f = "Merge.kt", m32127l = {30}, m32128m = "emit")
/* loaded from: classes3.dex */
public final class ChannelFlowTransformLatest$flowCollect$3$1$emit$1 extends ContinuationImpl {

    /* renamed from: e */
    public Object f68135e;

    /* renamed from: f */
    public Object f68136f;

    /* renamed from: g */
    public Object f68137g;

    /* renamed from: h */
    public /* synthetic */ Object f68138h;

    /* renamed from: i */
    public final /* synthetic */ ChannelFlowTransformLatest$flowCollect$3.C68431<T> f68139i;

    /* renamed from: j */
    public int f68140j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest$flowCollect$3$1$emit$1(ChannelFlowTransformLatest$flowCollect$3.C68431<? super T> c68431, Continuation<? super ChannelFlowTransformLatest$flowCollect$3$1$emit$1> continuation) {
        super(continuation);
        this.f68139i = c68431;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f68138h = obj;
        this.f68140j |= Integer.MIN_VALUE;
        return this.f68139i.mo4139f(null, this);
    }
}
