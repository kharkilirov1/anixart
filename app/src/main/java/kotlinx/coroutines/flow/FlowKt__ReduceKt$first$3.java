package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Reduce.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m32126f = "Reduce.kt", m32127l = {183}, m32128m = "first")
/* loaded from: classes3.dex */
final class FlowKt__ReduceKt$first$3<T> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67777e;

    /* renamed from: f */
    public Object f67778f;

    /* renamed from: g */
    public Object f67779g;

    /* renamed from: h */
    public /* synthetic */ Object f67780h;

    /* renamed from: i */
    public int f67781i;

    public FlowKt__ReduceKt$first$3(Continuation<? super FlowKt__ReduceKt$first$3> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f67780h = obj;
        this.f67781i |= Integer.MIN_VALUE;
        return FlowKt.m34213e(null, null, this);
    }
}
