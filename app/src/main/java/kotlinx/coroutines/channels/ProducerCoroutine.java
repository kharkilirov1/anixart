package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Produce.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlinx/coroutines/channels/ProducerCoroutine;", "E", "Lkotlinx/coroutines/channels/ChannelCoroutine;", "Lkotlinx/coroutines/channels/ProducerScope;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class ProducerCoroutine<E> extends ChannelCoroutine<E> implements ProducerScope<E> {
    public ProducerCoroutine(@NotNull CoroutineContext coroutineContext, @NotNull Channel<E> channel) {
        super(coroutineContext, channel, true, true);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    /* renamed from: a */
    public boolean mo33950a() {
        return super.mo33950a();
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    /* renamed from: v */
    public SendChannel mo34175v() {
        return this;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    /* renamed from: w0 */
    public void mo33955w0(@NotNull Throwable th, boolean z) {
        if (this.f67136d.mo34163y(th) || z) {
            return;
        }
        CoroutineExceptionHandlerKt.m34016a(this.f66928c, th);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    /* renamed from: x0 */
    public void mo33956x0(Unit unit) {
        this.f67136d.mo34163y(null);
    }
}
