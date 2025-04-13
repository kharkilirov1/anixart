package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Deprecated.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m32126f = "Deprecated.kt", m32127l = {487}, m32128m = "indexOf")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$indexOf$1<E> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67246e;

    /* renamed from: f */
    public Object f67247f;

    /* renamed from: g */
    public Object f67248g;

    /* renamed from: h */
    public Object f67249h;

    /* renamed from: i */
    public /* synthetic */ Object f67250i;

    /* renamed from: j */
    public int f67251j;

    public ChannelsKt__DeprecatedKt$indexOf$1(Continuation<? super ChannelsKt__DeprecatedKt$indexOf$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        ChannelsKt__DeprecatedKt$indexOf$1<E> channelsKt__DeprecatedKt$indexOf$1;
        ReceiveChannel receiveChannel;
        this.f67250i = obj;
        int i2 = this.f67251j | Integer.MIN_VALUE;
        this.f67251j = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f67251j = i2 - Integer.MIN_VALUE;
            channelsKt__DeprecatedKt$indexOf$1 = this;
        } else {
            channelsKt__DeprecatedKt$indexOf$1 = new ChannelsKt__DeprecatedKt$indexOf$1<>(this);
        }
        Object obj2 = channelsKt__DeprecatedKt$indexOf$1.f67250i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = channelsKt__DeprecatedKt$indexOf$1.f67251j;
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
            ChannelIterator channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$indexOf$1.f67249h;
            receiveChannel = (ReceiveChannel) channelsKt__DeprecatedKt$indexOf$1.f67248g;
            Ref.IntRef intRef = (Ref.IntRef) channelsKt__DeprecatedKt$indexOf$1.f67247f;
            Object obj3 = channelsKt__DeprecatedKt$indexOf$1.f67246e;
            try {
                ResultKt.m31892b(obj2);
                do {
                    try {
                        if (!((Boolean) obj2).booleanValue()) {
                            ChannelsKt.m34179a(receiveChannel, null);
                            return new Integer(-1);
                        }
                        if (Intrinsics.m32174c(obj3, channelIterator.next())) {
                            Integer num = new Integer(intRef.f63349b);
                            ChannelsKt.m34179a(receiveChannel, null);
                            return num;
                        }
                        intRef.f63349b++;
                        channelsKt__DeprecatedKt$indexOf$1.f67246e = obj3;
                        channelsKt__DeprecatedKt$indexOf$1.f67247f = intRef;
                        channelsKt__DeprecatedKt$indexOf$1.f67248g = receiveChannel;
                        channelsKt__DeprecatedKt$indexOf$1.f67249h = channelIterator;
                        channelsKt__DeprecatedKt$indexOf$1.f67251j = 1;
                        obj2 = channelIterator.mo34140a(channelsKt__DeprecatedKt$indexOf$1);
                    } catch (Throwable th2) {
                        th = th2;
                        receiveChannel2 = receiveChannel;
                    }
                } while (obj2 != coroutineSingletons);
                return coroutineSingletons;
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
