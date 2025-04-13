package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Combine.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002*\u001c\b\u0002\u0010\u0002\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000¨\u0006\u0003"}, m31884d2 = {"Lkotlin/collections/IndexedValue;", "", "Update", "kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class CombineKt {
    @PublishedApi
    @Nullable
    /* renamed from: a */
    public static final <R, T> Object m34257a(@NotNull FlowCollector<? super R> flowCollector, @NotNull Flow<? extends T>[] flowArr, @NotNull Function0<T[]> function0, @NotNull Function3<? super FlowCollector<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Continuation<? super Unit> continuation) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(flowArr, function0, function3, flowCollector, null);
        FlowCoroutine flowCoroutine = new FlowCoroutine(continuation.getF66944f(), continuation);
        Object m34354c = UndispatchedKt.m34354c(flowCoroutine, flowCoroutine, combineKt$combineInternal$2);
        return m34354c == CoroutineSingletons.COROUTINE_SUSPENDED ? m34354c : Unit.f63088a;
    }
}
