package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectInstance;
import org.jetbrains.annotations.NotNull;

/* compiled from: CompletableDeferred.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlinx/coroutines/CompletableDeferredImpl;", "T", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/CompletableDeferred;", "Lkotlinx/coroutines/selects/SelectClause1;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class CompletableDeferredImpl<T> extends JobSupport implements CompletableDeferred<T>, SelectClause1<T> {
    @Override // kotlinx.coroutines.CompletableDeferred
    /* renamed from: C */
    public boolean mo34000C(@NotNull Throwable th) {
        return m34092f0(new CompletedExceptionally(th, false, 2));
    }

    @Override // kotlinx.coroutines.CompletableDeferred
    /* renamed from: N */
    public boolean mo34001N(T t) {
        return m34092f0(t);
    }

    @Override // kotlinx.coroutines.selects.SelectClause1
    /* renamed from: f */
    public <R> void mo34002f(@NotNull SelectInstance<? super R> selectInstance, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        m34099o0(selectInstance, function2);
    }
}
