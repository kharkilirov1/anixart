package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Emitters.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 176)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1", m32126f = "Emitters.kt", m32127l = {42}, m32128m = "emit")
/* loaded from: classes3.dex */
public final class FlowKt__EmittersKt$transform$1$1$emit$1 extends ContinuationImpl {

    /* renamed from: e */
    public /* synthetic */ Object f67626e;

    /* renamed from: f */
    public final /* synthetic */ FlowKt__EmittersKt$transform$1.C67981<T> f67627f;

    /* renamed from: g */
    public int f67628g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__EmittersKt$transform$1$1$emit$1(FlowKt__EmittersKt$transform$1.C67981<? super T> c67981, Continuation<? super FlowKt__EmittersKt$transform$1$1$emit$1> continuation) {
        super(continuation);
        this.f67627f = c67981;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f67626e = obj;
        this.f67628g |= Integer.MIN_VALUE;
        return this.f67627f.mo4139f(null, this);
    }
}
