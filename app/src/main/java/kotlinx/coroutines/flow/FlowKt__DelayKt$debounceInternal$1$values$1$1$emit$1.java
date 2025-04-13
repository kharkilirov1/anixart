package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Delay.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", m32126f = "Delay.kt", m32127l = {211}, m32128m = "emit")
/* loaded from: classes3.dex */
public final class FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 extends ContinuationImpl {

    /* renamed from: e */
    public /* synthetic */ Object f67562e;

    /* renamed from: f */
    public final /* synthetic */ FlowKt__DelayKt$debounceInternal$1$values$1.C67921<T> f67563f;

    /* renamed from: g */
    public int f67564g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1(FlowKt__DelayKt$debounceInternal$1$values$1.C67921<? super T> c67921, Continuation<? super FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1> continuation) {
        super(continuation);
        this.f67563f = c67921;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f67562e = obj;
        this.f67564g |= Integer.MIN_VALUE;
        return this.f67563f.mo4139f(null, this);
    }
}
