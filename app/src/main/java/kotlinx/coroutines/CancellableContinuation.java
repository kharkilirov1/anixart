package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CancellableContinuation.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/CancellableContinuation;", "T", "Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface CancellableContinuation<T> extends Continuation<T> {

    /* compiled from: CancellableContinuation.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
    public static final class DefaultImpls {
    }

    @InternalCoroutinesApi
    /* renamed from: G */
    void mo33964G(@NotNull Object obj);

    @InternalCoroutinesApi
    @Nullable
    /* renamed from: d */
    Object mo33965d(T t, @Nullable Object obj);

    /* renamed from: r */
    void mo33966r(@NotNull Function1<? super Throwable, Unit> function1);

    @InternalCoroutinesApi
    @Nullable
    /* renamed from: t */
    Object mo33967t(@NotNull Throwable th);

    @InternalCoroutinesApi
    @Nullable
    /* renamed from: w */
    Object mo33968w(T t, @Nullable Object obj, @Nullable Function1<? super Throwable, Unit> function1);

    @ExperimentalCoroutinesApi
    /* renamed from: x */
    void mo33969x(@NotNull CoroutineDispatcher coroutineDispatcher, T t);
}
