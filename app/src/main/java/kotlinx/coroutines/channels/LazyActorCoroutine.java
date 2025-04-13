package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.selects.SelectClause2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Actor.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¨\u0006\u0005"}, m31884d2 = {"Lkotlinx/coroutines/channels/LazyActorCoroutine;", "E", "Lkotlinx/coroutines/channels/ActorCoroutine;", "Lkotlinx/coroutines/selects/SelectClause2;", "Lkotlinx/coroutines/channels/SendChannel;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class LazyActorCoroutine<E> extends ActorCoroutine<E> implements SelectClause2<E, SendChannel<? super E>> {
    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    @NotNull
    /* renamed from: D */
    public Object mo34150D(E e2) {
        start();
        return super.mo34150D(e2);
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    @Nullable
    /* renamed from: E */
    public Object mo34151E(E e2, @NotNull Continuation<? super Unit> continuation) {
        start();
        Object mo34151E = super.mo34151E(e2, continuation);
        return mo34151E == CoroutineSingletons.COROUTINE_SUSPENDED ? mo34151E : Unit.f63088a;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: m0 */
    public void mo34097m0() {
        CancellableKt.m34348b(null, this);
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    /* renamed from: y */
    public boolean mo34163y(@Nullable Throwable th) {
        boolean mo34163y = super.mo34163y(th);
        start();
        return mo34163y;
    }
}
