package kotlinx.coroutines.channels;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.Channel;

/* compiled from: Channel.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class ChannelKt {
    /* renamed from: a */
    public static Channel m34176a(int i2, BufferOverflow bufferOverflow, Function1 function1, int i3) {
        BufferOverflow bufferOverflow2 = BufferOverflow.SUSPEND;
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        if ((i3 & 2) != 0) {
            bufferOverflow = bufferOverflow2;
        }
        int i4 = 1;
        if (i2 == -2) {
            if (bufferOverflow == bufferOverflow2) {
                Objects.requireNonNull(Channel.f67133K1);
                i4 = Channel.Factory.f67135b;
            }
            return new ArrayChannel(i4, bufferOverflow, null);
        }
        if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? (i2 == 1 && bufferOverflow == BufferOverflow.DROP_OLDEST) ? new ConflatedChannel(null) : new ArrayChannel(i2, bufferOverflow, null) : new LinkedListChannel(null) : bufferOverflow == bufferOverflow2 ? new RendezvousChannel(null) : new ArrayChannel(1, bufferOverflow, null);
        }
        if (bufferOverflow == bufferOverflow2) {
            return new ConflatedChannel(null);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
    }
}
