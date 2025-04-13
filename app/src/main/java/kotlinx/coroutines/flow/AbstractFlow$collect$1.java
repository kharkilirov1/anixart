package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Flow.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.AbstractFlow", m32126f = "Flow.kt", m32127l = {230}, m32128m = "collect")
/* loaded from: classes3.dex */
public final class AbstractFlow$collect$1 extends ContinuationImpl {

    /* renamed from: e */
    public Object f67434e;

    /* renamed from: f */
    public /* synthetic */ Object f67435f;

    /* renamed from: g */
    public final /* synthetic */ AbstractFlow<T> f67436g;

    /* renamed from: h */
    public int f67437h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractFlow$collect$1(AbstractFlow<T> abstractFlow, Continuation<? super AbstractFlow$collect$1> continuation) {
        super(continuation);
        this.f67436g = abstractFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f67435f = obj;
        this.f67437h |= Integer.MIN_VALUE;
        return this.f67436g.mo4140a(null, this);
    }
}
