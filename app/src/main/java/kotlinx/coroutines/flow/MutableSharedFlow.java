package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;

/* compiled from: SharedFlow.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlinx/coroutines/flow/MutableSharedFlow;", "T", "Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface MutableSharedFlow<T> extends SharedFlow<T>, FlowCollector<T> {
    @ExperimentalCoroutinesApi
    /* renamed from: b */
    void mo34220b();

    /* renamed from: c */
    boolean mo34221c(T t);

    @NotNull
    /* renamed from: e */
    StateFlow<Integer> m34222e();
}
