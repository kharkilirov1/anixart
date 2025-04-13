package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

/* compiled from: RendezvousChannel.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/channels/RendezvousChannel;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class RendezvousChannel<E> extends AbstractChannel<E> {
    public RendezvousChannel(@Nullable Function1<? super E, Unit> function1) {
        super(function1);
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: h */
    public final boolean mo34158h() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: i */
    public final boolean mo34159i() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: t */
    public final boolean mo34136t() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: u */
    public final boolean mo34137u() {
        return true;
    }
}
