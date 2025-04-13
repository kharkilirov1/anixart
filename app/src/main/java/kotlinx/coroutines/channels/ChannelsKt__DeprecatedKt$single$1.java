package kotlinx.coroutines.channels;

import java.util.NoSuchElementException;
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
@DebugMetadata(m32125c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m32126f = "Deprecated.kt", m32127l = {136, 139}, m32128m = "single")
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$single$1<E> extends ContinuationImpl {

    /* renamed from: e */
    public Object f67301e;

    /* renamed from: f */
    public Object f67302f;

    /* renamed from: g */
    public /* synthetic */ Object f67303g;

    /* renamed from: h */
    public int f67304h;

    public ChannelsKt__DeprecatedKt$single$1(Continuation<? super ChannelsKt__DeprecatedKt$single$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        ChannelsKt__DeprecatedKt$single$1<E> channelsKt__DeprecatedKt$single$1;
        ReceiveChannel receiveChannel;
        this.f67303g = obj;
        int i2 = this.f67304h | Integer.MIN_VALUE;
        this.f67304h = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f67304h = i2 - Integer.MIN_VALUE;
            channelsKt__DeprecatedKt$single$1 = this;
        } else {
            channelsKt__DeprecatedKt$single$1 = new ChannelsKt__DeprecatedKt$single$1<>(this);
        }
        Object obj2 = channelsKt__DeprecatedKt$single$1.f67303g;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = channelsKt__DeprecatedKt$single$1.f67304h;
        ReceiveChannel receiveChannel2 = null;
        if (i3 != 0) {
            if (i3 == 1) {
                ChannelIterator channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$single$1.f67302f;
                ReceiveChannel receiveChannel3 = (ReceiveChannel) channelsKt__DeprecatedKt$single$1.f67301e;
                try {
                    ResultKt.m31892b(obj2);
                    if (!((Boolean) obj2).booleanValue()) {
                        throw new NoSuchElementException("ReceiveChannel is empty.");
                    }
                    Object next = channelIterator.next();
                    channelsKt__DeprecatedKt$single$1.f67301e = receiveChannel3;
                    channelsKt__DeprecatedKt$single$1.f67302f = next;
                    channelsKt__DeprecatedKt$single$1.f67304h = 2;
                    Object mo34140a = channelIterator.mo34140a(channelsKt__DeprecatedKt$single$1);
                    if (mo34140a != obj3) {
                        obj3 = next;
                        obj2 = mo34140a;
                        receiveChannel = receiveChannel3;
                    }
                    return obj3;
                } catch (Throwable th) {
                    th = th;
                    receiveChannel2 = receiveChannel3;
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj3 = channelsKt__DeprecatedKt$single$1.f67302f;
                receiveChannel = (ReceiveChannel) channelsKt__DeprecatedKt$single$1.f67301e;
                try {
                    ResultKt.m31892b(obj2);
                } catch (Throwable th2) {
                    th = th2;
                    receiveChannel2 = receiveChannel;
                }
            }
            if (((Boolean) obj2).booleanValue()) {
                throw new IllegalArgumentException("ReceiveChannel has more than one element.");
            }
            ChannelsKt.m34179a(receiveChannel, null);
            return obj3;
        }
        ResultKt.m31892b(obj2);
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
