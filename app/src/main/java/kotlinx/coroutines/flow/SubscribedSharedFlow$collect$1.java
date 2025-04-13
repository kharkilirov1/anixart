package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Share.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.SubscribedSharedFlow", m32126f = "Share.kt", m32127l = {409}, m32128m = "collect")
/* loaded from: classes3.dex */
public final class SubscribedSharedFlow$collect$1 extends ContinuationImpl {

    /* renamed from: e */
    public /* synthetic */ Object f68083e;

    /* renamed from: f */
    public final /* synthetic */ SubscribedSharedFlow<T> f68084f;

    /* renamed from: g */
    public int f68085g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribedSharedFlow$collect$1(SubscribedSharedFlow<T> subscribedSharedFlow, Continuation<? super SubscribedSharedFlow$collect$1> continuation) {
        super(continuation);
        this.f68084f = subscribedSharedFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f68083e = obj;
        this.f68085g |= Integer.MIN_VALUE;
        this.f68084f.mo4140a(null, this);
        throw null;
    }
}
