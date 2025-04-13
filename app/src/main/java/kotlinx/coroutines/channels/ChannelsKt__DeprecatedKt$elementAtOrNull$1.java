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
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m32126f = "Deprecated.kt", m32127l = {53}, m32128m = "elementAtOrNull")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$elementAtOrNull$1<E> extends ContinuationImpl {

    /* renamed from: e */
    public int f67200e;

    /* renamed from: f */
    public int f67201f;

    /* renamed from: g */
    public Object f67202g;

    /* renamed from: h */
    public Object f67203h;

    /* renamed from: i */
    public /* synthetic */ Object f67204i;

    /* renamed from: j */
    public int f67205j;

    public ChannelsKt__DeprecatedKt$elementAtOrNull$1(Continuation<? super ChannelsKt__DeprecatedKt$elementAtOrNull$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        ChannelsKt__DeprecatedKt$elementAtOrNull$1<E> channelsKt__DeprecatedKt$elementAtOrNull$1;
        ReceiveChannel receiveChannel;
        this.f67204i = obj;
        int i2 = this.f67205j | Integer.MIN_VALUE;
        this.f67205j = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f67205j = i2 - Integer.MIN_VALUE;
            channelsKt__DeprecatedKt$elementAtOrNull$1 = this;
        } else {
            channelsKt__DeprecatedKt$elementAtOrNull$1 = new ChannelsKt__DeprecatedKt$elementAtOrNull$1<>(this);
        }
        Object obj2 = channelsKt__DeprecatedKt$elementAtOrNull$1.f67204i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = channelsKt__DeprecatedKt$elementAtOrNull$1.f67205j;
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
            int i4 = channelsKt__DeprecatedKt$elementAtOrNull$1.f67201f;
            int i5 = channelsKt__DeprecatedKt$elementAtOrNull$1.f67200e;
            ChannelIterator channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$elementAtOrNull$1.f67203h;
            receiveChannel = (ReceiveChannel) channelsKt__DeprecatedKt$elementAtOrNull$1.f67202g;
            try {
                ResultKt.m31892b(obj2);
                while (((Boolean) obj2).booleanValue()) {
                    try {
                        Object next = channelIterator.next();
                        int i6 = i4 + 1;
                        if (i5 == i4) {
                            ChannelsKt.m34179a(receiveChannel, null);
                            return next;
                        }
                        channelsKt__DeprecatedKt$elementAtOrNull$1.f67202g = receiveChannel;
                        channelsKt__DeprecatedKt$elementAtOrNull$1.f67203h = channelIterator;
                        channelsKt__DeprecatedKt$elementAtOrNull$1.f67200e = i5;
                        channelsKt__DeprecatedKt$elementAtOrNull$1.f67201f = i6;
                        channelsKt__DeprecatedKt$elementAtOrNull$1.f67205j = 1;
                        obj2 = channelIterator.mo34140a(channelsKt__DeprecatedKt$elementAtOrNull$1);
                        if (obj2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        i4 = i6;
                    } catch (Throwable th2) {
                        th = th2;
                        receiveChannel2 = receiveChannel;
                    }
                }
                ChannelsKt.m34179a(receiveChannel, null);
                return null;
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
