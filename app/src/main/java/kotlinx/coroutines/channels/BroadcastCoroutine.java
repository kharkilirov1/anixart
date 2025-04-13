package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Broadcast.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005¨\u0006\u0006"}, m31884d2 = {"Lkotlinx/coroutines/channels/BroadcastCoroutine;", "E", "Lkotlinx/coroutines/AbstractCoroutine;", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlinx/coroutines/channels/BroadcastChannel;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
class BroadcastCoroutine<E> extends AbstractCoroutine<Unit> implements ProducerScope<E>, BroadcastChannel<E> {
    @Override // kotlinx.coroutines.channels.SendChannel
    @Nullable
    /* renamed from: E */
    public Object mo34151E(E e2, @NotNull Continuation<? super Unit> continuation) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: F */
    public boolean mo34152F() {
        throw null;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: K */
    public void mo34078K(@NotNull Throwable th) {
        JobSupport.m34075s0(this, th, null, 1, null);
        throw null;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    /* renamed from: a */
    public boolean mo33950a() {
        return super.mo33950a();
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    /* renamed from: b */
    public final void mo34061b(@Nullable CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo33949M(), null, this);
        }
        mo34078K(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    @NotNull
    /* renamed from: v */
    public SendChannel<E> mo34175v() {
        return this;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    /* renamed from: w0 */
    public void mo33955w0(@NotNull Throwable th, boolean z) {
        throw null;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    /* renamed from: x0 */
    public void mo33956x0(Unit unit) {
        ((SendChannel) null).mo34163y(null);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: y */
    public boolean mo34163y(@Nullable Throwable th) {
        throw null;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @ExperimentalCoroutinesApi
    /* renamed from: z */
    public void mo34164z(@NotNull Function1<? super Throwable, Unit> function1) {
        throw null;
    }
}
