package kotlinx.coroutines.android;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* compiled from: HandlerDispatcher.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "Lkotlinx/coroutines/android/HandlerContext;", "kotlinx-coroutines-android"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class HandlerDispatcher extends MainCoroutineDispatcher implements Delay {
    public HandlerDispatcher() {
    }

    @NotNull
    /* renamed from: l */
    public DisposableHandle mo34028l(long j2, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return Delay.DefaultImpls.m34031a(j2, runnable, coroutineContext);
    }

    public HandlerDispatcher(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
