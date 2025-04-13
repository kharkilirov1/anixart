package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.RestrictsSuspension;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SequenceBuilder.kt */
@SinceKotlin
@RestrictsSuspension
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/sequences/SequenceScope;", "T", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public abstract class SequenceScope<T> {
    @Nullable
    /* renamed from: a */
    public abstract Object mo33827a(T t, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    /* renamed from: b */
    public abstract Object mo33828b(@NotNull Iterator<? extends T> it, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    /* renamed from: c */
    public final Object m33830c(@NotNull Sequence<? extends T> sequence, @NotNull Continuation<? super Unit> continuation) {
        Object mo33828b = mo33828b(sequence.iterator(), continuation);
        return mo33828b == CoroutineSingletons.COROUTINE_SUSPENDED ? mo33828b : Unit.f63088a;
    }
}
