package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.ExceptionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Actor.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlinx/coroutines/channels/ActorCoroutine;", "E", "Lkotlinx/coroutines/channels/ChannelCoroutine;", "Lkotlinx/coroutines/channels/ActorScope;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
class ActorCoroutine<E> extends ChannelCoroutine<E> implements ActorScope<E> {
    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: b0 */
    public boolean mo34089b0(@NotNull Throwable th) {
        CoroutineExceptionHandlerKt.m34016a(this.f66928c, th);
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: k0 */
    public void mo34096k0(@Nullable Throwable th) {
        Channel<E> channel = this.f67136d;
        if (th != null) {
            r1 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r1 == null) {
                r1 = ExceptionsKt.m34057a(Intrinsics.m32187p(getClass().getSimpleName(), " was cancelled"), th);
            }
        }
        channel.mo34129b(r1);
    }
}
