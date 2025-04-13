package kotlinx.coroutines.channels;

import java.util.Collection;
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
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m32126f = "Deprecated.kt", m32127l = {487}, m32128m = "filterNotNullTo")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$filterNotNullTo$1<E, C extends Collection<? super E>> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67223e;

    /* renamed from: f */
    public Object f67224f;

    /* renamed from: g */
    public Object f67225g;

    /* renamed from: h */
    public /* synthetic */ Object f67226h;

    /* renamed from: i */
    public int f67227i;

    public ChannelsKt__DeprecatedKt$filterNotNullTo$1(Continuation<? super ChannelsKt__DeprecatedKt$filterNotNullTo$1> continuation) {
        super(continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        ChannelsKt__DeprecatedKt$filterNotNullTo$1<E, C> channelsKt__DeprecatedKt$filterNotNullTo$1;
        ReceiveChannel receiveChannel;
        this.f67226h = obj;
        int i2 = this.f67227i | Integer.MIN_VALUE;
        this.f67227i = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f67227i = i2 - Integer.MIN_VALUE;
            channelsKt__DeprecatedKt$filterNotNullTo$1 = this;
        } else {
            channelsKt__DeprecatedKt$filterNotNullTo$1 = new ChannelsKt__DeprecatedKt$filterNotNullTo$1<>(this);
        }
        Object obj2 = channelsKt__DeprecatedKt$filterNotNullTo$1.f67226h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = channelsKt__DeprecatedKt$filterNotNullTo$1.f67227i;
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
            ChannelIterator channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$filterNotNullTo$1.f67225g;
            receiveChannel = (ReceiveChannel) channelsKt__DeprecatedKt$filterNotNullTo$1.f67224f;
            Collection collection = (Collection) channelsKt__DeprecatedKt$filterNotNullTo$1.f67223e;
            try {
                ResultKt.m31892b(obj2);
                while (((Boolean) obj2).booleanValue()) {
                    try {
                        Object next = channelIterator.next();
                        if (next != null) {
                            collection.add(next);
                        }
                        channelsKt__DeprecatedKt$filterNotNullTo$1.f67223e = collection;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.f67224f = receiveChannel;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.f67225g = channelIterator;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.f67227i = 1;
                        obj2 = channelIterator.mo34140a(channelsKt__DeprecatedKt$filterNotNullTo$1);
                        if (obj2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        receiveChannel2 = receiveChannel;
                    }
                }
                ChannelsKt.m34179a(receiveChannel, null);
                return collection;
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
