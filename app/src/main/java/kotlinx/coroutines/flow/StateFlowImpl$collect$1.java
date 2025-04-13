package kotlinx.coroutines.flow;

import com.swiftsoft.anixartd.network.Response;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StateFlow.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.StateFlowImpl", m32126f = "StateFlow.kt", m32127l = {386, 398, Response.PERM_BANNED}, m32128m = "collect")
/* loaded from: classes3.dex */
public final class StateFlowImpl$collect$1 extends ContinuationImpl {

    /* renamed from: e */
    public Object f68065e;

    /* renamed from: f */
    public Object f68066f;

    /* renamed from: g */
    public Object f68067g;

    /* renamed from: h */
    public Object f68068h;

    /* renamed from: i */
    public Object f68069i;

    /* renamed from: j */
    public /* synthetic */ Object f68070j;

    /* renamed from: k */
    public final /* synthetic */ StateFlowImpl<T> f68071k;

    /* renamed from: l */
    public int f68072l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateFlowImpl$collect$1(StateFlowImpl<T> stateFlowImpl, Continuation<? super StateFlowImpl$collect$1> continuation) {
        super(continuation);
        this.f68071k = stateFlowImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f68070j = obj;
        this.f68072l |= Integer.MIN_VALUE;
        return this.f68071k.mo4140a(null, this);
    }
}
