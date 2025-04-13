package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.selects.SelectClause1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChannelCoroutine.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlinx/coroutines/channels/ChannelCoroutine;", "E", "Lkotlinx/coroutines/AbstractCoroutine;", "", "Lkotlinx/coroutines/channels/Channel;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class ChannelCoroutine<E> extends AbstractCoroutine<Unit> implements Channel<E> {

    /* renamed from: d */
    @NotNull
    public final Channel<E> f67136d;

    public ChannelCoroutine(@NotNull CoroutineContext coroutineContext, @NotNull Channel<E> channel, boolean z, boolean z2) {
        super(coroutineContext, z, z2);
        this.f67136d = channel;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @NotNull
    /* renamed from: D */
    public Object mo34150D(E e2) {
        return this.f67136d.mo34150D(e2);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @Nullable
    /* renamed from: E */
    public Object mo34151E(E e2, @NotNull Continuation<? super Unit> continuation) {
        return this.f67136d.mo34151E(e2, continuation);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: F */
    public boolean mo34152F() {
        return this.f67136d.mo34152F();
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: K */
    public void mo34078K(@NotNull Throwable th) {
        CancellationException m34075s0 = JobSupport.m34075s0(this, th, null, 1, null);
        this.f67136d.mo34129b(m34075s0);
        m34077J(m34075s0);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    /* renamed from: b */
    public final void mo34061b(@Nullable CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo33949M(), null, this);
        }
        CancellationException m34075s0 = JobSupport.m34075s0(this, cancellationException, null, 1, null);
        this.f67136d.mo34129b(m34075s0);
        m34077J(m34075s0);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public ChannelIterator<E> iterator() {
        return this.f67136d.iterator();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    /* renamed from: l */
    public SelectClause1<E> mo34130l() {
        return this.f67136d.mo34130l();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    /* renamed from: m */
    public SelectClause1<ChannelResult<E>> mo34131m() {
        return this.f67136d.mo34131m();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    /* renamed from: p */
    public Object mo34133p() {
        return this.f67136d.mo34133p();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Nullable
    /* renamed from: q */
    public Object mo34134q(@NotNull Continuation<? super ChannelResult<? extends E>> continuation) {
        return this.f67136d.mo34134q(continuation);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: y */
    public boolean mo34163y(@Nullable Throwable th) {
        return this.f67136d.mo34163y(th);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @ExperimentalCoroutinesApi
    /* renamed from: z */
    public void mo34164z(@NotNull Function1<? super Throwable, Unit> function1) {
        this.f67136d.mo34164z(function1);
    }
}
