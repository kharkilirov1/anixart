package kotlinx.coroutines.channels;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Channels.common.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", m32126f = "Channels.common.kt", m32127l = {148}, m32128m = "toList")
/* loaded from: classes3.dex */
final class ChannelsKt__Channels_commonKt$toList$1<E> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67160e;

    /* renamed from: f */
    public Object f67161f;

    /* renamed from: g */
    public Object f67162g;

    /* renamed from: h */
    public Object f67163h;

    /* renamed from: i */
    public /* synthetic */ Object f67164i;

    /* renamed from: j */
    public int f67165j;

    public ChannelsKt__Channels_commonKt$toList$1(Continuation<? super ChannelsKt__Channels_commonKt$toList$1> continuation) {
        super(continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        ChannelsKt__Channels_commonKt$toList$1<E> channelsKt__Channels_commonKt$toList$1;
        ReceiveChannel receiveChannel;
        this.f67164i = obj;
        int i2 = this.f67165j | Integer.MIN_VALUE;
        this.f67165j = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f67165j = i2 - Integer.MIN_VALUE;
            channelsKt__Channels_commonKt$toList$1 = this;
        } else {
            channelsKt__Channels_commonKt$toList$1 = new ChannelsKt__Channels_commonKt$toList$1<>(this);
        }
        Object obj2 = channelsKt__Channels_commonKt$toList$1.f67164i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = channelsKt__Channels_commonKt$toList$1.f67165j;
        ReceiveChannel receiveChannel2 = null;
        if (i3 == 0) {
            ResultKt.m31892b(obj2);
            new ListBuilder(10);
            try {
                throw null;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChannelIterator channelIterator = (ChannelIterator) channelsKt__Channels_commonKt$toList$1.f67163h;
            receiveChannel = (ReceiveChannel) channelsKt__Channels_commonKt$toList$1.f67162g;
            List list = (List) channelsKt__Channels_commonKt$toList$1.f67161f;
            List list2 = (List) channelsKt__Channels_commonKt$toList$1.f67160e;
            try {
                ResultKt.m31892b(obj2);
                do {
                    try {
                        if (!((Boolean) obj2).booleanValue()) {
                            ChannelsKt.m34179a(receiveChannel, null);
                            return CollectionsKt.m32030l(list2);
                        }
                        list.add(channelIterator.next());
                        channelsKt__Channels_commonKt$toList$1.f67160e = list2;
                        channelsKt__Channels_commonKt$toList$1.f67161f = list;
                        channelsKt__Channels_commonKt$toList$1.f67162g = receiveChannel;
                        channelsKt__Channels_commonKt$toList$1.f67163h = channelIterator;
                        channelsKt__Channels_commonKt$toList$1.f67165j = 1;
                        obj2 = channelIterator.mo34140a(channelsKt__Channels_commonKt$toList$1);
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
