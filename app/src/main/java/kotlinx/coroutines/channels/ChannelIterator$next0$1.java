package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Channel.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", m32126f = "Channel.kt", m32127l = {584}, m32128m = "next")
/* loaded from: classes3.dex */
final class ChannelIterator$next0$1<E> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67137e;

    /* renamed from: f */
    public /* synthetic */ Object f67138f;

    /* renamed from: g */
    public int f67139g;

    public ChannelIterator$next0$1(Continuation<? super ChannelIterator$next0$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        ChannelIterator$next0$1<E> channelIterator$next0$1;
        this.f67138f = obj;
        int i2 = this.f67139g | Integer.MIN_VALUE;
        this.f67139g = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f67139g = i2 - Integer.MIN_VALUE;
            channelIterator$next0$1 = this;
        } else {
            channelIterator$next0$1 = new ChannelIterator$next0$1<>(this);
        }
        Object obj2 = channelIterator$next0$1.f67138f;
        int i3 = channelIterator$next0$1.f67139g;
        if (i3 == 0) {
            ResultKt.m31892b(obj2);
            channelIterator$next0$1.f67137e = null;
            channelIterator$next0$1.f67139g = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ChannelIterator channelIterator = (ChannelIterator) channelIterator$next0$1.f67137e;
        ResultKt.m31892b(obj2);
        if (((Boolean) obj2).booleanValue()) {
            return channelIterator.next();
        }
        throw new ClosedReceiveChannelException("Channel was closed");
    }
}
