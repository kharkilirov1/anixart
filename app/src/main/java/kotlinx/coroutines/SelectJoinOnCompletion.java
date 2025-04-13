package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.selects.SelectInstance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JobSupport.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/SelectJoinOnCompletion;", "R", "Lkotlinx/coroutines/JobNode;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class SelectJoinOnCompletion<R> extends JobNode {

    /* renamed from: f */
    @NotNull
    public final SelectInstance<R> f67051f;

    /* renamed from: g */
    @NotNull
    public final Function1<Continuation<? super R>, Object> f67052g;

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* renamed from: R */
    public void mo33958R(@Nullable Throwable th) {
        if (this.f67051f.mo34393e()) {
            CancellableKt.m34349c(this.f67052g, this.f67051f.mo34395p());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        mo33958R(th);
        return Unit.f63088a;
    }
}
