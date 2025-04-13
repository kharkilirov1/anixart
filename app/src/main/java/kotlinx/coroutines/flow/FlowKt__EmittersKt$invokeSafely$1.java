package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Emitters.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", m32126f = "Emitters.kt", m32127l = {216}, m32128m = "invokeSafely$FlowKt__EmittersKt")
/* loaded from: classes3.dex */
final class FlowKt__EmittersKt$invokeSafely$1<T> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67612e;

    /* renamed from: f */
    public /* synthetic */ Object f67613f;

    /* renamed from: g */
    public int f67614g;

    public FlowKt__EmittersKt$invokeSafely$1(Continuation<? super FlowKt__EmittersKt$invokeSafely$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f67613f = obj;
        this.f67614g |= Integer.MIN_VALUE;
        return FlowKt__EmittersKt.m34217a(null, null, null, this);
    }
}
