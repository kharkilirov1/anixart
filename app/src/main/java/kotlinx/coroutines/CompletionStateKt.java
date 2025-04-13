package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CompletionState.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class CompletionStateKt {
    @NotNull
    /* renamed from: a */
    public static final <T> Object m34005a(@Nullable Object obj, @NotNull Continuation<? super T> continuation) {
        return obj instanceof CompletedExceptionally ? ResultKt.m31891a(((CompletedExceptionally) obj).f66956a) : obj;
    }

    @Nullable
    /* renamed from: b */
    public static final <T> Object m34006b(@NotNull Object obj, @Nullable Function1<? super Throwable, Unit> function1) {
        Throwable m31890a = Result.m31890a(obj);
        return m31890a == null ? function1 != null ? new CompletedWithCancellation(obj, function1) : obj : new CompletedExceptionally(m31890a, false, 2);
    }
}
