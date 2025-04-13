package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SharedFlow.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.SharedFlowImpl", m32126f = "SharedFlow.kt", m32127l = {373, 380, 383}, m32128m = "collect$suspendImpl")
/* loaded from: classes3.dex */
public final class SharedFlowImpl$collect$1 extends ContinuationImpl {

    /* renamed from: e */
    public Object f68034e;

    /* renamed from: f */
    public Object f68035f;

    /* renamed from: g */
    public Object f68036g;

    /* renamed from: h */
    public Object f68037h;

    /* renamed from: i */
    public /* synthetic */ Object f68038i;

    /* renamed from: j */
    public final /* synthetic */ SharedFlowImpl<T> f68039j;

    /* renamed from: k */
    public int f68040k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedFlowImpl$collect$1(SharedFlowImpl<T> sharedFlowImpl, Continuation<? super SharedFlowImpl$collect$1> continuation) {
        super(continuation);
        this.f68039j = sharedFlowImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f68038i = obj;
        this.f68040k |= Integer.MIN_VALUE;
        return SharedFlowImpl.m34225n(this.f68039j, null, this);
    }
}
