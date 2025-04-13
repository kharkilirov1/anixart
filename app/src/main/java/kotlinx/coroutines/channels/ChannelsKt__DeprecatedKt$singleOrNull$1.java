package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Deprecated.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m32126f = "Deprecated.kt", m32127l = {149, 152}, m32128m = "singleOrNull")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$singleOrNull$1<E> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67305e;

    /* renamed from: f */
    public Object f67306f;

    /* renamed from: g */
    public /* synthetic */ Object f67307g;

    /* renamed from: h */
    public int f67308h;

    public ChannelsKt__DeprecatedKt$singleOrNull$1(Continuation<? super ChannelsKt__DeprecatedKt$singleOrNull$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        ChannelsKt__DeprecatedKt$singleOrNull$1<E> channelsKt__DeprecatedKt$singleOrNull$1;
        Object obj2;
        ReceiveChannel receiveChannel;
        this.f67307g = obj;
        int i2 = this.f67308h | Integer.MIN_VALUE;
        this.f67308h = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f67308h = i2 - Integer.MIN_VALUE;
            channelsKt__DeprecatedKt$singleOrNull$1 = this;
        } else {
            channelsKt__DeprecatedKt$singleOrNull$1 = new ChannelsKt__DeprecatedKt$singleOrNull$1<>(this);
        }
        Object obj3 = channelsKt__DeprecatedKt$singleOrNull$1.f67307g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = channelsKt__DeprecatedKt$singleOrNull$1.f67308h;
        ReceiveChannel receiveChannel2 = null;
        if (i3 != 0) {
            if (i3 == 1) {
                ChannelIterator channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$singleOrNull$1.f67306f;
                ReceiveChannel receiveChannel3 = (ReceiveChannel) channelsKt__DeprecatedKt$singleOrNull$1.f67305e;
                try {
                    ResultKt.m31892b(obj3);
                    if (!((Boolean) obj3).booleanValue()) {
                        ChannelsKt.m34179a(receiveChannel3, null);
                        return null;
                    }
                    Object next = channelIterator.next();
                    channelsKt__DeprecatedKt$singleOrNull$1.f67305e = receiveChannel3;
                    channelsKt__DeprecatedKt$singleOrNull$1.f67306f = next;
                    channelsKt__DeprecatedKt$singleOrNull$1.f67308h = 2;
                    Object mo34140a = channelIterator.mo34140a(channelsKt__DeprecatedKt$singleOrNull$1);
                    if (mo34140a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj2 = next;
                    obj3 = mo34140a;
                    receiveChannel = receiveChannel3;
                } catch (Throwable th) {
                    th = th;
                    receiveChannel2 = receiveChannel3;
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = channelsKt__DeprecatedKt$singleOrNull$1.f67306f;
                receiveChannel = (ReceiveChannel) channelsKt__DeprecatedKt$singleOrNull$1.f67305e;
                try {
                    ResultKt.m31892b(obj3);
                } catch (Throwable th2) {
                    th = th2;
                    receiveChannel2 = receiveChannel;
                }
            }
            if (((Boolean) obj3).booleanValue()) {
                ChannelsKt.m34179a(receiveChannel, null);
                return null;
            }
            ChannelsKt.m34179a(receiveChannel, null);
            return obj2;
        }
        ResultKt.m31892b(obj3);
        try {
            throw null;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            throw th;
        } catch (Throwable th4) {
            ChannelsKt.m34179a(receiveChannel2, th);
            throw th4;
        }
    }
}
