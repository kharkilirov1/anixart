package kotlinx.coroutines.channels;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Deprecated.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m32126f = "Deprecated.kt", m32127l = {487}, m32128m = "toMap")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$toMap$2<K, V, M extends Map<? super K, ? super V>> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67331e;

    /* renamed from: f */
    public Object f67332f;

    /* renamed from: g */
    public Object f67333g;

    /* renamed from: h */
    public /* synthetic */ Object f67334h;

    /* renamed from: i */
    public int f67335i;

    public ChannelsKt__DeprecatedKt$toMap$2(Continuation<? super ChannelsKt__DeprecatedKt$toMap$2> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        ChannelsKt__DeprecatedKt$toMap$2<K, V, M> channelsKt__DeprecatedKt$toMap$2;
        ReceiveChannel receiveChannel;
        this.f67334h = obj;
        int i2 = this.f67335i | Integer.MIN_VALUE;
        this.f67335i = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f67335i = i2 - Integer.MIN_VALUE;
            channelsKt__DeprecatedKt$toMap$2 = this;
        } else {
            channelsKt__DeprecatedKt$toMap$2 = new ChannelsKt__DeprecatedKt$toMap$2<>(this);
        }
        Object obj2 = channelsKt__DeprecatedKt$toMap$2.f67334h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = channelsKt__DeprecatedKt$toMap$2.f67335i;
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
            ChannelIterator channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$toMap$2.f67333g;
            receiveChannel = (ReceiveChannel) channelsKt__DeprecatedKt$toMap$2.f67332f;
            Map map = (Map) channelsKt__DeprecatedKt$toMap$2.f67331e;
            try {
                ResultKt.m31892b(obj2);
                do {
                    try {
                        if (!((Boolean) obj2).booleanValue()) {
                            ChannelsKt.m34179a(receiveChannel, null);
                            return map;
                        }
                        Pair pair = (Pair) channelIterator.next();
                        map.put(pair.f63055b, pair.f63056c);
                        channelsKt__DeprecatedKt$toMap$2.f67331e = map;
                        channelsKt__DeprecatedKt$toMap$2.f67332f = receiveChannel;
                        channelsKt__DeprecatedKt$toMap$2.f67333g = channelIterator;
                        channelsKt__DeprecatedKt$toMap$2.f67335i = 1;
                        obj2 = channelIterator.mo34140a(channelsKt__DeprecatedKt$toMap$2);
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
