package moxy;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: PresenterScope.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0019\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"presenterScope", "Lkotlinx/coroutines/CoroutineScope;", "Lmoxy/MvpPresenter;", "getPresenterScope", "(Lmoxy/MvpPresenter;)Lkotlinx/coroutines/CoroutineScope;", "moxy-ktx"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class PresenterScopeKt {
    @NotNull
    public static final CoroutineScope getPresenterScope(@NotNull MvpPresenter<?> presenterScope) {
        Intrinsics.m32179h(presenterScope, "$this$presenterScope");
        OnDestroyListener onDestroyListener = presenterScope.coroutineScope;
        CoroutineScope coroutineScope = (CoroutineScope) (!(onDestroyListener instanceof CoroutineScope) ? null : onDestroyListener);
        if (coroutineScope != null) {
            return coroutineScope;
        }
        if (Intrinsics.m32174c(onDestroyListener, OnDestroyListener.EMPTY)) {
            CompletableJob m34069a = JobKt.m34069a(null, 1, null);
            m34069a.mo34061b(null);
            return CoroutineScopeKt.m34019a(m34069a);
        }
        PresenterCoroutineScope presenterCoroutineScope = new PresenterCoroutineScope();
        presenterScope.coroutineScope = presenterCoroutineScope;
        return presenterCoroutineScope;
    }
}
