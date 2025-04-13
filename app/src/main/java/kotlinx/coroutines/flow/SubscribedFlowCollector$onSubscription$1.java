package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Share.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.SubscribedFlowCollector", m32126f = "Share.kt", m32127l = {419, 423}, m32128m = "onSubscription")
/* loaded from: classes3.dex */
public final class SubscribedFlowCollector$onSubscription$1 extends ContinuationImpl {

    /* renamed from: e */
    public Object f68078e;

    /* renamed from: f */
    public Object f68079f;

    /* renamed from: g */
    public /* synthetic */ Object f68080g;

    /* renamed from: h */
    public final /* synthetic */ SubscribedFlowCollector<T> f68081h;

    /* renamed from: i */
    public int f68082i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribedFlowCollector$onSubscription$1(SubscribedFlowCollector<T> subscribedFlowCollector, Continuation<? super SubscribedFlowCollector$onSubscription$1> continuation) {
        super(continuation);
        this.f68081h = subscribedFlowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f68080g = obj;
        this.f68082i |= Integer.MIN_VALUE;
        return this.f68081h.m34249a(this);
    }
}
