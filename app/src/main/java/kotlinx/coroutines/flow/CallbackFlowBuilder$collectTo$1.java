package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Builders.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.CallbackFlowBuilder", m32126f = "Builders.kt", m32127l = {336}, m32128m = "collectTo")
/* loaded from: classes3.dex */
public final class CallbackFlowBuilder$collectTo$1 extends ContinuationImpl {

    /* renamed from: e */
    public Object f67439e;

    /* renamed from: f */
    public /* synthetic */ Object f67440f;

    /* renamed from: g */
    public final /* synthetic */ CallbackFlowBuilder<T> f67441g;

    /* renamed from: h */
    public int f67442h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackFlowBuilder$collectTo$1(CallbackFlowBuilder<T> callbackFlowBuilder, Continuation<? super CallbackFlowBuilder$collectTo$1> continuation) {
        super(continuation);
        this.f67441g = callbackFlowBuilder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f67440f = obj;
        this.f67442h |= Integer.MIN_VALUE;
        return this.f67441g.mo34204g(null, this);
    }
}
