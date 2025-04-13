package kotlinx.coroutines.channels;

import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Produce.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class ProduceKt {
    @ExperimentalCoroutinesApi
    @NotNull
    /* renamed from: a */
    public static final <E> ReceiveChannel<E> m34187a(@NotNull CoroutineScope coroutineScope, @NotNull CoroutineContext coroutineContext, int i2, @BuilderInference @NotNull Function2<? super ProducerScope<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return m34188b(coroutineScope, coroutineContext, i2, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, null, function2);
    }

    @NotNull
    /* renamed from: b */
    public static final <E> ReceiveChannel<E> m34188b(@NotNull CoroutineScope coroutineScope, @NotNull CoroutineContext coroutineContext, int i2, @NotNull BufferOverflow bufferOverflow, @NotNull CoroutineStart coroutineStart, @Nullable Function1<? super Throwable, Unit> function1, @BuilderInference @NotNull Function2<? super ProducerScope<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        ProducerCoroutine producerCoroutine = new ProducerCoroutine(CoroutineContextKt.m34012c(coroutineScope, coroutineContext), ChannelKt.m34176a(i2, bufferOverflow, null, 4));
        if (function1 != null) {
            producerCoroutine.mo34063n(false, true, function1);
        }
        producerCoroutine.m33957y0(coroutineStart, producerCoroutine, function2);
        return producerCoroutine;
    }

    /* renamed from: c */
    public static /* synthetic */ ReceiveChannel m34189c(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i2, Function2 function2, int i3) {
        EmptyCoroutineContext emptyCoroutineContext = (i3 & 1) != 0 ? EmptyCoroutineContext.f63224b : null;
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m34187a(coroutineScope, emptyCoroutineContext, i2, function2);
    }
}
