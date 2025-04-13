package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.selects.SelectClause1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Channel.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/channels/ReceiveChannel;", "E", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface ReceiveChannel<E> {

    /* compiled from: Channel.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
    public static final class DefaultImpls {
    }

    /* renamed from: b */
    void mo34129b(@Nullable CancellationException cancellationException);

    @NotNull
    ChannelIterator<E> iterator();

    @NotNull
    /* renamed from: l */
    SelectClause1<E> mo34130l();

    @NotNull
    /* renamed from: m */
    SelectClause1<ChannelResult<E>> mo34131m();

    @NotNull
    /* renamed from: p */
    Object mo34133p();

    @Nullable
    /* renamed from: q */
    Object mo34134q(@NotNull Continuation<? super ChannelResult<? extends E>> continuation);
}
