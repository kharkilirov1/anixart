package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Emitters.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 176)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1", m32126f = "Emitters.kt", m32127l = {53}, m32128m = "emit")
/* loaded from: classes3.dex */
public final class FlowKt__EmittersKt$unsafeTransform$1$1$emit$1 extends ContinuationImpl {

    /* renamed from: e */
    public /* synthetic */ Object f67631e;

    /* renamed from: f */
    public final /* synthetic */ FlowKt__EmittersKt$unsafeTransform$1$1<T> f67632f;

    /* renamed from: g */
    public int f67633g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__EmittersKt$unsafeTransform$1$1$emit$1(FlowKt__EmittersKt$unsafeTransform$1$1<? super T> flowKt__EmittersKt$unsafeTransform$1$1, Continuation<? super FlowKt__EmittersKt$unsafeTransform$1$1$emit$1> continuation) {
        super(continuation);
        this.f67632f = flowKt__EmittersKt$unsafeTransform$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f67631e = obj;
        this.f67633g |= Integer.MIN_VALUE;
        return this.f67632f.mo4139f(null, this);
    }
}
