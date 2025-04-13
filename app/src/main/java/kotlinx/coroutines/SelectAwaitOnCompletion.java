package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.selects.SelectInstance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JobSupport.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlinx/coroutines/SelectAwaitOnCompletion;", "T", "R", "Lkotlinx/coroutines/JobNode;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class SelectAwaitOnCompletion<T, R> extends JobNode {

    /* renamed from: f */
    @NotNull
    public final SelectInstance<R> f67049f;

    /* renamed from: g */
    @NotNull
    public final Function2<T, Continuation<? super R>, Object> f67050g;

    /* JADX WARN: Multi-variable type inference failed */
    public SelectAwaitOnCompletion(@NotNull SelectInstance<? super R> selectInstance, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        this.f67049f = selectInstance;
        this.f67050g = function2;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* renamed from: R */
    public void mo33958R(@Nullable Throwable th) {
        if (this.f67049f.mo34393e()) {
            JobSupport m34074S = m34074S();
            SelectInstance<R> selectInstance = this.f67049f;
            Function2<T, Continuation<? super R>, Object> function2 = this.f67050g;
            Object m34088a0 = m34074S.m34088a0();
            if (m34088a0 instanceof CompletedExceptionally) {
                selectInstance.mo34396y(((CompletedExceptionally) m34088a0).f66956a);
            } else {
                CancellableKt.m34350d(function2, JobSupportKt.m34114a(m34088a0), selectInstance.mo34395p(), null);
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        mo33958R(th);
        return Unit.f63088a;
    }
}
