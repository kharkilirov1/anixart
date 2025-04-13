package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Deprecated.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m32126f = "Deprecated.kt", m32127l = {487}, m32128m = "count")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$count$1<E> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67169e;

    /* renamed from: f */
    public Object f67170f;

    /* renamed from: g */
    public Object f67171g;

    /* renamed from: h */
    public /* synthetic */ Object f67172h;

    /* renamed from: i */
    public int f67173i;

    public ChannelsKt__DeprecatedKt$count$1(Continuation<? super ChannelsKt__DeprecatedKt$count$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        ChannelsKt__DeprecatedKt$count$1<E> channelsKt__DeprecatedKt$count$1;
        ReceiveChannel receiveChannel;
        this.f67172h = obj;
        int i2 = this.f67173i | Integer.MIN_VALUE;
        this.f67173i = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f67173i = i2 - Integer.MIN_VALUE;
            channelsKt__DeprecatedKt$count$1 = this;
        } else {
            channelsKt__DeprecatedKt$count$1 = new ChannelsKt__DeprecatedKt$count$1<>(this);
        }
        Object obj2 = channelsKt__DeprecatedKt$count$1.f67172h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = channelsKt__DeprecatedKt$count$1.f67173i;
        ReceiveChannel receiveChannel2 = null;
        if (i3 == 0) {
            ResultKt.m31892b(obj2);
            try {
                throw null;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChannelIterator channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$count$1.f67171g;
            receiveChannel = (ReceiveChannel) channelsKt__DeprecatedKt$count$1.f67170f;
            Ref.IntRef intRef = (Ref.IntRef) channelsKt__DeprecatedKt$count$1.f67169e;
            try {
                ResultKt.m31892b(obj2);
                while (((Boolean) obj2).booleanValue()) {
                    try {
                        channelIterator.next();
                        intRef.f63349b++;
                        channelsKt__DeprecatedKt$count$1.f67169e = intRef;
                        channelsKt__DeprecatedKt$count$1.f67170f = receiveChannel;
                        channelsKt__DeprecatedKt$count$1.f67171g = channelIterator;
                        channelsKt__DeprecatedKt$count$1.f67173i = 1;
                        obj2 = channelIterator.mo34140a(channelsKt__DeprecatedKt$count$1);
                        if (obj2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        receiveChannel2 = receiveChannel;
                    }
                }
                ChannelsKt.m34179a(receiveChannel, null);
                return new Integer(intRef.f63349b);
            } catch (Throwable th3) {
                th = th3;
            }
        }
        receiveChannel = receiveChannel2;
        try {
            throw th;
        } catch (Throwable th4) {
            ChannelsKt.m34179a(receiveChannel, th);
            throw th4;
        }
    }
}
