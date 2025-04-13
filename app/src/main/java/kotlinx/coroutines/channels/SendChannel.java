package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Channel.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/channels/SendChannel;", "E", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface SendChannel<E> {

    /* compiled from: Channel.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
    public static final class DefaultImpls {
    }

    @NotNull
    /* renamed from: D */
    Object mo34150D(E e2);

    @Nullable
    /* renamed from: E */
    Object mo34151E(E e2, @NotNull Continuation<? super Unit> continuation);

    /* renamed from: F */
    boolean mo34152F();

    /* renamed from: y */
    boolean mo34163y(@Nullable Throwable th);

    @ExperimentalCoroutinesApi
    /* renamed from: z */
    void mo34164z(@NotNull Function1<? super Throwable, Unit> function1);
}
