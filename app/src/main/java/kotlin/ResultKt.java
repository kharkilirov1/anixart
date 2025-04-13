package kotlin;

import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Result.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-stdlib"}, m31885k = 2, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class ResultKt {
    @SinceKotlin
    @PublishedApi
    @NotNull
    /* renamed from: a */
    public static final Object m31891a(@NotNull Throwable exception) {
        Intrinsics.m32179h(exception, "exception");
        return new Result.Failure(exception);
    }

    @SinceKotlin
    @PublishedApi
    /* renamed from: b */
    public static final void m31892b(@NotNull Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).f63061b;
        }
    }
}
