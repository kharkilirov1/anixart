package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Errors.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", m32126f = "Errors.kt", m32127l = {156}, m32128m = "catchImpl")
/* loaded from: classes3.dex */
final class FlowKt__ErrorsKt$catchImpl$1<T> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67646e;

    /* renamed from: f */
    public /* synthetic */ Object f67647f;

    /* renamed from: g */
    public int f67648g;

    public FlowKt__ErrorsKt$catchImpl$1(Continuation<? super FlowKt__ErrorsKt$catchImpl$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f67647f = obj;
        this.f67648g |= Integer.MIN_VALUE;
        return FlowKt.m34209a(null, null, this);
    }
}
