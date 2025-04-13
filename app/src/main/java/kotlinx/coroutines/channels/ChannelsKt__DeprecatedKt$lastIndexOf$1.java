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
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m32126f = "Deprecated.kt", m32127l = {487}, m32128m = "lastIndexOf")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$lastIndexOf$1<E> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67257e;

    /* renamed from: f */
    public Object f67258f;

    /* renamed from: g */
    public Object f67259g;

    /* renamed from: h */
    public Object f67260h;

    /* renamed from: i */
    public Object f67261i;

    /* renamed from: j */
    public /* synthetic */ Object f67262j;

    /* renamed from: k */
    public int f67263k;

    public ChannelsKt__DeprecatedKt$lastIndexOf$1(Continuation<? super ChannelsKt__DeprecatedKt$lastIndexOf$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        ChannelsKt__DeprecatedKt$lastIndexOf$1<E> channelsKt__DeprecatedKt$lastIndexOf$1;
        ReceiveChannel receiveChannel;
        this.f67262j = obj;
        int i2 = this.f67263k | Integer.MIN_VALUE;
        this.f67263k = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f67263k = i2 - Integer.MIN_VALUE;
            channelsKt__DeprecatedKt$lastIndexOf$1 = this;
        } else {
            channelsKt__DeprecatedKt$lastIndexOf$1 = new ChannelsKt__DeprecatedKt$lastIndexOf$1<>(this);
        }
        Object obj2 = channelsKt__DeprecatedKt$lastIndexOf$1.f67262j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = channelsKt__DeprecatedKt$lastIndexOf$1.f67263k;
        ReceiveChannel receiveChannel2 = null;
        if (i3 == 0) {
            ResultKt.m31892b(obj2);
            new Ref.IntRef().f63349b = -1;
            try {
                throw null;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChannelIterator channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$lastIndexOf$1.f67261i;
            receiveChannel = (ReceiveChannel) channelsKt__DeprecatedKt$lastIndexOf$1.f67260h;
            Ref.IntRef intRef = (Ref.IntRef) channelsKt__DeprecatedKt$lastIndexOf$1.f67259g;
            Ref.IntRef intRef2 = (Ref.IntRef) channelsKt__DeprecatedKt$lastIndexOf$1.f67258f;
            Object obj3 = channelsKt__DeprecatedKt$lastIndexOf$1.f67257e;
            try {
                ResultKt.m31892b(obj2);
                do {
                    try {
                        if (!((Boolean) obj2).booleanValue()) {
                            ChannelsKt.m34179a(receiveChannel, null);
                            return new Integer(intRef2.f63349b);
                        }
                        if (Intrinsics.m32174c(obj3, channelIterator.next())) {
                            intRef2.f63349b = intRef.f63349b;
                        }
                        intRef.f63349b++;
                        channelsKt__DeprecatedKt$lastIndexOf$1.f67257e = obj3;
                        channelsKt__DeprecatedKt$lastIndexOf$1.f67258f = intRef2;
                        channelsKt__DeprecatedKt$lastIndexOf$1.f67259g = intRef;
                        channelsKt__DeprecatedKt$lastIndexOf$1.f67260h = receiveChannel;
                        channelsKt__DeprecatedKt$lastIndexOf$1.f67261i = channelIterator;
                        channelsKt__DeprecatedKt$lastIndexOf$1.f67263k = 1;
                        obj2 = channelIterator.mo34140a(channelsKt__DeprecatedKt$lastIndexOf$1);
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
